package com.kuaishou.tachikoma.api.container.TKContainer$a;
import tx4.o;
import com.kuaishou.tachikoma.api.container.TKContainer;
import sx4.e$a;
import java.lang.String;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zp8.a;
import java.lang.Throwable;
import java.lang.Integer;
import android.util.Log;

public class TKContainer$a implements o	// class@000f63
{
    public final o a;
    public final e$a b;
    public final String c;
    public final Object[] d;
    public final TKContainer e;

    public void TKContainer$a(TKContainer p0,o p1,e$a p2,String p3,Object[] p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(e p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer$a.class, "1")) {
          return;
       }
       if (this.a != null) {
          this.e.e0(this.b, this.c, this.d, p0, null);
          this.a.a(p0, p1);
       }
       a.i("TKContainer", "asyncCreateView success: "+this.e.h+", viewKey: "+this.c);
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(TKContainer$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TKContainer$a.class, "2")) {
          return;
       }
       TKContainer$a ta = this.a;
       if (ta != null) {
          ta.b(4002, p1, p2);
       }
       a.i("TKContainer", "asyncCreateView failed: "+this.e.h+", viewKey: "+this.c+", error: "+Log.getStackTraceString(p1));
       return;
    }
}
