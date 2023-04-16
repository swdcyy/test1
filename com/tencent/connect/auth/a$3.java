package com.tencent.connect.auth.a$3;
import android.view.View$OnTouchListener;
import com.tencent.connect.auth.a;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public class a$3 implements View$OnTouchListener	// class@000e23
{
    public final a a;

    public void a$3(a p0){
       this.a = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       int action = p1.getAction();
       if (action && (action == 1 && !p0.hasFocus())) {
          p0.requestFocus();
       }
       return false;
    }
}
