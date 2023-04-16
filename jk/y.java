package jk.y;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.tabs.NasaTabView;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class y implements ValueAnimator$AnimatorUpdateListener	// class@002434
{
    public final NasaTabView a;

    public void y(NasaTabView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       NasaTabView.b(this.a, p0);
    }
}
