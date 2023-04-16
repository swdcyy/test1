package ayc.f;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.webview.helper.StateListImageView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import android.widget.ImageView;

public final class f implements View$OnTouchListener	// class@000308
{
    public final StateListImageView b;

    public void f(StateListImageView p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       f tb = this.b;
       Objects.requireNonNull(tb);
       int action = p1.getAction();
       if (action) {
          if (action == 1 || action == 3) {
             tb.c.setVisibility(false);
          }
       }else {
          tb.c.setVisibility(4);
       }
       return false;
    }
}
