package ey2.c;
import android.animation.AnimatorListenerAdapter;
import ey2.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class c extends AnimatorListenerAdapter	// class@002812
{
    public final KwaiImageView a;
    public final d b;

    public void c(d p0,KwaiImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(4);
       this.a.setAlpha(0x3f800000);
       return;
    }
}
