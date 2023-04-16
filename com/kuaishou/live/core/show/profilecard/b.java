package com.kuaishou.live.core.show.profilecard.b;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import ne2.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import wj2.r;
import wj2.l0;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import erd.g;
import ne2.o;
import java.util.List;
import va1.k0;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyInviteResponse;
import co2.f2;
import p91.m;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import lnc.a1;
import e17.i;
import yx2.d;
import lnc.i3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import android.app.Activity;
import d61.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import kp.r1;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tkd.b;
import tkd.d;
import nl9.r;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import com.kuaishou.live.core.show.profilecard.a;
import java.lang.Boolean;
import t02.a0;
import ks3.r;
import com.kuaishou.live.tuna.presenter.b$c;
import km9.a;
import vu5.b;
import com.yxcorp.retrofit.model.KwaiException;

public class b	// class@000dba
{

    public void b(){
       super();
    }
    public static void a(KwaiBindableImageView p0,UserInfo p1,HeadImageSize p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "8")) {
          return;
       }
       b uob = null;
       d uod = p0.g0(uob, uob, d.d(p1.mHeadUrls, p1.mHeadUrl, p2));
       if (uod != null) {
          uob = uod.e();
       }
       p0.setController(uob);
       return;
    }
    public static void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       try{
          if (p0 != null && p0.isAdded()) {
             p0.dismissAllowingStateLoss();
          }
       }catch(java.lang.Exception e3){
          b.I(LiveLogTag.LIVE_PROFILE, "dismissProfileCard failed", e3);
       }
       return;
    }
    public static void c(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "3")) {
          return;
       }
       p0 = p0.j;
       if (p0 != null) {
          p0.a();
       }
       return;
    }
    public static String d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= 0x5f5e100) {
          return TextUtils.N(0x5f5b9f0)+"+";
       }else {
          return TextUtils.N((long)p0);
       }
    }
    public static String e(LiveUserProfileExtraInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !TextUtils.isEmpty(p0.mDisplayLikeCount)) {
          return p0.mDisplayLikeCount;
       }
       int i = (p0 == null)? 0: p0.mTotalLikeCount;
       return b.d(i);
    }
    public static g f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(p0);
    }
    public static void g(LiveUserProfileExtraInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "10")) {
          return;
       }
       if (p0 != null && !TextUtils.isEmpty(p0.mBase64Segments)) {
          p0.mSegments = k0.a(p0.mBase64Segments);
       }
       return;
    }
    public static void h(LiveVoicePartyInviteResponse p0,f2 p1,m p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "11")) {
          return;
       }
       if (p1 == null || (p1.h() != 5 && p0 != null)) {
          try{
             p0 = p0.mTargetUserNickName;
             if (!TextUtils.isEmpty(p0)) {
                b.Z(LiveVoicePartyLogTag.OTHER, "processVoicePartyInviteResponse show toast");
                Object[] objArray = new Object[]{p0};
                i.d(R.style.arg_RES_7f11066a, String.format(a1.p(R.string.arg_RES_7f102e25), objArray));
                i3 oi3 = i3.f();
                oi3.d("status", "INVITE");
                new d("INVITE_MIC_FEEDBACK_TOAST", p1, p2).a(oi3.e()).g();
             }
          }catch(java.lang.Exception e6){
             b.I(LiveVoicePartyLogTag.OTHER, "LiveProfileUtils processInviteResponse", e6);
          }
       }
    }
    public static void i(GifshowActivity p0,LiveProfileParams p1,r p2){
       boolean b;
       boolean b1;
       boolean b2;
       a0 b1;
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, b.class, "5")) {
          return;
       }
       if (g.h(p0)) {
          PatchProxy.onMethodExit(b.class, "5");
          return;
       }else if(!p1.isCanOpenFullProfile() || p1.getBaseFeed() == null){
          PatchProxy.onMethodExit(b.class, "5");
          return;
       }else {
          QPreInfo qPreInfo = new QPreInfo();
          qPreInfo.mPreExpTag = r1.M0(p1.getBaseFeed());
          qPreInfo.mPreUserId = r1.U1(p1.getBaseFeed());
          qPreInfo.mPreLLSId = TextUtils.k(r1.h1(p1.getBaseFeed()));
          qPreInfo.mPrePhotoIndex = r1.y1(p1.getBaseFeed());
          qPreInfo.mPrePhotoId = p1.getBaseFeed().getId();
          ProfileStartParam profileStart = ProfileStartParam.l(b.c(p1.getUserProfile()));
          profileStart.A(qPreInfo);
          if (k.B(new QPhoto(p1.getBaseFeed())) != null && ((qPreInfo.mPreUserId).equals(p1.getUserProfile().mProfile.mId) || d.a(0x691527a8).E4())) {
             profileStart.x(p1.getBaseFeed());
          }
          if (profileStart.d() != null && p2.m == LiveProfileMode.LITE_AUDIENCE_VIEW_OTHERS) {
             profileStart.p(a.b);
          }
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = null;
          r obj1 = PatchProxy.applyOneRefs(p2, obj, b.class, "16");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1 = PatchProxy.applyOneRefs(p2, obj, b.class, "14");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                obj1 = p2.w;
                if (obj1 != null) {
                   a0 z1 = obj1.z1;
                   if (z1 != null && z1.c()) {
                      b1 = true;
                   }
                }
                b1 = false;
             }
             r obj2 = PatchProxy.applyOneRefs(p2, obj, b.class, "15");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else {
                obj2 = p2.w;
                if (obj2 != null) {
                   a0 g1 = obj2.g1;
                   if (g1 != null && g1.a()) {
                      b2 = true;
                   }
                }
                b2 = false;
             }
             obj = PatchProxy.applyOneRefs(p2, obj, b.class, "13");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                r w = p2.w;
                if (w != null) {
                   b1 = w.B1;
                   if (b1 != null && b1.Ql()) {
                      b = true;
                   }
                }
                b = false;
             }
             b.Z(LiveLogTag.LIVE_PROFILE, "isShopCartVisible: "+b1+" isLiveTunaIconVisible: "+b2);
             if (!b1 && (b2 || b)) {
                b = true;
             }else {
                b = false;
             }
          }
          if (b) {
             profileStart.q("LIVE");
          }
          d.a(-1718536792).Y7(p0, profileStart);
          PatchProxy.onMethodExit(b.class, "5");
          return;
       }
    }
    public static void j(Throwable p0,f2 p1,m p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "12")) {
          return;
       }
       if (p0 instanceof KwaiException && (p1 != null && p0.mErrorCode == 0x1391a)) {
          i3 oi3 = i3.f();
          oi3.d("status", "EXIT");
          new d("INVITE_MIC_FEEDBACK_TOAST", p1, p2).a(oi3.e()).g();
       }
    label_003d :
       return;
    }
}
