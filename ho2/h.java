package ho2.h;
import zc.a;
import java.lang.Object;
import com.facebook.imagepipeline.image.a;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bd.a;
import hc.a;
import oc.d;
import dc.a;
import oc.b;
import qc.a;
import rc.a;
import android.graphics.Rect;
import fc.b;
import qc.c;
import fc.a;
import vc.j;
import tc.l;
import com.facebook.cache.common.CacheKey;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer;
import ec.a;
import oc.a;
import com.facebook.fresco.animation.bitmap.preparation.DefaultBitmapFramePreparer;
import sc.d;
import android.graphics.Bitmap$Config;
import ya.c;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import ec.b;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendAnimationInformation;
import gc.c;
import dc.d;
import gc.a;
import gc.b;
import com.facebook.common.time.RealtimeSinceBootClock;
import ya.i;
import hb.b;
import java.util.concurrent.ScheduledExecutorService;
import dc.b;
import dc.c;
import java.lang.Boolean;

public final class h implements a	// class@002de4
{

    public void h(){
       super();
    }
    public Drawable a(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, oh, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "image");
       d uod = p0.j();
       a.o(uod, "closeable.imageResult");
       b uob = PatchProxy.applyOneRefs(uod, this, oh, "3");
       if (uob != patchProxyRe) {
       }else {
          b uob1 = uod.c();
          a.o(uob1, "animatedImage");
          int width = uob1.getWidth();
          a uoa = new a(new a(), uod, new Rect(0, 0, width, uob1.getHeight()), 0);
          j oj = j.j();
          a.o(oj, "ImagePipelineFactory.getInstance\(\)");
          b uob2 = new b(new c(new a(uod.hashCode()), oj.d()), true);
          AnimatedDrawableBackendFrameRenderer uAnimatedDra = new AnimatedDrawableBackendFrameRenderer(uob2, uoa);
          oj = j.j();
          a.o(oj, "ImagePipelineFactory.getInstance\(\)");
          j oj1 = j.j();
          a.o(oj1, "ImagePipelineFactory.getInstance\(\)");
          d uod1 = oj1.m();
          BitmapAnimationBackend uBitmapAnima = new BitmapAnimationBackend(uod1, uob2, new AnimatedDrawableBackendAnimationInformation(uoa), uAnimatedDra, new c(3), new DefaultBitmapFramePreparer(oj.m(), uAnimatedDra, Bitmap$Config.ARGB_8888, new c(c.d())));
          uob = c.b(oj.m(), RealtimeSinceBootClock.get(), i.d());
          a.o(uob, "AnimationBackendDelegate¡­e.getInstance\(\)\n        \)");
       }
       return new a(uob);
    }
    public boolean b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "image");
       return p0 instanceof a;
    }
}
