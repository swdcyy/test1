package com.kwai.video.ksuploaderkit.apicenter.ApiManager$1;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest$EventListener;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.network.NetworkUtils;
import com.kwai.video.ksuploaderkit.apicenter.IApiManagerListener;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;

public class ApiManager$1 implements IApiRequest$EventListener	// class@000987
{
    public final ApiManager this$0;

    public void ApiManager$1(ApiManager p0){
       this.this$0 = p0;
       super();
    }
    public void onComplete(ApiManager$UploadStep p0,NetworkUtils$NetErrorCode p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ApiManager$1.class, "1")) {
          return;
       }
       KSUploaderKitLog.e("KSUploaderKit-NetManager", "send finished listener errorCode : "+p1+", upload Token : "+p2);
       if (this.this$0.mManagerListener != null) {
          int i = NetworkUtils.netErrorCode2KitErrorCodeValue(p0, p1);
          ApiManager mManagerList = this.this$0.mManagerListener;
          boolean b = (!i)? true: false;
          mManagerList.onFinished(b, i, p2);
       }
       return;
    }
    public void onReportAPILog(ApiManager$UploadStep p0,HttpRequestInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApiManager$1.class, "2")) {
          return;
       }
       boolean b = (p1 != null && (p1.getNetErrorCode() == null || p1.getNetErrorCode() == NetworkUtils$NetErrorCode.NO_ERROR))? true: false;
       KSUploaderKitLog.e("KSUploaderKit-NetManager", "send log report uploadStep : "+p0+", success : "+b);
       ApiManager mLogReporter = this.this$0.mLogReporter;
       if (mLogReporter != null) {
          mLogReporter.onReportRequestAPILog(p0, b, p1);
       }
       return;
    }
}
