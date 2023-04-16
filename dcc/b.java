package dcc.b;
import dcc.b$a;
import nsd.u;
import java.lang.Runnable;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b	// class@00216a
{
    public final Runnable a;
    public final Runnable b;
    public final Runnable c;
    public final a d;
    public final a e;
    public static final b$a f;

    static {
       b.f = new b$a(null);
    }
    public void b(){
       super(null, null, null, null, null, 31, null);
    }
    public void b(Runnable p0,Runnable p1,Runnable p2,a p3,a p4,int p5,u p6){
       if (p5 & 0x02) {
          p1 = null;
       }
       if (p5 & 0x04) {
          p2 = null;
       }
       if (p5 & 0x08) {
          p3 = null;
       }
       if (p5 & 0x10) {
          p4 = null;
       }
       super();
       this.a = null;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       return;
    }
    public static final b a(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.f.a(p0);
    }
    public static final b b(Runnable p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.f.b(p0, p1);
    }
    public static final b c(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.f.c(p0);
    }
    public static final b d(Runnable p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.f.d(p0, p1);
    }
    public static final b e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.f.e(p0);
    }
    public static final b f(a p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.f.f(p0, p1);
    }
}
