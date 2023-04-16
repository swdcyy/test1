package com.kwai.video.krtc.observers.KaraokeScoreObserver;
import com.kwai.video.krtc.KaraokeScore;
import java.lang.String;

public interface abstract KaraokeScoreObserver	// class@0007cf
{

    void onScore(KaraokeScore p0);
    void onScore(String p0,int p1,int p2,int p3);
}
