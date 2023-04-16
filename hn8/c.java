package hn8.c;
import com.facebook.react.bridge.GuardedRunnable;
import hn8.b;
import com.facebook.react.bridge.ReactContext;
import java.util.Queue;
import ze.x0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.f;
import hn8.b$b;
import ze.x;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;

public class c extends GuardedRunnable	// class@0025ba
{
    public final Queue b;
    public final b c;

    public void c(b p0,ReactContext p1,Queue p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void runGuarded(){
       b c = this.c.c;
       b$b obj = PatchProxy.applyOneRefs(c, null, x0.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): c.k().q();
       while (!this.b.isEmpty()) {
          obj = this.b.remove();
          x ox = this.c.c.x(obj.a);
          if (ox != null) {
             this.c.k.updateView(obj.a, ox.getViewClass(), obj.b);
          }
       }
       if (b) {
          this.c.c.g(-1);
       }
       return;
    }
}
