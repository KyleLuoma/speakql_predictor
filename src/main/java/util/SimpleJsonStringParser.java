package util;

public class SimpleJsonStringParser {
    public static String getValueFromJsonString(String key, String jsonString) throws NoSuchFieldException {
        if(! jsonString.contains(key)) {
            throw new NoSuchFieldException("Key " + key + " not found in request");
        }
        int startIx = jsonString.indexOf(key);
        String value = jsonString.substring(startIx + key.length() + 2).trim();
        System.out.println(value);
        value = value.substring(value.indexOf("\"") + 1);
        value = value.substring(0, value.indexOf("\""));
        return value;
    }
}
