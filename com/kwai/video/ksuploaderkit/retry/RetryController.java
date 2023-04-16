package com.kwai.video.ksuploaderkit.retry.RetryController;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.lang.Object;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;

public class RetryController	// class@0009b7
{
    public PublishConfig mPublishConfig;
    public int mRetryCnt;

    public void RetryController(PublishConfig p0){
       super();
       this.mPublishConfig = p0;
    }
    public int getRetryCount(){
       return this.mRetryCnt;
    }
    public final boolean isInRetryErrorCodeList(KSUploaderCloseReason p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, RetryController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.value();
       obj = this.mPublishConfig.getRetryErrorCode();
       int len = obj.length;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             if (obj[i1] == i) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             KSUploaderKitLog.i("KSUploaderKit-RetryController", "isInRetryErrorCodeList reasonCode:"+i+" is not in RetryErrorCodeList:"+this.mPublishConfig.getRetryErrorCode().toString());
             return false;
          }
       }
       KSUploaderKitLog.i("KSUploaderKit-RetryController", "isInRetryErrorCodeList reasonCode:"+i+" is in RetryErrorCodeList");
       return true;
    }
    public boolean isNeedRetry(KSUploaderCloseReason p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, RetryController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isInRetryErrorCodeList(p0)) {
          RetryController tmRetryCnt = this.mRetryCnt;
          this.mRetryCnt = tmRetryCnt + 1;
          if (tmRetryCnt < this.mPublishConfig.getRetryNum()) {
             b = true;
          label_002a :
             return b;
          }
       }
       b = false;
       goto label_002a ;
    }
}
