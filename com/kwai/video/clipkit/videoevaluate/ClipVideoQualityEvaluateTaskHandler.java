package com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler;
import com.kwai.video.editorsdk2.videoevaluate.VideoQualityEvaluateTaskListener;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoEvaluateTaskOptions;
import java.lang.Object;
import com.kwai.video.clipkit.log.ClipVideoQualityEvaluateLog;
import com.kwai.video.editorsdk2.videoevaluate.VideoQualityEvaluateTaskImpl;
import com.kwai.video.editorsdk2.videoevaluate.VideoQualityEvaluateTask;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.ClipKitUtils;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import android.util.Pair;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo$VideoUploadRequestInfoData;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Short;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse$EndPoint;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo;
import com.kwai.video.editorsdk2.videoevaluate.VideoQualityEvaluateTaskStats;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Double;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import android.os.SystemClock;
import java.lang.Thread;
import gv7.b;
import java.lang.Runnable;
import java.lang.Exception;
import gv7.c;
import gv7.a;

public class ClipVideoQualityEvaluateTaskHandler implements VideoQualityEvaluateTaskListener	// class@001b03
{
    public final String mBusiness;
    public final Context mContext;
    public final String mExportPath;
    public ClipVideoQualityEvaluateTaskListener mListener;
    public final Handler mMainHandler;
    public final EditorSdk2$VideoEvaluateTaskOptions mOption;
    public final EditorSdk2V2$VideoEditorProject mProject;
    public final String mSessionId;
    public VideoQualityEvaluateTask mTask;
    public ClipVideoQualityEvaluateLog mTaskLog;
    public ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo mUploadRequestInfo;
    public KSUploaderKit mUploaderKit;
    public final Object mutex;
    public static final boolean $assertionsDisabled;

