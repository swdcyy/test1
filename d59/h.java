package d59.h;
import k59.r2;
import d59.h$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.a;
import android.widget.RelativeLayout$LayoutParams;

public final class h extends r2	// class@00204d
{
    public static final h$a B;

    static {
       h.B = new h$a(null);
    }
    public void h(){
       super();
    }
    public void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       j0.f("AdMKFollowToolBarPresenter", "replaceTitleBar", objArray1);
       View view = this.m8().findViewById(R.id.title_root);
       if (view != null) {
          view.setVisibility(8);
          ViewParent parent = view.getParent();
          if (!parent instanceof ViewGroup) {
             parent = objArray;
          }
          if (parent != null) {
             parent.addView(this.V8());
             FrameLayout uFrameLayout = this.m8().findViewById(R.id.adtk_wrapper_view);
             if (uFrameLayout != null) {
                ViewGroup$LayoutParams layoutParams = uFrameLayout.getLayoutParams();
                a.o(layoutParams, "webViewLayout.layoutParams");
                if (layoutParams instanceof RelativeLayout$LayoutParams) {
                   objArray = layoutParams;
                }
                if (objArray != null) {
                   objArray.removeRule(3);
                   objArray.topMargin = this.V8().getLayoutParams().height;
                }
             }
          }
       }
    label_006e :
       return;
    }
}
