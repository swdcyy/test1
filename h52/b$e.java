package h52.b$e;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b$e extends c	// class@002c4c
{
    public QPhoto p;
    public KwaiImageView q;
    public static String sLivePresenterClassName = "LivePlayClosedV2AggregationFeedPresenter$AvatarPresenter";

    public void b$e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b$e.class, "3")) {
          return;
       }
       b$e tp = this.p;
       if (tp != null && tp.getUser() != null) {
          g.b(this.q, this.p.getUser(), HeadImageSize.SMALL);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a037c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b$e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       return;
    }
}
