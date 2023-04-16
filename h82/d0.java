package h82.d0;
import android.animation.AnimatorListenerAdapter;
import h82.k0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

public class d0 extends AnimatorListenerAdapter	// class@002ccb
{
    public final k0 a;

    public void d0(k0 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "2")) {
          return;
       }
       this.a.i.setVisibility(8);
       this.a.i.t();
       this.a.e.setVisibility(0);
       d0 ta = this.a;
       if (ta.o != null) {
          ta.e.setImageResource(R.drawable.arg_RES_7f0814ac);
       }else {
          ta.e.setImageResource(R.drawable.arg_RES_7f08132f);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       this.a.e.setVisibility(8);
       this.a.i.setVisibility(0);
       return;
    }
}
