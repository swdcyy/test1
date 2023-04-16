package m02.a1;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a1 implements LivePlayLoader$e	// class@0030a9
{
    public final LivePlayLoader a;
    public final LivePlayLoader$e b;

    public void a1(LivePlayLoader p0,LivePlayLoader$e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(boolean p0){
       a1 ta = this.a;
       a1 tb = this.b;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, LivePlayLoader.class, "23")) {
       }else {
          ta.l = true;
          ta.d();
       }
       tb.a(p0);
       return;
    }
}
