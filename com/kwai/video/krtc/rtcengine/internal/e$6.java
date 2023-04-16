package com.kwai.video.krtc.rtcengine.internal.e$6;
import com.kwai.video.krtc.observers.AudioRecordingObserver;
import com.kwai.video.krtc.rtcengine.internal.e;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class e$6 implements AudioRecordingObserver	// class@000872
{
    public final int a;
    public final e b;

    public void e$6(e p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAudioEncoded(ByteBuffer p0,int p1){
    }
    public void onAudioRecordFinished(int p0,int p1){
       e$6 u6 = e$6.class;
       if (PatchProxy.isSupport(u6) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, u6, "1")) {
          return;
       }
       e.c(this.b, this.a, p0, p1);
       return;
    }
    public void onAudioRecordStart(int p0){
    }
}
