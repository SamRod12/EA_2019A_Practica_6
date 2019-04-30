package practica_6;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Practica_6
{
    public static void main (String ...argd) throws FileNotFoundException
    {
        Scanner entrada = new Scanner(new FileReader("entradaEcuacion.txt"));
        StringBuilder sb = new StringBuilder();
        Boolean x;
        
        while(entrada.hasNext()) {
            sb.append(entrada.next());
        }
        entrada.close();
        String cadena = sb.toString();
        
        Stack<Character> stack = new Stack<Character>();  
        for (int i=0;i<cadena.length();++i)
        {
            if((cadena.charAt(i)=='(')||(cadena.charAt(i)=='{')||(cadena.charAt(i)=='['))
            {
                stack.push(cadena.charAt(i));
            }
            else if(stack.isEmpty()==false)
            {   
            switch(cadena.charAt(i))
            {
            case']':
                if(stack.pop()!='[')
                {
                    x = false;
                    System.exit(0);
                }
                break;
            case'}':
                if(stack.pop()!='{')
                {
                    x = false;
                    System.exit(0);
                }
                break;
            case')':
                if(stack.pop()!='(')
                {
                    x = false;
                    System.exit(0);
                }
                break;
            }
            }
        }           
        if(stack.isEmpty())
        {
            x = true;
        }
        else 
            x = false;
        
        System.out.println(cadena + " => " + x);
        }   
    
}