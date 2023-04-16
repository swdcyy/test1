package com.frog.engine.network.xhr.FrogHttpRequestClient;
import java.lang.String;
import okhttp3.MediaType;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import okhttp3.Call;
import com.frog.engine.network.xhr.FrogXHRTask;
import com.frog.engine.network.xhr.FrogHttpResultCallBack;
import java.util.LinkedHashMap;
import android.util.Pair;
import com.frog.engine.network.xhr.FrogHttpRequestDataType;
import java.lang.Enum;
import org.json.JSONObject;
import java.util.Iterator;
import java.lang.Throwable;
import android.util.Log;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.network.xhr.FrogHttpMethod;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import java.lang.Long;
import com.frog.engine.network.FrogOkHttpManager;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import com.frog.engine.network.xhr.FrogHttpRequestClient$a;
import okhttp3.Callback;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import okhttp3.MultipartBody$Builder;
import okhttp3.MultipartBody;
import okhttp3.FormBody$Builder;
import okhttp3.FormBody;
import android.net.Uri;

public class FrogHttpRequestClient	// class@001564
{
    public static final MediaType JSON;
    public static Map sNeedXHRSeqNo;

    static {
       FrogHttpRequestClient.JSON = MediaType.parse("application/json; charset=utf-8");
       FrogHttpRequestClient.sNeedXHRSeqNo = new HashMap();
    }
    public void FrogHttpRequestClient(){
       super();
    }
    public static void abortXHR(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrogHttpRequestClient.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       Map sNeedXHRSeqN = FrogHttpRequestClient.sNeedXHRSeqNo;
       _monitor_enter(sNeedXHRSeqN);
       Call uCall = FrogHttpRequestClient.sNeedXHRSeqNo.get(p0);
       if (uCall != null) {
          uCall.cancel();
          FrogHttpRequestClient.sNeedXHRSeqNo.remove(p0);
       }
       _monitor_exit(sNeedXHRSeqN);
       return;
    }
    public static void doRequest(String p0,FrogXHRTask p1,FrogHttpResultCallBack p2){
       Request$Builder uBuilder;
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       long l1;
       Call uCall;
       Map sNeedXHRSeqN;
       RequestBody fromRequestB;
       Request$Builder uBuilder1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, FrogHttpRequestClient.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       String str = "";
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       boolean b = false;
       long l = 2;
       if (p1.getDataAndType() != null) {
          int i = p1.getDataAndType().first.ordinal();
          if (i) {
             try{
                if (i != 1) {
                   if (i == l) {
                      b = p1.getDataAndType().second;
                   }
                }else if(p1.getDataAndType().second == null){
                   str = "";
                }else {
                   str = String.valueOf(p1.getDataAndType().second);
                }
                if (!TextUtils.isEmpty(str)) {
                   JSONObject jSONObject = new JSONObject(str);
                   Iterator iterator1 = jSONObject.keys();
                   while (iterator1.hasNext()) {
                      String str1 = iterator1.next();
                      linkedHashMa.put(str1, jSONObject.opt(str1));
                   }
                }
             }catch(java.lang.Exception e3){
                FrogLog.e("FrogHttpRequestClient", Log.getStackTraceString(e3));
             }
          }else if(p1.getDataAndType().second == null){
             str = "";
          }else {
             str = String.valueOf(p1.getDataAndType().second);
          }
       }
    }
    public static RequestBody getFromRequestBody(Map p0,Map p1,String p2,byte[] p3){
       String str1;
       String str2;
       MediaType mediaType;
       RequestBody requestBody;
       RequestBody requestBody1;
       int i1;
       Iterator iterator1;
       Map$Entry uEntry1;
       FormBody uFormBody;
       Map map = p0;
       String str = p2;
       byte[] uobyteArray = p3;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, FrogHttpRequestClient.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "application/json";
       if (map) {
          str1 = "content-type";
          if (map.containsKey(str1)) {
             str2 = String.valueOf(map.get(str1));
          label_0034 :
             str1 = str2;
          label_004a :
             int i = str1.hashCode();
             if (i != -1485569826) {
                if (i != -655019664) {
                   if (i == -43840953 && str1.equals(obj)) {
                      mediaType = 2;
                   }else {
                   label_007c :
                      mediaType = -1;
                   }
                }else if(str1.equals("multipart/form-data")){
                   mediaType = 1;
                }else {
                   goto label_007c ;
                }
             }else if(str1.equals("application/x-www-form-urlencoded")){
                mediaType = null;
             }else {
                goto label_007c ;
             }
             if (mediaType) {
                if (mediaType != 1) {
                   if (mediaType != 2) {
                   }else if(p1 != null && p1.size() > 0){
                      JSONObject jSONObject = new JSONObject();
                      Iterator iterator = p1.entrySet().iterator();
                      while (iterator.hasNext()) {
                         Map$Entry uEntry = iterator.next();
                         try{
                            jSONObject.put(uEntry.getKey(), uEntry.getValue());
                         }catch(java.lang.Exception e0){
                            FrogLog.e("FrogHttpRequestClient", e0.getMessage());
                            goto label_009a ;
                         }
                      }
                      requestBody1 = RequestBody.create(MediaType.parse(obj), jSONObject.toString());
                   }else if(!TextUtils.isEmpty(p2)){
                      requestBody1 = RequestBody.create(MediaType.parse(obj), str);
                   }else {
                   }
                }else {
                   MultipartBody$Builder uBuilder = new MultipartBody$Builder();
                   uBuilder.setType(MultipartBody.FORM);
                   if (p1 != null && p1.size() > 0) {
                      iterator1 = p1.entrySet().iterator();
                      while (iterator1.hasNext()) {
                         uEntry1 = iterator1.next();
                         uBuilder.addFormDataPart(uEntry1.getKey(), String.valueOf(uEntry1.getValue()));
                      }
                   label_016e :
                      requestBody = null;
                   label_016f :
                      if (requestBody == null && uobyteArray) {
                         requestBody1 = RequestBody.create(MediaType.parse(str1), uobyteArray);
                      }else if(requestBody == null && !TextUtils.isEmpty(p2)){
                         requestBody1 = RequestBody.create(MediaType.parse(str1), str);
                      }else if(requestBody == null){
                         i = str1.hashCode();
                         if (i != -1485569826) {
                            if (i != -655019664) {
                               if (i == -43840953 && str1.equals(obj)) {
                                  i1 = 2;
                               }else {
                               label_01b5 :
                                  i1 = -1;
                               }
                            }else if(str1.equals("multipart/form-data")){
                               i1 = 1;
                            }else {
                               goto label_01b5 ;
                            }
                         }else if(str1.equals("application/x-www-form-urlencoded")){
                            i1 = 0;
                         }else {
                            goto label_01b5 ;
                         }
                         if (i1) {
                            if (i1 != 1) {
                               if (i1 == 2) {
                                  requestBody = RequestBody.create(MediaType.parse(obj), "");
                               }
                            }else {
                               requestBody = new MultipartBody$Builder().build();
                            }
                         }else {
                            requestBody = new FormBody$Builder().build();
                         }
                      }
                   label_01e5 :
                      return requestBody;
                      requestBody = requestBody1;
                      goto label_0190 ;
                   }else if(!TextUtils.isEmpty(p2)){
                      requestBody1 = RequestBody.create(MediaType.parse("multipart/form-data"), str);
                   }else {
                      goto label_016e ;
                   }
                }
             }else {
                FormBody$Builder uBuilder1 = new FormBody$Builder();
                if (p1 != null && p1.size() > 0) {
                   iterator1 = p1.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      uEntry1 = iterator1.next();
                      String key = uEntry1.getKey();
                      uBuilder1.addEncoded(key, String.valueOf(uEntry1.getValue()));
                   }
                   uFormBody = uBuilder1.build();
                }else if(!TextUtils.isEmpty(p2)){
                   uFormBody = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), str);
                }else {
                   goto label_016e ;
                }
             }
             requestBody = requestBody1;
             goto label_016f ;
          }
       }
       if (map != null) {
          str1 = "Content-Type";
          if (map.containsKey(str1)) {
             str2 = String.valueOf(map.get(str1));
             goto label_0034 ;
          }
       }
       str1 = obj;
       goto label_004a ;
    }
    public static String getUrlParamsAsString(String p0,Map p1,String p2){
       Uri obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FrogHttpRequestClient.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null || (p1.size() <= 0 && TextUtils.isEmpty(p2))) {
          return p0;
       }
       obj = Uri.parse(p0);
       Set queryParamet = obj.getQueryParameterNames();
       String str = (queryParamet != null && queryParamet.size() > 0)? "&": "?";
       if (p1 != null && p1.size() >= 0) {
          p2 = "";
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (queryParamet != null && (queryParamet.contains(uEntry.getKey()) && (obj.getQueryParameter(uEntry.getKey())).equals(uEntry.getValue().toString()))) {
                continue ;
             }
             p2 = p2+uEntry.getKey()+"="+uEntry.getValue()+"&";
          }
          if (p2.length() > 0) {
             p2.deleteCharAt((p2.length() - 1));
          }
          if (p2.length() > 0) {
             p0 = p0+str+p2;
          }
          return p0;
       }else {
          return p0+str+p2;
       }
    }
}
