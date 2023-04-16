package com.kwai.video.ksuploaderkit.uploader.RickonUploader;
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
import com.ks.ksuploader.KSUploader;
import com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import com.kwai.video.ksuploaderkit.uploader.IUploader$EventListener;
import java.lang.Integer;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.ks.ksuploader.KSPipelineUploader;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.logreporter.LogReporterUtils;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import com.ks.ksapi.b;
import com.ks.ksuploader.KSFileUploader;
import com.ks.ksuploader.KSUploader$RickonConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BitrateType;
import java.lang.Number;
import com.kwai.video.ksuploaderkit.apicenter.ApiNetAgent;
import com.kwai.video.ksuploaderkit.uploader.RickonUploader$2;
import java.lang.Enum;
import java.lang.Boolean;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import com.ks.ksuploader.KSUploaderEventListener;
import java.lang.Exception;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import com.kwai.video.ksuploaderkit.uploader.RickonUploader$1;
import com.kwai.video.ksuploaderkit.uploader.UploadData$Builder;
import com.ks.ksuploader.KSEncryptConfig;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;

public class RickonUploader implements IUploader	// class@0009d5
{
    public ApiManager mApiManager;
    public BitrateStats mBitrateStats;
    public Context mContext;
    public IUploader$EventListener mEventListener;
    public AtomicInteger mFailedCount;
    public boolean mIsUploadingCover;
    public LogReporter mLogReporter;
    public ApiNetAgent[] mNetAgents;
    public ConcurrentHashMap mTaskListeners;
    public UploadData[] mUploadData;
    public ConcurrentHashMap mUploadOrm;
    public UploaderConfig mUploaderConfig;
    public KSUploader[] mUploaders;

