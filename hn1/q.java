package hn1.q;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import nx6.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class q implements Observer	// class@00273e
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;

    public void q(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else {
          a uoa = LiveHotSpotDetailPhotoPlayerCardViewController.V2(this.b).getPlayerKitContext().e(a.class);
          KwaiBindableImageView kwaiBindable = null;
          ImageView cover = (uoa != null)? uoa.getCover(): kwaiBindable;
          if (cover instanceof KwaiImageView) {
             kwaiBindable = cover;
          }
          if (kwaiBindable != null) {
             kwaiBindable.U(p0);
          }
       }
       return;
    }
}
