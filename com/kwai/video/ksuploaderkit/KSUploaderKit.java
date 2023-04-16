package com.kwai.video.ksuploaderkit.KSUploaderKit;
import android.content.Context;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import c97.d;
import h97.d;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.lang.reflect.Type;
import com.kwai.video.ksuploaderkit.retry.RetryController;
import com.kwai.video.ksuploaderkit.utils.KitUtils;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.utils.FileUtils;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKit$6;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import com.kwai.video.ksuploaderkit.uploader.RickonUploader;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadSetting;
import com.kwai.video.ksuploaderkit.uploader.HttpUploader;
import com.kwai.video.ksuploaderkit.uploader.IUploader$EventListener;
import com.kwai.video.ksuploaderkit.KSUploaderKit$8;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BitrateType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.video.ksuploaderkit.utils.NetUtils;
import com.kwai.video.ksuploaderkit.KSUploaderKit$5;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKit$9;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.Integer;
import com.kwai.video.ksuploaderkit.KSUploaderKit$16;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;
import java.lang.Double;
import com.kwai.video.ksuploaderkit.KSUploaderKit$15;
import com.kwai.video.ksuploaderkit.KSUploaderKitTaskListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.ksuploaderkit.KSUploaderKit$12;
import com.kwai.video.ksuploaderkit.KSUploaderKit$11;
import com.kwai.video.ksuploaderkit.KSUploaderKit$10;
import com.kwai.video.ksuploaderkit.KSUploaderKit$14;
import com.kwai.video.ksuploaderkit.KSUploaderKitEndPointAgent;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import com.kwai.video.ksuploaderkit.KSUploaderKit$3;
import com.kwai.video.ksuploaderkit.apicenter.IApiManagerListener;
import java.util.List;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import com.kwai.video.ksuploaderkit.KSUploaderKit$2;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.video.ksuploaderkit.KSUploaderKit$1;
import com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import com.kwai.video.ksuploaderkit.KSUploaderKit$13;
import com.kwai.video.ksuploaderkit.KSUploaderKit$4;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKit$7;

public class KSUploaderKit	// class@000969
{
    public ApiManager mApiManager;
    public KSUploaderKitConfig mConfig;
    public PublishConfig mConfigParam;
    public Context mContext;
    public long mCoverSize;
    public double mFileProgressWeight;
    public long mFileSize;
    public boolean mFragmentFinished;
    public ArrayList mFragmentList;
    public KSUploaderKitEventListener mKitEventListener;
    public final Object mLock;
    public LogReporter mLogReporter;
    public final Handler mMainHandler;
    public PublishLogInfo mPublishLogInfo;
    public RetryController mRetryController;
    public KitUtils$State mState;
    public ConcurrentHashMap mTaskListeners;
    public Handler mThreadHandler;
    public double mTotalPercent;
    public String mUploadType;
    public IUploader mUploader;
    public IUploader$EventListener mUploaderEventListener;
    public static double fileProgressWeight = 0.970000;

