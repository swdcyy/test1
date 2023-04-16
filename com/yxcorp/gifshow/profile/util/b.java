package com.yxcorp.gifshow.profile.util.b;
import s1c.v;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.ProfileStyle;
import java.lang.Object;
import tkd.b;
import tkd.d;
import nx5.c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import lnc.i3;
import a3c.e;
import java.lang.Number;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import brd.t;
import wh5.c;
import o3c.l;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import s1c.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import o3c.v;
import com.kwai.components.social.util.network.NetworkTrace;
import li5.a;
import z5c.w2;
import kotlin.jvm.internal.a;
import rvb.k$a;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import rvb.b;
import rvb.n;
import rvb.g$b;
import rvb.f;
import rvb.c;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.kwai.framework.model.user.UserProfile;
import m4c.a;
import m4c.d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.StringBuilder;
import java.lang.System;
import v2c.g;
import z5c.h0;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import z5c.d3;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import u3c.h;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import hw5.e;
import com.kwai.framework.model.user.UserOwnerCount;
import vv5.l1;
import qa6.b;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserSettingOption;
import com.kwai.framework.model.user.NewsPrivacy;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import lnc.a1;
import com.kwai.framework.model.user.ProfileBannedInfo;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;
import u3c.i;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.util.o;
import j5c.c$a;
import java.lang.Throwable;
import j5c.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import z5c.y1;
import k2b.f3;
import k2b.e0;
import com.yxcorp.gifshow.profile.kslog.KsLogInfoProductionTag;
import z5c.x2;
import crd.b;
import lnc.b9;
import z5c.k0;
import com.yxcorp.gifshow.profile.util.a;
import com.yxcorp.gifshow.profile.util.a$a;
import z5c.c;
import z5c.w;
import erd.g;
import t45.d;
import brd.z;
import z5c.x;
import erd.o;
import z5c.y;
import com.kwai.framework.model.user.ProfilePageInfo;
import z5c.v;
import cjd.e;
import brd.w;
import android.view.View;
import android.app.Activity;
import z5c.e0;
import z5c.d0;
import z5c.f0;
import z5c.g0;

public class b	// class@0015d3
{
    public v a;
    public ProfileParam b;
    public User c;
    public int d;
    public boolean e;
    public boolean f;
    public final int g;
    public b h;
    public Drawable i;
    public boolean j;
    public ImageCallback k;
    public String l;
    public b m;

