package com.yxcorp.gifshow.upload.AggregatedUploader;
import f36.b;
import java.lang.Object;
import com.google.gson.Gson;
import ojd.f;
import brd.t;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.upload.a;
import erd.o;
import com.yxcorp.gifshow.upload.b;
import dnc.a;
import com.yxcorp.gifshow.upload.AggregatedUploader$CrcResult;
import com.yxcorp.gifshow.util.PostUtils;

public final class AggregatedUploader implements b	// class@001e3c
{
    public final b a;
    public final b b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Gson f;

    public void AggregatedUploader(b p0,b p1,boolean p2,boolean p3,boolean p4){
       super();
       this.f = new Gson();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
       this.c = p4;
    }
    public t a(Object p0,f p1){
       t ot = PatchProxy.applyTwoRefs(p0, p1, this, AggregatedUploader.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          AggregatedUploader te = this.e;
          p0.mSegmentUploadEnabled = te;
          AggregatedUploader tc = this.c;
          p0.mSegmentUploadFirst = tc;
          if (this.d == null) {
             ot = this.b.a(p0, p1);
          }else if(te == null){
             ot = this.a.a(p0, p1);
          }else if(tc != null){
             ot = this.b.a(p0, p1).onErrorResumeNext(new a(this, p0, p1));
          }else {
             ot = this.a.a(p0, p1).onErrorResumeNext(new b(this, p0, p1));
          }
       }
       return ot;
    }
    public void b(UploadInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AggregatedUploader.class, "2")) {
          return;
       }
       AggregatedUploader$CrcResult uCrcResult = new AggregatedUploader$CrcResult(this);
       uCrcResult.mEncodeFileCrc = p0.getEncodedFileCrc();
       uCrcResult.mUploadFileCrc = p0.getUploadFileCrc();
       uCrcResult.mCompletedCrc = String.valueOf(a.a(p0.getFilePath()));
       PostUtils.x(p1, this.f.q(uCrcResult));
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, AggregatedUploader.class, "3")) {
          return;
       }
       this.a.cancel();
       this.b.cancel();
       return;
    }
}
