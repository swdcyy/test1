package bc9.f0$a;
import cc9.i;
import bc9.f0;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ac9.g;
import cc9.q;
import ac9.l;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import bc9.c0;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class f0$a implements i	// class@0003e8
{
    public final f0 a;

    public void f0$a(f0 p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          if (this.a.y != p0.g()) {
             this.a.y = p0.g();
             p0 = this.a.w;
             Drawable uDrawable = null;
             p0 = (p0 != null)? p0.d(): uDrawable;
             if (p0 instanceof l) {
                p0 = this.a;
                if (p0.y != null) {
                   p0.S8().setPlaceHolderImage(uDrawable);
                }else {
                   p0.S8().setPlaceHolderImage(R.drawable.arg_RES_7f080e07);
                }
             }
          }
       }
       return;
    }
}
