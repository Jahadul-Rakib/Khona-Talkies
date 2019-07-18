package JavaClasses;

import java.util.Date;

/**
 *
 * @author Jahadul Rakib
 */
public class ProjectPojo {

    public static int id;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        ProjectPojo.id = id;
    }
    private static String title, director, category, premeireStatus, projectlink, synopsis, about, project_status,lessor;

    public static String getLessor() {
        return lessor;
    }

    public static void setLessor(String lessor) {
        ProjectPojo.lessor = lessor;
    }
    private static Date date;
    private static double duration;

    public static String getPremeireStatus() {
        return premeireStatus;
    }

    public static void setPremeireStatus(String premeireStatus) {
        ProjectPojo.premeireStatus = premeireStatus;
    }

    public static String getProjectlink() {
        return projectlink;
    }

    public static void setProjectlink(String projectlink) {
        ProjectPojo.projectlink = projectlink;
    }

    public static String getSynopsis() {
        return synopsis;
    }

    public static void setSynopsis(String synopsis) {
        ProjectPojo.synopsis = synopsis;
    }

    public static String getAbout() {
        return about;
    }

    public static void setAbout(String about) {
        ProjectPojo.about = about;
    }

    public static String getProject_status() {
        return project_status;
    }

    public static void setProject_status(String project_status) {
        ProjectPojo.project_status = project_status;
    }

    public static double getDuration() {
        return duration;
    }

    public static void setDuration(double duration) {
        ProjectPojo.duration = duration;
    }

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        ProjectPojo.date = date;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        ProjectPojo.title = title;
    }

    public static String getDirector() {
        return director;
    }

    public static void setDirector(String director) {
        ProjectPojo.director = director;
    }

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String category) {
        ProjectPojo.category = category;
    }
}
