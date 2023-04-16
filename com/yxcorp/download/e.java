package com.yxcorp.download.e;
import com.kwai.video.hodor.ResourceDownloadTask$ResourceDownloadCallback;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import com.kwai.video.hodor.ResourceDownloadTask$TaskInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.download.b;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.kwai.video.hodor.BaseTaskInfo;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.download.c;
import java.lang.Integer;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.StringBuilder;
import mu8.i;
import java.lang.Runnable;
import android.os.Handler;
import mu8.h;
import com.yxcorp.download.DownloadManager;
import org.json.JSONObject;
import java.lang.Throwable;
import mu8.j;
import mu8.e;
import android.os.SystemClock;
import java.lang.Long;
import mu8.k;
import mu8.c;
import mu8.f;
import mu8.d;
import mu8.l;
import mu8.g;

public class e implements ResourceDownloadTask$ResourceDownloadCallback	// class@0011ba
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public final DownloadTask f;

    public void e(DownloadTask p0){
       this.f = p0;
       super();
       this.a = false;
       this.b = false;
       this.c = false;
       this.d = false;
       this.e = 0;
    }
    public final void a(){
       this.c = false;
       this.b = false;
       this.a = false;
       this.d = false;
       this.e = 0;
    }
    public void onCdnReport(ResourceDownloadTask$TaskInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       Iterator iterator = this.f.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().h(this.f, p0);
       }
       if (this.f.mRequest.isNeedCDNReport() && this.f.mRequest.mUnifyCdnLog == null) {
          Log.b("DownloadManager:DownloadTask", p0.getCdnStatJson());
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 89;
          int resourceType = this.f.mRequest.getResourceType();
          DownloadTask$DownloadRequest mExtraMessag = this.f.mRequest.mExtraMessage;
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(resourceType), mExtraMessag, urlPackage, null, c.class, "6")) {
             ClientStat$CdnResourceLoadStatEvent uCdnResource = new ClientStat$CdnResourceLoadStatEvent();
             uCdnResource.urlPackage = urlPackage;
             uCdnResource.resourceType = resourceType;
             int i = 1;
             uCdnResource.loadSource = i;
             uCdnResource.downloadType = 2;
             uCdnResource.url = p0.getCurrentUrl();
             if (p0.getStopReason() == i) {
                uCdnResource.loadStatus = i;
             }else if(p0.getStopReason() == 2){
                uCdnResource.loadStatus = 2;
             }else {
                uCdnResource.loadStatus = 3;
             }
             uCdnResource.cdnQosJson = TextUtils.k(p0.getCdnStatJson());
             uCdnResource.ratio = 0x3f800000;
             uCdnResource.downloadedSize = p0.getDownloadedBytes();
             uCdnResource.expectedSize = p0.getExpectBytes();
             uCdnResource.totalFileSize = p0.getTotalBytes();
             uCdnResource.host = TextUtils.k(p0.getHost());
             uCdnResource.ip = TextUtils.k(p0.getIp());
             uCdnResource.networkCost = (long)p0.getTransferConsumeMs();
             uCdnResource.extraMessage = TextUtils.k(mExtraMessag);
             ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
             statPackage.cdnResourceLoadStatEvent = uCdnResource;
             b.a(0x4b316083).j(statPackage);
          }
       }
       return;
    }
    public void onTaskStatusChanged(ResourceDownloadTask$TaskInfo p0){
       long progressByte;
       e f;
       JSONObject jSONObject;
       long l1;
       k ok;
       long l2;
       long totalBytes1;
       int i = this;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, i, e.class, "1")) {
          return;
       }
       String str = " ## totalByte:";
       String str1 = " ## progressByte:";
       String str2 = "Hodor callback onTaskStatusChanged : ";
       Handler handler = 3;
       String str3 = "DownloadManager:DownloadTask";
       boolean b = true;
       if (p0.getTaskState()) {
          Log.b(str3, str2+BaseTaskInfo.taskStateToString(p0.getTaskState())+i.f.getDebugLogInfo()+str1+p0.getProgressBytes()+str+p0.getTotalBytes());
       }else if(i.e < handler){
          Log.b(str3, str2+BaseTaskInfo.taskStateToString(p0.getTaskState())+i.f.getDebugLogInfo()+str1+p0.getProgressBytes()+str+p0.getTotalBytes());
          i.e = i.e + b;
       }
       progressByte = p0.getProgressBytes();
       long totalBytes = p0.getTotalBytes();
       int taskState = p0.getTaskState();
       if (taskState) {
          long l = 0;
          String str4 = "kwai_download_manager";
          int i1 = 0x4b316083;
          String str5 = "DownloadManager:DownloadLoggerUtils";
          String str6 = "type";
          if (taskState != b) {
             if (taskState != 2) {
                try{
                   if (taskState != handler) {
                      if (taskState != 4) {
                         if (taskState == 5) {
                            this.a();
                            f = i.f;
                            if (f.mRequest.isSyncCallback != null) {
                               f.onPending(progressByte, totalBytes);
                            }else {
                               i oi = new i(this, progressByte, totalBytes);
                               DownloadTask.sUIHandler.post(str3);
                            }
                            i.c = b;
                         }
                      }else {
                         this.a();
                         f = i.f;
                         if (f.mRequest.isSyncCallback != null) {
                            f.onPause(progressByte, totalBytes);
                         }else {
                            h oh = new h(this, progressByte, totalBytes);
                            DownloadTask.sUIHandler.post(str3);
                         }
                      }
                   }else {
                      String str7 = String.valueOf(p0.getErrorCode());
                      e f1 = i.f;
                      if (!PatchProxy.applyVoidTwoRefs(f1, str7, l, uoc, "3") && DownloadManager.u()) {
                         jSONObject = new JSONObject();
                         jSONObject.put(str6, "error");
                         jSONObject.put("error_cause", str7);
                         Log.b(str5, jSONObject.toString());
                         if (c.b(jSONObject, f1)) {
                            b.a(i1).logCustomEvent(str4, jSONObject.toString());
                         }
                      }
                      this.a();
                      f = i.f;
                      if (f.mRequest.isSyncCallback != null) {
                         f.onError(new Throwable(str7));
                      }else {
                         DownloadTask.sUIHandler.post(new j(i, str7));
                      }
                   }
                }catch(org.json.JSONException e0){
                }
             }else {
                this.a();
                f = i.f;
                if (f.mRequest.isSyncCallback != null) {
                   f.onCancel();
                }else {
                   DownloadTask.sUIHandler.post(new e(i));
                }
             }
          }else {
             try{
                e f2 = i.f;
                if (!PatchProxy.applyVoidOneRefs(f2, l, uoc, "2") && DownloadManager.u()) {
                   JSONObject jSONObject1 = new JSONObject();
                   jSONObject1.put(str6, "complete");
                   Log.b(str5, jSONObject1.toString());
                   if (c.b(jSONObject1, f2)) {
                      b.a(i1).logCustomEvent(str4, jSONObject1.toString());
                   }
                }
                f2 = i.f;
                if (f2.mIsContinue == null) {
                   try{
                      f2.mCompleteTime = SystemClock.elapsedRealtime();
                      f2 = i.f;
                      DownloadTask mStartTime = f2.mStartTime;
                      DownloadTask mCompleteTim = f2.mCompleteTime;
                      if (PatchProxy.isSupport(uoc) && (PatchProxy.applyVoidThreeRefs(f2, Long.valueOf(mStartTime), Long.valueOf(mCompleteTim), null, c.class, "4") || !DownloadManager.u())) {
                         l1 = progressByte;
                      }else {
                         jSONObject = new JSONObject();
                         jSONObject.put(str6, "speed");
                         String str8 = str5;
                         l2 = mCompleteTim - mStartTime;
                         jSONObject.put("download_time", l2);
                         b = c.b(jSONObject, f2);
                         try{
                            l1 = progressByte;
                            totalBytes1 = f2.getTotalBytes();
                            if (b && (mStartTime > 0 && (mCompleteTim > 0 && (mStartTime - mCompleteTim >= 0 || totalBytes1 <= 0)))) {
                               Log.n(str8, "Invalid data : "+jSONObject.toString());
                            }else {
                               jSONObject.put("speed_kBps", (double)(((float)totalBytes1 / 1024.00f) / ((float)l2 / 1000.00f)));
                               Log.b(str8, jSONObject.toString());
                               b.a(0x4b316083).logCustomEvent(str4, jSONObject.toString());
                            }
                         }catch(org.json.JSONException e0){
                         }
                      }
                   }catch(org.json.JSONException e0){
                   }
                }else {
                   l1 = progressByte;
                   Log.n(str3, "HodorTaskState_Finished and it is a continue task");
                }
             }catch(org.json.JSONException e0){
             }
          }
       }else {
          long l3 = totalBytes;
          l1 = progressByte;
          if (i.d == null) {
             i.f.mIsContinue = (l1 > 0)? true: false;
             f = i.f;
             if (f.mIsContinue == null) {
                f.mStartTime = SystemClock.elapsedRealtime();
             }
          }
          if (i.c == null) {
             f = i.f;
             if (f.mRequest.isSyncCallback != null) {
                progressByte = l1;
                f.onPending(progressByte, l3);
             }else {
                progressByte = l1;
                f uof = new f(this, progressByte, l3);
                DownloadTask.sUIHandler.post(v10);
             }
             i.c = true;
          }else {
             progressByte = l1;
          }
          if (i.b == null) {
             f = i.f;
             if (f.mRequest.isSyncCallback != null) {
                f.onStarted();
             }else {
                DownloadTask.sUIHandler.post(new d(i));
             }
             i.b = true;
          }
          if (i.a == null && l3 > 0) {
             e f3 = i.f;
             DownloadTask mIsContinue = f3.mIsContinue;
             if (f3.mRequest.isSyncCallback != null) {
                f3.onConnected(f3.getId(), "", mIsContinue, progressByte, l3);
                l2 = progressByte;
                totalBytes1 = l3;
             }else {
                totalBytes = progressByte;
                l2 = totalBytes;
                totalBytes1 = l3;
                l ol = new l(this, "", mIsContinue, totalBytes, l3);
                DownloadTask.sUIHandler.post(f3);
             }
             i.a = true;
          }else {
             l2 = progressByte;
             totalBytes1 = l3;
          }
          if (l2 > 0 && totalBytes1 > 0) {
             f = i.f;
             if (f.mRequest.isSyncCallback != null) {
                f.onProgress(l2, totalBytes1);
             }else {
                g og = new g(this, l2, totalBytes1);
                DownloadTask.sUIHandler.post(str3);
             }
          }
          i.d = true;
       }
    }
}
