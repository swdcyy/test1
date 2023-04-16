package apc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@0002bb
{
    public final int a;
    public final int b;
    public final double c;

    public void b(int p0,int p1,double p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final double a(){
       return this.c;
    }
    public final int b(){
       return this.b;
    }
    public final int c(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && (this.b == p0.b && !Double.compare(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.c);
       return ((((this.a * 31) + this.b) * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TransitionActionData\(mTransitionType="+this.a+", mTrackIndex="+this.b+", mDuration="+this.c+"\)";
    }
}
