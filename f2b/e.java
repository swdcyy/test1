package f2b.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import e2b.a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import java.lang.String;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.f3;
import k2b.e0;

public final class e implements Runnable	// class@002873
{
    public final HomeLocalSizerViewPresenter b;

    public void e(HomeLocalSizerViewPresenter p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       a uoa = a.class;
       if (!tb.p.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
       }else if(!TextUtils.x(tb.x.getCityName())){
          HomeLocalSizerViewPresenter p = tb.p;
          if (!PatchProxy.applyVoidOneRefs(p, null, uoa, "1")) {
             f3.l("2616700", "NEARBY_TOP_BAR_CITY_INFO_BTN").h(p);
          }
       }
       if (tb.x.a()) {
          HomeLocalSizerViewPresenter p1 = tb.p;
          if (!PatchProxy.applyVoidOneRefs(p1, null, uoa, "2")) {
             f3.l("2616702", "NEARBY_TOP_BAR_WEATHER_INFO_BTN").h(p1);
          }
       }
       return;
    }
}
