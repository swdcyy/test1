package com.yxcorp.gifshow.upload.SegmentUploader;
import f36.b;
import com.yxcorp.gifshow.retrofit.service.KwaiSegmentUploadService;
import com.yxcorp.gifshow.retrofit.service.KwaiUploadPublishService;
import com.kwai.feature.post.api.feature.upload.interfaces.a;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Object;
import wkd.b;
import gnc.b;
import java.util.ArrayList;
import ojd.f;
import brd.t;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.System;
import java.io.File;
import dnc.a;
import com.yxcorp.gifshow.upload.i1;
import erd.g;
import cjd.a;
import com.yxcorp.gifshow.upload.j1;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.upload.h1;
import com.yxcorp.gifshow.upload.g1;
import dnc.x1;
import com.yxcorp.gifshow.upload.w0;

public class SegmentUploader implements b	// class@001e52
{
    public final KwaiSegmentUploadService a;
    public final KwaiUploadPublishService b;
    public final b c;
    public a d;
    public o1 e;
    public boolean f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public final List k;
    public boolean[] l;
    public float m;
    public long n;

    public void SegmentUploader(KwaiSegmentUploadService p0,KwaiUploadPublishService p1,a p2,o1 p3){
       super();
       this.c = b.a(-1142264700);
       this.l = null;
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
       this.k = new ArrayList();
    }
    public t a(Object p0,f p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SegmentUploader segmentUploa = SegmentUploader.class;
       t ot = PatchProxy.applyTwoRefs(p0, p1, this, segmentUploa, "1");
       if (ot != patchProxyRe) {
       }else {
          int b = true;
          p0.mSegmentedUpload = b;
          p0.mSegmentUploadTryCount = p0.mSegmentUploadTryCount + b;
          String str = "SegmentUploader";
          PostLogger postLogger = new PostLogger().c(str);
          postLogger.k(p0.getSessionId());
          postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(p0.getId()).j(PostLogger$Status.BEGIN).g(str).d();
          t ot1 = PatchProxy.applyOneRefs(p0, this, segmentUploa, "2");
          if (ot1 != patchProxyRe) {
          }else {
             this.n = System.currentTimeMillis();
             this.f = b;
             long l = System.currentTimeMillis();
             b = (int)new File(p0.getFilePath()).length();
             long l1 = a.a(p0.getFilePath());
             p0.setUploadFileCrc(String.valueOf(l1));
             long l2 = System.currentTimeMillis() - l;
             t ot2 = this.c.e((long)b, l1);
             long l3 = this;
             i1 oi1 = new i1(l3, p0, l, l2);
             j1 oj1 = new j1(l3, l2, p0, l);
             ot1 = ot2.doOnError(a.a(v12)).doOnNext(a.a(v12)).map(new e()).doOnNext(new h1(this, b, p0)).flatMap(new g1(this, b, p0));
          }
          ot = ot1.doOnError(new x1(p0)).flatMap(new w0(this, p0));
       }
       return ot;
    }
    public void cancel(){
       this.j = true;
    }
}
