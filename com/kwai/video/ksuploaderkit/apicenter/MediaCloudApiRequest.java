package com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest;
import zk.d;
import com.google.gson.Gson;
import android.content.Context;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.network.HttpRequester;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.utils.SharedPreferencesHelper;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
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
import okhttp3.RequestBody;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest$RequestParams;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.utils.FileUtils;
import okhttp3.MediaType;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import ln.b;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest$2;
import java.lang.Enum;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest$EventListener;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;

public class MediaCloudApiRequest implements IApiRequest	// class@00099a
{
    public MediaCloudApiResponse mApiResponse;
    public IApiRequest$EventListener mEventListener;
    public HttpRequester mHttpRequester;
    public SharedPreferencesHelper mSPHelper;
    public String mServerHost;
    public KSUploaderKitConfig$UploadInfo mUploadInfo;
    public static Gson gson;

    static {
       MediaCloudApiRequest.gson = new d().b();
    }
    public void MediaCloudApiRequest(Context p0,KSUploaderKitConfig$UploadInfo p1,String p2){
       super();
       this.mUploadInfo = p1;
       this.mHttpRequester = new HttpRequester();
       this.mServerHost = p2;
       if (p1.enableResume() && p1.getUploadMode() == KSUploaderKitCommon$UploadMode.Whole) {
          this.mSPHelper = new SharedPreferencesHelper(p0, "KSUploaderKit_Rickon_ResumeInfo");
       }
       return;
    }
    public ApiResponse fetchResumeInfo(String p0){
       return this.fetchResumeInfo(p0);
    }
    public MediaCloudApiResponse fetchResumeInfo(String p0){
       HttpRequestInfo obj = PatchProxy.applyOneRefs(p0, this, MediaCloudApiRequest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSUploaderKitLog.e("KSUploaderKit-MediaCloudApiRequest", "get resume info, token: "+p0);
       obj = new HttpRequestInfo();
       MediaCloudApiResponse mediaCloudAp = this.mHttpRequester.doRequestSync(this.mHttpRequester.getApiService(ServerAddress.getGeneralUploadHost(this.mServerHost)).getResumeInfo(p0), MediaCloudApiResponse.class, obj);
       this.mApiResponse = mediaCloudAp;
       if (mediaCloudAp != null && (mediaCloudAp.result > null && (mediaCloudAp.endpoints.size() <= 0 || obj.getNetErrorCode() == NetworkUtils$NetErrorCode.CONNECT_SERVER_FAILED))) {
          if (obj.getNetErrorCode() == NetworkUtils$NetErrorCode.NO_ERROR) {
             obj.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
          }
          ApiManager$UploadStep apply = ApiManager$UploadStep.Apply;
          this.postCompleteEvent(apply, obj.getNetErrorCode(), null);
          this.postReportAPILog(apply, obj);
          return null;
       }else {
          obj.setTokenID(this.mApiResponse.tokenID);
          if (this.mSPHelper != null && this.mUploadInfo.getTaskID() != null) {
             mediaCloudAp = this.mSPHelper.get(this.mUploadInfo.getTaskID(), this.mApiResponse);
             MediaCloudApiRequest tmApiRespons = this.mApiResponse;
             tmApiRespons.uploadToken = mediaCloudAp.uploadToken;
             tmApiRespons.videoToken = mediaCloudAp.videoToken;
             tmApiRespons.coverToken = mediaCloudAp.coverToken;
          }
          this.postReportAPILog(ApiManager$UploadStep.Apply, obj);
          return this.mApiResponse;
       }
    }
    public final RequestBody getApplyRequestBody(){
       Object[] objArray = null;
       MediaCloudApiRequest$RequestParams obj = PatchProxy.apply(objArray, this, MediaCloudApiRequest.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MediaCloudApiRequest$RequestParams(this, objArray);
       obj.setSignature(this.mUploadInfo.getServerSignature());
       if (this.mUploadInfo.getMediaType() == KSUploaderKitCommon$MediaType.Image) {
          obj.setImageName(FileUtils.getFileName(this.mUploadInfo.getFilePath()));
       }else {
          obj.setVideoName(FileUtils.getFileName(this.mUploadInfo.getFilePath()));
          if (this.mUploadInfo.getMediaType() == KSUploaderKitCommon$MediaType.VideoWithCover && this.mUploadInfo.getCoverPath() != null) {
             obj.setCoverName(FileUtils.getFileName(this.mUploadInfo.getCoverPath()));
          }
       }
       return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), MediaCloudApiRequest.gson.q(obj));
    }
    public ApiResponse getCachedApiResponse(String p0){
       MediaCloudApiRequest obj = PatchProxy.applyOneRefs(p0, this, MediaCloudApiRequest.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = this.mSPHelper;
          if (obj != null && obj.contains(p0)) {
             return this.mSPHelper.get(p0, new MediaCloudApiResponse());
          }
       }
       return null;
    }
    public final a getMediaCloudRequestCall(ApiManager$TokenType p0,ApiManager$UploadStep p1){
       IApiService apiService;
       RequestBody applyRequest;
       a imageUploadT;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, MediaCloudApiRequest.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ServerAddress.getMediaCloudUploadHost();
       if (p1 == ApiManager$UploadStep.Apply) {
          apiService = this.mHttpRequester.getApiService(obj);
          applyRequest = this.getApplyRequestBody();
          imageUploadT = (ApiManager$TokenType.Image == p0)? apiService.getImageUploadToken(applyRequest): apiService.getVideoUploadToken(applyRequest);
       }else {
          apiService = this.mHttpRequester.getApiService(obj);
          applyRequest = this.getPublishRequestBody(this.mApiResponse.uploadToken);
          imageUploadT = (ApiManager$TokenType.Image == p0)? apiService.publishImage(applyRequest): apiService.publishVideo(applyRequest);
       }
    label_004a :
       return imageUploadT;
    }
    public final RequestBody getPublishRequestBody(String p0){
       MediaCloudApiRequest$RequestParams obj = PatchProxy.applyOneRefs(p0, this, MediaCloudApiRequest.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MediaCloudApiRequest$RequestParams(this, null);
       obj.setUploadToken(p0);
       obj.setClientMeta(this.mUploadInfo.getFileMetaData());
       return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), MediaCloudApiRequest.gson.q(obj));
    }
    public b getRickonTokenResponse(ApiResponse p0,ApiManager$TokenType p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, MediaCloudApiRequest.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = null;
       if (!p0 instanceof MediaCloudApiResponse) {
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
       int i = MediaCloudApiRequest$2.$SwitchMap$com$kwai$video$ksuploaderkit$apicenter$ApiManager$TokenType[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             obj.a = p0.videoToken;
          }else {
             obj.a = p0.coverToken;
             obj.b = 0;
             obj.c = 0;
          }
       }else {
          obj.a = p0.imageToken;
       }
       return obj;
    }
    public long getStartFileSize(){
       MediaCloudApiRequest tmApiRespons = this.mApiResponse;
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
    public MediaCloudApiResponse getUploadToken(ApiManager$TokenType p0){
       ApiManager$UploadStep obj = PatchProxy.applyOneRefs(p0, this, MediaCloudApiRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSUploaderKitLog.e("KSUploaderKit-MediaCloudApiRequest", "get apply token, type : "+p0);
       if (this.mApiResponse == null) {
          obj = ApiManager$UploadStep.Apply;
          HttpRequestInfo httpRequestI = new HttpRequestInfo();
          MediaCloudApiResponse mediaCloudAp = this.mHttpRequester.doRequestSync(this.getMediaCloudRequestCall(p0, obj), MediaCloudApiResponse.class, httpRequestI);
          this.mApiResponse = mediaCloudAp;
          if (mediaCloudAp != null && (mediaCloudAp.result <= null || (mediaCloudAp.imageToken != null || (mediaCloudAp.videoToken != null && (mediaCloudAp.uploadToken == null || mediaCloudAp.endpoints.size() <= 0))))) {
             if (NetworkUtils$NetErrorCode.NO_ERROR == httpRequestI.getNetErrorCode()) {
                httpRequestI.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
             }
             this.postCompleteEvent(obj, httpRequestI.getNetErrorCode(), null);
             this.postReportAPILog(obj, httpRequestI);
             return null;
          }else {
             httpRequestI.setTokenID(this.mApiResponse.tokenID);
             this.postReportAPILog(obj, httpRequestI);
             if (this.mSPHelper != null && this.mUploadInfo.getTaskID() != null) {
                this.mSPHelper.put(this.mUploadInfo.getTaskID(), this.mApiResponse);
             }
          }
       }
       return this.mApiResponse;
    }
    public void postCompleteEvent(ApiManager$UploadStep p0,NetworkUtils$NetErrorCode p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MediaCloudApiRequest.class, "6")) {
          return;
       }
       MediaCloudApiRequest tmEventListe = this.mEventListener;
       if (tmEventListe != null) {
          tmEventListe.onComplete(p0, p1, p2);
       }
       return;
    }
    public void postReportAPILog(ApiManager$UploadStep p0,HttpRequestInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MediaCloudApiRequest.class, "7")) {
          return;
       }
       MediaCloudApiRequest tmEventListe = this.mEventListener;
       if (tmEventListe != null) {
          tmEventListe.onReportAPILog(p0, p1);
       }
       return;
    }
    public void publish(ApiManager$TokenType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaCloudApiRequest.class, "3")) {
          return;
       }
       KSUploaderKitLog.e("KSUploaderKit-MediaCloudApiRequest", "publish photo");
       MediaCloudApiRequest tmSPHelper = this.mSPHelper;
       if (tmSPHelper != null) {
          tmSPHelper.remove(this.mUploadInfo.getInnerTaskId());
       }
       this.mHttpRequester.doRequestAsync(this.getMediaCloudRequestCall(p0, ApiManager$UploadStep.Publish), MediaCloudApiResponse.class, new MediaCloudApiRequest$1(this));
       return;
    }
    public void removeCachedApiResponse(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaCloudApiRequest.class, "5")) {
          return;
       }
       if (p0 != null) {
          MediaCloudApiRequest tmSPHelper = this.mSPHelper;
          if (tmSPHelper != null && tmSPHelper.contains(p0)) {
             this.mSPHelper.remove(p0);
          }
       }
       return;
    }
    public void setEventListener(IApiRequest$EventListener p0){
       this.mEventListener = p0;
    }
    public void setExternalApiResponse(ApiResponse p0){
    }
    public void setUploadInfo(KSUploaderKitConfig$UploadInfo p0){
       MediaCloudApiRequest tmUploadInfo = this.mUploadInfo;
       if (tmUploadInfo != null && tmUploadInfo != p0) {
          this.mUploadInfo = p0;
       }
       return;
    }
}
