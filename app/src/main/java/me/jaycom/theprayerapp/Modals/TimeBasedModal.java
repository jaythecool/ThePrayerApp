package me.jaycom.theprayerapp.Modals;

public class TimeBasedModal {

    private String session,timezone;
    private int bg;

    public TimeBasedModal(String session, String timezone, int bg) {
        this.session = session;
        this.timezone = timezone;
        this.bg = bg;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }
}
