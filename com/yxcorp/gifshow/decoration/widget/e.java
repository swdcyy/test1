package com.yxcorp.gifshow.decoration.widget.e;
import com.yxcorp.gifshow.decoration.widget.g$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.f;
import android.graphics.Rect;
import gq.a;
import java.lang.StringBuilder;
import q87.c;

public class e extends g$b	// class@0012be
{
    public final DecorationContainerView a;

    public void e(DecorationContainerView p0){
       this.a = p0;
       super();
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       BaseDrawer gestureTarDe = this.a.getGestureTargetDecoration();
       if (gestureTarDe == null) {
          return;
       }
       gestureTarDe.scaleForDoubleFinger(p0.d());
       DecorationContainerView q = this.a.q;
       int i = 0;
       if (q != null) {
          boolean b = true;
          if (q.c()) {
             e ta = this.a;
             if (!ta.q.h(ta.u(gestureTarDe), b)) {
             label_0039 :
                if (!b) {
                   this.a.q.i();
                }else {
                   this.a.q.b();
                }
             }
          }
          b = false;
          goto label_0039 ;
       }
       this.a.U(gestureTarDe);
       Object[] objArray = new Object[i];
       a.D().s("DecorationEditView", "detectorDoubleFingerRotateAndScale |||||||||| scale:"+p0.d(), objArray);
       return;
    }
    public void d(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       BaseDrawer gestureTarDe = this.a.getGestureTargetDecoration();
       if (gestureTarDe == null) {
          return;
       }
       gestureTarDe.rotateForDoubleFinger(p0.c());
       DecorationContainerView q = this.a.q;
       int i = 0;
       if (q != null) {
          boolean b = true;
          if (q.c()) {
             e ta = this.a;
             if (!ta.q.h(ta.u(gestureTarDe), b)) {
             label_0039 :
                if (!b) {
                   this.a.q.i();
                }else {
                   this.a.q.b();
                }
             }
          }
          b = false;
          goto label_0039 ;
       }
       this.a.U(gestureTarDe);
       Object[] objArray = new Object[i];
       a.D().s("DecorationEditView", "detectorDoubleFingerRotateAndScale |||||||||| rotate:"+p0.c(), objArray);
       return;
    }
}
