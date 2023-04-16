package com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import java.lang.String;
import java.lang.Object;
import java.util.UUID;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.google.gson.JsonObject;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import java.lang.Enum;
import java.lang.Integer;
import com.google.gson.JsonElement;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import com.kwai.video.ksuploaderkit.logreporter.LogReporterUtils;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Boolean;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.CharSequence;
import ca7.u;
import jr4.c$a;
import c97.d;
import r97.a0;
import r97.q$a;
import r97.q;
import com.google.protobuf.nano.MessageNano;
import r97.o$a;
import r97.o;

public class LogReporter	// class@0009a4
{
    public String mSessionID;

    public void LogReporter(String p0){
       super();
       this.mSessionID = "";
       this.mSessionID = (p0 != null)? p0: UUID.randomUUID().toString();
       KSUploaderKitLog.e("KSUploaderKit-LogReporter", "session id : "+this.mSessionID);
       return;
    }
    public final int convertPageType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LogReporter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = -1;
       int i = p0.hashCode();
       if (i != -1999289321) {
          if (i != -1057247979) {
             if (i != 2285) {
                if (i == 0x241c4f && p0.equals("MINA")) {
                   obj = 2;
                }
             }else if(p0.equals("H5")){
                obj = 1;
             }
          }else if(p0.equals("UNKNOWN_PAGE_TYPE")){
             obj = 3;
          }
       }else if(p0.equals("NATIVE")){
          obj = 0;
       }
       if (obj) {
          if (obj != 1) {
             if (obj != 2) {
                return 0;
             }else {
                return 3;
             }
          }else {
             return 2;
          }
       }else {
          return 1;
       }
    }
    public void onReportPublishPhotoLog(KSUploaderKitCommon$Status p0,PublishLogInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LogReporter.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       String str = "KSUploaderKit-LogReporter";
       KSUploaderKitLog.e(str, "report publish photo log, session id : "+this.mSessionID+", status : "+p0+", errorCode : "+p1.getErrorCode()+", retryCount : "+p1.getRetryCount());
       JsonObject jsonObject = new JsonObject();
       JsonObject jsonObject1 = new JsonObject();
       KSUploaderKitConfig kSuploaderKi = p1.getKSuploaderKitConfig();
       if (kSuploaderKi != null) {
          KSUploaderKitLog.e(str, "report publish photo log, uploadMode : "+kSuploaderKi.getUploadMode()+", mediaType : "+kSuploaderKi.getMediaType());
          jsonObject1.c0("service_type", kSuploaderKi.getServiceType().toString());
          jsonObject1.c0("upload_mode", kSuploaderKi.getUploadMode().toString());
          jsonObject1.c0("media_type", kSuploaderKi.getMediaType().toString());
          jsonObject1.c0("task_id", kSuploaderKi.getTaskID());
          jsonObject1.a0("task_count", Integer.valueOf(p1.getTaskCount()));
          jsonObject1.a0("failed_count", Integer.valueOf(p1.getFailedCount()));
       }
       jsonObject1.a0("retry_count", Integer.valueOf(p1.getRetryCount()));
       jsonObject1.c0("upload_type", p1.getUploadTypeForLog());
       jsonObject.c0("stats", jsonObject1.toString());
       jsonObject.a0("error_code", Integer.valueOf(p1.getErrorCode()));
       jsonObject.a0("time_cost", Long.valueOf(p1.getTimeCost()));
       jsonObject.c0("business_type", p1.getBusinessType().toString());
       jsonObject.c0("endPoint_type", p1.getEndPointType().toString());
       jsonObject.a0("file_size", Long.valueOf(p1.getFileSize()));
       jsonObject.c0("scene_type", p1.getSceneTypeForLog());
       KSUploaderKitCommon$UploadChannelType channelType = p1.getChannelType();
       if (channelType != null) {
          jsonObject.c0("channel_type", channelType.value());
       }
       this.writeLogger("VP_PUBLISHPHOTO", LogReporterUtils.kitStatus2TaskEventStatus(p0), jsonObject.toString());
       return;
    }
    public void onReportRequestAPILog(ApiManager$UploadStep p0,boolean p1,HttpRequestInfo p2){
       if (PatchProxy.isSupport(LogReporter.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LogReporter.class, "3")) {
          return;
       }
       KSUploaderKitCommon$BusinessType external = (p2.getUseExternalEndPoints())? KSUploaderKitCommon$BusinessType.External: KSUploaderKitCommon$BusinessType.KSUploaderKit;
       this.onReportRequestAPILog(p0, p1, p2, external);
       return;
    }
    public void onReportRequestAPILog(ApiManager$UploadStep p0,boolean p1,HttpRequestInfo p2,KSUploaderKitCommon$BusinessType p3){
       if (PatchProxy.isSupport(LogReporter.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, LogReporter.class, "4")) {
          return;
       }
       KSUploaderKitLog.e("KSUploaderKit-LogReporter", "report requestAPI log, session id : "+this.mSessionID+", upload step : "+p0+", success : "+p1);
       JsonObject jsonObject = new JsonObject();
       if (p2 != null) {
          if (!p1) {
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.a0("http_code", Integer.valueOf(p2.getHttpCode()));
             jsonObject1.c0("http_response", p2.getResponseBody());
             jsonObject1.c0("message", p2.getMessage());
             jsonObject.c0("error", jsonObject1.toString());
          }
          jsonObject.a0("time_cost", Long.valueOf(p2.getTimeCost()));
          jsonObject.c0("endPoint_type", p3.toString());
          String tokenID = p2.getTokenID();
          if (tokenID != null) {
             jsonObject.c0("token_id", tokenID);
          }
       }
       int i = (p1)? 7: 8;
       String str = (p0 == ApiManager$UploadStep.Apply)? "VP_REQUESTAPPLY": "VP_REQUESTPUBLISH";
       this.writeLogger(str, i, jsonObject.toString());
       return;
    }
    public void onReportUploadLog(KSUploaderKitCommon$Status p0,UploadLogInfo p1){
       String responseBody;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LogReporter.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       KSUploaderKitLog.e("KSUploaderKit-LogReporter", "report upload log, session id : "+this.mSessionID+", status:"+p0+", reason: "+p1.getCloseReason());
       JsonObject jsonObject = new JsonObject();
       if (p0 != KSUploaderKitCommon$Status.Start) {
          if (p1.getStatsJson() != null) {
             jsonObject.c0("qos", p1.getStatsJson());
          }
          JsonObject jsonObject1 = new JsonObject();
          if (p1.getCloseReason() != KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded.value()) {
             jsonObject1.a0("close_reason", Integer.valueOf(p1.getCloseReason()));
             HttpRequestInfo httpRequestI = p1.getHttpRequestInfo();
             if (httpRequestI != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.a0("http_code", Integer.valueOf(httpRequestI.getHttpCode()));
                String message = httpRequestI.getMessage();
                if (message != null) {
                   jsonObject2.c0("message", message);
                }
                responseBody = httpRequestI.getResponseBody();
                if (responseBody != null) {
                   jsonObject2.c0("http_response", responseBody);
                }
                jsonObject1.c0("http_error", jsonObject2.toString());
             }
             if (!u.c(p1.getErrorMsg())) {
                jsonObject1.c0("error_msg", p1.getErrorMsg());
             }
          }
          jsonObject1.a0("upload_status", Long.valueOf(p1.getUploadStatus()));
          if (p1.getUploadType() != null) {
             jsonObject1.c0("upload_type", p1.getUploadType());
          }
          responseBody = p1.getDNSResolveStatsListString();
          if (responseBody != null) {
             jsonObject1.c0("dns_resolve_stats", responseBody);
          }
          jsonObject.c0("stats", jsonObject1.toString());
          if (p1.getMediaType() != null) {
             jsonObject.c0("media_type", p1.getMediaType().toString());
          }
          jsonObject.a0("time_cost", Long.valueOf(p1.getTimeCost()));
          jsonObject.a0("file_size", Long.valueOf(p1.getFileSize()));
          String gatewayInfoL = p1.getGatewayInfoListString();
          if (gatewayInfoL != null) {
             jsonObject.c0("origin_gateway_info", gatewayInfoL);
          }
          jsonObject.c0("business_type", p1.getBusinessType().toString());
       }
       this.writeLogger("VP_UPLOADVIDEO", LogReporterUtils.kitStatus2TaskEventStatus(p0), jsonObject.toString());
       return;
    }
    public final void writeLogger(String p0,int p1,String p2){
       if (PatchProxy.isSupport(LogReporter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LogReporter.class, "5")) {
          return;
       }
       KSUploaderKitLog.e("KSUploaderKit-LogReporter", "report log, action: "+p0+",status:"+p1+",session id : "+this.mSessionID+",logStr:"+p2);
       c$a uoa = new c$a();
       uoa.b = p0;
       uoa.e = p1;
       uoa.f = this.mSessionID;
       uoa.d = p2;
       q$a uoa1 = q.a();
       uoa1.g("vp_stat_event");
       uoa1.f(MessageNano.toByteArray(uoa));
       uoa1.c(o.builder().g(true).i("KSUploaderKit").b());
       d.a().g().m(uoa1.b());
       return;
    }
}
