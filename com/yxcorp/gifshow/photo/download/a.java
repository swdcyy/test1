package com.yxcorp.gifshow.photo.download.a;
import com.kwai.video.hodor.ExportMediaCacheTask$ExportMediaCacheTaskCallback;
import com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$PhotoDownloadDetail;
import exb.e;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.hodor.ExportMediaCacheTask$TaskInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.HodorConfig;
import ywb.e;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import k2b.g;
import com.kwai.video.hodor.BaseTaskInfo;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import java.lang.StringBuilder;
import ekd.k1;
import com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask$DownloadTaskException;
import java.lang.Throwable;

public class a implements ExportMediaCacheTask$ExportMediaCacheTaskCallback	// class@000ecb
{
    public final ClientStat$PhotoDownloadDetail a;
    public final e b;
    public final String c;
    public final PhotoResourceDownloadTask d;

    public void a(PhotoResourceDownloadTask p0,ClientStat$PhotoDownloadDetail p1,e p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onCdnReport(ExportMediaCacheTask$TaskInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (!HodorConfig.isEnablePreloadUnifyCdnLog()) {
          Object[] objArray = new Object[0];
          e.C().w("PhotoResourceDownloadTask", "exportPlayerCache onCdnReport", objArray);
          a tb = this.b;
          a td = this.d;
          a ta = this.a;
          Objects.requireNonNull(td);
          ClientStat$CdnResourceLoadStatEvent uCdnResource = PatchProxy.applyTwoRefs(p0, ta, td, PhotoResourceDownloadTask.class, "11");
          if (uCdnResource != PatchProxyResult.class) {
          }else {
             uCdnResource = new g().a();
             ClientStat$PhotoDownloadDetail loadSource = ta.loadSource;
             if (loadSource == 1) {
                uCdnResource.loadSource = 1;
             }else if(loadSource == 2){
                uCdnResource.loadSource = 2;
             }
             uCdnResource.url = ta.url;
             if (p0.getStopReason() == 1) {
                uCdnResource.loadStatus = 1;
             }else if(p0.getStopReason() == 2){
                uCdnResource.loadStatus = 2;
             }else {
                uCdnResource.loadStatus = 3;
             }
             uCdnResource.cdnQosJson = TextUtils.k(p0.getCdnStatJson());
             uCdnResource.ratio = 0x3f800000;
             uCdnResource.downloadedSize = p0.getDownloadedBytes();
             uCdnResource.expectedSize = p0.getExpectBytes();
             uCdnResource.host = TextUtils.k(p0.getHost());
             uCdnResource.ip = TextUtils.k(p0.getIp());
             uCdnResource.networkCost = (long)p0.getTransferConsumeMs();
             uCdnResource.totalFileSize = p0.getTotalBytes();
             uCdnResource.urlPackage = u1.k();
          }
          tb.e(uCdnResource);
       }
       return;
    }
    public void onTaskStatusChanged(ExportMediaCacheTask$TaskInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       int taskState = p0.getTaskState();
       this.d.b(this.a, p0.isLoadFromCache(), p0);
       int i = 2;
       int i1 = 0;
       String str = "PhotoResourceDownloadTask";
       if (taskState == i) {
          Object[] objArray = new Object[i1];
          e.C().w(str, "onTaskStatusChanged canceled", objArray);
          p0.status = i;
          this.b.onCancel(this.c);
          return;
       }else {
          long totalBytes = p0.getTotalBytes();
          long progressByte = p0.getProgressBytes();
          this.a.downloadSize = (int)progressByte;
          Object[] objArray1 = new Object[i1];
          e.C().w(str, "onTaskProgress progress: "+progressByte+", totalBytes: "+totalBytes+", ratio: "+(((double)progressByte * 0x3ff0000000000000) / (double)totalBytes), objArray1);
          this.b.c(totalBytes, (((float)progressByte * 0x3f800000) / (float)totalBytes));
          a ta = this.a;
          ta.cost = (int)k1.t(ta.startTimestamp);
          if (p0.isComplete()) {
             i = 1;
             if (taskState == i) {
                p0.status = i;
                this.b.b(this.d.d, this.c);
             }else if(p0.getErrorCode()){
                Object[] objArray2 = new Object[i1];
                e.C().w(str, "onTaskStatusChanged getErrorCode = "+p0.getErrorCode(), objArray2);
                this.a.errMsg = p0.getErrorMsg();
                a ta1 = this.a;
                ta1.status = 3;
                ta1.httpCode = p0.getErrorCode();
                this.b.d(new PhotoResourceDownloadTask$DownloadTaskException("error_code: "+p0.getErrorCode()), null, this.c);
             }
          }else {
             goto label_00a5 ;
          }
          return;
       }
    }
}
