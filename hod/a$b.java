package hod.a$b;
import androidx.lifecycle.Observer;
import hod.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ynd.g;
import android.widget.ImageView;
import android.view.View;

public final class a$b implements Observer	// class@000f9e
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a$b tb = this.b;
          a.o(p0, "folded");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uoa, "5")) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().s("RecoTextAndFoldBtnViewBinder", "updatePanelState: "+b, objArray);
             if (tb.c.b()) {
                if (b) {
                   tb.E(true);
                }else {
                   tb.f.setVisibility(i);
                   tb.g.setVisibility(i);
                   tb.e.setVisibility(i);
                   tb.E(i);
                }
             }else {
                tb.f.setVisibility(4);
                tb.g.setVisibility(4);
                a e = tb.e;
                if (b) {
                   i = 8;
                }
                e.setVisibility(i);
             }
          }
       }
       return;
    }
}
