package com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import wkd.b;
import j80.c;
import java.io.File;
import qkd.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$PhotoDownloadDetail;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kwai.video.hodor.BaseTaskInfo;
import java.lang.Boolean;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;
import ekd.k1;
import exb.e;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.CharSequence;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask$a;

public class PhotoResourceDownloadTask	// class@000eca
{
    public int a;
    public ExportMediaCacheTask b;
    public List c;
    public String d;
    public int e;
    public final Semaphore f;
    public List g;

    public void PhotoResourceDownloadTask(String p0){
       super();
       this.a = 0;
       this.c = new ArrayList();
       this.e = -1;
       this.f = new Semaphore(0, true);
       this.g = new ArrayList();
       this.d = b.X(b.a(-1504323719).o(), p0).getAbsolutePath();
    }
    public final ClientStat$PhotoDownloadDetail a(String p0,int p1){
       PhotoResourceDownloadTask photoResourc = PhotoResourceDownloadTask.class;
       if (PatchProxy.isSupport(photoResourc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, photoResourc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ClientStat$PhotoDownloadDetail photoDownloa = new ClientStat$PhotoDownloadDetail();
       photoDownloa.url = TextUtils.k(p0);
       photoDownloa.loadSource = p1;
       photoDownloa.startTimestamp = System.currentTimeMillis();
       photoDownloa.fileType = 2;
       this.g.add(photoDownloa);
       return photoDownloa;
    }
    public void b(ClientStat$PhotoDownloadDetail p0,boolean p1,BaseTaskInfo p2){
       if (PatchProxy.isSupport(PhotoResourceDownloadTask.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, PhotoResourceDownloadTask.class, "10")) {
          return;
       }
       if (p1) {
          Object[] objArray = new Object[0];
          e.C().w("PhotoResourceDownloadTask", "onTaskStatusChanged isLoadFromCache host: "+p2.getHost(), objArray);
          p0.loadSource = 2;
       }else {
          p0.loadSource = 1;
       }
       p0.host = TextUtils.k(p2.getHost());
       p0.serverIp = TextUtils.k(p2.getIp());
       p0.cost = (int)k1.t(p0.startTimestamp);
       p0.downloadSize = (int)p2.getDownloadedBytes();
       return;
    }
    public List c(){
       return this.g;
    }
    public void d(String p0,String p1,e p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PhotoResourceDownloadTask.class, "6")) {
          return;
       }
       int i = 1;
       ClientStat$PhotoDownloadDetail photoDownloa = this.a(p0, i);
       p2.onStart(p0);
       Object[] objArray = new Object[0];
       e.C().w("PhotoResourceDownloadTask", "resourceDownload url: "+p0, objArray);
       DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(p0);
       uDownloadReq.setBizInfo(":ks-components:photo-download", "feed_photo_download", null);
       uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
       uDownloadReq.setNeedCDNReport(i);
       if (!TextUtils.x(p1)) {
          uDownloadReq.addRequestHeader("HOST", p1);
       }
       uDownloadReq.setDeleteCacheOnCancel(0);
       uDownloadReq.setTaskQosClass(8);
       uDownloadReq.setEvictStrategy(i);
       uDownloadReq.setAllowedNetworkTypes(3);
       b[] uobArray = new b[i];
       uobArray[0] = new PhotoResourceDownloadTask$a(this, photoDownloa, p2, p0);
       this.a = DownloadManager.n().E(uDownloadReq, uobArray);
       return;
    }
}
