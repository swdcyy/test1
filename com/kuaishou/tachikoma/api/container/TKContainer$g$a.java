package com.kuaishou.tachikoma.api.container.TKContainer$g$a;
import android.view.Choreographer$FrameCallback;
import com.kuaishou.tachikoma.api.container.TKContainer$g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import tx4.r;
import com.kuaishou.tachikoma.api.container.TKContainer;

public class TKContainer$g$a implements Choreographer$FrameCallback	// class@000f69
{
    public final TKContainer$g b;

    public void TKContainer$g$a(TKContainer$g p0){
       this.b = p0;
       super();
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(TKContainer$g$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, TKContainer$g$a.class, "1")) {
          return;
       }
       TKContainer$g$a tb = this.b;
       TKContainer$g a = tb.a;
       int i = 0;
       if (!a[i]) {
          a[i] = true;
          tb.e.N(tb.b, tb.c, tb.d);
       }
       return;
    }
}
