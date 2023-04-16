package d92.j;
import erd.g;
import d92.k;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import z12.e;
import t02.a0;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import z12.x;
import d61.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import wkd.b;
import ip.c;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import k2b.u1;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kwai.framework.model.feed.BaseFeed;

public final class j implements g	// class@0024ae
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, k.class, "8")) {
       }else {
          String str = "LiveAudienceSwipePresenter";
          int i = 0;
          if (p0.v.isFinishing()) {
             p0 = new String[i];
             e.c(str, "activity is finished", p0);
          }else {
             User user = 16;
             String str1 = (p0.p.o.mLiveSourceType == user)? 1: null;
             if (str1) {
                p0 = new String[i];
                e.c(str, "fromUserProfile", p0);
             }else {
                String[] stringArray = new String[i];
                e.c(str, "handleOnLeftSwiped", stringArray);
                k p = p0.p;
                a0 o = p.o;
                p0 = p0.v;
                a0 c = p.c;
                LiveAudienceParam mPreInfo = o.mPreInfo;
                if (!PatchProxy.applyVoidFourRefs(o, p0, c, mPreInfo, null, x.class, "43") && (g.h(p0) || (c == null || (c.getUser() != null && (!b.a(0x188c3889).g(c.getPhotoAdvertisement()) && o.mLiveSourceType != user))))) {
                   u1.K0(2);
                   ProfileStartParam profileStart = ProfileStartParam.l(c.getUser());
                   profileStart.A(mPreInfo);
                   profileStart.x(c.mEntity);
                   d.a(-1718536792).Nl(p0, profileStart, 100);
                }
             }
          }
       }
    label_00ad :
       return;
    }
}
