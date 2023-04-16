package d5a.l;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import d5a.l$a;
import java.lang.Runnable;

public final class l implements ViewTreeObserver$OnGlobalLayoutListener	// class@001e86
{
    public final LandscapeEntranceVMPresenter b;
    public final String c;

    public void l(LandscapeEntranceVMPresenter p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       VerticalViewPager verticalView;
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       LandscapeEntranceVMPresenter t = this.b.T;
       if (t != null) {
          verticalView = t.s2();
          if (verticalView != null) {
             ViewTreeObserver viewTreeObse = verticalView.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.removeOnGlobalLayoutListener(this);
             }
          }
       }
       t = this.b.T;
       if (t != null) {
          verticalView = t.s2();
          if (verticalView != null) {
             verticalView.post(new l$a(this));
          }
       }
       return;
    }
}
