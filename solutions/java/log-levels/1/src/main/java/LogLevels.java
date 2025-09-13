public class LogLevels {
    
    public static String message(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        // int idx = logLine.indexOf(":");
        String regex = "[:]";
        String[] arr = logLine.split(regex);
        return arr[1].trim();
        
    }

    public static String logLevel(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        String regex = "[:]";
        String[] arr = logLine.split(regex);
        return arr[0].substring(1, arr[0].length() - 1).trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        String info = LogLevels.message(logLine);
        String level = LogLevels.logLevel(logLine);
        return String.format("%s (%s)", info, level);
    }
}
