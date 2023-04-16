package com.yxcorp.gifshow.upload.n0;
import com.yxcorp.gifshow.upload.PipelineUploadTask$b;
import com.yxcorp.gifshow.upload.o0;
import brd.v;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.Object;
import dnc.v0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.upload.o1;
import android.util.Pair;
import brd.g;
import java.lang.Throwable;
import qq.a;
import w46.b;
import java.lang.Double;
import java.lang.Integer;
import dnc.j1;
import java.lang.Runnable;
import ekd.k1;

public class n0 implements PipelineUploadTask$b	// class@001e91
{
    public final v a;
    public final PostWorkInfo b;
    public final o0 c;

    public void n0(o0 p0,v p1,PostWorkInfo p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(v0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "4")) {
          return;
       }
       PostLogger postLogger = new PostLogger().c("PipelineUploader");
       postLogger.k(this.c.f.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.c.f.getId()).j(PostLogger$Status.CANCEL).g("PipelineUploadTask").d();
       this.c.f.setPipelineStatsParams(p0);
       this.c.f.setDisableFd(true);
       n0 tc = this.c;
       tc.c.o(tc.g, tc.f);
       return;
    }
    public void b(v0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n0.class, "1")) {
          return;
       }
       PostLogger postLogger = new PostLogger().c("PipelineUploader");
       postLogger.k(this.c.f.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.c.f.getId()).j(PostLogger$Status.FINISH).g("PipelineUploadTask").d();
       this.c.f.setPipelineStatsParams(p0);
       this.c.f.setPipelineKey(p1);
       this.c.f.setDisableFd(true);
       n0 tc = this.c;
       tc.c.q(tc.g, tc.f);
       this.a.onNext(new Pair(p1, this.c.f));
       return;
    }
    public void c(v0 p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n0.class, "2")) {
          return;
       }
       PostLogger postLogger = new PostLogger().b("PipelineUploader");
       postLogger.k(this.c.f.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.c.f.getId()).j(PostLogger$Status.ERROR).g("PipelineUploadTask error: ").l(p1).d();
       this.c.f.setPipelineStatsParams(p0);
       this.c.f.setDisableFd(true);
       this.b.setUploadInfo(this.c.f);
       n0 tc = this.c;
       tc.c.p(tc.g, tc.f, p1);
       a.D().e("PipelineUploader", "cancel cancelUploadIfNeeded onFail", p1);
       if (!this.a.isDisposed()) {
          this.a.onError(p1);
       }
       return;
    }
    public void onProgress(double p0,int p1){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), this, on0, "3")) {
          return;
       }
       k1.o(new j1(this, p0, p1));
       return;
    }
}
