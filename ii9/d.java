package ii9.d;
import erd.g;
import ii9.e;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import pi9.p;
import android.view.View;
import com.yxcorp.utility.n;

public final class d implements g	// class@002835
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "3")) {
       }else if(p.g(p0.c)){
          e n = tb.n;
          int i = (p0.a != null)? 4: 0;
          n.Y(n, i, true);
       }
       return;
    }
}
