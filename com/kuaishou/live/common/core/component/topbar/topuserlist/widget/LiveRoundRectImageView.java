package com.kuaishou.live.common.core.component.topbar.topuserlist.widget.LiveRoundRectImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import android.content.Context;
import android.util.AttributeSet;
import rsd.a;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.topbar.topuserlist.widget.LiveRoundRectImageView$a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.topbar.topuserlist.widget.LiveRoundRectImageView$b;
import com.kuaishou.live.common.core.component.topbar.topuserlist.widget.LiveRoundRectImageView$c;
import com.kuaishou.live.common.core.component.topbar.topuserlist.widget.LiveRoundRectImageView$d;
import android.graphics.RectF;
import android.graphics.Path;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import rsd.f;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.graphics.Path$Direction;

public final class LiveRoundRectImageView extends KwaiImageView	// class@0017ac
{
    public final f A;
    public RectF B;
    public Path C;
    public HashMap D;
    public final f x;
    public final f y;
    public final f z;
    public static final n[] E;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(LiveRoundRectImageView.class, "leftTopRadius", "getLeftTopRadius\(\)I", 0)),m0.j(new MutablePropertyReference1Impl(LiveRoundRectImageView.class, "rightTopRadius", "getRightTopRadius\(\)I", 0)),m0.j(new MutablePropertyReference1Impl(LiveRoundRectImageView.class, "leftBottomRadius", "getLeftBottomRadius\(\)I", 0)),m0.j(new MutablePropertyReference1Impl(LiveRoundRectImageView.class, "rightBottomRadius", "getRightBottomRadius\(\)I", 0))};
       LiveRoundRectImageView.E = onArray;
    }
    public void LiveRoundRectImageView(Context p0){
       super(p0, null);
    }
    public void LiveRoundRectImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRoundRectImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       p2 = 0;
       Integer integer = Integer.valueOf(p2);
       this.x = new LiveRoundRectImageView$a(integer, integer, this);
       this.y = new LiveRoundRectImageView$b(integer, integer, this);
       this.z = new LiveRoundRectImageView$c(integer, integer, this);
       this.A = new LiveRoundRectImageView$d(integer, integer, this);
       this.B = new RectF();
       this.C = new Path();
       TypedArray typedArray = (p0 != null)? p0.obtainStyledAttributes(p1, c$b.Q2): null;
       int dimensionPix = (typedArray != null)? typedArray.getDimensionPixelOffset(1, p2): 0;
       this.setLeftTopRadius(dimensionPix);
       dimensionPix = (typedArray != null)? typedArray.getDimensionPixelOffset(3, p2): 0;
       this.setRightTopRadius(dimensionPix);
       dimensionPix = (typedArray != null)? typedArray.getDimensionPixelOffset(p2, p2): 0;
       this.setLeftBottomRadius(dimensionPix);
       if (typedArray != null) {
          p2 = typedArray.getDimensionPixelOffset(2, p2);
       }
       this.setRightBottomRadius(p2);
       return;
    }
    public final int getLeftBottomRadius(){
       Object obj = PatchProxy.apply(null, this, LiveRoundRectImageView.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = this.z.a(this, LiveRoundRectImageView.E[2]);
       }
       return obj.intValue();
    }
    public final int getLeftTopRadius(){
       Object obj = PatchProxy.apply(null, this, LiveRoundRectImageView.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.x.a(this, LiveRoundRectImageView.E[0]);
       }
       return obj.intValue();
    }
    public final int getRightBottomRadius(){
       Object obj = PatchProxy.apply(null, this, LiveRoundRectImageView.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = this.A.a(this, LiveRoundRectImageView.E[3]);
       }
       return obj.intValue();
    }
    public final int getRightTopRadius(){
       Object obj = PatchProxy.apply(null, this, LiveRoundRectImageView.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.y.a(this, LiveRoundRectImageView.E[1]);
       }
       return obj.intValue();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRoundRectImageView.class, "9")) {
          return;
       }
       this.B.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.C.reset();
       float[] uofloatArray = new float[]{(float)this.getLeftTopRadius(),(float)this.getLeftTopRadius(),(float)this.getRightTopRadius(),(float)this.getRightTopRadius(),(float)this.getLeftBottomRadius(),(float)this.getLeftBottomRadius(),(float)this.getRightBottomRadius(),(float)this.getRightBottomRadius()};
       this.C.addRoundRect(this.B, uofloatArray, Path$Direction.CW);
       if (p0 != null) {
          p0.clipPath(this.C);
       }
       super.onDraw(p0);
       return;
    }
    public final void p0(n p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveRoundRectImageView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveRoundRectImageView.class, "10")) {
          return;
       }
       if (p1 != p2) {
          this.invalidate();
       }
       return;
    }
    public final void setLeftBottomRadius(int p0){
       if (PatchProxy.isSupport(LiveRoundRectImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundRectImageView.class, "6")) {
          return;
       }
       this.z.b(this, LiveRoundRectImageView.E[2], Integer.valueOf(p0));
       return;
    }
    public final void setLeftTopRadius(int p0){
       if (PatchProxy.isSupport(LiveRoundRectImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundRectImageView.class, "2")) {
          return;
       }
       this.x.b(this, LiveRoundRectImageView.E[0], Integer.valueOf(p0));
       return;
    }
    public final void setRightBottomRadius(int p0){
       if (PatchProxy.isSupport(LiveRoundRectImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundRectImageView.class, "8")) {
          return;
       }
       this.A.b(this, LiveRoundRectImageView.E[3], Integer.valueOf(p0));
       return;
    }
    public final void setRightTopRadius(int p0){
       if (PatchProxy.isSupport(LiveRoundRectImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundRectImageView.class, "4")) {
          return;
       }
       this.y.b(this, LiveRoundRectImageView.E[1], Integer.valueOf(p0));
       return;
    }
}
