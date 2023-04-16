package gb1.f0;
import eb1.a;
import gb1.h0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import android.app.Activity;
import bb1.b;
import d61.y;

public final class f0 implements a	// class@00245a
{
    public final h0 a;

    public void f0(h0 p0){
       this.a = p0;
    }
    public final void run(){
       f0 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, h0.class, "3")) {
       }else {
          Activity activity = ta.b.getActivity();
          if (y.d(activity)) {
             activity.setRequestedOrientation(1);
             ta.j(1);
          }else {
             ta.j(false);
          }
       }
       return;
    }
}
