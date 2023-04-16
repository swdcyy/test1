package bb0.c;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ra0.b;
import q87.c;
import w69.e;
import android.widget.ImageView;
import android.view.View;
import android.widget.LinearLayout;
import android.view.ViewGroup;

public final class c implements g	// class@000257
{
    public final c b;

    public void c(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, c.class, "6")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().w("SmartAlbumExpandAnim", "initExpandView\(\) called", objArray);
          p0 = tb.z;
          if (p0 != null) {
             if (tb.C != null) {
                tb.S8(0);
             }else {
                p0.f(0, 0, 0);
             }
             tb.z.d(true);
             tb.z.c(true);
             tb.D = true;
             tb.r.setRotation(0);
             tb.q.setVisibility(0);
             tb.s.setAlpha(0);
             tb.p.setAlpha(0x3f800000);
          }
       }
       return;
    }
}
