package com.kwai.feed.player.ui.GestureView$c;
import android.view.GestureDetector$OnDoubleTapListener;
import com.kwai.feed.player.ui.GestureView;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;

public class GestureView$c implements GestureDetector$OnDoubleTapListener	// class@0014a9
{
    public final GestureView b;

    public void GestureView$c(GestureView p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       GestureView$c obj = PatchProxy.applyOneRefs(p0, this, GestureView$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.e("onDoubleTap");
       this.b.n = SystemClock.elapsedRealtime();
       obj = this.b;
       GestureView c = obj.c;
       obj.c = (c == null)? 2: c + true;
       obj.b(p0, false, obj.c);
       return true;
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       GestureView$c obj = PatchProxy.applyOneRefs(p0, this, GestureView$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.e("onSingleTapConfirmed");
       obj = this.b;
       if (obj.m != null && obj.o != null) {
          obj.o = false;
          return true;
       }else {
          obj.c = 0;
          obj.d(p0, true);
          return true;
       }
    }
}
