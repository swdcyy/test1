package com.kuaishou.live.common.core.component.gift.ScaleFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import p02.c;
import java.lang.Integer;
import java.lang.Float;

public final class ScaleFrameLayout extends FrameLayout	// class@001136
{
    public float b;
    public boolean c;
    public HashMap d;

    public void ScaleFrameLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ScaleFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ScaleFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = 0x3f800000;
    }
    public void ScaleFrameLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final float getCurrentScale(){
       return this.b;
    }
    public final int getFirstSlotHeight(){
       Object obj = PatchProxy.apply(null, this, ScaleFrameLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.c != null)? 0x7f07077e: 0x7f07077a;
       return (int)((float)a1.d(i) * this.b);
    }
    public final c getSlotHeight(){
       Object obj = PatchProxy.apply(null, this, ScaleFrameLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int firstSlotHei = this.getFirstSlotHeight();
       c uoc = (this.c != null)? new c(firstSlotHei, firstSlotHei, ((firstSlotHei * 2) + a1.d(0x7f070783))): new c(firstSlotHei, firstSlotHei, (firstSlotHei * 2));
       return uoc;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ScaleFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ScaleFrameLayout.class, "5")) {
          return;
       }
       super.onMeasure(p0, p1);
       ScaleFrameLayout tb = this.b;
       this.setMeasuredDimension((int)((float)this.getMeasuredWidth() * tb), (int)((float)this.getMeasuredHeight() * tb));
       return;
    }
    public final void setGiftContainerViewStyle(boolean p0){
       this.c = p0;
    }
    public final void setScale(float p0){
       if (PatchProxy.isSupport(ScaleFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ScaleFrameLayout.class, "1")) {
          return;
       }
       this.b = p0;
       this.setPivotX(0);
       this.setPivotY(0);
       this.setScaleX(p0);
       this.setScaleY(p0);
       return;
    }
    public final void setScaleValue(float p0){
       if (PatchProxy.isSupport(ScaleFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ScaleFrameLayout.class, "2")) {
          return;
       }
       this.setScale(p0);
       this.requestLayout();
       return;
    }
}
