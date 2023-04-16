package com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.widget.FrameLayout$LayoutParams;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$d;
import android.view.ViewTreeObserver;

public class CameraScrollTabViewGroupV2$a implements ViewTreeObserver$OnPreDrawListener	// class@000f31
{
    public final CameraScrollTabViewGroupV2 b;

    public void CameraScrollTabViewGroupV2$a(CameraScrollTabViewGroupV2 p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       ViewGroup obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b.getParent() == null) {
          return b;
       }
       obj = this.b.getParent();
       if (obj.getWidth() <= 0) {
          return b;
       }
       FrameLayout$LayoutParams contentViewL = this.b.getContentViewLayoutParams();
       contentViewL.width = obj.getMeasuredWidth();
       Object[] objArray = new Object[0];
       a.D().w("CameraScrollTabViewGroupV2", "init width : "+obj.getMeasuredWidth(), objArray);
       this.b.setContentViewLayoutParams(contentViewL);
       CameraScrollTabViewGroupV2$a tb = this.b;
       tb.e(tb.k);
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       return 0;
    }
}
