package id.f$a;
import id.k;
import id.i;
import java.lang.Object;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.image.a;
import bd.c;
import android.graphics.Bitmap;

public class f$a extends k	// class@0021a3
{
    public final int c;
    public final int d;

    public void f$a(i p0,int p1,int p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void i(Object p0,int p1){
       if (p0 != null && p0.k()) {
          a uoa = p0.j();
          if (!uoa.isClosed() && uoa instanceof c) {
             Bitmap uBitmap = uoa.g();
             if (uBitmap != null) {
                int i = uBitmap.getRowBytes() * uBitmap.getHeight();
                if (i >= this.c && i <= this.d) {
                   uBitmap.prepareToDraw();
                }
             }
          }
       }
       this.n().d(p0, p1);
       return;
    }
}
