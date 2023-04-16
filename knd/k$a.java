package knd.k$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class k$a	// class@0017ea
{
    public String a;
    public double b;

    public void k$a(String p0,double p1){
       super();
       this.a = null;
       this.b = p1;
    }
    public final String a(){
       return this.a;
    }
    public final double b(){
       return this.b;
    }
    public final void c(String p0){
       this.a = p0;
    }
    public final void d(double p0){
       this.b = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof k$a && (a.g(this.a, p0.a) && !Double.compare(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k$a obj = PatchProxy.apply(null, this, k$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       long l = Double.doubleToLongBits(this.b);
       return ((i * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ResultData\(mAudioPath="+this.a+", mDuration="+this.b+"\)";
    }
}
