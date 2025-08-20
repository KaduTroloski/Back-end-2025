/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
    Random rd = new Random();
    String[] listChar = {"0", "2", "3", "7", "A", "a", "E", "L", "b", "t", "p"};
    for(int i = 0; i <= 8; i++){
    String password = ""; 
    int randomIndex = rd.nextInt(listChar.length);
    password += listChar[randomIndex];
    System.out.printf(password);
    }
	}
}