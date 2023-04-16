package com.hhh.smartwidget.inputpanel.InputPanel$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.hhh.smartwidget.inputpanel.InputPanel;
import com.hhh.smartwidget.inputpanel.InputPanel$b;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.view.View;
import com.hhh.smartwidget.popup.c;

public class InputPanel$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000580
{
    public final InputPanel$b b;
    public final InputPanel c;

    public void InputPanel$a(InputPanel p0,InputPanel$b p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       this.c.r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       InputPanel$a tc = this.c;
       tc.p = tc.r.getHeight();
       tc = this.b;
       if (tc.F != null && !tc.m()) {
          tc = this.c;
          tc.s(tc.g.getHeight(), 0);
          this.c.n = true;
       }else {
          tc = this.c;
          tc.g.setTranslationY((float)(tc.p - tc.o));
       }
       return;
    }
}
