package k02.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@002c52
{
    public int a;
    public String b;
    public String c;
    public boolean d;

    public void b(int p0,String p1,String p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final String a(){
       return this.b;
    }
    public final int b(){
       return this.a;
    }
    public final String c(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       b tb = this.b;
       int i1 = 0;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i1 = tb.hashCode();
       }
       i = (i + i1) * 31;
       tb = this.d;
       if (tb != null) {
          i2 = 1;
       }
       return (i + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceTreasureBoxStatusInfo\(treasureBoxStatus="+this.a+", bottomDescriptionText="+this.b+", webUrl="+this.c+", shouldShowNewTipAnimation="+this.d+"\)";
    }
}
