package ekd.y;
import android.graphics.drawable.Drawable;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import android.os.Handler;
import android.os.Looper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.concurrent.Future;
import ekd.y$a;
import java.lang.Runnable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Rect;
import android.graphics.ColorFilter;

public abstract class y extends Drawable	// class@000d88
{
    public BitmapDrawable a;
    public Handler b;
    public Future c;
    public static final ExecutorService d;

    static {
       y.d = c.f("deferred-bitmap-drawable");
    }
    public void y(){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public abstract Bitmap a();
    public void draw(Canvas p0){
       y tc = this.c;
       if (tc != null && !tc.isDone()) {
          return;
       }
       tc = this.a;
       if (tc == null) {
          this.c = y.d.submit(new y$a(this));
       }else {
          tc.draw(p0);
       }
       return;
    }
    public int getIntrinsicHeight(){
       y ta = this.a;
       if (ta != null) {
          return ta.getIntrinsicHeight();
       }
       return super.getIntrinsicHeight();
    }
    public int getIntrinsicWidth(){
       y ta = this.a;
       if (ta != null) {
          return ta.getIntrinsicWidth();
       }
       return super.getIntrinsicWidth();
    }
    public int getMinimumHeight(){
       y ta = this.a;
       if (ta != null) {
          return ta.getMinimumHeight();
       }
       return super.getMinimumHeight();
    }
    public int getMinimumWidth(){
       y ta = this.a;
       if (ta != null) {
          return ta.getMinimumWidth();
       }
       return super.getMinimumWidth();
    }
    public int getOpacity(){
       return -1;
    }
    public void setAlpha(int p0){
       y ta = this.a;
       if (ta != null) {
          ta.setAlpha(p0);
       }
       return;
    }
    public void setBounds(int p0,int p1,int p2,int p3){
       super.setBounds(p0, p1, p2, p3);
       y ta = this.a;
       if (ta != null) {
          ta.setBounds(p0, p1, p2, p3);
       }
       return;
    }
    public void setBounds(Rect p0){
       super.setBounds(p0);
       y ta = this.a;
       if (ta != null) {
          ta.setBounds(p0);
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       y ta = this.a;
       if (ta != null) {
          ta.setColorFilter(p0);
       }
       return;
    }
}
