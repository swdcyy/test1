package ff.i;
import android.view.animation.Animation;
import android.view.View;
import ff.i$a;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Transformation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class i extends Animation	// class@001ffb
{
    public final View b;
    public final float c;
    public final float d;

    public void i(View p0,float p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2 - p1;
       this.setAnimationListener(new i$a(p0));
    }
    public void applyTransformation(float p0,Transformation p1){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, i.class, "1")) {
          return;
       }
       this.b.setAlpha((this.c + (this.d * p0)));
       return;
    }
    public boolean willChangeBounds(){
       return false;
    }
}
