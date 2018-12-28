package com.example.msingh189.newsroom;

public class Club {
    private int clubLogo;
    private String clubName, clubDesc;

    public Club(int clubLogo,String clubName, String clubDesc)
    {
        this.clubLogo = clubLogo;
        this.clubName = clubName;
        this.clubDesc = clubDesc;
    }

    public int getClubLogo() {
        return clubLogo;
    }

    public String getClubName() {
        return clubName;
    }

    public String getClubDesc(){
        return clubDesc;
    }
}
