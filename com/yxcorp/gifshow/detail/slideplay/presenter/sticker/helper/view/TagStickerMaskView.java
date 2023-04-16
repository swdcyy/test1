package com.yxcorp.gifshow.detail.slideplay.presenter.sticker.helper.view.TagStickerMaskView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import p7a.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo$Location;
import android.graphics.Canvas;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import o7a.a;
import android.app.Activity;
import ekd.i;
import com.yxcorp.utility.n;
import android.graphics.Paint$Style;
import android.view.View$OnTouchListener;
import xf6.d;

public class TagStickerMaskView extends View	// class@001866
{
    public Activity b;
    public View c;
    public TagStickerInfo d;
    public a e;
    public boolean f;
    public boolean g;
    public final Paint h;
    public final Path i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public final View$OnTouchListener r;
    public static final int s;

    static {
       TagStickerMaskView.s = a1.d(0x7f07032e);
    }
    public void TagStickerMaskView(Context p0){
       super(p0);
       this.h = new Paint();
       this.i = new Path();
       this.j = new RectF();
       this.k = new Region();
       this.l = new Region();
       this.m = true;
       this.r = new a(this);
    }
    public void TagStickerMaskView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = new Paint();
       this.i = new Path();
       this.j = new RectF();
       this.k = new Region();
       this.l = new Region();
       this.m = true;
       this.r = new a(this);
    }
    public void TagStickerMaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = new Paint();
       this.i = new Path();
       this.j = new RectF();
       this.k = new Region();
       this.l = new Region();
       this.m = true;
       this.r = new a(this);
    }
    public static boolean a(TagStickerMaskView p0,View p1,MotionEvent p2){
       boolean b1;
       Objects.requireNonNull(p0);
       boolean b = false;
       if (!p2.getAction() && p0.m != null) {
          b1 = p0.d(p2, b);
          p0.n = b1;
       }else if(p2.getAction() == 1 && (p0.m != null && (p0.n != null && p0.d(p2, true)))){
          b = 1;
       }
    label_002b :
       b1 = b;
       return b1;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, TagStickerMaskView.class, "3")) {
          return;
       }
       int width = (!this.getOverrideWidth())? this.c.getWidth(): this.getOverrideWidth();
       int height = (!this.getOverrideHeight())? this.c.getHeight(): this.getOverrideHeight();
       this.i.reset();
       TagStickerInfo mTopLeft = this.d.mTopLeft;
       float f = (float)width;
       float f1 = (float)this.getDeltaX();
       float f2 = (float)height;
       float f3 = (float)this.getDeltaY();
       this.i.moveTo(((mTopLeft.mX * f) + f1), ((mTopLeft.mY * f2) + f3));
       mTopLeft = this.d.mTopRight;
       this.i.lineTo(((mTopLeft.mX * f) + f1), ((mTopLeft.mY * f2) + f3));
       mTopLeft = this.d.mBottomRight;
       this.i.lineTo(((mTopLeft.mX * f) + f1), ((mTopLeft.mY * f2) + f3));
       mTopLeft = this.d.mBottomLeft;
       this.i.lineTo(((mTopLeft.mX * f) + f1), ((mTopLeft.mY * f2) + f3));
       mTopLeft = this.d.mTopLeft;
       this.i.lineTo(((mTopLeft.mX * f) + f1), ((mTopLeft.mY * f2) + f3));
       this.i.computeBounds(this.j, true);
       TagStickerMaskView tj = this.j;
       this.k.set((int)tj.left, (int)tj.top, (int)tj.right, (int)tj.bottom);
       this.l.setPath(this.i, this.k);
       return;
    }
    public boolean c(Canvas p0){
       return false;
    }
    public final boolean d(MotionEvent p0,boolean p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(TagStickerMaskView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, TagStickerMaskView.class, "4");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int i = (int)p0.getX();
       boolean i1 = (int)p0.getY();
       if (PatchProxy.isSupport(TagStickerMaskView.class)) {
          TagStickerMaskView obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, TagStickerMaskView.class, "5");
          if (obj1 != patchProxyRe) {
             i1 = obj1.booleanValue();
          label_0053 :
             boolean b = false;
             if (i1) {
                if (p1) {
                   this.e.g();
                   int width = (!this.getOverrideWidth())? this.c.getWidth(): this.getOverrideWidth();
                   i = (!this.getOverrideHeight())? this.c.getHeight(): this.getOverrideHeight();
                   obj1 = this.d;
                   float f = (float)width;
                   int i2 = (int)(obj1.mTopLeft.mX * f);
                   i2 = (i2 + (((int)(obj1.mTopRight.mX * f) - i2) / 2)) + this.getDeltaX();
                   float f1 = (float)i;
                   width = (int)((this.d.mTopLeft.mY * f1) + (float)this.getDeltaY());
                   if (this.g != null) {
                      width = width + this.c.getTop();
                   }
                   if (this.getOverrideHeight()) {
                      width = width + this.getTop();
                   }
                   int i3 = (i.e(this.b))? n.A(this.b): 0;
                   int i4 = (this.f != null)? a1.d(R.dimen.arg_RES_7f070313): a1.d(R.dimen.arg_RES_7f07031d);
                   width = width + this.q;
                   if (width > ((i3 + i4) + TagStickerMaskView.s)) {
                      b = true;
                   }
                   if (!b) {
                      width = (int)(this.d.mBottomLeft.mY * f1) + this.getDeltaY();
                      if (this.g != null) {
                         width = width + this.c.getTop();
                      }
                      if (this.getOverrideHeight()) {
                         width = width + this.getTop();
                      }
                      width = width + this.q;
                   }
                   this.e.b(i2, width, b);
                }
                return true;
             }else {
                return b;
             }
          }
       }
       this.b();
       i1 = this.l.contains(i, i1);
       goto label_0053 ;
    }
    public void e(Activity p0,View p1,TagStickerInfo p2,a p3,boolean p4,boolean p5){
       if (PatchProxy.isSupport(TagStickerMaskView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, TagStickerMaskView.class, "1")) {
             return;
          }
       }
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h.setStyle(Paint$Style.STROKE);
       this.h.setColor(0xffff0000);
       this.h.setStrokeWidth((float)a1.e(3.00f));
       this.setOnTouchListener(this.r);
       return;
    }
    public int getDeltaX(){
       return 0;
    }
    public int getDeltaY(){
       return 0;
    }
    public int getOverrideHeight(){
       return this.p;
    }
    public int getOverrideWidth(){
       return this.o;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TagStickerMaskView.class, "2")) {
          return;
       }
       if (this.m != null && d.o()) {
          if (this.c(p0)) {
             super.onDraw(p0);
             return;
          }else {
             this.b();
             p0.drawPath(this.i, this.h);
          }
       }
       super.onDraw(p0);
       return;
    }
    public void setAnchorView(View p0){
       this.c = p0;
    }
    public void setBubbleExtraTop(int p0){
       this.q = p0;
    }
    public void setEnabled(boolean p0){
       this.m = p0;
    }
    public void setOverrideHeight(int p0){
       this.p = p0;
    }
    public void setOverrideWidth(int p0){
       this.o = p0;
    }
}
