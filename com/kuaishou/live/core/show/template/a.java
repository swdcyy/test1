package com.kuaishou.live.core.show.template.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.template.a$a;
import com.kuaishou.live.core.show.template.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.activitty.LiveActivityEnterRoomData;
import com.kuaishou.live.core.show.template.a$c;
import gr5.a;
import kr5.a;
import zq5.b;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.noble.LiveAdvancedEnterRoomData;
import com.kuaishou.live.core.show.template.a$d;
import dr5.a;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import hl2.a;
import lf3.g;
import com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import java.util.List;
import java.util.Collections;
import hl2.b;
import qy1.a;
import msd.l;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ActivityEnterRoomHint;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import ff2.a;
import ff2.a$a;
import com.kuaishou.live.common.core.basic.tools.l;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import k72.a;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import java.lang.StringBuilder;
import jr5.a;
import b61.b;
import jr5.a$a;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenMountData;
import va1.n0;
import yz7.n;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenDataWithMount;
import h72.b;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.activitty.LiveFloatingScreenActivityMagicFaceEnterRoomData;
import va1.l0;
import s00.b$a;
import s00.b;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.io.IOException;
import h72.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo;
import ekd.j;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenBackgroundData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import java.util.ArrayList;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import d61.f0;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenEffectData;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueActivityConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueActivityConfig$LiveEnterRoomConfig;
import com.kuaishou.livestream.message.nano.LiveActivityEnterRoomTip;
import nq5.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import lnc.e0;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$StretchablePicture;
import com.kuaishou.live.core.show.template.c;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import t02.r1;
import lp3.i;
import lp3.c;
import eg1.e;
import dg1.a;

public class a extends PresenterV2 implements g	// class@00117e
{
    public m p;
    public a0 q;
    public r1 r;
    public b s;
    public i t;
    public a u;
    public e v;
    public a w;
    public final a x;
    public a$e y;
    public static String sLivePresenterClassName = "LiveActivityEnterRoomEffectPresenter";

