package jt1.e;
import androidx.lifecycle.Observer;
import jt1.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;

public final class e implements Observer	// class@002c08
{
    public final i b;

    public void e(i p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       p0 = this.b.a.getLayoutParams();
       if (p0 instanceof ConstraintLayout$LayoutParams) {
          p0.d = -1;
          p0.f = 0x7f0a21cf;
       }
       return;
    }
}
