package com.cmic.sso.sdk.c.a.d$1$1;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.c.a.d$1;
import android.content.Context;
import com.cmic.sso.sdk.a;
import android.net.Network;
import java.lang.String;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.c.d.c;
import com.cmic.sso.sdk.c.a.d;

public class d$1$1 extends o$a	// class@000f3e
{
    public final Network a;
    public final d$1 b;

    public void d$1$1(d$1 p0,Context p1,a p2,Network p3){
       this.b = p0;
       this.a = p3;
       super(p1, p2);
    }
    public void a(){
       c.b("WifiChangeInterceptor", "onAvailable");
       this.b.b.a(this.a);
       d$1$1 tb = this.b;
       tb.d.b(tb.b, tb.c, tb.a);
    }
}
