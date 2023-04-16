package com.hhh.smartwidget.bubble.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.hhh.smartwidget.bubble.a;
import java.lang.Object;
import com.hhh.smartwidget.popup.c;
import android.view.View;
import a2.i0;
import android.view.ViewTreeObserver;

public class a$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000579
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (i0.Y(this.b.g)) {
          this.b.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.s();
       }
       return;
    }
}
