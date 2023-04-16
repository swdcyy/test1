package g19.y;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;

public final class y implements Observer	// class@0023e2
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void y(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       y tb = this.b;
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
