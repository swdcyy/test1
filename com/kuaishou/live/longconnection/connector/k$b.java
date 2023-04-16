package com.kuaishou.live.longconnection.connector.k$b;
import z00.c;
import com.kuaishou.live.longconnection.connector.k;
import com.google.protobuf.nano.MessageNano;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.Map;
import lf3.h;
import com.kuaishou.live.longconnection.connector.k$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.StringBuilder;
import mf3.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.os.Handler;
import if3.z;
import java.lang.Runnable;
import if3.a0;
import if3.b0;

public class k$b extends c	// class@000c72
{
    public final int b;
    public final k c;

    public void k$b(k p0,k p1,int p2){
       this.c = p0;
       super(p1);
       this.b = p2;
    }
    public void b(MessageNano p0,boolean p1,boolean p2){
       boolean b;
       if (PatchProxy.isSupport(k$b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, k$b.class, "1")) {
          return;
       }
       h oh = this.c.p.get(Integer.valueOf(this.b));
       if (oh != null && !this.c.l(Integer.valueOf(this.b))) {
          oh.b(p0, p1, p2);
       }
       k$a uoa = new k$a(this.b, p0, p1, p2);
       k$b tc = this.c;
       Objects.requireNonNull(tc);
       Object obj = PatchProxy.apply(null, tc, k.class, "24");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tc.g.e() >= 0){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          if (!p1 || (!p2 || this.c.u != null)) {
             Object[] objArray = new Object[]{uoa.b.getClass().getSimpleName()+", mIsFromCache: "+uoa.c+", mIsInCachePeriod: "+uoa.d+", mCacheMessageDispatching: "+this.c.u};
             b.a(this.c.g(), "add to mCacheMessageTasks", objArray);
             tc = this.c;
             _monitor_enter(tc);
             this.c.w.add(uoa);
             if (this.c.u == null) {
                p1.u = true;
                this.c.k().post(new z(this));
             }
             _monitor_exit(tc);
          }else {
             this.c.k().post(new a0(this, uoa));
          }
       }else {
          this.c.k().post(new b0(this, uoa));
       }
       return;
    }
}
