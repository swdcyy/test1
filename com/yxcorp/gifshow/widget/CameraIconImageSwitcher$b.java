package com.yxcorp.gifshow.widget.CameraIconImageSwitcher$b;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CameraIconImageSwitcher$b extends ViewOutlineProvider	// class@0017fd
{
    public final int a;
    public final int b;
    public final CameraIconImageSwitcher c;

    public void CameraIconImageSwitcher$b(CameraIconImageSwitcher p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraIconImageSwitcher$b.class, "1")) {
          return;
       }
       CameraIconImageSwitcher$b ta = this.a;
       p1.setRoundRect(ta, ta, (p0.getWidth() - this.a), (p0.getHeight() - this.a), (float)this.b);
       return;
    }
}
