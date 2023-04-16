package com.kwai.video.ksuploaderkit.speedtester.KSSpeedTestKit;
import android.app.Application;
import java.lang.Object;
import zk.d;
import com.google.gson.Gson;
import com.kwai.video.ksuploaderkit.network.HttpRequester;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.ks.ksuploader.KSSpeedTester;
import java.util.List;
import ln.b;
import com.kwai.video.ksuploaderkit.utils.IPUtils;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.speedtester.InnerSpeedTesterCache;
import java.util.ArrayList;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import com.kwai.video.ksuploaderkit.apicenter.IApiService;
import retrofit2.a;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import com.kwai.video.ksuploaderkit.speedtester.KSSpeedTestKit$RequestParams;
import com.kwai.video.ksuploaderkit.speedtester.KSSpeedTestKit$1;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.ks.ksuploader.KSUploader$RickonConfig;
import java.lang.IllegalAccessException;
import java.lang.System;
import android.content.Context;
import com.ks.ksapi.b;

public class KSSpeedTestKit	// class@0009bd
{
    public Application mContext;
    public Gson mGson;
    public HttpRequester mHttpRequester;
    public static KSSpeedTestKit INSTANCE;
    public static String TAG;

    public void KSSpeedTestKit(Application p0){
       super();
       this.mGson = new d().b();
       this.mContext = p0;
       this.mHttpRequester = new HttpRequester();
    }
    public static KSSpeedTestKit getInstance(Application p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSSpeedTestKit.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (KSSpeedTestKit.INSTANCE == null) {
          _monitor_enter(KSSpeedTester.class);
          if (KSSpeedTestKit.INSTANCE == null) {
             KSSpeedTestKit.INSTANCE = new KSSpeedTestKit(p0);
          }
          _monitor_exit(KSSpeedTester.class);
       }
       return KSSpeedTestKit.INSTANCE;
    }
    public b buildRickonTokenResponse(String p0,List p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, KSSpeedTestKit.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       IPUtils.processDnsResolve(p1);
       obj = new b();
       obj.a = p0;
       obj.d = p1;
       return obj;
    }
    public final ApiResponse fetchApiResponse(String p0,String p1,KSUploaderKitCommon$ServiceType p2){
       ApiResponse obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KSSpeedTestKit.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = InnerSpeedTesterCache.getInstance().getPipelineKeyResponse(p0);
       if (obj == null) {
          ApiResponse uApiResponse = (p2 == KSUploaderKitCommon$ServiceType.General)? this.fetchGeneraApiResponse(p1, p0): this.fetchMediaApiResponse(p0);
          obj = uApiResponse;
          InnerSpeedTesterCache.getInstance().savePipelineKeyResopnse(p0, obj);
       }
       IPUtils.processDnsResolve(obj);
       return obj;
    }
    public final ApiResponse fetchGeneraApiResponse(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSSpeedTestKit.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mHttpRequester.doRequestSync(this.mHttpRequester.getApiService(ServerAddress.getGeneralUploadHost(p0)).getResumeInfo(p1), ApiResponse.class, new HttpRequestInfo());
    }
    public final ApiResponse fetchMediaApiResponse(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSSpeedTestKit.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSSpeedTestKit$RequestParams requestParam = new KSSpeedTestKit$RequestParams(null);
       requestParam.setSignature(p0);
       return this.mHttpRequester.doRequestSync(this.mHttpRequester.getApiService(ServerAddress.getMediaCloudUploadHost()).getVideoUploadToken(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.mGson.q(requestParam))), ApiResponse.class, new HttpRequestInfo());
    }
    public int getEncodePreset(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSSpeedTestKit.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return KSSpeedTester.getEncodePreset(p0, p1);
    }
    public int getNetSpeed(){
       Object obj = PatchProxy.apply(null, this, KSSpeedTestKit.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return KSSpeedTester.getNetSpeed();
    }
    public void startTestSpeed(String p0,String p1,String p2,KSUploaderKitCommon$ServiceType p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KSSpeedTestKit.class, "2")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          throw new IllegalAccessException("test token is null");
       }
       ApiResponse uApiResponse = this.fetchApiResponse(p1, p2, p3);
       if (uApiResponse != null && uApiResponse.endpoints != null) {
          KSUploader$RickonConfig rickonConfig = InnerSpeedTesterCache.getInstance().getRickonConfig();
          String str = (rickonConfig == null)? null: rickonConfig.nativeConfig;
          this.startTestSpeed(p0, p1, uApiResponse.parseEndPoints(), str);
       }
       return;
    }
    public void startTestSpeed(String p0,String p1,List p2,String p3){
       KSUploader$RickonConfig nativeConfig;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KSSpeedTestKit.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          throw new IllegalAccessException("test token is null");
       }
       if (TextUtils.isEmpty(p1)) {
          throw new IllegalAccessException("end points is null");
       }
       if (p3 == null) {
          KSUploader$RickonConfig rickonConfig = InnerSpeedTesterCache.getInstance().getRickonConfig();
          if (rickonConfig != null) {
             nativeConfig = rickonConfig.nativeConfig;
          }
       }
       if (nativeConfig == null) {
          nativeConfig = "{\"congestionControlType\":\"BBR2\", \"concurrentConnect\":true, \"firstConnectTimeoutMs\":3000}";
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = String.valueOf(System.currentTimeMillis());
       }
       KSSpeedTester.startSpeedTest(this.mContext, new KSSpeedTestKit$1(this, p0, p1, p2), nativeConfig, p0);
       return;
    }
}
