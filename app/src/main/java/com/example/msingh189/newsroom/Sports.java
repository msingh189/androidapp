package com.example.msingh189.newsroom;

public class Sports {
    private int sportsLogo;
    private String sportsName, sportsDesc;

    public Sports(int sportsLogo,String sportsName, String sportsDesc)
    {
        this.sportsLogo = sportsLogo;
        this.sportsName = sportsName;
        this.sportsDesc = sportsDesc;
    }

    public int getSportsLogo() {
        return sportsLogo;
    }

    public String getSportsName() {
        return sportsName;
    }

    public String getSportsDesc(){
        return sportsDesc;
    }
}
