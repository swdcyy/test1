package djc.o0$b;
import io.reactivex.g;
import android.view.View;
import djc.o0;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import djc.m0;
import java.lang.CharSequence;
import com.yxcorp.image.request.a;
import s0d.e;
import djc.o0$b$a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import brd.g;
import java.lang.Throwable;

public final class o0$b implements g	// class@00220f
{
    public final View b;
    public final o0 c;

    public void o0$b(View p0,o0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o0$b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       o0$b uob = (!this.c.b.d().length())? 1: null;
       if (uob) {
          a.d(a.u(this.c.b.b).q(), new o0$b$a(this, p0));
       }else {
          Bitmap uBitmap = BitmapUtil.c(this.c.b.d());
          if (uBitmap != null) {
             p0.onNext(uBitmap);
          }else {
             p0.onError(new Throwable("no bitmap"));
          }
          p0.onComplete();
       }
       PatchProxy.onMethodExit(o0$b.class, "1");
       return;
    }
}
