package com.kwai.feature.post.api.widget.ResizeFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import dn6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Math;
import java.lang.Float;

public final class ResizeFrameLayout extends FrameLayout	// class@00147c
{
    public float b;
    public final int c;
    public int d;
    public boolean e;
    public HashMap f;

    public void ResizeFrameLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ResizeFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ResizeFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = 0x3f800000;
       this.c = a.b.d(0x3f800000);
       this.d = Integer.MAX_VALUE;
    }
    public void ResizeFrameLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ResizeFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ResizeFrameLayout.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.e != null) {
          return;
       }
       if (Math.abs((this.d - this.getMeasuredWidth())) > this.c) {
          a b = a.b;
          this.setMeasuredDimension((int)((((float)this.getMeasuredWidth() * b.f()) * this.b) + 0x3f000000), (int)((((float)this.getMeasuredHeight() * b.f()) * this.b) + 0x3f000000));
       }
       this.d = this.getMeasuredWidth();
       return;
    }
    public final void setDisableResize(boolean p0){
       this.e = p0;
    }
    public final void setExtraScale(float p0){
       if (PatchProxy.isSupport(ResizeFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ResizeFrameLayout.class, "2")) {
          return;
       }
       if (Float.compare(p0, 0) > 0) {
          this.b = p0;
       }
       return;
    }
}
