package bb0.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.lang.Integer;
import ra0.b;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@000253
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       ta.B.getLayoutParams().height = p0.getAnimatedValue().intValue();
       ta.B.requestLayout();
       Object[] objArray = new Object[0];
       b.D().s("SmartAlbumExpandAnim", "collapseToSmall:  "+p0.getAnimatedValue().intValue(), objArray);
    }
}
