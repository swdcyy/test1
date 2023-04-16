package androidx.constraintlayout.motion.widget.MotionLayout$a;
import java.lang.Runnable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import android.view.View;
import java.lang.Object;

public class MotionLayout$a implements Runnable	// class@000668
{
    public final View b;
    public final MotionLayout c;

    public void MotionLayout$a(MotionLayout p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.b.setNestedScrollingEnabled(true);
    }
}
