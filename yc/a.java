package yc.a;
import yc.b;
import gd.d;
import java.util.Map;
import java.lang.Object;
import yc.a$a;
import bd.d;
import uc.b;
import bd.c;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import android.graphics.ColorSpace;
import com.facebook.common.references.a;
import md.a;
import bd.g;
import bd.h;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.a;
import com.facebook.imageformat.a;
import java.io.InputStream;
import com.facebook.imageformat.b;

public class a implements b	// class@002880
{
    public final b a;
    public final b b;
    public final d c;
    public final b d;
    public final Map e;

    public void a(b p0,b p1,d p2,Map p3){
       super();
       this.d = new a$a(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
    }
    public c a(d p0,b p1){
       a uoa = this.c.c(p0, p1.g, null, p1.j);
       this.b(p1.i, uoa);
       uoa.close();
       return new c(uoa, g.d, p0.l(), p0.g());
    }
    public final void b(a p0,a p1){
       if (p0 == null) {
          return;
       }
       Bitmap uBitmap = p1.j();
       if (p0.a()) {
          uBitmap.setHasAlpha(true);
       }
       p0.b(uBitmap);
       return;
    }
    public a decode(d p0,int p1,h p2,b p3){
       b h = p3.h;
       if (h != null) {
          return h.decode(p0, p1, p2, p3);
       }
       a uoa = p0.j();
       if (uoa == null || uoa == a.c) {
          uoa = b.c(p0.k());
          p0.A(uoa);
       }
       a te = this.e;
       if (te != null) {
          h = te.get(uoa);
          if (h != null) {
             return h.decode(p0, p1, p2, p3);
          }
       }
       return this.d.decode(p0, p1, p2, p3);
    }
}
