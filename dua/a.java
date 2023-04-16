package dua.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.homepage.presenter.splash.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import eua.b;
import android.view.View;
import java.lang.Float;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@002560
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.S8().findViewById(R.id.center_logo).setAlpha(p0.getAnimatedValue().floatValue());
    }
}
