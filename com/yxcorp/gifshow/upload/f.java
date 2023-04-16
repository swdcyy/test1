package com.yxcorp.gifshow.upload.f;
import com.yxcorp.gifshow.upload.PipelineUploadTask$b;
import com.yxcorp.gifshow.upload.g;
import com.yxcorp.gifshow.upload.UploadInfo;
import brd.v;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.Object;
import dnc.v0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.StringBuilder;
import android.util.Pair;
import brd.g;
import java.lang.Throwable;
import java.lang.Double;
import java.lang.Integer;
import dnc.i;
import java.lang.Runnable;
import ekd.k1;

public class f implements PipelineUploadTask$b	// class@001e7a
{
    public final UploadInfo a;
    public final v b;
    public final PostWorkInfo c;
    public final g d;

    public void f(g p0,UploadInfo p1,v p2,PostWorkInfo p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(v0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       PostLogger postLogger = new PostLogger().c("CloudVideoUploader");
       postLogger.k(this.a.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.a.getId()).j(PostLogger$Status.CANCEL).d();
       this.a.setPipelineStatsParams(p0);
       return;
    }
    public void b(v0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       PostLogger postLogger = new PostLogger().c("CloudVideoUploader");
       postLogger.k(this.a.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.a.getId()).j(PostLogger$Status.FINISH).g("PipelineUpload fileKey: "+p1).d();
       this.a.setPipelineStatsParams(p0);
       this.b.onNext(new Pair(p1, this.a));
       this.b.onComplete();
       return;
    }
    public void c(v0 p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       PostLogger postLogger = new PostLogger().b("CloudVideoUploader");
       postLogger.k(this.a.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.a.getId()).j(PostLogger$Status.ERROR).g("PipelineUpload onFail: ").l(p1).d();
       this.a.setPipelineStatsParams(p0);
       this.c.setUploadInfo(this.a);
       this.b.onError(p1);
       return;
    }
    public void onProgress(double p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), this, uof, "3")) {
          return;
       }
       i oi = new i(this, this.a, p0, p1);
       k1.o(uof);
       return;
    }
}
