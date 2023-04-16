package com.kuaishou.live.longconnection.connector.a;
import io.reactivex.g;
import com.kuaishou.live.longconnection.connector.b;
import com.kuaishou.live.longconnection.connector.l;
import com.kuaishou.android.live.model.Horse;
import java.lang.Object;
import brd.v;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import com.kuaishou.live.longconnection.connector.a$a;
import lf3.a;
import com.kuaishou.live.longconnection.connector.l$c;
import of3.i;
import com.kuaishou.live.longconnection.connector.a$b;
import com.kuaishou.live.longconnection.connector.k;
import java.lang.Runnable;

public class a implements g	// class@000c5c
{
    public boolean b;
    public final Object c;
    public final l d;
    public final Horse e;
    public final b f;

    public void a(b p0,l p1,Horse p2){
       this.f = p0;
       this.d = p1;
       this.e = p2;
       super();
       this.c = new Object();
    }
    public void a(v p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a tc = this.c;
       _monitor_enter(tc);
       if (!p0.isDisposed() && this.b == null) {
          p0.onError(p1);
          this.b = true;
       }
       _monitor_exit(tc);
       return;
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.f.u(new a$a(this, p0));
       a td = this.d;
       td.l(new l$c(this.e.mHostAndPort, ""));
       this.f.n(td);
       b e = this.f.e;
       e.u(new i(e, this.e.mTag, new a$b(this, p0)));
       return;
    }
}
