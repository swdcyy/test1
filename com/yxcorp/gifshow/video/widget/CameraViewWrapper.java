package com.yxcorp.gifshow.video.widget.CameraViewWrapper;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.video.widget.CameraViewWrapper$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import gxc.b;
import com.kwai.robust.PatchProxyResult;
import android.view.SurfaceView;
import gxc.d;
import gxc.a;
import java.lang.Boolean;
import gxc.f;

public class CameraViewWrapper extends FrameLayout	// class@0016a0
{
    public View b;
    public b c;
    public HashMap d;
    public static final CameraViewWrapper$a e;

    static {
       CameraViewWrapper.e = new CameraViewWrapper$a(null);
    }
    public void CameraViewWrapper(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CameraViewWrapper(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CameraViewWrapper(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void CameraViewWrapper(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewWrapper.class, "13")) {
          return;
       }
       a.p(p0, "onClickListener");
       CameraViewWrapper tc = this.c;
       if (tc == null) {
          a.S("cameraVideoPlugin");
       }
       tc.be(this.getCameraView(), p0);
       return;
    }
    public View b(){
       CameraViewWrapper obj = PatchProxy.apply(null, this, CameraViewWrapper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("cameraVideoPlugin");
       }
       Context context = this.getContext();
       a.o(context, "context");
       return obj.Ot(context);
    }
    public final b getCameraVideoPlugin(){
       CameraViewWrapper obj = PatchProxy.apply(null, this, CameraViewWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("cameraVideoPlugin");
       }
       return obj;
    }
    public View getCameraView(){
       CameraViewWrapper obj = PatchProxy.apply(null, this, CameraViewWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("cameraView");
       }
       return obj;
    }
    public final SurfaceView getSurfaceView(){
       CameraViewWrapper obj = PatchProxy.apply(null, this, CameraViewWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("cameraVideoPlugin");
       }
       return obj.tu(this.getCameraView());
    }
    public final void setCameraAECompensationListener(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewWrapper.class, "10")) {
          return;
       }
       CameraViewWrapper tc = this.c;
       if (tc == null) {
          a.S("cameraVideoPlugin");
       }
       tc.w40(this.getCameraView(), p0);
       return;
    }
    public final void setCameraFocusHandler(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewWrapper.class, "9")) {
          return;
       }
       CameraViewWrapper tc = this.c;
       if (tc == null) {
          a.S("cameraVideoPlugin");
       }
       tc.nF(this.getCameraView(), p0);
       return;
    }
    public final void setCameraVideoPlugin(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewWrapper.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public void setCameraView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewWrapper.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void setDisableFocus(boolean p0){
       if (PatchProxy.isSupport(CameraViewWrapper.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraViewWrapper.class, "6")) {
          return;
       }
       CameraViewWrapper tc = this.c;
       if (tc == null) {
          a.S("cameraVideoPlugin");
       }
       tc.wH(this.getCameraView(), p0);
       return;
    }
    public final void setGestureListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewWrapper.class, "8")) {
          return;
       }
       CameraViewWrapper tc = this.c;
       if (tc == null) {
          a.S("cameraVideoPlugin");
       }
       tc.wk(this.getCameraView(), p0);
       return;
    }
    public final void setZoomEnabled(boolean p0){
       if (PatchProxy.isSupport(CameraViewWrapper.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraViewWrapper.class, "11")) {
          return;
       }
       CameraViewWrapper tc = this.c;
       if (tc == null) {
          a.S("cameraVideoPlugin");
       }
       tc.MA(this.getCameraView(), p0);
       return;
    }
}
