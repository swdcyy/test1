package com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveQualityPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.slideplay.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig;
import java.lang.reflect.Type;
import wg3.a;
import oe6.e;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import q91.a;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import kp.r1;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import com.google.gson.JsonObject;
import android.app.Activity;
import com.yxcorp.utility.n;
import d61.y;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import d61.g;
import zb6.a;
import java.lang.System;
import com.kuaishou.live.core.show.statistics.LivePlayLogger$ElementPackageFollowIndex;
import java.lang.Enum;
import wca.n;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$LiveStreamDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import d61.h0;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveSharePackage;

public class LivePlayLogger extends SlidePlayLogger	// class@001093
{
    public String mFollowTaskSessionId;
    public int mIndexInAdapter;
    public long mStartTime;

    public void LivePlayLogger(){
       super();
       this.mFollowTaskSessionId = "";
    }
    public static void a(StringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LivePlayLogger.class, "37")) {
          return;
       }
       if (p0.length() > 0) {
          p0+",";
       }
       return;
    }
    public static ClientContent$ProfilePackage b(String p0){
       ClientContent$ProfilePackage obj = PatchProxy.applyOneRefs(p0, null, LivePlayLogger.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ProfilePackage();
       obj.visitedUid = p0;
       return obj;
    }
    public static ClientContentWrapper$LiveQualityPackage c(String[] p0,String p1,String p2){
       ClientContentWrapper$LiveQualityPackage obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LivePlayLogger.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContentWrapper$LiveQualityPackage();
       if (p0 != null && p0.length) {
          obj.availableQuality = p0;
       }
       if (!TextUtils.x(p1)) {
          obj.currentQuality = p1;
       }
       if (!TextUtils.x(p2)) {
          obj.previousQuality = p2;
       }
       return obj;
    }
    public static ClientContent$ScreenPackage createScreenPackage(boolean p0){
       ClientContent$ScreenPackage obj;
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, LivePlayLogger.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$ScreenPackage();
       int i = (p0)? 2: 1;
       obj.orientation = i;
       return obj;
    }
    public static ClientEvent$ElementPackage generateElementPackage(int p0,boolean p1){
       ClientEvent$ElementPackage obj;
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), null, LivePlayLogger.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       String str = (p1)? "0": "1";
       obj.name = str;
       obj.action = p0;
       obj.action2 = "";
       return obj;
    }
    public static void logFloatingWindowTaskEventOnRightSwipe(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), null, LivePlayLogger.class, "36")) {
          return;
       }
       StringBuilder str = "";
       if (p1) {
          str = str+"isBuffering";
       }
       if (c.l()) {
          LivePlayLogger.a(str);
          str = str+"isSlidePlay";
       }
       if (!QCurrentUser.me().isLogined()) {
          LivePlayLogger.a(str);
          str = str+"logOut";
       }
       LiveConfigStartupResponse$LiveFloatingWindowConfig liveFloating = a.p(LiveConfigStartupResponse$LiveFloatingWindowConfig.class);
       if (liveFloating != null && liveFloating.mDisableLiveFloatingWindow != null) {
          LivePlayLogger.a(str);
          str = str+"disabledByServer";
       }
       if (!p0) {
          LivePlayLogger.a(str);
          str = str+"notPlaying";
       }
       if (!p2) {
          LivePlayLogger.a(str);
          str = str+"firstScreenNotShown";
       }
       if (!e.s()) {
          LivePlayLogger.a(str);
          str = str+"disabledByUserSwitch";
       }
       if (LivePlayActivity.N > 1) {
          LivePlayLogger.a(str);
          str = str+"notFirstLivePlay";
       }
       if (!i9.a(a.a().a())) {
          LivePlayLogger.a(str);
          str = str+"permissionNotGranted";
       }
       String str1 = str;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.message = str1;
       int i = (TextUtils.x(str1))? 7: 8;
       h$b uob = h$b.d(i, 1577);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public static void logLiveFollowButtonClickEvent(e0 p0,ClientContent$LiveStreamPackage p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LivePlayLogger.class, "43")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_AUTHOR_FOLLOW_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("position", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.L("", p0, 6, uElementPack, uContentPack);
       return;
    }
    public static void logLiveFollowButtonShowEvent(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LivePlayLogger.class, "42")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_AUTHOR_FOLLOW_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.C0("", p0, 6, uElementPack, uContentPack);
       return;
    }
    public static void logResolutionToastShow(LiveStreamFeedWrapper p0,int p1){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, LivePlayLogger.class, "40")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "SHOW_RESOLUTION_TOAST";
       uElementPack.action = 930;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.b(p0, p1);
       u1.u0(0, uElementPack, uContentPack);
       return;
    }
    public static void logWithDelay(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LivePlayLogger.class, "41")) {
          return;
       }
       k1.r(p0, 100);
       return;
    }
    public static void onFloatOrientationClick(boolean p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, LivePlayLogger.class, "38")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       String str = (p0)? "ENTER_FULL_SCREEN_FLOAT_SWITCH": "EXIT_FULL_SCREEN_FLOAT_SWITCH";
       uElementPack.action2 = str;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void onPlayPhoto(BaseFeed p0,String p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, LivePlayLogger.class, "32")) {
             return;
          }
       }
       ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
       profilePacka.visitedUid = p1;
       profilePacka.style = 1;
       profilePacka.tab = e.N();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.g(p0, (p2 + 1));
       uContentPack.profilePackage = profilePacka;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "live_profile_photo_click";
       uElementPack.action = p3;
       i3 oi3 = i3.f();
       oi3.c("profile_source", Integer.valueOf(p4));
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void onQualityBottomItemClickEvent(String[] p0,String p1,String p2,boolean p3,ClientContent$LiveStreamPackage p4){
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, LivePlayLogger.class, "17")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 934;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.screenPackage = LivePlayLogger.createScreenPackage(p3);
       uContentPack.liveStreamPackage = p4;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveQualityPackage = LivePlayLogger.c(p0, p2, p1);
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void onQualityBottomItemShowEvent(String[] p0,String p1,boolean p2,ClientContent$LiveStreamPackage p3){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, LivePlayLogger.class, "16")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 1385;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.screenPackage = LivePlayLogger.createScreenPackage(p2);
       uContentPack.liveStreamPackage = p3;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveQualityPackage = LivePlayLogger.c(p0, p1, null);
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page = 13;
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.contentPackage = uContentPack;
       showEvent.type = 9;
       showEvent.elementPackage = uElementPack;
       u1.A0(urlPackage, showEvent, uContentWrap);
       return;
    }
    public static void onShowPhotoInPopupWindow(BaseFeed p0,String p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, LivePlayLogger.class, "33")) {
             return;
          }
       }
       ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
       profilePacka.visitedUid = p1;
       profilePacka.style = p3;
       profilePacka.tab = e.N();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.g(p0, (p2 + 1));
       uContentPack.profilePackage = profilePacka;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "show_photo_in_popup_window";
       uElementPack.action = p4;
       i3 oi3 = i3.f();
       oi3.c("profile_source", Integer.valueOf(p5));
       uElementPack.params = oi3.e();
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.contentPackage = uContentPack;
       showEvent.elementPackage = uElementPack;
       u1.g0(showEvent);
       return;
    }
    public ClientEvent$ExpTagTrans buildExpTagTrans(QLivePlayConfig p0){
       ClientEvent$ExpTagTrans obj = PatchProxy.applyOneRefs(p0, this, LivePlayLogger.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new ClientEvent$ExpTagTrans();
       obj.serverExpTag = TextUtils.I(p0.mServerExpTag);
       obj.clientExpTag = TextUtils.I(this.mClientExpTag);
       return obj;
    }
    public final ClientContent$ContentPackage d(LiveStreamFeedWrapper p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LivePlayLogger.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = (p0 != null)? w1.g(p0.mEntity, 0): new ClientContent$PhotoPackage();
       photoPackage.type = 2;
       obj.photoPackage = photoPackage;
       return obj;
    }
    public int getIndexInAdapter(){
       return this.mIndexInAdapter;
    }
    public boolean isLiveStream(){
       return true;
    }
    public void onButtonClicked(BaseFeed p0,String p1,int p2,int p3,int p4,int p5,String p6,CommonParams p7){
       String str;
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6,p7};
          if (PatchProxy.applyVoid(objArray, this, LivePlayLogger.class, "34")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p1;
       uElementPack.type = p2;
       uElementPack.status = 0;
       uElementPack.action = p5;
       if (p4 == 1) {
          str = "up";
       }else if(p4 == 2){
          str = "down";
       }else {
          str = "";
       }
       i3 oi3 = i3.f();
       oi3.d("swipe_gestures", str);
       uElementPack.params = oi3.e();
       LiveStreamFeedWrapper liveStreamFe = null;
       if (p0 instanceof LiveStreamFeed) {
          liveStreamFe = new LiveStreamFeedWrapper(p0);
       }
       ClientContent$ContentPackage uContentPack = this.d(liveStreamFe);
       ClientContent$ContentPackage photoPackage = uContentPack.photoPackage;
       if (photoPackage != null && p0 != null) {
          photoPackage.index = (long)(r1.y1(p0) + 1);
       }
       u1.x(p3, "", p4, uElementPack, uContentPack);
       return;
    }
    public void onCancelAtMoreDialog(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "28")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 2;
       uElementPack.name = "cancel_at_more_dialog";
       uElementPack.action = 881;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onClickAuthorHead(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayLogger.class, "21")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "click_author_head";
       uElementPack.action = 518;
       uElementPack.index = 1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.b(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p0.getUserId());
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onClickAvatarAtLiveTips(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "25")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "click_avatar_at_live_tips";
       uElementPack.action = 810;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onClickLiveComment(e0 p0,View p1,ClientContent$LiveStreamPackage p2,boolean p3,boolean p4,boolean p5,ClientContentWrapper$LiveVoicePartyPackage p6){
       int i = 2;
       int i1 = 1;
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, LivePlayLogger.class, "22")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 8;
       uElementPack.name = "click_live_comment";
       uElementPack.action = 20;
       JsonObject jsonObject = new JsonObject();
       Activity uActivity = (p1 != null)? n.d(p1): null;
       String str = (y.d(uActivity))? "horizontal": "vertical";
       jsonObject.c0("screen_mode", str);
       if (p3) {
          i = 1;
       }
       jsonObject.a0("has_gzone_emotion", Integer.valueOf(i));
       str = (p4)? "CAROUSEL": "FIXED";
       jsonObject.c0("type", str);
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       uContentPack.screenPackage = LivePlayLogger.createScreenPackage(p5);
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       if (p6 != null) {
          uContentWrap.liveVoicePartyPackage = p6;
       }
       u1.M("", p0, 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public void onClickMoreAtLiveTips(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "26")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       uElementPack.name = "click_more_at_live_tips";
       uElementPack.action = 837;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onCommentRequestFail(Throwable p0,LiveStreamFeedWrapper p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "15")) {
          return;
       }
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.domain = 3;
       resultPackag.message = TextUtils.k(g.e(p0));
       resultPackag.code = a.b(p0);
       h$b uob = h$b.d(8, 20);
       uob.h(this.d(p1));
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void onCommentRequestSuccess(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayLogger.class, "13")) {
          return;
       }
       h$b uob = h$b.d(7, 20);
       uob.h(this.d(p0));
       u1.r0(uob);
       return;
    }
    public void onCreateViewStart(){
       if (PatchProxy.applyVoid(null, this, LivePlayLogger.class, "1")) {
          return;
       }
       this.mStartTime = System.currentTimeMillis();
       return;
    }
    public ClientContent$ContentPackage onEnterLivePage(LiveStreamFeedWrapper p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LivePlayLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = a.b(p0, this.mIndexInAdapter);
       return obj;
    }
    public ClientContent$ContentPackage onExitLivePage(LiveStreamFeedWrapper p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LivePlayLogger.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = a.b(p0, this.mIndexInAdapter);
       return obj;
    }
    public void onFeedbackLiveNegativeAtMoreDialog(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "29")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 2;
       uElementPack.name = "feedback_live_negative_at_more_dialog";
       uElementPack.action = 513;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onFloatFullScreenButtonShow(boolean p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LivePlayLogger.class, "39")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       String str = (p0)? "ENTER_FULL_SCREEN_FLOAT_SWITCH": "EXIT_FULL_SCREEN_FLOAT_SWITCH";
       uElementPack.action2 = str;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
    public void onFloatFullScreenShow(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayLogger.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "SHOW_NONRESIDENT_FULLSCREEN_BUTTON";
       uElementPack.action = 931;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.b(p0, this.mIndexInAdapter);
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
    public void onFollowAtLiveTips(e0 p0,BaseFeed p1,String p2,int p3){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, LivePlayLogger.class, "23")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       uElementPack.name = "follow_at_live_tips";
       uElementPack.action = 31;
       uElementPack.index = LivePlayLogger$ElementPackageFollowIndex.FOLLOW_LIVEPLAY_PROFILE.ordinal();
       i3 oi3 = i3.f();
       oi3.c("follow_source", Integer.valueOf(p3));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p1, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p2);
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public void onFollowStateUpdate(n p0,LiveStreamFeedWrapper p1){
       h$b uob;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "6")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientTaskDetail$LiveStreamDetailPackage liveStreamDe = new ClientTaskDetail$LiveStreamDetailPackage();
       liveStreamDe.completed = true;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = h0.a(p0.b);
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.liveStreamDetailPackage = liveStreamDe;
       uContentPack.userPackage = userPackage;
       uContentPack.photoPackage = a.b(p1, this.mIndexInAdapter);
       int i = 31;
       if (p0.e != null) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.domain = 3;
          resultPackag.message = a.i(p0.e);
          if (p0.c == null) {
             i = 32;
          }
          uob = h$b.d(8, i);
          uob.t(5);
          uob.h(uContentPack);
          uob.r(this.mFollowTaskSessionId);
          uob.s(taskDetailPa);
          uob.q(resultPackag);
          u1.r0(uob);
       }else {
          int i1 = 7;
          if (p0.c == null) {
             i = 32;
          }
          uob = h$b.d(i1, i);
          uob.t(5);
          uob.h(uContentPack);
          uob.r(this.mFollowTaskSessionId);
          uob.s(taskDetailPa);
          u1.r0(uob);
       }
       return;
    }
    public void onInformAtMoreDialog(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "27")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 2;
       uElementPack.name = "inform_at_more_dialog";
       uElementPack.action = 807;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onLiveAlreadyStop(){
       if (PatchProxy.applyVoid(null, this, LivePlayLogger.class, "11")) {
          return;
       }
       u1.r0(h$b.d(10, 13));
       return;
    }
    public void onLiveStreamIdUpdate(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "12")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       liveStreamPa.identity = TextUtils.k(p0);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       h$b uob = h$b.d(7, 14);
       uob.r(p1);
       uob.h(uContentPack);
       uob.t(1);
       u1.r0(uob);
       return;
    }
    public void onPullToBlacklist(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "30")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 2;
       uElementPack.name = "pull_to_blacklist_at_more_dialog";
       uElementPack.action = 808;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onRedPacketFollowClick(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayLogger.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 31;
       uElementPack.index = LivePlayLogger$ElementPackageFollowIndex.FOLLOW_LIVEPLAY_REDPACKET.ordinal();
       uElementPack.name = "follow_btn";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = h0.a(p0.getUserId());
       uContentPack.photoPackage = a.b(p0, this.mIndexInAdapter);
       uContentPack.userPackage = userPackage;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onResidentFullScreenButtonClick(LiveStreamFeedWrapper p0,boolean p1,String p2){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LivePlayLogger.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "ENTER_FULLSCREEN_BY_RESIDENT_BUTTON";
       uElementPack.action = 932;
       i3 oi3 = i3.f();
       oi3.a("isInMultiWindowMode", Boolean.valueOf(p1));
       oi3.d("liveStreamId", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.b(p0, this.mIndexInAdapter);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onResolutionSelectorCLick(LiveStreamFeedWrapper p0,ClientContent$LiveStreamPackage p1,boolean p2){
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LivePlayLogger.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "EXPAND_RESOLUTION_SWITCH_DIALOG";
       uElementPack.action = 933;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.b(p0, this.mIndexInAdapter);
       uContentPack.liveStreamPackage = p1;
       uContentPack.screenPackage = LivePlayLogger.createScreenPackage(p2);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void onShareLive(e0 p0,ClientContent$LiveStreamPackage p1,JsonObject p2,ClientContent$RedPackPackage p3,ClientContentWrapper$LiveVoicePartyPackage p4,ClientContent$LiveSharePackage p5){
       if (PatchProxy.isSupport(LivePlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, LivePlayLogger.class, "31")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "share_live";
       uElementPack.action = 514;
       uElementPack.params = p2.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       if (p3 != null) {
          uContentPack.redPackage = p3;
       }
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       if (p4 != null) {
          uContentWrap.liveVoicePartyPackage = p4;
       }
       if (p5 != null) {
          uContentPack.liveSharePackage = p5;
       }
       u1.M("", p0, 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public void onSwitchOrientation(boolean p0,LiveStreamFeedWrapper p1,boolean p2){
       h$b uob;
       if (PatchProxy.isSupport(LivePlayLogger.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), this, LivePlayLogger.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "switch_orientation";
       uElementPack.action = (p2)? 515: 516;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.b(p1, this.mIndexInAdapter);
       u1.u(1, uElementPack, uContentPack);
       uContentPack = new ClientContent$ContentPackage();
       ClientContent$ScreenPackage screenPackag = new ClientContent$ScreenPackage();
       if (p0) {
          screenPackag.orientation = 2;
          uContentPack.screenPackage = screenPackag;
          uob = h$b.d(7, 22);
          uob.h(uContentPack);
          u1.r0(uob);
       }else {
          screenPackag.orientation = 1;
          uContentPack.screenPackage = screenPackag;
          uob = h$b.d(7, 22);
          uob.h(uContentPack);
          u1.r0(uob);
       }
       return;
    }
    public void onUnFollowAtLiveTips(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayLogger.class, "24")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       uElementPack.name = "unfollow_at_live_tips";
       uElementPack.action = 32;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.c(p0, this.mIndexInAdapter);
       uContentPack.profilePackage = LivePlayLogger.b(p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void setIndexInAdapter(int p0){
       this.mIndexInAdapter = p0;
    }
    public void setLeaveAction(int p0){
    }
}
