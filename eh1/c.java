package eh1.c;
import eh1.b;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import wkd.b;
import kotlin.jvm.internal.a;
import kka.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c extends b	// class@002165
{
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public void c(String p0,String p1,int p2,boolean p3,int p4,u p5){
       Object obj;
       if (p4 & 0x04) {
          obj = b.a(-1592356291);
          a.o(obj, "Singleton.get\(FreeTrafficHelper::class.java\)");
          obj = obj.s();
       }
       if (p4 & 0x08) {
          p3 = false;
       }
       a.p(p0, "liveStreamId");
       a.p(p1, "pathSuffix");
       super(p0);
       this.b = p0;
       this.c = p1;
       this.d = obj;
       this.e = p3;
       return;
    }
    public String a(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a(), p0.a()) && (a.g(this.c, p0.c) && (this.d == p0.d && this.e == p0.e))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c tc = this.c;
       if (tc != null) {
          i = tc.hashCode();
       }
       i1 = (((i1 + i) * 31) + this.d) * 31;
       c te = this.e;
       if (te != null) {
          te = 1;
       }
       return (i1 + te);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftPanelNormalParam\(liveStreamId="+this.a()+", pathSuffix="+this.c+", kCardProduct="+this.d+", isPrefetch="+this.e+"\)";
    }
}
