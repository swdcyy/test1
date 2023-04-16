package com.kuaishou.live.playback.playmodule.log.LivePlaybackPhotoLogger;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackSlidePlayLogger;
import k2b.i3;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import java.lang.Double;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import fyd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nc6.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import k2b.o3;
import com.google.gson.JsonObject;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.i;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import android.content.Context;
import ej3.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import wh5.c;
import kp.r1;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import org.greenrobot.eventbus.a;
import rd5.d;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.System;
import java.lang.Float;
import c0d.d;
import pkd.a;
import java.lang.IllegalStateException;
import ej3.a;
import java.lang.Runnable;
import t45.c;
import ej3.b;

public class LivePlaybackPhotoLogger extends LivePlaybackSlidePlayLogger	// class@000d3f
{
    public i3 b;
    public i3 c;
    public i3 d;
    public i3 e;
    public i3 f;
    public i3 g;
    public i3 h;
    public i3 i;
    public i3 j;
    public ClientEvent$UrlPackage k;
    public boolean l;
    public boolean m;
    public float mAverageFps;
    public String mBluetoothDeviceInfo;
    public String mBriefVideoQosJson;
    public long mBufferDuration;
    public long mCommentPauseDuration;
    public long mCommentStayDuration;
    public String mDnsResolvedIP;
    public String mDnsResolverHost;
    public String mDnsResolverName;
    public long mDuration;
    public long mEnterElapsedRealtime;
    public long mEnterTime;
    public boolean mHasDownloaded;
    public boolean mHasUsedEarphone;
    public String mKwaiSignature;
    public int mLeaveAction;
    public long mLeaveElapsedRealtime;
    public long mLeaveTime;
    public Integer mMediaType;
    public String mMusicUrl;
    public long mOtherPauseDuration;
    public String mPlayUrl;
    public Integer mPlayVideoType;
    public long mPlayedDuration;
    public long mPrefetchSize;
    public long mPrepareDuration;
    public long mStalledCount;
    public String mVideoQosJson;
    public Integer mVideoType;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public String s;
    public static final long serialVersionUID = 0xff787213421b6ec1;

