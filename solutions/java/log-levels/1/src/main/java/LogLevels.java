public class LogLevels {
    
    public static String message(String logLine) {
        String[] text = logLine.split(":");
        return text[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] text = logLine.split(":");
        String txt = text[0].replace("[", "").replace("]","").toLowerCase();
        return txt;
    }

    public static String reformat(String logLine) {
        String text = message(logLine);
        String log = logLevel(logLine);
        return text + " ("+ log +")";
    }
}
