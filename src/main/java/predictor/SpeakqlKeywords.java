package predictor;

import java.util.ArrayList;

public class SpeakqlKeywords {

    public static ArrayList<String> getStartingTokens() {
        ArrayList<String> startingTokens = new ArrayList<>();
        startingTokens.add("SELECT");
        startingTokens.add("FROM");
        startingTokens.add("WHERE");
        startingTokens.add("JOIN");
        return startingTokens;
    }

    public static ArrayList<String> getDummyColumnNames() {
        ArrayList<String> columnNames = new ArrayList<>();
        columnNames.add("BUILDINGNAME");
        columnNames.add("ROOMNUMBER");
        columnNames.add("ID");
        return columnNames;
    }

    public SpeakqlKeywords() {

    }

}
