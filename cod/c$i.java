package cod.c$i;
import androidx.lifecycle.Observer;
import cod.c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.ImageView;
import android.view.ViewGroup;

public final class c$i implements Observer	// class@000358
{
    public final c b;

    public void c$i(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$i.class, "1")) {
       }else {
          c$i tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, c.class, "7")) {
             c i = tb.i;
             float f = 0x3f800000;
             float f1 = (p0 != null && p0.d() == true)? 0x3f800000: 0x3f000000;
             i.setAlpha(f1);
             i = tb.j;
             f1 = (p0 != null && p0.b() == true)? 0x3f800000: 0x3f000000;
             i.setAlpha(f1);
             c h = tb.h;
             if (p0 == null || p0.c() != true) {
                f = 0x3f000000;
             }
             h.setAlpha(f);
          }
       }
       return;
    }
}
