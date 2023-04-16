package com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c97.d;
import h97.d;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.lang.reflect.Type;
import java.lang.Number;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$Holder;
import com.google.gson.JsonObject;
import java.lang.System;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import java.lang.Enum;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.google.gson.JsonElement;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import java.lang.Double;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$UploaderKitActivityListener;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$3;
import java.lang.Runnable;
import android.os.Handler;
import java.math.BigDecimal;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.Exception;
import java.io.IOException;
import android.content.Context;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.app.Application;
import android.os.HandlerThread;
import android.os.Looper;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$1;
import android.app.Application$ActivityLifecycleCallbacks;
import java.io.File;
import java.util.UUID;
import com.kwai.video.ksuploaderkit.utils.FileUtils;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$2;
import android.os.Environment;
import java.lang.StringBuilder;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import jr4.c$a;
import r97.a0;
import r97.q$a;
import r97.q;
import com.google.protobuf.nano.MessageNano;
import r97.o$a;
import r97.o;

public class UploaderKitExceptionLogger	// class@0009ae
{
    public String TAG;
    public Context mContext;
    public long mCoverSize;
    public File mFile;
    public String mFileName;
    public long mFileSize;
    public AtomicInteger mFragmentCnt;
    public Handler mHandler;
    public boolean mIsFinished;
    public boolean mIsInit;
    public boolean mIsUploadingCover;
    public UploaderKitExceptionLogger$UploaderKitActivityListener mLifeCycleListener;
    public AtomicInteger mLowMemoryCnt;
    public double mProgress;
    public PublishLogInfo mPublishLogInfo;
    public long mRAMTotalSize;
    public Runnable mRepeatedLogTask;
    public String mSessionID;
    public long mStartTimeStamp;
    public String mTaskID;
    public boolean mTranscodeFinished;
    public long mTranscodeFinishedTS;
    public static int BUFFER_SIZE = 51200;
    public static String SESSION_ID_KEY = "session_ID";

