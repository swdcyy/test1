package com.yxcorp.gifshow.upload.i0$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.i0;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qq.a;
import q87.c;

public final class i0$a implements Runnable	// class@001e81
{
    public PipelineUploadTask b;
    public final i0 c;

    public void i0$a(i0 p0,PipelineUploadTask p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "1")) {
          return;
       }
       if (this.b != null) {
          Object[] objArray = new Object[0];
          a.D().w("PipelineUploadManagerImpl", "cancelIfNeeded by AsyncCancelTaskRunnable", objArray);
          this.b.c();
       }
       return;
    }
}
