package com.hhh.smartwidget.inputpanel.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import com.hhh.smartwidget.inputpanel.d$b;
import java.lang.Object;
import android.graphics.Rect;

public final class d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000586
{
    public int b;
    public final View c;
    public final d$b d;

    public void d$a(View p0,d$b p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void onGlobalLayout(){
       Rect rect = new Rect();
       this.c.getWindowVisibleDisplayFrame(rect);
       int i = rect.height();
       d$a tb = this.b;
       if (tb == null) {
          this.b = i;
          return;
       }else if(tb == i){
          return;
       }else {
          int i1 = this.c.getHeight() / 4;
          d$a tb1 = this.b;
          if ((tb1 - i) > i1) {
             this.d.a((tb1 - i));
             this.b = i;
             return;
          }else if((i - tb1) > i1){
             this.d.b((i - tb1));
             this.b = i;
          }
          return;
       }
    }
}
