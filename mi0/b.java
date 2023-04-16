package mi0.b;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$b;
import mi0.b$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ek0.d;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.System;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;

public final class b implements ViewCaptureUIBlock$b	// class@003182
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public static final b$a e;

    static {
       b.e = new b$a(null);
    }
    public void b(String p0,String p1,int p2,int p3){
       a.p(p0, "saveDir");
       a.p(p1, "pageId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0 == null) {
          d.i("ScreenCaptureToolbox#ViewCaptureListener onViewShotFinished: captureView return null");
          return;
       }else {
          File uFile = new File(this.a, this.b);
          uFile.mkdirs();
          File uFile1 = new File(uFile, this.c+".jpg");
          BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(uFile1));
          p0.compress(Bitmap$CompressFormat.JPEG, this.d, uBufferedOut);
          uBufferedOut.flush();
          b.a(uBufferedOut, null);
          d.e("ScreenCaptureToolbox#ViewCaptureListener onViewShotFinished: saveToFile "+uFile1.getName()+" cost="+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
          return;
       }
    }
}
