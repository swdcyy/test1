package com.kwai.video.krtc.rtcengine.internal.o$b;
import com.kwai.video.krtc.observers.AryaQosObserver;
import com.kwai.video.krtc.rtcengine.internal.o;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.internal.o$1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class o$b implements AryaQosObserver	// class@00088c
{
    public final o a;

    public void o$b(o p0){
       this.a = p0;
       super();
    }
    public void o$b(o p0,o$1 p1){
       super(p0);
    }
    public void onQosEventUpdated(int p0,String p1){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       if (o.f(this.a) != null) {
          o.f(this.a).onQosEventUpdated(p0, p1);
       }
       return;
    }
}
