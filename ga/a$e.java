package ga.a$e;
import android.view.View$OnTouchListener;
import ga.a;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public class a$e implements View$OnTouchListener	// class@002054
{
    public final a b;

    public void a$e(a p0){
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
