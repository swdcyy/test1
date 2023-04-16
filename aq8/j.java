package aq8.j;
import java.lang.Object;
import java.lang.String;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.bridge.d;
import com.tkruntime.v8.JavaCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import aq8.i;
import java.lang.Number;
import java.lang.Integer;
import com.tachikoma.core.component.timer.TKTimer;

public class j	// class@000310
{
    public TKTimer a;
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
       this.a = null;
    }
    public static j b(){
       return j.b;
    }
    public final JavaCallback a(String p0,c p1,d p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(this, p0, p1, p2);
    }
    public final int c(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null || ("undefined").equals(p0)) {
          return 0;
       }
       return p0.intValue();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.a = new TKTimer();
       }
       return;
    }
}
