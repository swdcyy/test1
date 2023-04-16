package com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$1;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$ListenerInterceptorStore;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.OnInfoExtra;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import java.lang.Class;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$AbsListenerInterceptor;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.Set;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IKwaiInjectHttpCallback;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.IMediaPlayer$OnRenderingStartListener;
import com.kwai.video.player.IMediaPlayer$OnDecodeFirstFrameListener;
import com.kwai.video.player.IMediaPlayer$OnInfoExtraListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.wayne.player.listeners.OnSeekListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnFftDataCaptureListener;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.callback.AwesomeCacheCallbackWrapper;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.wayne.player.listeners.OnFirstFrameListener;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.video.wayne.player.listeners.OnProgressChangeListener;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.wayne.player.listeners.OnStopListener;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.main._0_AbstractPlayerHolder;
import fw7.m;
import com.kwai.video.player.IKwaiSubtitleListener;
import com.kwai.video.player.IKwaiMediaPlayer;
import fw7.g;
import fw7.f;
import fw7.b;
import fw7.h;
import fw7.k;
import fw7.c;
import fw7.i;
import fw7.l;
import fw7.j;
import fw7.d;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$2;
import com.kwai.video.player.IKwaiRepresentationListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnVideoRenderListener;
import fw7.a;
import fw7.e;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.wayne.player.main.RetryInfo;
import java.lang.Long;
import com.kwai.video.player.CdnEventLogCallback;
import com.kwai.video.player.IKwaiVodDrmCallback;
import com.kwai.video.player.OnQosEventInfoListener;

public abstract class _2_AbstractPlayerListenerDelegate extends _1_AbstractMediaPlayerApiDelegate implements IPlayerListener	// class@000dab
{
    public final AwesomeCacheCallbackWrapper mAwesomeCallbackWrapper;
    public IKwaiInjectHttpCallback mKwaiInjectHttpCallback;
    public IKwaiSubtitleListener mKwaiSubtitleListener;
    public final _2_AbstractPlayerListenerDelegate$ListenerInterceptorStore mListenerInterceptorStore;
    public final Set mOnAbLoopEndOfCounterListeners;
    public final Set mOnBufferingUpdateListeners;
    public final Set mOnCompletionListeners;
    public final Set mOnDecodeFirstFrameListener;
    public final Set mOnErrorListeners;
    public final Set mOnFftDataCaptureListeners;
    public final Set mOnFirstFrameListener;
    public final Set mOnInfoExtraListeners;
    public final Set mOnInfoListeners;
    public final Set mOnPauseListeners;
    public final Set mOnPreparedListeners;
    public final Set mOnProgressChangeListeners;
    public final Set mOnRenderingStartListener;
    public final Set mOnSeekCompleteListeners;
    public final Set mOnSeekListeners;
    public final Set mOnStartListeners;
    public final Set mOnStopListeners;
    public final Set mOnVideoSizeChangedListeners;
    public final Set mOnWayneErrorListeners;
    public IKwaiRepresentationListener mTmpRepresentationListener;
    public WayneBuildData mWayneBuildData;
    public IKwaiMediaPlayer$OnVideoRenderListener videoRenderListener;
    public static String logTag = "_2_AbstractPlayerListenerDelegate";

