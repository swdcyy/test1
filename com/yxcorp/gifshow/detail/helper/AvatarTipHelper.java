package com.yxcorp.gifshow.detail.helper.AvatarTipHelper;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import p1a.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qrd.l1;
import com.google.gson.JsonObject;
import qd5.a;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.yxcorp.gifshow.detail.helper.AvatarTipHelper$onLiveAvatarClick$3;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.helper.AvatarTipHelper$a;
import erd.g;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import tkd.b;
import tkd.d;
import os5.l;
import lm9.a;
import yqb.k;
import az6.a;
import yqb.b$a;
import yqb.b;
import ida.a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import hv5.a;
import gp5.c;
import com.kwai.nearby.config.utils.LocalConfigUtil;
import qrd.p;
import vw5.b;
import yqb.c;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;

public final class AvatarTipHelper	// class@001562
{
    public static final AvatarTipHelper a;

    static {
       AvatarTipHelper.a = new AvatarTipHelper();
    }
    public void AvatarTipHelper(){
       super();
    }
    public static final void b(BaseFragment p0,QPhoto p1,int p2,QPhoto p3,a p4,boolean p5,boolean p6,PhotoDetailParam p7,String p8,String p9,int p10){
       JsonObject jsonObject;
       AvatarTipHelper a;
       b$a uoa1;
       boolean b;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p7;
       object oobject5 = p8;
       object oobject6 = p9;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AvatarTipHelper uAvatarTipHe = AvatarTipHelper.class;
       int i = 9;
       int i1 = 3;
       int i2 = 8;
       int i3 = 2;
       int i4 = 0;
       int i5 = 1;
       if (PatchProxy.isSupport(uAvatarTipHe)) {
          Object[] objArray = new Object[11];
          objArray[i4] = oobject;
          objArray[i5] = oobject1;
          objArray[i3] = Integer.valueOf(p2);
          objArray[i1] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject4;
          objArray[i2] = oobject5;
          objArray[i] = oobject6;
          objArray[10] = Integer.valueOf(p10);
          if (PatchProxy.applyVoid(objArray, null, uAvatarTipHe, "8")) {
             return;
          }
       }
       a.p(oobject, "fragment");
       a.p(oobject1, "photo");
       a.p(oobject2, "liveInfo");
       if (p3.getLivePlayConfig() == null) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("live getLivePlayConfig null"));
          return;
       }else {
          GifshowActivity activity = p0.getActivity();
          if (activity != null) {
             if (oobject3 != null) {
                a$a uoa = a$a.a(810, "click_head");
                ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
                liveStreamPa.identity = p3.getLiveStreamId();
                uoa.l(liveStreamPa);
                uoa.n(i5);
                jsonObject = new JsonObject();
                jsonObject.c0("live_tag", "TRUE");
                if (oobject5 != null) {
                   jsonObject.c0("live_type", oobject5);
                }
                if (oobject6 != null) {
                   jsonObject.c0("live_room_type", oobject6);
                }
                jsonObject.c0("comment_tips_content", a.a(p1));
                uoa.p = jsonObject.toString();
                uoa.g(a.c(p1, p2));
                oobject3.a(uoa);
             }
             Kgi.c(new AvatarTipHelper$onLiveAvatarClick$3(oobject1));
             if (p5 && (oobject2.mEntity != null && p1.isAd())) {
                if (oobject1.mEntity instanceof LiveStreamFeed) {
                   i0.a().e(283, oobject2.mEntity).a();
                }else {
                   i0.a().e(124, oobject1.mEntity).d(new AvatarTipHelper$a(oobject2)).a();
                }
             }
             if (p3.getUser() != null) {
                f.m(p3.getUser(), p1.getUser().mFollowStatus);
             }
             int i6 = -1492894991;
             int i7 = (!p10)? d.a(i6).KL(p0.f()): p10;
             d.a(-1638991736).Tq(oobject2.mEntity);
             a = AvatarTipHelper.a;
             jsonObject = 78;
             i = (a.a(oobject1))? 78: 18;
             k ok = new k(i3, i);
             if (!p1.isAd()) {
                i3 = 1;
             }
             ok.c = i3;
             i3 = 0x2e315ea8;
             if (oobject4 != null && oobject4.mSource == i2) {
                uoa1 = new b$a();
                uoa1.e(oobject2);
                uoa1.b(activity);
                uoa1.c(oobject);
                uoa1.d(i7);
                uoa1.f(p1.getPosition());
                d.a(i3).su(uoa1.a(), ok);
             }else {
                Objects.requireNonNull(a);
                b obj = PatchProxy.applyOneRefs(oobject4, a, uAvatarTipHe, "13");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(oobject4 != null && (oobject4.mSource == 262 && (FollowConfigUtil.i() || oobject4.mSource == 16))){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   uoa1 = new b$a();
                   uoa1.e(oobject2);
                   uoa1.b(activity);
                   uoa1.c(oobject);
                   uoa1.d(i7);
                   uoa1.f(p1.getPosition());
                   d.a(0x6c2883df).pI(uoa1.a(), ok);
                }else if(i == jsonObject){
                   uoa1 = new b$a();
                   uoa1.e(oobject2);
                   uoa1.b(activity);
                   uoa1.c(oobject);
                   uoa1.d(i7);
                   uoa1.f(p1.getPosition());
                   d.a(i3).su(uoa1.a(), new k(3, i));
                }else if(p6){
                   obj = d.a(-87665878);
                   a.o(obj, "PluginManager.get\(NasaPlugin::class.java\)");
                   if (obj.isAvailable()) {
                      uoa1 = new b$a();
                      uoa1.e(oobject2);
                      uoa1.b(activity);
                      uoa1.c(oobject);
                      uoa1.d(i7);
                      uoa1.f(p1.getPosition());
                      b uob = uoa1.a();
                      if (oobject4 != null && oobject4.mSource == i2) {
                         d.a(i3).su(uob, ok);
                      }else if(oobject4 != null && oobject4.mSource == 9){
                         Boolean uBoolean = PatchProxy.apply(null, null, LocalConfigUtil.class, "1");
                         if (uBoolean == patchProxyRe) {
                            uBoolean = LocalConfigUtil.a.getValue();
                         }
                         if (!uBoolean.booleanValue()) {
                            b uob1 = d.a(0x686ff5e0);
                            a.o(uob, "entranceParam");
                            QPhoto qPhoto = uob.e();
                            BaseFragment uBaseFragmen = uob.b();
                            int i8 = uob.g();
                            c uoc = uob.f();
                            boolean b1 = (uoc != null)? uoc.r(): false;
                            int i9 = uob.d();
                            i = uob.h();
                            uoc = uob.f();
                            String str = (uoc != null)? uoc.w(): null;
                            QPhoto qPhoto1 = uob.e();
                            a.o(qPhoto1, "entranceParam.photo");
                            QPhoto qPhoto2 = uob.e();
                            a.o(qPhoto2, "entranceParam.photo");
                            uob1.Mh(qPhoto, uBaseFragmen, i8, b1, i9, i, str, qPhoto1.getLiveStreamId(), uob.c(), qPhoto2.getUserId(), true, null);
                         }else {
                            d.a(i3).G00(uob);
                         }
                      }else {
                         d.a(i3).G00(uob);
                      }
                   }
                }
                LiveAudienceParam$a uoa2 = new LiveAudienceParam$a();
                QPhoto mEntity = oobject2.mEntity;
                Objects.requireNonNull(mEntity, "null cannot be cast to non-null type com.kuaishou.android.model.feed.LiveStreamFeed");
                uoa2.j(mEntity);
                uoa2.g(i7);
                uoa2.d(p1.getPosition());
                d.a(i6).wV(activity, uoa2.a(), 1025);
             }
          }
          return;
       }
    }
    public static final void c(BaseFragment p0,QPhoto p1,int p2,QPhoto p3,a p4,boolean p5,boolean p6,PhotoDetailParam p7,boolean p8,int p9){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       AvatarTipHelper uAvatarTipHe = AvatarTipHelper.class;
       object oobject3 = null;
       if (PatchProxy.isSupport(uAvatarTipHe)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, oobject3, uAvatarTipHe, "1")) {
             return;
          }
       }
       a.p(p0, "fragment");
       a.p(p1, "photo");
       a.p(p3, "liveInfo");
       String str = (p8)? "SHOPPING_LIVE": oobject3;
       AvatarTipHelper.b(p0, p1, p2, p3, null, p5, p6, p7, str, null, p9);
       return;
    }
    public final boolean a(QPhoto p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, AvatarTipHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoAdvertisementInterface advertisemen = p0.getAdvertisement();
       if (!advertisemen instanceof PhotoAdvertisement) {
          advertisemen = null;
       }
       if (advertisemen != null) {
          PhotoAdvertisement mAdGroup = advertisemen.mAdGroup;
          if (mAdGroup != PhotoAdvertisement$AdGroup.GR && (mAdGroup != PhotoAdvertisement$AdGroup.AD_MERCHANT && mAdGroup != PhotoAdvertisement$AdGroup.AD_SOCIAL)) {
             b = true;
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
}
