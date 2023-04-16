package com.yxcorp.gifshow.detail.nonslide.toolbar.widget.CycleLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
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
import android.graphics.Paint$Style;
import android.os.Build$VERSION;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
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

public class CycleLayout extends LinearLayout	// class@0015f6
{
    public final Path b;
    public final Path c;
    public final Paint d;
    public final Region e;
    public final RectF f;

    public void CycleLayout(Context p0){
       super(p0, null);
    }
    public void CycleLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CycleLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new RectF();
       this.b = new Path();
       this.c = new Path();
       this.e = new Region();
       Paint paint = new Paint();
       this.d = paint;
       paint.setColor(-1);
       paint.setAntiAlias(true);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CycleLayout.class, "2")) {
          return;
       }
       p0.saveLayer(this.f, null, 31);
       super.dispatchDraw(p0);
       this.d.setColor(-1);
       this.d.setStyle(Paint$Style.FILL);
       if (Build$VERSION.SDK_INT <= 27) {
          this.d.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
          p0.drawPath(this.b, this.d);
       }else {
          this.d.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.c.reset();
          this.c.addRect(0xbf800000, 0xbf800000, (this.f.width() + 0x3f800000), (this.f.height() + 0x3f800000), Path$Direction.CW);
          this.c.op(this.b, Path$Op.DIFFERENCE);
          p0.drawPath(this.c, this.d);
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
       if (!action && !this.e.contains((int)p0.getX(), (int)p0.getY())) {
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
       p0.save();
       p0.clipPath(this.b);
       super.draw(p0);
       p0.restore();
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
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CycleLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CycleLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)p0;
       float f1 = (float)p1;
       this.f.set(0, 0, f, f1);
       RectF rectF = new RectF();
       rectF.left = (float)this.getPaddingLeft();
       rectF.top = (float)this.getPaddingTop();
       rectF.right = (float)(p0 - this.getPaddingRight());
       rectF.bottom = (float)(p1 - this.getPaddingBottom());
       this.b.reset();
       float f2 = (rectF.width() - rectF.height() >= 0)? rectF.height(): rectF.width();
       f2 = f2 / 2.00f;
       f1 = f1 / 2.00f;
       PointF pointF = new PointF((f / 2.00f), f1);
       if (Build$VERSION.SDK_INT <= 27) {
          this.b.addCircle(pointF.x, pointF.y, f2, Path$Direction.CW);
          this.b.moveTo(0xbf800000, 0xbf800000);
          p0++;
          p1++;
          this.b.moveTo((float)p0, (float)p1);
       }else {
          f1 = f1 - f2;
          this.b.moveTo(rectF.left, f1);
          this.b.addCircle(pointF.x, (f1 + f2), f2, Path$Direction.CW);
       }
       this.e.setPath(this.b, new Region((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom));
       return;
    }
}
