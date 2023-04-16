package c06.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup;
import com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout$c;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@000636
{
    public final NestedParentConstraintLayout a;

    public void a(NestedParentConstraintLayout p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       int i = p0.getAnimatedValue().intValue();
       ta.setCurrentOffset(i);
       ta.invalidate();
       NestedParentConstraintLayout e = ta.E;
       if (e != null) {
          e.a(i);
       }
       return;
    }
}
