package ic.e;
import zc.a;
import qc.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;
import hb.b;
import sc.d;
import tc.l;
import ab.h;
import java.lang.Object;
import com.facebook.imagepipeline.image.a;
import android.graphics.drawable.Drawable;
import hc.a;
import bd.a;
import oc.d;
import oc.b;
import android.graphics.Rect;
import oc.a;
import java.lang.Integer;
import fc.d;
import fc.c;
import fc.b;
import qc.c;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer;
import ec.a;
import gc.c;
import com.facebook.fresco.animation.bitmap.preparation.DefaultBitmapFramePreparer;
import android.graphics.Bitmap$Config;
import ec.b;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendAnimationInformation;
import dc.d;
import gc.a;
import gc.b;
import dc.a;
import dc.b;
import dc.c;
import fc.a;
import com.facebook.cache.common.CacheKey;

public class e implements a	// class@0017cc
{
    public final b a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final b d;
    public final d e;
    public final l f;
    public final h g;
    public final h h;

    public void e(b p0,ScheduledExecutorService p1,ExecutorService p2,b p3,d p4,l p5,h p6,h p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public Drawable a(a p0){
       DefaultBitmapFramePreparer uDefaultBitm;
       c uoc1;
       b uob1;
       d uod = p0.j();
       b uob = uod.c();
       boolean width = uob.getWidth();
       int i = 0;
       a uoa = this.a.a(uod, new Rect(i, i, width, uob.getHeight()));
       int i1 = this.g.get().intValue();
       width = true;
       if (i1 != width) {
          if (i1 != 2) {
             uod = (i1 != 3)? new d(): new c();
          }else {
             uob1 = new b(this.c(uod), i);
          label_0054 :
             c uoc2 = uob1;
          }
       }else {
          uob1 = new b(this.c(uod), width);
          goto label_0054 ;
       }
       d uod1 = uod;
       AnimatedDrawableBackendFrameRenderer uAnimatedDra = new AnimatedDrawableBackendFrameRenderer(uod1, uoa);
       int i2 = this.h.get().intValue();
       c uoc = null;
       if (i2 > 0) {
          uDefaultBitm = new DefaultBitmapFramePreparer(this.e, uAnimatedDra, Bitmap$Config.ARGB_8888, this.c);
          uoc1 = new c(i2);
       }else {
          uoc1 = uoc;
          uDefaultBitm = uoc1;
       }
       BitmapAnimationBackend uBitmapAnima = new BitmapAnimationBackend(this.e, uod1, new AnimatedDrawableBackendAnimationInformation(uoa), uAnimatedDra, uoc1, uDefaultBitm);
       return new a(c.b(new DefaultBitmapFramePreparer(this.e, uAnimatedDra, Bitmap$Config.ARGB_8888, this.c), this.d, this.b));
    }
    public boolean b(a p0){
       return p0 instanceof a;
    }
    public final c c(d p0){
       return new c(new a(p0.hashCode()), this.f);
    }
}
