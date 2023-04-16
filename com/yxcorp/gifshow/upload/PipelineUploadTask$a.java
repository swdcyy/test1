package com.yxcorp.gifshow.upload.PipelineUploadTask$a;
import com.ks.ksuploader.KSUploaderEventListener;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import java.lang.Object;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import qq.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import com.yxcorp.gifshow.upload.j0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Double;
import java.lang.Integer;
import com.yxcorp.gifshow.upload.PipelineUploadTask$UploadStatus;
import com.yxcorp.gifshow.upload.PipelineUploadTask$b;

public class PipelineUploadTask$a implements KSUploaderEventListener	// class@001e48
{
    public final PipelineUploadTask a;

    public void PipelineUploadTask$a(PipelineUploadTask p0){
       this.a = p0;
       super();
    }
    public void onComplete(KSUploaderCloseReason p0,long p1,String p2,String p3,String p4,long p5,String p6){
       Object[] objArray;
       object oobject = p3;
       object oobject1 = p6;
       PipelineUploadTask$a uoa = PipelineUploadTask$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[]{p0,Long.valueOf(p1),p2,oobject,p4,Long.valueOf(p5),oobject1};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }else {
          int i1 = this;
       }
       objArray = new Object[i];
       a.D().w("RickonSdkLog", "onComplete:"+p0.name()+", uplaodStatus: "+p1+", stateJson: "+oobject+", errMsg: "+oobject1, objArray);
       j0 oj0 = new j0(this, p3, p0, p1, p5, p4);
       k1.o(v10);
       return;
    }
    public void onProgress(double p0,int p1){
       PipelineUploadTask$a uoa = PipelineUploadTask$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.e = PipelineUploadTask$UploadStatus.UPLOADING;
       if ((int)(p0 * 100.00f) > (int)(uoa.c * 100.00f)) {
          uoa.c = p0;
          PipelineUploadTask d = uoa.d;
          if (d != null) {
             d.onProgress(p0, p1);
          }
       }
       return;
    }
}
