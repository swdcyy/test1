package com.kwai.video.krtc.KaraokeScore;
import java.lang.String;
import java.lang.Object;

public class KaraokeScore	// class@000766
{
    public String liveID;
    public String scores;
    public String songID;
    public String songType;
    public long startTs;
    public long stopTs;

    public void KaraokeScore(String p0,String p1,String p2,long p3,long p4,String p5){
       super();
       this.liveID = p0;
       this.songID = p1;
       this.songType = p2;
       this.startTs = p3;
       this.stopTs = p4;
       this.scores = p5;
    }
}
