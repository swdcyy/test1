package com.kuaishou.live.camerahost.view.LiveCameraView;
import com.yxcorp.gifshow.video.widget.CameraViewWrapper;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gxc.b;
import lnc.pa;
import lnc.qa;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;

public class LiveCameraView extends CameraViewWrapper	// class@000e36
{

    public void LiveCameraView(Context p0){
       super(p0);
       this.c();
    }
    public void LiveCameraView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c();
    }
    public void LiveCameraView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c();
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveCameraView.class, "1")) {
          return;
       }
       b uob = qa.r(b.class);
       if (!PatchProxy.applyVoidOneRefs(uob, this, CameraViewWrapper.class, "5")) {
          a.p(uob, "plugin");
          this.c = uob;
          this.setCameraView(this.b());
          this.addView(this.getCameraView(), new FrameLayout$LayoutParams(-1, -1));
       }
       return;
    }
    public View getCameraView(){
       Object obj = PatchProxy.apply(null, this, LiveCameraView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getCameraView();
    }
}
