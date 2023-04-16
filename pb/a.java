package pb.a;
import zc.a;
import android.content.res.Resources;
import java.lang.Object;
import com.facebook.imagepipeline.image.a;
import android.graphics.drawable.Drawable;
import kd.b;
import java.lang.String;
import bd.c;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import xb.l;

public class a implements a	// class@002905
{
    public final Resources a;
    public final a b;

    public void a(Resources p0,a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Drawable a(a p0){
       if (b.d()) {
          b.a("DefaultDrawableFactory#createDrawable");
       }
       if (p0 instanceof c) {
          BitmapDrawable uBitmapDrawa = new BitmapDrawable(this.a, p0.g());
          int i = 1;
          int i1 = (p0.p() && p0.p() != -1)? 1: 0;
          if (!i1) {
             if (p0.o() == i || !p0.o()) {
                i = 0;
             }
             if (!i) {
                if (b.d()) {
                   b.b();
                }
                return uBitmapDrawa;
             }
          }
          l ol = new l(uBitmapDrawa, p0.p(), p0.o());
          if (b.d()) {
             b.b();
          }
          return ol;
       }else {
          a tb = this.b;
          if (tb != null && tb.b(p0)) {
             Drawable uDrawable = this.b.a(p0);
             if (b.d()) {
                b.b();
             }
             return uDrawable;
          }else if(b.d()){
             b.b();
          }
          return null;
       }
    }
    public boolean b(a p0){
       return true;
    }
}
