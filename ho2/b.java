package ho2.b;
import ho2.d;
import ho2.e;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import csd.b;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.background.multiimage.Point;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b extends d	// class@002dde
{
    public final Point end;
    public final Point start;

    public Object a(e p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.b(this, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public final Point b(){
       return this.end;
    }
    public final Point c(){
       return this.start;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.start, p0.start) && a.g(this.end, p0.end)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.start;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tend = this.end;
       if (tend != null) {
          i = tend.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Background\(start="+this.start+", end="+this.end+"\)";
    }
}
