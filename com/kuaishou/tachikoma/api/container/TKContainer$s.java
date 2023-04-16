package com.kuaishou.tachikoma.api.container.TKContainer$s;
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

public class TKContainer$s implements r	// class@000f76
{
    public final r a;
    public final boolean b;
    public final TKContainer c;

    public void TKContainer$s(TKContainer p0,r p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$s os = TKContainer$s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, os, "2")) {
          return;
       }
       os = this.a;
       if (os != null) {
          os.a(p0, p1);
       }
       a.i("TKContainer", "syncRenderInner failed: "+this.c.h+", error: "+Log.getStackTraceString(p1));
       return;
    }
    public void onSuccess(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKContainer$s.class, "1")) {
          return;
       }
       TKContainer$s ta = this.a;
       if (ta != null) {
          ta.onSuccess();
       }
       ta = this.c;
       TKContainer g = ta.g;
       if (g != null && this.b == null) {
          ta.E(g, ta.b, objArray);
       }
       a.i("TKContainer", "syncRenderInner success: "+this.c.h);
       return;
    }
}
