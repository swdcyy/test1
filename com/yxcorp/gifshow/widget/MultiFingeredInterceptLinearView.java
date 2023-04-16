package com.yxcorp.gifshow.widget.MultiFingeredInterceptLinearView;
import android.widget.LinearLayout;
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
import android.view.View;

public class MultiFingeredInterceptLinearView extends LinearLayout	// class@001882
{

    public void MultiFingeredInterceptLinearView(Context p0){
       super(p0, null);
    }
    public void MultiFingeredInterceptLinearView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MultiFingeredInterceptLinearView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiFingeredInterceptLinearView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.getPointerCount() <= b && !super.onInterceptTouchEvent(p0)) {
          b = false;
       }
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiFingeredInterceptLinearView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.onTouchEvent(p0);
       return true;
    }
}
