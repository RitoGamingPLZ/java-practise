import java.util.HashMap;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        int ptr = 0;

        Map<Character, Character> leetspeak = new HashMap<>();
        leetspeak.put('4', 'a');
        leetspeak.put('3', 'e');
        leetspeak.put('0', 'o');
        leetspeak.put('1', 'l');
        leetspeak.put('7', 't');
        leetspeak.put(' ', '_');

        while (ptr < identifier.length()) {
            boolean upperCase = false;

            if (identifier.charAt(ptr) == '-') {
                upperCase = true;
                ptr++;
                if (ptr >= identifier.length()) break;
            }

            char c = identifier.charAt(ptr);
            Character mapped = leetspeak.get(c);
            char desiredChar = (mapped != null) ? mapped : c;

            if (Character.isAlphabetic(desiredChar) || desiredChar == '_') {
                builder.append(upperCase ? Character.toUpperCase(desiredChar) : desiredChar);
            }

            ptr++;
        }

        return builder.toString();
    }
}
