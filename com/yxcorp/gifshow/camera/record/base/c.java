package com.yxcorp.gifshow.camera.record.base.c;
import com.yxcorp.gifshow.camerasdk.j$p;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import java.lang.Object;
import java.util.Objects;
import x8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.j;
import q87.c;
import ui9.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import gxc.f;
import ui9.b;
import ui9.c;
import oc9.k;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public final class c implements j$p	// class@000da7
{
    public final CameraBaseFragment a;

    public void c(CameraBaseFragment p0){
       this.a = p0;
    }
    public final void run(){
       boolean b;
       c ta = this.a;
       Objects.requireNonNull(ta);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", "resumePreview in openCamera, isCameraOpen:"+ta.q.M(), objArray);
       ta.q.resumePreview();
       ta.r = ta.q.q();
       Object[] objArray1 = null;
       if (PatchProxy.applyVoid(objArray1, ta, CameraBaseFragment.class, "25")) {
       }else {
          ta.n.getCameraView().setGestureListener(ta.p);
          ta.q.n0(ta.p);
          ta.q.o0(ta.p);
          ta.q.W = ta.p;
          ta.mh(new k(ta));
       }
       Object obj = PatchProxy.apply(objArray1, ta, CameraBaseFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(ta.getFragmentManager() == null || (!ta.getFragmentManager().isDestroyed() && (!ta.isRemoving() && (!ta.isDetached() && ta.getActivity() != null)))){
          b = true;
       }else {
          b = false;
       }
       if (b && ta.q.M()) {
          objArray1 = new Object[i];
          a.D().w("CameraBaseFragment", "onCameraOpened", objArray1);
          ta.w();
       }
       return;
    }
}
