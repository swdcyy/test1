package com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.io.Serializable;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.p;
import java.io.File;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import nl9.d;
import wkd.b;
import j80.c;
import java.lang.Boolean;
import o35.b;
import pkd.a;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import java.lang.Long;
import java.lang.Integer;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask;

public class APKDownloadTask implements Serializable	// class@00113c
{
    public APKDownloadTask$DownloadStatus mCurrentStatus;
    public final DownloadTask$DownloadRequest mDownloadRequest;
    public Throwable mDownloadRequestFailedException;
    public AdDownloaderType mDownloadType;
    public long mDownloadedTime;
    public String mErrorMessage;
    public boolean mHasEntryNotifyCheck;
    public final int mId;
    public boolean mIsFailForMobileNetwork;
    public int mNotifyReInstallCount;
    public APKDownloadTask$DownloadStatus mPreviousStatus;
    public boolean mReportedInstalled;
    public boolean mShouldAutoResume;
    public long mSoFarBytes;
    public final ApkDownloadTaskInfo mTaskInfo;
    public long mTotalBytes;
    public static final long serialVersionUID = 0xe46538be97debef7;

    public void APKDownloadTask(int p0,DownloadTask$DownloadRequest p1,ApkDownloadTaskInfo p2,AdDownloaderType p3){
       super();
       this.mDownloadRequest = p1;
       APKDownloadTask$DownloadStatus iNITIALIZED = APKDownloadTask$DownloadStatus.INITIALIZED;
       this.mPreviousStatus = iNITIALIZED;
       this.mCurrentStatus = iNITIALIZED;
       this.mId = p0;
       this.mShouldAutoResume = false;
       this.mSoFarBytes = 0;
       this.mTotalBytes = 0;
       this.mTaskInfo = p2;
       this.mDownloadType = p3;
    }
    public final void a(APKDownloadTask$DownloadStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, APKDownloadTask.class, "17")) {
          return;
       }
       APKDownloadTask tmCurrentSta = this.mCurrentStatus;
       if (p0 == tmCurrentSta) {
          return;
       }
       this.mPreviousStatus = tmCurrentSta;
       this.mCurrentStatus = p0;
       if (p0 != tmCurrentSta) {
          RxBus.f.b(new p());
       }
       APKDownloadTask tmCurrentSta1 = this.mCurrentStatus;
       if (tmCurrentSta1 == APKDownloadTask$DownloadStatus.DELETED) {
          this.getDownloadTaskFile().delete();
       }else if(!this.mDownloadedTime && tmCurrentSta1 == APKDownloadTask$DownloadStatus.COMPLETED){
          this.mDownloadedTime = System.currentTimeMillis();
       }
       this.saveToCache();
       return;
    }
    public String getAppIcon(){
       Object obj = PatchProxy.apply(null, this, APKDownloadTask.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTaskInfo.getAppIcon();
    }
    public String getAppName(){
       Object obj = PatchProxy.apply(null, this, APKDownloadTask.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTaskInfo.getAppName();
    }
    public File getDownloadAPKFile(){
       Object[] objArray = null;
       APKDownloadTask obj = PatchProxy.apply(objArray, this, APKDownloadTask.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDownloadRequest;
       if (obj != null && (obj.getDestinationDir() == null || this.mDownloadRequest.getDestinationFileName() == null)) {
          return objArray;
       }
       return new File(this.mDownloadRequest.getDestinationDir(), this.mDownloadRequest.getDestinationFileName());
    }
    public File getDownloadTaskFile(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.apply(null, this, APKDownloadTask.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       File uFile = new File(b.a(-1504323719).c(d.a(0x4bd38ddd).Wz()), d.a(0x4bd38ddd).Z20());
       obj = PatchProxy.applyOneRefs(uFile, this, APKDownloadTask.class, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!uFile.exists()){
          b = uFile.mkdirs();
       }else {
          b = true;
       }
       if (!b) {
          obj = new Object[0];
          b.g().d("APKDownloadTask", "cannot makeDir of downloadTaskDir", obj);
       }
       return new File(uFile, String.valueOf(this.mId));
    }
    public String getDownloadUrl(){
       APKDownloadTask obj = PatchProxy.apply(null, this, APKDownloadTask.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDownloadRequest;
       if (obj != null) {
          return obj.getDownloadUrl();
       }
       return null;
    }
    public ApkDownloadTaskInfo getTaskInfo(){
       APKDownloadTask tmTaskInfo;
       try{
          tmTaskInfo = this.mTaskInfo;
       }catch(java.lang.ClassCastException e0){
          if (a.a) {
             throw e0;
          }
          tmTaskInfo = null;
       }
       return tmTaskInfo;
    }
    public void saveToCache(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "18")) {
          return;
       }
       try{
          ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(this.getDownloadTaskFile(), false));
          objectOutput.writeObject(this);
          objectOutput.close();
       }catch(java.io.IOException e0){
          b.g().c("APKDownloadTask", "cannot write download list", e0);
       }
       return;
    }
    public void setToAPKFileDeletedStatus(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "12")) {
          return;
       }
       if (this.mCurrentStatus != APKDownloadTask$DownloadStatus.INSTALLED) {
          this.setToDeletedStatus();
       }else {
          this.mTotalBytes = 0;
          this.mSoFarBytes = 0;
       }
       return;
    }
    public void setToCompletedStatus(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "9")) {
          return;
       }
       this.a(APKDownloadTask$DownloadStatus.COMPLETED);
       this.updateDownloadAPKFileSizeIfNecessary();
       return;
    }
    public void setToDeletedStatus(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "13")) {
          return;
       }
       this.a(APKDownloadTask$DownloadStatus.DELETED);
       this.mTotalBytes = 0;
       this.mSoFarBytes = 0;
       return;
    }
    public void setToFailedStatus(long p0,String p1){
       if (PatchProxy.isSupport(APKDownloadTask.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, APKDownloadTask.class, "15")) {
          return;
       }
       this.mErrorMessage = p1;
       this.a(APKDownloadTask$DownloadStatus.ERROR);
       this.mTotalBytes = p0;
       return;
    }
    public void setToFailedStatus(long p0,Throwable p1,int p2){
       if (PatchProxy.isSupport(APKDownloadTask.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, APKDownloadTask.class, "14")) {
          return;
       }
       DownloadTask uDownloadTas = DownloadManager.n().l(p2);
       if (uDownloadTas != null) {
          this.mIsFailForMobileNetwork = uDownloadTas.isErrorBecauseWifiRequired();
       }
       this.setToFailedStatus(p0, d.a(0x4bd38ddd).FZ(p1));
       return;
    }
    public void setToInstalledStatus(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "10")) {
          return;
       }
       this.a(APKDownloadTask$DownloadStatus.INSTALLED);
       this.updateDownloadAPKFileSizeIfNecessary();
       return;
    }
    public void setToPausedStatus(long p0,long p1){
       if (PatchProxy.isSupport(APKDownloadTask.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, APKDownloadTask.class, "5")) {
          return;
       }
       if (p0 <= 0) {
          APKDownloadTask tmSoFarBytes = this.mSoFarBytes;
       }
       this.mSoFarBytes = p0;
       if (p1 <= 0) {
          APKDownloadTask tmTotalBytes = this.mTotalBytes;
       }
       this.mTotalBytes = p1;
       this.a(APKDownloadTask$DownloadStatus.PAUSED);
       return;
    }
    public void setToResumedStatus(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "7")) {
          return;
       }
       this.mIsFailForMobileNetwork = false;
       this.a(APKDownloadTask$DownloadStatus.STARTED);
       return;
    }
    public void setToResumedStatus(long p0,long p1){
       if (PatchProxy.isSupport(APKDownloadTask.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, APKDownloadTask.class, "8")) {
          return;
       }
       if (p0 <= 0) {
          APKDownloadTask tmSoFarBytes = this.mSoFarBytes;
       }
       this.mSoFarBytes = p0;
       if (p1 <= 0) {
          APKDownloadTask tmTotalBytes = this.mTotalBytes;
       }
       this.mTotalBytes = p1;
       this.setToResumedStatus();
       return;
    }
    public void setToStartedStatus(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "6")) {
          return;
       }
       this.a(APKDownloadTask$DownloadStatus.STARTED);
       return;
    }
    public void setToUninstalledStatus(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "11")) {
          return;
       }
       File downloadAPKF = this.getDownloadAPKFile();
       if (downloadAPKF != null && downloadAPKF.exists()) {
          this.setToCompletedStatus();
       }else {
          this.setToDeletedStatus();
       }
       return;
    }
    public void setmDownloadRequestFailedException(Throwable p0){
       this.mDownloadRequestFailedException = p0;
    }
    public void updateDownloadAPKFileSizeIfNecessary(){
       if (PatchProxy.applyVoid(null, this, APKDownloadTask.class, "16")) {
          return;
       }
       File downloadAPKF = this.getDownloadAPKFile();
       APKDownloadTask tmCurrentSta = this.mCurrentStatus;
       if (tmCurrentSta == APKDownloadTask$DownloadStatus.COMPLETED || (tmCurrentSta == APKDownloadTask$DownloadStatus.INSTALLED && (downloadAPKF != null && downloadAPKF.exists()))) {
          long l = downloadAPKF.length();
          this.mTotalBytes = l;
          this.mSoFarBytes = l;
       }
    label_002a :
       return;
    }
}
