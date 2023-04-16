package hy8.b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import hy8.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import yx.j0;
import android.view.View;

public final class b implements PopupInterface$d	// class@0025ef
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public final void a(c p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       p1 = 0;
       Object[] objArray = new Object[p1];
       j0.f("NeoNavigationPendant", "Dialog on cancel, cancelType: "+p1, objArray);
       a a = this.a.a;
       if (a != null) {
          a.setVisibility(p1);
       }
       this.a.e("pendant");
       return;
    }
}
