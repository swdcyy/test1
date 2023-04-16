package com.meizu.cloud.pushsdk.c.e.b;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.d.a;
import com.meizu.cloud.pushsdk.c.e.d;
import com.meizu.cloud.pushsdk.c.c.g;
import com.meizu.cloud.pushsdk.c.g.l;
import com.meizu.cloud.pushsdk.c.e.b$1;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.g.g;

public class b extends j	// class@0014e5
{
    public final j a;
    public c b;
    public d c;

    public void b(j p0,a p1){
       super();
       this.a = p0;
       if (p1 != null) {
          this.c = new d(p1);
       }
       return;
    }
    public static d a(b p0){
       return p0.c;
    }
    public g a(){
       return this.a.a();
    }
    public final l a(l p0){
       return new b$1(this, p0);
    }
    public void a(c p0){
       if (this.b == null) {
          this.b = g.a(this.a(p0));
       }
       this.a.a(this.b);
       this.b.flush();
       return;
    }
    public long b(){
       return this.a.b();
    }
}
