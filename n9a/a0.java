package n9a.a0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;
import android.widget.ProgressBar;
import yy6.b;
import java.lang.Throwable;
import java.lang.String;
import android.util.Log;
import q87.c;

public final class a0 implements ValueAnimator$AnimatorUpdateListener	// class@003107
{
    public final SlidePlayVideoLoadingProgressBar a;

    public void a0(SlidePlayVideoLoadingProgressBar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a0 ta = this.a;
       Objects.requireNonNull(ta);
       int i = p0.getAnimatedValue().intValue();
       try{
          ta.setProgress(i);
          ta.postInvalidate();
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          b.C().t("SPVideoLoadingProgressBar", Log.getStackTraceString(e4), objArray);
       }
       return;
    }
}
