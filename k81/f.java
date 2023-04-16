package k81.f;
import android.view.View$OnTouchListener;
import k81.h;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import com.kuaishou.live.basic.model.QLiveMessage;
import k81.d;

public final class f implements View$OnTouchListener	// class@002cd7
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!p1.getAction()) {
          h d = tb.d;
          if (d != null) {
             h b = tb.b;
             if (b != null) {
                b.a(p0, d, tb.e);
             }
          }
       }
       return false;
    }
}
