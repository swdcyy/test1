package j0d.b;
import yc.b;
import java.lang.Object;
import bd.d;
import bd.h;
import uc.b;
import com.facebook.imagepipeline.image.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;
import uc.c;
import vc.j;
import com.facebook.drawee.backends.pipeline.Fresco;
import gd.d;
import android.graphics.Rect;
import android.graphics.ColorSpace;
import com.facebook.common.references.a;
import android.graphics.Bitmap;
import md.a;
import bd.c;
import bd.g;

public class b implements b	// class@0019a7
{
    public final boolean a;

    public void b(boolean p0){
       super();
       this.a = p0;
    }
    public a decode(d p0,int p1,h p2,b p3){
       c obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = 1;
       if (this.a != null && (p3.g == Bitmap$Config.RGB_565 && p0.o() > uoc)) {
          obj = new c();
          obj.e(p3);
          obj.b(Bitmap$Config.ARGB_8888);
          p3 = obj.a();
       }
    label_0041 :
       a uoa = Fresco.getImagePipelineFactory().n().c(p0, p3.g, null, p3.j);
       p3 = p3.i;
       if (!PatchProxy.applyVoidTwoRefs(p3, uoa, this, uob, "2") && p3 != null) {
          Bitmap uBitmap = uoa.j();
          if (p3.a()) {
             uBitmap.setHasAlpha(uoc);
          }
          p3.b(uBitmap);
       }
       uoa.close();
       return new c(uoa, g.d, p0.l(), p0.g());
    }
}
