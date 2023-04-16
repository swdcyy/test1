package k19.n;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import k19.k$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import k19.k;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import java.lang.Runnable;

public class n implements ViewTreeObserver$OnGlobalLayoutListener	// class@002a8a
{
    public final k$c b;

    public void n(k$c p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       j0.a("AdDetailECommercePresenter", "onGlobalLayout", objArray1);
       if (this.b.c.u.getWidth() && this.b.c.u.getHeight()) {
          ViewTreeObserver viewTreeObse = this.b.c.w.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.removeOnGlobalLayoutListener(this);
             this.b.b = objArray;
          }
          this.b.c.Y8();
          if (!l.j(this.b.c.p.mEntity)) {
             k$c c = this.b.c;
             c.w.removeCallbacks(c.H);
             c = this.b.c;
             c.w.postDelayed(c.H, c.R8(c.p));
          }
       }
    label_0073 :
       return;
    }
}
