package gaa.r0;
import java.lang.Runnable;
import gaa.w0;
import java.io.File;
import java.lang.Object;
import cq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class r0 implements Runnable	// class@002448
{
    public final w0 b;
    public final File c;

    public void r0(w0 p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       r0 tb = this.b;
       r0 tc = this.c;
       tb.n = tc;
       w0 m = tb.m;
       float f = (float)m;
       tb.k = f;
       tb.d((int)f, m, true);
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePhotoDownloadDispatcher", "onSuccess exportFile:"+tc+",mDownloadTotalSize:"+tb.m+",mImageDownsamplingProgress:"+tb.l, objArray);
       if (tb.l - 0x3f800000 >= 0) {
          tb.c(tc);
       }
       return;
    }
}
