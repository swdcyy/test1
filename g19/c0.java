package g19.c0;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import g59.m;

public class c0 extends BaseFeatureFollowPresenter	// class@0023b0
{

    public void c0(){
       super();
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, c0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.A;
    }
    public SlidePlayFollowAnimationView S8(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c0.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return m.a(this.getActivity(), this.u, 0x7f0a10bd);
    }
}
