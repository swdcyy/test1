package com.yxcorp.gifshow.camera.record.autoapply.sample.b;
import com.kwai.video.hodor.ExportMediaCacheTask$ExportMediaCacheTaskCallback;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import brd.v;
import com.kuaishou.android.model.feed.VideoFeed;
import java.io.File;
import java.lang.Object;
import com.kwai.video.hodor.ExportMediaCacheTask$TaskInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import q87.c;
import java.util.Objects;
import mc9.d;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kwai.video.hodor.BaseTaskInfo;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import brd.g;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import lnc.a1;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Type;
import ic9.a;
import java.lang.Float;
import java.lang.Math;

public class b implements ExportMediaCacheTask$ExportMediaCacheTaskCallback	// class@001d34
{
    public boolean a;
    public final v b;
    public final VideoFeed c;
    public final File d;
    public final c e;

    public void b(c p0,v p1,VideoFeed p2,File p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
       this.a = false;
    }
    public void onCdnReport(ExportMediaCacheTask$TaskInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SampleProcessor", "exportVideo on cdn report", objArray);
       b te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, c.class, "15")) {
          c.k(new d(p0));
       }
       return;
    }
    public void onTaskStatusChanged(ExportMediaCacheTask$TaskInfo p0){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       int taskState = p0.getTaskState();
       if (taskState) {
          ExportMediaCacheTask uExportMedia = null;
          String str = 1;
          int i = 0;
          if (taskState != str) {
             if (taskState != 2) {
                if (taskState != 3) {
                   if (taskState != 4) {
                      objArray = new Object[i];
                      a.D().w("SampleProcessor", "exportVideo task state unknown", objArray);
                   }else {
                      objArray = new Object[i];
                      a.D().w("SampleProcessor", "exportVideo paused", objArray);
                   }
                }else {
                   objArray1 = new Object[i];
                   a.D().w("SampleProcessor", "exportVideo fail, isDownloadFinished:"+this.a, objArray1);
                   if (this.a == null) {
                      this.a = str;
                      this.e.f = uExportMedia;
                      this.b.onError(new IllegalStateException("HodorTaskState_Failed"));
                   }
                }
             }else {
                objArray1 = new Object[i];
                a.D().w("SampleProcessor", "exportVideo cancel, isDownloadFinished:"+this.a, objArray1);
                if (this.a == null) {
                   this.a = str;
                   this.e.f = uExportMedia;
                }
             }
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w("SampleProcessor", "exportVideo success, isDownloadFinished:"+this.a, objArray2);
             b te = this.e;
             te.e = this.c;
             te.d = this.d;
             b.a(0x5f2ddeb4).c("source_photo_"+this.c.getId(), this.d.getAbsolutePath(), String.class, (a1.k() + TimeUnit.DAYS.toMillis(1)));
             if (this.a == null) {
                this.a = str;
                this.e.f = uExportMedia;
                Object[] objArray3 = new Object[i];
                a.D().w("SampleProcessor", "emitter.onComplete\(\) emitter:"+this.b.hashCode(), objArray3);
                this.b.onNext(Float.valueOf(a.i));
                this.b.onComplete();
             }
          }
       }else if(p0.getTotalBytes()){
          this.b.onNext(Float.valueOf(Math.min(a.j, (float)((double)p0.getProgressBytes() / (double)p0.getTotalBytes()))));
       }
       return;
    }
}
