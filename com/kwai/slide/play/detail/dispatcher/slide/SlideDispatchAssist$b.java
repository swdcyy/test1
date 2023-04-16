package com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist$b;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseLongArray;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;

public final class SlideDispatchAssist$b implements Runnable	// class@0017b9
{
    public final v b;
    public final SparseLongArray c;
    public final String d;
    public final Runnable e;

    public void SlideDispatchAssist$b(v p0,SparseLongArray p1,String p2,Runnable p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist$b.class, "1")) {
          return;
       }
       this.c.delete(this.b.getStage());
       this.e.run();
       return;
    }
}
