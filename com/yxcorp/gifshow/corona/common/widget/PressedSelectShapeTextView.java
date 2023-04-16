package com.yxcorp.gifshow.corona.common.widget.PressedSelectShapeTextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import android.widget.TextView;

public final class PressedSelectShapeTextView extends SelectShapeTextView	// class@001283
{
    public HashMap g;

    public void PressedSelectShapeTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void PressedSelectShapeTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void PressedSelectShapeTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void PressedSelectShapeTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressedSelectShapeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedSelectShapeTextView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
