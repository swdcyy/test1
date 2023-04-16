package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.c;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.yxcorp.gifshow.util.rx.RxBus;
import ju5.b;

public final class c implements View$OnTouchListener	// class@001708
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       if (!p1.getAction()) {
          RxBus.f.b(new b());
       }
       return false;
    }
}
