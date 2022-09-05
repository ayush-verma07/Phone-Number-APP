//Name: A.Verma
//Period: 4B
import java.util.*;

public class PhoneNumberAPP
{
    public static void main(String[] args)
    {
        System.out.println(phoneNumber("1-800-LAWYERS"));
    }
    
    public static String phoneNumber(String phone)
    {
        String result = "";
        char[] letters = phone.toCharArray(); //{number}
        for (int i = 0; i < letters.length; i++)
        {
            switch(letters[i])
            {
                case 'A':
                case 'B':
                case 'C':
                    result+="2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    result+="3";
                    break;
                    
                case 'G':
                case 'H':
                case 'I':
                    result+="4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    result+="5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    result+="6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    result+="7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    result+="8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    result+="9";
                    break;
                default:
                    result+= letters[i];
                    
                
            }
            
        }
        result = result.substring(0, 9) + "-" + result.substring(9);
            return result;
        
    }
}