package com.yxcorp.gifshow.camera.record.widget.CameraView$e;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.view.ScaleGestureDetector;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import x8c.a;
import java.lang.StringBuilder;
import q87.c;
import gxc.f;

public class CameraView$e extends ScaleGestureDetector$SimpleOnScaleGestureListener	// class@000fc2
{
    public final CameraView a;

    public void CameraView$e(CameraView p0){
       this.a = p0;
       super();
    }
    public boolean onScale(ScaleGestureDetector p0){
       CameraView$e obj = PatchProxy.applyOneRefs(p0, this, CameraView$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[]{"mEnableZoom: "+this.a.w};
       a.D().w("CameraView", "Camera onScale", objArray);
       obj = this.a;
       if (obj.w == null) {
          return 1;
       }
       CameraView q = obj.q;
       if (q != null && q.u0(p0.getScaleFactor())) {
          return 1;
       }
       p0.s = 0;
       return 0;
    }
    public boolean onScaleBegin(ScaleGestureDetector p0){
       CameraView obj = PatchProxy.applyOneRefs(p0, this, CameraView$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.q;
       if (obj != null) {
          obj.Q1(p0.getScaleFactor());
       }
       return super.onScaleBegin(p0);
    }
    public void onScaleEnd(ScaleGestureDetector p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraView$e.class, "2")) {
          return;
       }
       super.onScaleEnd(p0);
       CameraView q = this.a.q;
       if (q != null) {
          q.u0(0);
       }
       return;
    }
}
