package e63.q;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class q implements View$OnClickListener	// class@00266c
{
    public final e b;
    public final String c;

    public void q(e p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       q tb = this.b;
       q tc = this.c;
       if (tb.t.isAdded() && tb.r.isCanOpenFullProfile()) {
          tb.d9();
          if (!PatchProxy.applyVoid(null, tb, e.class, "46")) {
             QPreInfo qPreInfo = new QPreInfo();
             qPreInfo.mPreExpTag = r1.M0(tb.r.getBaseFeed());
             qPreInfo.mPreUserId = r1.U1(tb.r.getBaseFeed());
             qPreInfo.mPreLLSId = TextUtils.k(r1.h1(tb.r.getBaseFeed()));
             qPreInfo.mPrePhotoIndex = r1.y1(tb.r.getBaseFeed());
             qPreInfo.mPrePhotoId = tb.r.getBaseFeed().getId();
             ProfileStartParam profileStart = ProfileStartParam.l(b.c(tb.r.getUserProfile()));
             profileStart.A(qPreInfo);
             profileStart.x(tb.r.getBaseFeed());
             d.a(-1718536792).Y7(tb.p, profileStart);
          }
          e y = tb.y;
          if (y != null) {
             y.onClickAvatarAtLiveTips(tb.r.getBaseFeed(), tc);
          }
       }
    label_009d :
       return;
    }
}
