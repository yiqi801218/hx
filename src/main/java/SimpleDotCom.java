import java.util.ArrayList;

/**
 * Created by jiangnan on 16/6/6.
 */
public class SimpleDotCom {
//    int[] locationCells;
//    int numOfHits;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells=loc;
    }


    public String checkYourself(String userinput) {
//        int guess=Integer.parseInt(userGuess);
        String result="miss";
//        for (int cell:locationCells){
//            if (guess==cell){
//                result="hit";
//                numOfHits++;
//                break;
//            }
//        }
//
//        if (numOfHits==locationCells.length){
//            result="kill";
//        }

        int index=locationCells.indexOf(userinput);
        if (index>=0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                return "kill";
            }else {
                return "hit";
            }
        }

        System.out.println(result);
        return result;
    }
}
