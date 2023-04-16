package dy8.a;
import dy8.a$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import dy8.a$b;
import android.content.Context;
import n3d.a;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import dy8.a$c;
import erd.g;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import tw.f;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import os5.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import mxb.f0;
import e17.i;
import yx.j0;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.User;
import lu7.f;

public final class a	// class@0020f7
{
    public final QPhoto a;
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(QPhoto p0){
       a.p(p0, "mQPhoto");
       super();
       this.a = p0;
    }
    public final void a(int p0,Activity p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "activity");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          LoginParams$a uoa1 = new LoginParams$a();
          uoa1.d(a1.p(R.string.arg_RES_7f103077));
          d.a(-1712118428).x00(p1, 14, uoa1.a(), new a$b(this, p0, p1));
          return;
       }else {
          f$a uoa2 = new f$a(this.a.getUserId(), String.valueOf(186));
          uoa2.q(true);
          FollowHelper.b(uoa2.b());
          this.b(p0, 19);
          return;
       }
    }
    public final void b(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       i0.a().e(2, this.a.getEntity()).d(new a$c(p0, p1)).a();
       return;
    }
    public final void c(int p0,Activity p1,AvatarInfoResponse p2){
       QPhoto mEntity;
       LiveAudienceParam$a uoa;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "3")) {
          return;
       }
       a.p(p1, "activity");
       PhotoAdvertisement photoAdverti = k.B(this.a);
       LiveStreamFeed liveStreamFe = null;
       if (photoAdverti != null) {
          PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
          if (adData != null) {
             adData = adData.mLiveStreamId;
          label_0032 :
             if (p2 != null) {
                p2 = p2.mPhoto;
                if (p2 != null) {
                   mEntity = p2.mEntity;
                label_003c :
                   if (mEntity instanceof LiveStreamFeed) {
                      liveStreamFe = mEntity;
                   }
                   int i = 1;
                   if (liveStreamFe != null && !f.h(photoAdverti)) {
                      uoa = new LiveAudienceParam$a();
                      uoa.j(liveStreamFe);
                      uoa.g(233);
                      d.a(-1492894991).m1(p1, uoa.a());
                      this.b(p0, i);
                   }else if(!TextUtils.x(adData)){
                      b.a(-762347696).u1(adData, k.B(this.a));
                      uoa = new LiveAudienceParam$a();
                      uoa.i(adData);
                      uoa.g(233);
                      d.a(-1492894991).m1(p1, uoa.a());
                      this.b(p0, i);
                   }else {
                      i.a(R.style.arg_RES_7f110668, 0x7f1020a8);
                      Object[] objArray = new Object[0];
                      j0.c("AdNeoClickHelper", "liveTipInfo and mAvatarInfoResponse.mPhoto are null.", objArray);
                   }
                   return;
                }
             }
             mEntity = liveStreamFe;
             goto label_003c ;
          }
       }
       LiveStreamFeed liveStreamFe1 = liveStreamFe;
       goto label_0032 ;
    }
    public final void d(int p0,Activity p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       a.p(p1, "activity");
       d.a(-1718536792).Kp(p1, ProfileStartParam.m(this.a.getUserId()));
       this.b(p0, 2);
       return;
    }
    public final void e(User$FollowStatus p0,AvatarInfoResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "followStatus");
       f.m(this.a.getUser(), p0);
       if (p1 != null) {
          p1 = p1.mPhoto;
          if (p1 != null) {
             User user = p1.getUser();
             if (user != null) {
                f.m(user, p0);
             }
          }
       }
       return;
    }
}
