package JavaClasses;

import java.util.Date;

/**
 *
 * @author Jahadul Rakib
 */
public class FundPojo {
  public static int id;
  public static String country,fundName,category,telent,projectStatus;
  public static Date applyDate,endDate;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        FundPojo.id = id;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        FundPojo.country = country;
    }

    public static String getFundName() {
        return fundName;
    }

    public static void setFundName(String fundName) {
        FundPojo.fundName = fundName;
    }

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String category) {
        FundPojo.category = category;
    }

    public static String getTelent() {
        return telent;
    }

    public static void setTelent(String telent) {
        FundPojo.telent = telent;
    }

    public static String getProjectStatus() {
        return projectStatus;
    }

    public static void setProjectStatus(String projectStatus) {
        FundPojo.projectStatus = projectStatus;
    }

    public static Date getApplyDate() {
        return applyDate;
    }

    public static void setApplyDate(Date applyDate) {
        FundPojo.applyDate = applyDate;
    }

    public static Date getEndDate() {
        return endDate;
    }

    public static void setEndDate(Date endDate) {
        FundPojo.endDate = endDate;
    }
}
