package b8a.t1;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;

public final class t1 implements Observer	// class@0003f6
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void t1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       t1 tb = this.b;
       tb.v = p0;
       if (p0 != null && p0.mType == 1) {
          p0 = p0.mPhoto;
          if (p0 != null) {
             tb.V = p0;
          }
       }
       return;
    }
}
