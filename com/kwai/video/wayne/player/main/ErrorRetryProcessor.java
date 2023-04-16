package com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ai7.d;
import com.kwai.video.wayne.player.main.RetryStrategy;
import nsd.u;
import com.kwai.video.wayne.player.main.RetryInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.video.wayne.player.main.OmniRetryInfo;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$mDebugInfoCallback$1;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$mLoadingChangedListener$1;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$mKwaiInjectHttpCallback$1;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$mOnErrorListener$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import java.lang.Throwable;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import java.io.IOException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$onAttach$1;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$AbsListenerInterceptor;
import com.kwai.video.player.IKwaiInjectHttpCallback;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetcher;
import com.kwai.video.player.kwai_player.Util;
import com.kwai.video.wayne.player.main.RetryMaxTimesError;
import com.kwai.video.wayne.player.datasource.IDatasource;
import com.kwai.video.wayne.player.datasource.NormalUrlDatasource;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$refreshCallback$1;
import com.kwai.video.wayne.player.multisource.switcher.FetchReason;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import com.kwai.video.wayne.player.main.NoFetcherError;
import android.os.Handler;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$2;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$3;
import com.kwai.video.wayne.player.main.ReachMaxRetryCountError;

public final class ErrorRetryProcessor extends AbsKpMidProcessor	// class@000d5f
{
    public final AwesomeCacheCallback mDebugInfoCallback;
    public String mErrorCode;
    public DataSourceFetcher mFetcher;
    public final AtomicBoolean mIsRetrying;
    public final ErrorRetryProcessor$mKwaiInjectHttpCallback$1 mKwaiInjectHttpCallback;
    public long mLastPositionOfErrorPlayer;
    public final OnPlayerLoadingChangedListener mLoadingChangedListener;
    public OmniRetryInfo mOmniRetryInfo;
    public final IMediaPlayer$OnErrorListener mOnErrorListener;
    public final RetryInfo mRetryInfo;
    public RetryStrategy mRetryStrategy;
    public boolean mShouldInterceptErrorListener;
    public PlayerState mTargetState;
    public int maxRetryCount;

