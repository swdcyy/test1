package eh9.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$d;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$c;

public final class i implements ValueAnimator$AnimatorUpdateListener	// class@002150
{
    public final CameraScrollTabViewGroupV2 a;
    public final CameraScrollTabViewGroupV2$d b;
    public final ViewGroup c;
    public final View d;

    public void i(CameraScrollTabViewGroupV2 p0,CameraScrollTabViewGroupV2$d p1,ViewGroup p2,View p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       i ta = this.a;
       i tc = this.c;
       i td = this.d;
       Objects.requireNonNull(ta);
       int i = p0.getAnimatedValue().intValue();
       if (this.b.b == 1) {
          int i1 = 0;
          int i2 = tc.getChildAt(i1).getWidth() / 2;
          if (ta.k.a > null) {
             for (; i1 < ta.k.a; i1 = i1 + 1) {
                i2 = i2 + ta.s(i1).getWidth();
             }
          }
          FrameLayout$LayoutParams contentViewL = ta.getContentViewLayoutParams();
          contentViewL.setMarginStart((((ta.getWidth() / 2) - i2) - i));
          ta.setContentViewLayoutParams(contentViewL);
       }
       td.setAlpha(p0.getAnimatedFraction());
       ViewGroup$MarginLayoutParams layoutParams = tc.getChildAt(1).getLayoutParams();
       layoutParams.setMarginStart(i);
       tc.getChildAt(1).setLayoutParams(layoutParams);
       CameraScrollTabViewGroupV2 p = ta.p;
       if (p != null) {
          p.a();
       }
       return;
    }
}
