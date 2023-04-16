package ga.l$e;
import android.view.View$OnTouchListener;
import ga.l;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public class l$e implements View$OnTouchListener	// class@002073
{
    public final l b;

    public void l$e(l p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       if (!p1.getAction()) {
          this.b.a();
       }
       return false;
    }
}
