package com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import android.content.Context;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest;
import com.kwai.video.ksuploaderkit.apicenter.GeneralApiRequest;
import java.util.ArrayList;
import java.util.List;
import ln.b;
import com.kwai.video.ksuploaderkit.utils.IPUtils;
import java.lang.Number;
import java.lang.System;
import com.kwai.video.ksuploaderkit.apicenter.KSUploaderKitTokenAndEndPointResponse;
import com.kwai.video.ksuploaderkit.KSUploaderKitEndPointAgent;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import java.util.Iterator;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse$EndPoint;
import ln.b$a;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$1;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest$EventListener;
import com.kwai.video.ksuploaderkit.apicenter.IApiManagerListener;

public class ApiManager	// class@00098a
{
    public IApiRequest mApiRequest;
    public ApiResponse mApiResponse;
    public KSUploaderKitTokenAndEndPointResponse mCachedResponseForCover;
    public KSUploaderKitConfig mConfig;
    public ArrayList mDnsResolveStatsList;
    public KSUploaderKitEndPointAgent mEndPointAgent;
    public LogReporter mLogReporter;
    public IApiManagerListener mManagerListener;
    public List mOriginGatewayInfoList;
    public String mTaskId;

    public void ApiManager(Context p0,KSUploaderKitConfig p1){
       super();
       this.mConfig = p1;
       this.initApiRequest(p0);
    }
    public boolean checkFileExisted(){
       ApiManager obj = PatchProxy.apply(null, this, ApiManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (KSUploaderKitCommon$UploadChannelType.Single == this.mConfig.getUploadChannelType()) {
          obj = this.mApiResponse;
          if (obj != null) {
             return obj.hadExisted;
          }else {
             ApiResponse cachedApiRes = this.mApiRequest.getCachedApiResponse(this.mConfig.getTaskID());
             if (cachedApiRes != null && cachedApiRes instanceof MediaCloudApiResponse) {
                cachedApiRes = this.mApiRequest.fetchResumeInfo(cachedApiRes.videoToken);
                if (cachedApiRes != null) {
                   this.mApiResponse = cachedApiRes;
                   return cachedApiRes.hadExisted;
                }
             }else if(KSUploaderKitCommon$ServiceType.General == this.mConfig.getServiceType()){
                ApiManager$TokenType image = (this.mConfig.getMediaType() == KSUploaderKitCommon$MediaType.Image)? ApiManager$TokenType.Image: ApiManager$TokenType.Video;
                cachedApiRes = this.mApiRequest.getUploadToken(image);
                if (cachedApiRes != null) {
                   this.mApiResponse = cachedApiRes;
                   return cachedApiRes.hadExisted;
                }
             }
          }
       }
       return false;
    }
    public final IApiRequest createApiRequest(Context p0,KSUploaderKitConfig$UploadInfo p1){
       GeneralApiRequest generalApiRe;
       MediaCloudApiRequest obj = PatchProxy.applyTwoRefs(p0, p1, this, ApiManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.mConfig.getServiceType() == KSUploaderKitCommon$ServiceType.MediaCloud)? new MediaCloudApiRequest(p0, p1, this.mConfig.getServerHost()): new GeneralApiRequest(p0, p1, this.mConfig.getServerHost());
       return obj;
    }
    public String getCachedUploadToken(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ApiManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ApiResponse cachedApiRes = this.mApiRequest.getCachedApiResponse(p0);
       if (cachedApiRes != null && cachedApiRes instanceof MediaCloudApiResponse) {
          return cachedApiRes.videoToken;
       }
       return null;
    }
    public ArrayList getDnsResolveStatsList(){
       return this.mDnsResolveStatsList;
    }
    public KSUploaderKitCommon$MediaType getMediaType(){
       Object[] objArray = null;
       ApiManager obj = PatchProxy.apply(objArray, this, ApiManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mConfig;
       if (obj != null) {
          objArray = obj.getMediaType();
       }
       return objArray;
    }
    public List getOriginGatewayInfoList(){
       return this.mOriginGatewayInfoList;
    }
    public boolean getPreferHTTP(){
       ApiManager$TokenType image;
       ApiManager obj = PatchProxy.apply(null, this, ApiManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mEndPointAgent != null) {
          return false;
       }
       obj = this.mApiResponse;
       if (obj != null) {
          return obj.preferHTTP;
       }
       ApiResponse cachedApiRes = this.mApiRequest.getCachedApiResponse(this.mConfig.getTaskID());
       if (cachedApiRes != null && cachedApiRes instanceof MediaCloudApiResponse) {
          cachedApiRes = this.mApiRequest.fetchResumeInfo(cachedApiRes.videoToken);
          if (cachedApiRes != null) {
             this.mApiResponse = cachedApiRes;
             return cachedApiRes.preferHTTP;
          }
       }else if(this.mConfig.getMediaType() == KSUploaderKitCommon$MediaType.Image){
          image = ApiManager$TokenType.Image;
       }else {
          image = ApiManager$TokenType.Video;
       }
       cachedApiRes = this.mApiRequest.getUploadToken(image);
       if (cachedApiRes != null) {
          this.mApiResponse = cachedApiRes;
          return cachedApiRes.preferHTTP;
       }
       return false;
    }
    public b getResumeInfo(String p0){
       b rickonTokenR;
       ApiManager obj = PatchProxy.applyOneRefs(p0, this, ApiManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mEndPointAgent == null) {
          obj = this.mApiRequest;
          b uob = null;
          if (obj == null) {
             return uob;
          }else {
             obj.setUploadInfo(this.mConfig.getCurrentInfo());
             if (this.mApiResponse == null) {
                this.mApiResponse = this.mApiRequest.fetchResumeInfo(p0);
             }
             this.setupOriginGatewayInfo(uob);
             this.mDnsResolveStatsList = IPUtils.processDnsResolve(this.mApiResponse);
             rickonTokenR = this.mApiRequest.getRickonTokenResponse(this.mApiResponse, ApiManager$TokenType.Video);
          }
       }else {
          rickonTokenR = this.getTokenResponseByEndPointAgent(p0, ApiManager$TokenType.Video);
          this.setupOriginGatewayInfo(rickonTokenR);
       }
       return rickonTokenR;
    }
    public String getServerHost(){
       Object[] objArray = null;
       ApiManager obj = PatchProxy.apply(objArray, this, ApiManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mConfig;
       if (obj != null) {
          objArray = obj.getServerHost();
       }
       return objArray;
    }
    public long getStartFileSize(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ApiManager.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0.longValue();
       }
       return this.mApiRequest.getStartFileSize();
    }
    public final b getTokenResponseByEndPointAgent(String p0,ApiManager$TokenType p1){
       ApiManager tmCachedResp;
       KSUploaderKitTokenAndEndPointResponse coverToken;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, ApiManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       long l = 0;
       ApiManager$TokenType cover = ApiManager$TokenType.Cover;
       if (cover == p1 || (this.mConfig.getUploadChannelType() != KSUploaderKitCommon$UploadChannelType.Single && this.mConfig.getCurrentUploadInfoIndex() > 0)) {
          tmCachedResp = this.mCachedResponseForCover;
       }else {
          tmCachedResp = this.mEndPointAgent.syncRequestTokenAndEndPoint(p0);
          l = System.currentTimeMillis() - System.currentTimeMillis();
       }
       if (tmCachedResp != null) {
          this.mCachedResponseForCover = tmCachedResp;
          if (this.mConfig.getUploadChannelType() == KSUploaderKitCommon$UploadChannelType.Single) {
             coverToken = (cover == p1)? tmCachedResp.coverToken: tmCachedResp.fileToken;
             obj.a = coverToken;
          }else {
             int currentUploa = this.mConfig.getCurrentUploadInfoIndex();
             if (!currentUploa) {
                obj.a = tmCachedResp.fileToken;
             }else if(tmCachedResp.extraTokens.size() > 0){
                currentUploa = currentUploa - true;
                if (currentUploa < tmCachedResp.extraTokens.size()) {
                   obj.a = tmCachedResp.extraTokens.get(currentUploa);
                }
             }
             KSUploaderKitLog.e("KSUploaderKit-NetManager", "end point agent response return wrong extra tokens");
          }
          obj.b = tmCachedResp.fragmentIndex;
          if (tmCachedResp.endpoints != null) {
             ArrayList uArrayList = new ArrayList(tmCachedResp.endpoints.size());
             Iterator iterator = tmCachedResp.endpoints.iterator();
             while (iterator.hasNext()) {
                ApiResponse$EndPoint uEndPoint = iterator.next();
                uArrayList.add(new b$a(uEndPoint.host, uEndPoint.port, uEndPoint.protocol));
             }
             obj.d = uArrayList;
          }
       }else {
          tmCachedResp = new KSUploaderKitTokenAndEndPointResponse();
       }
       if (tmCachedResp.fileToken != null) {
          coverToken = tmCachedResp.endpoints;
          if (coverToken != null && coverToken.size() > 0) {
             tmCachedResp.success = true;
          }else {
          label_00d6 :
             tmCachedResp.success = false;
             if (tmCachedResp.errorMessage == null) {
                tmCachedResp.errorMessage = "could not get upload address and token from agent";
             }
             if (tmCachedResp.errorCode == null) {
                tmCachedResp.errorCode = KSUploaderKitCommon$ERRORCODE.END_POINTS_AGENT_RETURN_VOID_RESULT.value();
             }
          }
       }else {
          goto label_00d6 ;
       }
       this.reportExternalAPILog(l, tmCachedResp);
       return obj;
    }
    public b getUploadToken(ApiManager$TokenType p0){
       b rickonTokenR;
       ApiManager obj = PatchProxy.applyOneRefs(p0, this, ApiManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = null;
       if (this.mEndPointAgent == null) {
          obj = this.mApiRequest;
          if (obj == null) {
             return uob;
          }else {
             obj.setUploadInfo(this.mConfig.getCurrentInfo());
             if (this.mApiResponse == null) {
                this.mApiResponse = this.mApiRequest.getUploadToken(p0);
             }
             this.setupOriginGatewayInfo(uob);
             this.mDnsResolveStatsList = IPUtils.processDnsResolve(this.mApiResponse);
             rickonTokenR = this.mApiRequest.getRickonTokenResponse(this.mApiResponse, p0);
          }
       }else {
          rickonTokenR = this.getTokenResponseByEndPointAgent(uob, p0);
          this.setupOriginGatewayInfo(rickonTokenR);
       }
       return rickonTokenR;
    }
    public final void initApiRequest(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApiManager.class, "2")) {
          return;
       }
       String taskID = this.mConfig.getCurrentInfo().getTaskID();
       if (TextUtils.isEmpty(taskID)) {
          taskID = this.mConfig.getCurrentInfo().getInnerTaskId();
       }
       IApiRequest iApiRequest = this.createApiRequest(p0, this.mConfig.getCurrentInfo());
       this.setEventListener(iApiRequest);
       this.mApiRequest = iApiRequest;
       this.mTaskId = taskID;
       return;
    }
    public void next(){
       if (PatchProxy.applyVoid(null, this, ApiManager.class, "7")) {
          return;
       }
       this.mConfig.next();
       return;
    }
    public void publish(ApiManager$TokenType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApiManager.class, "13")) {
          return;
       }
       this.mApiRequest.publish(p0);
       return;
    }
    public void removeCachedApiResponse(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApiManager.class, "12")) {
          return;
       }
       this.mApiRequest.removeCachedApiResponse(p0);
       return;
    }
    public final void reportExternalAPILog(long p0,KSUploaderKitTokenAndEndPointResponse p1){
       ApiManager uApiManager = ApiManager.class;
       if (PatchProxy.isSupport(uApiManager) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uApiManager, "18")) {
          return;
       }
       HttpRequestInfo httpRequestI = new HttpRequestInfo();
       httpRequestI.setTimeCost(p0);
       if (p1.success == null) {
          httpRequestI.setHttpCode(p1.errorCode);
          httpRequestI.setMessage(p1.errorMessage);
       }
       ApiManager tmLogReporte = this.mLogReporter;
       if (tmLogReporte != null) {
          tmLogReporte.onReportRequestAPILog(ApiManager$UploadStep.Apply, p1.success, httpRequestI, KSUploaderKitCommon$BusinessType.External);
       }
       return;
    }
    public void resetApiResponse(){
       this.mApiResponse = null;
    }
    public void setEndPointAgent(KSUploaderKitEndPointAgent p0){
       this.mEndPointAgent = p0;
    }
    public final void setEventListener(IApiRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApiManager.class, "17")) {
          return;
       }
       p0.setEventListener(new ApiManager$1(this));
       return;
    }
    public void setExternalApiResponse(ApiResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApiManager.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.mApiRequest.setExternalApiResponse(p0);
       }
       return;
    }
    public void setListener(IApiManagerListener p0){
       this.mManagerListener = p0;
    }
    public void setLogReporter(LogReporter p0){
       this.mLogReporter = p0;
    }
    public final void setupOriginGatewayInfo(b p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, ApiManager.class, "6")) {
          return;
       }
       if (this.mEndPointAgent == null) {
          if (this.mOriginGatewayInfoList == null) {
             ApiManager tmApiRespons = this.mApiResponse;
             if (tmApiRespons != null && tmApiRespons.endpoints != null) {
                this.mOriginGatewayInfoList = new ArrayList(this.mApiResponse.endpoints.size());
                iterator = this.mApiResponse.endpoints.iterator();
                while (iterator.hasNext()) {
                   ApiResponse$EndPoint uEndPoint = iterator.next();
                   this.mOriginGatewayInfoList.add(new ApiResponse$EndPoint(uEndPoint.host, uEndPoint.port, uEndPoint.protocol));
                }
             }
          }
       }else if(this.mOriginGatewayInfoList == null && (p0 != null && p0.d != null)){
          this.mOriginGatewayInfoList = new ArrayList(p0.d.size());
          iterator = p0.d.iterator();
          while (iterator.hasNext()) {
             b$a uoa = iterator.next();
             this.mOriginGatewayInfoList.add(new ApiResponse$EndPoint(uoa.a, uoa.b, uoa.c));
          }
       }
       return;
    }
}
