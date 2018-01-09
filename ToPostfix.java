import java.util.Scanner;
public class ToPostfix {
	String Input,Output;
	void convert() {
		Output="";
		stack A = new stack(Input.length());
		for(int i=0;i<Input.length();i++) {
			if(Character.isWhitespace(Input.charAt(i))) {
				continue ;
			}
			else if(Character.isUpperCase(Input.charAt(i))) {
				Output+=Input.charAt(i);
			}
			else if(Input.charAt(i)=='(') {
				A.push('(');
			}
			else if(Input.charAt(i)==')') {
				while(A.Top()!='(') {
					Output+=A.Top();
					A.pop();
				}
				A.pop();
			}
			else {
				while(!A.isEmpty()) {
					if(A.precedence(A.Top())>=A.precedence(Input.charAt(i))) {
					Output+=A.Top();
					A.pop();
					}
					else
						break;
				}
				A.push(Input.charAt(i));
			}
		}
		while(!A.isEmpty()) {
			Output+=A.Top();
			A.pop();
		}
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		Input=sc.nextLine();
		sc.close();
	}
	void output() {
		System.out.println(Output);
	}
}
