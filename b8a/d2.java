package b8a.d2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter;
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
import m9a.k;

public class d2 extends BaseFeatureFollowPresenter	// class@00039b
{

    public void d2(){
       super();
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, d2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.A;
    }
    public SlidePlayFollowAnimationView S8(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, d2.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return k.a(this.getActivity(), this.u, 0x7f0a10bd);
    }
}
