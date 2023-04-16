package lm1.c;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002f9e
{
    public final String a;
    public long b;
    public final Map c;
    public final Map d;
    public String e;

    public void c(String p0,long p1,Map p2,Map p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final long a(){
       return this.b;
    }
    public final String b(){
       return this.a;
    }
    public final void c(long p0){
       this.b = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (!this.b - p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && a.g(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       c tb = this.b;
       i1 = ((i1 * 31) + (int)(tb ^ (tb >> 32))) * 31;
       tb = this.c;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftSendCommonParams\(sessionId="+this.a+", costTime="+this.b+", bizExtraParams="+this.c+", bizLogParams="+this.d+", extraInfo="+this.e+"\)";
    }
}
