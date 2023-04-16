package com.yxcorp.gifshow.camerasdk.j$e;
import aj9.f;
import com.yxcorp.gifshow.camerasdk.j;
import com.kwai.camerasdk.models.MediaRecorderCallbackFrameType;
import com.yxcorp.gifshow.camerasdk.recorder.b;
import java.lang.Object;
import com.kwai.camerasdk.video.VideoFrame;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi9.q1;
import java.lang.StringBuilder;
import q87.c;
import qi9.v0;
import java.lang.Runnable;
import ekd.k1;

public class j$e implements f	// class@00101e
{
    public final MediaRecorderCallbackFrameType a;
    public final f b;
    public final b c;
    public final j d;

    public void j$e(j p0,MediaRecorderCallbackFrameType p1,f p2,b p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(MediaRecorderCallbackFrameType p0,VideoFrame p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "onSpecialFrame: "+p0+"--"+this.a, objArray);
       if (this.a == p0) {
          this.b.a(p0, p1);
          k1.r(new v0(this, this.c), 0);
       }
       return;
    }
}
