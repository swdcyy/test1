package com.meizu.cloud.pushsdk.c.c.b;
import com.meizu.cloud.pushsdk.c.c.j;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.g;
import java.util.List;
import com.meizu.cloud.pushsdk.c.c.m;
import com.meizu.cloud.pushsdk.c.c.b$1;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.g.b;
import java.lang.Object;

public class b extends j	// class@0014c8
{
    public final List b;
    public final List c;
    public static final g a;

    static {
       b.a = g.a("application/x-www-form-urlencoded");
    }
    public void b(List p0,List p1){
       super();
       this.b = m.a(p0);
       this.c = m.a(p1);
    }
    public void b(List p0,List p1,b$1 p2){
       super(p0, p1);
    }
    public final long a(c p0,boolean p1){
       long l;
       b uob = (p1)? new b(): p0.b();
       int i1 = this.b.size();
       for (int i = 0; i < i1; i = i + 1) {
          if (i > 0) {
             uob.b(38);
          }
          uob.a(this.b.get(i));
          uob.b(61);
          uob.a(this.c.get(i));
       }
       if (p1) {
          l = uob.a();
          uob.j();
       }else {
          l = 0;
       }
       return l;
    }
    public g a(){
       return b.a;
    }
    public void a(c p0){
       this.a(p0, false);
    }
    public long b(){
       return this.a(null, true);
    }
}
