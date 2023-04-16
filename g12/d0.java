package g12.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.a;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import b51.d;
import g12.d0$a;
import tw6.c;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;

public class d0 extends PresenterV2	// class@002a24
{
    public d p;
    public LiveBizParam q;
    public static String sLivePresenterClassName = "LiveSlideTipPresenter";

    public void d0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       this.p.q().T(new d0$a(this, a.n(this.getActivity())));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       this.p = this.q8(d.class);
       this.q = this.q8(LiveBizParam.class);
       return;
    }
}
