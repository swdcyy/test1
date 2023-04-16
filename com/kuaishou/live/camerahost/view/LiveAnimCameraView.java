package com.kuaishou.live.camerahost.view.LiveAnimCameraView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gxc.b;
import lnc.pa;
import lnc.qa;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class LiveAnimCameraView extends FrameLayout	// class@000e35
{

    public void LiveAnimCameraView(Context p0){
       super(p0);
       this.a();
    }
    public void LiveAnimCameraView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void LiveAnimCameraView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveAnimCameraView.class, "1")) {
          return;
       }
       View view = qa.r(b.class).yi(this.getContext());
       view.setId(R.id.camera_preview_layout);
       this.addView(view, new FrameLayout$LayoutParams(-1, -1));
       return;
    }
}
