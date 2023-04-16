package ec2.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.luckystar.openresult.f;
import java.lang.Object;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class i implements ValueAnimator$AnimatorUpdateListener	// class@0026e7
{
    public final f a;

    public void i(f p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.t.scrollBy(2, 40);
    }
}
