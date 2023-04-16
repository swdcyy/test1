package com.cmic.sso.sdk.c.a.c;
import com.cmic.sso.sdk.c.a.b;
import java.lang.Object;
import com.cmic.sso.sdk.c.a;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.c.d.c;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.c.a.c$1;
import com.cmic.sso.sdk.c.d.a;

public class c implements b	// class@000f3d
{
    public b a;
    public c b;
    public final a c;

    public void c(){
       super();
       this.c = new a();
    }
    public static a a(c p0){
       return p0.c;
    }
    public void a(b p0){
       this.a = p0;
    }
    public void a(c p0,c p1,a p2){
       this.b(p0, p1, p2);
    }
    public void b(c p0,c p1,a p2){
       if (this.a != null) {
          this.b = new c$1(this, p0, p2, p1);
          if (p0.g()) {
             this.a.a(p0, this.b, p2);
          }else {
             p1.a(a.a(0x30d59));
          }
       }
       return;
    }
}
