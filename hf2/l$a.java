package hf2.l$a;
import com.yxcorp.gifshow.widget.m;
import hf2.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import co2.i0;
import ne2.k;
import mz6.b;
import android.content.Context;
import java.util.ArrayList;
import mz6.b$d;
import java.util.Collection;
import hf2.a;
import android.content.DialogInterface$OnCancelListener;
import hf2.c;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import hf2.j;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kuaishou.live.core.show.profilecard.follow.b;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import fka.e;
import hf2.b;
import hf2.k;
import y41.i$a;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import erd.g;
import y41.i;
import com.kwai.framework.model.user.UserSettingOption;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.yxcorp.gifshow.util.rx.RxBus;
import bk2.f;

public class l$a extends m	// class@002d87
{
    public final l c;

    public void l$a(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, str)) {
          return;
       }
       l$a tc = this.c;
       Objects.requireNonNull(tc);
       l ol = l.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, ol, "16")) {
          boolean b = true;
          tc.z = b;
          if (tc.G.isFollowingOrFollowRequesting()) {
             tc.K.j(-1, tc.E, tc.G.mVisitorBeFollowed, objArray);
             b uob = new b(tc.F);
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(new b$d(R.string.arg_RES_7f104f05, -1, R.color.arg_RES_7f060c49));
             uob.b(uArrayList);
             uob.k(new a(tc));
             uob.l(new c(tc));
             uob.q();
          }else {
             tc.K.j(b, tc.E, tc.G.mVisitorBeFollowed, objArray);
             if (!QCurrentUser.me().isLogined()) {
                tc.S8();
                l f = tc.F;
                y.a(f, f.getUrl(), "live_profile_follow", 40, a.a().a().getString(R.string.arg_RES_7f103077), tc.E.getBaseFeed(), null, null, j.b);
             }else {
                b.a(tc.E, str);
                int i = tc.G.isFollowingOrFollowRequesting() ^ b;
                if (PatchProxy.isSupport(ol) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), tc, ol, "17") && i != tc.G.isFollowingOrFollowRequesting())) {
                   Object[] objArray1 = new Object[]{tc.E.getUserProfile().mProfile.mId,tc.E.getLiveStreamId(),Integer.valueOf(PhotoType.LIVESTREAM.toInt())};
                   String str1 = String.format("%s_%s_l%s", objArray1);
                   String str2 = b.c(tc.E);
                   int i1 = 77;
                   if (tc.E.getProfileOriginSource() != 22 && (tc.E.getProfileOriginSource() == 23 || tc.E.getProfileOriginSource() == 17)) {
                      String str3 = PatchProxy.apply(objArray, tc, ol, "18");
                      if (str3 != PatchProxyResult.class) {
                      }else {
                         str3 = e.a().c(i1);
                      }
                      str2 = str3;
                   }else {
                      i1 = 0;
                   }
                   tc.G.mPage = "live";
                   i$a uoa = new i$a(tc.E.getLiveStreamId());
                   uoa.o(tc.G);
                   uoa.l(tc.F.Q2());
                   uoa.k(i1);
                   uoa.d(str1);
                   uoa.m(tc.E.getLogUrl());
                   uoa.n(tc.E.getFollowSource());
                   uoa.r(b);
                   uoa.h(str2);
                   uoa.g(tc.E.getFollowExtParams());
                   uoa.j(new b(tc));
                   i oi = uoa.i(new k(tc)).a();
                   if (i) {
                      if (tc.E.getUserProfile().mUserSettingOption.isPrivacyUser != null) {
                         tc.E.getUserProfile().isFollowing = false;
                         tc.E.getUserProfile().isFollowRequesting = b;
                      }else {
                         tc.E.getUserProfile().isFollowing = b;
                         tc.E.getUserProfile().isFollowRequesting = false;
                      }
                   }else {
                      tc.E.getUserProfile().isFollowing = false;
                      tc.E.getUserProfile().isFollowRequesting = false;
                   }
                   if (i) {
                      if (tc.E.getClickType() == LiveStreamClickType.LIVE_PK_PEER.getValue()) {
                         RxBus.f.b(new f(tc.G));
                      }
                      oi.c();
                   }else {
                      oi.e();
                   }
                }
             }
          }
       }
       return;
    }
}
