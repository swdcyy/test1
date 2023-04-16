package com.yxcorp.gifshow.postwork.PostWorkManager$b;
import c26.d;
import com.yxcorp.gifshow.postwork.PostWorkManager;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.Object;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import iq.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import wkd.b;
import dnc.k1;
import com.yxcorp.gifshow.upload.UploadInfo;
import f0c.w0;
import com.yxcorp.gifshow.encode.EncodeManager;
import java.lang.Integer;
import java.util.Set;
import com.yxcorp.gifshow.postwork.o;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.r1;
import com.yxcorp.gifshow.upload.UploadRequest;
import dnc.x0;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.Float;
import java.lang.Math;

public class PostWorkManager$b implements d	// class@0010b4
{
    public float a;
    public final int b;
    public final PostWorkInfo c;
    public final PostWorkManager d;

    public void PostWorkManager$b(PostWorkManager p0,int p1,PostWorkInfo p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(EncodeInfo$Status p0,PostEncodeInfo p1){
       boolean b;
       Object[] objArray2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostWorkManager$b.class, "1")) {
          return;
       }
       if (p1.getId() == this.b) {
          Object[] objArray = new Object[0];
          a.D().w("PostWorkManager", "Encode onStatusChanged status "+p0.toString(), objArray);
          this.c.mEncodeInfo = p1;
          b.a(0x6223c5ca).a(this.c, p1);
          PostWorkInfo mUploadInfo = this.c.mUploadInfo;
          if (mUploadInfo == null || !mUploadInfo.isPipelineFailedThenFallback()) {
             PostWorkManager$b tc = this.c;
             this.d.l(tc, tc.mRequest);
          }
          b = true;
          if (p0 == EncodeInfo$Status.COMPLETE) {
             Object[] objArray1 = new Object[0];
             a.D().w("PostWorkManager", "Encode onStatusChanged status: encode complete", objArray1);
             this.d.a.C(this, this.b);
             this.d.i.add(Integer.valueOf(this.b));
             this.d.j.a(this.c);
             if (this.c.mRequest.b != null) {
                objArray1 = new Object[0];
                a.D().w("PostWorkManager", "Encode onStatusChanged status: encode complete, uploadRequest is not null", objArray1);
                PostWorkInfo mUploadInfo1 = this.c.mUploadInfo;
                if (mUploadInfo1 != null && mUploadInfo1.getStatus() == IUploadInfo$Status.FAILED) {
                   objArray1 = new Object[0];
                   a.D().w("PostWorkManager", "Encode onStatusChanged fallback count="+this.c.mUploadInfo.mFallbackCount+" id="+this.c.getUploadInfo().getId(), objArray1);
                   if (this.c.getUploadInfo().isPipelineFailedThenFallback()) {
                      this.d.b.p(this.c.getUploadInfo().getId());
                      return;
                   }else {
                      PostWorkManager$b tc1 = this.c;
                      this.d.l(tc1, tc1.mRequest);
                      return;
                   }
                }else {
                   this.c.mRequest.b.setTriggerByEncode(b);
                   this.c.mRequest.b.setEncodedFileCrc(p1.getEncodedFileCrc());
                   if (!this.d.h.n(p1, this.c.getUploadInfo())) {
                      objArray1 = new Object[0];
                      a.D().w("PostWorkManager", "encode onStatusChanged complete use normal upload addUploadTask", objArray1);
                      PostWorkManager$b tc2 = this.c;
                      this.d.c(tc2.mRequest, tc2);
                   }
                }
             }
             if (this.d.h.n(p1, this.c.getUploadInfo()) && (!p1.isTranscoded() && !p1.isSkipTranscodeInExportTask())) {
                objArray2 = new Object[0];
                a.D().w("PostWorkManager", "not transcode use whole file upload", objArray2);
                this.d.h.d(this.c);
             }
          }else if(p0 == EncodeInfo$Status.CANCELED){
             this.d.a.C(this, this.b);
             if (this.c.getUploadInfo() != null) {
                objArray2 = new Object[0];
                a.D().w("PostWorkManager", "PipelineUploadManager cancelUploadIfNeeded in encode cancle", objArray2);
                this.d.h.i(this.c.getUploadInfo().getId(), b);
             }else {
                this.d.p(this.c);
             }
             this.d.h.v(this.c.getId());
          }else if(p0 == EncodeInfo$Status.FAILED){
             this.d.a.C(this, this.b);
             this.c.setFailedProgress(this.a);
             if (this.c.getUploadInfo() != null) {
                objArray2 = new Object[0];
                a.D().w("PostWorkManager", "PipelineUploadManager cancelUploadIfNeeded in encode FAILED", objArray2);
                this.d.h.i(this.c.getUploadInfo().getId(), 0);
                this.c.getUploadInfo().setStatus(IUploadInfo$Status.FAILED);
                this.d.b.r(this.c.getUploadInfo());
             }
             this.d.h.v(this.c.getId());
             this.d.i.remove(Integer.valueOf(this.b));
          }
       }
    label_0222 :
       return;
    }
    public void b(float p0,PostEncodeInfo p1){
       PostWorkManager$b uob = PostWorkManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       if (p1.getId() == this.b) {
          uob = this.c;
          uob.mEncodeInfo = p1;
          float progress = uob.getProgress();
          if (Math.abs((this.a - progress)) - 0x3c23d70a >= 0 || !p0 - 0x3f800000) {
             Object[] objArray = new Object[0];
             a.D().w("PostWorkManager", "encode onProgressChanged progress: "+p0, objArray);
             this.a = progress;
             this.d.k(progress, this.c);
          }
       }
       return;
    }
}
