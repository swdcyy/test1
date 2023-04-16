package com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.component.homepage_interface.uxmonitor.GestureType;
import tb5.c;

public final class InvalidGestureChecker$b extends GestureDetector$SimpleOnGestureListener	// class@000979
{
    public final InvalidGestureChecker b;

    public void InvalidGestureChecker$b(InvalidGestureChecker p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, InvalidGestureChecker$b.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       InvalidGestureChecker b = this.b.b;
       if (b != null) {
          b.e(GestureType.DOUBLE_CLICK);
       }
       return false;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InvalidGestureChecker$b.class, "2")) {
          return;
       }
       InvalidGestureChecker b = this.b.b;
       if (b != null) {
          b.e(GestureType.LONG_PRESS);
       }
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, InvalidGestureChecker$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       InvalidGestureChecker b = this.b.b;
       if (b != null) {
          b.e(GestureType.CLICK);
       }
       return true;
    }
}
