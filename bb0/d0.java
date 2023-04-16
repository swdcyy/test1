package bb0.d0;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.e;
import java.lang.Object;
import xa0.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import fb0.l;
import ra0.a;

public final class d0 implements g	// class@000258
{
    public final e b;

    public void d0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "5")) {
       }else {
          e c = p0.c;
          e b = p0.b;
          p0 = p0.d;
          if (p0 - (float)a1.e(16.00f) < 0 && tb.R8()) {
             tb.V8();
          }
          if (p0 - 0x43f00000 < 0 && tb.R8()) {
             tb.G = true;
             tb.W8();
          }
          if (b > c && !p0 - (float)tb.p.getView().getHeight()) {
             if (tb.F == null) {
                l.e(5, "COLLAPSE_INTELLGENT_ALBUM", null);
                tb.F = true;
             }
          }else if(c > b && !p0){
             if (tb.E == null) {
                l.e(5, "EXPAND_INTELLGENT_ALBUM", null);
                tb.E = true;
             }
             a.p(false);
          }
       }
    label_0073 :
       return;
    }
}
