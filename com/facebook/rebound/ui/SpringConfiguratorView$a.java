package com.facebook.rebound.ui.SpringConfiguratorView$a;
import android.view.View$OnTouchListener;
import com.facebook.rebound.ui.SpringConfiguratorView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import dg.e;

public class SpringConfiguratorView$a implements View$OnTouchListener	// class@001445
{
    public final SpringConfiguratorView b;

    public void SpringConfiguratorView$a(SpringConfiguratorView p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       if (!p1.getAction()) {
          SpringConfiguratorView d = this.b.d;
          double d1 = 0x3ff0000000000000;
          if (!d.h - d1) {
             d1 = 0;
          }
          d.f(d1);
       }
       return true;
    }
}
