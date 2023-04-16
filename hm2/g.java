package hm2.g;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.wealthgrade.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class g extends AnimatorListenerAdapter	// class@002dd3
{
    public final KwaiImageView a;
    public final b b;

    public void g(b p0,KwaiImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(4);
       this.a.setAlpha(0x3f800000);
       return;
    }
}
