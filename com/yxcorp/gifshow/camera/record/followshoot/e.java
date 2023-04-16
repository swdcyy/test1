package com.yxcorp.gifshow.camera.record.followshoot.e;
import com.yxcorp.gifshow.camera.record.followshoot.f$f;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import j8c.a;
import q87.c;
import hd9.h0;
import java.lang.Runnable;
import ekd.k1;
import hd9.i0;
import t45.c;

public class e implements f$f	// class@000dcb
{
    public final d a;

    public void e(d p0){
       this.a = p0;
       super();
    }
    public void a(ByteBuffer p0,long p1,int p2,int p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, e.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().A("UseSampleController", "OnAudioProcessPCMAvailableListener", objArray);
       e ta = this.a;
       if (ta.B != null) {
          ta.B = i;
          Object[] objArray1 = new Object[i];
          a.D().A("UseSampleController", "startCapture", objArray1);
          k1.o(new h0(this));
          c.a(new i0(this));
       }
       return;
    }
}
