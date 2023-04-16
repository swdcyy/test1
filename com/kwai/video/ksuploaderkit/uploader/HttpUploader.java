package com.kwai.video.ksuploaderkit.uploader.HttpUploader;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import android.content.Context;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.video.ksuploaderkit.uploader.UploaderConfig;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.video.ksuploaderkit.stats.BitrateStats;
import com.kwai.video.ksuploaderkit.uploader.UploaderConfig$ExtInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.ksuploaderkit.uploader.UploadData$ExtInfo;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import com.kwai.video.ksuploaderkit.uploader.IUploader$EventListener;
import java.lang.Integer;
import com.kwai.video.ksuploaderkit.uploader.HttpUploader$2;
import java.lang.Enum;
import com.kwai.video.ksuploaderkit.apicenter.ApiNetAgent;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.logreporter.LogReporterUtils;
import java.lang.System;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import ln.b;
import com.kwai.video.ksuploaderkit.uploader.HttpUploader$1;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgentListener;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BitrateType;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import java.lang.Exception;
import com.kwai.video.ksuploaderkit.uploader.UploadData$Builder;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;

public class HttpUploader implements IUploader	// class@0009cd
{
    public ApiManager mApiManager;
    public ApiNetAgent[] mApiNetAgents;
    public BitrateStats mBitrateStats;
    public Context mContext;
    public IUploader$EventListener mEventListener;
    public AtomicInteger mFailedCount;
    public boolean mIsUploadingCover;
    public LogReporter mLogReporter;
    public PublishConfig mPublishConfig;
    public ConcurrentHashMap mTaskListeners;
    public HttpUploadAgent[] mUploadAgents;
    public UploadData[] mUploadDataList;
    public ConcurrentHashMap mUploadDataOrm;
    public UploaderConfig mUploaderConfig;

