package k02.d$a;
import java.lang.Runnable;
import k02.d;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Math;
import android.widget.FrameLayout;
import java.util.Objects;
import java.lang.Float;

public final class d$a implements Runnable	// class@002c54
{
    public final Handler b;
    public float c;
    public float d;
    public long e;
    public MotionEvent f;
    public final d g;

    public void d$a(d p0){
       this.g = p0;
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       float f = Math.min(0x3f800000, ((float)(System.currentTimeMillis() - this.e) / 600.00f));
       float f1 = (this.c - this.g.f.getX()) * f;
       float f2 = (this.d - this.g.f.getY()) * f;
       d$a tg = this.g;
       Objects.requireNonNull(tg);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f1), Float.valueOf(f2), tg, uod, "11")) {
          uod = tg.f;
          uod.setX((uod.getX() + f1));
          d f3 = tg.f;
          f3.setY((f3.getY() + f2));
       }
       if (f - (float)1 < 0) {
          this.b.post(this);
       }
       return;
    }
}
