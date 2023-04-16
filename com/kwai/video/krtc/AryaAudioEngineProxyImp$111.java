package com.kwai.video.krtc.AryaAudioEngineProxyImp$111;
import com.kwai.video.stannis.observers.KaraokeScoreObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.a$c;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.stannis.KaraokeScore;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.KaraokeScore;
import java.lang.Integer;
import cw7.b;

public class AryaAudioEngineProxyImp$111 implements KaraokeScoreObserver	// class@0006a5
{
    public final a$c a;
    public final String b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$111(AryaAudioEngineProxyImp p0,a$c p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onScore(KaraokeScore p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp$111.class, "1")) {
          return;
       }
       KaraokeScore karaokeScore = new KaraokeScore(p0.liveID, p0.songID, p0.songType, p0.startTs, p0.stopTs, p0.scores);
       this.a.onScore(v10);
       return;
    }
    public void onScore(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp$111.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AryaAudioEngineProxyImp$111.class, "2")) {
          return;
       }
       this.a.onScore(this.b, p1, p2, p3);
       return;
    }
    public void onScore(String p0,int p1,int p2,int p3,int p4,int p5){
       b.a(this, p0, p1, p2, p3, p4, p5);
    }
}
