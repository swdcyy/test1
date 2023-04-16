package f3.c$a;
import android.graphics.drawable.Drawable$Callback;
import f3.c;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Runnable;

public class c$a implements Drawable$Callback	// class@001fbb
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void invalidateDrawable(Drawable p0){
       this.b.invalidateSelf();
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       this.b.scheduleSelf(p1, p2);
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       this.b.unscheduleSelf(p1);
    }
}
