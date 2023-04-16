package ni0.d;
import java.lang.Runnable;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.kuaishou.krn.apm.wsd.WhiteScreenDetector;
import kotlin.jvm.internal.a;
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
import ek0.d;

public final class d implements Runnable	// class@003323
{
    public final boolean b;
    public final String c;
    public final Bitmap d;

    public void d(boolean p0,String p1,Bitmap p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       String g = WhiteScreenDetector.g;
       if (g == null) {
          a.S("mBaseDir");
       }
       File uFile = new File(g, "kdswsd");
       uFile.mkdirs();
       g = (this.b != null)? this.c+"-1.wsd": this.c+"-0.wsd";
       File uFile1 = new File(uFile, g);
       BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(uFile1));
       this.d.compress(Bitmap$CompressFormat.JPEG, 10, uBufferedOut);
       uBufferedOut.flush();
       b.a(uBufferedOut, null);
       d.e("WhiteScreenDetector saveBitmapToFile: "+uFile1.getName()+" cost: "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
       return;
    }
}
