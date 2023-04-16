package com.yxcorp.gifshow.qrcode.widget.CycleLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Paint$Style;
import android.os.Build$VERSION;
import android.graphics.Path$Direction;
import android.graphics.Path$Op;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.util.ArrayList;
import android.widget.Checkable;
import java.lang.Integer;
import android.graphics.PointF;

public class CycleLayout extends LinearLayout	// class@0016e9
{
    public final float[] b;
    public final Path c;
    public final Path d;
    public final Paint e;
    public final Region f;
    public final RectF g;
    public boolean h;
    public int i;
    public int j;
    public ColorStateList k;
    public int l;
    public boolean m;

    public void CycleLayout(Context p0){
       super(p0, null);
    }
    public void CycleLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CycleLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       p2 = 8;
       float[] uofloatArray = new float[p2];
       this.b = uofloatArray;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.o0);
       this.h = typedArray.getBoolean(1, false);
       ColorStateList colorStateLi = typedArray.getColorStateList(7);
       this.k = colorStateLi;
       if (colorStateLi != null) {
          this.i = colorStateLi.getDefaultColor();
          this.j = this.k.getDefaultColor();
       }else {
          this.i = -1;
          this.j = -1;
       }
       this.l = typedArray.getDimensionPixelSize(p2, false);
       this.m = typedArray.getBoolean(false, false);
       int dimensionPix = typedArray.getDimensionPixelSize(2, false);
       int dimensionPix1 = typedArray.getDimensionPixelSize(5, dimensionPix);
       int dimensionPix2 = typedArray.getDimensionPixelSize(6, dimensionPix);
       int dimensionPix3 = typedArray.getDimensionPixelSize(3, dimensionPix);
       typedArray.recycle();
       float f = (float)dimensionPix1;
       uofloatArray[0] = f;
       uofloatArray[1] = f;
       f = (float)dimensionPix2;
       uofloatArray[2] = f;
       uofloatArray[3] = f;
       f = (float)typedArray.getDimensionPixelSize(4, dimensionPix);
       uofloatArray[4] = f;
       uofloatArray[5] = f;
       f = (float)dimensionPix3;
       uofloatArray[6] = f;
       uofloatArray[7] = f;
       this.g = new RectF();
       this.c = new Path();
       this.d = new Path();
       this.f = new Region();
       Paint paint = new Paint();
       this.e = paint;
       paint.setColor(-1);
       paint.setAntiAlias(1);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CycleLayout.class, "2")) {
          return;
       }
       p0.saveLayer(this.g, null, 31);
       super.dispatchDraw(p0);
       int i = -1;
       if (this.l > null) {
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.e.setColor(i);
          this.e.setStrokeWidth((float)(this.l * 2));
          this.e.setStyle(Paint$Style.STROKE);
          p0.drawPath(this.c, this.e);
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_OVER));
          this.e.setColor(this.i);
          this.e.setStyle(Paint$Style.STROKE);
          p0.drawPath(this.c, this.e);
       }
       this.e.setColor(i);
       this.e.setStyle(Paint$Style.FILL);
       if (Build$VERSION.SDK_INT <= 27) {
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
          p0.drawPath(this.c, this.e);
       }else {
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.d.reset();
          this.d.addRect(0, 0, this.g.width(), this.g.height(), Path$Direction.CW);
          this.d.op(this.c, Path$Op.DIFFERENCE);
          p0.drawPath(this.d, this.e);
       }
       p0.restore();
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CycleLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (!action && !this.f.contains((int)p0.getX(), (int)p0.getY())) {
          return false;
       }
       if (!action || action == 1) {
          this.refreshDrawableState();
       }else if(action == 3){
          this.setPressed(false);
          this.refreshDrawableState();
       }
       return super.dispatchTouchEvent(p0);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CycleLayout.class, "3")) {
          return;
       }
       if (this.m != null) {
          p0.save();
          p0.clipPath(this.c);
          super.draw(p0);
          p0.restore();
       }else {
          super.draw(p0);
       }
       return;
    }
    public void drawableStateChanged(){
       if (PatchProxy.applyVoid(null, this, CycleLayout.class, "5")) {
          return;
       }
       super.drawableStateChanged();
       ArrayList uArrayList = new ArrayList();
       if (this instanceof Checkable) {
          uArrayList.add(Integer.valueOf(0x101009f));
          if (this.isChecked()) {
             uArrayList.add(Integer.valueOf(0x10100a0));
          }
       }
       if (this.isEnabled()) {
          uArrayList.add(Integer.valueOf(0x101009e));
       }
       if (this.isFocused()) {
          uArrayList.add(Integer.valueOf(0x101009c));
       }
       if (this.isPressed()) {
          uArrayList.add(Integer.valueOf(0x10100a7));
       }
       if (this.isHovered()) {
          uArrayList.add(Integer.valueOf(0x1010367));
       }
       if (this.isSelected()) {
          uArrayList.add(Integer.valueOf(0x10100a1));
       }
       if (this.isActivated()) {
          uArrayList.add(Integer.valueOf(0x10102fe));
       }
       if (this.hasWindowFocus()) {
          uArrayList.add(Integer.valueOf(0x101009d));
       }
       CycleLayout tk = this.k;
       if (tk != null && tk.isStateful()) {
          int[] tk1 = new int[uArrayList.size()];
          for (int i = 0; i < uArrayList.size(); i = i + 1) {
             tk1[i] = uArrayList.get(i).intValue();
          }
          this.setStrokeColor(this.k.getColorForState(tk1, this.j));
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CycleLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CycleLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)p0;
       float f1 = (float)p1;
       float f2 = 0;
       this.g.set(f2, f2, f, f1);
       RectF rectF = new RectF();
       rectF.left = (float)this.getPaddingLeft();
       rectF.top = (float)this.getPaddingTop();
       rectF.right = (float)(p0 - this.getPaddingRight());
       rectF.bottom = (float)(p1 - this.getPaddingBottom());
       this.c.reset();
       if (this.h != null) {
          float f3 = (rectF.width() - rectF.height() >= 0)? rectF.height(): rectF.width();
          f3 = f3 / 2.00f;
          float f4 = f1 / 2.00f;
          PointF pointF = new PointF((f / 2.00f), f4);
          if (Build$VERSION.SDK_INT <= 27) {
             this.c.addCircle(pointF.x, pointF.y, f3, Path$Direction.CW);
             this.c.moveTo(f2, f2);
             this.c.moveTo(f, f1);
          }else {
             f4 = f4 - f3;
             this.c.moveTo(rectF.left, f4);
             this.c.addCircle(pointF.x, (f4 + f3), f3, Path$Direction.CW);
          }
       }else {
          this.c.addRoundRect(rectF, this.b, Path$Direction.CW);
       }
       this.f.setPath(this.c, new Region((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom));
       return;
    }
    public void setRadius(int p0){
       if (PatchProxy.isSupport(CycleLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CycleLayout.class, "6")) {
          return;
       }
       int i = 0;
       CycleLayout tb = this.b;
       while (i < tb.length) {
          tb[i] = (float)p0;
          i = i + 1;
       }
       this.invalidate();
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(CycleLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CycleLayout.class, "8")) {
          return;
       }
       this.i = p0;
       this.invalidate();
       return;
    }
    public void setStrokeWidth(int p0){
       if (PatchProxy.isSupport(CycleLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CycleLayout.class, "7")) {
          return;
       }
       this.l = p0;
       this.invalidate();
       return;
    }
}
