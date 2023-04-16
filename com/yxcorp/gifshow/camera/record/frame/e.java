package com.yxcorp.gifshow.camera.record.frame.e;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kd9.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import android.view.View;
import j8c.a;
import q87.c;
import sm6.b;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import androidx.core.content.ContextCompat;
import oa0.a;
import java.util.Objects;
import kd9.b0;
import com.yxcorp.gifshow.widget.record.CoverVideoView;

public class e extends d0	// class@000de1
{
    public b0 o;

    public void e(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void E1(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       if (p0) {
          this.b2(new v(this));
       }else {
          this.d.b().V7().u(RecordBubbleItem.FRAME_GUIDE);
       }
       return;
    }
    public void k(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FrameGuideController", "onViewCreated", objArray);
       super.k(p0);
       this.d.b().V7().s(RecordBubbleItem.FRAME_GUIDE);
       p0 = PatchProxy.apply(null, null, b.class, "35");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else if(!ContextCompat.checkSelfPermission(a.a().a(), "android.permission.CAMERA")){
          i = 1;
       }
       b = i;
       if (!b && !a.F()) {
          a.X0(true);
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("FrameGuideController", "onPause", objArray1);
       super.onPause();
       e to = this.o;
       if (to != null) {
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(objArray, to, b0.class, "12")) {
             to.r.f();
          }
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "5")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("FrameGuideController", "onResume", objArray1);
       super.onResume();
       e to = this.o;
       if (to != null) {
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(objArray, to, b0.class, "13")) {
             to.r.l();
          }
       }
       return;
    }
}
