package com.kwai.video.stannis.KaraokeScore;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KaraokeScore	// class@000bc1
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
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KaraokeScore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KaraokeScore{liveID=\'"+this.liveID+'''+", songID=\'"+this.songID+'''+", songType=\'"+this.songType+'''+", startTs="+this.startTs+", stopTs="+this.stopTs+", scores=\'"+this.scores+'''+'}';
    }
}
