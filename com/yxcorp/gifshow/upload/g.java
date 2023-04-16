package com.yxcorp.gifshow.upload.g;
import f36.b;
import java.lang.Object;
import wkd.b;
import gnc.b;
import ojd.f;
import brd.t;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.PipelineUploadTask;

public class g implements b	// class@001e7d
{
    public final b a;
    public PipelineUploadTask b;
    public f c;

    public void g(){
       super();
       this.a = b.a(-1142264700);
    }
    public t a(Object p0,f p1){
       return null;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       g tb = this.b;
       if (tb != null) {
          tb.c();
       }
       return;
    }
}
