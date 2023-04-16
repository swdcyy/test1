package b5a.i;
import b5a.k;
import b5a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.nonslide.b;
import java.util.Objects;
import wd5.e$a;
import wd5.e;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;
import b5a.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class i implements k	// class@00036e
{
    public final h a;

    public void i(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "1")) {
          return;
       }
       this.a.r.g(2);
       h t = this.a.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, e$a.class, "1")) {
          e.a(1);
          t.a = true;
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "2")) {
          return;
       }
       i ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, h.class, "11") && ta.u == null) {
          h w = ta.w;
          if (w != null && w.isValid()) {
             ta.w.getCoverAspectRatio();
             ta.w.isLongPhoto();
             ta.m8().getViewTreeObserver().addOnGlobalLayoutListener(new j(ta));
          }
       }
       return;
    }
}
