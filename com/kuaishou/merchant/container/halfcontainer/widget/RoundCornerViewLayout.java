package com.kuaishou.merchant.container.halfcontainer.widget.RoundCornerViewLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;
import du3.c;
import android.view.ViewOutlineProvider;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.ViewGroup;
import android.view.View;

public class RoundCornerViewLayout extends FrameLayout	// class@00163a
{
    public Path b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    public void RoundCornerViewLayout(Context p0){
       super(p0, null);
    }
    public void RoundCornerViewLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundCornerViewLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = false;
    }
    public void a(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundCornerViewLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundCornerViewLayout.class, "3")) {
          return;
       }
       this.c = p0;
       this.d = p1;
       this.f = p2;
       this.e = p3;
       this.invalidate();
       return;
    }
    public final void b(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, RoundCornerViewLayout.class, "5")) {
          return;
       }
       if (obj.g != null) {
          int i = Math.max(obj.c, obj.d);
          int i1 = Math.max(obj.e, obj.f);
          int i2 = Math.max(i, i1);
          int i3 = (i == i1)? 0: - i1;
          int i4 = (i == i1)? this.getHeight(): this.getHeight() + i;
          c uoc = new c((float)i2, 0, i3, this.getWidth(), i4);
          obj.setOutlineProvider(i);
          obj.setClipToOutline(true);
       }else {
          c uoc1 = new c((float)obj.c, 0, 0, this.getWidth(), (this.getHeight() + obj.c));
          obj.setOutlineProvider(v1);
       }
       obj.setClipToOutline(true);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundCornerViewLayout.class, "2")) {
          return;
       }
       this.b();
       RoundCornerViewLayout tb = this.b;
       if (tb != null) {
          p0.clipPath(tb);
       }
       super.dispatchDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundCornerViewLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundCornerViewLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.b();
       return;
    }
    public void setCalculateRadius(boolean p0){
       this.g = p0;
    }
    public void setTopRadius(int p0){
       if (PatchProxy.isSupport(RoundCornerViewLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundCornerViewLayout.class, "4")) {
          return;
       }
       this.c = p0;
       this.d = p0;
       this.invalidate();
       return;
    }
}
