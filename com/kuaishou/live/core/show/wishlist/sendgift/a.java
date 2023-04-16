package com.kuaishou.live.core.show.wishlist.sendgift.a;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class a implements View$OnTouchListener	// class@0012f4
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       if (p1.getAction() != 1) {
       }else {
          p0.performClick();
       }
       return false;
    }
}
