package m5.a;
import android.animation.ValueAnimator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;
import android.animation.Animator$AnimatorListener;
import android.os.Build$VERSION;
import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import android.animation.TimeInterpolator;

public abstract class a extends ValueAnimator	// class@0025ac
{
    public final Set b;
    public final Set c;

    public void a(){
       super();
       this.b = new CopyOnWriteArraySet();
       this.c = new CopyOnWriteArraySet();
    }
    public void a(boolean p0){
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          Animator$AnimatorListener uAnimatorLis = iterator.next();
          if (Build$VERSION.SDK_INT >= 26) {
             uAnimatorLis.onAnimationEnd(this, p0);
          }else {
             uAnimatorLis.onAnimationEnd(this);
          }
       }
       return;
    }
    public void addListener(Animator$AnimatorListener p0){
       this.c.add(p0);
    }
    public void addUpdateListener(ValueAnimator$AnimatorUpdateListener p0){
       this.b.add(p0);
    }
    public void b(boolean p0){
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          Animator$AnimatorListener uAnimatorLis = iterator.next();
          if (Build$VERSION.SDK_INT >= 26) {
             uAnimatorLis.onAnimationStart(this, p0);
          }else {
             uAnimatorLis.onAnimationStart(this);
          }
       }
       return;
    }
    public void c(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAnimationUpdate(this);
       }
       return;
    }
    public long getStartDelay(){
       throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }
    public void removeAllListeners(){
       this.c.clear();
    }
    public void removeAllUpdateListeners(){
       this.b.clear();
    }
    public void removeListener(Animator$AnimatorListener p0){
       this.c.remove(p0);
    }
    public void removeUpdateListener(ValueAnimator$AnimatorUpdateListener p0){
       this.b.remove(p0);
    }
    public Animator setDuration(long p0){
       this.setDuration(p0);
       throw null;
    }
    public ValueAnimator setDuration(long p0){
       throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
    public void setInterpolator(TimeInterpolator p0){
       throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }
    public void setStartDelay(long p0){
       throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
