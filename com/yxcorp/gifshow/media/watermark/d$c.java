package com.yxcorp.gifshow.media.watermark.d$c;
import com.kwai.video.hodor.ExportMediaCacheTask$ExportMediaCacheTaskCallback;
import com.yxcorp.gifshow.media.watermark.d;
import java.io.File;
import java.lang.Object;
import com.kwai.video.hodor.ExportMediaCacheTask$TaskInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.BaseTaskInfo;
import y6b.l;
import java.lang.Runnable;
import ekd.k1;
import y6b.m;

public class d$c implements ExportMediaCacheTask$ExportMediaCacheTaskCallback	// class@001d30
{
    public final File a;
    public final d b;

    public void d$c(d p0,File p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onCdnReport(ExportMediaCacheTask$TaskInfo p0){
    }
    public void onTaskStatusChanged(ExportMediaCacheTask$TaskInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       int taskState = p0.getTaskState();
       if (taskState != 1) {
          if (taskState == 3) {
             k1.o(new l(this));
          }
       }else {
          k1.o(new m(this, this.a));
       }
       return;
    }
}
