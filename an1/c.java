package an1.c;
import z1.a;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.f;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.widget.ProgressBar;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public final class c implements a	// class@0000e6
{
    public final f a;

    public void c(f p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       c ta = this.a;
       int i = p0.intValue();
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ta, uof, "3")) {
          ta.h();
          uof = ta.b;
          int[] ointArray = new int[]{uof.getProgress(),i};
          i = ObjectAnimator.ofInt(uof, f.e, ointArray);
          i = i.setDuration(500);
          ta.d = i;
          i.setInterpolator(new LinearInterpolator());
          ta.d.start();
       }
       return;
    }
}