    public void KSUploaderKit(Context p0,KSUploaderKitConfig p1){
       super();
       this.mState = KitUtils$State.Unknown;
       double d = 0x3ff0000000000000;
       this.mFileProgressWeight = d;
       this.mTotalPercent = 0;
       this.mLock = new Object();
       this.mFragmentList = new ArrayList();
       boolean b = false;
       this.mFragmentFinished = b;
       this.mTaskListeners = new ConcurrentHashMap();
       HandlerThread handlerThrea = new HandlerThread("KSUploaderKitThread");
       handlerThrea.start();
       this.mThreadHandler = new Handler(handlerThrea.getLooper());
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mContext = p0;
       this.mConfig = p1;
       PublishLogInfo publishLogIn = new PublishLogInfo();
       this.mPublishLogInfo = publishLogIn;
       publishLogIn.setKSUploaderKitConfig(p1);
       KSUploaderKitCommon$BusinessType kSUploaderKi = KSUploaderKitCommon$BusinessType.KSUploaderKit;
       this.mPublishLogInfo.setBusinessType(kSUploaderKi);
       this.mPublishLogInfo.setEndPointType(kSUploaderKi);
       this.mPublishLogInfo.setChannelType(this.mConfig.getUploadChannelType());
       this.mLogReporter = new LogReporter(p1.getSessionID());
       ApiManager uApiManager = new ApiManager(p0, p1);
       this.mApiManager = uApiManager;
       uApiManager.setLogReporter(this.mLogReporter);
       PublishConfig publishConfi = d.a().c().a("ksuploaderkit", PublishConfig.class);
       this.mConfigParam = publishConfi;
       if (publishConfi == null) {
          this.mConfigParam = new PublishConfig();
       }
       String uploadType = this.mConfigParam.getUploadType();
       this.mUploadType = uploadType;
       this.mPublishLogInfo.setUploadType(uploadType);
       this.mRetryController = new RetryController(this.mConfigParam);
       if (KitUtils.isValidConfig(p1)) {
          KSUploaderKitCommon$MediaType mediaType = this.mConfig.getMediaType();
          KSUploaderKitCommon$UploadMode uploadMode = this.mConfig.getUploadMode();
          if (uploadMode == KSUploaderKitCommon$UploadMode.Whole) {
             this.mFileSize = FileUtils.getFileSize(this.mConfig.getFilePath());
             long fileSize = FileUtils.getFileSize(this.mConfig.getCoverPath());
             this.mCoverSize = fileSize;
             KSUploaderKit tmFileSize = this.mFileSize;
             this.mFileProgressWeight = ((double)tmFileSize * d) / (double)(tmFileSize + fileSize);
          }else if(this.mConfig.getMediaType() == KSUploaderKitCommon$MediaType.VideoWithCover){
             b = true;
          }
          if (b) {
             d = KSUploaderKit.fileProgressWeight;
          }
          this.mFileProgressWeight = d;
          KSUploaderKitLog.i("KSUploaderKit", "mediaType : "+mediaType+", uploadMode : "+uploadMode+", enableResume : "+this.mConfig.getEnableResume());
       }else {
          KSUploaderKitLog.i("KSUploaderKit", "config is invalid");
       }
       this.mState = KitUtils$State.Init;
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "11")) {
          return;
       }
       this.cancel(null);
       return;
    }
    public void cancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKit.class, "12")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mThreadHandler.post(new KSUploaderKit$6(this, p0));
       _monitor_exit(tmLock);
       return;
    }
    public void createUploader(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSUploaderKit.class, "1")) {
          return;
       }
       KSUploaderKit tmUploader = this.mUploader;
       if (tmUploader != null) {
          tmUploader.release();
          this.mUploader = objArray;
       }
       String str = "http";
       if ((this.mUploadType).equalsIgnoreCase(str) || this.mApiManager.getPreferHTTP()) {
          this.mUploadType = str;
          this.mUploader = new HttpUploader(this.mContext, this.mConfig.setting().uploadChannelType(), this.mConfig.getUploadMode(), this.mApiManager);
       }else {
          this.mUploadType = "rickon";
          this.mUploader = new RickonUploader(this.mContext, this.mConfig.setting().uploadChannelType(), this.mConfig.getUploadMode(), this.mApiManager);
       }
       this.mUploader.setConfig(this.mConfigParam);
       this.mUploader.setLogReporter(this.mLogReporter);
       tmUploader = this.mUploaderEventListener;
       if (tmUploader != null) {
          this.mUploader.setEventListener(tmUploader);
       }
       this.setupUploaderTaskListener();
       this.mPublishLogInfo.setUploadType(this.mUploadType);
       return;
    }
    public void finishUploadSegment(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "14")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mThreadHandler.post(new KSUploaderKit$8(this));
       _monitor_exit(tmLock);
       return;
    }
    public int getBitrate(KSUploaderKitCommon$BitrateType p0){
       KSUploaderKit obj = PatchProxy.applyOneRefs(p0, this, KSUploaderKit.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       KSUploaderKit tmUploader = this.mUploader;
       if (tmUploader != null) {
          _monitor_exit(obj);
          return tmUploader.getBitrate(p0);
       }else {
          _monitor_exit(obj);
          return 0;
       }
    }
    public long getTotalSize(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKit.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (FileUtils.getFileSize(this.mConfig.getFilePath()) + FileUtils.getFileSize(this.mConfig.getCoverPath()));
    }
    public final boolean isCurrentUploadFileEmpty(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKit.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!0 - FileUtils.getFileSize(this.mConfig.getFilePath()))? true: false;
       return b;
    }
    public boolean isNetworkAvailable(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKit.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NetUtils.getInstance(this.mContext).isNetworkAvailable()) {
          return true;
       }
       this.mMainHandler.post(new KSUploaderKit$5(this));
       KSUploaderKitLog.e("KSUploaderKit", "network is unavailable");
       return false;
    }
    public boolean pause(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKit.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       UploaderKitExceptionLogger.getInstance().uploadFinished(this.mConfig.getTaskID());
       return this.pause(null);
    }
    public boolean pause(String p0){
       KSUploaderKit obj = PatchProxy.applyOneRefs(p0, this, KSUploaderKit.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       KSUploaderKitLog.i("KSUploaderKit", "pause, state : "+this.mState);
       if (this.mState == KitUtils$State.UploadFile && (this.mConfig.getUploadMode() != KSUploaderKitCommon$UploadMode.Whole || this.mTotalPercent - this.mFileProgressWeight >= 0)) {
          _monitor_exit(obj);
          return false;
       }else {
          this.mThreadHandler.post(new KSUploaderKit$9(this, p0));
          _monitor_exit(obj);
          return true;
       }
    }
    public void postCompletedListener(KSUploaderKitCommon$Status p0,int p1,String p2){
       if (PatchProxy.isSupport(KSUploaderKit.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KSUploaderKit.class, "27")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSUploaderKitLog.i("KSUploaderKit", "post completed listener, status : "+p0+", errorCode : "+p1);
       this.mMainHandler.post(new KSUploaderKit$16(this, p1, p0, p2));
       UploaderKitExceptionLogger.getInstance().uploadFinished(this.mConfig.getTaskID());
       _monitor_exit(tmLock);
       return;
    }
    public void postPublishPhotoLogReporter(KSUploaderKitCommon$Status p0,PublishLogInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKit.class, "28")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSUploaderKit tmLogReporte = this.mLogReporter;
       if (tmLogReporte != null) {
          tmLogReporte.onReportPublishPhotoLog(p0, p1);
       }
       _monitor_exit(tmLock);
       return;
    }
    public void processCompleteAction(KSUploaderCloseReason p0,int p1,long p2,String p3,long p4,ApiManager$TokenType p5){
       KSUploaderKit kSUploaderKi = KSUploaderKit.class;
       if (PatchProxy.isSupport(kSUploaderKi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Long.valueOf(p2),p3,Long.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, kSUploaderKi, "25")) {
             return;
          }
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSUploaderKitLog.e("KSUploaderKit", "complete state : "+this.mState+", reason : "+p0+", sentSize : "+p4);
       KSUploaderKit tmState = this.mState;
       if (KitUtils$State.Finish == tmState || (KitUtils$State.Pause == tmState && (KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser == p0 && this.mTotalPercent - this.mFileProgressWeight < 0))) {
          _monitor_exit(tmLock);
          return;
       }else if(KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded == p0){
          if (!false - p4) {
             if (this.isCurrentUploadFileEmpty()) {
                KSUploaderKitLog.e("KSUploaderKit", "upload succeed but sentSize is zero, check if file is empty!");
                this.postCompletedListener(KSUploaderKitCommon$Status.Fail, KSUploaderKitCommon$ERRORCODE.EMPTY_FILE.value(), null);
                _monitor_exit(tmLock);
                return;
             }else {
                KSUploaderKitLog.e("KSUploaderKit", "upload succeed and file is not empty, but sentSize is zero!!");
             }
          }
          if (this.mConfig.getMediaType() == KSUploaderKitCommon$MediaType.VideoWithCover && (this.mState == KitUtils$State.UploadFile && (this.mConfig.getCoverPath() != null && p5 != ApiManager$TokenType.Cover))) {
             this.startCoverUploader();
          }else {
             this.mState = KitUtils$State.Publish;
             this.mApiManager.publish(p5);
          }
       }else if(!this.retryUpload(p0)){
          KSUploaderKitCommon$Status cancel = (p0 == KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser)? KSUploaderKitCommon$Status.Cancel: KSUploaderKitCommon$Status.Fail;
          this.postCompletedListener(cancel, p1, null);
       }
       _monitor_exit(tmLock);
       return;
    }
    public void processProgressAction(double p0){
       double d;
       KSUploaderKit kSUploaderKi = KSUploaderKit.class;
       if (PatchProxy.isSupport(kSUploaderKi) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, kSUploaderKi, "24")) {
          return;
       }
       kSUploaderKi = this.mLock;
       _monitor_enter(kSUploaderKi);
       KSUploaderKit tmState = this.mState;
       if (tmState == KitUtils$State.UploadFile) {
          d = this.mFileProgressWeight * p0;
       }else if(tmState == KitUtils$State.UploadCover){
          tmState = this.mFileProgressWeight;
          d = tmState + ((0x3ff0000000000000 - tmState) * p0);
       }else {
          d = p0;
       }
       if (d - this.mTotalPercent > 0) {
          this.mTotalPercent = d;
          this.mMainHandler.post(new KSUploaderKit$15(this));
       }
       KSUploaderKitLog.e("KSUploaderKit", "upload percent : "+p0+", progress : "+d+", totalpercent : "+this.mTotalPercent);
       UploaderKitExceptionLogger.getInstance().updateProgress(this.mTotalPercent, this.mConfig.getTaskID());
       _monitor_exit(kSUploaderKi);
       return;
    }
    public void putTaskEventListener(String p0,KSUploaderKitTaskListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKit.class, "5")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.mTaskListeners.put(p0, p1);
       return;
    }
    public void quitUploadThreadSafely(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "21")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mMainHandler.post(new KSUploaderKit$12(this));
       _monitor_exit(tmLock);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "20")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mThreadHandler.post(new KSUploaderKit$11(this));
       _monitor_exit(tmLock);
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "17")) {
          return;
       }
       UploaderKitExceptionLogger.getInstance().startUpload(this.mConfig.getSessionID(), this.mConfig.getTaskID(), this.mPublishLogInfo, this.mConfig.getFilePath(), this.mConfig.getCoverPath());
       this.resume(null);
       return;
    }
    public void resume(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKit.class, "18")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mThreadHandler.post(new KSUploaderKit$10(this, p0));
       _monitor_exit(tmLock);
       return;
    }
    public final boolean retryUpload(KSUploaderCloseReason p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSUploaderKit.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((this.mUploadType).equalsIgnoreCase("http")) {
          KSUploaderKitLog.e("KSUploaderKit", "http upload should not retry");
          return false;
       }else if(KSUploaderKitCommon$UploadMode.Fragement == this.mConfig.getUploadMode()){
          KSUploaderKitLog.e("KSUploaderKit", "fragment upload should not retry");
          return false;
       }else if(!this.mConfig.getEnableResume()){
          KSUploaderKitLog.e("KSUploaderKit", "should not retry when disable resume");
          return false;
       }else if(!this.mRetryController.isNeedRetry(p0)){
          KSUploaderKitLog.e("KSUploaderKit", p0+" does not support retry");
          return false;
       }else {
          this.mThreadHandler.post(new KSUploaderKit$14(this));
          return true;
       }
    }
    public void setEndPointAgent(KSUploaderKitEndPointAgent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKit.class, "6")) {
          return;
       }
       if (KSUploaderKitCommon$ServiceType.General == this.mConfig.getServiceType()) {
          this.mPublishLogInfo.setEndPointType(KSUploaderKitCommon$BusinessType.External);
          this.mApiManager.setEndPointAgent(p0);
       }
       return;
    }
    public void setEventListener(KSUploaderKitEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKit.class, "4")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSUploaderKitLog.i("KSUploaderKit", "set event listener");
       this.mKitEventListener = p0;
       IUploader$EventListener uEventListen = this.setupUploaderEventListener();
       this.mUploaderEventListener = uEventListen;
       KSUploaderKit tmUploader = this.mUploader;
       if (tmUploader != null) {
          tmUploader.setEventListener(uEventListen);
       }
       this.mApiManager.setListener(new KSUploaderKit$3(this));
       _monitor_exit(tmLock);
       return;
    }
    public void setExternalEndPoints(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKit.class, "7")) {
          return;
       }
       if (KSUploaderKitCommon$ServiceType.General == this.mConfig.getServiceType() && (p0 != null && p0.size() > 0)) {
          ApiResponse uApiResponse = new ApiResponse();
          uApiResponse.endpoints = p0;
          if (p1 != null) {
             uApiResponse.tokenID = p1;
          }
          KSUploaderKit tmApiManager = this.mApiManager;
          if (tmApiManager != null) {
             tmApiManager.setExternalApiResponse(uApiResponse);
          }
       }
    label_002f :
       return;
    }
    public void setSceneType(KSUploaderKitCommon$SceneType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKit.class, "8")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit", "set sceneType£º"+p0);
       KSUploaderKit tmPublishLog = this.mPublishLogInfo;
       if (tmPublishLog != null) {
          tmPublishLog.setSceneType(p0);
       }
       return;
    }
    public final IUploader$EventListener setupUploaderEventListener(){
       KSUploaderKit obj = PatchProxy.apply(null, this, KSUploaderKit.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return new KSUploaderKit$2(this);
    }
    public final void setupUploaderTaskListener(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "2")) {
          return;
       }
       Iterator iterator = this.mTaskListeners.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          KSUploaderKitTaskListener value = uEntry.getValue();
          if (this.mUploader != null) {
             KSUploaderKitLog.i("KSUploaderKit", "set task event listener");
             this.mUploader.putTaskEventListener(key, new KSUploaderKit$1(this, value));
          }
       }
       return;
    }
    public final void startCoverUploader(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "22")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSUploaderKitLog.i("KSUploaderKit", "start upload cover");
       this.mThreadHandler.post(new KSUploaderKit$13(this));
       _monitor_exit(tmLock);
       return;
    }
    public void startUpload(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit.class, "9")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mThreadHandler.post(new KSUploaderKit$4(this));
       _monitor_exit(tmLock);
       return;
    }
    public void uploadSegment(KSUploaderKitSegmentInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKit.class, "13")) {
          return;
       }
       KSUploaderKit tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mThreadHandler.post(new KSUploaderKit$7(this, p0));
       _monitor_exit(tmLock);
       return;
    }
}
