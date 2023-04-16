package g72.k;
import android.animation.AnimatorListenerAdapter;
import g72.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class k extends AnimatorListenerAdapter	// class@002a89
{
    public final KwaiImageView a;
    public final j b;

    public void k(j p0,KwaiImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(4);
       this.a.setAlpha(0x3f800000);
       return;
    }
}