    public void UploaderKitExceptionLogger(){
       super();
       this.mLowMemoryCnt = new AtomicInteger(0);
       this.mTranscodeFinished = false;
       this.mFragmentCnt = new AtomicInteger(0);
       this.mFileName = "ksuploaderkit_exception";
       this.mRAMTotalSize = 0;
       this.TAG = "UploaderKitException";
    }
    public static boolean getEnableExceptionCollection(){
       PublishConfig obj = PatchProxy.apply(null, null, UploaderKitExceptionLogger.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.a().c().a("ksuploaderkit", PublishConfig.class);
       if (obj != null) {
          return obj.getEnableExceptionCollection().booleanValue();
       }
       return false;
    }
    public static long getExceptionCollectionIntervalMs(){
       PublishConfig obj = PatchProxy.apply(null, null, UploaderKitExceptionLogger.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = d.a().c().a("ksuploaderkit", PublishConfig.class);
       if (obj != null) {
          return obj.getExceptionCollectionIntervalMs();
       }
       return 0x2710;
    }
    public static UploaderKitExceptionLogger getInstance(){
       return UploaderKitExceptionLogger$Holder.sExceptionLogger;
    }
    public final byte[] buildContentPackage(){
       JsonObject obj = PatchProxy.apply(null, this, UploaderKitExceptionLogger.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0(UploaderKitExceptionLogger.SESSION_ID_KEY, this.mSessionID);
       obj.a0("time_interval_ms", Long.valueOf((System.currentTimeMillis() - this.mStartTimeStamp)));
       JsonObject jsonObject = new JsonObject();
       JsonObject jsonObject1 = new JsonObject();
       UploaderKitExceptionLogger tmPublishLog = this.mPublishLogInfo;
       if (tmPublishLog != null) {
          KSUploaderKitConfig kSuploaderKi = tmPublishLog.getKSuploaderKitConfig();
          if (kSuploaderKi != null) {
             jsonObject1.c0("service_type", kSuploaderKi.getServiceType().toString());
             jsonObject1.c0("upload_mode", kSuploaderKi.getUploadMode().toString());
             jsonObject1.c0("media_type", kSuploaderKi.getMediaType().toString());
          }
          if (!TextUtils.isEmpty(this.mTaskID)) {
             jsonObject1.c0("task_id", this.mTaskID);
          }
          jsonObject1.a0("task_count", Integer.valueOf(this.mPublishLogInfo.getTaskCount()));
          jsonObject1.a0("failed_count", Integer.valueOf(this.mPublishLogInfo.getFailedCount()));
          jsonObject1.a0("retry_count", Integer.valueOf(this.mPublishLogInfo.getRetryCount()));
          jsonObject1.c0("upload_type", this.mPublishLogInfo.getUploadTypeForLog());
          jsonObject.c0("stats", jsonObject1.toString());
          jsonObject.a0("error_code", Integer.valueOf(this.mPublishLogInfo.getErrorCode()));
          jsonObject.c0("business_type", this.mPublishLogInfo.getBusinessType().toString());
          jsonObject.c0("scene_type", this.mPublishLogInfo.getSceneTypeForLog());
          KSUploaderKitCommon$UploadChannelType channelType = this.mPublishLogInfo.getChannelType();
          if (channelType != null) {
             jsonObject.c0("channel_type", channelType.value());
          }
       }
       jsonObject.a0("file_size", Long.valueOf((this.mCoverSize + this.mFileSize)));
       obj.c0("publish_meta_info", jsonObject.toString());
       jsonObject = new JsonObject();
       jsonObject.a0("progress", Double.valueOf(this.mProgress));
       jsonObject.a0("fragment_cnt", Integer.valueOf(this.mFragmentCnt.get()));
       jsonObject.H("is_transcode_finished", Boolean.valueOf(this.mTranscodeFinished));
       jsonObject.a0("transcode_finished_time_stamp", Long.valueOf(this.mTranscodeFinishedTS));
       jsonObject.H("is_uploading_cover", Boolean.valueOf(this.mIsUploadingCover));
       obj.c0("publish_real_time_info", jsonObject.toString());
       jsonObject = new JsonObject();
       jsonObject.H("is_foreground", Boolean.valueOf(this.mLifeCycleListener.mIsForeground));
       obj.c0("app_status", jsonObject.toString());
       jsonObject = new JsonObject();
       jsonObject.a0("memory_usage", Double.valueOf(this.getMemoryUsage()));
       jsonObject.a0("low_memory_ctn", Integer.valueOf(this.mLowMemoryCnt.get()));
       jsonObject.c0("current_activity", this.mLifeCycleListener.mActivityName);
       obj.c0("device_info", jsonObject.toString());
       KSUploaderKitLog.d(this.TAG, obj.toString());
       return (obj.toString()).getBytes();
    }
    public final void checkAndReportExceptionInfo(){
       if (PatchProxy.applyVoid(null, this, UploaderKitExceptionLogger.class, "16")) {
          return;
       }
       UploaderKitExceptionLogger tmHandler = this.mHandler;
       if (tmHandler != null) {
          tmHandler.post(new UploaderKitExceptionLogger$3(this));
       }
       return;
    }
    public void finishFragment(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploaderKitExceptionLogger.class, "6")) {
          return;
       }
       if (p0 != null) {
          UploaderKitExceptionLogger tmTaskID = this.mTaskID;
          if (tmTaskID != null && (p0.equalsIgnoreCase(tmTaskID) && this.mIsInit != null)) {
             this.mTranscodeFinished = true;
             this.mTranscodeFinishedTS = System.currentTimeMillis() - this.mStartTimeStamp;
          }
       }
       return;
    }
    public final double getMemoryUsage(){
       Object obj = PatchProxy.apply(null, this, UploaderKitExceptionLogger.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       long rAMTotalSize = this.getRAMTotalSize();
       long ramAvailable = this.getRamAvailableSize();
       BigDecimal uBigDecimal = null;
       if (rAMTotalSize) {
          uBigDecimal = new BigDecimal((double)((float)(ramAvailable * 100) / (float)rAMTotalSize)).setScale(4, 4).doubleValue();
       }
       return uBigDecimal;
    }
    public final long getRAMTotalSize(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, UploaderKitExceptionLogger.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!null - this.mRAMTotalSize) {
          try{
             BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
             try{
                obj = uBufferedRea.readLine();
                while (obj != null) {
                   if (obj.contains("MemTotal")) {
                      long l = Long.valueOf(obj.split("\\s+")[1]).longValue() << 10;
                      this.mRAMTotalSize = l;
                   }
                }
                uBufferedRea.close();
             }catch(java.lang.Exception e0){
                objArray = uBufferedRea;
             }
             e0.printStackTrace();
             if (objArray != null) {
                objArray.close();
             }
          }catch(java.lang.Exception e0){
             goto label_005c ;
          }catch(java.io.IOException e0){
             e0.printStackTrace();
          }
       }
    }
    public final long getRamAvailableSize(){
       Object obj = PatchProxy.apply(null, this, UploaderKitExceptionLogger.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       this.mContext.getSystemService("activity").getMemoryInfo(memoryInfo);
       return memoryInfo.availMem;
    }
    public void init(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploaderKitExceptionLogger.class, "1")) {
          return;
       }
       _monitor_enter(this);
       if (UploaderKitExceptionLogger.getEnableExceptionCollection() && this.mIsInit == null) {
          this.mIsInit = true;
          HandlerThread handlerThrea = new HandlerThread("com.ksuploaderkit.exception");
          handlerThrea.start();
          this.mHandler = new Handler(handlerThrea.getLooper());
          this.mContext = p0;
          UploaderKitExceptionLogger$UploaderKitActivityListener uploaderKitA = new UploaderKitExceptionLogger$UploaderKitActivityListener(null);
          this.mLifeCycleListener = uploaderKitA;
          p0.registerActivityLifecycleCallbacks(uploaderKitA);
          this.checkAndReportExceptionInfo();
       }
       _monitor_exit(this);
       return;
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, UploaderKitExceptionLogger.class, "3")) {
          return;
       }
       if (this.mIsInit != null) {
          this.mLowMemoryCnt.getAndIncrement();
       }
       return;
    }
    public void removeExceptionFile(){
       if (PatchProxy.applyVoid(null, this, UploaderKitExceptionLogger.class, "15")) {
          return;
       }
       KSUploaderKitLog.d(this.TAG, "removeExceptionFile");
       UploaderKitExceptionLogger tmFile = this.mFile;
       if (tmFile != null) {
          tmFile.delete();
          KSUploaderKitLog.d(this.TAG, "removeExceptionFile successfully");
       }
       return;
    }
    public void removeLogTask(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UploaderKitExceptionLogger.class, "2")) {
          return;
       }
       KSUploaderKitLog.i(this.TAG, "remove log task");
       UploaderKitExceptionLogger tmRepeatedLo = this.mRepeatedLogTask;
       if (tmRepeatedLo != null) {
          UploaderKitExceptionLogger tmHandler = this.mHandler;
          if (tmHandler != null) {
             tmHandler.removeCallbacks(tmRepeatedLo);
          }
          this.mRepeatedLogTask = objArray;
          KSUploaderKitLog.i(this.TAG, "remove log task successfully");
       }
       return;
    }
    public void sendFragment(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploaderKitExceptionLogger.class, "5")) {
          return;
       }
       if (p0 != null) {
          UploaderKitExceptionLogger tmTaskID = this.mTaskID;
          if (tmTaskID != null && (p0.equalsIgnoreCase(tmTaskID) && this.mIsInit != null)) {
             this.mFragmentCnt.incrementAndGet();
          }
       }
       return;
    }
    public void startUpload(String p0,String p1,PublishLogInfo p2,String p3,String p4){
       UploaderKitExceptionLogger uploaderKitE = UploaderKitExceptionLogger.class;
       if (PatchProxy.isSupport(uploaderKitE)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uploaderKitE, "4")) {
             return;
          }
       }
       if (UploaderKitExceptionLogger.getEnableExceptionCollection() && this.mIsInit != null) {
          this.mIsFinished = false;
          this.mSessionID = (p0 != null)? p0: UUID.randomUUID().toString();
          this.mTaskID = p1;
          this.mPublishLogInfo = p2;
          this.mStartTimeStamp = System.currentTimeMillis();
          if (p4 != null) {
             this.mCoverSize = FileUtils.getFileSize(p4);
          }
          if (KSUploaderKitCommon$UploadMode.Whole == this.mPublishLogInfo.getKSuploaderKitConfig().getUploadMode()) {
             this.mFileSize = FileUtils.getFileSize(p3);
          }
          this.removeLogTask();
          UploaderKitExceptionLogger$1 u1 = new UploaderKitExceptionLogger$1(this);
          this.mRepeatedLogTask = u1;
          this.mHandler.post(u1);
       }
       return;
    }
    public void startUploadCover(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploaderKitExceptionLogger.class, "8")) {
          return;
       }
       if (p0 != null) {
          UploaderKitExceptionLogger tmTaskID = this.mTaskID;
          if (tmTaskID != null && (p0.equalsIgnoreCase(tmTaskID) && this.mIsInit != null)) {
             this.mIsUploadingCover = true;
          }
       }
       return;
    }
    public void updateProgress(double p0,String p1){
       UploaderKitExceptionLogger uploaderKitE = UploaderKitExceptionLogger.class;
       if (PatchProxy.isSupport(uploaderKitE) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), p1, this, uploaderKitE, "7")) {
          return;
       }
       if (p1 != null) {
          uploaderKitE = this.mTaskID;
          if (uploaderKitE != null && (p1.equalsIgnoreCase(uploaderKitE) && this.mIsInit != null)) {
             this.mProgress = p0;
          }
       }
       return;
    }
    public void uploadFinished(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploaderKitExceptionLogger.class, "9")) {
          return;
       }
       UploaderKitExceptionLogger tmHandler = this.mHandler;
       if (tmHandler != null) {
          tmHandler.post(new UploaderKitExceptionLogger$2(this, p0));
       }
       return;
    }
    public void writeInfoToLocalFile(){
       byte[] uobyteArray;
       RandomAccessFile randomAccess;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UploaderKitExceptionLogger.class, "14")) {
          return;
       }
       if (this.mFile == null && ("mounted").equals(Environment.getExternalStorageState())) {
          File externalFile = this.mContext.getExternalFilesDir(objArray);
          if (externalFile == null) {
             KSUploaderKitLog.e(this.TAG, "writeInfoToLocalFile: getExternalFilesDir return null");
             return;
          }else {
             this.mFile = new File(externalFile.getPath()+File.separator+this.mFileName);
          }
       }
       UploaderKitExceptionLogger tmFile = this.mFile;
       if (tmFile != null && !tmFile.exists()) {
          try{
             this.mFile.createNewFile();
          }catch(java.io.IOException e0){
             e0.printStackTrace();
             this.mFile = objArray;
          }
       }
    }
    public void writeLogger(String p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(UploaderKitExceptionLogger.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, UploaderKitExceptionLogger.class, "17")) {
          return;
       }
       c$a uoa = new c$a();
       uoa.b = p0;
       uoa.e = p1;
       uoa.f = p3;
       uoa.d = p2;
       q$a uoa1 = q.a();
       uoa1.g("vp_stat_event");
       uoa1.f(MessageNano.toByteArray(uoa));
       uoa1.c(o.builder().g(false).i("KSUploaderKit").b());
       d.a().g().m(uoa1.b());
       return;
    }
}
