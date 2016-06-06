import java.util.ArrayList;

/**
 * Created by jiangnan on 16/6/6.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses=0;
        GameHelper helper=new GameHelper();
        SimpleDotCom theDotCom=new SimpleDotCom();

        int randomNum= (int) (Math.random()*5);

        int[] loca={randomNum,randomNum+1,randomNum+2};
        ArrayList<String> locations = new ArrayList<String>();
        for (int i:loca){
            String j=i+"";
            locations.add(j);
        }

        theDotCom.setLocationCells(locations);

        boolean isAlive=true;

        while (isAlive==true){
            String guess=helper.getUserInput("enter a number");
            String result=theDotCom.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")){
                isAlive=false;
                System.out.println("You took " +numOfGuesses+" guesses");
            }
        }

    }
}
