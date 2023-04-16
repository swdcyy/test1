package androidx.appcompat.widget.ListPopupWindow$f;
import android.view.View$OnTouchListener;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.widget.PopupWindow;
import java.lang.Runnable;
import android.os.Handler;

public class ListPopupWindow$f implements View$OnTouchListener	// class@00060a
{
    public final ListPopupWindow b;

    public void ListPopupWindow$f(ListPopupWindow p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       ListPopupWindow$f tb;
       int action = p1.getAction();
       int i = (int)p1.getX();
       int i1 = (int)p1.getY();
       if (!action) {
          ListPopupWindow g = this.b.G;
          if (g != null && (g.isShowing() && (i >= 0 && (i < this.b.G.getWidth() && (i1 >= 0 && i1 < this.b.G.getHeight()))))) {
             tb = this.b;
             tb.C.postDelayed(tb.x, 250);
          }else if(action == 1){
             tb = this.b;
             tb.C.removeCallbacks(tb.x);
          }
       }else {
          goto label_0040 ;
       }
       return false;
    }
}
