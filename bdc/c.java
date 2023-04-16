package bdc.c;
import bdc.n;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.i;
import bdc.b;
import com.kwai.robust.PatchProxyResult;

public abstract class c implements n	// class@000453
{
    public i a;
    public b b;
    public final int c;
    public final String d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public void c(){
       super(0, null, 0, false, false, 31, null);
    }
    public void c(int p0,String p1,long p2,boolean p3,boolean p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       if (p5 & 0x02) {
          p1 = "";
       }
       if (p5 & 0x04) {
          p2 = 0x9a7ec800;
       }
       if (p5 & 0x08) {
          p3 = false;
       }
       if (p5 & 0x10) {
          p4 = false;
       }
       a.p(p1, "cacheKey");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       return;
    }
    public int a(){
       return this.c;
    }
    public boolean b(){
       return this.f;
    }
    public void c(){
       PatchProxy.applyVoid(null, this, c.class, "4");
    }
    public long d(){
       return this.e;
    }
    public void e(){
       PatchProxy.applyVoid(null, this, c.class, "5");
    }
    public boolean f(){
       return this.g;
    }
    public void g(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       a.p(p0, "pageList");
       this.a = p0;
       return;
    }
    public String getCacheKey(){
       return this.d;
    }
    public final b h(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("manager");
       }
       return obj;
    }
}
