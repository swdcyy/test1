package com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadSetting;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;
import com.ks.ksuploader.KSEncryptConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KSUploaderKitConfig	// class@000976
{
    public AtomicInteger mCursor;
    public KSUploaderKitConfig$UploadSetting mSetting;
    public KSUploaderKitConfig$UploadInfo[] mUploadInfos;

    public void KSUploaderKitConfig(String p0,String p1,KSUploaderKitCommon$MediaType p2){
       super(p0, p1, null, p2, KSUploaderKitCommon$ServiceType.MediaCloud);
    }
    public void KSUploaderKitConfig(String p0,String p1,String p2,KSUploaderKitCommon$MediaType p3,KSUploaderKitCommon$ServiceType p4){
       super();
       this.mSetting = new KSUploaderKitConfig$UploadSetting();
       this.mCursor = new AtomicInteger(0);
       KSUploaderKitConfig tmSetting = this.mSetting;
       tmSetting.serviceType = p4;
       tmSetting.uploadMode = KSUploaderKitCommon$UploadMode.Whole;
       tmSetting.uploadChannelType = KSUploaderKitCommon$UploadChannelType.Single;
       KSUploaderKitConfig$UploadInfo uploadInfo = new KSUploaderKitConfig$UploadInfo();
       uploadInfo.uploadMode = this.mSetting.uploadMode;
       uploadInfo.taskID = p2;
       uploadInfo.serverSignature = (KSUploaderKitCommon$ServiceType.MediaCloud == p4)? p0: p0;
       uploadInfo.mediaType = p3;
       uploadInfo.filePath = p1;
       KSUploaderKitConfig$UploadInfo[] uploadInfoAr = new KSUploaderKitConfig$UploadInfo[]{uploadInfo};
       this.mUploadInfos = uploadInfoAr;
       return;
    }
    public void KSUploaderKitConfig(String[] p0,String[] p1,String[] p2){
       super(p0, p1, p2, KSUploaderKitCommon$UploadChannelType.MultiSerial, 16);
    }
    public void KSUploaderKitConfig(String[] p0,String[] p1,String[] p2,KSUploaderKitCommon$UploadChannelType p3,int p4){
       super();
       this.mSetting = new KSUploaderKitConfig$UploadSetting();
       int i = 0;
       this.mCursor = new AtomicInteger(i);
       KSUploaderKitConfig tmSetting = this.mSetting;
       tmSetting.serviceType = KSUploaderKitCommon$ServiceType.General;
       tmSetting.uploadMode = KSUploaderKitCommon$UploadMode.Whole;
       tmSetting.uploadChannelType = p3;
       tmSetting.maxConcurrencySize = p4;
       int taskLength = KSUploaderKitConfig.getTaskLength(p1);
       if (taskLength <= 0) {
          return;
       }
       KSUploaderKitConfig$UploadInfo[] uploadInfoAr = new KSUploaderKitConfig$UploadInfo[taskLength];
       this.mUploadInfos = uploadInfoAr;
       while (i < taskLength) {
          uploadInfoAr[i] = new KSUploaderKitConfig$UploadInfo();
          KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
          tmUploadInfo[i].uploadMode = this.mSetting.uploadMode;
          if (p0 != null) {
             tmUploadInfo[i].fileToken = p0[i];
          }
          tmUploadInfo[i].filePath = p1[i];
          if (p2 != null && p2.length > i) {
             tmUploadInfo.taskID = p2[i];
          }
          i = i + 1;
       }
       return;
    }
    public static int getTaskLength(String[] p0){
       if (p0 == null || p0.length <= 0) {
          return 0;
       }
       return p0.length;
    }
    public KSEncryptConfig getCoverEncryptConfig(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().coverEncryptConfig;
    }
    public String getCoverPath(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().coverPath;
    }
    public String getCoverToken(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().coverToken;
    }
    public KSUploaderKitConfig$UploadInfo getCurrentInfo(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mUploadInfos != null) {
          KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
          if (this.mCursor.get() < tmUploadInfo.length) {
             return tmUploadInfo[this.mCursor.get()];
          }
       }
       return new KSUploaderKitConfig$UploadInfo();
    }
    public int getCurrentUploadInfoIndex(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mCursor.get();
    }
    public long getDurationMS(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getCurrentInfo().durationMS;
    }
    public boolean getEnableResume(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getCurrentInfo().enableResume();
    }
    public KSEncryptConfig getFileEncryptConfig(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().fileEncryptConfig;
    }
    public String getFileMetaData(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().fileMetaData;
    }
    public String getFilePath(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().filePath;
    }
    public String getFileToken(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().fileToken;
    }
    public KSUploaderKitConfig$UploadInfo getIndex(int p0){
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (tmUploadInfo == null || p0 >= tmUploadInfo.length) {
          return null;
       }
       return tmUploadInfo[p0];
    }
    public KSUploaderKitCommon$MediaType getMediaType(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().mediaType;
    }
    public String getServerHost(){
       return this.mSetting.serverHost;
    }
    public String getServerSignature(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().serverSignature;
    }
    public KSUploaderKitCommon$ServiceType getServiceType(){
       return this.mSetting.serviceType;
    }
    public String getSessionID(){
       return this.mSetting.sessionID;
    }
    public int getTaskCount(){
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       int len = (tmUploadInfo != null)? tmUploadInfo.length: 0;
       return len;
    }
    public String getTaskID(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentInfo().taskID;
    }
    public KSUploaderKitCommon$UploadChannelType getUploadChannelType(){
       return this.mSetting.uploadChannelType;
    }
    public KSUploaderKitCommon$UploadMode getUploadMode(){
       return this.mSetting.uploadMode;
    }
    public KSUploaderKitConfig$UploadInfo next(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mCursor.getAndIncrement();
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (this.mCursor.get() < tmUploadInfo.length) {
          return tmUploadInfo[this.mCursor.get()];
       }
       this.mCursor.set(0);
       return null;
    }
    public void setCoverEncryptConfig(KSEncryptConfig p0){
       if (p0 != null) {
          KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
          if (tmUploadInfo != null && tmUploadInfo.length == 1) {
             tmUploadInfo[0].coverEncryptConfig = p0;
          }
       }
       return;
    }
    public void setCoverPath(String p0){
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (tmUploadInfo != null && tmUploadInfo.length == 1) {
          tmUploadInfo[0].coverPath = p0;
       }
       return;
    }
    public void setCoverPathAndToken(String p0,String p1){
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (tmUploadInfo != null && tmUploadInfo.length == 1) {
          tmUploadInfo[0].coverPath = p0;
          p0.coverToken = p1;
       }
       return;
    }
    public void setDurationMS(long p0){
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (tmUploadInfo != null && tmUploadInfo.length == 1) {
          tmUploadInfo[0].durationMS = p0;
       }
       return;
    }
    public void setEnableResume(boolean p0){
       KSUploaderKitConfig kSUploaderKi = KSUploaderKitConfig.class;
       if (PatchProxy.isSupport(kSUploaderKi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSUploaderKi, "11")) {
          return;
       }
       this.getCurrentInfo().forceDisableResume = p0 ^ 0x01;
       return;
    }
    public void setFileEncryptConfig(KSEncryptConfig p0){
       if (p0 != null) {
          KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
          if (tmUploadInfo != null && tmUploadInfo.length == 1) {
             tmUploadInfo[0].fileEncryptConfig = p0;
          }
       }
       return;
    }
    public void setFileMetaData(String p0){
       if (this.mSetting.uploadChannelType != KSUploaderKitCommon$UploadChannelType.Single) {
          return;
       }
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (tmUploadInfo != null && tmUploadInfo.length == 1) {
          tmUploadInfo[0].fileMetaData = p0;
       }
       return;
    }
    public void setServerHost(String p0){
       this.mSetting.serverHost = p0;
    }
    public void setSessionID(String p0){
       this.mSetting.sessionID = p0;
    }
    public void setTaskID(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKitConfig.class, "7")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (tmUploadInfo != null && tmUploadInfo.length == 1) {
          tmUploadInfo[0].taskID = p0;
       }
       return;
    }
    public void setUploadMode(KSUploaderKitCommon$UploadMode p0){
       this.mSetting.uploadMode = p0;
       KSUploaderKitConfig tmUploadInfo = this.mUploadInfos;
       if (tmUploadInfo != null && tmUploadInfo.length == 1) {
          tmUploadInfo[0].uploadMode = p0;
       }
       return;
    }
    public KSUploaderKitConfig$UploadSetting setting(){
       return this.mSetting;
    }
}
