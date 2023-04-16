package com.hhh.smartwidget.popup.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.hhh.smartwidget.popup.c;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.view.View;
import com.hhh.smartwidget.popup.c$a;
import com.hhh.smartwidget.popup.b$a;
import android.animation.Animator$AnimatorListener;
import com.hhh.smartwidget.popup.PopupInterface$b;

public class b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000596
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       this.b.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       b tb = this.b;
       c$a w = tb.b.w;
       if (w != null) {
          w.a(tb.g, new b$a(this));
       }else {
          tb.a();
       }
       return;
    }
}
