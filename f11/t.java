package f11.t;
import vq5.b;
import f11.w;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import va1.n0;
import android.view.MotionEvent;

public final class t implements b	// class@002283
{
    public final w a;

    public void t(w p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       t ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, w.class, "5")) {
       }else {
          ta.P8(MotionEvent.obtain(0, 0, 0, ((float)n0.f() * ta.R8(p0, "animatePointX", 0x3f3d70a4)), (((float)n0.e() * ta.R8(p0, "animatePointY", 0x3f251eb8)) + ((float)n0.e() * 0.08f)), 0), p0.getBooleanQueryParameter("animated", false));
       }
       return;
    }
}