    public void ClipVideoQualityEvaluateTaskHandler(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,String p3,EditorSdk2$VideoEvaluateTaskOptions p4){
       super();
       this.mutex = new Object();
       this.mTaskLog = new ClipVideoQualityEvaluateLog();
       VideoQualityEvaluateTaskImpl videoQuality = new VideoQualityEvaluateTaskImpl(p0, p1, p2, p4);
       this.mTask = videoQuality;
       videoQuality.setVideoQualityEvaluateTaskListener(this);
       if (p3 == null || this.mTask == null) {
          throw new IOException("ClipVideoQualityEvaluateTaskHandler sessionId should not be null");
       }
       this.mSessionId = p3;
       ClipVideoQualityEvaluateTaskHandler tmTaskLog = this.mTaskLog;
       tmTaskLog.mOptions = p4;
       tmTaskLog.mProject = p1;
       this.mProject = p1;
       this.mOption = p4;
       this.mContext = p0;
       this.mExportPath = p2;
       this.mMainHandler = new Handler(p0.getMainLooper());
       int i = p4.taskType();
       if (i) {
          if (i != 1) {
             this.mBusiness = (i != 2)? "": "feedback";
          }else {
             this.mBusiness = "preview";
          }
       }else {
          this.mBusiness = "transcode";
       }
       i.business = this.mBusiness;
       return;
    }
    public static void a(ClipVideoQualityEvaluateTaskHandler p0){
       p0.lambda$triggerSuccess$2();
    }
    public static void b(ClipVideoQualityEvaluateTaskHandler p0,ClipExportException p1){
       p0.lambda$triggerError$0(p1);
    }
    public static void c(ClipVideoQualityEvaluateTaskHandler p0){
       p0.lambda$triggerCancel$1();
    }
    private void lambda$triggerCancel$1(){
       ClipVideoQualityEvaluateTaskHandler tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onCancel();
          this.reportLog(9);
          this.release();
       }
       return;
    }
    private void lambda$triggerError$0(ClipExportException p0){
       ClipVideoQualityEvaluateTaskHandler tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onError(p0);
          this.reportLog(8);
          this.release();
       }
       return;
    }
    private void lambda$triggerSuccess$2(){
       ClipVideoQualityEvaluateTaskHandler tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onSuccess();
          this.reportLog(6);
          this.release();
       }
       return;
    }
    public static boolean shouldRunVideoQualityEvaluateTask(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2,EditorSdk2$VideoEvaluateTaskOptions p3){
       if (PatchProxy.isSupport(ClipVideoQualityEvaluateTaskHandler.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, ClipVideoQualityEvaluateTaskHandler.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = false;
       if (p1 == null || p3 == null) {
          KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "shouldRunVideoQualityEvaluateTask is false cause invalid param");
          return b;
       }else if(p2 != 1 && (p2 == 4 || p2 == 16)){
          b = ClipKitUtils.isEnableVideoQualityEvaluateTask(p3.taskType());
          KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "shouldRunVideoQualityEvaluateTask is "+b);
          return b;
       }else {
          KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "shouldRunVideoQualityEvaluateTask is false cause unsupport videoType");
          return b;
       }
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, ClipVideoQualityEvaluateTaskHandler.class, "3")) {
          return;
       }
       ClipVideoQualityEvaluateTaskHandler tmutex = this.mutex;
       _monitor_enter(tmutex);
       ClipVideoQualityEvaluateTaskHandler tmTask = this.mTask;
       if (tmTask != null) {
          tmTask.cancel();
       }
       tmTask = this.mUploaderKit;
       if (tmTask != null) {
          tmTask.cancel();
       }
       _monitor_exit(tmutex);
       return;
    }
    public final Pair createUploadConfig(){
       Object[] objArray = null;
       ClipVideoQualityEvaluateTaskHandler obj = PatchProxy.apply(objArray, this, ClipVideoQualityEvaluateTaskHandler.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mUploadRequestInfo;
       if (obj == null || !obj.usable()) {
          KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "createUploadConfig has invalid uploadRequestInfo");
          return objArray;
       }else {
          KSUploaderKitConfig kSUploaderKi = new KSUploaderKitConfig(this.mUploadRequestInfo.mRequestData.mToken, this.mExportPath, this.mSessionId, KSUploaderKitCommon$MediaType.Video, KSUploaderKitCommon$ServiceType.General);
          obj.setServerHost(this.mUploadRequestInfo.mRequestData.mHttpEndPoint);
          obj.setUploadMode(KSUploaderKitCommon$UploadMode.Whole);
          obj.setEnableResume(true);
          obj.setSessionID(this.mSessionId);
          obj.setTaskID(this.mSessionId);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.mUploadRequestInfo.mRequestData.mKtpEndPoint.iterator();
          while (iterator.hasNext()) {
             String[] stringArray = (iterator.next()).split(":");
             if (stringArray.length != 3) {
                continue ;
             }else {
                object oobject = stringArray[0];
                int i = 2;
                try{
                   short s = Short.parseShort(stringArray[i]);
                   stringArray = (stringArray[1]).split("//");
                   if (stringArray.length != i || (stringArray[1]).length() < 8) {
                      continue ;
                   }else {
                      uArrayList.add(new ApiResponse$EndPoint(stringArray[1], s, oobject));
                   }
                }catch(java.lang.NumberFormatException e0){
                   return objArray;
                }
             }
          }
          return new Pair(obj, uArrayList);
       }
    }
    public ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo getTaskRequestInfo(){
       Object[] objArray = null;
       ClipVideoQualityEvaluateTaskHandler obj = PatchProxy.apply(objArray, this, ClipVideoQualityEvaluateTaskHandler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mutex;
       _monitor_enter(obj);
       ClipVideoQualityEvaluateTaskHandler tmUploadRequ = this.mUploadRequestInfo;
       if (tmUploadRequ != null) {
          ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo mRequestData = tmUploadRequ.mRequestData;
          if (mRequestData != null) {
             _monitor_exit(obj);
             return new ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo("", this.mSessionId, this.mBusiness, mRequestData.mToken);
          }
       }
       KSClipLog.e("ClipVideoQualityEvaluateTaskHandler", "getTaskRequestInfo failed! return null");
       _monitor_exit(obj);
       return objArray;
    }
    public void onCancel(VideoQualityEvaluateTaskImpl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipVideoQualityEvaluateTaskHandler.class, "15")) {
          return;
       }
       this.mTaskLog.setVideoEvaluateTaskStats(this.mTask.getStats());
       this.triggerCancel();
       return;
    }
    public void onError(VideoQualityEvaluateTaskImpl p0,EditorSdk2$EditorSdkError p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipVideoQualityEvaluateTaskHandler.class, "16")) {
          return;
       }
       ClipVideoQualityEvaluateTaskHandler tmTaskLog = this.mTaskLog;
       tmTaskLog.editorError = p1;
       tmTaskLog.errorType = -1;
       tmTaskLog.errorCode = p1.code();
       this.mTaskLog.setVideoEvaluateTaskStats(this.mTask.getStats());
       this.triggerError(new ClipExportException(p1.type(), p1.code(), p1.message()));
       return;
    }
    public void onProgress(double p0){
       ClipVideoQualityEvaluateTaskHandler uClipVideoQu = ClipVideoQualityEvaluateTaskHandler.class;
       if (PatchProxy.isSupport(uClipVideoQu) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uClipVideoQu, "17")) {
          return;
       }
       uClipVideoQu = this.mListener;
       if (uClipVideoQu != null) {
          KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "onProgress "+p0);
          uClipVideoQu.onProgress(p0);
       }
       return;
    }
    public void onSuccess(VideoQualityEvaluateTaskImpl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipVideoQualityEvaluateTaskHandler.class, "14")) {
          return;
       }
       this.mTaskLog.setVideoEvaluateTaskStats(this.mTask.getStats());
       this.startUploadExportFile();
       return;
    }
    public final void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClipVideoQualityEvaluateTaskHandler.class, "8")) {
          return;
       }
       KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "start release");
       ClipVideoQualityEvaluateTaskHandler tmTask = this.mTask;
       if (tmTask != null) {
          tmTask.release();
          this.mTask = objArray;
       }
       if (this.mListener != null) {
          this.mListener = objArray;
       }
       KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "release finished");
       return;
    }
    public final void reportLog(int p0){
       ClipVideoQualityEvaluateTaskHandler uClipVideoQu = ClipVideoQualityEvaluateTaskHandler.class;
       if (PatchProxy.isSupport(uClipVideoQu) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipVideoQu, "7")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mSessionId)) {
          uClipVideoQu = null;
          if (p0 != 7 && (p0 == 8 || p0 == 9)) {
             uClipVideoQu = this.mTaskLog;
          }
          ClipEditLogger.reportVideoEvaluateTaskLog(p0, this.mSessionId, uClipVideoQu);
       }
       return;
    }
    public void setClipVideoQualityEvaluateTaskListener(ClipVideoQualityEvaluateTaskListener p0){
       ClipVideoQualityEvaluateTaskHandler tmutex = this.mutex;
       _monitor_enter(tmutex);
       this.mListener = p0;
       _monitor_exit(tmutex);
    }
    public void setTaskRequestResult(int p0){
       ClipVideoQualityEvaluateTaskHandler uClipVideoQu = ClipVideoQualityEvaluateTaskHandler.class;
       if (PatchProxy.isSupport(uClipVideoQu) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipVideoQu, "5")) {
          return;
       }
       String str = "ClipVideoQualityEvaluateTaskHandler";
       if (p0 > 0) {
          KSClipLog.e(str, "commit success!");
          this.reportLog(7);
       }else {
          KSClipLog.e(str, "commit failed!");
          ClipVideoQualityEvaluateTaskHandler tmTaskLog = this.mTaskLog;
          tmTaskLog.errorMsg = "commit kvq analyze failed";
          tmTaskLog.errorType = -3;
          tmTaskLog.errorCode = -3;
          this.reportLog(8);
       }
       return;
    }
    public void setUploadParam(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipVideoQualityEvaluateTaskHandler.class, "6")) {
          return;
       }
       ClipVideoQualityEvaluateTaskHandler tmutex = this.mutex;
       _monitor_enter(tmutex);
       this.mUploadRequestInfo = ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo.fromJsonString(p0);
       _monitor_exit(tmutex);
       return;
    }
    public void setVideoType(int p0){
       ClipVideoQualityEvaluateTaskHandler tmutex = this.mutex;
       _monitor_enter(tmutex);
       this.mTaskLog.videoType = p0;
       _monitor_exit(tmutex);
    }
    public void setVideoUploadRequestInfo(ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo p0){
       ClipVideoQualityEvaluateTaskHandler tmutex = this.mutex;
       _monitor_enter(tmutex);
       this.mUploadRequestInfo = p0;
       _monitor_exit(tmutex);
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, ClipVideoQualityEvaluateTaskHandler.class, "2")) {
          return;
       }
       ClipVideoQualityEvaluateTaskHandler tmutex = this.mutex;
       _monitor_enter(tmutex);
       if (ClipKitUtils.isEnableVideoQualityEvaluateTask(this.mOption.taskType())) {
          ClipVideoQualityEvaluateTaskHandler tmTask = this.mTask;
          if (tmTask != null) {
             tmTask.start();
             this.reportLog(1);
          }
       }
       _monitor_exit(tmutex);
       return;
    }
    public final void startUploadExportFile(){
       if (PatchProxy.applyVoid(null, this, ClipVideoQualityEvaluateTaskHandler.class, "13")) {
          return;
       }
       KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "startUploadExportFile");
       Pair pair = this.createUploadConfig();
       if (pair == null || pair.first == null) {
          this.triggerError(new ClipExportException(-2, -100003, "KSUploaderKitConfig is null"));
          return;
       }else {
          ClipVideoQualityEvaluateTaskHandler tmutex = this.mutex;
          _monitor_enter(tmutex);
          KSUploaderKit kSUploaderKi = new KSUploaderKit(this.mContext, pair.first);
          this.mUploaderKit = kSUploaderKi;
          kSUploaderKi.setExternalEndPoints(pair.second, this.mSessionId);
          this.mUploaderKit.setSceneType(KSUploaderKitCommon$SceneType.VideoQualityEvaluatePublish);
          this.mUploaderKit.setEventListener(new ClipVideoQualityEvaluateTaskHandler$1(this));
          this.mTaskLog.mUploadStartTime = SystemClock.elapsedRealtime();
          this.mUploaderKit.startUpload();
          _monitor_exit(tmutex);
          return;
       }
    }
    public void triggerCancel(){
       if (PatchProxy.applyVoid(null, this, ClipVideoQualityEvaluateTaskHandler.class, "10")) {
          return;
       }
       KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "triggerCancel");
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          ClipVideoQualityEvaluateTaskHandler tmListener = this.mListener;
          if (tmListener != null) {
             tmListener.onCancel();
          }
          this.reportLog(9);
          this.release();
       }else {
          this.mMainHandler.post(new b(this));
       }
       return;
    }
    public void triggerError(ClipExportException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipVideoQualityEvaluateTaskHandler.class, "9")) {
          return;
       }
       KSClipLog.e("ClipVideoQualityEvaluateTaskHandler", "triggerErrorcode: "+p0.errorCode+" msg: "+p0.getMessage());
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          ClipVideoQualityEvaluateTaskHandler tmListener = this.mListener;
          if (tmListener != null) {
             tmListener.onError(p0);
          }
          this.reportLog(8);
          this.release();
       }else {
          this.mMainHandler.post(new c(this, p0));
       }
       return;
    }
    public void triggerSuccess(){
       if (PatchProxy.applyVoid(null, this, ClipVideoQualityEvaluateTaskHandler.class, "11")) {
          return;
       }
       KSClipLog.i("ClipVideoQualityEvaluateTaskHandler", "triggerSuccess");
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          ClipVideoQualityEvaluateTaskHandler tmListener = this.mListener;
          if (tmListener != null) {
             tmListener.onSuccess();
          }
          this.reportLog(6);
          this.release();
       }else {
          this.mMainHandler.post(new a(this));
       }
       return;
    }
}
