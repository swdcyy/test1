package androidx.appcompat.widget.AppCompatRatingBar;
import android.widget.RatingBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import w0.s;
import w0.g;
import android.widget.ProgressBar;
import android.graphics.Bitmap;

public class AppCompatRatingBar extends RatingBar	// class@0005ea
{
    public final g b;

    public void AppCompatRatingBar(Context p0){
       super(p0, null);
    }
    public void AppCompatRatingBar(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040734);
    }
    public void AppCompatRatingBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       s.a(this, this.getContext());
       g og = new g(this);
       this.b = og;
       og.c(p1, p2);
    }
    public synchronized void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       Bitmap uBitmap = this.b.b();
       if (uBitmap != null) {
          this.setMeasuredDimension(View.resolveSizeAndState((uBitmap.getWidth() * this.getNumStars()), p0, 0), this.getMeasuredHeight());
       }
       return;
    }
}
