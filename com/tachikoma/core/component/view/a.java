package com.tachikoma.core.component.view.a;
import com.tachikoma.core.component.TKYogaLayout$a;
import com.tachikoma.core.component.view.TKView;
import java.lang.Object;
import android.view.MotionEvent;
import kp8.a;
import java.lang.String;
import sp8.b$a;
import com.tachikoma.core.component.e;

public final class a implements TKYogaLayout$a	// class@000db8
{
    public final TKView a;

    public void a(TKView p0){
       this.a = p0;
    }
    public final boolean dispatchTouchEvent(MotionEvent p0){
       a ta = this.a;
       return ta.dispatchTouchEvent("dispatch", new a(ta, p0));
    }
}
