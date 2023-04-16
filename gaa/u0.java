package gaa.u0;
import java.lang.Runnable;
import gaa.v0;
import java.lang.Object;
import gaa.w0;
import cq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.io.File;

public final class u0 implements Runnable	// class@00244e
{
    public final v0 b;

    public void u0(v0 p0){
       this.b = p0;
    }
    public final void run(){
       u0 tb = this.b;
       tb.b.l = 0x3f800000;
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePhotoDownloadDispatcher", "onCompletedBitmap mVideoDownloadSize:"+tb.b.k+",mDownloadTotalSize:"+tb.b.m+",mExportFile:"+tb.b.n, objArray);
       v0 b = tb.b;
       b.d((int)b.k, b.m, true);
       v0 b1 = tb.b;
       w0 n = b1.n;
       if (n != null) {
          b1.c(n);
       }
       return;
    }
}
