public class LogLevels {
    
    public static String message(String logLine) {

        String a = logLine.substring(logLine.lastIndexOf(":") +1, logLine.length());
        return a.strip();

//        throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
    }

    public static String logLevel(String logLine) {

        String a = logLine.substring(logLine.lastIndexOf("[") +1, logLine.lastIndexOf("]"));
        return a.toLowerCase();

//        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {

        String a = logLine.substring(logLine.lastIndexOf(":") +1, logLine.length());
        String b = a.strip();
        String c = logLine.substring(logLine.lastIndexOf("[") +1, logLine.lastIndexOf("]"));
        return b + " (" + c.toLowerCase() + ")";

//        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
