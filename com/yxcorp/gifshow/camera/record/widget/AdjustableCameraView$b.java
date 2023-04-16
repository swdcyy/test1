package com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$b;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.widget.FrameLayout;
import cw9.c;

public class AdjustableCameraView$b extends ViewOutlineProvider	// class@000fac
{
    public final AdjustableCameraView a;

    public void AdjustableCameraView$b(AdjustableCameraView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdjustableCameraView$b.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)c.b(this.a.getResources(), R.dimen.arg_RES_7f07034b));
       return;
    }
}
