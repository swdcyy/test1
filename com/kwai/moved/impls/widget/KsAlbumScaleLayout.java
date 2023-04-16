package com.kwai.moved.impls.widget.KsAlbumScaleLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import o79.i;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
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
import com.yxcorp.utility.Log;
import java.lang.System;
import android.view.ViewConfiguration;
import java.lang.Integer;
import android.view.View;

public class KsAlbumScaleLayout extends FrameLayout	// class@000f6b
{
    public long b;
    public int c;
    public Path d;
    public Paint e;
    public RectF f;
    public int g;
    public int h;

    public void KsAlbumScaleLayout(Context p0){
       super(p0, null);
    }
    public void KsAlbumScaleLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KsAlbumScaleLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = i.d(3.00f);
       this.g = 0;
       this.h = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.B1, p2, 0);
       this.c = typedArray.getDimensionPixelSize(0, this.c);
       this.g = typedArray.getDimensionPixelSize(2, this.g);
       this.h = typedArray.getColor(1, this.h);
       typedArray.recycle();
       this.d = new Path();
       this.e = new Paint();
       this.f = new RectF();
       this.e.setAntiAlias(1);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumScaleLayout.class, "2")) {
          return;
       }
       p0.saveLayer(this.f, null, 31);
       super.dispatchDraw(p0);
       int i = -1;
       if (this.g > null) {
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.e.setColor(i);
          this.e.setStrokeWidth((float)this.g);
          this.e.setStyle(Paint$Style.STROKE);
          p0.drawPath(this.d, this.e);
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_OVER));
          this.e.setColor(this.h);
          this.e.setStyle(Paint$Style.STROKE);
          p0.drawPath(this.d, this.e);
       }
       this.e.setColor(i);
       this.e.setStyle(Paint$Style.FILL);
       if (Build$VERSION.SDK_INT <= 27) {
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
          p0.drawPath(this.d, this.e);
       }else {
          this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          Path path = new Path();
          path.addRect(0, 0, this.f.width(), this.f.height(), Path$Direction.CW);
          path.op(this.d, Path$Op.DIFFERENCE);
          p0.drawPath(path, this.e);
       }
       p0.restore();
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsAlbumScaleLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          boolean b = true;
          if (action != b) {
             if (action == 3) {
                Log.b("ScaleLayout", "dispatchTouchEvent\(\) called with: event = [ ACTION_CANCEL ]");
             }
          }else {
             Log.b("ScaleLayout", "dispatchTouchEvent\(\) called with: event = [ ACTION_UP ]");
             if ((System.currentTimeMillis() - this.b) - (long)ViewConfiguration.getLongPressTimeout() >= 0) {
                return b;
             }
          }
       }else {
          Log.b("ScaleLayout", "dispatchTouchEvent\(\) called with: event = [ ACTION_DOWN ]");
          this.b = System.currentTimeMillis();
       }
       return super.dispatchTouchEvent(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsAlbumScaleLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          boolean b = true;
          if (action != b) {
             if (action == 3) {
                Log.b("ScaleLayout", "onInterceptTouchEvent\(\) called with: event = [ ACTION_CANCEL ]");
             }
          }else {
             Log.b("ScaleLayout", "onInterceptTouchEvent\(\) called with: event = [ ACTION_UP ]");
             if ((System.currentTimeMillis() - this.b) - (long)ViewConfiguration.getLongPressTimeout() >= 0) {
                return b;
             }
          }
       }else {
          Log.b("ScaleLayout", "onInterceptTouchEvent\(\) called with: event = [ ACTION_DOWN ]");
          this.b = System.currentTimeMillis();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KsAlbumScaleLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KsAlbumScaleLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.f.set(0, 0, (float)p0, (float)p1);
       RectF rectF = new RectF();
       rectF.left = (float)this.getPaddingLeft();
       rectF.right = (float)((int)this.f.width() - this.getPaddingRight());
       rectF.top = (float)this.getPaddingTop();
       rectF.bottom = (float)((int)this.f.height() - this.getPaddingBottom());
       this.d.reset();
       KsAlbumScaleLayout tc = this.c;
       float f = (float)tc;
       this.d.addRoundRect(rectF, f, (float)tc, Path$Direction.CW);
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(KsAlbumScaleLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KsAlbumScaleLayout.class, "6")) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
    public void setStrokeWidth(int p0){
       if (PatchProxy.isSupport(KsAlbumScaleLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KsAlbumScaleLayout.class, "5")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
}