    public void ErrorRetryProcessor(){
       super();
       InjectConfig config = InjectConfig.getConfig();
       a.o(config, "InjectConfig.getConfig\(\)");
       this.maxRetryCount = config.getSwitchProvider().getInt("nocdnretryTimes", 2);
       this.mRetryStrategy = new RetryStrategy(0, 0, 2, null);
       this.mRetryInfo = new RetryInfo();
       this.mIsRetrying = new AtomicBoolean(0);
       this.mTargetState = PlayerState.Playing;
       this.mOmniRetryInfo = new OmniRetryInfo();
       this.mErrorCode = "";
       this.mDebugInfoCallback = new ErrorRetryProcessor$mDebugInfoCallback$1(this);
       this.mLoadingChangedListener = new ErrorRetryProcessor$mLoadingChangedListener$1(this);
       this.mKwaiInjectHttpCallback = new ErrorRetryProcessor$mKwaiInjectHttpCallback$1(this);
       this.mOnErrorListener = new ErrorRetryProcessor$mOnErrorListener$1(this);
    }
    public final void clearErrorCode(){
       this.mErrorCode = "";
    }
    public final void doRetry(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor.class, "8")) {
          return;
       }
       this.doRetryWithPosition(-1);
       return;
    }
    public final void doRetryWithPosition(long p0){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.isSupport(uErrorRetryP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uErrorRetryP, "9")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "restart kernel player and target state "+this.mTargetState+"  autoStart "+this.getMediaPlayer().getAutoStart());
       int i = 1;
       this.getMediaPlayer().resetPlayer(i);
       uErrorRetryP = this.mRetryInfo;
       uErrorRetryP.setTotalRetryCount((uErrorRetryP.getTotalRetryCount() + i));
       WayneBuildData buildData = this.getMediaPlayer().getBuildData();
       if (p0 < 0) {
          ErrorRetryProcessor tmLastPositi = this.mLastPositionOfErrorPlayer;
       }
       buildData.setStartPosition(p0);
       if (this.mTargetState == PlayerState.Playing || this.getMediaPlayer().getAutoStart()) {
          this.getMediaPlayer().getBuildData().setStartPlayType(2);
       }
       try{
          this.getMediaPlayer().createPlayer(i);
          this.getMediaPlayer().prepareAsync();
          this.mOmniRetryInfo.onNewPlayerCreated(this.getMediaPlayer().getBuildData().getPlayIndex(), this.mLastPositionOfErrorPlayer);
          DebugLog.i(this.getLogTag(), "retry player prepareAsync");
       }catch(java.io.IOException e6){
          this.mRetryInfo.setError(e6);
          this.getMediaPlayer().notifyWaynePlayerError(this.mRetryInfo);
          DebugLog.i(this.getLogTag(), "retry error: "+e6.getMessage());
       }
       return;
    }
    public final String getErrorCode(){
       return this.mErrorCode;
    }
    public final String getLogTag(){
       String obj = PatchProxy.apply(null, this, ErrorRetryProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isAttach())? this.getMediaPlayer().getLogTag()+"::ErrorRetryProcessor": "ErrorRetryProcessor";
       return obj;
    }
    public final int getRetryCount(){
       Object obj = PatchProxy.apply(null, this, ErrorRetryProcessor.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.isAttach()) {
          return 0;
       }
       return this.getMediaPlayer().getBuildData().getPlayIndex();
    }
    public final String getRetryDebugInfo(){
       Object obj = PatchProxy.apply(null, this, ErrorRetryProcessor.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mOmniRetryInfo.getDescribe();
    }
    public final boolean hasNativeRetryed(int p0){
       IKwaiMediaPlayer obj;
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.isSupport(uErrorRetryP)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uErrorRetryP, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getMediaPlayer().getKernelPlayer();
       boolean b = true;
       if (obj == null || (obj.hasNativeCdnRetry() != b || !this.isNetError(p0))) {
          b = false;
       }
       return b;
    }
    public final boolean isNetError(int p0){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.isSupport(uErrorRetryP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uErrorRetryP, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0) {
          DebugLog.i(this.getLogTag(), "adapterErrorCode = "+p0+" ,net error manifest hordor has retryed , do nothing");
          return true;
       }else {
          return false;
       }
    }
    public final boolean isRetrying(){
       Object obj = PatchProxy.apply(null, this, ErrorRetryProcessor.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mIsRetrying.get();
    }
    public final void notifyPlayerError(int p0,int p1){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.isSupport(uErrorRetryP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uErrorRetryP, "2")) {
          return;
       }
       if (!p0 && p1 == -2403) {
          this.mKwaiInjectHttpCallback.onError(p1);
       }else {
          this.mOnErrorListener.onError(this.getMediaPlayer().getKernelPlayer(), p0, p1);
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor.class, "3")) {
          return;
       }
       this.getMediaPlayer().addErrorListenerInterceptor(new ErrorRetryProcessor$onAttach$1(this, this.mOnErrorListener));
       this.getMediaPlayer().setKwaiInjectHttpCallback(this.mKwaiInjectHttpCallback);
       this.getMediaPlayer().addAwesomeCallBack(this.mDebugInfoCallback);
       this.getMediaPlayer().addOnPlayerLoadingChangedListener(this.mLoadingChangedListener);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor.class, "10")) {
          return;
       }
       this.getMediaPlayer().removeAwesomeCallBack(this.mDebugInfoCallback);
       this.getMediaPlayer().removeOnPlayerLoadingChangedListener(this.mLoadingChangedListener);
       this.getMediaPlayer().setKwaiInjectHttpCallback(null);
       return;
    }
    public final void resetErrorRetry(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor.class, "13")) {
          return;
       }
       this.mIsRetrying.set(false);
       this.mRetryInfo.setError(null);
       this.mRetryInfo.setWhat(false);
       this.mRetryInfo.setExtra(false);
       this.mRetryInfo.setTotalRetryCount(false);
       this.mRetryInfo.setNotCDNRetryCount(false);
       this.mShouldInterceptErrorListener = false;
       this.mTargetState = PlayerState.Playing;
       this.mOmniRetryInfo = new OmniRetryInfo();
       ErrorRetryProcessor tmFetcher = this.mFetcher;
       if (tmFetcher != null) {
          tmFetcher.cancel();
       }
       return;
    }
    public final void retryPlaybackExternal(long p0){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.isSupport(uErrorRetryP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uErrorRetryP, "5")) {
          return;
       }
       this.mIsRetrying.set(true);
       this.doRetryWithPosition(p0);
       return;
    }
    public final void setDatasourceFetcher(DataSourceFetcher p0){
       this.mFetcher = p0;
    }
    public final void setRetryStrategy(RetryStrategy p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor.class, "12")) {
          return;
       }
       a.p(p0, "strategy");
       this.mRetryStrategy = p0;
       this.mRetryInfo.setSwitchStrategy(p0.getSwitchStrategy());
       return;
    }
    public final void tryToRetry(int p0,int p1){
       ErrorRetryProcessor tmRetryInfo;
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.isSupport(uErrorRetryP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uErrorRetryP, "4")) {
          return;
       }
       String str = (Util.isHttpForbiddenErrorInMediaPlayer(p0, p1) || p0 == 1001)? 1: null;
       if (this.mRetryInfo.getNotCDNRetryCount() > this.maxRetryCount) {
          this.mShouldInterceptErrorListener = false;
          DebugLog.i(this.getLogTag(), "retryed max times , do nothing");
          this.mRetryInfo.setError(new RetryMaxTimesError());
          this.getMediaPlayer().notifyWaynePlayerError(this.mRetryInfo);
          return;
       }else if(str == null && this.getMediaPlayer().getBuildData().getDataSourceModule() instanceof NormalUrlDatasource){
          this.mShouldInterceptErrorListener = false;
          DebugLog.i(this.getLogTag(), "µ¥normal url do not retry");
          this.mRetryInfo.setError(new RetryMaxTimesError());
          this.getMediaPlayer().notifyWaynePlayerError(this.mRetryInfo);
          return;
       }else {
          this.mIsRetrying.set(true);
          this.mOmniRetryInfo.onPlayerError(this.mRetryInfo.getExtra());
          if (str != null) {
             DebugLog.i(this.getLogTag(), "retry with refresh dataSource");
             this.mShouldInterceptErrorListener = true;
             ErrorRetryProcessor$tryToRetry$refreshCallback$1 otryToRetry$ = new ErrorRetryProcessor$tryToRetry$refreshCallback$1(this);
             if (this.mFetcher != null) {
                this.getMediaPlayer().setCancelDataSource$kp_mid_release(false);
                ErrorRetryProcessor tmFetcher = this.mFetcher;
                a.m(tmFetcher);
                tmFetcher.fetch(otryToRetry$, FetchReason.FetchReason_403);
             }else {
                this.mShouldInterceptErrorListener = false;
                DebugLog.e(this.getLogTag(), "need refresh dataSource, but have no fetcher");
                this.mRetryInfo.setError(new NoFetcherError());
                this.getMediaPlayer().notifyWaynePlayerError(this.mRetryInfo);
                this.mIsRetrying.set(false);
             }
             return;
          }else {
             String str1 = "retry with current cdn url. times=";
             if (!this.mRetryStrategy.getSwitchStrategy()) {
                if (!this.hasNativeRetryed(p1)) {
                   this.mShouldInterceptErrorListener = true;
                   DebugLog.i(this.getLogTag(), str1+this.mRetryInfo.getNotCDNRetryCount());
                   tmRetryInfo = this.mRetryInfo;
                   tmRetryInfo.setNotCDNRetryCount((tmRetryInfo.getNotCDNRetryCount() + true));
                   this.getMediaPlayer().getHandler().post(new ErrorRetryProcessor$tryToRetry$1(this));
                }else {
                   this.mShouldInterceptErrorListener = false;
                   DebugLog.i(this.getLogTag(), "navive has done cdn retry , do nothing");
                   this.mRetryInfo.setError(new RetryMaxTimesError());
                   this.getMediaPlayer().notifyWaynePlayerError(this.mRetryInfo);
                }
             }else if(this.mRetryStrategy.getSwitchStrategy() == -2){
                this.mShouldInterceptErrorListener = true;
                DebugLog.i(this.getLogTag(), str1+this.mRetryInfo.getNotCDNRetryCount());
                tmRetryInfo = this.mRetryInfo;
                tmRetryInfo.setNotCDNRetryCount((tmRetryInfo.getNotCDNRetryCount() + true));
                this.getMediaPlayer().getHandler().post(new ErrorRetryProcessor$tryToRetry$2(this));
             }else if(this.mRetryStrategy.getSwitchStrategy() == -1){
                DebugLog.i(this.getLogTag(), "retry with traffic free url strategy");
                if (this.mRetryStrategy.getTrafficFreeUrlMaxRetryCount() > 0) {
                   tmRetryInfo = this.mRetryStrategy;
                   tmRetryInfo.setTrafficFreeUrlMaxRetryCount((tmRetryInfo.getTrafficFreeUrlMaxRetryCount() - true));
                   this.mShouldInterceptErrorListener = true;
                   this.getMediaPlayer().getHandler().post(new ErrorRetryProcessor$tryToRetry$3(this));
                }else {
                   DebugLog.i(this.getLogTag(), "retry count more than max count");
                   this.mShouldInterceptErrorListener = false;
                   this.mRetryInfo.setError(new ReachMaxRetryCountError());
                   this.getMediaPlayer().notifyWaynePlayerError(this.mRetryInfo);
                }
             }
             return;
          }
       }
    }
}
