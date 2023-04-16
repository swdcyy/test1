package ku1.b$a;
import java.lang.Runnable;
import ku1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Objects;
import ekd.k1;

public final class b$a implements Runnable	// class@002e02
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       View view = b.e3(this.b);
       b r = this.b.r;
       if (r == null) {
          a.S("adjustPositionGuidanceImageView");
       }
       r.L(c0.a.b("udata/pkg/kwai-client-image/live_common/live_multi_line_best_show_area.webp"));
       view.setVisibility(0);
       b$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "5")) {
          k1.r(tb.t, 0x2710);
       }
       return;
    }
}
