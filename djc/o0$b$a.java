package djc.o0$b$a;
import m0d.a;
import djc.o0$b;
import brd.v;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import brd.g;
import java.lang.Throwable;

public final class o0$b$a extends a	// class@00220e
{
    public final o0$b b;
    public final v c;

    public void o0$b$a(o0$b p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o0$b$a.class, "1")) {
          return;
       }
       if (p0 != null && p0 instanceof BitmapDrawable) {
          this.c.onNext(p0.getBitmap());
       }else {
          this.c.onError(new Throwable("no bitmap"));
       }
       this.c.onComplete();
       PatchProxy.onMethodExit(o0$b$a.class, "1");
       return;
    }
}
