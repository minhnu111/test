import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        boolean isCorrect = false;
        do{
            System.out.println("Please enter the string:");
            String _input = scanner.nextLine();

            char _firstLetter = _input.charAt(0);
            if(_firstLetter>='A' &&_firstLetter<='Z')
            {
                int i;
                for(i=0;i<_input.length();i++)
                {
                    char _charTemp = _input.charAt(i);
                    if((_charTemp>='a' &&_charTemp<='z')||(_charTemp>='A' &&_charTemp<='Z'))
                    {
                        // true
                    }else{
                        System.out.println("Wrong format, please type again!");
                        break;
                    }
                }
                if(i == _input.length()) {
                    isCorrect = true;
                    System.out.println("Correct format, job done!");
                }
            }else{
                System.out.println("Wrong format, please type again!");
            }
        }
        while (isCorrect==false);
    }
}