    public void a(){
       super();
       this.s = null;
       this.x = new a$a(this);
       this.y = new a$b(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          ts.v9(3, LiveActivityEnterRoomData.class, objArray, new a$c(this));
          this.s.v9(6, LiveAdvancedEnterRoomData.class, objArray, new a$d(this));
          this.s.ef(13, this.x);
       }
       this.p.u().u0(510, SCActionSignal.class, new a(this));
       if (!PatchProxy.applyVoid(objArray, this, uoa, "13")) {
          TurboModeViewHandler turboModeVie = new TurboModeViewHandler(this, this.u, OptimizedElement.WEALTH_GRADE_ENTER_ROOM_EFFECT, Collections.emptyList(), new b(this));
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, a.class, "3");
    }
    public void P8(LiveUserStatusResponse$ActivityEnterRoomHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       b.S(LiveLogTag.LIVE_ENTER_ROOM_EFFECT.appendTag("LiveActivityEnterRoomEffectPresenter"), "activityMagicFaceEnterRoomBackByMock", "activityEnterRoomHint", p0.toString());
       p0.mDisplayType = 2;
       this.R8(p0, 100);
       return;
    }
    public void R8(LiveUserStatusResponse$ActivityEnterRoomHint p0,int p1){
       boolean b;
       a ts;
       LiveUserStatusResponse$ActivityEnterRoomHint mUserInfo;
       LiveFloatingScreenImageItem liveFloating1;
       LiveFloatingScreenTextItem liveFloating2;
       LiveFloatingScreenMountData liveFloating3;
       boolean b1;
       LiveCommonEffectInfo liveCommonEf;
       LiveLogTag lIVE_ENTER_R1;
       LiveLogTag liveLogTag;
       LiveActivityEnterRoomData liveActivity;
       LiveFloatingScreenBackgroundData liveFloating4;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "9")) {
          return;
       }
       LiveLogTag lIVE_ENTER_R = LiveLogTag.LIVE_ENTER_ROOM_EFFECT;
       String str = "LiveActivityEnterRoomEffectPresenter";
       lIVE_ENTER_R.appendTag(str);
       b.T(lIVE_ENTER_R, "scheduleEnterRoomEffectTask", "activityEnterRoomHint", p0.toString(), "priority", Integer.valueOf(p1));
       a$a obj = PatchProxy.applyOneRefs(p0, this, uoa, "11");
       int i = 3;
       int i1 = 0;
       int i2 = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0.mDisplayType == i && !TextUtils.isEmpty(p0.mNobleAnimationKey)){
          obj = a.a;
          if (l.h(obj.a(p0.mNobleAnimationKey)) && (!TextUtils.isEmpty(p0.mWelcomeAnimationKey) && (l.h(obj.b(p0.mWelcomeAnimationKey)) && !b.a(-404437045).g()))) {
             b = true;
          }
       }
    label_0081 :
       b = false;
       int i3 = 2;
       String str1 = "2";
       LiveFloatingScreenMountData liveFloating = null;
       if (b) {
          LiveAdvancedEnterRoomData liveAdvanced = PatchProxy.applyOneRefs(p0, liveFloating, a.class, str1);
          if (liveAdvanced != patchProxyRe) {
          }else {
             liveAdvanced = new LiveAdvancedEnterRoomData();
             mUserInfo = p0.mUserInfo;
             liveAdvanced.setUserInfo(mUserInfo);
             liveAdvanced.setBizType(6);
             liveAdvanced.setRunwayType(i3);
             liveAdvanced.setDisplayDuration(p0.mAnimationIntervalMs);
             liveFloating1 = new LiveFloatingScreenImageItem();
             liveFloating1.setPicType(i1);
             liveFloating1.setPicUrls(mUserInfo.mHeadUrls);
             liveFloating1.setPicHeight(p0.mNobleEnterRoomAvatarSize);
             liveFloating1.setPicWidth(p0.mNobleEnterRoomAvatarSize);
             liveAdvanced.setAvatarImageItem(liveFloating1);
             liveFloating1 = new LiveFloatingScreenImageItem();
             liveFloating1.setPicType(i2);
             liveFloating1.setPicUrls(p0.mAvatarDynamicRingUrls);
             liveFloating1.setBackupPicUrl(p0.mAvatarStaticRingUrls);
             liveFloating1.setPicHeight(p0.mNobleEnterRoomAvatarRingSize);
             liveFloating1.setPicWidth(p0.mNobleEnterRoomAvatarRingSize);
             liveAdvanced.setAvatarRingImageItem(liveFloating1);
             liveFloating1 = new LiveFloatingScreenImageItem();
             liveFloating1.setPicType(i2);
             liveFloating1.setPicPreLoadType(45);
             liveFloating1.setPicPreloadKey(p0.mWelcomeAnimationKey);
             liveAdvanced.setWelcomeImageItem(liveFloating1);
             liveFloating2 = new LiveFloatingScreenTextItem();
             liveFloating2.setText(a.b.c(b.c(mUserInfo), 5)+p0.mDisplayText);
             liveAdvanced.setWelcomeTextItem(liveFloating2);
             liveFloating3 = new LiveFloatingScreenMountData();
             liveFloating3.setMountHeight(n.g((float)(int)(((float)n0.f() / 375.00f) * (float)p0.mNobleEnterRoomMountHeight)));
             liveFloating3.setMountType(i3);
             liveFloating3.setMountResKey(p0.mNobleAnimationKey);
             liveFloating3.setMountResType(44);
             liveAdvanced.setMountData(liveFloating3);
          }
          ts = this.s;
          if (ts != null) {
             ts.Gi(liveAdvanced);
          }
       }else {
          String obj1 = PatchProxy.applyOneRefs(p0, this, uoa, "12");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(p0.mDisplayType == 5 && !TextUtils.isEmpty(p0.mCommonEffectInfo)){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             lIVE_ENTER_R.appendTag(str);
             b.P(lIVE_ENTER_R, "scheduleEnterRoomEffectTask showMagicFaceEnterRoomEffect");
             mUserInfo = p0.mCommonEffectInfo;
             if (PatchProxy.isSupport(b.class)) {
                byte[] obj2 = PatchProxy.applyThreeRefs(p0, mUserInfo, Integer.valueOf(p1), null, b.class, "2");
                if (obj2 != patchProxyRe) {
                   liveFloating = obj2;
                }else {
                label_019c :
                   obj2 = PatchProxy.applyOneRefs(mUserInfo, liveFloating, l0.class, "20");
                   if (obj2 != patchProxyRe) {
                   }else {
                      try{
                         obj2 = b.a().a(mUserInfo);
                      }catch(java.lang.Exception e0){
                         obj2 = liveFloating;
                      }
                   }
                }
             }else {
                goto label_019c ;
             }
             if (liveFloating == null) {
                b.P(LiveLogTag.LIVE_ENTER_ROOM_EFFECT.appendTag(str), "scheduleEnterRoomEffectTask showMagicFaceEnterRoomEffect: enterRoomData is null");
                this.P8(p0);
                return;
             }else {
                ts = this.s;
                if (ts != null) {
                   ts.Gi(liveFloating);
                }
             }
          }else if(this.s != null){
             a uoa1 = a.class;
             if (PatchProxy.isSupport(uoa1)) {
                liveActivity = PatchProxy.applyTwoRefs(p0, Integer.valueOf(i), liveFloating, uoa1, str1);
                if (liveActivity != patchProxyRe) {
                label_0394 :
                   this.s.Gi(liveActivity);
                }
             }
             liveActivity = new LiveActivityEnterRoomData();
             liveActivity.setBizType(i);
             liveActivity.setRunwayType(i2);
             liveActivity.setActivityType(p0.mActivityType);
             liveActivity.setDisplayType(p0.mDisplayType);
             liveActivity.setPriority(999);
             mUserInfo = p0.mBackgroundPicInfo;
             if (mUserInfo != null && !j.h(mUserInfo.mPicUrls)) {
                liveFloating4 = new LiveFloatingScreenBackgroundData();
                liveFloating4.setBackgroundType(i2);
                liveFloating4.setBackgroundStretchablePic(p0.mBackgroundPicInfo);
             }else if(!j.h(p0.mBackgroundColors)){
                liveFloating4 = new LiveFloatingScreenBackgroundData();
                liveFloating4.setBackgroundType(i3);
                liveFloating4.setBackgroundGradientColor(p0.mBackgroundColors);
             }else {
                liveFloating4 = liveFloating;
             }
             liveActivity.setBackgroundData(liveFloating4);
             ArrayList uArrayList = new ArrayList();
             if (!j.h(p0.mBadgePic)) {
                liveFloating1 = new LiveFloatingScreenImageItem();
                liveFloating1.setItemType(i2);
                liveFloating1.setPicType(i1);
                liveFloating1.setPicUrls(p0.mBadgePic);
                liveFloating1.setPicWidth(p0.mBadgePicWidth);
                liveFloating1.setPicHeight(p0.mBadgePicHeight);
                uArrayList.add(liveFloating1);
             }
             if (!j.h(p0.mPicUrl)) {
                liveFloating1 = new LiveFloatingScreenImageItem();
                liveFloating1.setItemType(i2);
                liveFloating1.setPicType(i1);
                liveFloating1.setPicUrls(p0.mPicUrl);
                liveFloating1.setPicWidth(p0.mPicWidth);
                liveFloating1.setPicHeight(p0.mPicHeight);
                uArrayList.add(liveFloating1);
             }
             liveFloating2 = new LiveFloatingScreenTextItem();
             liveFloating2.setItemType(i);
             liveFloating2.setText(f0.d(b.c(p0.mUserInfo), 5));
             liveFloating2.setTextColorStr(p0.mTextColor);
             int i4 = 14;
             liveFloating2.setTextSize(i4);
             uArrayList.add(liveFloating2);
             liveActivity.setUserInfo(p0.mUserInfo);
             liveFloating2 = new LiveFloatingScreenTextItem();
             liveFloating2.setItemType(i);
             liveFloating2.setText(p0.mDisplayText);
             liveFloating2.setTextColorStr(p0.mTextColor);
             liveFloating2.setTextSize(i4);
             uArrayList.add(liveFloating2);
             liveActivity.setContentItems(uArrayList);
             mUserInfo = p0.mDisplayType;
             int i5 = 4;
             if (mUserInfo == i3 || mUserInfo == i5) {
                LiveFloatingScreenEffectData liveFloating5 = new LiveFloatingScreenEffectData();
                liveFloating5.setEffectTypeBits(i2);
                liveFloating5.setShimmerLocation(i3);
                liveFloating5.setShimmerResType(i3);
                int[] ointArray = new int[5];
                ointArray[i1] = i1;
                ointArray[i2] = a.a;
                ointArray[i3] = a.b;
                ointArray[i] = a.c;
                ointArray[i5] = i1;
                liveFloating5.setShimmerGradientIntColors(ointArray);
                liveFloating5.setShimmerGradientLocations(a.d);
                liveFloating5.setShimmerGradientAngle(0x41f00000);
                liveActivity.setEffectData(liveFloating5);
             }
             LiveConfigStartupResponse$LiveRevenueActivityConfig liveRevenueA = a.F(LiveConfigStartupResponse$LiveRevenueActivityConfig.class);
             if (liveRevenueA != null && (liveRevenueA.mLiveEnterRoomConfig.mDisableMountAnimation == null && (!TextUtils.isEmpty(p0.mMountKey) && p0.mAnimationIntervalMs - -1))) {
                i1 = 1;
             }
          label_0353 :
             if (i1) {
                if (p0.mDisplayType == i5) {
                   liveFloating3 = new LiveFloatingScreenMountData();
                   liveFloating3.setMountType(i2);
                   liveFloating3.setMountWidth(166);
                   liveFloating3.setMountHeight(166);
                }else {
                   liveFloating3 = new LiveFloatingScreenMountData();
                   liveFloating3.setMountType(i2);
                   liveFloating3.setMountWidth(120);
                   liveFloating3.setMountHeight(120);
                }
                liveFloating = liveFloating3;
                liveFloating.setMountDisplayType(p0.mDisplayType);
             }
             if (liveFloating != null) {
                liveFloating.setMountResKey(p0.mMountKey);
                liveFloating.setMountResType(34);
             }
             liveActivity.setMountData(liveFloating);
             liveActivity.setDisplayDuration(p0.mAnimationIntervalMs);
             goto label_0394 ;
          }
       }
    label_0399 :
       return;
    }
    public final void S8(LiveActivityEnterRoomTip p0){
       boolean b;
       LiveActivityEnterRoomData liveActivity;
       LiveFloatingScreenBackgroundData liveFloating5;
       LiveFloatingScreenImageItem liveFloating6;
       LiveFloatingScreenMountData liveFloating9;
       a$a a;
       long l;
       Object obj = this;
       String str = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(str, obj, uoa, "8")) {
          return;
       }
       LiveLogTag lIVE_ENTER_R = LiveLogTag.LIVE_ENTER_ROOM_EFFECT;
       String str1 = "LiveActivityEnterRoomEffectPresenter";
       lIVE_ENTER_R.appendTag(str1);
       b.S(lIVE_ENTER_R, "scheduleEnterRoomEffectTaskByMsg", "activityEnterRoomHint", str);
       LiveFloatingScreenMountData liveFloating = null;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(str, obj, uoa, "7")) {
          l = obj.v.of();
          int i1 = 0;
          LiveLogTag liveLogTag = ((2 & l) - i1 || (l & 8192) - i1)? 1: null;
          if (liveLogTag) {
             lIVE_ENTER_R.appendTag(str1);
             b.S(lIVE_ENTER_R, "processActivityEnterRoomTipMsg", "isAudienceEffectSwitchClosed", Boolean.TRUE);
             str.animationKey = liveFloating;
             str.animationKeyV2 = liveFloating;
             str.commonEffectInfo = liveFloating;
          }
       }
       LiveLogTag obj1 = PatchProxy.applyOneRefs(str, obj, uoa, "10");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(str.displayType == 3 && !TextUtils.isEmpty(str.animationKeyV2)){
          a = a.a;
          if (l.h(a.a(str.animationKeyV2)) && (!TextUtils.isEmpty(str.welcomeAnimationKey) && (l.h(a.b(str.welcomeAnimationKey)) && !b.a(-404437045).g()))) {
             b = true;
          }
       }
    label_00aa :
       b = false;
       String str2 = "1";
       if (b) {
          uoa = obj.s;
          if (uoa != null) {
             LiveAdvancedEnterRoomData liveAdvanced = PatchProxy.applyOneRefs(str, liveFloating, a.class, str2);
             if (liveAdvanced != patchProxyRe) {
             }else {
                liveAdvanced = new LiveAdvancedEnterRoomData();
                UserInfo userInfo = UserInfo.convertFromProto(str.user);
                liveAdvanced.setUserInfo(UserInfo.convertFromProto(str.user));
                liveAdvanced.setBizType(6);
                liveAdvanced.setRunwayType(2);
                liveAdvanced.setDisplayDuration(str.animationIntervalMillis);
                LiveFloatingScreenImageItem liveFloating1 = new LiveFloatingScreenImageItem();
                liveFloating1.setPicType(i);
                liveFloating1.setPicUrls(e0.i(str.user.headUrls));
                liveFloating1.setPicHeight(str.sizeOfHead);
                liveFloating1.setPicWidth(str.sizeOfHead);
                liveAdvanced.setAvatarImageItem(liveFloating1);
                LiveActivityEnterRoomTip userState = str.userState;
                if (userState != null && userState.livePrivilegeState != null) {
                   liveFloating1 = new LiveFloatingScreenImageItem();
                   liveFloating1.setPicType(1);
                   liveFloating1.setPicUrls(e0.i(str.userState.livePrivilegeState.avatarFrameAnimation));
                   liveFloating1.setBackupPicUrl(e0.i(str.userState.livePrivilegeState.avatarFrame));
                   liveFloating1.setPicHeight(str.sizeOfAvatar);
                   liveFloating1.setPicWidth(str.sizeOfAvatar);
                   liveAdvanced.setAvatarRingImageItem(liveFloating1);
                }
                liveFloating1 = new LiveFloatingScreenImageItem();
                liveFloating1.setPicType(1);
                liveFloating1.setPicPreLoadType(45);
                liveFloating1.setPicPreloadKey(str.welcomeAnimationKey);
                liveAdvanced.setWelcomeImageItem(liveFloating1);
                LiveFloatingScreenTextItem liveFloating2 = new LiveFloatingScreenTextItem();
                liveFloating2.setText(a.b.c(b.c(userInfo), 5)+str.displayText);
                liveAdvanced.setWelcomeTextItem(liveFloating2);
                LiveFloatingScreenMountData liveFloating3 = new LiveFloatingScreenMountData();
                liveFloating3.setMountHeight(n.g((float)(int)(((float)n0.f() / 375.00f) * (float)str.sizeOfCar)));
                liveFloating3.setMountType(2);
                liveFloating3.setMountResKey(str.animationKeyV2);
                liveFloating3.setMountResType(44);
                liveAdvanced.setMountData(liveFloating3);
             }
             uoa.Gi(liveAdvanced);
          }
       }else if(str.displayType == 5 && str.commonEffectInfo != null){
          obj1 = 1;
       }else {
          obj1 = null;
       }
       if (obj1) {
          lIVE_ENTER_R.appendTag(str1);
          b.P(lIVE_ENTER_R, "scheduleEnterRoomEffectTaskByMsg showMagicFaceEnterRoomEffect");
          LiveActivityEnterRoomTip commonEffect = str.commonEffectInfo;
          LiveFloatingScreenActivityMagicFaceEnterRoomData liveFloating4 = PatchProxy.applyTwoRefs(str, commonEffect, liveFloating, b.class, str2);
          if (liveFloating4 != patchProxyRe) {
          }else {
             liveFloating4 = new LiveFloatingScreenActivityMagicFaceEnterRoomData(str, commonEffect);
             liveFloating4.setBizType(13);
             liveFloating4.setPriority(910);
          }
          uoa = obj.s;
          if (uoa != null) {
             uoa.Gi(liveFloating4);
          }
       }else if(PatchProxy.isSupport(a.class)){
          liveActivity = PatchProxy.applyThreeRefs(p0, Integer.valueOf(3), Integer.valueOf(100), null, a.class, "1");
          if (liveActivity != patchProxyRe) {
          label_038c :
             a s = obj.s;
             if (s != null) {
                s.Gi(liveActivity);
             }
          }
       }
       liveActivity = new LiveActivityEnterRoomData();
       liveActivity.setBizType(3);
       liveActivity.setRunwayType(1);
       liveActivity.setActivityType(str.activityBiz);
       liveActivity.setDisplayType(str.displayType);
       liveActivity.setPriority(100);
       LiveActivityEnterRoomTip backgroundSt = str.backgroundStretchablePicUrl;
       if (backgroundSt != null && !j.h(backgroundSt.picUrl)) {
          liveFloating5 = new LiveFloatingScreenBackgroundData();
          liveFloating5.setBackgroundType(1);
          liveFloating5.setBackgroundStretchablePic(LiveEnterRoomEffectBackgroudPicInfo.convertFromProto(str.backgroundStretchablePicUrl));
       }else if(!j.h(str.backgroundColor)){
          liveFloating5 = new LiveFloatingScreenBackgroundData();
          liveFloating5.setBackgroundType(1);
          liveFloating5.setBackgroundGradientColor(str.backgroundColor);
       }else {
          liveFloating5 = liveFloating;
       }
       liveActivity.setBackgroundData(liveFloating5);
       ArrayList uArrayList = new ArrayList();
       if (!j.h(str.headPic)) {
          liveFloating6 = new LiveFloatingScreenImageItem();
          liveFloating6.setItemType(1);
          liveFloating6.setPicType(i);
          liveFloating6.setPicUrls(e0.i(str.headPic));
          liveFloating6.setPicWidth(str.headPicWidth);
          liveFloating6.setPicHeight(str.headPicHeight);
          uArrayList.add(liveFloating6);
       }
       if (!j.h(str.picUrl)) {
          liveFloating6 = new LiveFloatingScreenImageItem();
          liveFloating6.setItemType(1);
          liveFloating6.setPicType(i);
          liveFloating6.setPicUrls(e0.i(str.picUrl));
          liveFloating6.setPicWidth(str.picWidth);
          liveFloating6.setPicHeight(str.picHeight);
          uArrayList.add(liveFloating6);
       }
       LiveFloatingScreenTextItem liveFloating7 = new LiveFloatingScreenTextItem();
       liveFloating7.setItemType(3);
       liveFloating7.setText(f0.d(b.c(UserInfo.convertFromProto(str.user)), 5));
       liveFloating7.setTextColorStr(str.textColor);
       liveFloating7.setTextSize(14);
       uArrayList.add(liveFloating7);
       liveActivity.setUserInfo(UserInfo.convertFromProto(str.user));
       liveFloating7 = new LiveFloatingScreenTextItem();
       liveFloating7.setItemType(3);
       liveFloating7.setText(str.displayText);
       liveFloating7.setTextColorStr(str.textColor);
       liveFloating7.setTextSize(14);
       uArrayList.add(liveFloating7);
       liveActivity.setContentItems(uArrayList);
       LiveFloatingScreenEffectData liveFloating8 = new LiveFloatingScreenEffectData();
       liveFloating8.setEffectTypeBits(1);
       liveFloating8.setShimmerLocation(2);
       LiveActivityEnterRoomTip displayType = str.displayType;
       if (displayType == 2 || displayType == 4) {
          liveFloating8.setShimmerResType(2);
          int[] ointArray = new int[5];
          ointArray[i] = i;
          ointArray[1] = a.a;
          ointArray[2] = a.b;
          ointArray[3] = a.c;
          ointArray[4] = i;
          liveFloating8.setShimmerGradientIntColors(ointArray);
          liveFloating8.setShimmerGradientLocations(a.d);
          liveFloating8.setShimmerGradientAngle(0x41f00000);
       }
       liveActivity.setEffectData(liveFloating8);
       LiveConfigStartupResponse$LiveRevenueActivityConfig liveRevenueA = a.F(LiveConfigStartupResponse$LiveRevenueActivityConfig.class);
       if (liveRevenueA != null && (liveRevenueA.mLiveEnterRoomConfig.mDisableMountAnimation == null && (!TextUtils.isEmpty(str.animationKey) && str.animationIntervalMillis - -1))) {
          i = 1;
       }
    label_034b :
       if (i) {
          if (str.displayType == 4) {
             liveFloating9 = new LiveFloatingScreenMountData();
             liveFloating9.setMountType(1);
             liveFloating9.setMountWidth(166);
             liveFloating9.setMountHeight(166);
          }else {
             liveFloating9 = new LiveFloatingScreenMountData();
             liveFloating9.setMountType(1);
             liveFloating9.setMountWidth(120);
             liveFloating9.setMountHeight(120);
          }
          liveFloating = liveFloating9;
          liveFloating.setMountDisplayType(str.displayType);
       }
       if (liveFloating != null) {
          liveFloating.setMountResType(34);
          liveFloating.setMountResKey(str.animationKey);
       }
       liveActivity.setMountData(liveFloating);
       liveActivity.setDisplayDuration(str.animationIntervalMillis);
       goto label_038c ;
    label_0393 :
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new c());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(a0.class);
       this.r = this.s8(r1.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.t = oi;
       this.s = oi.c(b.class);
       this.u = this.t.c(a.class);
       this.v = this.t.a(e.class);
       this.w = this.t.a(a.class);
       return;
    }
}