    public void RickonUploader(Context p0,KSUploaderKitCommon$UploadChannelType p1,KSUploaderKitCommon$UploadMode p2,ApiManager p3){
       super();
       this.mUploadOrm = new ConcurrentHashMap();
       this.mTaskListeners = new ConcurrentHashMap();
       this.mUploaderConfig = new UploaderConfig();
       this.mFailedCount = new AtomicInteger(0);
       this.mIsUploadingCover = false;
       this.mContext = p0;
       this.mBitrateStats = new BitrateStats();
       this.mApiManager = p3;
       RickonUploader tmUploaderCo = this.mUploaderConfig;
       tmUploaderCo.channelType = p1;
       tmUploaderCo.uploadMode = (p1 == KSUploaderKitCommon$UploadChannelType.Single)? p2: KSUploaderKitCommon$UploadMode.Whole;
       tmUploaderCo.extInfo.init();
       return;
    }
    public void RickonUploader(Context p0,KSUploaderKitCommon$UploadMode p1,ApiManager p2){
       super(p0, KSUploaderKitCommon$UploadChannelType.Single, p1, p2);
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, RickonUploader.class, "13")) {
          return;
       }
       this.cancel(null);
       return;
    }
    public void cancel(String p0){
       RickonUploader tmUploadData;
       IUploader$TaskEventListener taskEventLis;
       if (PatchProxy.applyVoidOneRefs(p0, this, RickonUploader.class, "14")) {
          return;
       }
       int i = 0;
       if (TextUtils.isEmpty(p0)) {
          String str = null;
          if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
             tmUploadData = this.mUploadData;
             if (tmUploadData == null || tmUploadData.length <= 0) {
                return;
             }else {
                tmUploadData = this.mUploadData;
                while (i < tmUploadData.length) {
                   object oobject = tmUploadData[i];
                   IUploader$UploadStatus cancel = IUploader$UploadStatus.Cancel;
                   oobject.extInfo().updateUploadStatus(cancel);
                   this.mUploaders[i].cancel();
                   taskEventLis = (!TextUtils.isEmpty(oobject.taskId()))? this.mTaskListeners.get(oobject.taskId()): str;
                   if (taskEventLis != null) {
                      taskEventLis.onStateChanged(oobject.taskId(), cancel);
                   }
                   i = i + 1;
                }
             }
          }else {
             UploadData currentUploa = this.getCurrentUploadData();
             KSUploader currentUploa1 = this.getCurrentUploader();
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
          Integer integer = this.mUploadOrm.get(p0);
          if (integer != null && integer.intValue() >= 0) {
             IUploader$UploadStatus cancel2 = IUploader$UploadStatus.Cancel;
             this.mUploadData[integer.intValue()].extInfo().updateUploadStatus(cancel2);
             RickonUploader tmUploaders = this.mUploaders;
             if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
                i = integer.intValue();
             }
             tmUploaders[i].cancel();
             taskEventLis = this.mTaskListeners.get(p0);
             if (taskEventLis != null) {
                taskEventLis.onStateChanged(p0, cancel2);
             }
          }
       }
       return;
    }
    public void createRickonUploaderAndInit(KSUploaderKitCommon$UploadMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RickonUploader.class, "20")) {
          return;
       }
       this.inflateUploaders(p0);
       return;
    }
    public UploadLogInfo createUploadLogInfo(KSUploaderCloseReason p0,long p1,String p2,UploadData p3,String p4){
       UploadLogInfo obj;
       RickonUploader rickonUpload = RickonUploader.class;
       int i = 1;
       if (PatchProxy.isSupport(rickonUpload)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, rickonUpload, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new UploadLogInfo();
       if (p3 != null) {
          obj.setStartTime(p3.extInfo().startTime());
          String str = p3.filePath();
          if (this.getPipelineUploader() == null) {
             i = false;
          }
          obj.setMediaType(LogReporterUtils.getMediaType(str, i));
          obj.setFileSize(p3.extInfo().fileSize());
       }
       obj.setCloseReason(p0.value());
       obj.setUploadStatus(p1);
       obj.setStatsJson(p2);
       obj.setEndTime(System.currentTimeMillis());
       obj.setDNSResolveStats(this.mApiManager.getDnsResolveStatsList());
       obj.setGatewayInfoList(this.mApiManager.getOriginGatewayInfoList());
       obj.setBusinessType(KSUploaderKitCommon$BusinessType.KSUploaderKit);
       obj.setErrorMsg(p4);
       return obj;
    }
    public final KSUploader createUploaderAndInit(KSUploaderKitCommon$UploadMode p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RickonUploader.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSPipelineUploader kSPipelineUp = (p0 == KSUploaderKitCommon$UploadMode.Fragement)? new KSPipelineUploader(this.mContext, p1): new KSFileUploader(this.mContext, p1);
       kSPipelineUp.setConfig(this.mUploaderConfig.getRickonConfig());
       return kSPipelineUp;
    }
    public void finishUploadSegment(){
       if (PatchProxy.applyVoid(null, this, RickonUploader.class, "8")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-RickonUploader", "finish Upload Segment");
       KSPipelineUploader pipelineUplo = this.getPipelineUploader();
       if (pipelineUplo != null) {
          pipelineUplo.finishFramgment(null);
       }
       return;
    }
    public int getBitrate(KSUploaderKitCommon$BitrateType p0){
       RickonUploader obj = PatchProxy.applyOneRefs(p0, this, RickonUploader.class, "16");
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
       RickonUploader obj = PatchProxy.apply(objArray, this, RickonUploader.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                return objArray;
             }
          }else {
             i = this.mUploaderConfig.extInfo.cursor.get();
             RickonUploader tmNetAgents = this.mNetAgents;
             if (tmNetAgents != null && tmNetAgents.length > i) {
                objArray = tmNetAgents[i];
             }
             return objArray;
          }
       }
       obj = this.mNetAgents;
       if (obj != null && obj.length > 0) {
          objArray = obj[0];
       }
       return objArray;
    }
    public final UploadData getCurrentUploadData(){
       Object[] objArray = null;
       RickonUploader obj = PatchProxy.apply(objArray, this, RickonUploader.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       if (i != 1) {
          if (i != 2 && i != 3) {
             return objArray;
          }else {
             i = this.mUploaderConfig.extInfo.cursor.get();
             RickonUploader tmUploadData = this.mUploadData;
             if (tmUploadData != null && tmUploadData.length > i) {
                objArray = tmUploadData[i];
             }
             return objArray;
          }
       }else {
          obj = this.mUploadData;
          if (obj != null && obj.length > 0) {
             objArray = obj[0];
          }
          return objArray;
       }
    }
    public final KSUploader getCurrentUploader(){
       Object[] objArray = null;
       RickonUploader obj = PatchProxy.apply(objArray, this, RickonUploader.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             return objArray;
          }else {
             i = this.mUploaderConfig.extInfo.cursor.get();
             RickonUploader tmUploaders = this.mUploaders;
             if (tmUploaders != null && tmUploaders.length > i) {
                objArray = tmUploaders[i];
             }
             return objArray;
          }
       }else {
          obj = this.mUploaders;
          if (obj != null && obj.length > 0) {
             objArray = obj[0];
          }
          return objArray;
       }
    }
    public int getFailedCount(){
       Object obj = PatchProxy.apply(null, this, RickonUploader.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mFailedCount.get();
    }
    public final KSFileUploader getFileUploader(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RickonUploader.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getCurrentUploader() instanceof KSFileUploader) {
          objArray = this.getCurrentUploader();
       }
       return objArray;
    }
    public final KSPipelineUploader getPipelineUploader(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RickonUploader.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getCurrentUploader() instanceof KSPipelineUploader) {
          objArray = this.getCurrentUploader();
       }
       return objArray;
    }
    public IUploader$UploadStatus getStatus(){
       return this.mUploaderConfig.extInfo.status;
    }
    public final void inflateUploaders(KSUploaderKitCommon$UploadMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RickonUploader.class, "18")) {
          return;
       }
       int i = RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
       int i1 = 0;
       int i2 = 1;
       if (i != i2) {
          if (i != 2) {
             if (i == 3) {
                RickonUploader tmUploadData = this.mUploadData;
                if (tmUploadData != null && tmUploadData.length > 0) {
                   KSUploader[] kSUploaderAr = new KSUploader[tmUploadData.length];
                   this.mUploaders = kSUploaderAr;
                   kSUploaderAr = KSUploaderKitCommon$UploadMode.Whole;
                   RickonUploader tmUploaders = this.mUploaders;
                   while (i1 < tmUploaders.length) {
                      tmUploaders[i1] = this.createUploaderAndInit(kSUploaderAr, this.mNetAgents[i1]);
                      i1 = i1 + 1;
                   }
                }
             }
          }else {
             KSUploader[] kSUploaderAr1 = new KSUploader[i2];
             kSUploaderAr1[i1] = this.createUploaderAndInit(KSUploaderKitCommon$UploadMode.Whole, this.mNetAgents[this.mUploaderConfig.extInfo.cursor.get()]);
             this.mUploaders = kSUploaderAr1;
          }
       }else {
          KSUploader[] kSUploaderAr2 = new KSUploader[i2];
          kSUploaderAr2[i1] = this.createUploaderAndInit(p0, this.mNetAgents[i1]);
          this.mUploaders = kSUploaderAr2;
       }
       return;
    }
    public boolean pause(){
       Object obj = PatchProxy.apply(null, this, RickonUploader.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.pause(null);
    }
    public boolean pause(String p0){
       IUploader$UploadStatus pause;
       RickonUploader tmUploadData;
       IUploader$TaskEventListener taskEventLis1;
       RickonUploader obj = PatchProxy.applyOneRefs(p0, this, RickonUploader.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       KSUploaderKitLog.i("KSUploaderKit-RickonUploader", "pause ");
       obj = this.mUploaders;
       boolean b = false;
       if (obj != null && obj.length > 0) {
          pause = IUploader$UploadStatus.Pause;
          if (this.mUploaderConfig.extInfo.status != pause) {
             if (TextUtils.isEmpty(p0)) {
                IUploader$TaskEventListener taskEventLis = null;
                if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
                   tmUploadData = this.mUploadData;
                   if (tmUploadData == null || tmUploadData.length <= 0) {
                      return b;
                   }else {
                      tmUploadData = this.mUploadData;
                      while (b < tmUploadData.length) {
                         object oobject = tmUploadData[b];
                         object oobject1 = this.mUploaders[b];
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
                   KSUploader currentUploa1 = this.getCurrentUploader();
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
                Integer integer = this.mUploadOrm.get(p0);
                if (integer != null && integer.intValue() >= 0) {
                   if (!this.mUploadData[integer.intValue()].enableResume()) {
                      return b;
                   }else {
                      this.mUploadData[integer.intValue()].extInfo().updateUploadStatus(pause);
                      RickonUploader tmUploaders = this.mUploaders;
                      if (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
                         b = integer.intValue();
                      }
                      tmUploaders[b].cancel();
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RickonUploader.class, "2")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.mTaskListeners.put(p0, p1);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, RickonUploader.class, "15")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-RickonUploader", "release");
       RickonUploader tmUploaders = this.mUploaders;
       if (tmUploaders != null && tmUploaders.length > 0) {
          int len = tmUploaders.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = tmUploaders[i];
             oobject.cancel();
             oobject.release();
          }
          this.mUploaders = null;
       }
       return;
    }
    public final void reportStartLog(long p0){
       RickonUploader rickonUpload = RickonUploader.class;
       if (PatchProxy.isSupport(rickonUpload) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, rickonUpload, "28")) {
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
       Object obj = PatchProxy.apply(null, this, RickonUploader.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.resume(null);
    }
    public boolean resume(String p0){
       boolean b;
       RickonUploader obj = PatchProxy.applyOneRefs(p0, this, RickonUploader.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          KSUploaderKitLog.i("KSUploaderKit-RickonUploader", "resume ");
          obj = this.mUploaders;
          b = false;
          if (obj != null && obj.length > 0) {
             if (TextUtils.isEmpty(p0)) {
                this.createRickonUploaderAndInit(this.mUploaderConfig.uploadMode);
                this.tryUploadData();
             }else {
                Integer integer = this.mUploadOrm.get(p0);
                if (integer != null && integer.intValue() >= 0) {
                   object oobject = this.mUploadData[integer.intValue()];
                   if (oobject == null) {
                      return b;
                   }else if(!oobject.enableResume() || oobject.extInfo().uploadStatus() != IUploader$UploadStatus.Pause){
                      KSUploader kSUploader = this.createUploaderAndInit(this.mUploaderConfig.uploadMode, this.mNetAgents[integer.intValue()]);
                      RickonUploader tmUploaders = this.mUploaders;
                      int i = (this.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.MultiConcurrent)? integer.intValue(): 0;
                      tmUploaders[i] = kSUploader;
                      if (!kSUploader instanceof KSFileUploader) {
                         return b;
                      }else {
                         kSUploader.setEventListener(this.setupUploaderEventListener(oobject));
                         oobject.extInfo().updateStartTime(System.currentTimeMillis());
                         IUploader$UploadStatus uploading = IUploader$UploadStatus.Uploading;
                         oobject.extInfo().updateUploadStatus(uploading);
                         long l = oobject.extInfo().startTime();
                         this.reportStartLog(l);
                         kSUploader.startUploadFile(oobject.filePath(), p0, true);
                         IUploader$TaskEventListener taskEventLis = this.mTaskListeners.get(oobject.taskId());
                         if (taskEventLis != null) {
                            taskEventLis.onStateChanged(oobject.taskId(), uploading);
                         }
                      }
                   }
                }
             }
             RickonUploader tmEventListe = this.mEventListener;
             if (tmEventListe != null && this.mUploaderConfig.extInfo.status == IUploader$UploadStatus.Pause) {
                tmEventListe.onStateChanged(IUploader$UploadStatus.Resume);
             }
             tmEventListe.status = IUploader$UploadStatus.Uploading;
             return true;
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
    label_00f3 :
       return b;
    }
    public void setConfig(PublishConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RickonUploader.class, "1")) {
          return;
       }
       this.mUploaderConfig.paramsConfig = p0.getRickonConfig();
       this.mUploaderConfig.disableResumeCrcCheck = p0.getDisableResumeCrcCheck();
       RickonUploader tmUploaders = this.mUploaders;
       if (tmUploaders != null && tmUploaders.length > 0) {
          int len = tmUploaders.length;
          for (int i = 0; i < len; i = i + 1) {
             tmUploaders[i].setConfig(this.mUploaderConfig.getRickonConfig());
          }
       }
       return;
    }
    public void setEventListener(IUploader$EventListener p0){
       this.mEventListener = p0;
    }
    public void setLogReporter(LogReporter p0){
       this.mLogReporter = p0;
    }
    public final KSUploaderEventListener setupUploaderEventListener(UploadData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RickonUploader.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RickonUploader$1(this, p0);
    }
    public void startCoverUpload(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RickonUploader.class, "5")) {
          return;
       }
       RickonUploader tmUploadData = this.mUploadData;
       if (tmUploadData != null && tmUploadData.length > 0) {
          object oobject = this.mNetAgents[0];
          if (oobject == null) {
             return;
          }else {
             KSUploaderKitCommon$UploadMode whole = KSUploaderKitCommon$UploadMode.Whole;
             oobject.setTokenType(ApiManager$TokenType.Cover);
             UploadData[] uploadDataAr = new UploadData[]{new UploadData$Builder(whole, p0).setDuration(this.mUploadData[0].duration()).setInnerTaskId(String.valueOf(System.currentTimeMillis())).setTaskId(this.mUploadData[0].taskId()).setMediaType(this.mApiManager.getMediaType()).setEnableResume(0).setEncryptConfig(this.mUploadData[0].coverEncryptConfig()).build()};
             this.mUploadData = uploadDataAr;
             this.release();
             this.createRickonUploaderAndInit(whole);
             this.mIsUploadingCover = true;
             this.tryUploadData();
          }
       }
       return;
    }
    public void startUpload(KSUploaderKitCommon$UploadMode p0,String p1,long p2,String p3,boolean p4){
       RickonUploader rickonUpload = RickonUploader.class;
       if (PatchProxy.isSupport(rickonUpload)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, rickonUpload, "3")) {
             return;
          }
       }
       UploadData[] uploadDataAr = new UploadData[]{new UploadData$Builder(p0, p1).setDuration(p2).setInnerTaskId(String.valueOf(System.currentTimeMillis())).setTaskId(p3).setMediaType(this.mApiManager.getMediaType()).setEnableResume(p4).build()};
       this.startUpload(p0, uploadDataAr);
       return;
    }
    public void startUpload(KSUploaderKitCommon$UploadMode p0,UploadData[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RickonUploader.class, "4")) {
          return;
       }
       if (p1 != null && p1.length > 0) {
          int i = 0;
          this.mFailedCount.set(i);
          RickonUploader tmUploaderCo = this.mUploaderConfig;
          if (tmUploaderCo.channelType != KSUploaderKitCommon$UploadChannelType.MultiConcurrent) {
             KSUploaderKitCommon$UploadChannelType multiSerial = (p1.length > 1)? KSUploaderKitCommon$UploadChannelType.MultiSerial: KSUploaderKitCommon$UploadChannelType.Single;
             tmUploaderCo.channelType = multiSerial;
          }
          KSUploaderKitLog.i("KSUploaderKit-RickonUploader", "start upload file");
          ApiNetAgent[] uApiNetAgent = new ApiNetAgent[p1.length];
          this.mNetAgents = uApiNetAgent;
          for (; i < p1.length; i = i + 1) {
             object oobject = p1[i];
             oobject.extInfo().updateStartTime(System.currentTimeMillis());
             String str = oobject.innerTaskId();
             if (!TextUtils.isEmpty(oobject.taskId())) {
                this.mUploadOrm.put(oobject.taskId(), Integer.valueOf(i));
                str = oobject.taskId();
             }
             ApiNetAgent uApiNetAgent1 = new ApiNetAgent(this.mApiManager, str);
             ApiManager$TokenType image = (oobject.mediaType() == KSUploaderKitCommon$MediaType.Image)? ApiManager$TokenType.Image: ApiManager$TokenType.Video;
             uApiNetAgent1.setTokenType(image);
             this.mNetAgents[i] = uApiNetAgent1;
          }
          this.mUploadData = p1;
          if (this.mUploaderConfig.extInfo.status != IUploader$UploadStatus.Init) {
             this.cancel();
             this.release();
             this.mUploaderConfig.extInfo.init();
          }
          p1.uploadMode = p0;
          this.createRickonUploaderAndInit(p0);
          this.tryUploadData();
          RickonUploader tmEventListe = this.mEventListener;
          if (tmEventListe != null) {
             tmEventListe.onStateChanged(IUploader$UploadStatus.Uploading);
          }
       }
    label_00b0 :
       return;
    }
    public void tryUploadData(){
       IUploader$UploadStatus uploading;
       KSUploaderEventListener kSUploaderEv;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RickonUploader.class, "6")) {
          return;
       }
       RickonUploader tmUploaders = this.mUploaders;
       if (tmUploaders != null && tmUploaders.length > 0) {
          try{
             tmUploaders = this.mUploadData;
             if (tmUploaders != null && tmUploaders.length > 0) {
                UploadData currentUploa = this.getCurrentUploadData();
                KSFileUploader fileUploader = this.getFileUploader();
                KSPipelineUploader pipelineUplo = this.getPipelineUploader();
                ApiNetAgent currentNetAg = this.getCurrentNetAgent();
                int i = RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[this.mUploaderConfig.channelType.ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i == 3) {
                         if (this.mUploaders.length != this.mUploadData.length) {
                            return;
                         }else {
                            this.mUploaderConfig.extInfo.cursor.set(0);
                            while (currentUploa != null && fileUploader != null) {
                               uploading = IUploader$UploadStatus.Uploading;
                               currentUploa.extInfo().updateUploadStatus(uploading);
                               currentUploa.extInfo().updateStartTime(System.currentTimeMillis());
                               this.reportStartLog(currentUploa.extInfo().startTime());
                               kSUploaderEv = this.setupUploaderEventListener(currentUploa);
                               try{
                                  fileUploader.setEventListener(kSUploaderEv);
                                  fileUploader.startUploadFile(currentUploa.filePath(), currentUploa.taskId(), currentUploa.enableResume());
                                  IUploader$TaskEventListener taskEventLis = (!TextUtils.isEmpty(currentUploa.taskId()))? this.mTaskListeners.get(currentUploa.taskId()): objArray;
                                  if (taskEventLis != null) {
                                     taskEventLis.onStateChanged(currentUploa.taskId(), uploading);
                                  }
                                  this.mUploaderConfig.extInfo.cursor.getAndIncrement();
                                  currentUploa = this.getCurrentUploadData();
                                  fileUploader = this.getFileUploader();
                               }catch(java.lang.Exception e3){
                                  e3.printStackTrace();
                                  goto label_0058 ;
                               }
                            }
                         }
                      }
                   }else if(currentUploa != null && fileUploader != null){
                      uploading = IUploader$UploadStatus.Uploading;
                      currentUploa.extInfo().updateUploadStatus(uploading);
                      currentUploa.extInfo().updateStartTime(System.currentTimeMillis());
                      this.reportStartLog(currentUploa.extInfo().startTime());
                      kSUploaderEv = this.setupUploaderEventListener(currentUploa);
                      try{
                         fileUploader.setEventListener(kSUploaderEv);
                         fileUploader.startUploadFile(currentUploa.filePath(), currentUploa.taskId(), currentUploa.enableResume(), currentUploa.encryptConfig());
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
                   IUploader$UploadStatus uploading1 = IUploader$UploadStatus.Uploading;
                   currentUploa.extInfo().updateUploadStatus(uploading1);
                   currentUploa.extInfo().updateStartTime(System.currentTimeMillis());
                   this.reportStartLog(currentUploa.extInfo().startTime());
                   if (fileUploader != null) {
                      fileUploader.setEventListener(this.setupUploaderEventListener(currentUploa));
                      fileUploader.startUploadFile(currentUploa.filePath(), currentUploa.taskId(), currentUploa.enableResume(), currentUploa.encryptConfig());
                   }else if(pipelineUplo != null){
                      pipelineUplo.setEventListener(this.setupUploaderEventListener(currentUploa));
                      pipelineUplo.setupFragment(currentUploa.duration(), null, currentUploa.enableResume(), currentUploa.encryptConfig());
                   }
                   if (!TextUtils.isEmpty(currentUploa.taskId())) {
                      objArray = this.mTaskListeners.get(currentUploa.taskId());
                   }
                   if (objArray != null) {
                      objArray.onStateChanged(currentUploa.taskId(), uploading1);
                   }
                }
             label_01a5 :
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
       if (PatchProxy.applyVoidOneRefs(p0, this, RickonUploader.class, "7")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-RickonUploader", "upload Segment");
       KSPipelineUploader pipelineUplo = this.getPipelineUploader();
       if (pipelineUplo != null) {
          pipelineUplo.startUploadFragment(p0.getFilePath(), p0.getIndex(), p0.getDurationMs(), p0.getStartPos(), p0.getEndPos(), p0.getEditorMetadata(), p0.getCrc32());
       }
       return;
    }
}
