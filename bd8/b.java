package bd8.b;
import java.lang.Runnable;
import com.mini.js.jscomponent.keyboard.KeyboardHeightCalculatePopupWindow;
import java.lang.Object;
import java.util.Objects;
import android.graphics.Rect;
import android.view.View;
import java.lang.String;
import java.lang.ref.WeakReference;
import com.mini.js.jscomponent.keyboard.KeyboardHeightCalculatePopupWindow$a;

public final class b implements Runnable	// class@00032c
{
    public final KeyboardHeightCalculatePopupWindow b;

    public void b(KeyboardHeightCalculatePopupWindow p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Rect rect = new Rect();
       tb.b.getWindowVisibleDisplayFrame(rect);
       int i = tb.d - rect.bottom;
       rect.toString();
       boolean b = ((float)i - ((float)tb.d * 0.15f) > 0)? true: false;
       if (tb.e != b) {
          tb.e = b;
          KeyboardHeightCalculatePopupWindow c = tb.c;
          KeyboardHeightCalculatePopupWindow$a uoa = (c != null)? c.get(): null;
          if (uoa != null) {
             uoa.a(tb.e, i);
          }
       }
       return;
    }
}
