package com.yxcorp.gifshow.detail.slideplay.NestedChildRelativeLayout$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.detail.slideplay.NestedChildRelativeLayout;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.RelativeLayout;

public class NestedChildRelativeLayout$a extends GestureDetector$SimpleOnGestureListener	// class@001706
{
    public final NestedChildRelativeLayout b;

    public void NestedChildRelativeLayout$a(NestedChildRelativeLayout p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedChildRelativeLayout$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.performClick();
       return super.onSingleTapConfirmed(p0);
    }
}
