package cy2.c;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import android.graphics.Point;
import nsd.u;
import cy2.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@0023fd
{
    public final LivePlayGLSurfaceView a;
    public boolean b;
    public Point c;

    public void c(LivePlayGLSurfaceView p0,boolean p1,Point p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = false;
       }
       p2 = (p3 & 0x04)? g.a: null;
       a.p(p0, "surface");
       a.p(p2, "lastVideoSize");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public final Point a(){
       return this.c;
    }
    public final LivePlayGLSurfaceView b(){
       return this.a;
    }
    public final void c(Point p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void d(boolean p0){
       this.b = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (this.b == p0.b && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePlayStateGLSurfaceView\(surface="+this.a+", isPrepared="+this.b+", lastVideoSize="+this.c+"\)";
    }
}
