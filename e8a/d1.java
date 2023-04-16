package e8a.d1;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d1	// class@00209e
{
    public long a;
    public float b;
    public boolean c;

    public void d1(){
       super(0, 0, false, 7, null);
    }
    public void d1(long p0,float p1,boolean p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0x1d4c0;
       }
       if (p3 & 0x02) {
          p1 = 0x3f800000;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d1 && (!this.a - p0.a && (!Float.compare(this.b, p0.b) && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       d1 obj = PatchProxy.apply(null, this, d1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (((int)(obj ^ (obj >> 32)) * 31) + Float.floatToIntBits(this.b)) * 31;
       obj = this.c;
       if (obj != null) {
          i1 = 1;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OppoPreventBurnInPageConfig\(intervalMs="+this.a+", translation="+this.b+", enable="+this.c+"\)";
    }
}
