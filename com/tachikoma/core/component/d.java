package com.tachikoma.core.component.d;
import android.view.View$OnTouchListener;
import com.tachikoma.core.component.e;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import wo8.f;
import java.lang.String;
import sp8.b$a;
import android.view.ScaleGestureDetector;
import android.view.GestureDetector;

public final class d implements View$OnTouchListener	// class@000d66
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       d tb = this.b;
       tb.mLatestMotionEvent = p1;
       int actionMasked = p1.getActionMasked();
       if (actionMasked == 1 || actionMasked == 3) {
          tb.dispatchEvent("up", new f(tb, p1));
       }
       e j = tb.j;
       if (j != null) {
          j.onTouchEvent(p1);
       }
       e i = tb.i;
       if (i != null) {
          i.onTouchEvent(p1);
       }
       return true;
    }
}
