package d5a.m;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import lq9.a;

public final class m implements ViewTreeObserver$OnPreDrawListener	// class@001e87
{
    public final LandscapeEntranceVMPresenter b;
    public final String c;

    public void m(LandscapeEntranceVMPresenter p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       LandscapeEntranceVMPresenter obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.T;
       if (obj != null) {
          VerticalViewPager verticalView = obj.s2();
          if (verticalView != null) {
             ViewTreeObserver viewTreeObse = verticalView.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.removeOnPreDrawListener(this);
             }
          }
       }
       a.e(this.c, "clientRenderTime");
       a.f(this.c, "animationTime");
       return true;
    }
}
