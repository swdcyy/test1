package com.frog.engine.network.upload.FrogUploadClient;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Map;
import okhttp3.Call;
import com.kwai.robust.PatchProxyResult;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.frog.engine.network.upload.FrogUploadTask;
import com.frog.engine.network.upload.FrogUploadResultCallBack;
import java.io.File;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.network.FrogOkHttpManager;
import okhttp3.OkHttpClient;
import okhttp3.MediaType;
import com.frog.engine.network.upload.ProgressRequestBody;
import okhttp3.RequestBody;
import com.frog.engine.network.upload.FrogUploadClient$a;
import com.frog.engine.network.upload.ProgressRequestBody$Listener;
import okhttp3.MultipartBody$Builder;
import okhttp3.MultipartBody;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.Request$Builder;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import java.lang.Long;
import okhttp3.Request;
import com.frog.engine.network.upload.FrogUploadClient$b;
import okhttp3.Callback;

public class FrogUploadClient	// class@001554
{
    public static Map sNeedUploadCall;
    public static Map sNeedUploadSeqNo;

    static {
       FrogUploadClient.sNeedUploadSeqNo = new HashMap();
       FrogUploadClient.sNeedUploadCall = new HashMap();
    }
    public void FrogUploadClient(){
       super();
    }
    public static void abortUpload(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrogUploadClient.class, "1")) {
          return;
       }
       Map sNeedUploadS = FrogUploadClient.sNeedUploadSeqNo;
       _monitor_enter(sNeedUploadS);
       FrogUploadClient.sNeedUploadSeqNo.put(p0, Boolean.FALSE);
       Call uCall = FrogUploadClient.sNeedUploadCall.get(p0);
       if (uCall != null) {
          uCall.cancel();
          FrogUploadClient.sNeedUploadCall.remove(p0);
       }
       _monitor_exit(sNeedUploadS);
       return;
    }
    public static String guessMimeType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogUploadClient.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = URLConnection.getFileNameMap().getContentTypeFor(p0);
       if (TextUtils.isEmpty(p0)) {
          p0 = "application/octet-stream";
       }
       return p0;
    }
    public static void uploadRes(String p0,FrogUploadTask p1,FrogUploadResultCallBack p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, FrogUploadClient.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       File uFile = new File(p1.getFilePath());
       if (uFile.exists()) {
          FrogLog.d("FrogOkHttp", "uploadRes:"+p1.getUrl()+" "+p1.getTimeout());
          OkHttpClient client = FrogOkHttpManager.getInstance().getClient(p1.getTimeout());
          MultipartBody$Builder uBuilder = new MultipartBody$Builder().setType(MultipartBody.FORM).addFormDataPart(p1.getName(), uFile.getName(), new ProgressRequestBody(RequestBody.create(MediaType.parse(FrogUploadClient.guessMimeType(p1.getFilePath())), uFile), new FrogUploadClient$a(p2, p0)));
          if (p1.getFormData() != null) {
             Iterator iterator = p1.getFormData().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                uBuilder.addFormDataPart(key, String.valueOf(uEntry.getValue()));
             }
          }
          Request$Builder uBuilder1 = new Request$Builder().url(p1.getUrl()).post(uBuilder.build());
          if (p1.getHeader() != null) {
             Iterator iterator1 = p1.getHeader().entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                String key1 = uEntry1.getKey();
                uBuilder1.addHeader(key1, String.valueOf(uEntry1.getValue()));
             }
          }
          long l = KsFrogPerfReportManager.instance().genHttpPerfLogObjectId("3").longValue();
          uBuilder1.tag(Long.valueOf(l));
          Call uCall = client.newCall(uBuilder1.build());
          if (!TextUtils.isEmpty(p0)) {
             Map sNeedUploadS = FrogUploadClient.sNeedUploadSeqNo;
             _monitor_enter(sNeedUploadS);
             FrogUploadClient.sNeedUploadSeqNo.put(p0, Boolean.TRUE);
             FrogUploadClient.sNeedUploadCall.put(p0, uCall);
             _monitor_exit(sNeedUploadS);
          }
          uCall.enqueue(new FrogUploadClient$b(l, p2));
       }else if(p2 != null){
          p2.onFail("file not exists");
       }
       return;
    }
}
