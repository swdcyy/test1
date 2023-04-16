package com.cmic.sso.sdk.c.a.d$1;
import com.cmic.sso.sdk.e.s$a;
import com.cmic.sso.sdk.c.a.d;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.c.d.c;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.net.Network;
import com.cmic.sso.sdk.c.a.d$1$1;
import android.content.Context;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.e.o;

public class d$1 implements s$a	// class@000f3f
{
    public final a a;
    public final c b;
    public final c c;
    public final d d;
    public final AtomicBoolean e;

    public void d$1(d p0,a p1,c p2,c p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
       this.e = new AtomicBoolean(false);
    }
    public void a(Network p0){
       if (!this.e.getAndSet(true) && p0 != null) {
          o.a(new d$1$1(this, null, this.a, p0));
       }
       return;
    }
}
