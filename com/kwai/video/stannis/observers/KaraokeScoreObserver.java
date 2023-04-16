package com.kwai.video.stannis.observers.KaraokeScoreObserver;
import com.kwai.video.stannis.KaraokeScore;
import java.lang.String;

public interface abstract KaraokeScoreObserver	// class@000c5b
{

    void onScore(KaraokeScore p0);
    void onScore(String p0,int p1,int p2,int p3);
    void onScore(String p0,int p1,int p2,int p3,int p4,int p5);
}
