package f19.i;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class i	// class@00228a
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void i(){
       super(0, 0, 0, 0, 15, null);
    }
    public void i(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void i(int p0,int p1,int p2,int p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = 0;
       }
       if (p4 & 0x02) {
          p1 = 0;
       }
       if (p4 & 0x04) {
          p2 = 48;
       }
       if (p4 & 0x08) {
          p3 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof i && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "width -> "+this.a+", height-> "+this.b+", gravity -> "+this.c+", topMargin-> "+this.d;
    }
}
