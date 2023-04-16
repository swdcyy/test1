package e63.p0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import zf6.k;
import ekd.j;
import e63.o1;
import com.kuaishou.live.core.show.profilecard.http.LiveProfileGuardInfo;
import android.view.ViewGroup;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kwai.framework.model.user.UserInfo;
import ne2.k;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kuaishou.live.core.show.profilecard.b;

public final class p0 implements g	// class@002669
{
    public final e b;

    public void p0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       LiveUserProfileExtraInfo mLiveProfile;
       p0 tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       b.Z(LiveLogTag.SCORE_RANK, "receive profile urls from net");
       LiveUserProfileExtraInfo mHeadWidget = p0.mHeadWidget;
       if (PatchProxy.applyVoidOneRefs(mHeadWidget, tb, uoe, "24")) {
       }else {
          e h = tb.H;
          if (h != null) {
             if (mHeadWidget == null || mHeadWidget.length <= 0) {
                h.setVisibility(8);
             }else {
                h.setVisibility(false);
                tb.H.U(mHeadWidget);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, tb, uoe, "25") && !tb.r.isTopFollowLayoutInRecyclerViewHeader()) {
          mLiveProfile = (k.d())? p0.mBackgroundDarkModePicture: p0.mBackgroundPicture;
          if (j.h(mLiveProfile)) {
             tb.E.setVisibility(8);
          }else {
             tb.E.setVisibility(false);
             tb.E.U(mLiveProfile);
          }
       }
       e c1 = tb.C1;
       Objects.requireNonNull(c1);
       if (!PatchProxy.applyVoidOneRefs(p0, c1, o1.class, "3")) {
          mLiveProfile = p0.mLiveProfileGuardInfo;
          if (mLiveProfile == null || mLiveProfile.mProfileGuardUserInfo == null) {
             c1.d = false;
             c1.a.setVisibility(8);
          }else {
             c1.e = p0;
             c1.d = true;
             c1.a.setVisibility(false);
             o1 f = c1.f;
             if (f != null) {
                k.m(f.a(), c1.e.mLiveProfileGuardInfo.mProfileGuardUserInfo.mId, false);
             }
             b.a(c1.b, p0.mLiveProfileGuardInfo.mProfileGuardUserInfo, HeadImageSize.SMALL);
             if (j.h(p0.mLiveProfileGuardInfo.mProfileGuardRingUrls)) {
                c1.c.setVisibility(8);
             }else {
                c1.c.setVisibility(false);
                c1.c.U(p0.mLiveProfileGuardInfo.mProfileGuardRingUrls);
             }
          }
       }
       return;
    }
}
