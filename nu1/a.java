package nu1.a;
import androidx.lifecycle.Observer;
import nu1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkTeamFrameView;
import kotlin.jvm.internal.a;

public final class a implements Observer	// class@0033cd
{
    public final c b;

    public void a(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "it");
          c.e3(this.b).a(p0);
       }
       return;
    }
}
