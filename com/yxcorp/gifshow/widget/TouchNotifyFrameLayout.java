package com.yxcorp.gifshow.widget.TouchNotifyFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.TouchNotifyFrameLayout$a;
import android.view.ViewGroup;
import java.lang.Throwable;
import k2b.u1;

public class TouchNotifyFrameLayout extends FrameLayout	// class@0018df
{
    public List b;

    public void TouchNotifyFrameLayout(Context p0){
       super(p0);
    }
    public void TouchNotifyFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void TouchNotifyFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       TouchNotifyFrameLayout obj = PatchProxy.applyOneRefs(p0, this, TouchNotifyFrameLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = this.b;
          if (obj != null) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                iterator.next().onTouch(p0);
             }
          }
       }
       return super.dispatchTouchEvent(p0);
    }
}
