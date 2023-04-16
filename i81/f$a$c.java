package i81.f$a$c;
import i81.f$a;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f$a$c extends f$a	// class@002852
{
    public final Rect a;

    public void f$a$c(Rect p0){
       a.p(p0, "rect");
       super(null);
       this.a = p0;
    }
    public final Rect a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f$a$c && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f$a$c obj = PatchProxy.apply(null, this, f$a$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HalfScreenWithFocusLocation\(rect="+this.a+"\)";
    }
}
