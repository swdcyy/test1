package androidx.swiperefreshlayout.widget.CircleImageView;
import android.widget.ImageView;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import a2.i0;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import androidx.core.content.ContextCompat;

public class CircleImageView extends ImageView	// class@000995
{
    public Animation$AnimationListener b;
    public int c;

    public void CircleImageView(Context p0,int p1){
       super(p0);
       DisplayMetrics density = c.c(this.getContext().getResources()).density;
       this.c = (int)(3.50f * density);
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new OvalShape());
       i0.A0(this, (density * 4.00f));
       shapeDrawabl.getPaint().setColor(p1);
       i0.v0(this, shapeDrawabl);
    }
    public void onAnimationEnd(){
       super.onAnimationEnd();
       CircleImageView tb = this.b;
       if (tb != null) {
          tb.onAnimationEnd(this.getAnimation());
       }
       return;
    }
    public void onAnimationStart(){
       super.onAnimationStart();
       CircleImageView tb = this.b;
       if (tb != null) {
          tb.onAnimationStart(this.getAnimation());
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
    }
    public void setAnimationListener(Animation$AnimationListener p0){
       this.b = p0;
    }
    public void setBackgroundColor(int p0){
       if (this.getBackground() instanceof ShapeDrawable) {
          this.getBackground().getPaint().setColor(p0);
       }
       return;
    }
    public void setBackgroundColorRes(int p0){
       this.setBackgroundColor(ContextCompat.getColor(this.getContext(), p0));
    }
}
