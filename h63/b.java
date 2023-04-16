package h63.b;
import android.animation.Animator$AnimatorListener;
import h63.g;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;

public class b implements Animator$AnimatorListener	// class@002c71
{
    public final int a;
    public final boolean b;
    public final g c;

    public void b(g p0,int p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c.d.setAlpha(0x3f800000);
       this.c.e.setAlpha(0x3f800000);
       this.c.b.setAlpha(0x3f800000);
       this.c.c.setVisibility(8);
       this.c.c(this.a);
       this.c.d(this.b);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
