package nu6.c;
import nu6.e;
import nu6.a;
import nu6.f;
import nu6.b;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nu6.c$a;

public final class c	// class@0033d3
{
    public final e a;
    public final a b;
    public final f c;
    public final b d;

    public void c(){
       super(null, null, null, null, 15, null);
    }
    public void c(e p0,a p1,f p2,b p3){
       a.p(p1, "bundleCheckProvider");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void c(e p0,a p1,f p2,b p3,int p4,u p5){
       c$a uoa;
       if (p4 & 0x02) {
          uoa = new c$a();
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(null, uoa, null, p3);
       return;
    }
    public final f a(){
       return this.c;
    }
}
