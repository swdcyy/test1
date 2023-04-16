package e0b.l;
import android.view.View$OnClickListener;
import e0b.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.util.Collection;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import e0b.h$a;

public final class l implements View$OnClickListener	// class@0025d5
{
    public final j b;

    public void l(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       j f;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.b.P.j().f("KS_TV", false, (this.b.Q.isEmpty() ^ 0x01));
       l tb = this.b;
       j g = tb.G;
       if (g != null) {
          f = tb.F;
          if (f != null) {
             f.removeView(g);
          }
       }
       this.b.g0(new ArrayList());
       this.b.i0();
       f = this.b.L;
       if (f != null) {
          f.a();
       }
       this.b.P.j().n();
       return;
    }
}
