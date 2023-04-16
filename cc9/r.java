package cc9.r;
import cc9.h;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class r extends h	// class@000518
{
    public final boolean a;
    public final boolean b;

    public void r(){
       super(false, false, 3, null);
    }
    public void r(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void r(boolean p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final boolean a(){
       return this.a;
    }
    public final boolean b(){
       return this.b;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof r && (this.a == p0.a && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       r ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       r tb = this.b;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RefreshRecommendItemState\(triggerRefresh="+this.a+", isShowPartition="+this.b+"\)";
    }
}
