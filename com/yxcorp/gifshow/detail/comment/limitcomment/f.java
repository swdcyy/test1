package com.yxcorp.gifshow.detail.comment.limitcomment.f;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class f implements View$OnTouchListener	// class@00137c
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       int action = p1.getAction();
       if (!action) {
          p0.setAlpha(0x3f000000);
       }else if(action == 3 || action == 1){
          p0.setAlpha(0x3f800000);
       }
       return false;
    }
}
