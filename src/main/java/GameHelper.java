import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jiangnan on 16/6/6.
 */
public class GameHelper {
    public String getUserInput(String s) {

        String inputLine=null;
        System.out.print(s+" ");
        try {
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
            if (inputLine.length()==0){
                return null;
            }
        }catch (IOException e){
            System.out.println("IOException: "+e);
        }
        return inputLine;
    }
}
