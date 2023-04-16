package com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import java.lang.Number;

public class PublishLogInfo	// class@0009a6
{
    public KSUploaderKitCommon$BusinessType mBusinessType;
    public KSUploaderKitCommon$UploadChannelType mChannelType;
    public KSUploaderKitCommon$BusinessType mEndPointType;
    public long mEndTime;
    public int mErrorCode;
    public int mFailedCount;
    public long mFileSize;
    public KSUploaderKitConfig mKitConfig;
    public int mRetryCount;
    public KSUploaderKitCommon$SceneType mSceneType;
    public long mStartTime;
    public long mTimeCost;
    public String mUploadType;

    public void PublishLogInfo(){
       super();
       this.mFailedCount = -1;
    }
    public KSUploaderKitCommon$BusinessType getBusinessType(){
       return this.mBusinessType;
    }
    public KSUploaderKitCommon$UploadChannelType getChannelType(){
       return this.mChannelType;
    }
    public KSUploaderKitCommon$BusinessType getEndPointType(){
       PublishLogInfo tmEndPointTy = this.mEndPointType;
       if (tmEndPointTy != null) {
          return tmEndPointTy;
       }
       return KSUploaderKitCommon$BusinessType.Unknown;
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public int getFailedCount(){
       return this.mFailedCount;
    }
    public long getFileSize(){
       return this.mFileSize;
    }
    public KSUploaderKitConfig getKSuploaderKitConfig(){
       return this.mKitConfig;
    }
    public int getRetryCount(){
       return this.mRetryCount;
    }
    public String getSceneTypeForLog(){
       PublishLogInfo obj = PatchProxy.apply(null, this, PublishLogInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSceneType;
       if (obj != null) {
          return obj.value();
       }
       return KSUploaderKitCommon$SceneType.NormalPublish.value();
    }
    public int getTaskCount(){
       PublishLogInfo obj = PatchProxy.apply(null, this, PublishLogInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKitConfig;
       int taskCount = (obj != null)? obj.getTaskCount(): -1;
       return taskCount;
    }
    public long getTimeCost(){
       return this.mTimeCost;
    }
    public String getUploadTypeForLog(){
       PublishLogInfo obj = PatchProxy.apply(null, this, PublishLogInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mUploadType;
       String str = "Rickon";
       if (obj == null) {
          return str;
       }
       if (obj.equalsIgnoreCase("rickon")) {
          return str;
       }
       if ((this.mUploadType).equalsIgnoreCase("http")) {
          return "Http";
       }
       return this.mUploadType;
    }
    public void setBusinessType(KSUploaderKitCommon$BusinessType p0){
       this.mBusinessType = p0;
    }
    public void setChannelType(KSUploaderKitCommon$UploadChannelType p0){
       this.mChannelType = p0;
    }
    public void setEndPointType(KSUploaderKitCommon$BusinessType p0){
       this.mEndPointType = p0;
    }
    public void setEndTime(long p0,boolean p1){
       this.mEndTime = p0;
       PublishLogInfo tmStartTime = this.mStartTime;
       if (p0 - tmStartTime > 0) {
          this.mTimeCost = (p1)? p0 - tmStartTime: this.mTimeCost + (p0 - tmStartTime);
       }
    label_0014 :
       return;
    }
    public void setErrorCode(int p0){
       this.mErrorCode = p0;
    }
    public void setFailedCount(int p0){
       this.mFailedCount = p0;
    }
    public void setFileSize(long p0){
       this.mFileSize = p0;
    }
    public void setKSUploaderKitConfig(KSUploaderKitConfig p0){
       this.mKitConfig = p0;
    }
    public void setRetryCount(int p0){
       this.mRetryCount = p0;
    }
    public void setSceneType(KSUploaderKitCommon$SceneType p0){
       this.mSceneType = p0;
    }
    public void setStartTime(long p0){
       this.mStartTime = p0;
    }
    public void setUploadType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishLogInfo.class, "2")) {
          return;
       }
       PublishLogInfo tmUploadType = this.mUploadType;
       if (tmUploadType != null && (tmUploadType.equalsIgnoreCase("rickon") && p0.equalsIgnoreCase("http"))) {
          this.mUploadType = "RickonAndHttp";
          return;
       }else {
          this.mUploadType = p0;
          return;
       }
    }
}
