package ec2.h$a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class h$a extends c	// class@0026e5
{
    public KwaiImageView p;
    public TextView q;
    public UserInfo r;
    public static String sLivePresenterClassName = "LiveLuckyStarOpenResultRollAdapter$LiveLuckyStarOpenResultRollListItemPresenter";

    public void h$a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "3")) {
          return;
       }
       this.q.setText(b.c(this.r));
       g.d(this.p, this.r, HeadImageSize.SMALL);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2147);
       this.p = m1.f(p0, 0x7f0a2146);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       this.r = this.q8(UserInfo.class);
       return;
    }
}
