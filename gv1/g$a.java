package gv1.g$a;
import androidx.lifecycle.Observer;
import gv1.g;
import java.lang.Object;
import ls5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class g$a implements Observer	// class@002591
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
       }else {
          View view = this.b.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          view.removeAllViews();
          p0 = p0.b(view);
          ViewParent parent = p0.getParent();
          if (!parent instanceof ViewGroup) {
             parent = null;
          }
          if (parent != null) {
             parent.removeView(p0);
          }
          p0.setAlpha(0x3f800000);
          p0.setScaleX(0x3f800000);
          p0.setScaleY(0x3f800000);
          p0.setVisibility(0);
          view.addView(p0);
       }
       return;
    }
}
