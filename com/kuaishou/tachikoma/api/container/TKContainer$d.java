package com.kuaishou.tachikoma.api.container.TKContainer$d;
import tx4.o;
import com.kuaishou.tachikoma.api.container.TKContainer;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import sx4.e$a;
import java.lang.String;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tw4.a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import zp8.a;
import java.lang.Throwable;
import java.lang.Integer;
import android.util.Log;

public class TKContainer$d implements o	// class@000f66
{
    public final TKViewContainerWrapView a;
    public final TKViewContainerWrapView$a b;
    public final e$a c;
    public final String d;
    public final Object[] e;
    public final TKContainer f;

    public void TKContainer$d(TKContainer p0,TKViewContainerWrapView p1,TKViewContainerWrapView$a p2,e$a p3,String p4,Object[] p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void a(e p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer$d.class, "1")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.a.setViewContainerIndex(this.f.I);
       }
       this.a.e(p0);
       TKContainer$d tb = this.b;
       if (tb != null) {
          tb.b(this.a, p1);
       }
       this.f.e0(this.c, this.d, this.e, p0, this.a);
       a.i("TKContainer", "syncCreateViewWithAsyncTry success: "+this.f.h+", viewKey: "+this.d);
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(TKContainer$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TKContainer$d.class, "2")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.a.setViewContainerIndex(this.f.I);
       }
       TKContainer$d tb = this.b;
       if (tb != null) {
          tb.a(this.a, p0, p1, p2);
       }
       this.a.d(p1, p2);
       a.i("TKContainer", "syncCreateViewWithAsyncTry failed: "+this.f.h+", viewKey: "+this.d+", error: "+Log.getStackTraceString(p1));
       return;
    }
}