    public void HttpUploader(Context p0,KSUploaderKitCommon$UploadChannelType p1,KSUploaderKitCommon$UploadMode p2,ApiManager p3){
       super();
       this.mUploadDataOrm = new ConcurrentHashMap();
       this.mTaskListeners = new ConcurrentHashMap();
       this.mUploaderConfig = new UploaderConfig();
       this.mFailedCount = new AtomicInteger(0);
       this.mIsUploadingCover = false;
       this.mContext = p0;
       this.mApiManager = p3;
       this.mBitrateStats = new BitrateStats();
       HttpUploader tmUploaderCo = this.mUploaderConfig;
       tmUploaderCo.channelType = p1;
       tmUploaderCo.uploadMode = (p1 == KSUploaderKitCommon$UploadChannelType.Single)? p2: KSUploaderKitCommon$UploadMode.Whole;
       tmUploaderCo.extInfo.init();
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, HttpUploader.class, "14")) {
          return;
       }
       this.cancel(null);
       return;
    }
    public void cancel(String p0){
       HttpUploader tmUploadData;
       IUploader$TaskEventListener taskEventLis;
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpUploader.class, "15")) {
          return;
       }
       int i = 0;
       if (TextUtils.isEmpty(p0)) {
          String str = null;
          if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
             tmUploadData = this.mUploadDataList;
             if (tmUploadData == null || tmUploadData.length <= 0) {
                return;
             }else {
                tmUploadData = this.mUploadDataList;
                while (i < tmUploadData.length) {
                   object oobject = tmUploadData[i];
                   IUploader$UploadStatus cancel = IUploader$UploadStatus.Cancel;
                   oobject.extInfo().updateUploadStatus(cancel);
                   this.mUploadAgents[i].cancel();
                   taskEventLis = (!TextUtils.isEmpty(oobject.taskId()))? this.mTaskListeners.get(oobject.taskId()): str;
                   if (taskEventLis != null) {
                      taskEventLis.onStateChanged(oobject.taskId(), cancel);
                   }
                   i = i + 1;
                }
             }
          }else {
             UploadData currentUploa = this.getCurrentUploadData();
             HttpUploadAgent currentUploa1 = this.getCurrentUploadAgent();
             if (currentUploa == null || currentUploa1 == null) {
                return;
             }else {
                currentUploa1.cancel();
                IUploader$UploadStatus cancel1 = IUploader$UploadStatus.Cancel;
                currentUploa.extInfo().updateUploadStatus(cancel1);
                if (!TextUtils.isEmpty(currentUploa.taskId())) {
                   str = this.mTaskListeners.get(currentUploa.taskId());
                }
                if (str != null) {
                   str.onStateChanged(currentUploa.taskId(), cancel1);
                }
             }
          }
          tmUploadData = this.mEventListener;
          if (tmUploadData != null) {
             tmUploadData.onStateChanged(IUploader$UploadStatus.Cancel);
          }
          tmUploadData.status = IUploader$UploadStatus.Cancel;
       }else {
          Integer integer = this.mUploadDataOrm.get(p0);
          if (integer != null && integer.intValue() >= 0) {
             IUploader$UploadStatus cancel2 = IUploader$UploadStatus.Cancel;
             this.mUploadDataList[integer.intValue()].extInfo().updateUploadStatus(cancel2);
             HttpUploader tmUploadAgen = this.mUploadAgents;
             if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
                i = integer.intValue();
             }
             tmUploadAgen[i].cancel();
             taskEventLis = this.mTaskListeners.get(p0);
             if (taskEventLis != null) {
                taskEventLis.onStateChanged(p0, cancel2);
             }
          }
       }
       return;
    }
    public final void createHttpUploaderAndInit(KSUploaderKitCommon$UploadMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpUploader.class, "4")) {
          return;
       }
       int i = HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       int i1 = 1;
       int i2 = 0;
       if (i != i1) {
          if (i != 2) {
             if (i == 3) {
                HttpUploader tmUploadData = this.mUploadDataList;
                if (tmUploadData != null && tmUploadData.length > 0) {
                   HttpUploadAgent[] httpUploadAg = new HttpUploadAgent[tmUploadData.length];
                   this.mUploadAgents = httpUploadAg;
                   httpUploadAg = KSUploaderKitCommon$UploadMode.Whole;
                   HttpUploader tmUploadAgen = this.mUploadAgents;
                   while (i2 < tmUploadAgen.length) {
                      tmUploadAgen[i2] = this.createUploaderAgent(httpUploadAg, this.mApiNetAgents[i2], this.mUploadDataList[i2]);
                      i2 = i2 + 1;
                   }
                }
             }
          }else {
             i = this.mUploaderConfig.extInfo.cursor.get();
             HttpUploadAgent[] httpUploadAg1 = new HttpUploadAgent[i1];
             httpUploadAg1[i2] = this.createUploaderAgent(KSUploaderKitCommon$UploadMode.Whole, this.mApiNetAgents[i], this.mUploadDataList[i]);
             this.mUploadAgents = httpUploadAg1;
          }
       }else {
          HttpUploadAgent[] httpUploadAg2 = new HttpUploadAgent[i1];
          httpUploadAg2[i2] = this.createUploaderAgent(p0, this.mApiNetAgents[i2], this.mUploadDataList[i2]);
          this.mUploadAgents = httpUploadAg2;
       }
       return;
    }
    public UploadLogInfo createUploadLogInfo(int p0,long p1,String p2,UploadData p3,HttpRequestInfo p4){
       UploadLogInfo obj;
       HttpUploader httpUploader = HttpUploader.class;
       int i = 1;
       if (PatchProxy.isSupport(httpUploader)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, httpUploader, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new UploadLogInfo();
       if (p3 != null) {
          obj.setStartTime(p3.extInfo().startTime());
          String str = p3.filePath();
          if (KSUploaderKitCommon$UploadMode.Fragement != this.mUploaderConfig.uploadMode) {
             i = false;
          }
          obj.setMediaType(LogReporterUtils.getMediaType(str, i));
          obj.setFileSize(p3.extInfo().fileSize());
       }
       obj.setCloseReason(p0);
       obj.setUploadStatus(p1);
       obj.setStatsJson(p2);
       obj.setEndTime(System.currentTimeMillis());
       obj.setUploadType("Http");
       obj.setHttpRequestInfo(p4);
       obj.setBusinessType(KSUploaderKitCommon$BusinessType.KSUploaderKit);
       return obj;
    }
    public final HttpUploadAgent createUploaderAgent(KSUploaderKitCommon$UploadMode p0,ApiNetAgent p1,UploadData p2){
       String cachedUpload;
       HttpUploader obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HttpUploader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p2.enableResume() && p2.taskId() != null) {
          cachedUpload = this.mApiManager.getCachedUploadToken(p2.taskId());
       }
       b uob = (cachedUpload == null)? p1.fetchRickonToken(): p1.fetchResumeInfo(cachedUpload);
       HttpUploadAgent httpUploadAg = new HttpUploadAgent(p0, this.mApiManager.getServerHost(), uob, new HttpUploader$1(this, p2));
       httpUploadAg.setConfig(this.mPublishConfig);
       return httpUploadAg;
    }
    public KSUploaderCloseReason errorCodeToCloseReason(int p0){
       KSUploaderCloseReason obj;
       HttpUploader httpUploader = HttpUploader.class;
       if (PatchProxy.isSupport(httpUploader)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, httpUploader, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser;
       if (p0 == obj.value()) {
          return obj;
       }else {
          obj = KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded;
          if (p0 == obj.value()) {
             return obj;
          }else {
             return KSUploaderCloseReason.KSUploaderCloseReason_Failed;
          }
       }
    }
    public void finishUploadSegment(){
       if (PatchProxy.applyVoid(null, this, HttpUploader.class, "9")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-HttpUploader", "finish Upload Segment");
       HttpUploadAgent currentUploa = this.getCurrentUploadAgent();
       if (currentUploa != null) {
          currentUploa.finishUploadSegment();
       }
       return;
    }
    public int getBitrate(KSUploaderKitCommon$BitrateType p0){
       HttpUploader obj = PatchProxy.applyOneRefs(p0, this, HttpUploader.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBitrateStats;
       if (obj != null) {
          return obj.getBitrate(p0);
       }
       return 0;
    }
    public final ApiNetAgent getCurrentNetAgent(){
       Object[] objArray = null;
       HttpUploader obj = PatchProxy.apply(objArray, this, HttpUploader.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                return objArray;
             }
          }else {
             i = this.mUploaderConfig.extInfo.cursor.get();
             HttpUploader tmApiNetAgen = this.mApiNetAgents;
             if (tmApiNetAgen != null && tmApiNetAgen.length > i) {
                objArray = tmApiNetAgen[i];
             }
             return objArray;
          }
       }
       obj = this.mApiNetAgents;
       if (obj != null && obj.length > 0) {
          objArray = obj[0];
       }
       return objArray;
    }
    public final HttpUploadAgent getCurrentUploadAgent(){
       Object[] objArray = null;
       HttpUploader obj = PatchProxy.apply(objArray, this, HttpUploader.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             return objArray;
          }else {
             i = this.mUploaderConfig.extInfo.cursor.get();
             HttpUploader tmUploadAgen = this.mUploadAgents;
             if (tmUploadAgen != null && tmUploadAgen.length > i) {
                objArray = tmUploadAgen[i];
             }
             return objArray;
          }
       }else {
          obj = this.mUploadAgents;
          if (obj != null && obj.length > 0) {
             objArray = obj[0];
          }
          return objArray;
       }
    }
    public final UploadData getCurrentUploadData(){
       Object[] objArray = null;
       HttpUploader obj = PatchProxy.apply(objArray, this, HttpUploader.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       if (i != 1) {
          if (i != 2 && i != 3) {
             return objArray;
          }else {
             i = this.mUploaderConfig.extInfo.cursor.get();
             HttpUploader tmUploadData = this.mUploadDataList;
             if (tmUploadData != null && tmUploadData.length > i) {
                objArray = tmUploadData[i];
             }
             return objArray;
          }
       }else {
          obj = this.mUploadDataList;
          if (obj != null && obj.length > 0) {
             objArray = obj[0];
          }
          return objArray;
       }
    }
    public int getFailedCount(){
       Object obj = PatchProxy.apply(null, this, HttpUploader.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mFailedCount.get();
    }
    public IUploader$UploadStatus getStatus(){
       return this.mUploaderConfig.extInfo.status;
    }
    public boolean pause(){
       Object obj = PatchProxy.apply(null, this, HttpUploader.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.pause(null);
    }
    public boolean pause(String p0){
       IUploader$UploadStatus pause;
       HttpUploader tmUploadData;
       IUploader$TaskEventListener taskEventLis1;
       HttpUploader obj = PatchProxy.applyOneRefs(p0, this, HttpUploader.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       KSUploaderKitLog.i("KSUploaderKit-HttpUploader", "pause ");
       obj = this.mUploadAgents;
       boolean b = false;
       if (obj != null && obj.length > 0) {
          pause = IUploader$UploadStatus.Pause;
          if (this.mUploaderConfig.extInfo.status != pause) {
             if (TextUtils.isEmpty(p0)) {
                IUploader$TaskEventListener taskEventLis = null;
                if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
                   tmUploadData = this.mUploadDataList;
                   if (tmUploadData == null || tmUploadData.length <= 0) {
                      return b;
                   }else {
                      tmUploadData = this.mUploadDataList;
                      while (b < tmUploadData.length) {
                         object oobject = tmUploadData[b];
                         object oobject1 = this.mUploadAgents[b];
                         if (oobject.enableResume()) {
                            IUploader$UploadStatus pause1 = IUploader$UploadStatus.Pause;
                            oobject.extInfo().updateUploadStatus(pause1);
                            oobject1.cancel();
                            taskEventLis1 = (!TextUtils.isEmpty(oobject.taskId()))? this.mTaskListeners.get(oobject.taskId()): taskEventLis;
                            if (taskEventLis1 != null) {
                               taskEventLis1.onStateChanged(oobject.taskId(), pause1);
                            }
                         }
                         b = b + 1;
                      }
                   }
                }else {
                   UploadData currentUploa = this.getCurrentUploadData();
                   HttpUploadAgent currentUploa1 = this.getCurrentUploadAgent();
                   if (currentUploa != null && (currentUploa1 == null || !currentUploa.enableResume())) {
                      return b;
                   }else {
                      currentUploa1.cancel();
                      currentUploa.extInfo().updateUploadStatus(pause);
                      if (!TextUtils.isEmpty(currentUploa.taskId())) {
                         taskEventLis = this.mTaskListeners.get(currentUploa.taskId());
                      }
                      if (taskEventLis != null) {
                         taskEventLis.onStateChanged(currentUploa.taskId(), pause);
                      }
                   }
                }
                IUploader$UploadStatus pause2 = IUploader$UploadStatus.Pause;
                tmUploadData.status = pause2;
                tmUploadData = this.mEventListener;
                if (tmUploadData != null) {
                   tmUploadData.onStateChanged(pause2);
                }
             }else {
                Integer integer = this.mUploadDataOrm.get(p0);
                if (integer != null && integer.intValue() >= 0) {
                   if (!this.mUploadDataList[integer.intValue()].enableResume()) {
                      return b;
                   }else {
                      this.mUploadDataList[integer.intValue()].extInfo().updateUploadStatus(pause);
                      HttpUploader tmUploadAgen = this.mUploadAgents;
                      if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
                         b = integer.intValue();
                      }
                      tmUploadAgen[b].cancel();
                      taskEventLis1 = this.mTaskListeners.get(p0);
                      if (taskEventLis1 != null) {
                         taskEventLis1.onStateChanged(p0, pause);
                      }
                   }
                }
             }
             return true;
          }
       }
    label_0127 :
       return b;
    }
    public void putTaskEventListener(String p0,IUploader$TaskEventListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpUploader.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.mTaskListeners.put(p0, p1);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, HttpUploader.class, "16")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-HttpUploader", "release");
       HttpUploader tmUploadAgen = this.mUploadAgents;
       if (tmUploadAgen != null && tmUploadAgen.length > 0) {
          int len = tmUploadAgen.length;
          for (int i = 0; i < len; i = i + 1) {
             tmUploadAgen[i].release();
          }
          this.mUploadAgents = null;
       }
       return;
    }
    public final void reportStartLog(long p0){
       HttpUploader httpUploader = HttpUploader.class;
       if (PatchProxy.isSupport(httpUploader) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, httpUploader, "20")) {
          return;
       }
       if (this.mLogReporter == null) {
          return;
       }
       UploadLogInfo uploadLogInf = new UploadLogInfo();
       uploadLogInf.setStartTime(p0);
       this.mLogReporter.onReportUploadLog(KSUploaderKitCommon$Status.Start, uploadLogInf);
       return;
    }
    public boolean resume(){
       Object obj = PatchProxy.apply(null, this, HttpUploader.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.resume(null);
    }
    public boolean resume(String p0){
       boolean b;
       HttpUploader obj = PatchProxy.applyOneRefs(p0, this, HttpUploader.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          KSUploaderKitLog.i("KSUploaderKit-HttpUploader", "resume ");
          obj = this.mUploadAgents;
          b = false;
          if (obj != null && obj.length > 0) {
             if (TextUtils.isEmpty(p0)) {
                this.createHttpUploaderAndInit(this.mUploaderConfig.uploadMode);
                this.tryUploadData();
             }else {
                Integer integer = this.mUploadDataOrm.get(p0);
                if (integer != null && integer.intValue() >= 0) {
                   object oobject = this.mUploadDataList[integer.intValue()];
                   if (oobject == null) {
                      return b;
                   }else if(KSUploaderKitCommon$UploadMode.Fragement == oobject.uploadMode()){
                      return b;
                   }else if(!oobject.enableResume() || oobject.extInfo().uploadStatus() != IUploader$UploadStatus.Pause){
                      HttpUploadAgent httpUploadAg = this.createUploaderAgent(this.mUploaderConfig.uploadMode, this.mApiNetAgents[integer.intValue()], oobject);
                      HttpUploader tmUploadAgen = this.mUploadAgents;
                      int i = (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent)? integer.intValue(): 0;
                      tmUploadAgen[i] = httpUploadAg;
                      oobject.extInfo().updateStartTime(System.currentTimeMillis());
                      IUploader$UploadStatus uploading = IUploader$UploadStatus.Uploading;
                      oobject.extInfo().updateUploadStatus(uploading);
                      long l = oobject.extInfo().startTime();
                      this.reportStartLog(l);
                      httpUploadAg.startUpload(oobject.filePath(), (int)oobject.duration(), oobject.taskId());
                      IUploader$TaskEventListener taskEventLis = this.mTaskListeners.get(oobject.taskId());
                      if (taskEventLis != null) {
                         taskEventLis.onStateChanged(oobject.taskId(), uploading);
                      }
                   }
                }
             }
             HttpUploader tmEventListe = this.mEventListener;
             if (tmEventListe != null && this.mUploaderConfig.extInfo.status == IUploader$UploadStatus.Pause) {
                tmEventListe.onStateChanged(IUploader$UploadStatus.Resume);
             }
             tmEventListe.status = IUploader$UploadStatus.Uploading;
             return true;
          }
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
    label_00f7 :
       return b;
    }
    public void setConfig(PublishConfig p0){
       this.mPublishConfig = p0;
    }
    public void setEventListener(IUploader$EventListener p0){
       this.mEventListener = p0;
    }
    public void setLogReporter(LogReporter p0){
       this.mLogReporter = p0;
    }
    public void startCoverUpload(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpUploader.class, "7")) {
          return;
       }
       HttpUploader tmUploadData = this.mUploadDataList;
       if (tmUploadData != null && tmUploadData.length > 0) {
          object oobject = this.mApiNetAgents[0];
          if (oobject == null) {
             return;
          }else {
             KSUploaderKitCommon$UploadMode whole = KSUploaderKitCommon$UploadMode.Whole;
             oobject.setTokenType(ApiManager$TokenType.Cover);
             UploadData[] uploadDataAr = new UploadData[]{new UploadData$Builder(whole, p0).setDuration(this.mUploadDataList[0].duration()).setInnerTaskId(String.valueOf(System.currentTimeMillis())).setTaskId(this.mUploadDataList[0].taskId()).setMediaType(this.mApiManager.getMediaType()).setEnableResume(0).build()};
             this.mUploadDataList = uploadDataAr;
             this.release();
             this.createHttpUploaderAndInit(whole);
             this.mIsUploadingCover = true;
             this.tryUploadData();
          }
       }
       return;
    }
    public void startUpload(KSUploaderKitCommon$UploadMode p0,String p1,long p2,String p3,boolean p4){
       HttpUploader httpUploader = HttpUploader.class;
       if (PatchProxy.isSupport(httpUploader)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, httpUploader, "2")) {
             return;
          }
       }
       UploadData[] uploadDataAr = new UploadData[]{new UploadData$Builder(p0, p1).setDuration(p2).setInnerTaskId(String.valueOf(System.currentTimeMillis())).setTaskId(p3).setMediaType(this.mApiManager.getMediaType()).setEnableResume(p4).build()};
       this.startUpload(p0, uploadDataAr);
       return;
    }
    public void startUpload(KSUploaderKitCommon$UploadMode p0,UploadData[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpUploader.class, "3")) {
          return;
       }
       if (p1 != null && p1.length > 0) {
          int i = 0;
          this.mFailedCount.set(i);
          HttpUploader tmUploaderCo = this.mUploaderConfig;
          if (tmUploaderCo.channelType != KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
             KSUploaderKitCommon$UploadChannelType multiSerial = (p1.length > 1)? KSUploaderKitCommon$UploadChannelType.MultiSerial: KSUploaderKitCommon$UploadChannelType.Single;
             tmUploaderCo.channelType = multiSerial;
          }
          KSUploaderKitLog.i("KSUploaderKit-HttpUploader", "start upload file");
          ApiNetAgent[] uApiNetAgent = new ApiNetAgent[p1.length];
          this.mApiNetAgents = uApiNetAgent;
          for (; i < p1.length; i = i + 1) {
             object oobject = p1[i];
             oobject.extInfo().updateStartTime(System.currentTimeMillis());
             String str = oobject.innerTaskId();
             if (!TextUtils.isEmpty(oobject.taskId())) {
                this.mUploadDataOrm.put(oobject.taskId(), Integer.valueOf(i));
                str = oobject.taskId();
             }
             ApiNetAgent uApiNetAgent1 = new ApiNetAgent(this.mApiManager, str);
             ApiManager$TokenType image = (oobject.mediaType() == KSUploaderKitCommon$MediaType.Image)? ApiManager$TokenType.Image: ApiManager$TokenType.Video;
             uApiNetAgent1.setTokenType(image);
             this.mApiNetAgents[i] = uApiNetAgent1;
          }
          this.mUploadDataList = p1;
          if (this.mUploaderConfig.extInfo.status != IUploader$UploadStatus.Init) {
             this.cancel();
             this.release();
             this.mUploaderConfig.extInfo.init();
          }
          p1.uploadMode = p0;
          this.createHttpUploaderAndInit(p0);
          this.tryUploadData();
          HttpUploader tmEventListe = this.mEventListener;
          if (tmEventListe != null) {
             tmEventListe.onStateChanged(IUploader$UploadStatus.Uploading);
          }
       }
    label_00b0 :
       return;
    }
    public int statusToIntValue(KSUploaderKitCommon$Status p0){
       if (KSUploaderKitCommon$Status.Success == p0) {
          return 1;
       }
       return 0;
    }
    public void tryUploadData(){
       IUploader$UploadStatus uploading;
       long l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HttpUploader.class, "6")) {
          return;
       }
       HttpUploader tmUploadAgen = this.mUploadAgents;
       if (tmUploadAgen != null && tmUploadAgen.length > 0) {
          try{
             tmUploadAgen = this.mUploadDataList;
             if (tmUploadAgen != null && tmUploadAgen.length > 0) {
                UploadData currentUploa = this.getCurrentUploadData();
                HttpUploadAgent currentUploa1 = this.getCurrentUploadAgent();
                ApiNetAgent currentNetAg = this.getCurrentNetAgent();
                int i = HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i == 3) {
                         if (this.mUploadAgents.length != this.mUploadDataList.length) {
                            return;
                         }else {
                            this.mUploaderConfig.extInfo.cursor.set(0);
                            while (currentUploa != null && currentUploa1 != null) {
                               uploading = IUploader$UploadStatus.Uploading;
                               currentUploa.extInfo().updateUploadStatus(uploading);
                               currentUploa.extInfo().updateStartTime(System.currentTimeMillis());
                               l = currentUploa.extInfo().startTime();
                               try{
                                  this.reportStartLog(l);
                                  currentUploa1.startUpload(currentUploa.filePath(), (int)currentUploa.duration(), currentUploa.taskId());
                                  IUploader$TaskEventListener taskEventLis = (!TextUtils.isEmpty(currentUploa.taskId()))? this.mTaskListeners.get(currentUploa.taskId()): objArray;
                                  if (taskEventLis != null) {
                                     taskEventLis.onStateChanged(currentUploa.taskId(), uploading);
                                  }
                                  this.mUploaderConfig.extInfo.cursor.getAndIncrement();
                                  currentUploa = this.getCurrentUploadData();
                                  currentUploa1 = this.getCurrentUploadAgent();
                               }catch(java.lang.Exception e4){
                                  e4.printStackTrace();
                                  goto label_0054 ;
                               }
                            }
                         }
                      }
                   }else if(currentUploa != null && currentUploa1 != null){
                      uploading = IUploader$UploadStatus.Uploading;
                      currentUploa.extInfo().updateUploadStatus(uploading);
                      currentUploa.extInfo().updateStartTime(System.currentTimeMillis());
                      l = currentUploa.extInfo().startTime();
                      try{
                         this.reportStartLog(l);
                         currentUploa1.startUpload(currentUploa.filePath(), (int)currentUploa.duration(), currentUploa.taskId());
                         if (!TextUtils.isEmpty(currentUploa.taskId())) {
                            objArray = this.mTaskListeners.get(currentUploa.taskId());
                         }
                         if (objArray != null) {
                            objArray.onStateChanged(currentUploa.taskId(), uploading);
                         }
                      }catch(java.lang.Exception e0){
                         e0.printStackTrace();
                         return;
                      }
                   }
                }else if(currentUploa == null){
                   return;
                }else {
                   uploading = IUploader$UploadStatus.Uploading;
                   currentUploa.extInfo().updateUploadStatus(uploading);
                   currentUploa.extInfo().updateStartTime(System.currentTimeMillis());
                   this.reportStartLog(currentUploa.extInfo().startTime());
                   if (currentUploa1 != null) {
                      currentUploa1.startUpload(currentUploa.filePath(), (int)currentUploa.duration(), currentUploa.taskId());
                      if (!TextUtils.isEmpty(currentUploa.taskId())) {
                         objArray = this.mTaskListeners.get(currentUploa.taskId());
                      }
                      if (objArray != null) {
                         objArray.onStateChanged(currentUploa.taskId(), uploading);
                      }
                   }
                }
                if (currentNetAg != null) {
                   this.mBitrateStats.start(currentNetAg.getStartFileSize());
                }
                this.mUploaderConfig.extInfo.status = IUploader$UploadStatus.Uploading;
                return;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void uploadSegment(KSUploaderKitSegmentInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpUploader.class, "8")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-HttpUploader", "upload Segment");
       HttpUploadAgent currentUploa = this.getCurrentUploadAgent();
       if (currentUploa != null) {
          currentUploa.uploadSegment(p0);
       }
       return;
    }
}
