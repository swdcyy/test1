package k02.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002c53
{
    public boolean a;
    public String b;
    public int c;
    public boolean d;

    public void c(boolean p0,String p1,int p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final int a(){
       return this.c;
    }
    public final String b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (this.a == p0.a && (a.g(this.b, p0.b) && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       c tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.c) * 31;
       tb = this.d;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceTreasureBoxTimerInfo\(shouldShowProgressBar="+this.a+", timerTaskId="+this.b+", progress="+this.c+", shouldReportWhenMaxProgress="+this.d+"\)";
    }
}
