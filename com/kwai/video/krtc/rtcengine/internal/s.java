package com.kwai.video.krtc.rtcengine.internal.s;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import com.kwai.video.krtc.Arya;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;

public class s	// class@000897
{
    public z a;
    public Arya b;

    public void s(z p0){
       super();
       this.a = p0;
       this.b = p0.a();
    }
    public void a(int p0,int p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, os, "4")) {
          return;
       }
       Log.i("RtcEngineRawAudio", "setMixedAudioFrameParameters sr "+p0+" samplesPerCall "+p1);
       this.b.setMixedAudioFrameParameters(p0, p1);
       return;
    }
    public void a(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, s.class, "2")) {
          return;
       }
       Log.i("RtcEngineRawAudio", "setRecordingAudioFrameParameters sr "+p0+" ch "+p1+" mode "+p2+" samplesPerCall "+p3);
       this.b.setRecordingAudioFrameParameters(p0, p1, p2, p3);
       return;
    }
    public void a(AryaRawAudioFrameObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       Log.i("RtcEngineRawAudio", "registerAudioFrameObserver");
       this.b.registerAudioFrameObserver(p0);
       return;
    }
    public void b(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, s.class, "3")) {
          return;
       }
       Log.i("RtcEngineRawAudio", "setPlaybackAudioFrameParameters sr "+p0+" ch "+p1+" mode "+p2+" samplesPerCall "+p3);
       this.b.setPlaybackAudioFrameParameters(p0, p1, p2, p3);
       return;
    }
    public void c(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, s.class, "5")) {
          return;
       }
       Log.i("RtcEngineRawAudio", "setRecordingRawAudioFrameParameters sr "+p0+" ch "+p1+" mode "+p2+" samplesPerCall "+p3);
       this.b.setRecordingRawAudioFrameParameters(p0, p1, p2, p3);
       return;
    }
}