    public void LivePlaybackPhotoLogger(){
       super();
       this.mLeaveAction = 4;
       this.b = new i3();
       this.c = new i3();
       this.d = new i3();
       this.e = new i3();
       this.f = new i3();
       this.g = new i3();
       this.h = new i3();
       this.i = new i3();
       this.j = new i3();
       this.p = "photo";
    }
    public static LivePlaybackPhotoLogger buildFromParams(LivePlaybackParam p0){
       LivePlaybackPhotoLogger obj = PatchProxy.applyOneRefs(p0, null, LivePlaybackPhotoLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePlaybackPhotoLogger();
       if (p0 != null) {
          LivePlaybackParam mOpenedTimeS = p0.mOpenedTimeStamp;
          if (mOpenedTimeS > 0) {
             obj.g.q(mOpenedTimeS);
          }
       }
       return obj;
    }
    public static void reportAtlas(int p0,long p1,long p2){
       if (PatchProxy.isSupport(LivePlaybackPhotoLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), null, LivePlaybackPhotoLogger.class, "31")) {
          return;
       }
       ClientContent$AtlasPackage uAtlasPackag = new ClientContent$AtlasPackage();
       uAtlasPackag.type = p0;
       uAtlasPackag.count = p1;
       uAtlasPackag.viewedCount = p2;
       u1.u(1, null, new ClientContent$ContentPackage());
       return;
    }
    public static void seedClickButtonLogWithValue(int p0,double p1,double p2,ClientContent$ContentPackage p3){
       if (PatchProxy.isSupport(LivePlaybackPhotoLogger.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), p3, null, LivePlaybackPhotoLogger.class, "38")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       uElementPack.name = String.valueOf(p1);
       uElementPack.value = p2;
       uElementPack.type = 1;
       u1.u(1, uElementPack, p3);
       return;
    }
    public final void a(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlaybackPhotoLogger.class, "34")) {
          return;
       }
       ClientStat$VideoStatEvent videoStatEve = PatchProxy.applyOneRefs(p0, this, LivePlaybackPhotoLogger.class, "36");
       if (videoStatEve != PatchProxyResult.class) {
       }else {
          LivePlaybackPhotoLogger livePlayback = 2;
          int i = 1;
          int i1 = 0;
          if (!PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackPhotoLogger.class, "35") && p0 != null) {
             i3 oi3 = i3.a(this.b, i3.d(this.i, this.j));
             this.mCommentPauseDuration = oi3.k();
             this.mBufferDuration = this.f.k();
             this.mPrepareDuration = this.e.k();
             this.mCommentStayDuration = this.h.k();
             if (p0.isVideoType() || p0.isKtvSong()) {
                this.mPlayedDuration = this.c.k();
                this.mOtherPauseDuration = i3.a(this.d, oi3).k();
             }else {
                oi3 = new i3();
                oi3.q(this.mEnterElapsedRealtime);
                oi3.h(this.mLeaveElapsedRealtime);
                i3[] oi3Array = new i3[]{this.b,this.i,this.j};
                this.mPlayedDuration = i3.a(oi3, i3.c(oi3Array)).k();
                this.mOtherPauseDuration = this.i.k();
             }
          }
          videoStatEve = new ClientStat$VideoStatEvent();
          videoStatEve.sPhotoId = this.mPhoto.getPhotoId();
          videoStatEve.sessionUuid = this.s;
          videoStatEve.bufferDuration = this.mBufferDuration;
          videoStatEve.commentPauseDuration = this.mCommentPauseDuration;
          videoStatEve.downloaded = this.mHasDownloaded;
          videoStatEve.duration = this.mDuration;
          videoStatEve.enterTime = this.mEnterTime;
          videoStatEve.leaveTime = this.mLeaveTime;
          videoStatEve.otherPauseDuration = this.mOtherPauseDuration;
          videoStatEve.hasUsedEarphone = this.mHasUsedEarphone;
          videoStatEve.commentStayDuration = this.mCommentStayDuration;
          if (this.mPlayVideoType.intValue() == -1) {
             videoStatEve.playVideoType = i1;
          }else if(!this.mPlayVideoType.intValue()){
             videoStatEve.playVideoType = i;
          }else {
             videoStatEve.playVideoType = livePlayback;
          }
          if (this.mVideoType.intValue() == -1) {
             videoStatEve.videoType = i1;
          }else if(!this.mVideoType.intValue()){
             videoStatEve.videoType = i;
          }else {
             videoStatEve.videoType = livePlayback;
          }
          videoStatEve.mediaType = this.mMediaType.intValue();
          videoStatEve.playedDuration = this.mPlayedDuration;
          videoStatEve.clickToFirstFrameDuration = this.g.k();
          videoStatEve.stalledCount = (int)this.mStalledCount;
          videoStatEve.prepareDuration = this.mPrepareDuration;
          videoStatEve.photoId = this.mPhotoId;
          videoStatEve.averageFps = (double)this.mAverageFps;
          videoStatEve.prefetchSize = this.mPrefetchSize;
          videoStatEve.leaveAction = this.mLeaveAction;
          LivePlaybackSlidePlayLogger tmPhotoParam = this.mPhotoParam;
          if (tmPhotoParam != null && !TextUtils.x(tmPhotoParam.mSearchSessionId)) {
             videoStatEve.searchSessionId = this.mPhotoParam.mSearchSessionId;
          }
          tmPhotoParam = this.mPhotoParam;
          if (tmPhotoParam != null && !TextUtils.x(tmPhotoParam.mPhotoSearchParams)) {
             videoStatEve.photoSearchParams = this.mPhotoParam.mPhotoSearchParams;
          }
          if (!TextUtils.x(this.mDnsResolvedIP)) {
             videoStatEve.dnsResolvedIp = this.mDnsResolvedIP;
          }
          if (!TextUtils.x(this.mDnsResolverName)) {
             videoStatEve.dnsResolverName = this.mDnsResolverName;
          }
          if (!TextUtils.x(this.mDnsResolverHost)) {
             videoStatEve.dnsResolveHost = this.mDnsResolverHost;
          }
          if (p0 != null && (p0.isImageType() && !TextUtils.x(this.mMusicUrl))) {
             videoStatEve.playUrl = this.mMusicUrl;
          }else if(!TextUtils.x(this.mPlayUrl)){
             videoStatEve.playUrl = this.mPlayUrl;
          }
          if (b.a()) {
             if (!TextUtils.x(this.mVideoQosJson)) {
                videoStatEve.videoQosJson = this.mVideoQosJson;
             }
          }else if(!TextUtils.x(this.mBriefVideoQosJson)){
             videoStatEve.videoQosJson = this.mBriefVideoQosJson;
          }
          if (this.k == null) {
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             this.k = urlPackage;
             urlPackage.category = 4;
             urlPackage.page = 7;
          }
          if (!TextUtils.x(this.k.params)) {
             livePlayback = this.k;
             livePlayback.params = livePlayback.params+",is_auto_play="+this.n;
             livePlayback = this.k;
             livePlayback.params = livePlayback.params+",profile_feed_on="+this.o;
             livePlayback = this.k;
             StringBuilder str = livePlayback.params+",photo_consume_page=";
             String str1 = (TextUtils.x(this.p))? "photo": this.p;
             livePlayback.params = str+str1;
          }
          o3.a(this.k.expTagList, this.buildExpTagTrans());
          videoStatEve.urlPackage = this.k;
          videoStatEve.referUrlPackage = this.mReferUrlPackage;
          videoStatEve.kwaiSignature = TextUtils.k(this.mKwaiSignature);
          videoStatEve.musicStationSourceType = (long)this.mLiveSourceType;
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("full_photo_id", this.mPhotoParam.mPhoto.getPhotoId());
          jsonObject.c0("anchor_user_id", this.mPhotoParam.mPhoto.getUserId());
          jsonObject.c0("live_stream_id", i.p(this.mPhoto.mEntity));
          String str2 = i.o(this.mPhoto.mEntity);
          if (!TextUtils.x(str2)) {
             jsonObject.c0("highlight_id", str2);
          }
          videoStatEve.expParams = jsonObject.toString();
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.videoStatEvent = videoStatEve;
       u1.j0(statPackage);
       return;
    }
    public ClientEvent$ExpTagTrans buildExpTagTrans(){
       Object[] objArray = null;
       ClientEvent$ExpTagTrans obj = PatchProxy.apply(objArray, this, LivePlaybackPhotoLogger.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPhoto == null) {
          return objArray;
       }
       obj = new ClientEvent$ExpTagTrans();
       obj.serverExpTag = TextUtils.I(this.mPhoto.getServerExpTag());
       obj.clientExpTag = TextUtils.I(this.mClientExpTag);
       return obj;
    }
    public LivePlaybackPhotoLogger buildPhotoConsumePage(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackPhotoLogger.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof c) {
          ClientEvent$UrlPackage urlPackage = p0.k1();
          if (urlPackage == null) {
             return this;
          }else {
             urlPackage = urlPackage.page;
             if (urlPackage == 15) {
                this.p = "nearby";
             }else if(urlPackage == 59 || urlPackage == 2){
                this.p = "follow";
             }else if(urlPackage == 4 || urlPackage == 0x7602){
                this.p = "profile";
             }
          }
       }
       return this;
    }
    public void buildUrlPackage(BaseFragment p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackPhotoLogger.class, "40")) {
          return;
       }
       if (p0 != null && this.mPhoto != null) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          this.k = urlPackage;
          urlPackage.category = p0.M();
          this.k.page = p0.getPage();
          if (p0.getActivity() instanceof c) {
             this.k.subPages = p0.getActivity().j2(this.mPhoto.mEntity);
          }
          StringBuilder str = "id="+this.mPhoto.getUserId()+",llsid="+this.mPhoto.getListLoadSequenceID()+",exptag="+this.mPhoto.getExpTag()+",is_child_lock="+c.b()+",share_identify="+this.mPhoto.isShareToFollow()+",is_long_video="+r1.Y2(this.mPhoto.mEntity);
          if (!TextUtils.x(this.q)) {
             str = str+",h5_page="+this.q;
          }
          if (!TextUtils.x(this.r)) {
             str = str+",utm_source="+this.r;
          }
          if (this.mPhoto.isVideoType()) {
             b = (this.mPhoto.getWidth() > 0 && (double)this.mPhoto.getDetailDisplayAspectRatio() - 0x3fe851eb851eb852 < 0)? true: false;
             str = str+",is_full_screen="+b;
          }
          if (this.mPhoto.mEntity != null) {
             str = str+",live_stream_id="+i.p(this.mPhoto.mEntity);
          }
          this.k.params = str;
          if (this.k.expTagList == null && p0.isAdded()) {
             this.k.expTagList = b.a(0xe0ff4fb).c(p0);
          }
       }
    label_0125 :
       return;
    }
    public LivePlaybackPhotoLogger endBuffering(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.f.g();
       return this;
    }
    public LivePlaybackPhotoLogger endFirstFrameTime(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.g.g();
       a.d().k(new d());
       return this;
    }
    public LivePlaybackPhotoLogger endPrepare(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e.g();
       return this;
    }
    public LivePlaybackPhotoLogger enterBackground(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.i.p();
       return this;
    }
    public LivePlaybackPhotoLogger enterEnterProfileFragment(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.j.p();
       return this;
    }
    public LivePlaybackPhotoLogger enterPlayerActualPlaying(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c.p();
       return this;
    }
    public LivePlaybackPhotoLogger enterPlayerOutOfSightByScroll(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.p();
       return this;
    }
    public LivePlaybackPhotoLogger enterPlayerPause(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d.p();
       return this;
    }
    public LivePlaybackPhotoLogger enterStayForComments(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h.p();
       return this;
    }
    public LivePlaybackPhotoLogger exitBackground(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.i.g();
       return this;
    }
    public LivePlaybackPhotoLogger exitEnterProfileFragment(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.j.g();
       return this;
    }
    public LivePlaybackPhotoLogger exitPlayerActualPlaying(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c.g();
       return this;
    }
    public LivePlaybackPhotoLogger exitPlayerOutOfSightByScroll(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.g();
       return this;
    }
    public LivePlaybackPhotoLogger exitPlayerPause(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d.g();
       return this;
    }
    public LivePlaybackPhotoLogger exitStayForComments(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h.g();
       return this;
    }
    public void fulfillUrlPackage(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackPhotoLogger.class, "39")) {
          return;
       }
       u1.e(this.k);
       return;
    }
    public long getBufferingTimeMs(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.f.k();
    }
    public String getDnsResolvedIP(){
       return this.mDnsResolvedIP;
    }
    public String getDnsResolverHost(){
       return this.mDnsResolverHost;
    }
    public String getDnsResolverName(){
       return this.mDnsResolverName;
    }
    public long getEnterTime(){
       return this.mEnterTime;
    }
    public long getFirstFrameTimeMs(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.g.k();
    }
    public String getPlayUrl(){
       return this.mPlayUrl;
    }
    public long getPrepareTimeMs(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.e.k();
    }
    public ClientEvent$UrlPackage getUrlPackage(){
       return this.k;
    }
    public long getmStalledCount(){
       return this.mStalledCount;
    }
    public boolean hasStartLog(){
       return this.l;
    }
    public LivePlaybackPhotoLogger logEnterTime(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mEnterElapsedRealtime = SystemClock.elapsedRealtime();
       this.mEnterTime = System.currentTimeMillis();
       return this;
    }
    public LivePlaybackPhotoLogger logLeaveTime(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mLeaveElapsedRealtime = SystemClock.elapsedRealtime();
       this.mLeaveTime = System.currentTimeMillis();
       if (!PatchProxy.applyVoid(null, this, LivePlaybackPhotoLogger.class, "29")) {
          long l = SystemClock.elapsedRealtime();
          this.c.h(l);
          this.h.h(l);
          this.b.h(l);
          this.d.h(l);
          this.i.h(l);
          this.f.h(l);
          this.e.h(l);
       }
       return this;
    }
    public void setAutoPlay(boolean p0){
       this.n = p0;
    }
    public LivePlaybackPhotoLogger setAverageFps(float p0){
       if (PatchProxy.isSupport(LivePlaybackPhotoLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, LivePlaybackPhotoLogger.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       double d = (double)p0;
       if (!Double.isNaN(d) && !Double.isInfinite(d)) {
          this.mAverageFps = p0;
       }
       return this;
    }
    public LivePlaybackPhotoLogger setBluetoothDeviceInfo(String p0){
       this.mBluetoothDeviceInfo = p0;
       return this;
    }
    public LivePlaybackPhotoLogger setBriefVideoQosJson(String p0){
       this.mBriefVideoQosJson = p0;
       return this;
    }
    public void setDnsResolveResult(d p0){
       if (p0 == null) {
          this.mDnsResolverHost = null;
          this.mDnsResolvedIP = null;
          this.mDnsResolverName = null;
       }else {
          this.mDnsResolverHost = p0.b;
          this.mDnsResolvedIP = p0.c;
          this.mDnsResolverName = p0.e;
       }
       return;
    }
    public LivePlaybackPhotoLogger setDuration(long p0){
       this.mDuration = p0;
       return this;
    }
    public LivePlaybackPhotoLogger setFromH5Info(String p0,String p1){
       this.q = p0;
       this.r = p1;
       return this;
    }
    public LivePlaybackPhotoLogger setHasDownloaded(boolean p0){
       this.mHasDownloaded = p0;
       return this;
    }
    public LivePlaybackPhotoLogger setHasUsedEarphone(boolean p0){
       this.mHasUsedEarphone = p0;
       return this;
    }
    public LivePlaybackPhotoLogger setKwaiSignature(String p0){
       this.mKwaiSignature = p0;
       return this;
    }
    public void setLeaveAction(int p0){
       this.mLeaveAction = p0;
    }
    public LivePlaybackPhotoLogger setMediaType(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackPhotoLogger.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isLongPhotos()) {
          this.mMediaType = Integer.valueOf(4);
       }else if(p0.isAtlasPhotos()){
          this.mMediaType = Integer.valueOf(3);
       }else if(p0.isImageType()){
          this.mMediaType = Integer.valueOf(2);
       }else {
          this.mMediaType = Integer.valueOf(1);
       }
       return this;
    }
    public void setMusicUrl(String p0){
       this.mMusicUrl = p0;
    }
    public void setPlayUrl(String p0){
       this.mPlayUrl = p0;
    }
    public LivePlaybackPhotoLogger setPlayVideoType(int p0){
       if (PatchProxy.isSupport(LivePlaybackPhotoLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LivePlaybackPhotoLogger.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mPlayVideoType = Integer.valueOf(p0);
       return this;
    }
    public LivePlaybackPhotoLogger setPlayerEventSession(String p0){
       this.s = p0;
       return this;
    }
    public LivePlaybackPhotoLogger setPrefetchSize(long p0){
       this.mPrefetchSize = p0;
       return this;
    }
    public LivePlaybackPhotoLogger setProfileFeedOn(boolean p0){
       this.o = p0;
       return this;
    }
    public void setShouldLogPlayedTime(boolean p0){
       this.m = p0;
    }
    public LivePlaybackPhotoLogger setVideoQosJson(String p0){
       this.mVideoQosJson = p0;
       return this;
    }
    public LivePlaybackPhotoLogger setVideoType(int p0){
       if (PatchProxy.isSupport(LivePlaybackPhotoLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LivePlaybackPhotoLogger.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mVideoType = Integer.valueOf(p0);
       return this;
    }
    public LivePlaybackPhotoLogger startBuffering(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mStalledCount = this.mStalledCount + 1;
       this.f.p();
       return this;
    }
    public LivePlaybackPhotoLogger startFirstFrameTime(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.g.p();
       return this;
    }
    public LivePlaybackPhotoLogger startLog(){
       this.l = true;
       return this;
    }
    public LivePlaybackPhotoLogger startPrepare(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackPhotoLogger.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e.p();
       this.startFirstFrameTime();
       return this;
    }
    public void upload(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackPhotoLogger.class, "32")) {
          return;
       }
       if (a.a && (this.mVideoType == null || this.mPlayVideoType == null)) {
          throw new IllegalStateException("mVideoType and mPlayVideoType must not be null");
       }
       c.a(new a(this, this.mPhoto, p0));
       return;
    }
    public void upload(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlaybackPhotoLogger.class, "33")) {
          return;
       }
       if (a.a && (this.mVideoType == null || this.mPlayVideoType == null)) {
          throw new IllegalStateException("mVideoType and mPlayVideoType must not be null");
       }
       c.a(new b(this, p1, this.mPhoto, p0));
       return;
    }
}
