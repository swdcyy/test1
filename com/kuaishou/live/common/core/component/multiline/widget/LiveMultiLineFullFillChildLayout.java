package com.kuaishou.live.common.core.component.multiline.widget.LiveMultiLineFullFillChildLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;

public final class LiveMultiLineFullFillChildLayout extends FrameLayout	// class@0015cc
{
    public HashMap b;

    public void LiveMultiLineFullFillChildLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMultiLineFullFillChildLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMultiLineFullFillChildLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LiveMultiLineFullFillChildLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveMultiLineFullFillChildLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveMultiLineFullFillChildLayout.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          int i1 = p3 - p1;
          int i2 = p4 - p2;
          this.getChildAt(i).layout(0, 0, i1, i2);
       }
       return;
    }
}
