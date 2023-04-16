package bc.b$b;
import android.graphics.drawable.Drawable$Callback;
import bc.b;
import java.lang.Object;
import bc.b$a;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.Runnable;
import android.os.SystemClock;

public class b$b implements Drawable$Callback	// class@000b10
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void b$b(b p0,b$a p1){
       super(p0);
    }
    public void invalidateDrawable(Drawable p0){
       b$b tb = this.b;
       b d = tb.d;
       if (d != null) {
          d.invalidate();
       }else {
          b e = tb.e;
          if (e != null) {
             e.invalidateSelf();
          }
       }
       return;
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       b$b tb = this.b;
       if (tb.d != null) {
          this.b.d.postDelayed(p1, (p2 - SystemClock.uptimeMillis()));
       }else {
          b e = tb.e;
          if (e != null) {
             e.scheduleSelf(p1, p2);
          }
       }
       return;
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       b$b tb = this.b;
       b d = tb.d;
       if (d != null) {
          d.removeCallbacks(p1);
       }else {
          b e = tb.e;
          if (e != null) {
             e.unscheduleSelf(p1);
          }
       }
       return;
    }
}
