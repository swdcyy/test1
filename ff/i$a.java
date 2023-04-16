package ff.i$a;
import android.view.animation.Animation$AnimationListener;
import android.view.View;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;

public class i$a implements Animation$AnimationListener	// class@001ffa
{
    public final View b;
    public boolean c;

    public void i$a(View p0){
       super();
       this.c = false;
       this.b = p0;
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       if (this.c != null) {
          this.b.setLayerType(0, null);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       if (this.b.hasOverlappingRendering() && !this.b.getLayerType()) {
          this.c = true;
          this.b.setLayerType(2, null);
       }
       return;
    }
}
