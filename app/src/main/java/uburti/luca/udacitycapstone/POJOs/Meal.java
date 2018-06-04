package uburti.luca.udacitycapstone.POJOs;

class Meal {
    private int timeOfDay;
    private int rapidInjection;
    private int longInjection;
    private int extraRapidInjection;
    private int glycemiaBefore;
    private int glycemiaAfter;


    public Meal(int timeOfDay, int rapidInjection, int longInjection, int extraRapidInjection, int glycemiaBefore, int glycemiaAfter) {
        this.timeOfDay = timeOfDay;
        this.rapidInjection = rapidInjection;
        this.longInjection = longInjection;
        this.extraRapidInjection = extraRapidInjection;
        this.glycemiaBefore = glycemiaBefore;
        this.glycemiaAfter = glycemiaAfter;
    }

    public int getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(int timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public int getRapidInjection() {
        return rapidInjection;
    }

    public void setRapidInjection(int rapidInjection) {
        this.rapidInjection = rapidInjection;
    }

    public int getLongInjection() {
        return longInjection;
    }

    public void setLongInjection(int longInjection) {
        this.longInjection = longInjection;
    }

    public int getExtraRapidInjection() {
        return extraRapidInjection;
    }

    public void setExtraRapidInjection(int extraRapidInjection) {
        this.extraRapidInjection = extraRapidInjection;
    }

    public int getGlycemiaBefore() {
        return glycemiaBefore;
    }

    public void setGlycemiaBefore(int glycemiaBefore) {
        this.glycemiaBefore = glycemiaBefore;
    }

    public int getGlycemiaAfter() {
        return glycemiaAfter;
    }

    public void setGlycemiaAfter(int glycemiaAfter) {
        this.glycemiaAfter = glycemiaAfter;
    }

}