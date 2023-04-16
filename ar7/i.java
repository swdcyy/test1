package ar7.i;
import androidx.lifecycle.Observer;
import ar7.j;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;

public final class i implements Observer	// class@000350
{
    public final j b;

    public void i(j p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          p0 = this.b.q;
          if (p0 != null) {
             if (!p0.isRunning()) {
                p0 = null;
             }
             if (p0 != null) {
                p0.cancel();
             }
          }
       }
       return;
    }
}
