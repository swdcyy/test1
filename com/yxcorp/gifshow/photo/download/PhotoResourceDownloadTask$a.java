package com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask$a;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$PhotoDownloadDetail;
import exb.e;
import java.lang.String;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.ResourceDownloadTask$TaskInfo;
import com.kwai.video.hodor.BaseTaskInfo;
import ywb.e;
import q87.c;
import com.yxcorp.download.DownloadManager;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.Locale;
import java.lang.Integer;
import java.util.List;
import elb.c$a;
import c0d.d;
import com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask$DownloadTaskException;
import java.lang.Long;

public class PhotoResourceDownloadTask$a extends k	// class@000ec9
{
    public final ClientStat$PhotoDownloadDetail c;
    public final e d;
    public final String e;
    public final PhotoResourceDownloadTask f;

    public void PhotoResourceDownloadTask$a(PhotoResourceDownloadTask p0,ClientStat$PhotoDownloadDetail p1,e p2,String p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoResourceDownloadTask$a.class, "1")) {
          return;
       }
       ResourceDownloadTask$TaskInfo taskInfo = p0.getTaskInfo();
       if (taskInfo != null) {
          this.f.b(this.c, taskInfo.isLoadFromCache(), taskInfo);
       }
       Object[] objArray = new Object[0];
       e.C().w("PhotoResourceDownloadTask", "onTaskStatusChanged canceled", objArray);
       taskInfo.status = 2;
       this.d.onCancel(this.e);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoResourceDownloadTask$a.class, "2")) {
          return;
       }
       ResourceDownloadTask$TaskInfo taskInfo = p0.getTaskInfo();
       if (taskInfo != null) {
          DownloadManager.C("feed_photo_download", null);
          this.f.b(this.c, taskInfo.isLoadFromCache(), taskInfo);
          String cacheFilePat = taskInfo.getCacheFilePath();
          Object[] objArray = new Object[0];
          e.C().w("PhotoResourceDownloadTask", "onDownloadFinish download success, cacheFile: "+cacheFilePat, objArray);
          this.c.status = 1;
          this.f.d = cacheFilePat;
          this.d.b(cacheFilePat, this.e);
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       d uod1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoResourceDownloadTask$a.class, "3")) {
          return;
       }
       ResourceDownloadTask$TaskInfo taskInfo = p0.getTaskInfo();
       if (taskInfo != null) {
          this.f.b(this.c, taskInfo.isLoadFromCache(), taskInfo);
          p1.errMsg = taskInfo.getErrorMsg();
          p1.httpCode = taskInfo.getErrorCode();
          Object[] objArray = new Object[]{BaseTaskInfo.taskStateToString(taskInfo.getTaskState()),Integer.valueOf(taskInfo.getErrorCode())};
          int i = 0;
          int i1 = 1;
          objArray = new Object[i];
          String str = "PhotoResourceDownloadTask";
          e.C().t(str, String.format(Locale.US, "onDownloadFinish download fail, taskState:%s, errorCode:%d ", objArray), objArray);
          p1.status = 3;
          PhotoResourceDownloadTask$a tf = this.f;
          Object[] objArray1 = (tf.e < (tf.c.size() - i1))? 1: null;
          d uod = null;
          if (objArray1) {
             PhotoResourceDownloadTask$a tf1 = this.f;
             int i2 = tf1.e + i1;
             tf1.e = i2;
             c$a uoa = tf1.c.get(i2);
             c$a c = uoa.c;
             uoa = uoa.b;
             if (uoa != null) {
                uod = uoa.b;
             }
             uod1 = uod;
             uod = c;
          }else {
             uod1 = uod;
          }
          if (objArray1) {
             objArray1 = new Object[i];
             e.C().w(str, "onDownloadFinish try other cdn url", objArray1);
             this.f.d(uod, uod1, this.d);
          }else {
             this.d.d(new PhotoResourceDownloadTask$DownloadTaskException(taskInfo.getErrorCode(), "error_code: "+taskInfo.getErrorCode()), uod, this.e);
          }
       }
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(PhotoResourceDownloadTask$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, PhotoResourceDownloadTask$a.class, "4")) {
          return;
       }
       float f = ((float)p1 * 0x3f800000) / (float)p2;
       Object[] objArray = new Object[0];
       e.C().w("PhotoResourceDownloadTask", "onSessionProgress: progressPosition: "+p1+", totalBytes: "+p2+", ratio: "+f, objArray);
       this.d.c(p2, f);
       return;
    }
}
