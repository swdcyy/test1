package dlc.n0;
import erd.g;
import dlc.o0;
import java.lang.Object;
import d0a.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class n0 implements g	// class@00225d
{
    public final o0 b;

    public void n0(o0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       o0 oo0 = o0.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oo0, "7")) {
       }else if(p0.a == null){
          tb.P8();
       }
       o0 p = tb.p;
       p0 = p0.a;
       if (!PatchProxy.isSupport(oo0) || !PatchProxy.applyVoidTwoRefs(p, Boolean.valueOf(p0), tb, oo0, "8")) {
          int i = 0;
          int i1 = (p0 != null)? 0x3f800000: 0;
          if (p0 == null) {
             i = 0x3f800000;
          }
          float[] uofloatArray = new float[]{i1,i};
          p0 = ObjectAnimator.ofFloat(p, View.ALPHA, uofloatArray);
          p0.setDuration(300);
          p0.start();
       }
       return;
    }
}
