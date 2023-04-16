package bh8.o;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bh8.p;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import android.graphics.Rect;
import bh8.n;

public final class o implements ViewTreeObserver$OnGlobalLayoutListener	// class@00036e
{
    public final p b;
    public final View c;

    public void o(p p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onGlobalLayout(){
       o tb = this.b;
       Objects.requireNonNull(tb);
       Rect rect = new Rect();
       this.c.getWindowVisibleDisplayFrame(rect);
       int i = rect.height();
       p c = tb.c;
       if (c == tb.a) {
          tb.c = i;
       }else if(c == i){
          int i1 = c - i;
          p b = tb.b;
          if (i1 > b) {
             c = tb.e;
             if (c != null) {
                c.keyBoardShow(i1);
             }
             tb.c = i;
          }else {
             int i2 = i - c;
             if (i2 > b) {
                p e = tb.e;
                if (e != null) {
                   e.keyBoardHide(i2);
                }
                tb.c = i;
             }
          }
       }
       return;
    }
}
