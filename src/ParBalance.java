import java.util.Scanner;
import java.util.Stack;
public class ParBalance {
        public static boolean checkBalance(String in) {

            Stack<Character>  ab = new Stack<Character>();
            for(char chr : in.toCharArray())
            {
                switch(chr) {

                    case '{':
                    case '(':
                    case '[':
                        ab.push(chr);
                        break;

                    case '}':
                        if(ab.isEmpty() || ab.pop() != '{')
                            return false;
                        break;
                    case ')':
                        if(ab.isEmpty() || ab.pop() != '(')
                            return false;
                        break;
                    case ']':
                        if(ab.isEmpty() || ab.pop() != '[')
                            return false;
                        break;
                }
            }
            return ab.isEmpty();
        }
        public static void main(String[] args) {
            if(args.length !=0) {
                if(checkBalance(args[0]))
                    System.out.println("true");
                else
                    System.out.println("false");
            }

        }
}