package b62.w;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.j;
import java.lang.Object;
import android.animation.ValueAnimator;
import b62.j0;
import androidx.recyclerview.widget.RecyclerView;

public final class w implements ValueAnimator$AnimatorUpdateListener	// class@000359
{
    public final j a;

    public void w(j p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.z.scrollBy(2, 40);
    }
}
