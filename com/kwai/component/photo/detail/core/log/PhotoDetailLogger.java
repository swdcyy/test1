package com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import androidx.collection.ArraySet;
import k2b.i3;
import java.util.HashMap;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import r1a.d;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import txa.c;
import com.yxcorp.gifshow.HomeActivity;
import k2b.k2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.robust.PatchProxyResult;
import wd5.t;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kuaishou.android.model.feed.SearchParams;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.y1;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kp.w1;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import wd5.u;
import wd5.v;
import android.os.SystemClock;
import wd5.b;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.r1;
import com.kuaishou.android.model.mix.w;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ChatPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import k2b.e0;
import com.kwai.framework.player.core.b;
import android.content.Intent;
import moc.b;
import androidx.fragment.app.Fragment;
import wd5.f;
import java.lang.IllegalStateException;
import wd5.m;
import xx6.e;
import yd5.a;
import xd5.c;
import wd5.j;
import xd5.a;
import wd5.r;
import kotlin.jvm.internal.a;
import yd5.h;
import xd5.b;
import yd5.b;
import yd5.i;
import yd5.c;
import yd5.g;
import org.greenrobot.eventbus.a;
import rd5.d;
import wd5.d;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.log.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import java.lang.Number;
import k2b.i3$a;
import wd5.o;
import java.util.List;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import java.lang.System;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import wd5.n;
import wd5.q;
import k2b.o3;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import mc6.w;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.CharSequence;
import wd5.i;

public class PhotoDetailLogger extends SlidePlayLogger	// class@000a26
{
    public QPhoto d;
    public boolean e;
    public final Map f;
    public String mBriefVideoQosJson;
    public long mBufferDuration;
    public i3 mBufferingTSS;
    public i3 mClickToFirstFrameTSS;
    public long mDuration;
    public long mFirstFrameTime;
    public boolean mHasDownloaded;
    public boolean mHasDownloadedAlreadySet;
    public String mPlayerEventSessionID;
    public long mPrepareDuration;
    public i3 mPrepareTSS;
    public final PhotoDetailLoggerFieldProvider mProvider;
    public long mRealFirstFrameDuration;
    public e mSessionStatisticsData;
    public ClientStat$VideoStatEvent mShareInVse;
    public ClientStat$VideoStatEvent mShareOutVse;
    public ClientStat$VideoStatEvent mSharedPendingVideoStatEvent;
    public long mStalledCount;
    public ClientEvent$UrlPackage mUrlPackage;
    public String mVideoQosJson;
    public t mVideoStatEventLogListener;
    public final Set mVideoStatEventUploadListeners;
    public static final boolean $assertionsDisabled = false;
    public static boolean g;
    public static int h = 0;
    public static final long serialVersionUID = 0xff787213421b6ec1;

