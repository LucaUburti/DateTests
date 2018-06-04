package uburti.luca.udacitycapstone.POJOs;

import java.util.Date;

public class GlycemicDay {
    private Date date;
    private boolean hyperglycemia;
    private boolean hypoglycemia;
    public static final int BREAKFAST = 0;
    public static final int LUNCH = 1;
    public static final int DINNER = 2;
    private Meal meal;
    private int extraRapidInjectionBedtime;	//bedtime handled separately
    private int glycemiaBedtime;

    public GlycemicDay(Date date, boolean hyperglycemia, boolean hypoglycemia, Meal meal, int extraRapidInjectionBedtime, int glycemiaBedtime) {
        this.date = date;
        this.hyperglycemia = hyperglycemia;
        this.hypoglycemia = hypoglycemia;
        this.meal = meal;
        this.extraRapidInjectionBedtime = extraRapidInjectionBedtime;
        this.glycemiaBedtime = glycemiaBedtime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isHyperglycemia() {
        return hyperglycemia;
    }

    public void setHyperglycemia(boolean hyperglycemia) {
        this.hyperglycemia = hyperglycemia;
    }

    public boolean isHypoglycemia() {
        return hypoglycemia;
    }

    public void setHypoglycemia(boolean hypoglycemia) {
        this.hypoglycemia = hypoglycemia;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getExtraRapidInjectionBedtime() {
        return extraRapidInjectionBedtime;
    }

    public void setExtraRapidInjectionBedtime(int extraRapidInjectionBedtime) {
        this.extraRapidInjectionBedtime = extraRapidInjectionBedtime;
    }

    public int getGlycemiaBedtime() {
        return glycemiaBedtime;
    }

    public void setGlycemiaBedtime(int glycemiaBedtime) {
        this.glycemiaBedtime = glycemiaBedtime;
    }
}
