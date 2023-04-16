package h22.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.activityredpacket.k;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class l implements ValueAnimator$AnimatorUpdateListener	// class@002c00
{
    public final k a;

    public void l(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.a.y.getLayoutParams();
       layoutParams.height = p0.getAnimatedValue().intValue();
       this.a.y.setLayoutParams(layoutParams);
       return;
    }
}
