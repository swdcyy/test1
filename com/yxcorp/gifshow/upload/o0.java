package com.yxcorp.gifshow.upload.o0;
import f36.b;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Object;
import wkd.b;
import dnc.x0;
import gnc.b;
import ojd.f;
import brd.t;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qq.a;
import q87.c;
import java.lang.System;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import jnc.c;
import java.lang.StringBuilder;
import java.io.File;
import dnc.g1;
import erd.o;
import dnc.h1;
import com.yxcorp.gifshow.upload.k0;
import com.yxcorp.gifshow.postwork.a;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.postwork.e;
import com.yxcorp.gifshow.upload.b2;
import com.yxcorp.gifshow.upload.l0;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import dnc.d1;
import io.reactivex.g;

public class o0 implements b	// class@001e94
{
    public final x0 a;
    public final b b;
    public final o1 c;
    public PipelineUploadTask d;
    public f e;
    public UploadInfo f;
    public long g;
    public static final z h;

    static {
       o0.h = b.b(c.e("rickon-upload-thread", 4));
    }
    public void o0(o1 p0){
       super();
       this.a = b.a(-2001546430);
       this.b = b.a(-1142264700);
       this.c = p0;
    }
    public t a(Object p0,f p1){
       Object[] objArray2;
       t ot1;
       t ot = PatchProxy.applyTwoRefs(p0, p1, this, o0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("PipelineUploader", "upload called", objArray);
          this.e = p1;
          this.f = p0;
          this.g = System.currentTimeMillis();
          if (!TextUtils.x(this.f.getPipelineKey())) {
             Object[] objArray1 = new Object[i];
             a.D().w("PipelineUploader", "upload, file key is not empty", objArray1);
             if (c.i(this.f)) {
                objArray2 = new Object[i];
                a.D().w("PipelineUploader", "upload need upload cover: "+this.f.getCoverFile(), objArray2);
                ot = c.j(this.f, this.c).flatMap(new g1(this));
             }else {
                objArray1 = new Object[i];
                a.D().w("PipelineUploader", "file key is not empty, publish", objArray1);
                ot = this.c(this.f.getPipelineKey());
             }
          }else {
             objArray2 = new Object[i];
             a.D().w("PipelineUploader", "upload, file key is empty, need fetch again", objArray2);
             if (c.i(this.f)) {
                Object[] objArray3 = new Object[i];
                a.D().w("PipelineUploader", "upload, upload cover: "+this.f.getCoverFile(), objArray3);
                ot1 = c.j(this.f, this.c).flatMap(new h1(this));
             }else {
                ot1 = this.d().subscribeOn(o0.h);
             }
             ot = ot1.flatMap(new k0(this, p0));
          }
       }
       return ot;
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, o0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-273232199).a20();
    }
    public final t c(String p0){
       PostLogger obj = PatchProxy.applyOneRefs(p0, this, o0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploader", "pipelinePublish fileKey", objArray);
       obj = new PostLogger().c("PipelineUploader");
       obj.k(this.f.getSessionId());
       obj.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(this.f.getId()).j(PostLogger$Status.BEGIN).g("pipelinePublish fileKey: "+p0).d();
       e.a().d(e.c(this.f), "start_publish_task");
       return b2.c(this.f).flatMap(new l0(this, p0));
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, o0.class, "3")) {
          return;
       }
       if (this.d != null) {
          Object[] objArray = new Object[0];
          a.D().w("PipelineUploader", "cancelIfNeeded by cancel", objArray);
          this.d.c();
       }
       return;
    }
    public final t d(){
       PostLogger obj = PatchProxy.apply(null, this, o0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploader", "startPipelineUpload", objArray);
       obj = new PostLogger().c("PipelineUploader");
       obj.k(this.f.getSessionId());
       obj.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.f.getId()).j(PostLogger$Status.BEGIN).g("startPipelineUpload").d();
       this.g = System.currentTimeMillis();
       return t.create(new d1(this));
    }
}
