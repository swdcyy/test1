package yc.a$a;
import yc.b;
import yc.a;
import java.lang.Object;
import bd.d;
import bd.h;
import uc.b;
import com.facebook.imagepipeline.image.a;
import com.facebook.imageformat.a;
import nc.a;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import android.graphics.ColorSpace;
import com.facebook.common.references.a;
import gd.d;
import md.a;
import bd.c;
import java.util.Objects;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.lang.String;

public class a$a implements b	// class@00287f
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public a decode(d p0,int p1,h p2,b p3){
       a$a ta;
       a a;
       a uoa2;
       a uoa = p0.j();
       if (uoa == a.a) {
          ta = this.a;
          a uoa1 = ta.c.a(p0, p3.g, null, p1, p3.j);
          ta.b(p3.i, uoa1);
          uoa1.close();
          return new c(uoa1, p2, p0.l(), p0.g());
       }else if(uoa == a.c){
          ta = this.a;
          Objects.requireNonNull(ta);
          if (p0.getWidth() == -1 || p0.getHeight() == -1) {
             throw new DecodeException("image width or height is incorrect", p0);
          }
          if (p3.f == null) {
             a = ta.a;
             if (a != null) {
                uoa2 = a.decode(p0, p1, p2, p3);
             label_0059 :
                return uoa2;
             }
          }
          uoa2 = ta.a(p0, p3);
          goto label_0059 ;
       }else if(uoa == a.j){
          return this.a.b.decode(p0, p1, p2, p3);
       }else if(uoa != a.c){
          return this.a.a(p0, p3);
       }else {
          throw new DecodeException("unknown image format", p0);
       }
    }
}
