package com.kwai.video.krtccatelyn.HttpClientManager;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;
import okhttp3.OkHttpClient;
import okhttp3.Dispatcher;
import java.util.concurrent.ExecutorService;
import okhttp3.ConnectionPool;
import okhttp3.Cache;
import java.io.IOException;
import okhttp3.Request;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONArray;
import okhttp3.Request$Builder;
import java.util.Map$Entry;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.MultipartBody$Builder;
import okhttp3.MultipartBody;
import java.io.File;
import java.lang.Boolean;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionSpec;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import okhttp3.Call;
import com.kwai.video.krtccatelyn.HttpClientManager$1;
import okhttp3.Callback;

public class HttpClientManager	// class@0008d0
{
    public static HashMap httpClientMap;

    static {
       HttpClientManager.httpClientMap = new HashMap();
    }
    public void HttpClientManager(){
       super();
    }
    public static void cancelAll(int p0){
       if (PatchProxy.isSupport(HttpClientManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, HttpClientManager.class, "4")) {
          return;
       }
       _monitor_enter(HttpClientManager.class);
       Set set = HttpClientManager.httpClientMap.get(Integer.valueOf(p0));
       if (set != null) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             iterator.next().dispatcher().cancelAll();
          }
          set.clear();
       }
       _monitor_exit(HttpClientManager.class);
       return;
    }
    public static void clear(int p0){
       if (PatchProxy.isSupport(HttpClientManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, HttpClientManager.class, "5")) {
          return;
       }
       _monitor_enter(HttpClientManager.class);
       HttpClientManager.httpClientMap.remove(Integer.valueOf(p0));
       _monitor_exit(HttpClientManager.class);
       return;
    }
    public static void close(OkHttpClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, HttpClientManager.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.dispatcher().executorService().shutdown();
          p0.connectionPool().evictAll();
          if (p0.cache() != null) {
             try{
                p0.cache().close();
             }catch(java.io.IOException e3){
                e3.printStackTrace();
             }
          }
       }
    }
    public static native void onResponseNative(int p0,int p1,int p2,String p3);
    public static Request parseRequestJson(String p0){
       JSONObject jSONObject;
       RequestBody requestBody;
       Map$Entry uEntry1;
       JSONObject obj = PatchProxy.applyOneRefs(p0, null, HttpClientManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject(p0);
          p0 = obj.getString("url");
          String str = obj.getString("method");
          String str1 = obj.getString("content");
          String str2 = obj.getString("content_type");
          JSONArray jSONArray = obj.getJSONArray("headers");
          JSONArray jSONArray1 = obj.getJSONArray("formdata");
          JSONArray jSONArray2 = obj.getJSONArray("upload_files");
          HashMap hashMap = new HashMap();
          int i = 0;
          int i1 = 0;
          String str3 = "name";
          while (i1 < jSONArray.length()) {
             jSONObject = jSONArray.getJSONObject(i1);
             str3 = jSONObject.getString(str3);
             hashMap.put(str3, jSONObject.getString("value"));
             i1 = i1 + 1;
          }
          HashMap hashMap1 = new HashMap();
          for (i1 = 0; i1 < jSONArray1.length(); i1 = i1 + 1) {
             jSONObject = jSONArray1.getJSONObject(i1);
             String str4 = jSONObject.getString(str3);
             hashMap1.put(str4, jSONObject.getString("value"));
          }
          HashMap hashMap2 = new HashMap();
          for (; i < jSONArray2.length(); i = i + 1) {
             JSONObject jSONObject1 = jSONArray2.getJSONObject(i);
             String str5 = jSONObject1.getString(str3);
             hashMap2.put(str5, jSONObject1.getString("value"));
          }
          Request$Builder uBuilder = new Request$Builder();
          uBuilder.url(p0);
          Iterator iterator = hashMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             uBuilder.addHeader(key, uEntry.getValue());
          }
          if (!str1.isEmpty()) {
             requestBody = RequestBody.create(MediaType.parse(str2), str1);
          }else if(!hashMap1.isEmpty() || !hashMap2.isEmpty()){
             MultipartBody$Builder uBuilder1 = new MultipartBody$Builder().setType(MultipartBody.FORM);
             Iterator iterator1 = hashMap1.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry1 = iterator1.next();
                String key1 = uEntry1.getKey();
                uBuilder1.addFormDataPart(key1, uEntry1.getValue());
             }
             iterator1 = hashMap2.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry1 = iterator1.next();
                File uFile = new File(uEntry1.getValue());
                RequestBody requestBody1 = RequestBody.create(MediaType.parse("application/octet-stream"), uFile);
                uBuilder1.addFormDataPart(uEntry1.getKey(), uFile.getName(), requestBody1);
             }
             requestBody = uBuilder1.build();
          }else {
             requestBody = null;
          }
          uBuilder.method(str, requestBody);
          return uBuilder.build();
       }catch(org.json.JSONException e0){
          return null;
       }
    }
    public static boolean request(int p0,int p1,String p2,int p3){
       HttpClientManager httpClientMa = HttpClientManager.class;
       if (PatchProxy.isSupport(httpClientMa)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Integer.valueOf(p3), null, HttpClientManager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Request request = HttpClientManager.parseRequestJson(p2);
       boolean b = false;
       if (request == null) {
          return b;
       }else {
          TimeUnit sECONDS = TimeUnit.SECONDS;
          ConnectionSpec[] uConnectionS = new ConnectionSpec[]{ConnectionSpec.MODERN_TLS,ConnectionSpec.CLEARTEXT};
          OkHttpClient okHttpClient = new OkHttpClient$Builder().readTimeout((long)p3, sECONDS).connectionSpecs(Arrays.asList(uConnectionS)).connectionPool(new ConnectionPool(5, (long)(p3 * 2), sECONDS)).build();
          _monitor_enter(httpClientMa);
          if (!HttpClientManager.httpClientMap.containsKey(Integer.valueOf(p0))) {
             HttpClientManager.httpClientMap.put(Integer.valueOf(p0), new HashSet());
          }
          HttpClientManager.httpClientMap.get(Integer.valueOf(p0)).add(okHttpClient);
          _monitor_exit(httpClientMa);
          okHttpClient.newCall(request).enqueue(new HttpClientManager$1(p0, okHttpClient, p1));
          return 1;
       }
    }
}
