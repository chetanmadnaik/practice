package interviewCodingProblem;

public class JsonParser {

  private static String json = "{\n" +
        "    \"firstName\": \"John\",\n" +
        "    \"lastName\": \"Smith\",\n" +
        "    \"age\": 25,\n" +
        "    \"address\": {\n" +
        "        \"streetAddress\": \"21 2nd Street\",\n" +
        "        \"city\": \"New York\",\n" +
        "        \"state\": \"NY\",\n" +
        "        \"postalCode\": 10021\n" +
        "    },\n" +
        "    \"phoneNumbers\": [\n" +
        "        {\n" +
        "            \"type\": \"home\",\n" +
        "            \"number\": \"212 555-1234\"\n" +
        "        },\n" +
        "        {\n" +
        "            \"type\": \"fax\",\n" +
        "            \"number\": \"646 555-4567\" \n" +
        "        }\n" +
        "    ] \n" +
        "}";
    public static void main(String[] args) {
        boolean s = validateJson("}");
        System.out.print(s);
    }

    private static boolean validateJson(String json) {
        String trimmedJson = json.trim();
        if (!(trimmedJson.startsWith("{") || trimmedJson.startsWith("["))) {
            return false;
        }

        if (getCount(trimmedJson, "{") != getCount(trimmedJson, "}")) {
            return false;
        }
        if (getCount(trimmedJson, "[") != getCount(trimmedJson, "]")) {
            return false;
        }

        //validateRecursive(trimmedJson.sub);

        return false;
    }

    private static int getCount(String trimmedJson, String stringToFind) {
        char[] charArray = trimmedJson.toCharArray();
        int count = 0 ;
        int index = 0;
        while(index<charArray.length){
            if(charArray[index]==stringToFind.toCharArray()[0]) {
                count++;
            }
            index++;
        }
        return count;
    }
}