    static {
       PhotoDetailLogger.h = 0;
    }
    public void PhotoDetailLogger(){
       super();
       this.mVideoStatEventUploadListeners = new ArraySet();
       this.mPrepareTSS = new i3();
       this.mBufferingTSS = new i3();
       this.mClickToFirstFrameTSS = new i3();
       this.f = new HashMap();
       PhotoDetailLoggerFieldProvider photoDetailL = new PhotoDetailLoggerFieldProvider();
       this.mProvider = photoDetailL;
       photoDetailL.setPhotoConsumePage("photo");
    }
    public static void buildPhotoConsumePage(Context p0,PhotoDetailLogger p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PhotoDetailLogger.class, "140")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "1") && p0 instanceof PhotoDetailActivity) {
          ClientEvent$UrlPackage urlPackage = u1.p();
          if (urlPackage != null) {
             urlPackage = urlPackage.page;
             if (urlPackage == 15) {
                p1.setPhotoConsumePage("nearby");
             }else if(urlPackage == 59 || urlPackage == 2){
                p1.setPhotoConsumePage("follow");
             }else if(urlPackage == 4 || urlPackage == 0x7602){
                p1.setPhotoConsumePage("profile");
             }
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "1") && p0 instanceof HomeActivity) {
          k2 ok2 = u1.j();
          if (ok2 != null && ok2.c == 2) {
             p1.setPhotoConsumePage("follow");
          }else {
             p1.setPhotoConsumePage("find");
          }
       }
       return;
    }
    public static PhotoDetailLogger createLoggerOnDetailCreate(BaseFragment p0,PhotoDetailParam p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PhotoDetailLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoDetailLogger.createLoggerOnDetailCreate(p0, p1, null);
    }
    public static PhotoDetailLogger createLoggerOnDetailCreate(BaseFragment p0,PhotoDetailParam p1,t p2){
       PhotoDetailLogger obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PhotoDetailLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDetailLogger();
       obj.mVideoStatEventLogListener = p2;
       PhotoDetailLogger.h = p1.getSource();
       if (p1.getDetailCommonParam().getOpendTimeStamp() > 0) {
          obj.mClickToFirstFrameTSS.q(p1.getDetailCommonParam().getOpendTimeStamp());
       }
       PhotoDetailLogger.e(obj, p0, p1);
       return obj;
    }
    public static PhotoDetailLogger createLoggerOnSlideBack(BaseFragment p0,PhotoDetailParam p1){
       PhotoDetailLogger obj = PatchProxy.applyTwoRefs(p0, p1, null, PhotoDetailLogger.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDetailLogger();
       PhotoDetailLogger.e(obj, p0, p1);
       return obj;
    }
    public static PhotoDetailLogger createLoggerWithOutPhotoDetailParam(boolean p0,int p1){
       PhotoDetailLogger obj;
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), null, PhotoDetailLogger.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PhotoDetailLogger();
       obj.mProvider.setSlidePlay(p0);
       obj.mProvider.setDetailBrowseType(p1);
       return obj;
    }
    public static void e(PhotoDetailLogger p0,BaseFragment p1,PhotoDetailParam p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, PhotoDetailLogger.class, "4")) {
          return;
       }
       if (p2 != null) {
          p0.setSearchParams(p2.getDetailLogParam().getSearchParams());
          p0.mProvider.getVideoStatUrlParamMap().putAll(p2.getDetailLogParam().getImmutableVideoStatUrlParamMap());
          Iterator iterator = p2.getDetailLogParam().getImmutableBizParams().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getKey() != null) {
                p0.putBizParam(uEntry.getKey(), TextUtils.k(uEntry.getValue()));
             }
          }
          p0.mProvider.setSlidePlay(p2.enableSlidePlay());
          p0.mProvider.setDetailBrowseType(p2.getDetailBrowseType());
       }
       return;
    }
    public static void logSameFrameBubbleShown(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PhotoDetailLogger.class, "161")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.showType = 7;
       showEvent.elementPackage = y1.a(p1, 1164, 17);
       showEvent.contentPackage = w1.h(p0.mEntity);
       u1.g0(showEvent);
       return;
    }
    public static void reportAtlas(int p0,long p1,long p2){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), null, PhotoDetailLogger.class, "141")) {
          return;
       }
       ClientContent$AtlasPackage uAtlasPackag = new ClientContent$AtlasPackage();
       uAtlasPackag.type = p0;
       uAtlasPackag.count = p1;
       uAtlasPackag.viewedCount = p2;
       u1.u(1, null, new ClientContent$ContentPackage());
       return;
    }
    public final ClientStat$VideoStatEvent a(QPhoto p0,ClientEvent$UrlPackage p1,boolean p2,boolean p3,boolean p4){
       ClientEvent$UrlPackage obj;
       int i = 4;
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, PhotoDetailLogger.class, "148");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
       if (this.mUrlPackage == null) {
          obj = new ClientEvent$UrlPackage();
          this.mUrlPackage = obj;
          obj.category = i;
          obj.page = 7;
          obj.topPage = TextUtils.k(b.a(0x4b316083).R0());
       }
       return this.c(p0, videoStatEve, this.mUrlPackage, p1, p2, p3, p4);
    }
    public PhotoDetailLogger addUrlParamKeyVal(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoDetailLogger.class, "132");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getVideoStatUrlParamMap().put(p0, p1);
       return this;
    }
    public void addVideoStatEventUploadListener(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "164")) {
          return;
       }
       this.mVideoStatEventUploadListeners.add(p0);
       return;
    }
    public void appendShareOutVSE(ClientStat$VideoStatEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "163")) {
          return;
       }
       if (this.mShareOutVse == null) {
          this.mShareOutVse = new ClientStat$VideoStatEvent();
       }
       v.a(this.mShareOutVse, p0);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "137")) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       this.mProvider.getPlayerActualPlayingTSS().h(l);
       this.mProvider.getCommentStayTTS().h(l);
       this.mProvider.getCommentEditorStayTTS().h(l);
       this.mProvider.getRecommendCommentPanelStayTTS().h(l);
       this.mProvider.getCommentMaximizeTTS().h(l);
       this.mProvider.getHiddenCommentStayTTS().h(l);
       this.mProvider.getPlayerOutOfSightByScrollTTS().h(l);
       this.mProvider.getPlayerPauseTSS().h(l);
       this.mProvider.getPageBackgroundTTS().h(l);
       this.mBufferingTSS.h(l);
       this.mPrepareTSS.h(l);
       this.mProvider.getLandScapeTss().h(l);
       this.mProvider.getCleanScreenPlayTss().g();
       this.mProvider.getBackgroundPlayTTS().h(l);
       this.mProvider.getAtlasCoverTTS().h(l);
       this.mProvider.getAtlasInnerDetailTTS().h(l);
       return;
    }
    public void bindDataSaver(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "169")) {
          return;
       }
       this.mProvider.bindDataSaver(p0);
       Object[] objArray = new Object[0];
       v.C().w("PhotoDetailLogger", "bindDataSaver, dataSaver = "+p0, objArray);
       return;
    }
    public ClientContent$ContentPackage buildContentPackage(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoDetailLogger obj = PatchProxy.apply(objArray, this, PhotoDetailLogger.class, "152");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PhotoDetailLogger.class, "153");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(obj == null){
          objArray = w1.f(obj.mEntity);
          objArray.fullScreenDisplay = this.mProvider.isSlidePlay();
          objArray.shareIdentify = obj.isShareToFollow();
          boolean b = false;
          boolean b1 = (r1.D3(obj.getEntity()) && w.P(obj.getEntity()))? true: false;
          objArray.supportLandscapeMode = b1;
          Activity uActivity = ActivityContext.g().e();
          if (uActivity != null) {
             if (uActivity.getResources().getConfiguration().orientation == 2) {
                b = true;
             }
             objArray.landscapeScreenDisplay = b;
          }
       }
       uContentPack.photoPackage = objArray;
       if (obj != null && obj.isShareToFollow()) {
          ShareToFollowModel shareToFollo = obj.getShareToFollowModel();
          if (shareToFollo != null) {
             ClientContent$ChatPackage uChatPackage = new ClientContent$ChatPackage();
             uChatPackage.sendUserId = shareToFollo.getSharerUserIds();
             uContentPack.chatPackage = uChatPackage;
          }
       }
       return uContentPack;
    }
    public ClientEvent$ExpTagTrans buildExpTagTrans(){
       Object[] objArray = null;
       PhotoDetailLogger obj = PatchProxy.apply(objArray, this, PhotoDetailLogger.class, "154");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          return objArray;
       }
       ClientEvent$ExpTagTrans uExpTagTrans = new ClientEvent$ExpTagTrans();
       uExpTagTrans.serverExpTag = TextUtils.I(obj.getServerExpTag());
       uExpTagTrans.clientExpTag = TextUtils.I(this.mClientExpTag);
       return uExpTagTrans;
    }
    public Intent buildIntentForSharePlayer(e0 p0,b p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, PhotoDetailLogger.class, "170");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       this.setPlayInfoToLog(this.d);
       Intent intent = new Intent();
       intent.putExtra("KEY_VIDEO_STATE_EVENT_ID", b.d(this.getVideoStatEventForActivityIntentShare(u1.r(p0))));
       intent.putExtra("KEY_SHARE_PHOTO_ID", this.d.getPhotoId());
       intent.putExtra("KEY_DETAIL_PAGE_PAUSE", this.getCurrentPageBackgroundDuration());
       intent.putExtra("KEY_DETAIL_FIRST_FRAME_TIME", this.mFirstFrameTime);
       return intent;
    }
    public PhotoDetailLogger buildPhotoConsumePage(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "139");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoDetailLogger.buildPhotoConsumePage(p0, this);
       return this;
    }
    public void buildUrlPackage(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "157")) {
          return;
       }
       PhotoDetailLogger td = this.d;
       if (p0 != null && td != null) {
          this.mUrlPackage = this.genUrlPackage(p0, td);
          f uof = this.d(p0);
          if (uof != null) {
             this.mProvider.setPageSessionId(uof.N8());
          }
       }
       return;
    }
    public final ClientStat$VideoStatEvent c(QPhoto p0,ClientStat$VideoStatEvent p1,ClientEvent$UrlPackage p2,ClientEvent$UrlPackage p3,boolean p4,boolean p5,boolean p6){
       PhotoDetailLogger obj;
       a uoa;
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, PhotoDetailLogger.class, "149");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.mSessionStatisticsData != null || !this.mProvider.isDataSaverBound()) {
          obj = this.mSessionStatisticsData;
          if (obj != null) {
             this.bindDataSaver(new m(obj));
          }
          obj = this.mSessionStatisticsData;
          if (obj != null) {
             uoa = new a(obj);
          }else {
             _monitor_enter(this);
             if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "138")) {
                _monitor_exit(this);
             }else if(p0 == null){
                _monitor_exit(this);
             }else {
                this.mBufferDuration = this.mBufferingTSS.k();
                this.mPrepareDuration = this.mPrepareTSS.k();
                _monitor_exit(this);
             }
             Object obj1 = PatchProxy.apply(null, this, PhotoDetailLogger.class, "171");
             if (obj1 != patchProxyRe) {
                uoa = obj1;
             }else {
                uoa = new j(this);
             }
          }
          if (p6) {
             this.prepareUrlPackage(p1, p2, p3);
          }
          if (p6) {
             uoa1 = r.a(p0, this.mProvider, uoa, p2);
          }else {
             PhotoDetailLogger tmProvider = this.mProvider;
             a.p(p0, "photo");
             a.p(tmProvider, "provider");
             a.p(uoa, "vsePlayInfoProvider");
             a uoa2 = new a();
             uoa2.a(new h(uoa, p0, tmProvider));
             uoa2.a(new b(tmProvider));
             uoa2.a(new i(p0));
             uoa2.a(new c(p0, tmProvider));
             uoa2.a(new g(p0, tmProvider));
             uoa1 = uoa2;
          }
          uoa1.b(p1);
          this.handleOtherVseInfo(p1, p4, p5);
          return p1;
       }else {
          throw new IllegalStateException("当前使用的组件播放器，但是SessionStatisticsData为空，请检查PlayerSessionDataReportCallback的回调是否有问题, photoId = "+p0.getPhotoId());
       }
    }
    public final f d(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "156");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof f) {
          return p0;
       }
       return this.d(p0.getParentFragment());
    }
    public PhotoDetailLogger endBuffering(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mBufferingTSS.g();
       return this;
    }
    public PhotoDetailLogger endFirstFrameTime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mClickToFirstFrameTSS.g();
       this.mFirstFrameTime = SystemClock.elapsedRealtime();
       a.d().k(new d());
       return this;
    }
    public PhotoDetailLogger endPrepare(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mPrepareTSS.g();
       return this;
    }
    public PhotoDetailLogger enterAFK(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getAfkTSS().p();
       return this;
    }
    public PhotoDetailLogger enterAtlasCoverMode(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getAtlasCoverTTS().p();
       this.mProvider.getAtlasInnerDetailTTS().g();
       return this;
    }
    public PhotoDetailLogger enterBackground(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPageBackgroundTTS().p();
       return this;
    }
    public PhotoDetailLogger enterBackgroundPlay(){
       return this;
    }
    public PhotoDetailLogger enterEnterProfileFragment(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getEnterProfileFragmentTTS().p();
       return this;
    }
    public PhotoDetailLogger enterMaximizeForComments(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCommentMaximizeTTS().p();
       return this;
    }
    public PhotoDetailLogger enterPlayerActualPlaying(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPlayerActualPlayingTSS().p();
       return this;
    }
    public PhotoDetailLogger enterPlayerOutOfSightByScroll(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPlayerOutOfSightByScrollTTS().p();
       return this;
    }
    public PhotoDetailLogger enterPlayerPause(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPlayerPauseTSS().p();
       return this;
    }
    public PhotoDetailLogger enterStayForAiText(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getAiTextPanelStayTTS().p();
       return this;
    }
    public PhotoDetailLogger enterStayForCommentEditor(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCommentEditorStayTTS().p();
       return this;
    }
    public PhotoDetailLogger enterStayForComments(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCommentStayTTS().p();
       return this;
    }
    public PhotoDetailLogger enterStayForHiddenComments(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getHiddenCommentStayTTS().p();
       return this;
    }
    public PhotoDetailLogger enterStayForRecommendCommentPanel(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getRecommendCommentPanelStayTTS().p();
       return this;
    }
    public PhotoDetailLogger exitAFK(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getAfkTSS().g();
       return this;
    }
    public PhotoDetailLogger exitAtlasCoverMode(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getAtlasCoverTTS().g();
       this.mProvider.getAtlasInnerDetailTTS().p();
       return this;
    }
    public PhotoDetailLogger exitBackground(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPageBackgroundTTS().g();
       return this;
    }
    public PhotoDetailLogger exitBackgroundPlay(){
       return this;
    }
    public PhotoDetailLogger exitEnterProfileFragment(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getEnterProfileFragmentTTS().g();
       return this;
    }
    public PhotoDetailLogger exitMaximizeForComments(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCommentMaximizeTTS().g();
       return this;
    }
    public PhotoDetailLogger exitPlayerActualPlaying(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPlayerActualPlayingTSS().g();
       return this;
    }
    public PhotoDetailLogger exitPlayerOutOfSightByScroll(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPlayerOutOfSightByScrollTTS().g();
       return this;
    }
    public PhotoDetailLogger exitPlayerPause(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getPlayerPauseTSS().g();
       return this;
    }
    public PhotoDetailLogger exitStayForAiText(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getAiTextPanelStayTTS().g();
       return this;
    }
    public PhotoDetailLogger exitStayForCommentEditor(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCommentEditorStayTTS().g();
       return this;
    }
    public PhotoDetailLogger exitStayForComments(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCommentStayTTS().g();
       return this;
    }
    public PhotoDetailLogger exitStayForHiddenComments(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getHiddenCommentStayTTS().g();
       return this;
    }
    public PhotoDetailLogger exitStayForRecommendCommentPanel(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getRecommendCommentPanelStayTTS().g();
       return this;
    }
    public void fulfillUrlPackage(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "155")) {
          return;
       }
       u1.e(this.mUrlPackage);
       return;
    }
    public ClientStat$VideoStatEvent genIntermediateVideoStatEvent(ClientEvent$UrlPackage p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoDetailLogger.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mVideoQosJson = p1;
       this.mBriefVideoQosJson = p2;
       return this.c(this.d, super(), p0, p0, true, true, true);
    }
    public ClientEvent$UrlPackage genUrlPackage(BaseFragment p0,QPhoto p1){
       ClientEvent$UrlPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoDetailLogger.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$UrlPackage();
       obj.category = p0.M();
       obj.page = p0.getPage();
       obj.page2 = p0.o();
       obj.subPages = d.a(p1);
       obj.topPage = TextUtils.k(b.a(0x4b316083).R0());
       if (obj.expTagList == null && p0.getActivity() != null) {
          obj.expTagList = b.a(0xe0ff4fb).c(p0);
       }
       return obj;
    }
    public long getAFKPlayedDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getAFKPlayedTimeSliceSet().l();
    }
    public i3 getAFKPlayedTimeSliceSet(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i3.b(this.mProvider.getPlayerActualPlayingTSS(), this.mProvider.getAfkTSS());
    }
    public long getActualPlayDuration(){
       i3 obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mProvider.getPlayerActualPlayingTSS().f();
       obj.g();
       return obj.k();
    }
    public Map getAdapterParams(){
       return this.f;
    }
    public int getAutoRetryCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mProvider.getAutoRetryCnt();
    }
    public long getClickOpenTimeStampIfAny(){
       PhotoDetailLogger obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mClickToFirstFrameTSS;
       if (obj != null) {
          if (obj.o()) {
             return obj.i().a;
          }else if(!obj.n()){
             return Long.MAX_VALUE;
          }
       }
       obj = this.mClickToFirstFrameTSS;
       if (obj != null && obj.n()) {
          return -1;
       }else {
          return 0;
       }
    }
    public int getClickPauseCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mProvider.getClickPauseCnt();
    }
    public long getCommentStayDuration(){
       i3 obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mProvider.getCommentStayTTS().f();
       obj.g();
       return obj.k();
    }
    public long getCurrentPageBackgroundDuration(){
       i3 obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "145");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mProvider.getPageBackgroundTTS().f();
       obj.g();
       return obj.k();
    }
    public long getDuration(){
       return this.mDuration;
    }
    public long getEnterTime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mProvider.getEnterTime();
    }
    public int getEntryAuthorProfileCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mProvider.getEntryAuthorProfileCnt();
    }
    public long getEveBufferDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "131");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mBufferingTSS.k();
    }
    public int getEveStalledCount(){
       return (int)this.mStalledCount;
    }
    public long getFirstFrameDurationMs(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.mRealFirstFrameDuration <= 0) {
          long l = this.mClickToFirstFrameTSS.k();
          this.mRealFirstFrameDuration = l;
          if (l > 0) {
             this.mRealFirstFrameDuration = i3.a(this.mClickToFirstFrameTSS, this.mProvider.getPlayerPauseTSS()).k();
          }
       }
       return this.mRealFirstFrameDuration;
    }
    public int getPlaySoundVolume(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mProvider.getPlaySoundVolume();
    }
    public String getPlayerEventSessionId(){
       return this.mPlayerEventSessionID;
    }
    public long getPrepareTimeMs(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mPrepareTSS.k();
    }
    public long getTrailDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mProvider.getTrailDuration();
    }
    public ClientEvent$UrlPackage getUrlPackage(){
       return this.mUrlPackage;
    }
    public ClientStat$VideoStatEvent getVideoStatEvent(ClientEvent$UrlPackage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "146");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(this.d, p0, true, false, true);
    }
    public ClientStat$VideoStatEvent getVideoStatEventForActivityIntentShare(ClientEvent$UrlPackage p0){
       if (!this.mProvider.isDataSaverBound()) {
          return this.getVideoStatEvent(p0);
       }
       ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
       this.mSharedPendingVideoStatEvent = videoStatEve;
       videoStatEve.urlPackage = p0;
       Object[] objArray = new Object[0];
       v.C().w("PhotoDetailLogger", "getVideoStatEventForActivityIntentShare = "+this.mSharedPendingVideoStatEvent, objArray);
       return this.mSharedPendingVideoStatEvent;
    }
    public void handleOtherVseInfo(ClientStat$VideoStatEvent p0,boolean p1,boolean p2){
       PhotoDetailLogger tmShareOutVs;
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, PhotoDetailLogger.class, "150")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1) {
          tmShareOutVs = this.mShareOutVse;
          if (tmShareOutVs != null) {
             v.a(p0, tmShareOutVs);
          }
       }
       if (p2) {
          tmShareOutVs = this.mShareInVse;
          if (tmShareOutVs != null) {
             v.a(p0, tmShareOutVs);
          }
       }
       return;
    }
    public PhotoDetailLogger hasReleasePlayerBackground(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.setHasReleasePlayerBackground(true);
       return this;
    }
    public boolean hasStartLog(){
       return this.e;
    }
    public boolean isClickAddBlacklist(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mProvider.isClickAddBlacklist();
    }
    public boolean isClickDownload(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "118");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mProvider.isClickDownloadPhoto();
    }
    public boolean isClickNegativePhoto(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "112");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mProvider.isClickNegativePhoto();
    }
    public boolean isClickTakeSameFrame(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "114");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mProvider.isClickTakeSameFrame();
    }
    public boolean isClickTakeSameStyle(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mProvider.isClickTakeSameStyle();
    }
    public boolean isEventStatLogEnable(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.hasStartLog() && this.getEnterTime() > 0)? true: false;
       return b;
    }
    public boolean isHorizontalScreenPlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mProvider.isHorizontalScreenPlay();
    }
    public PhotoDetailLogger logAtlasCnt(int p0,int p1,int p2){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, PhotoDetailLogger.class, "53");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       v.C().w("PhotoDetailLogger", "logAtlasCnt atlasTotalCnt="+p0+", atlasViewAllCnt="+p1+", atlasViewDistinctCnt="+p2+", this="+this, objArray);
       this.mProvider.setAtlasTotalCnt(p0);
       this.mProvider.setAtlasViewAllCnt(p1);
       this.mProvider.setAtlasViewDistinctCnt(p2);
       return this;
    }
    public PhotoDetailLogger logAtlasInfo(o p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.setAtlasTotalCnt(p0.c);
       this.mProvider.setAtlasViewAllCnt(p0.e);
       this.mProvider.setAtlasViewDistinctCnt(p0.d);
       this.mProvider.setSimplifyScreenAtlasViewAllCnt(p0.g);
       this.mProvider.setSimplifyScreenAtlasViewDistinctCnt(p0.f);
       this.mProvider.setCoverAtlasViewDistinctCount(p0.a);
       this.mProvider.setCoverAtlasViewCount(p0.b);
       this.mProvider.setCoverViewIndexDistinctList(p0.h);
       this.mProvider.setAtlasViewIndexDistinctList(p0.i);
       return this;
    }
    public void logAudioStart(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "40")) {
          return;
       }
       PhotoDetailLogger tmVideoStatE = this.mVideoStatEventLogListener;
       if (tmVideoStatE != null) {
          tmVideoStatE.c();
       }
       return;
    }
    public PhotoDetailLogger logEnterCleanScreen(){
       PhotoDetailLogger obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCleanScreenPlayTss().p();
       obj = this.mProvider;
       obj.setCleanScreenPlayCount((obj.getCleanScreenPlayCount() + 1));
       return this;
    }
    public PhotoDetailLogger logEnterLandscape(){
       PhotoDetailLogger obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getLandScapeTss().p();
       obj = this.mProvider;
       obj.setEnterLandScapeCount((obj.getEnterLandScapeCount() + 1));
       return this;
    }
    public synchronized PhotoDetailLogger logEnterNetScore(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getNetScore().clear();
       this.mProvider.getNetScore().add(Integer.valueOf(NetworkQualityEstimator.b()));
       return this;
    }
    public PhotoDetailLogger logEnterTime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.setEnterElapsedRealtime(SystemClock.elapsedRealtime());
       this.mProvider.setEnterTime(System.currentTimeMillis());
       this.logEnterNetScore();
       return this;
    }
    public PhotoDetailLogger logExitCleanScreen(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getCleanScreenPlayTss().g();
       return this;
    }
    public PhotoDetailLogger logExitLandscape(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getLandScapeTss().g();
       return this;
    }
    public PhotoDetailLogger logLeaveNetScore(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.getNetScore().add(Integer.valueOf(NetworkQualityEstimator.b()));
       return this;
    }
    public PhotoDetailLogger logLeaveTime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setLeaveTimeTillNow();
       this.b();
       this.logLeaveNetScore();
       return this;
    }
    public void logStartPlay(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "38")) {
          return;
       }
       PhotoDetailLogger tmVideoStatE = this.mVideoStatEventLogListener;
       if (tmVideoStatE != null) {
          tmVideoStatE.b();
       }
       return;
    }
    public void logTrialDuration(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "21")) {
          return;
       }
       i3 oi3 = this.mProvider.getPlayerActualPlayingTSS().f();
       oi3.g();
       this.mProvider.setTrailDuration(oi3.k());
       return;
    }
    public void logVideoStart(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "39")) {
          return;
       }
       PhotoDetailLogger tmVideoStatE = this.mVideoStatEventLogListener;
       if (tmVideoStatE != null) {
          tmVideoStatE.d();
       }
       return;
    }
    public void onButtonClicked(BaseFeed p0,String p1,int p2,int p3,int p4,int p5,String p6,CommonParams p7){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6,p7};
          if (PatchProxy.applyVoid(objArray, this, PhotoDetailLogger.class, "160")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p1;
       uElementPack.type = p2;
       uElementPack.status = 0;
       uElementPack.action = p5;
       uElementPack.params = TextUtils.I(p6);
       ClickMetaData uClickMetaDa = new ClickMetaData().setType(p3).setDirection(p4).setElementPackage(uElementPack).setContentPackage(this.buildContentPackage()).setCommonParams(p7);
       FeedLogCtx uFeedLogCtx = (p0 == null)? null: r1.O0(p0);
       u1.B(uClickMetaDa.setFeedLogCtx(uFeedLogCtx));
       return;
    }
    public n pauseLogTimeTrackAndGetCurrentVseInfo(boolean p0){
       n obj;
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "135");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new n();
       q oq = new q();
       oq.e = this.mProvider.getPlayerOutOfSightByScrollTTS().o();
       oq.a = this.mProvider.getPlayerActualPlayingTSS().o();
       oq.b = this.mProvider.getPlayerPauseTSS().o();
       oq.c = this.mPrepareTSS.o();
       oq.d = this.mBufferingTSS.o();
       boolean b = (this.mClickToFirstFrameTSS.o() && !this.mClickToFirstFrameTSS.k() - null)? true: false;
       oq.f = b;
       oq.g = this.mProvider.getCommentStayTTS().o();
       oq.i = this.mProvider.getLandScapeTss().o();
       oq.h = this.mProvider.getCommentMaximizeTTS().o();
       oq.j = this.mProvider.getHiddenCommentStayTTS().o();
       oq.k = this.mProvider.getPageBackgroundTTS().o();
       oq.l = this.mProvider.getEnterProfileFragmentTTS().o();
       this.b();
       ClientStat$VideoStatEvent videoStatEve = this.a(this.d, null, p0, p0, false);
       if (!PatchProxy.applyVoidOneRefs(oq, obj, n.class, "2")) {
          a.p(oq, "<set-?>");
          obj.b = oq;
       }
       obj.a = videoStatEve;
       return obj;
    }
    public void prepareUrlPackage(ClientStat$VideoStatEvent p0,ClientEvent$UrlPackage p1,ClientEvent$UrlPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PhotoDetailLogger.class, "151")) {
          return;
       }
       p0.urlPackage = p1;
       p0.referUrlPackage = this.mReferUrlPackage;
       if (p2 != null) {
          p1.identity = p2.identity;
       }
       o3.a(p1.expTagList, this.buildExpTagTrans());
       return;
    }
    public void putBizParam(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDetailLogger.class, "159")) {
          return;
       }
       this.mProvider.getBizParams().put(p0, p1);
       return;
    }
    public void recordPlayerStats(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "133")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.isBuffering()) {
          this.setLeavePlayStatus(1);
       }else if(p0.isPlaying()){
          this.setLeavePlayStatus(2);
       }else if(p0.isPaused()){
          this.setLeavePlayStatus(3);
       }else {
          this.setLeavePlayStatus(0);
       }
       return;
    }
    public void removeVideoStatEventUploadListener(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "165")) {
          return;
       }
       this.mVideoStatEventUploadListeners.remove(p0);
       return;
    }
    public void resumeLogTimeTrack(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "136")) {
          return;
       }
       if (p0.a != null) {
          this.enterPlayerActualPlaying();
       }
       if (p0.b != null) {
          this.enterPlayerPause();
       }
       if (p0.d != null) {
          this.startBuffering();
       }
       if (p0.c != null) {
          this.startPrepare();
       }
       if (p0.e != null) {
          this.enterPlayerOutOfSightByScroll();
       }
       if (p0.i != null) {
          this.logEnterLandscape();
       }
       if (p0.g != null) {
          this.enterStayForComments();
       }
       if (p0.h != null) {
          this.enterMaximizeForComments();
       }
       if (p0.j != null) {
          this.enterStayForHiddenComments();
       }
       if (p0.l != null) {
          this.enterEnterProfileFragment();
       }
       return;
    }
    public void setAutoPlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "86")) {
          return;
       }
       this.mProvider.setAutoPlay(p0);
       return;
    }
    public void setAutoRetryCnt(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "104")) {
          return;
       }
       this.mProvider.setAutoRetryCnt(p0);
       return;
    }
    public SlidePlayLogger setBaseFeed(BaseFeed p0){
       QPhoto obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "162");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new QPhoto(p0);
       this.d = obj;
       if (!PatchProxy.applyVoidOneRefs(obj, this, PhotoDetailLogger.class, "134")) {
          this.setLikeStatusBeforePlay(obj.isLiked());
          this.setFollowStatusBeforePlay(obj.getUser().isFollowingOrFollowRequesting());
          this.setSpecialLikeStatusBeforePlay(obj.getUser().mFavorited);
          int i = (obj.mEntity.a(PhotoMeta.class).mCollected != null)? 1: 2;
          this.setCollectBeforeStatus(i);
       }
       return super.setBaseFeed(p0);
    }
    public void setBlackMatrix(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "25")) {
          return;
       }
       this.mProvider.setBlackMatrix(p0);
       return;
    }
    public void setBottombarType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "31")) {
          return;
       }
       this.mProvider.setBottombarType(p0);
       return;
    }
    public PhotoDetailLogger setBriefVideoQosJson(String p0){
       this.mBriefVideoQosJson = p0;
       return this;
    }
    public void setCleanScreen(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "100")) {
          return;
       }
       this.mProvider.setCleanScreen(p0);
       return;
    }
    public void setClickPauseCnt(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "102")) {
          return;
       }
       this.mProvider.setClickPauseCnt(p0);
       return;
    }
    public void setCollectBeforeStatus(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "123")) {
          return;
       }
       this.mProvider.setCollectBeforeStatus(p0);
       return;
    }
    public PhotoDetailLogger setConsumeIndex(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mProvider.setConsumeIndex(Integer.valueOf(p0));
       return this;
    }
    public void setCurrentPlaySoundVolume(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "93")) {
          return;
       }
       this.mProvider.setPlaySoundVolume(w.a);
       c.k(new PhotoDetailLogger$a(this, this));
       return;
    }
    public void setCutShape(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "27")) {
          return;
       }
       this.mProvider.setCutShape(p0);
       return;
    }
    public PhotoDetailLogger setDuration(long p0){
       this.mDuration = p0;
       return this;
    }
    public void setEnterAction(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "84")) {
          return;
       }
       this.mProvider.setEnterAction(p0);
       return;
    }
    public void setEntryAuthorProfileCnt(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "96")) {
          return;
       }
       this.mProvider.setEntryAuthorProfileCnt(p0);
       return;
    }
    public void setFingerLeaveDuration(long p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, PhotoDetailLogger.class, "125")) {
          return;
       }
       this.mProvider.setFingerLeaveDuration(p0);
       return;
    }
    public void setFingerLeaveToStartDuration(long p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, PhotoDetailLogger.class, "129")) {
          return;
       }
       this.mProvider.setFingerLeaveToStartDuration(p0);
       return;
    }
    public void setFollowStatusBeforePlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "105")) {
          return;
       }
       this.mProvider.setFollowStatusBeforePlay(p0);
       return;
    }
    public PhotoDetailLogger setFromH5Info(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoDetailLogger.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.setFromH5Page(p0);
       this.mProvider.setFromUtmSource(p1);
       return this;
    }
    public void setFullScreenPhone(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "24")) {
          return;
       }
       this.mProvider.setFullScreenPhone(p0);
       return;
    }
    public PhotoDetailLogger setGzoneSource(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.setGzoneSourceUrl(p0);
       return this;
    }
    public PhotoDetailLogger setHasDownloaded(boolean p0){
       if (this.mHasDownloadedAlreadySet == null) {
          this.mHasDownloadedAlreadySet = true;
          this.mHasDownloaded = p0;
       }
       return this;
    }
    public PhotoDetailLogger setHasUsedEarphone(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mProvider.setHasUsedEarphone(p0);
       return this;
    }
    public PhotoDetailLogger setHiddenCommentCnt(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "82");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mProvider.setHiddenCommentCnt(p0);
       return this;
    }
    public void setHitLadder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "32")) {
          return;
       }
       this.mProvider.setHitLadder(p0);
       return;
    }
    public void setImmerseStyle(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "29")) {
          return;
       }
       this.mProvider.setImmerseStyle(p0);
       return;
    }
    public void setIsAtFriendInComment(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "108")) {
          return;
       }
       this.mProvider.setAtFriendInComment(p0);
       return;
    }
    public void setIsBackwardPlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "122")) {
          return;
       }
       this.mProvider.setBackwardPlay(p0);
       return;
    }
    public void setIsClickAddBlacklist(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "111")) {
          return;
       }
       this.mProvider.setClickAddBlacklist(p0);
       return;
    }
    public void setIsClickDownloadPhoto(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "119")) {
          return;
       }
       this.mProvider.setClickDownloadPhoto(p0);
       return;
    }
    public void setIsClickNegativePhoto(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "113")) {
          return;
       }
       this.mProvider.setClickNegativePhoto(p0);
       return;
    }
    public void setIsClickTakeSameFrame(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "115")) {
          return;
       }
       this.mProvider.setClickTakeSameFrame(p0);
       return;
    }
    public void setIsClickTakeSameStyle(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "117")) {
          return;
       }
       this.mProvider.setClickTakeSameStyle(p0);
       return;
    }
    public void setIsCommented(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "124")) {
          return;
       }
       this.mProvider.setCommented(p0);
       return;
    }
    public void setIsCopyComment(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "109")) {
          return;
       }
       this.mProvider.setCopyComment(p0);
       return;
    }
    public void setIsEnlargePlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "99")) {
          return;
       }
       this.mProvider.setEnlargePlay(p0);
       return;
    }
    public void setIsFastForwardPlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "121")) {
          return;
       }
       this.mProvider.setFastForwardPlay(p0);
       return;
    }
    public void setIsHasPlayedVideo(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "142")) {
          return;
       }
       if (!PhotoDetailLogger.g) {
          PhotoDetailLogger td = this.d;
          if (td != null && td.isVideoType()) {
             PhotoDetailLogger.g = true;
             this.mProvider.setFirstPlayVideo(true);
          }
       }
       return;
    }
    public void setIsHorizontalScreenPlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "98")) {
          return;
       }
       this.mProvider.setHorizontalScreenPlay(p0);
       return;
    }
    public void setIsRefreshFirstPhoto(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "130")) {
          return;
       }
       this.mProvider.setRefreshFirstPhoto(p0);
       return;
    }
    public void setIsStayCommentAreaEndPlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "120")) {
          return;
       }
       this.mProvider.setStayCommentAreaEndPlay(p0);
       return;
    }
    public PhotoDetailLogger setLastDuration(long p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, PhotoDetailLogger.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mProvider.setLastDuration(p0);
       return this;
    }
    public void setLeaveAction(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "83")) {
          return;
       }
       this.mProvider.setLeaveAction(p0);
       return;
    }
    public void setLeavePlayStatus(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "88")) {
          return;
       }
       this.mProvider.setLeavePlayStatus(p0);
       return;
    }
    public void setLeaveTimeTillNow(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailLogger.class, "48")) {
          return;
       }
       this.mProvider.setLeaveElapsedRealtime(SystemClock.elapsedRealtime());
       this.mProvider.setLeaveTime(System.currentTimeMillis());
       return;
    }
    public void setLikeStatusBeforePlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "107")) {
          return;
       }
       this.mProvider.setLikeStatusBeforePlay(p0);
       return;
    }
    public PhotoDetailLogger setLiveSourceType(int p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotoDetailLogger.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mProvider.setLiveSourceType(p0);
       return this;
    }
    public PhotoDetailLogger setPhotoConsumePage(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.setPhotoConsumePage(p0);
       return this;
    }
    public PhotoDetailLogger setPlayCompleted(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProvider.setHasPlayCompleted(true);
       return this;
    }
    public void setPlayInfoToLog(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "166")) {
          return;
       }
       if (p0 != null) {
          this.logLeaveTime();
       }
       return;
    }
    public PhotoDetailLogger setPlayerEventSession(String p0){
       PhotoDetailLogger obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailLogger.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mPlayerEventSessionID = p0;
       obj = this.mVideoStatEventLogListener;
       if (obj != null) {
          obj.a(p0);
       }
       return this;
    }
    public void setPlayerMiddlewareDuration(long p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, PhotoDetailLogger.class, "127")) {
          return;
       }
       this.mProvider.setPlayerMiddlewareDuration(p0);
       return;
    }
    public void setPlayerPrepareDuration(long p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, PhotoDetailLogger.class, "126")) {
          return;
       }
       this.mProvider.setPlayerPrepareDuration(p0);
       return;
    }
    public void setPlayerSdkDuration(long p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, PhotoDetailLogger.class, "128")) {
          return;
       }
       this.mProvider.setPlayerSdkDuration(p0);
       return;
    }
    public void setPlcEntryStyleInfo(PlcEntryStyleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "17")) {
          return;
       }
       this.mProvider.setPlcEntryStyleInfo(p0);
       return;
    }
    public void setPoorNetSessionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "51")) {
          return;
       }
       PhotoDetailLogger tmProvider = this.mProvider;
       if (TextUtils.x(p0)) {
          p0 = "null";
       }
       tmProvider.setPoorNetSessionId(p0);
       return;
    }
    public PhotoDetailLogger setProfileFeedOn(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "87");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mProvider.setProfileFeedOn(p0);
       return this;
    }
    public void setScreenScale(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "30")) {
          return;
       }
       this.mProvider.setScreenScale(p0);
       return;
    }
    public void setSearchParams(SearchParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "5")) {
          return;
       }
       this.mProvider.setSearchParams(p0);
       return;
    }
    public void setSessionStatisticsData(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "168")) {
          return;
       }
       this.mSessionStatisticsData = p0;
       if (this.mSharedPendingVideoStatEvent != null) {
          if (this.mUrlPackage == null) {
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             this.mUrlPackage = urlPackage;
             urlPackage.category = 4;
             urlPackage.page = 7;
             urlPackage.topPage = TextUtils.k(b.a(0x4b316083).R0());
          }
          PhotoDetailLogger tmSharedPend = this.mSharedPendingVideoStatEvent;
          this.c(this.d, tmSharedPend, this.mUrlPackage, tmSharedPend.urlPackage, true, false, true);
          this.mSharedPendingVideoStatEvent = null;
       }
       return;
    }
    public void setShareInVse(ClientStat$VideoStatEvent p0){
       this.mShareInVse = p0;
    }
    public void setSlideAutoPlayForFeedbackSwitch(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "52")) {
          return;
       }
       this.mProvider.setSlideAutoPlayForFeedbackSwitch(p0);
       return;
    }
    public void setSpecialLikeStatusBeforePlay(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "106")) {
          return;
       }
       this.mProvider.setSpecialLikeStatusBeforePlay(p0);
       return;
    }
    public void setSubtitles(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "26")) {
          return;
       }
       this.mProvider.setSubtitles(p0);
       return;
    }
    public void setTailoringResult(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "18")) {
          return;
       }
       this.mProvider.setTailoringResult(p0);
       return;
    }
    public void setTakeUpTotally(boolean p0){
       if (PatchProxy.isSupport(PhotoDetailLogger.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotoDetailLogger.class, "28")) {
          return;
       }
       this.mProvider.setTakeUpTotally(p0);
       return;
    }
    public PhotoDetailLogger setVideoQosJson(String p0){
       this.mVideoQosJson = p0;
       return this;
    }
    public void setWolverinePerformanceLevel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLogger.class, "20")) {
          return;
       }
       this.mProvider.setWolverinePerformanceLevel(p0);
       return;
    }
    public PhotoDetailLogger startBuffering(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mStalledCount = this.mStalledCount + 1;
       this.mBufferingTSS.p();
       return this;
    }
    public PhotoDetailLogger startFirstFrameTime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mClickToFirstFrameTSS.p();
       return this;
    }
    public PhotoDetailLogger startLog(){
       this.e = true;
       return this;
    }
    public PhotoDetailLogger startPrepare(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLogger.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mPrepareTSS.p();
       this.startFirstFrameTime();
       return this;
    }
    public void upload(ClientEvent$UrlPackage p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDetailLogger.class, "143")) {
          return;
       }
       c.a(new i(this, p1, this.d, p0));
       return;
    }
}
