package com.yxcorp.gifshow.widget.MultiFingeredInterceptShapeLinearView;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public class MultiFingeredInterceptShapeLinearView extends SelectShapeLinearLayout	// class@001883
{

    public void MultiFingeredInterceptShapeLinearView(Context p0){
       super(p0);
    }
    public void MultiFingeredInterceptShapeLinearView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MultiFingeredInterceptShapeLinearView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiFingeredInterceptShapeLinearView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.getPointerCount() == b && !super.dispatchTouchEvent(p0)) {
          b = false;
       }
       return b;
    }
}
