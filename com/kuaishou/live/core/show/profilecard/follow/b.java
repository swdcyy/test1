package com.kuaishou.live.core.show.profilecard.follow.b;
import java.lang.Object;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import java.lang.Runnable;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import fka.e;
import com.kwai.framework.model.user.UserSettingOption;
import we2.e;
import we2.c;
import y41.i$a;
import erd.g;
import y41.i;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.yxcorp.gifshow.util.rx.RxBus;
import bk2.f;
import tx1.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wj2.r;
import we2.f;
import brd.t;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import t02.r1;
import pg1.d;
import com.kuaishou.live.core.show.profilecard.follow.a;
import erd.r;
import we2.b;
import we2.d;

public class b	// class@000dc1
{

    public void b(){
       super();
    }
    public static void a(LiveProfileParams p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       LiveFollowExtParams followExtPar = p0.getFollowExtParams();
       if (followExtPar == null) {
          followExtPar = new LiveFollowExtParams$a().a();
       }
       p0.setFollowExtParams(followExtPar);
       followExtPar.updateFollowClickPositionOnProfileCard(p1);
       return;
    }
    public static void b(GifshowActivity p0,LiveProfileParams p1,User p2,String p3,boolean p4,Runnable p5){
       Object[] objArray;
       b uob = b.class;
       i$a obj = null;
       int i = 3;
       int i1 = 2;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, obj, uob, "5")) {
             return;
          }
       }
       if (p4 != p2.isFollowingOrFollowRequesting()) {
          p2.mPage = "live";
          objArray = new Object[i];
          objArray[0] = p1.getUserProfile().mProfile.mId;
          objArray[1] = p1.getLiveStreamId();
          objArray[i1] = Integer.valueOf(PhotoType.LIVESTREAM.toInt());
          String str = String.format("%s_%s_l%s", objArray);
          String str1 = p0.Q2();
          String str2 = b.c(p1);
          if (p1.getProfileOriginSource() != 22 && (p1.getProfileOriginSource() == 23 || p1.getProfileOriginSource() == 17)) {
             String str3 = PatchProxy.apply(obj, obj, uob, "6");
             if (str3 != PatchProxyResult.class) {
             }else {
                str3 = e.a().c(77);
             }
             str1 = str3;
          }
          if (p4) {
             if (p1.getUserProfile().mUserSettingOption.isPrivacyUser != null) {
                p1.getUserProfile().isFollowing = false;
                p1.getUserProfile().isFollowRequesting = true;
             }else {
                p1.getUserProfile().isFollowing = true;
                p1.getUserProfile().isFollowRequesting = false;
             }
          }else {
             p1.getUserProfile().isFollowing = false;
             p1.getUserProfile().isFollowRequesting = false;
          }
          obj = new i$a(p0, p3);
          obj.o(p2);
          obj.l(str1);
          obj.d(str);
          obj.m(p1.getLogUrl());
          obj.n(p1.getFollowSource());
          obj.r(1);
          obj.h(str2);
          obj.l = true;
          obj.g(p1.getFollowExtParams());
          obj.j(new e(p5, p1));
          i$a uoa = obj.i(new c(p1));
          int followSource = p1.getFollowSource();
          if (followSource != 229 && (followSource == 230 || followSource == 198)) {
             uoa.k(291);
          }
          i oi = uoa.a();
          if (p4) {
             if (p1.getClickType() == LiveStreamClickType.LIVE_PK_PEER.getValue()) {
                RxBus.f.b(new f(p2));
             }
             oi.c();
          }else {
             oi.e();
          }
       }
       return;
    }
    public static String c(LiveProfileParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b a = (p0 != null && (p0.getProfileExtParams() != null && !TextUtils.x(p0.getProfileExtParams().a)))? p0.getProfileExtParams().a: e.a().b();
       return a;
    }
    public static t d(r p0,f p1){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       r obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = p0.b;
       r c = p0.c;
       r d = p0.d;
       b.c0(LiveLogTag.LIVE_PROFILE, "unfollow user start", "userId", obj1.mId);
       String str = PatchProxy.applyOneRefs(p0, obj, uob, "4");
       if (str != patchProxyRe) {
       }else {
          r w = p0.w;
          if (w != null) {
             str1 = e.j(w.c);
          }else {
             w = p0.x;
             str1 = (w != null)? w.T(): "";
          }
          str = str1;
       }
       i$a uoa = new i$a();
       uoa.o(obj1);
       uoa.h(c.Q2());
       uoa.d("liveProfile");
       uoa.m(str);
       uoa.r(false);
       uoa.n(d.getFollowSource());
       uoa.g(d.getFollowExtParams());
       if (d.c.b()) {
          uoa.h(b.c(p0.d));
       }
       return uoa.a().d().filter(a.b).doOnNext(new b(p1, obj1, d)).doOnError(new d(obj1));
    }
}
