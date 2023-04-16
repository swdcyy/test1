package nh9.b;
import exc.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import gxc.a;
import android.view.SurfaceView;
import m65.f;
import gxc.d;
import gxc.f;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;

public class b implements c	// class@003184
{

    public void b(){
       super();
    }
    public void MA(View p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "8")) {
          return;
       }
       p0.setZoomEnabled(p1);
       return;
    }
    public View Ot(Context p0){
       CameraView obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CameraView(p0);
       obj.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       return obj;
    }
    public void be(View p0,View$OnClickListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "9")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(p1, p0, CameraView.class, "4") && p1 != null) {
          if (p0.r == null) {
             p0.r = new ArrayList();
          }
          p0.r.add(p1);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void nF(View p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       p0.setCameraFocusHandler(p1);
       return;
    }
    public SurfaceView tu(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f surfaceView = p0.getSurfaceView();
       if (surfaceView instanceof SurfaceView) {
       }else {
          surfaceView = null;
       }
       return surfaceView;
    }
    public void w40(View p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       p0.setCameraAECompensationListener(p1);
       return;
    }
    public void wH(View p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "3")) {
          return;
       }
       p0.setDisableFocus(p1);
       return;
    }
    public void wk(View p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       p0.setGestureListener(p1);
       return;
    }
    public View yi(Context p0){
       AnimCameraView obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimCameraView(p0);
       obj.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       return obj;
    }
}
