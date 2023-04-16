package com.frog.engine.network.FrogOkHttpManager;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.frog.engine.network.xhr.FrogHttpRequestClient;
import com.frog.engine.network.download.FrogDownloadClient;
import com.frog.engine.network.upload.FrogUploadClient;
import com.frog.engine.network.download.FrogDownloadTask;
import com.frog.engine.network.download.FrogDownloadCallBack;
import java.lang.Long;
import com.frog.engine.network.upload.FrogUploadTask;
import com.frog.engine.network.upload.FrogUploadResultCallBack;
import com.frog.engine.network.xhr.FrogXHRTask;
import com.frog.engine.network.xhr.FrogHttpResultCallBack;
import okhttp3.OkHttpClient;
import java.lang.Integer;
import java.util.Map;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.network.interceptor.RedirectInterceptor;
import okhttp3.Interceptor;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import okhttp3.EventListener$Factory;
import com.frog.engine.network.FrogExternalInterceptor;

public class FrogOkHttpManager	// class@001548
{
    public FrogExternalInterceptor externalInterceptor;
    public final OkHttpClient$Builder mBuilder;
    public Map mClientMap;
    public static FrogOkHttpManager sInstance;

    public void FrogOkHttpManager(){
       super();
       this.mClientMap = new ConcurrentHashMap();
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       this.mBuilder = new OkHttpClient$Builder().connectTimeout(0x4e20, mILLISECONDS).readTimeout(0x4e20, mILLISECONDS).cache(null).connectionPool(new ConnectionPool(16, 0x493e0, mILLISECONDS)).retryOnConnectionFailure(true);
    }
    public static int formatTimeout(long p0){
       if (p0 < 0 || p0 - 0xea60 > 0) {
          return 0xea60;
       }
       return ((((int)p0 + 2500) / 5000) * 5000);
    }
    public static FrogOkHttpManager getInstance(){
       FrogOkHttpManager uFrogOkHttpM = FrogOkHttpManager.class;
       Object obj = PatchProxy.apply(null, null, uFrogOkHttpM, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (FrogOkHttpManager.sInstance == null) {
          _monitor_enter(uFrogOkHttpM);
          if (FrogOkHttpManager.sInstance == null) {
             FrogOkHttpManager.sInstance = new FrogOkHttpManager();
          }
          _monitor_exit(uFrogOkHttpM);
       }
       return FrogOkHttpManager.sInstance;
    }
    public void abortTask(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogOkHttpManager.class, "6")) {
          return;
       }
       FrogHttpRequestClient.abortXHR(p0);
       FrogDownloadClient.abortDownload(p0);
       FrogUploadClient.abortUpload(p0);
       return;
    }
    public void addDownloadTask(String p0,long p1,FrogDownloadTask p2,FrogDownloadCallBack p3){
       if (PatchProxy.isSupport(FrogOkHttpManager.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), p2, p3, this, FrogOkHttpManager.class, "3")) {
          return;
       }
       FrogDownloadClient.downloadRes(p0, p1, p2, p3);
       return;
    }
    public void addUploadTask(String p0,FrogUploadTask p1,FrogUploadResultCallBack p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FrogOkHttpManager.class, "5")) {
          return;
       }
       FrogUploadClient.uploadRes(p0, p1, p2);
       return;
    }
    public void addXHRTask(String p0,FrogXHRTask p1,FrogHttpResultCallBack p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FrogOkHttpManager.class, "4")) {
          return;
       }
       FrogHttpRequestClient.doRequest(p0, p1, p2);
       return;
    }
    public OkHttpClient$Builder getBuilder(){
       return this.mBuilder;
    }
    public OkHttpClient getClient(long p0){
       FrogOkHttpManager uFrogOkHttpM = FrogOkHttpManager.class;
       if (PatchProxy.isSupport(uFrogOkHttpM)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uFrogOkHttpM, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = FrogOkHttpManager.formatTimeout(p0);
       OkHttpClient okHttpClient = this.mClientMap.get(Integer.valueOf(i));
       if (okHttpClient != null) {
          return okHttpClient;
       }else {
          FrogLog.d("FrogOkHttp M", p0+" to "+i);
          long l = (long)i;
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          OkHttpClient$Builder uBuilder = this.getBuilder().connectTimeout(l, mILLISECONDS).readTimeout(l, mILLISECONDS).callTimeout(l, mILLISECONDS);
          uBuilder = uBuilder.addInterceptor(new RedirectInterceptor());
          EventListener$Factory uFactory = KsFrogPerfReportManager.instance().eventListenerFactory();
          if (uFactory != null) {
             uBuilder.eventListenerFactory(uFactory);
          }
          OkHttpClient okHttpClient1 = uBuilder.build();
          this.mClientMap.put(Integer.valueOf(i), okHttpClient1);
          return okHttpClient1;
       }
    }
    public FrogExternalInterceptor getInterceptor(){
       return this.externalInterceptor;
    }
    public void setInterceptor(FrogExternalInterceptor p0){
       this.externalInterceptor = p0;
    }
}
