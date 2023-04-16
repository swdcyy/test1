package com.yxcorp.gifshow.upload.j0;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.PipelineUploadTask$a;
import java.lang.String;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.Object;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import java.util.Set;
import java.util.Iterator;
import ekd.k1;
import java.io.File;
import qq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import w46.b;
import dnc.v0;
import com.yxcorp.gifshow.upload.PipelineUploadTask$UploadStatus;
import com.yxcorp.gifshow.upload.PipelineUploadTask$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Long;
import java.lang.Math;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.upload.PipelineDataException;
import java.lang.Enum;
import dnc.c1;
import t45.c;

public final class j0 implements Runnable	// class@001e85
{
    public final PipelineUploadTask$a b;
    public final String c;
    public final KSUploaderCloseReason d;
    public final long e;
    public final long f;
    public final String g;

    public void j0(PipelineUploadTask$a p0,String p1,KSUploaderCloseReason p2,long p3,long p4,String p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       long l1;
       Object[] objArray;
       PipelineUploadTask$a a;
       PipelineUploadTask d1;
       Object[] objArray2;
       j0 oj0 = this;
       j0 b = oj0.b;
       j0 c = oj0.c;
       j0 d = oj0.d;
       j0 e = oj0.e;
       j0 f = oj0.f;
       j0 g = oj0.g;
       if (!b.a.b.isEmpty()) {
          Iterator iterator = b.a.b.iterator();
          try{
             long l = k1.i();
             l1 = new File(iterator.next()).length();
             try{
                objArray = new Object[0];
                a.D().w("PipelineUploadTask", "onComplete: file length operation duration: "+k1.t(l), objArray);
             }catch(java.lang.SecurityException e0){
             }
             objArray = new Object[0];
             a.D().u("PipelineUploadTask", e0, objArray);
          }catch(java.lang.SecurityException e0){
             l1 = 0;
             goto label_005a ;
          }
       }else {
          l1 = 0;
       }
       v0 ov0 = new v0(c, d.value(), e);
       if (d == KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser) {
          a = b.a;
          a.e = PipelineUploadTask$UploadStatus.CANCEL;
          d1 = a.d;
          if (d1 != null) {
             d1.a(ov0);
          }
       }else if(d == KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded){
          a = b.a;
          a.e = PipelineUploadTask$UploadStatus.SUCCESS;
          if (!PatchProxy.applyVoid(null, a, PipelineUploadTask.class, "2")) {
             if (a.k - null <= 0 || a.j.size() <= 0) {
                objArray2 = new Object[0];
                a.D().w("PipelineUploadTask", "reportWrongDuration\(\) mTotalDuration is 0 mTaskId="+a.f, objArray2);
             }else {
                long l2 = 0;
                for (int i = 0; i < a.j.size(); i = i + 1) {
                   l2 = l2 + a.j.get(i).longValue();
                }
                objArray = new Object[0];
                a.D().w("PipelineUploadTask", "reportWrongDuration\(\) hasUploadDuration = "+l2+", mTotalDuration = "+a.k, objArray);
                long l3 = l2 - a.k;
                if (Math.abs(l3) - 1000 > 0) {
                   PostUtils.D("PipelineUploadTask", "reportWrongDuration\(\)", new IllegalStateException("reportWrongDuration\(\) mTotalDuration="+a.k+" hasUploadDuration="+l2+" mTaskId="+a.f));
                }else {
                   objArray2 = new Object[0];
                   a.D().w("PipelineUploadTask", "reportWrongDuration\(\) check is ok d="+l3, objArray2);
                }
             }
          }
          String str = null;
          if (l1 - str && l1 - f) {
             PipelineDataException pipelineData = new PipelineDataException("wrong data origin fileSize: "+l1+", uploaded fileSize: "+f);
             PostUtils.D("PipelineUploadTask", "onComplete", pipelineData);
             a = b.a;
             a.e = PipelineUploadTask$UploadStatus.FAIL;
             d1 = a.d;
             if (d1 != null) {
                d1.c(ov0, pipelineData);
             }
          }else if(b.a.d != null){
             Object[] objArray1 = new Object[0];
             a.D().w("PipelineUploadTask", "onComplete success", objArray1);
             b.a.d.b(ov0, g);
          }
       }else {
          a = b.a;
          a.e = PipelineUploadTask$UploadStatus.FAIL;
          d1 = a.d;
          if (d1 != null) {
             d1.c(ov0, new IllegalStateException(d.name()));
          }
       }
       c.a(new c1(b));
       return;
    }
}
