package b90.d$c;
import androidx.lifecycle.Observer;
import b90.d;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import z80.s;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class d$c implements Observer	// class@000af2
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          d$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, d.class, "10")) {
             FragmentActivity activity = tb.p.getActivity();
             if (activity != null) {
                a.o(activity, "it");
                s.d.h(p0, activity);
                tb.D(false);
             }
          }
       }
       return;
    }
}
