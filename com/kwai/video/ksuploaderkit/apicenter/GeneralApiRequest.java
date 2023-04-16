package com.kwai.video.ksuploaderkit.apicenter.GeneralApiRequest;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest;
import android.content.Context;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.network.HttpRequester;
import com.kwai.video.ksuploaderkit.utils.SharedPreferencesHelper;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.apicenter.GeneralApiResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import com.kwai.video.ksuploaderkit.apicenter.IApiService;
import retrofit2.a;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.util.List;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import ln.b;
import com.kwai.video.ksuploaderkit.apicenter.GeneralApiRequest$2;
import java.lang.Enum;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest$EventListener;
import java.lang.Thread;
import com.kwai.video.ksuploaderkit.apicenter.GeneralApiRequest$1;
import java.lang.Runnable;
import java.lang.Boolean;

public class GeneralApiRequest implements IApiRequest	// class@000990
{
    public GeneralApiResponse mApiResponse;
    public IApiRequest$EventListener mEventListener;
    public ApiResponse mExternalApiResponse;
    public HttpRequester mHttpRequester;
    public SharedPreferencesHelper mSPHelper;
    public String mServerHost;
    public String mToken;
    public KSUploaderKitConfig$UploadInfo mUploadInfo;

    public void GeneralApiRequest(Context p0,KSUploaderKitConfig$UploadInfo p1,String p2){
       super();
       this.mUploadInfo = p1;
       this.mHttpRequester = new HttpRequester();
       this.mServerHost = p2;
       this.mSPHelper = new SharedPreferencesHelper(p0, "KSUploaderKit_General_Upload_ResumeInfo");
    }
    public ApiResponse fetchResumeInfo(String p0){
       return this.fetchResumeInfo(p0);
    }
    public GeneralApiResponse fetchResumeInfo(String p0){
       HttpRequestInfo obj = PatchProxy.applyOneRefs(p0, this, GeneralApiRequest.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSUploaderKitLog.e("KSUploaderKit-GeneralApiRequest", "get resume info, token: "+p0);
       this.mToken = p0;
       obj = new HttpRequestInfo();
       GeneralApiResponse generalApiRe = this.mHttpRequester.doRequestSync(this.mHttpRequester.getApiService(ServerAddress.getGeneralUploadHost(this.mServerHost)).getResumeInfo(p0), GeneralApiResponse.class, obj);
       this.mApiResponse = generalApiRe;
       if (generalApiRe != null && (generalApiRe.result > null && (generalApiRe.endpoints.size() <= 0 || obj.getNetErrorCode() == NetworkUtils$NetErrorCode.CONNECT_SERVER_FAILED))) {
          if (obj.getNetErrorCode() == NetworkUtils$NetErrorCode.NO_ERROR) {
             obj.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
          }
          boolean b = this.tryToSetApiResponseFromExternal();
          obj.setUseExternalEndPoints(b);
          if (b) {
             obj.setNetErrorCode(null);
          }else {
             ApiManager$UploadStep apply = ApiManager$UploadStep.Apply;
             this.postReportAPILog(apply, obj);
             this.postCompleteEvent(apply, obj.getNetErrorCode(), null);
             return null;
          }
       }
       obj.setTokenID(this.mApiResponse.tokenID);
       this.postReportAPILog(ApiManager$UploadStep.Apply, obj);
       return this.mApiResponse;
    }
    public ApiResponse getCachedApiResponse(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GeneralApiRequest.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && this.mSPHelper.contains(p0)) {
          return this.mSPHelper.get(p0, new MediaCloudApiResponse());
       }
       return null;
    }
    public b getRickonTokenResponse(ApiResponse p0,ApiManager$TokenType p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, GeneralApiRequest.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = null;
       if (!p0 instanceof GeneralApiResponse) {
          return uob;
       }
       if (p0 == null) {
          return uob;
       }
       obj = new b();
       obj.d = p0.parseEndPoints();
       if (this.mUploadInfo.enableResume()) {
          obj.b = p0.fragmentIndex + 1;
          obj.c = p0.fragmentPositionBytes;
       }else {
          obj.b = 0;
          obj.c = 0;
       }
       ApiManager$TokenType cover = ApiManager$TokenType.Cover;
       if (p1 == cover || p1 == ApiManager$TokenType.Image) {
          obj.b = 0;
          obj.c = 0;
       }
       obj.a = (p1 == cover)? this.mUploadInfo.getCoverToken(): this.mToken;
       return obj;
    }
    public long getStartFileSize(){
       GeneralApiRequest tmApiRespons = this.mApiResponse;
       if (tmApiRespons != null) {
          ApiResponse fragmentPosi = tmApiRespons.fragmentPositionBytes;
          if (fragmentPosi > 0) {
             return fragmentPosi;
          }
       }
       return 0;
    }
    public ApiResponse getUploadToken(ApiManager$TokenType p0){
       return this.getUploadToken(p0);
    }
    public GeneralApiResponse getUploadToken(ApiManager$TokenType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GeneralApiRequest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSUploaderKitLog.e("KSUploaderKit-GeneralApiRequest", "getUploadToken, tokenType: "+p0);
       boolean b = true;
       this.mToken = (GeneralApiRequest$2.$SwitchMap$com$kwai$video$ksuploaderkit$apicenter$ApiManager$TokenType[p0.ordinal()] != b)? this.mUploadInfo.getFileToken(): this.mUploadInfo.getCoverToken();
       if (this.mUploadInfo.enableResume() && this.mUploadInfo.getTaskID() != null) {
          MediaCloudApiResponse mediaCloudAp = new MediaCloudApiResponse();
          mediaCloudAp.videoToken = this.mToken;
          this.mSPHelper.put(this.mUploadInfo.getTaskID(), mediaCloudAp);
       }
       if (this.mApiResponse == null) {
          this.tryToSetApiResponseFromExternal();
       }
       if (this.mApiResponse == null) {
          this.mApiResponse = this.fetchResumeInfo(this.mToken);
       }else {
          HttpRequestInfo httpRequestI = new HttpRequestInfo();
          httpRequestI.setTokenID(this.mApiResponse.tokenID);
          httpRequestI.setUseExternalEndPoints(b);
          this.postReportAPILog(ApiManager$UploadStep.Apply, httpRequestI);
       }
       return this.mApiResponse;
    }
    public void postCompleteEvent(ApiManager$UploadStep p0,NetworkUtils$NetErrorCode p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GeneralApiRequest.class, "6")) {
          return;
       }
       GeneralApiRequest tmEventListe = this.mEventListener;
       if (tmEventListe != null) {
          tmEventListe.onComplete(p0, p1, p2);
       }
       return;
    }
    public final void postReportAPILog(ApiManager$UploadStep p0,HttpRequestInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GeneralApiRequest.class, "7")) {
          return;
       }
       GeneralApiRequest tmEventListe = this.mEventListener;
       if (tmEventListe != null) {
          tmEventListe.onReportAPILog(p0, p1);
       }
       return;
    }
    public void publish(ApiManager$TokenType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GeneralApiRequest.class, "4")) {
          return;
       }
       new Thread(new GeneralApiRequest$1(this)).start();
       return;
    }
    public void removeCachedApiResponse(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GeneralApiRequest.class, "10")) {
          return;
       }
       if (p0 != null && this.mSPHelper.contains(p0)) {
          this.mSPHelper.remove(p0);
       }
       return;
    }
    public void setEventListener(IApiRequest$EventListener p0){
       this.mEventListener = p0;
    }
    public void setExternalApiResponse(ApiResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GeneralApiRequest.class, "1")) {
          return;
       }
       this.mExternalApiResponse = p0;
       if (p0 != null && p0.endpoints != null) {
          KSUploaderKitLog.e("KSUploaderKit-GeneralApiRequest", "setExternalApiResponse, tokenID: "+p0.tokenID+", endpoints count:"+p0.endpoints.size());
       }
       return;
    }
    public void setUploadInfo(KSUploaderKitConfig$UploadInfo p0){
       GeneralApiRequest tmUploadInfo = this.mUploadInfo;
       if (tmUploadInfo != null && tmUploadInfo != p0) {
          this.mUploadInfo = p0;
       }
       return;
    }
    public final boolean tryToSetApiResponseFromExternal(){
       GeneralApiResponse obj = PatchProxy.apply(null, this, GeneralApiRequest.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mExternalApiResponse == null) {
          return false;
       }
       KSUploaderKitLog.e("KSUploaderKit-GeneralApiRequest", "use external endpoints: ");
       obj = new GeneralApiResponse();
       this.mApiResponse = obj;
       GeneralApiRequest tmExternalAp = this.mExternalApiResponse;
       obj.endpoints = tmExternalAp.endpoints;
       obj.tokenID = tmExternalAp.tokenID;
       obj.result = 1;
       return 1;
    }
}
