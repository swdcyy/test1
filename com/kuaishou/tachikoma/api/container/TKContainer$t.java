package com.kuaishou.tachikoma.api.container.TKContainer$t;
import tx4.o;
import com.kuaishou.tachikoma.api.container.TKContainer;
import sx4.e;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zp8.a;
import java.lang.Throwable;
import java.lang.Integer;
import android.util.Log;

public class TKContainer$t implements o	// class@000f77
{
    public final e[] a;
    public final o b;
    public final String c;
    public final TKContainer d;

    public void TKContainer$t(TKContainer p0,e[] p1,o p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(e p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer$t.class, "1")) {
          return;
       }
       this.a[0] = p0;
       TKContainer$t tb = this.b;
       if (tb != null) {
          tb.a(p0, p1);
       }
       a.i("TKContainer", "syncCreateView success: "+this.d.h+", viewKey: "+this.c);
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(TKContainer$t.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TKContainer$t.class, "2")) {
          return;
       }
       TKContainer$t tb = this.b;
       if (tb != null) {
          tb.b(4002, p1, p2);
       }
       a.i("TKContainer", "syncCreateView failed: "+this.d.h+", viewKey: "+this.c+", error: "+Log.getStackTraceString(p1));
       return;
    }
}
