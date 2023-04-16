package ekd.f$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import android.animation.ObjectAnimator;
import java.lang.Object;
import ekd.f;

public final class f$e implements ViewTreeObserver$OnPreDrawListener	// class@000d3c
{
    public final View b;
    public final ObjectAnimator c;

    public void f$e(View p0,ObjectAnimator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       f.b(this.b, this);
       this.c.start();
       return false;
    }
}
