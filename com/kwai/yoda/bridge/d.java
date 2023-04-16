package com.kwai.yoda.bridge.d;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class d implements View$OnTouchListener	// class@00118d
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       return YodaBaseWebView.lambda$initViewSettings$0(p0, p1);
    }
}
