package com.kuaishou.tachikoma.api.container.TKContainer$h;
import tx4.r;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import android.util.Log;
import zp8.a;
import android.view.ViewGroup;
import tx4.w;

public class TKContainer$h implements r	// class@000f6b
{
    public final r a;
    public final boolean b;
    public final TKContainer c;

    public void TKContainer$h(TKContainer p0,r p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$h oh = TKContainer$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "2")) {
          return;
       }
       a.i("TKContainer", "continueRender failed: "+this.c.h+", error: "+Log.getStackTraceString(p1));
       oh = this.a;
       if (oh != null) {
          oh.a(p0, p1);
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TKContainer$h.class, "1")) {
          return;
       }
       a.i("TKContainer", "continueRender success, bundleId: "+this.c.h);
       TKContainer$h ta = this.a;
       if (ta != null) {
          ta.onSuccess();
       }
       ta = this.c;
       TKContainer g = ta.g;
       if (g != null && this.b == null) {
          ta.E(g, ta.b, null);
       }
       return;
    }
}
