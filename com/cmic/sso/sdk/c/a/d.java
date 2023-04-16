package com.cmic.sso.sdk.c.a.d;
import com.cmic.sso.sdk.c.a.b;
import java.lang.Object;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.c.d.c;
import com.cmic.sso.sdk.a;
import android.content.Context;
import com.cmic.sso.sdk.e.s;
import com.cmic.sso.sdk.c.a.d$1;
import com.cmic.sso.sdk.e.s$a;
import com.cmic.sso.sdk.c.a.d$2;

public class d implements b	// class@000f41
{
    public b a;

    public void d(){
       super();
    }
    public void a(b p0){
       this.a = p0;
    }
    public void a(c p0,c p1,a p2){
       if (!p0.b()) {
          this.b(p0, p1, p2);
          return;
       }else {
          s.a(null).a(new d$1(this, p2, p0, p1));
          return;
       }
    }
    public void b(c p0,c p1,a p2){
       d ta = this.a;
       if (ta != null) {
          ta.a(p0, new d$2(this, p1), p2);
       }
       return;
    }
}
