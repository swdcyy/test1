package f72.g;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class g extends c	// class@0028cb
{
    public LiveStreamFeed p;
    public KwaiImageView q;
    public QPhoto r;
    public static String sLivePresenterClassName = "LiveDoubleListFeedAvatarPresenter";

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       this.p = this.r.mEntity;
       User user = PatchProxy.apply(objArray, this, og, "4");
       if (user != PatchProxyResult.class) {
       }else {
          user = r1.T1(this.p);
       }
       if (user == null) {
          return;
       }else if(this.q.getVisibility()){
          this.q.setVisibility(0);
       }
       g.b(this.q, user, HeadImageSize.SMALL);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1c88);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       return;
    }
}
