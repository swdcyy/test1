package com.yxcorp.gifshow.camera.record.widget.CameraView$a;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.widget.CameraView$d;
import android.view.GestureDetector;

public class CameraView$a implements View$OnTouchListener	// class@000fbe
{
    public final CameraView b;

    public void CameraView$a(CameraView p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       CameraView obj = PatchProxy.applyTwoRefs(p0, p1, this, CameraView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.h;
       if (obj != null && obj.onTouch(p0, p1)) {
          this.b.o.d(true);
          this.b.n.onTouchEvent(p1);
       }
       return false;
    }
}
