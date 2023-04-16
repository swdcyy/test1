package com.frog.engine.network.download.FrogDownloadClient;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.util.Map;
import okhttp3.Call;
import java.io.Closeable;
import java.io.Flushable;
import com.frog.engine.network.download.FrogDownloadTask;
import com.frog.engine.network.download.FrogDownloadCallBack;
import java.lang.Long;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.network.FrogOkHttpManager;
import okhttp3.OkHttpClient;
import okhttp3.Request$Builder;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.Request;
import com.frog.engine.jsobject.FrogLoggerObject;
import com.frog.engine.network.download.FrogDownloadClient$a;
import okhttp3.Callback;

public class FrogDownloadClient	// class@00154b
{
    public static Map sNeedDownloadCall;
    public static Map sNeedDownloadSeqNo;

    static {
       FrogDownloadClient.sNeedDownloadSeqNo = new HashMap();
       FrogDownloadClient.sNeedDownloadCall = new HashMap();
    }
    public void FrogDownloadClient(){
       super();
    }
    public static void abortDownload(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrogDownloadClient.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       Map sNeedDownloa = FrogDownloadClient.sNeedDownloadSeqNo;
       _monitor_enter(sNeedDownloa);
       FrogDownloadClient.sNeedDownloadSeqNo.put(p0, Boolean.FALSE);
       Call uCall = FrogDownloadClient.sNeedDownloadCall.get(p0);
       if (uCall != null) {
          uCall.cancel();
       }
       _monitor_exit(sNeedDownloa);
       return;
    }
    public static void closeQuietly(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrogDownloadClient.class, "3")) {
          return;
       }
       try{
          if (p0 != null) {
             if (p0 instanceof Flushable) {
                try{
                   p0.flush();
                }catch(java.lang.Exception e0){
                }
             }
             p0.close();
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static void downloadRes(String p0,long p1,FrogDownloadTask p2,FrogDownloadCallBack p3){
       Map sNeedDownloa;
       if (PatchProxy.isSupport(FrogDownloadClient.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), p2, p3, null, FrogDownloadClient.class, "2")) {
          return;
       }
       if (p2 == null) {
          if (p3 != null) {
             p3.onFail("task is empty");
          }
          return;
       }else {
          FrogLog.d("FrogOkHttp", "downloadResteTimeout\(ftm, TimeUnit.MILLISECOND:"+p2.getUrl()+" "+p2.getTimeout());
          OkHttpClient client = FrogOkHttpManager.getInstance().getClient(p2.getTimeout());
          Request$Builder uBuilder = new Request$Builder().url(p2.getUrl());
          long l = KsFrogPerfReportManager.instance().genHttpPerfLogObjectId("2").longValue();
          uBuilder.tag(Long.valueOf(l));
          if (p2.getHeader() != null && p2.getHeader().size() > 0) {
             Iterator iterator = p2.getHeader().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                uBuilder.addHeader(key, String.valueOf(uEntry.getValue()));
             }
          }
          if (p2.getHeader() != null && !p2.getHeader().containsKey("Accept-Encoding")) {
             uBuilder.addHeader("Accept-Encoding", "identity");
          }
          Call uCall = client.newCall(uBuilder.build());
          if (!TextUtils.isEmpty(p0)) {
             sNeedDownloa = FrogDownloadClient.sNeedDownloadSeqNo;
             _monitor_enter(sNeedDownloa);
             if (Boolean.FALSE.equals(FrogDownloadClient.sNeedDownloadSeqNo.get(p0))) {
                KsFrogPerfReportManager.instance().removeLogObject(l);
                FrogDownloadClient.sNeedDownloadCall.remove(p0);
                if (p3 != null) {
                   p3.onFail("cancel already");
                }
                _monitor_exit(sNeedDownloa);
                return;
             }else {
                FrogDownloadClient.sNeedDownloadSeqNo.put(p0, Boolean.TRUE);
                FrogDownloadClient.sNeedDownloadCall.put(p0, uCall);
                _monitor_exit(sNeedDownloa);
             }
          }
          FrogDownloadClient$a uoa = new FrogDownloadClient$a(l, p3, p0, p1, p2);
          uCall.enqueue(sNeedDownloa);
          return;
       }
    }
}
