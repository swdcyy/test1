package jo1.b;
import android.animation.AnimatorListenerAdapter;
import jo1.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;
import z1.f;

public class b extends AnimatorListenerAdapter	// class@002bdc
{
    public final KwaiImageView a;
    public final a b;

    public void b(a p0,KwaiImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       b ta = this.a;
       try{
          n.Q(ta);
          this.b.b.a(this.a);
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.bringToFront();
       this.a.setVisibility(0);
       return;
    }
}