    public void _2_AbstractPlayerListenerDelegate(){
       super();
       this.mOnPreparedListeners = new CopyOnWriteArraySet();
       this.mOnCompletionListeners = new CopyOnWriteArraySet();
       this.mOnBufferingUpdateListeners = new CopyOnWriteArraySet();
       this.mOnSeekCompleteListeners = new CopyOnWriteArraySet();
       this.mOnWayneErrorListeners = new CopyOnWriteArraySet();
       this.mOnInfoListeners = new CopyOnWriteArraySet();
       this.mOnRenderingStartListener = new CopyOnWriteArraySet();
       this.mOnDecodeFirstFrameListener = new CopyOnWriteArraySet();
       this.mOnErrorListeners = new CopyOnWriteArraySet();
       this.mOnFftDataCaptureListeners = new CopyOnWriteArraySet();
       this.mOnVideoSizeChangedListeners = new CopyOnWriteArraySet();
       this.mOnInfoExtraListeners = new CopyOnWriteArraySet();
       this.mOnProgressChangeListeners = new CopyOnWriteArraySet();
       this.mOnAbLoopEndOfCounterListeners = new CopyOnWriteArraySet();
       this.mOnPauseListeners = new CopyOnWriteArraySet();
       this.mOnStartListeners = new CopyOnWriteArraySet();
       this.mOnSeekListeners = new CopyOnWriteArraySet();
       this.mOnStopListeners = new CopyOnWriteArraySet();
       this.mOnFirstFrameListener = new CopyOnWriteArraySet();
       this.mAwesomeCallbackWrapper = new _2_AbstractPlayerListenerDelegate$1(this);
       this.mListenerInterceptorStore = new _2_AbstractPlayerListenerDelegate$ListenerInterceptorStore();
    }
    public static boolean B(_2_AbstractPlayerListenerDelegate p0,int p1){
       return p0.lambda$attachListeners$11(p1);
    }
    public static void I(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1){
       p0.lambda$attachListeners$6(p1);
    }
    public static void J(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1){
       p0.lambda$attachListeners$12(p1);
    }
    public static void K(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1){
       p0.lambda$attachListeners$0(p1);
    }
    public static void L(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1,int p2,int p3){
       p0.lambda$attachListeners$4(p1, p2, p3);
    }
    public static void M(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1,int p2,int p3,int p4,int p5){
       p0.lambda$attachListeners$10(p1, p2, p3, p4, p5);
    }
    public static void N(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1,int p2,int p3){
       p0.lambda$attachListeners$3(p1, p2, p3);
    }
    public static void O(_2_AbstractPlayerListenerDelegate p0,float[] p1){
       p0.lambda$attachListeners$9(p1);
    }
    public static boolean a(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1,int p2,int p3){
       return p0.lambda$attachListeners$8(p1, p2, p3);
    }
    public static void c(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1){
       p0.lambda$attachListeners$1(p1);
    }
    public static boolean f(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1,int p2,OnInfoExtra p3){
       return p0.lambda$attachListeners$5(p1, p2, p3);
    }
    public static boolean g(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1,int p2,int p3){
       return p0.lambda$attachListeners$7(p1, p2, p3);
    }
    private void lambda$attachListeners$0(IMediaPlayer p0){
       Iterator iterator;
       List list = this.mListenerInterceptorStore.get(IMediaPlayer$OnPreparedListener.class);
       if (list != null) {
          iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor uAbsListener = iterator.next();
                uAbsListener.getListener().onPrepared(p0);
                if (uAbsListener.intercepted()) {
                   DebugLog.i("IKpMidKwaiMediaPlayer", uAbsListener+"intercepted OnPreparedListener");
                   return;
                }
             }
          }
          return;
       }
       iterator = this.mOnPreparedListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPrepared(p0);
       }
    }
    private void lambda$attachListeners$1(IMediaPlayer p0){
       Iterator iterator;
       List list = this.mListenerInterceptorStore.get(IMediaPlayer$OnCompletionListener.class);
       if (list != null) {
          iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor uAbsListener = iterator.next();
                uAbsListener.getListener().onCompletion(p0);
                if (uAbsListener.intercepted()) {
                   DebugLog.i("IKpMidKwaiMediaPlayer", uAbsListener+"intercepted onCompletion");
                   return;
                }
             }
          }
          return;
       }
       iterator = this.mOnCompletionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onCompletion(p0);
       }
    }
    private void lambda$attachListeners$10(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       Iterator iterator = this.mOnVideoSizeChangedListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onVideoSizeChanged(p0, p1, p2, p3, p4);
       }
       return;
    }
    private boolean lambda$attachListeners$11(int p0){
       _2_AbstractPlayerListenerDelegate tmKwaiInject = this.mKwaiInjectHttpCallback;
       if (tmKwaiInject == null) {
          return false;
       }
       return tmKwaiInject.onError(p0);
    }
    private void lambda$attachListeners$12(IMediaPlayer p0){
       Iterator iterator = this.mOnAbLoopEndOfCounterListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onABLoopEndOfCounter(p0);
       }
       return;
    }
    private void lambda$attachListeners$2(IMediaPlayer p0,int p1){
       Iterator iterator = this.mOnBufferingUpdateListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onBufferingUpdate(p0, p1);
       }
       return;
    }
    private void lambda$attachListeners$3(IMediaPlayer p0,int p1,int p2){
       Iterator iterator = this.mOnRenderingStartListener.iterator();
       while (iterator.hasNext()) {
          iterator.next().onRenderingStart(p0, p1, p2);
       }
       return;
    }
    private void lambda$attachListeners$4(IMediaPlayer p0,int p1,int p2){
       Iterator iterator = this.mOnDecodeFirstFrameListener.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDecodeFirstFrame(p0, p1, p2);
       }
       return;
    }
    private boolean lambda$attachListeners$5(IMediaPlayer p0,int p1,OnInfoExtra p2){
       Iterator iterator = this.mOnInfoExtraListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().OnInfoExtra(p0, p1, p2);
       }
       return false;
    }
    private void lambda$attachListeners$6(IMediaPlayer p0){
       Iterator iterator = this.mOnSeekCompleteListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSeekComplete(p0);
       }
       Iterator iterator1 = this.mOnSeekListeners.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().onSeekComplete();
       }
       return;
    }
    private boolean lambda$attachListeners$7(IMediaPlayer p0,int p1,int p2){
       this.dispatchError(p0, p1, p2);
       return true;
    }
    private boolean lambda$attachListeners$8(IMediaPlayer p0,int p1,int p2){
       Iterator iterator;
       String str = "IKpMidKwaiMediaPlayer";
       DebugLog.i(str, "onInfo var1:"+p1+" var2: "+p2);
       List list = this.mListenerInterceptorStore.get(IMediaPlayer$OnInfoListener.class);
       if (list != null) {
          iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor uAbsListener = iterator.next();
                uAbsListener.getListener().onInfo(p0, p1, p2);
                if (uAbsListener.intercepted()) {
                   DebugLog.i(str, uAbsListener+"intercepted onInfo");
                   return true;
                }
             }
          }
          return true;
       }
       iterator = this.mOnInfoListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onInfo(p0, p1, p2);
       }
    }
    private void lambda$attachListeners$9(float[] p0){
       Iterator iterator = this.mOnFftDataCaptureListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onFftDataCapture(p0);
       }
       return;
    }
    public static void w(_2_AbstractPlayerListenerDelegate p0,IMediaPlayer p1,int p2){
       p0.lambda$attachListeners$2(p1, p2);
    }
    public void addAwesomeCallBack(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "48")) {
          return;
       }
       this.mAwesomeCallbackWrapper.add(p0);
       return;
    }
    public void addAwesomeNoClearCallBack(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "49")) {
          return;
       }
       this.mAwesomeCallbackWrapper.addNoClearCallBacks(p0);
       return;
    }
    public void addCompletionListenerInterceptor(_2_AbstractPlayerListenerDelegate$AbsListenerInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "14")) {
          return;
       }
       this.mListenerInterceptorStore.put(IMediaPlayer$OnCompletionListener.class, p0);
       return;
    }
    public void addErrorListenerInterceptor(_2_AbstractPlayerListenerDelegate$AbsListenerInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "26")) {
          return;
       }
       this.mListenerInterceptorStore.put(IMediaPlayer$OnErrorListener.class, p0);
       return;
    }
    public void addInfoListenerInterceptor(_2_AbstractPlayerListenerDelegate$AbsListenerInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "30")) {
          return;
       }
       this.mListenerInterceptorStore.put(IMediaPlayer$OnInfoListener.class, p0);
       return;
    }
    public void addOnABLoopEndOfCounterListener(IMediaPlayer$OnABLoopEndOfCounterListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "54")) {
          return;
       }
       this.mOnAbLoopEndOfCounterListeners.add(p0);
       return;
    }
    public void addOnBufferingUpdateListener(IMediaPlayer$OnBufferingUpdateListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "22")) {
          return;
       }
       this.mOnBufferingUpdateListeners.add(p0);
       return;
    }
    public void addOnCompletionListener(IMediaPlayer$OnCompletionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "13")) {
          return;
       }
       this.mOnCompletionListeners.add(p0);
       return;
    }
    public void addOnDecodeFirstFrameListener(IMediaPlayer$OnDecodeFirstFrameListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "19")) {
          return;
       }
       this.mOnDecodeFirstFrameListener.add(p0);
       return;
    }
    public void addOnErrorListener(IMediaPlayer$OnErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "9")) {
          return;
       }
       this.mOnErrorListeners.add(p0);
       return;
    }
    public void addOnFftDataCaptureListener(IMediaPlayer$OnFftDataCaptureListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "32")) {
          return;
       }
       this.mOnFftDataCaptureListeners.add(p0);
       return;
    }
    public void addOnFirstFrameListener(OnFirstFrameListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "43")) {
          return;
       }
       this.mOnFirstFrameListener.add(p0);
       return;
    }
    public void addOnInfoExtraListener(IMediaPlayer$OnInfoExtraListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "20")) {
          return;
       }
       this.mOnInfoExtraListeners.add(p0);
       return;
    }
    public void addOnInfoListener(IMediaPlayer$OnInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "29")) {
          return;
       }
       this.mOnInfoListeners.add(p0);
       return;
    }
    public void addOnPauseListener(OnPauseListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "38")) {
          return;
       }
       this.mOnPauseListeners.add(p0);
       return;
    }
    public void addOnPreparedListener(IMediaPlayer$OnPreparedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "8")) {
          return;
       }
       this.mOnPreparedListeners.add(p0);
       return;
    }
    public void addOnProgressChangeListener(OnProgressChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "36")) {
          return;
       }
       this.mOnProgressChangeListeners.add(p0);
       return;
    }
    public void addOnRenderingStartListener(IMediaPlayer$OnRenderingStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "18")) {
          return;
       }
       this.mOnRenderingStartListener.add(p0);
       return;
    }
    public void addOnSeekCompleteListener(IMediaPlayer$OnSeekCompleteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "24")) {
          return;
       }
       this.mOnSeekCompleteListeners.add(p0);
       return;
    }
    public void addOnSeekListener(OnSeekListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "47")) {
          return;
       }
       this.mOnSeekListeners.add(p0);
       return;
    }
    public void addOnStartListener(OnStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "41")) {
          return;
       }
       this.mOnStartListeners.add(p0);
       return;
    }
    public void addOnStopListener(OnStopListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "45")) {
          return;
       }
       this.mOnStopListeners.add(p0);
       return;
    }
    public void addOnVideoSizeChangedListener(IMediaPlayer$OnVideoSizeChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "34")) {
          return;
       }
       this.mOnVideoSizeChangedListeners.add(p0);
       return;
    }
    public void addOnWayneErrorListener(OnWayneErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "27")) {
          return;
       }
       this.mOnWayneErrorListeners.add(p0);
       return;
    }
    public void addPreparedListenerInterceptor(_2_AbstractPlayerListenerDelegate$AbsListenerInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "11")) {
          return;
       }
       this.mListenerInterceptorStore.put(IMediaPlayer$OnPreparedListener.class, p0);
       return;
    }
    public synchronized void attachListeners(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "3")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP == null) {
          DebugLog.e("IKpMidKwaiMediaPlayer", "[attachListeners]mKwaiMediaPlayer is null");
          return;
       }else {
          this.mWayneBuildData = p0;
          tmKwaiMediaP.setOnPreparedListener(new m(this));
          this.mKwaiMediaPlayer.setKwaiSubtitleListener(this.mKwaiSubtitleListener);
          this.mKwaiMediaPlayer.setOnCompletionListener(new g(this));
          this.mKwaiMediaPlayer.setOnBufferingUpdateListener(new f(this));
          this.mKwaiMediaPlayer.setOnRenderingStartListener(new b(this));
          this.mKwaiMediaPlayer.setOnDecodeFirstFrameListener(new h(this));
          this.mKwaiMediaPlayer.setOnInfoExtraListener(new k(this));
          this.mKwaiMediaPlayer.setOnSeekCompleteListener(new c(this));
          this.mKwaiMediaPlayer.setOnErrorListener(new i(this));
          this.mKwaiMediaPlayer.setOnInfoListener(new l(this));
          this.mKwaiMediaPlayer.setOnFftDataCaptureListener(new j(this));
          this.mKwaiMediaPlayer.setOnVideoSizeChangedListener(new d(this));
          if (this.mKwaiMediaPlayer.getAspectAwesomeCache() != null) {
             this.mKwaiMediaPlayer.getAspectAwesomeCache().setAwesomeCacheCallback(this.mAwesomeCallbackWrapper);
          }
          this.mKwaiMediaPlayer.setKwaiRepresentationListener(new _2_AbstractPlayerListenerDelegate$2(this));
          this.mKwaiMediaPlayer.setOnVideoRenderListener(this.videoRenderListener);
          this.mKwaiMediaPlayer.setKwaiInjectHttpCallback(new a(this));
          this.mKwaiMediaPlayer.setOnABLoopEndOfCounterListener(new e(this));
          return;
       }
    }
    public void clearListeners(){
       if (PatchProxy.applyVoid(null, this, _2_AbstractPlayerListenerDelegate.class, "1")) {
          return;
       }
       this.mOnPreparedListeners.clear();
       this.mOnCompletionListeners.clear();
       this.mOnBufferingUpdateListeners.clear();
       this.mOnSeekCompleteListeners.clear();
       this.mOnWayneErrorListeners.clear();
       this.mOnErrorListeners.clear();
       this.mOnInfoListeners.clear();
       this.mOnRenderingStartListener.clear();
       this.mOnDecodeFirstFrameListener.clear();
       this.mOnFftDataCaptureListeners.clear();
       this.mOnVideoSizeChangedListeners.clear();
       this.mAwesomeCallbackWrapper.clear();
       this.mOnInfoExtraListeners.clear();
       this.mOnSeekListeners.clear();
       this.mOnStartListeners.clear();
       this.mOnPauseListeners.clear();
       this.mOnFirstFrameListener.clear();
       this.mOnProgressChangeListeners.clear();
       this.mOnAbLoopEndOfCounterListeners.clear();
       return;
    }
    public synchronized void dettachListeners(){
       if (PatchProxy.applyVoid(null, this, _2_AbstractPlayerListenerDelegate.class, "2")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP == null) {
          return;
       }
       tmKwaiMediaP.setOnErrorListener(null);
       this.mKwaiMediaPlayer.setOnCompletionListener(null);
       this.mKwaiMediaPlayer.setOnPreparedListener(null);
       this.mKwaiMediaPlayer.setOnInfoListener(null);
       this.mKwaiMediaPlayer.setOnSeekCompleteListener(null);
       this.mKwaiMediaPlayer.setOnBufferingUpdateListener(null);
       this.mKwaiMediaPlayer.setOnRenderingStartListener(null);
       this.mKwaiMediaPlayer.setOnDecodeFirstFrameListener(null);
       this.mKwaiMediaPlayer.setOnInfoExtraListener(null);
       return;
    }
    public void dispatchError(IMediaPlayer p0,int p1,int p2){
       Iterator iterator;
       if (PatchProxy.isSupport(_2_AbstractPlayerListenerDelegate.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, _2_AbstractPlayerListenerDelegate.class, "4")) {
          return;
       }
       List list = this.mListenerInterceptorStore.get(IMediaPlayer$OnErrorListener.class);
       if (list != null) {
          iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor uAbsListener = iterator.next();
                DebugLog.i(_2_AbstractPlayerListenerDelegate.logTag, "dispatchError inteceptor:"+uAbsListener.getClass());
                uAbsListener.getListener().onError(p0, p1, p2);
                if (uAbsListener.intercepted()) {
                   return;
                }
                continue ;
             }
          }
          return;
       }
       iterator = this.mOnErrorListeners.iterator();
       while (iterator.hasNext()) {
          IMediaPlayer$OnErrorListener onErrorListe = iterator.next();
          DebugLog.i(_2_AbstractPlayerListenerDelegate.logTag, "dispatchError onErrorListener:"+onErrorListe.getClass());
          onErrorListe.onError(p0, p1, p2);
       }
    }
    public boolean hasProgressChangeListener(){
       Object obj = PatchProxy.apply(null, this, _2_AbstractPlayerListenerDelegate.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mOnProgressChangeListeners.size() > 0)? true: false;
       return b;
    }
    public void notifyWaynePlayerError(RetryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "5")) {
          return;
       }
       Iterator iterator = this.mOnWayneErrorListeners.iterator();
       while (iterator.hasNext()) {
          OnWayneErrorListener onWayneError = iterator.next();
          DebugLog.i(_2_AbstractPlayerListenerDelegate.logTag, "dispatchError onWayneErrorListener:"+onWayneError.getClass());
          onWayneError.onWayneError(p0);
       }
       return;
    }
    public void notifyWaynePlayerProgressChange(Long p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, _2_AbstractPlayerListenerDelegate.class, "6")) {
          return;
       }
       Iterator iterator = this.mOnProgressChangeListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onVideoProgressChanged(p0, p1);
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, _2_AbstractPlayerListenerDelegate.class, "59")) {
          return;
       }
       super.pause();
       Iterator iterator = this.mOnPauseListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPause();
       }
       return;
    }
    public void removeAwesomeCallBack(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "50")) {
          return;
       }
       this.mAwesomeCallbackWrapper.remove(p0);
       return;
    }
    public void removeAwesomeNoClearCallBack(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "51")) {
          return;
       }
       this.mAwesomeCallbackWrapper.removeNoClearCallBacks(p0);
       return;
    }
    public void removeOnABLoopEndOfCounterListener(IMediaPlayer$OnABLoopEndOfCounterListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "55")) {
          return;
       }
       this.mOnAbLoopEndOfCounterListeners.remove(p0);
       return;
    }
    public void removeOnBufferingUpdateListener(IMediaPlayer$OnBufferingUpdateListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "23")) {
          return;
       }
       this.mOnBufferingUpdateListeners.remove(p0);
       return;
    }
    public void removeOnCompletionListener(IMediaPlayer$OnCompletionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "21")) {
          return;
       }
       this.mOnCompletionListeners.remove(p0);
       return;
    }
    public void removeOnDecodeFirstFrameListener(IMediaPlayer$OnDecodeFirstFrameListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "17")) {
          return;
       }
       this.mOnDecodeFirstFrameListener.remove(p0);
       return;
    }
    public void removeOnErrorListener(IMediaPlayer$OnErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "10")) {
          return;
       }
       this.mOnErrorListeners.remove(p0);
       return;
    }
    public void removeOnFftDataCaptureListener(IMediaPlayer$OnFftDataCaptureListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "33")) {
          return;
       }
       this.mOnFftDataCaptureListeners.remove(p0);
       return;
    }
    public void removeOnFirstFrameListener(OnFirstFrameListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "44")) {
          return;
       }
       this.mOnFirstFrameListener.remove(p0);
       return;
    }
    public void removeOnInfoExtraListener(IMediaPlayer$OnInfoExtraListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "15")) {
          return;
       }
       this.mOnInfoExtraListeners.remove(p0);
       return;
    }
    public void removeOnInfoListener(IMediaPlayer$OnInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "31")) {
          return;
       }
       this.mOnInfoListeners.remove(p0);
       return;
    }
    public void removeOnPauseListener(OnPauseListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "39")) {
          return;
       }
       this.mOnPauseListeners.remove(p0);
       return;
    }
    public void removeOnPreparedListener(IMediaPlayer$OnPreparedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "12")) {
          return;
       }
       this.mOnPreparedListeners.remove(p0);
       return;
    }
    public void removeOnProgressChangeListener(OnProgressChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "37")) {
          return;
       }
       this.mOnProgressChangeListeners.remove(p0);
       return;
    }
    public void removeOnRenderingStartListener(IMediaPlayer$OnRenderingStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "16")) {
          return;
       }
       this.mOnRenderingStartListener.remove(p0);
       return;
    }
    public void removeOnSeekCompleteListener(IMediaPlayer$OnSeekCompleteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "25")) {
          return;
       }
       this.mOnSeekCompleteListeners.remove(p0);
       return;
    }
    public void removeOnSeekListener(OnSeekListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "46")) {
          return;
       }
       this.mOnSeekListeners.remove(p0);
       return;
    }
    public void removeOnStartListener(OnStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "40")) {
          return;
       }
       this.mOnStartListeners.remove(p0);
       return;
    }
    public void removeOnStopListener(OnStopListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "42")) {
          return;
       }
       this.mOnStopListeners.remove(p0);
       return;
    }
    public void removeOnVideoSizeChangedListener(IMediaPlayer$OnVideoSizeChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "35")) {
          return;
       }
       this.mOnVideoSizeChangedListeners.remove(p0);
       return;
    }
    public void removeOnWayneErrorListener(OnWayneErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "28")) {
          return;
       }
       this.mOnWayneErrorListeners.remove(p0);
       return;
    }
    public void seekTo(long p0){
       _2_AbstractPlayerListenerDelegate _2_AbstractP = _2_AbstractPlayerListenerDelegate.class;
       if (PatchProxy.isSupport(_2_AbstractP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, _2_AbstractP, "58")) {
          return;
       }
       super.seekTo(p0);
       Iterator iterator = this.mOnSeekListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSeekStart();
       }
       return;
    }
    public void setCdnEventLogCallBack(CdnEventLogCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "52")) {
          return;
       }
       this.mAwesomeCallbackWrapper.addNoClearCallBacks(p0);
       return;
    }
    public void setKwaiAudioRepresentationListener(IKwaiRepresentationListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "53")) {
          return;
       }
       this.mKwaiMediaPlayer.setKwaiAudioRepresentationListener(p0);
       return;
    }
    public void setKwaiInjectHttpCallback(IKwaiInjectHttpCallback p0){
       this.mKwaiInjectHttpCallback = p0;
    }
    public void setKwaiRepresentationListener(IKwaiRepresentationListener p0){
       this.mTmpRepresentationListener = p0;
    }
    public void setKwaiSubtitleListener(IKwaiSubtitleListener p0){
       this.mKwaiSubtitleListener = p0;
    }
    public void setKwaiVodDrmCallback(IKwaiVodDrmCallback p0){
    }
    public void setOnQosEventInfoListener(OnQosEventInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "56")) {
          return;
       }
       this.mKwaiMediaPlayer.setOnQosEventInfoListener(p0);
       return;
    }
    public void setOnVideoRenderListener(IKwaiMediaPlayer$OnVideoRenderListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate.class, "57")) {
          return;
       }
       this.videoRenderListener = p0;
       this.mKwaiMediaPlayer.setOnVideoRenderListener(p0);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, _2_AbstractPlayerListenerDelegate.class, "60")) {
          return;
       }
       super.start();
       Iterator iterator = this.mOnStartListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onStart();
       }
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, _2_AbstractPlayerListenerDelegate.class, "61")) {
          return;
       }
       super.stop();
       Iterator iterator = this.mOnStopListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onStop();
       }
       return;
    }
}