    public void b(v p0,ProfileParam p1,User p2,ProfileStyle p3){
       super();
       this.i = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3.getProfileStyle();
       ProfileParam mScene = p1.mScene;
       this.g = (mScene != null)? mScene: d.a(0x37332120).w20(p2);
       return;
    }
    public static String d(int p0){
       i3 obj;
       boolean b;
       ProfilePostEmptyCardUtils e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "16");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = i3.f();
       String str = "enableEmpowerArea";
       b = true;
       String str1 = "revisionStyle";
       if (e.a(p0)) {
          obj.c(str1, Integer.valueOf(3));
          obj.a(str, Boolean.TRUE);
       }else {
          obj.c(str1, Integer.valueOf(b));
          obj.a(str, Boolean.TRUE);
       }
       if (b.a(-1578665399).F()) {
          obj.a("enableManageFriends", Boolean.TRUE);
       }
       e = ProfilePostEmptyCardUtils.e;
       Objects.requireNonNull(e);
       Object obj1 = PatchProxy.apply(null, e, ProfilePostEmptyCardUtils.class, "11");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!e.d() || e.c()){
          b = false;
       }
       obj.a("needMaterialTemplate", Boolean.valueOf(b));
       return obj.e();
    }
    public final void a(){
       this.i = null;
    }
    public final Map b(){
       HashMap obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (this.b.getTunaExtraParams() != null) {
          obj.put("businessServiceProfileParams", this.b.getTunaExtraParams());
       }
       return obj;
    }
    public final t c(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0x37313f08;
       if (c.j()) {
          return b.a(i).z(this.c.getId(), true, p0, 1, RequestTiming.DEFAULT, this.b());
       }else {
          v.a(this.a.c.o());
          return b.a(i).h(this.c.getId(), true, p0, 3, RequestTiming.DEFAULT, this.b(), this.b.getBusinessSceneType(), b.d(this.d), a.c(this.a.c.o()));
       }
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "13")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       b tc = this.c;
       if (!PatchProxy.applyVoidOneRefs(tc, objArray, w2.class, "7")) {
          a.p(tc, "user");
          n.f(w2.a.a(tc), objArray, objArray, 6, objArray).b(g$b.b);
       }
       return;
    }
    public final void f(UserProfileResponse p0){
       boolean b;
       UserProfileResponse mUserProfile;
       a e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "4")) {
          return;
       }
       b = true;
       if (e.a(this.d)) {
          mUserProfile = p0.mUserProfile;
          b td = this.d;
          if (!PatchProxy.isSupport(uob) || (!PatchProxy.applyVoidTwoRefs(mUserProfile, Integer.valueOf(td), this, uob, "5") && mUserProfile != null)) {
             ImageRequest imageRequest = d.c(d.b(mUserProfile, td));
             g.e(KsLogProfileTag.BG_IMMERSIVE.appendTag("ProfileDataHelper"), "loadBackgroundImage startLoad:"+System.currentTimeMillis()+" uid: "+this.c.getId());
             if (imageRequest != null) {
                this.j = b;
                a.d(imageRequest, new h0(this));
             }
          }
       }
       this.b.setUserProfileResponse(p0);
       mUserProfile = p0.mUserProfile;
       if (!PatchProxy.applyVoidOneRefs(mUserProfile, this, uob, "7")) {
          if (d3.a(this.c)) {
             UserProfileMissUInfo userProfileM = h.j(mUserProfile);
             if (!e.P() && (userProfileM != null && userProfileM.mMissUCount > null)) {
                SharedPreferences$Editor uEditor = e.a.edit();
                uEditor.putBoolean(b.d("user")+"ReceiveMissUBefore", b);
                g.a(uEditor);
             }
          label_00c1 :
             d.a(-854594802).a00(mUserProfile.mOwnerCount.mFan);
          }
          if (mUserProfile != null) {
             if (!PatchProxy.applyVoidOneRefs(mUserProfile, this, uob, "8")) {
                b.d(mUserProfile, this.c);
                uob = this.b;
                uob.mVerifiedUrl = mUserProfile.mProfile.mVerifiedUrl;
                uob.mUserProfile = mUserProfile;
                if (d3.a(this.c)) {
                   if (mUserProfile.mOwnerCount != null) {
                      QCurrentUser.ME.setFollowerCount(mUserProfile.mOwnerCount.mFan);
                   }
                   if (mUserProfile.mUserSettingOption != null) {
                      QCurrentUser mE = QCurrentUser.ME;
                      mE.startEdit();
                      mE.setPrivateUser(mUserProfile.mUserSettingOption.isPrivacyUser).setPrivateLocation(mUserProfile.mUserSettingOption.isLocationHidden).setAutoSaveToLocal(mUserProfile.mUserSettingOption.mShouldAutoSaveToLocal).setEnableLocalIntelligenceAlbum(mUserProfile.mUserSettingOption.mShouldEnableLocalIntelligenceAlbum).setDisableLatestAlbumAsset(mUserProfile.mUserSettingOption.mDisableLatestAlbumAsset).setWifiPreUploadDeny(mUserProfile.mUserSettingOption.mIsWifiPreUploadDeny).setOwnerCount(mUserProfile.mOwnerCount);
                      UserSettingOption mNewsPrivacy = mUserProfile.mUserSettingOption.mNewsPrivacy;
                      if (mNewsPrivacy != null) {
                         mE.setPrivateNews(mNewsPrivacy.mNewsPrivacyType).setPrivateNewsBlackCount(mUserProfile.mUserSettingOption.mNewsPrivacy.mBandedUserCount);
                      }
                      mE.commitChanges();
                   }
                   this.b.mBanReason = TextUtils.k(mUserProfile.mProfile.mBanReason);
                }else {
                   uob = this.b;
                   String str = (TextUtils.x(mUserProfile.mProfile.mBanReason))? a1.p(R.string.arg_RES_7f100359): mUserProfile.mProfile.mBanReason;
                   uob.mBanReason = str;
                }
                this.b.mBanText = TextUtils.k(mUserProfile.mProfile.mBanText);
                uob = this.b;
                uob.mBanDisallowAppeal = mUserProfile.mProfile.mBanDisallowAppeal;
                UserProfileMeta userProfileM1 = PatchProxy.applyOneRefs(mUserProfile, null, h.class, "2");
                if (userProfileM1 != patchProxyRe) {
                }else {
                   a.p(mUserProfile, "profile");
                   userProfileM1 = i.c(mUserProfile);
                   userProfileM1 = (userProfileM1 != null)? userProfileM1.mBannedInfo: null;
                }
                uob.mProfileBannedInfo = userProfileM1;
             }
             this.c.notifyChanged();
             this.b.mIsBackgroundDefault = h.n(mUserProfile);
             ProfileParam.mProfileInfoPercent = o.m(this.b.mUser, mUserProfile);
          }
       }
       UserProfileResponse mUserProfile1 = p0.mUserProfile;
       if (mUserProfile1 != null && h.m(mUserProfile1) == null) {
          g.e(KsLogProfileTag.COMMON.appendTag("ProfileDataHelper"), "tabList is null");
       }
       e = this.a.e;
       c$a uoa = PatchProxy.applyOneRefs(p0, null, c$a.class, "2");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new c$a(2, p0, null);
       }
       e.a(uoa);
       if (this.a.c.getActivity() instanceof GifshowActivity) {
          Objects.requireNonNull(this.a.c.getActivity());
       }
       if (!d3.a(this.c)) {
          a c = this.a.c;
          if (!PatchProxy.applyVoidTwoRefs(c, p0, null, y1.class, "76")) {
             i3 oi3 = i3.f();
             oi3.d("abnormal_type", y1.e(p0));
             f3 uof3 = f3.j("ABNORMAL_BUTTON");
             uof3.m(oi3.e());
             uof3.a("PERSONAL_INFO_FUNC");
             uof3.h(c);
          }
       }
       return;
    }
    public void g(boolean p0,String p1){
       t ot;
       a a;
       UserProfileResponse userProfileR;
       UserProfileResponse mUserProfile;
       UserProfile mProfile;
       UserInfo mId;
       a a1;
       long l1;
       ProfilePageInfo mUserType;
       b uob = b.class;
       String str = "2";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, str)) {
          return;
       }
       x2.a(KsLogInfoProductionTag.PROFILE_INFO_API, p1);
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.l = p1;
       FragmentActivity activity = this.a.c.getActivity();
       b9.a(this.h);
       View view = null;
       if (d3.a(this.c) && (!p0 && k0.g())) {
          a uoa = a.e.a();
          String id = this.c.getId();
          Objects.requireNonNull(uoa);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a uoa1 = a.class;
          QCurrentUser obj = PatchProxy.applyOneRefs(id, uoa, uoa1, "1");
          if (obj != patchProxyRe) {
          }else {
             a.p(id, "uid");
             obj = QCurrentUser.ME;
             a.o(obj, "QCurrentUser.ME");
             long l = 0;
             if (a.g(id, obj.getId())) {
                QCurrentUser obj1 = PatchProxy.applyOneRefs(id, uoa, uoa1, str);
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }else {
                   obj1 = QCurrentUser.ME;
                   a.o(obj1, "QCurrentUser.ME");
                   if (uoa.a(obj1.getUserType())) {
                      ot = t.empty();
                      a.o(ot, "Observable.empty\(\)");
                   }else {
                      a = uoa.a;
                      if (a != null && a.c() == c.j()) {
                         a = uoa.a;
                         if (a != null) {
                            userProfileR = a.a();
                            if (userProfileR != null) {
                               mUserProfile = userProfileR.mUserProfile;
                               if (mUserProfile != null) {
                                  mProfile = mUserProfile.mProfile;
                                  if (mProfile != null) {
                                     mId = mProfile.mId;
                                  label_00c3 :
                                     if (a.g(mId, id) && uoa.d(userProfileR.mUserProfile)) {
                                        a1 = uoa.a;
                                        l1 = (a1 != null)? a1.d(): l;
                                        userProfileR.mCacheTime = l1;
                                        mUserProfile = userProfileR.mUserProfile;
                                        uoa1 = uoa.a;
                                        if (uoa1 != null) {
                                           l = uoa1.d();
                                        }
                                        mUserProfile.mCacheTime = l;
                                        ot = t.just(userProfileR).doOnNext(new w(userProfileR, uoa, id));
                                        a.o(ot, "Observable.just\(this\).do¡­$mCacheTime\"\)\n          }");
                                     }
                                  }
                               }
                               mId = view;
                               goto label_00c3 ;
                            }
                         }
                      }
                      uoa.a = view;
                      ot = t.just(Boolean.TRUE).subscribeOn(d.c).map(x.b).observeOn(d.a).flatMap(new y(uoa, id));
                      a.o(ot, "Observable.just\(true\).su¡­ Observable.empty\(\)\n    }");
                   }
                   obj = ot;
                }
             }else {
                a = uoa.b;
                if (a != null) {
                   userProfileR = a.a();
                   if (userProfileR != null) {
                      mUserProfile = userProfileR.mUserProfile;
                      if (mUserProfile != null) {
                         mProfile = mUserProfile.mProfile;
                         if (mProfile != null) {
                            mId = mProfile.mId;
                         label_013c :
                            if (a.g(mId, id)) {
                               mUserProfile = userProfileR.mUserProfile;
                               if (mUserProfile != null) {
                                  mProfile = mUserProfile.mProfile;
                                  if (mProfile != null) {
                                     mId = mProfile.mProfilePageInfo;
                                     if (mId != null) {
                                        mUserType = mId.mUserType;
                                     label_0152 :
                                        if (!uoa.a(mUserType)) {
                                           a1 = uoa.b;
                                           l1 = (a1 != null)? a1.d(): l;
                                           userProfileR.mCacheTime = l1;
                                           mUserProfile = userProfileR.mUserProfile;
                                           uoa1 = uoa.b;
                                           if (uoa1 != null) {
                                              l = uoa1.d();
                                           }
                                           mUserProfile.mCacheTime = l;
                                           obj = t.just(userProfileR).doOnNext(new v(userProfileR, uoa, id));
                                           a.o(obj, "Observable.just\(this\).do¡­e:$mCacheTime\"\)\n        }");
                                        }
                                     }
                                  }
                               }
                               mUserType = 0;
                               goto label_0152 ;
                            }
                         }
                      }
                      View view1 = view;
                      goto label_013c ;
                   }
                }
                obj = t.empty();
                a.o(obj, "Observable.empty\(\)");
             }
          }
          ot = t.merge(obj, this.c(this.g).map(new e()));
       }else {
          ot = this.c(this.g).map(new e());
       }
       if (activity != null) {
          int i = (d3.a(this.c))? 0x7f0a094e: 0x7f0a0fe6;
          view = activity.findViewById(i);
       }
       this.h = ot.doAfterNext(new e0(this)).doOnSubscribe(new d0(this)).subscribe(new f0(this, view), new g0(this, view));
       return;
    }
}
