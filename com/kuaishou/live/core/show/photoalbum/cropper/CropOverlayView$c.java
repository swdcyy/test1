package com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView$c;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView$a;
import android.view.ScaleGestureDetector;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.RectF;
import com.kuaishou.live.core.show.photoalbum.cropper.d;
import android.view.View;

public class CropOverlayView$c extends ScaleGestureDetector$SimpleOnScaleGestureListener	// class@000d63
{
    public final CropOverlayView a;

    public void CropOverlayView$c(CropOverlayView p0){
       this.a = p0;
       super();
    }
    public void CropOverlayView$c(CropOverlayView p0,CropOverlayView$a p1){
       super(p0);
    }
    public boolean onScale(ScaleGestureDetector p0){
       RectF obj = PatchProxy.applyOneRefs(p0, this, CropOverlayView$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.d.f();
       float focusX = p0.getFocusX();
       float focusY = p0.getFocusY();
       float f = p0.getCurrentSpanY() / 2.00f;
       float f1 = p0.getCurrentSpanX() / 2.00f;
       float f2 = focusY - f;
       float f3 = focusX - f1;
       focusX = focusX + f1;
       focusY = focusY + f;
       if (f3 - focusX < 0 && f2 - focusY <= 0) {
          f1 = 0;
          if (f3 - f1 >= 0 && (focusX - this.a.d.c() <= 0 && (f2 - f1 >= 0 && focusY - this.a.d.b() <= 0))) {
             obj.set(f3, f2, focusX, focusY);
             this.a.d.m(obj);
             this.a.invalidate();
          }
       }
    label_006d :
       return true;
    }
}
