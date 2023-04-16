package com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist$c;
import java.lang.Runnable;
import android.util.SparseArray;
import java.lang.String;
import eh5.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class SlideDispatchAssist$c implements Runnable	// class@0017ba
{
    public final SparseArray b;
    public final int c;
    public final String d;
    public final v e;
    public final String f;
    public final Runnable g;

    public void SlideDispatchAssist$c(SparseArray p0,int p1,String p2,v p3,String p4,Runnable p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist$c.class, "1")) {
          return;
       }
       this.g.run();
       return;
    }
}
