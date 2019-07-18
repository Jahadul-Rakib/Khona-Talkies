package JavaClasses;

/**
 *
 * @author Jahadul Rakib
 */
public class IdStore {

    private static int id;
    private static String premireStatus;
    private static String category;
    private static double textM;
    private static String lessOrGreater;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        IdStore.id = id;
    }

    public static String getPremireStatus() {
        return premireStatus;
    }

    public static void setPremireStatus(String premireStatus) {
        IdStore.premireStatus = premireStatus;
    }

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String category) {
        IdStore.category = category;
    }

    public static double getTextM() {
        return textM;
    }

    public static void setTextM(double textM) {
        IdStore.textM = textM;
    }

    public static String getLessOrGreater() {
        return lessOrGreater;
    }

    public static void setLessOrGreater(String lessOrGreater) {
        IdStore.lessOrGreater = lessOrGreater;
    }

}
