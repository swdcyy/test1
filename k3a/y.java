package k3a.y;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.l;
import java.lang.Boolean;
import msd.p;
import qrd.l1;

public final class y extends m	// class@002bdc
{
    public final TextElement c;

    public void y(TextElement p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       a.p(p0, "v");
       if (!this.c.k.invoke(p0).booleanValue()) {
          return;
       }
       y tc = this.c;
       TextElement j = tc.j;
       if (j != null) {
          j.invoke(p0, Boolean.valueOf(tc.g()));
       }
       return;
    }
}
