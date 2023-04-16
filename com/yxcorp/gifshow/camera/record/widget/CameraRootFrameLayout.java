package com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout;
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
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout$a;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.View;

public class CameraRootFrameLayout extends FrameLayout	// class@000fbd
{
    public CameraRootFrameLayout$a b;
    public boolean c;

    public void CameraRootFrameLayout(Context p0){
       super(p0);
       this.c = true;
    }
    public void CameraRootFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = true;
    }
    public void CameraRootFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = true;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       CameraRootFrameLayout obj = PatchProxy.applyOneRefs(p0, this, CameraRootFrameLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c != null) {
          obj = this.b;
          if (obj != null && obj.dispatchTouchEvent(p0)) {
             if (p0.getAction() == 1) {
                long l = SystemClock.uptimeMillis();
                super.dispatchTouchEvent(MotionEvent.obtain(l, l, 3, 0, 0, 0));
             }
             return true;
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraRootFrameLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c != null || super.onTouchEvent(p0))? true: false;
       return b;
    }
    public void setEnableInterceptEvent(boolean p0){
       this.c = p0;
    }
    public void setTouchEventListener(CameraRootFrameLayout$a p0){
       this.b = p0;
    }
}
