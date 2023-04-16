package n11.b;
import android.view.View$OnTouchListener;
import n11.e;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.view.GestureDetector;

public final class b implements View$OnTouchListener	// class@003273
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       return this.b.X.onTouchEvent(p1);
    }
}
