package bpc.b;
import tvc.e;
import nsd.u;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yoc.j;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b extends e	// class@00045b
{
    public int a;
    public final double b;

    public void b(){
       super(0, 0, 3, null);
    }
    public void b(int p0,double p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void b(int p0,double p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0xbff0000000000000;
       }
       super(p0, p1);
       return;
    }
    public static b a(b p0,int p1,double p2,int p3,Object p4){
       b a;
       b b;
       if (p3 & 0x01) {
          a = p0.a;
       }
       if (p3 & 0x02) {
          b = p0.b;
       }
       Objects.requireNonNull(p0);
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          p0 = PatchProxy.applyTwoRefs(Integer.valueOf(a), Double.valueOf(b), p0, uob, "2");
          if (p0 != PatchProxyResult.class) {
          label_0031 :
             return p0;
          }
       }
       p0 = new b(a, b);
       goto label_0031 ;
    }
    public final double b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof b) {
          return false;
       }
       return j.a(this.b, p0.b);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.b);
       return ((this.a * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipPreviewState\(playerScrollX="+this.a+", playerNeedStopPosition="+this.b+"\)";
    }
}
