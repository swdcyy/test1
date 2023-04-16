package d6a.e;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@001e99
{
    public final boolean a;
    public final int b;
    public final boolean c;

    public void e(boolean p0){
       super(p0, 0, false, 6, null);
    }
    public void e(boolean p0,int p1){
       super(p0, p1, false, 4, null);
    }
    public void e(boolean p0,int p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void e(boolean p0,int p1,boolean p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = -1;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final int a(){
       return this.b;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof e && (this.a == p0.a && (this.b == p0.b && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       e obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = ((i1 * 31) + this.b) * 31;
       e tc = this.c;
       if (tc == null) {
          i = tc;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShowMoreOperationParam\(isPanelOpened="+this.a+", atlasIndex="+this.b+", isFromPauseBroadcast="+this.c+"\)";
    }
}
