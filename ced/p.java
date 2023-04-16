package ced.p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import java.lang.Integer;

public class p implements ValueAnimator$AnimatorUpdateListener	// class@000574
{
    public boolean a;
    public final h b;

    public void p(h p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       if (p0.getAnimatedFraction() - 0x3dcccccd >= 0 && this.a == null) {
          this.a = true;
          p tb = this.b;
          tb.A.setText(tb.E.mGuideCollectBntText);
       }
       this.b.y.getLayoutParams().width = p0.getAnimatedValue().intValue();
       this.b.y.requestLayout();
       return;
    }
}
