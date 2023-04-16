package com.yxcorp.gateway.pay.webview.l;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.yxcorp.gateway.pay.webview.PayWebView;

public final class l implements View$OnTouchListener	// class@0012a3
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       int action = p1.getAction();
       if (action && (action == 1 && !p0.hasFocus())) {
          p0.requestFocus();
       }
       return false;
    }
}
