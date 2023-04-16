package dr1.f$h;
import dr1.g$a;
import dr1.f;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import dr1.d;
import androidx.lifecycle.MutableLiveData;
import ls1.b;

public final class f$h implements g$a	// class@002004
{
    public final f a;

    public void f$h(f p0){
       this.a = p0;
       super();
    }
    public void a(LiveMultiLineArenaLiveState p0,LiveMultiLineArenaLiveState p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f$h.class, "1")) {
          return;
       }
       a.p(p0, "oldState");
       a.p(p1, "newState");
       b.P(f.s, "state change, old: "+p0+", new: "+p1);
       d value = this.a.d().getValue();
       if (value != null) {
          value.g(p1);
          b.b(this.a.d()).setValue(value);
       }
       return;
    }
}
