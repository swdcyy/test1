package j79.o;
import erd.g;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import java.lang.Object;
import u79.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.List;
import j79.l0;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

public final class o implements g	// class@002787
{
    public final MediaPreviewSelectViewStub b;

    public void o(MediaPreviewSelectViewStub p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          o tb = this.b;
          a.h(p0, "item");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MediaPreviewSelectViewStub.class, "25")) {
             if (tb.w.D0().size() <= 0) {
                tb.n(p0);
             }else {
                MediaPreviewSelectViewStub s = tb.s;
                if (s != null) {
                   s.cancel();
                }
                tb.s = null;
                if (!p0.isPlaying()) {
                   ViewGroup viewGroup = tb.l();
                   if (viewGroup != null && viewGroup.getVisibility() == 8) {
                      b = true;
                   label_0055 :
                      tb.k(b, true, false);
                      tb.n(p0);
                   }
                }
                b = false;
                goto label_0055 ;
             }
          }
       }
       return;
    }
}
