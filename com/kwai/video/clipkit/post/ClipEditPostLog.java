package com.kwai.video.clipkit.post.ClipEditPostLog;
import com.kwai.video.clipkit.post.ClipEditPostBaseLog;
import android.content.Context;
import com.kwai.video.clipkit.post.ClipPostInfo;
import com.kwai.video.clipkit.post.ClipPostStatus;
import com.kwai.video.clipkit.log.ClipPostTaskLogInfo;
import com.kwai.video.clipkit.post.ClipPostException;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import java.lang.System;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.clipkit.ClipExportException;
import java.lang.Exception;
import com.kwai.video.clipkit.post.ClipUploadException;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipEditPostLog extends ClipEditPostBaseLog	// class@001ad9
{
    public Context mContext;
    public ClipEditExtraInfo mExtraInfo;
    public boolean mIsFromExternal;
    public boolean mIsPipeline;
    public ClipPostTaskLogInfo mLogInfo;
    public ClipPostException mPostException;
    public ClipPostInfo mPostInfo;
    public ClipPostStatus mPostStatus;
    public int mRetryCount;

    public void ClipEditPostLog(Context p0,ClipPostInfo p1,ClipPostStatus p2,ClipPostTaskLogInfo p3,ClipPostException p4,boolean p5,int p6,ClipEditExtraInfo p7,boolean p8){
       super();
       this.mIsFromExternal = false;
       this.mContext = p0;
       this.mPostInfo = p1;
       this.mLogInfo = p3;
       this.mPostException = p4;
       this.mIsPipeline = p5;
       this.mRetryCount = p6;
       this.mExtraInfo = p7;
       this.mPostStatus = p2;
       this.mIsFromExternal = p8;
    }
    public String getSessionId(){
       return this.mPostInfo.id;
    }
    public String toJson(){
       ClipPostStatus uploadStatus;
       ClipPostTaskLogInfo userWaitStar;
       ClipPostTaskLogInfo uploadCoverW1;
       long l1;
       String str = "clientTimeStamp";
       JSONObject obj = PatchProxy.apply(null, this, ClipEditPostLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("postInfo", this.mPostInfo.toJsonObject());
          JSONObject jSONObject = new JSONObject();
          obj.put("status", jSONObject);
          this.toJsonBase(obj);
          if (this.mContext != null) {
             jSONObject.put("lowDevice", ClipKitConfigManager.getInstance().isLowDevice(this.mContext));
          }
          jSONObject.put("encodeStatus", this.mPostStatus.encodeStatus);
          boolean b = ClipPostInfo.isNeedUploadCoverAfterPublish(this.mPostInfo.postFlag);
          if (b) {
             ClipEditPostLog tmPostStatus = this.mPostStatus;
             uploadStatus = tmPostStatus.uploadStatus;
             if (3 == uploadStatus) {
                uploadStatus = tmPostStatus.coverUploadStatusWithoutPreUpload;
             }
          }else {
             uploadStatus = this.mPostStatus.uploadStatus;
          }
          jSONObject.put("uploadStatus", uploadStatus);
          jSONObject.put("coverStatusWithoutPreUpload", this.mPostStatus.coverUploadStatusWithoutPreUpload);
          jSONObject.put("needUploadCoverAfterPublish", b);
          jSONObject.put(str, System.currentTimeMillis());
          jSONObject.put("isPipeline", this.mIsPipeline);
          ClipEditPostLog tmLogInfo = this.mLogInfo;
          if (tmLogInfo.skipTransCode == 1) {
             jSONObject.put("useHwEncode", tmLogInfo.useHardwareEncode);
          }
          jSONObject.put("skipTranscode", ClipKitUtils.getLogSkipTransCode(this.mLogInfo.skipTransCode));
          jSONObject.put("transcodeReason", this.mLogInfo.transcodeReason);
          jSONObject.put(str, System.currentTimeMillis());
          ClipEditPostLog tmLogInfo1 = this.mLogInfo;
          ClipPostTaskLogInfo userWaitEndT = tmLogInfo1.userWaitEndTime;
          if (userWaitEndT) {
             userWaitStar = tmLogInfo1.userWaitStartTime;
             long l = userWaitEndT - userWaitStar;
             if (!userWaitStar || userWaitStar - userWaitEndT > 0) {
                l = 0;
             }
             jSONObject.put("userWaitingTime", l);
          }
          tmLogInfo1 = this.mLogInfo;
          userWaitEndT = tmLogInfo1.encodeStartTime;
          if (userWaitEndT) {
             userWaitStar = tmLogInfo1.encodeEndTime;
             if (userWaitStar) {
                jSONObject.put("encodeCostTime", (userWaitStar - userWaitEndT));
                userWaitEndT = this.mLogInfo.encodeStartTime;
             label_00e9 :
                tmLogInfo1 = this.mLogInfo;
                userWaitStar = tmLogInfo1.uploadStartTime;
                if (userWaitStar) {
                   ClipPostTaskLogInfo uploadEndTim = tmLogInfo1.uploadEndTime;
                   if (uploadEndTim) {
                      ClipPostTaskLogInfo uploadCoverW = tmLogInfo1.uploadCoverWithoutPreUploadStartTime;
                      if (uploadCoverW) {
                         uploadCoverW1 = tmLogInfo1.uploadCoverWithoutPreUploadEndTime;
                         if (uploadCoverW1) {
                            l1 = (uploadCoverW1 - uploadCoverW) + 0;
                         label_0109 :
                            jSONObject.put("uploadCostTime", ((uploadEndTim - userWaitStar) + l1));
                            if (!userWaitEndT) {
                               userWaitEndT = this.mLogInfo.uploadStartTime;
                            }
                         }
                      }
                      l1 = 0;
                      uploadCoverW1 = uploadEndTim;
                      goto label_0109 ;
                   }else {
                   label_0119 :
                      uploadCoverW1 = 0;
                   }
                }else {
                   goto label_0119 ;
                }
                if (userWaitEndT && uploadCoverW1) {
                   jSONObject.put("totalCostTime", (uploadCoverW1 - userWaitEndT));
                }
                jSONObject.put("retryCount", this.mRetryCount);
                jSONObject.put("postMode", this.mLogInfo.postMode);
                if (this.mPostException != null) {
                   JSONObject jSONObject1 = new JSONObject();
                   jSONObject.put("error", jSONObject1);
                   ClipPostException exportExcept = this.mPostException.exportException;
                   if (exportExcept != null) {
                      jSONObject1.put("exportErrorType", exportExcept.errorType);
                      jSONObject1.put("exportErrorCode", exportExcept.errorCode);
                      jSONObject1.put("exportErrorMsg", exportExcept.getMessage());
                   }
                   exportExcept = this.mPostException.uploadException;
                   if (exportExcept != null) {
                      jSONObject1.put("uploadErrorCode", exportExcept.getErrorCode());
                      jSONObject1.put("uploadErrorMsg", exportExcept.getMessage());
                   }
                }
                obj.put("fromExternal", this.mIsFromExternal);
                if (this.mPostInfo.getSceneTypeByVideoType() != null) {
                   obj.put("sceneType", this.mPostInfo.getSceneTypeByVideoType().value());
                }
                ClipPostTaskLogInfo capeStats = this.mLogInfo.capeStats;
                if (capeStats != null) {
                   obj.put("cape", capeStats);
                }
                tmLogInfo1 = this.mExtraInfo;
                if (tmLogInfo1 != null) {
                   obj.put("extraInfo", tmLogInfo1.toJsonObject());
                }
                return obj.toString();
             }
          }
          long l2 = 0;
          goto label_00e9 ;
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditPostLog", "to Json Error", e0);
          return "";
       }
    }
}
