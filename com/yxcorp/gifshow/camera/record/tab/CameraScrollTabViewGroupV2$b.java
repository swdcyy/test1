package com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;

public class CameraScrollTabViewGroupV2$b extends AnimatorListenerAdapter	// class@000f32
{
    public final View a;
    public final CameraScrollTabViewGroupV2 b;

    public void CameraScrollTabViewGroupV2$b(CameraScrollTabViewGroupV2 p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2$b.class, "1")) {
          return;
       }
       p0.w = false;
       Object[] objArray = new Object[false];
       a.D().w("CameraScrollTabViewGroupV2", "expandOrCollapseChildItem end .", objArray);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraScrollTabViewGroupV2", "expandOrCollapseChildItem start .", objArray);
       p0.w = true;
       this.a.setVisibility(0);
       this.a.setAlpha(0);
       return;
    }
}
