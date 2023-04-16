package com.yxcorp.gifshow.v3.widget.EditorSplashMaskView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import java.lang.Integer;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.graphics.Path;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import android.graphics.Path$Direction;
import android.graphics.Region$Op;
import axc.c;

public final class EditorSplashMaskView extends View	// class@00163c
{
    public final RectF b;
    public final int[] c;
    public final RectF d;
    public final RectF e;
    public final RectF f;
    public final Path g;
    public HashMap h;

    public void EditorSplashMaskView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void EditorSplashMaskView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void EditorSplashMaskView(Context p0,AttributeSet p1,int p2){
       Integer integer;
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new RectF();
       Integer[] integerArray = new Integer[]{integer,integer};
       integer = Integer.valueOf(0);
       this.c = CollectionsKt___CollectionsKt.F5(CollectionsKt__CollectionsKt.L(integerArray));
       this.d = new RectF();
       this.e = new RectF();
       this.f = new RectF();
       this.g = new Path();
    }
    public void EditorSplashMaskView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSplashMaskView.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       this.getLocationOnScreen(this.c);
       EditorSplashMaskView tc = this.c;
       this.d.set((float)tc[0], (float)tc[1], (float)(tc[0] + this.getWidth()), (float)(this.c[1] + this.getHeight()));
       this.e.set(Math.max(this.d.left, this.b.left), Math.max(this.d.top, this.b.top), Math.min(this.d.right, this.b.right), Math.min(this.d.bottom, this.b.bottom));
       tc = this.e;
       EditorSplashMaskView tc1 = this.c;
       this.f.set((tc.left - (float)tc1[0]), (tc.top - (float)tc1[1]), (tc.right - (float)tc1[0]), (tc.bottom - (float)tc1[1]));
       p0.save();
       this.g.reset();
       this.g.addRect(this.f, Path$Direction.CW);
       p0.clipPath(this.g, Region$Op.DIFFERENCE);
       p0.drawColor(c.a);
       p0.restore();
       return;
    }
    public final void setMaskRectInRealScreen(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSplashMaskView.class, "1")) {
          return;
       }
       a.p(p0, "maskRectInRealScreen");
       this.b.set(p0);
       return;
    }
}
