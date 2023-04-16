package com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView$a;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class IdentifyCircleImageView$a extends ViewOutlineProvider	// class@000f2c
{
    public final IdentifyCircleImageView a;

    public void IdentifyCircleImageView$a(IdentifyCircleImageView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IdentifyCircleImageView$a.class, "1")) {
          return;
       }
       p1.setOval(0, 0, p0.getWidth(), p0.getHeight());
       return;
    }
}
