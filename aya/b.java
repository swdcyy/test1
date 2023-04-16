package aya.b;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@000333
{
    public final double interval;
    public final int maxCount;

    public void b(){
       super(0, 0, 3, null);
    }
    public void b(double p0,int p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0x3ff0000000000000;
       }
       if (p2 & 0x02) {
          p1 = 20;
       }
       super();
       this.interval = p0;
       this.maxCount = p1;
       return;
    }
    public final double a(){
       return this.interval;
    }
    public final int b(){
       return this.maxCount;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (!Double.compare(this.interval, p0.interval) && this.maxCount == p0.maxCount))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.interval);
       return (((int)(l ^ (l >> 32)) * 31) + this.maxCount);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KSTemplateIllegalInfoController\(interval="+this.interval+", maxCount="+this.maxCount+"\)";
    }
}
