package dh9.a;
import oc9.e0;
import dh9.a$b;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import dh9.a$d;
import com.yxcorp.gifshow.camera.record.frame.a;
import dh9.a$c;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import oc9.t;
import kd9.a;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import kd9.u0;
import com.yxcorp.gifshow.camera.record.base.d;
import kd9.s;
import dh9.a$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import oc9.w;
import com.yxcorp.gifshow.media.model.CameraConfig;
import j8c.a;
import q87.c;
import ld9.b;
import java.lang.Math;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.camerasdk.videoCapture.CameraController;
import java.lang.StringBuilder;
import java.lang.Integer;
import oe6.e;
import android.content.Intent;
import android.app.Activity;
import android.view.View;
import dh9.a$f;
import android.view.View$OnLayoutChangeListener;
import com.kwai.feature.post.api.util.g;
import dh9.a$e;

public final class a extends e0	// class@001f3a
{
    public final a q;
    public int r;
    public int s;
    public int t;
    public int u;
    public View v;
    public Integer w;
    public final a$d x;
    public static final a$b y;

    static {
       a.y = new a$b(null);
    }
    public void a(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.x = new a$d(this);
       a uoa = new a(p0, p1, new a$c(this));
       this.q = uoa;
       this.L0(uoa);
       CameraFramePageType sTATE_SHOOT = CameraFramePageType.STATE_SHOOT;
       this.L0(new a(p0, p1, sTATE_SHOOT));
       this.L0(new u0(p0, p1, sTATE_SHOOT));
       this.d.n(s.class, new a$a(this));
    }
    public final AnimCameraView g2(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.i2();
    }
    public final CameraPageConfig h2(){
       d obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       a.o(obj, "mCallerContext");
       w ow = obj.b();
       a.o(ow, "mCallerContext.controllerManager");
       CameraConfig uCameraConfi = ow.Ve();
       a.o(uCameraConfi, "mCallerContext.controllerManager.cameraConfig");
       CameraPageConfig photoPageCon = uCameraConfi.getPhotoPageConfig();
       a.o(photoPageCon, "mCallerContext.controlle¡­eraConfig.photoPageConfig");
       return photoPageCon;
    }
    public final void i2(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       String str = "StateFrameController";
       int i = 0;
       if (this.h == null) {
          objArray = new Object[i];
          a.D().A(str, "resetFrameMode, but mCameraHelper is null", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "resetFrameMode", objArray1);
          int[] ointArray = b.a(this.h2(), 1);
          int i1 = ointArray[i];
          this.r = i1;
          this.s = ointArray[1];
          int i2 = Math.max(i1, i1);
          d th = this.h;
          a.o(th, "mCameraHelper");
          if (th.M() && this.h.O(this.r, this.s, i2)) {
             Object[] objArray2 = new Object[i];
             a.D().w(str, "updateResolutionCaptureConfig", objArray2);
             this.h.updateResolutionCaptureConfig(this.r, this.s, i2);
          }
          i2 = Math.min(this.h2().mPreviewWidth, this.h2().mPreviewHeight);
          objArray = new Object[i];
          a.D().w(str, "updateCropSize: "+i2, objArray);
          this.h.h1(i2, i2);
          this.w = Integer.valueOf(i2);
          e.b0(1);
          d te = this.e;
          if (te != null) {
             Intent intent = te.getIntent();
             if (intent != null) {
                intent.putExtra("frame_mode", 1);
             }
          }
          a tv = this.v;
          str = "contentView";
          if (tv == null) {
             a.S(str);
          }
          tv.requestLayout();
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          tv.addOnLayoutChangeListener(new a$f(this));
          return;
       }
    }
    public void k(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.k(p0);
       view = p0.findViewById(R.id.preview_layout_content);
       a.o(view, "view.findViewById\(R.id.preview_layout_content\)");
       this.v = view;
       this.s = 0;
       this.r = 0;
       this.u = g.f(this.e);
       this.i2();
       p0.addOnLayoutChangeListener(new a$e(this, p0));
       return;
    }
}
