package m02.v0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import com.kuaishou.live.core.basic.activity.c;
import en8.a;

public class v0 implements Runnable	// class@0030e7
{
    public final LivePlayFragment b;

    public void v0(LivePlayFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       boolean b = PatchProxy.applyVoid(objArray, this, v0.class, "1");
       if (b) {
          return;
       }
       v0 tb = this.b;
       tb.Ph(true, true);
       LivePlayFragment y1 = this.b.y1;
       if (y1 != null) {
          Objects.requireNonNull(y1);
          if (!PatchProxy.applyVoid(objArray, y1, LivePlayLoader.class, "12")) {
             LivePlayLoader d = y1.d;
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoid(objArray, d, c.class, "22")) {
                d.d("OnLiveStop");
             }
             LivePlayLoader b1 = y1.b;
             if (b1 != null) {
                b1.flush();
             }
          }
       }
       return;
    }
}
