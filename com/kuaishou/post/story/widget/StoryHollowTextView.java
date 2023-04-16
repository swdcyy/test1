package com.kuaishou.post.story.widget.StoryHollowTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Bitmap$Config;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.text.TextPaint;
import java.lang.CharSequence;

public class StoryHollowTextView extends AppCompatTextView	// class@000b92
{
    public Paint f;
    public Paint g;
    public Bitmap h;
    public Bitmap i;
    public Canvas j;
    public Canvas k;
    public RectF l;
    public int m;
    public int n;
    public boolean o;
    public Bitmap p;

    public void StoryHollowTextView(Context p0){
       super(p0, null);
    }
    public void StoryHollowTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void StoryHollowTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = true;
       if (!PatchProxy.isSupport(StoryHollowTextView.class) || (!PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), this, StoryHollowTextView.class, "1") && p1 != null)) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.v5, p2, 0);
          this.m = typedArray.getColor(0, 0);
          this.n = typedArray.getDimensionPixelOffset(true, 0);
          typedArray.recycle();
          object oobject = this.getCompoundDrawables()[0];
          if (oobject instanceof BitmapDrawable) {
             this.p = oobject.getBitmap();
          }
          this.setCompoundDrawables(null, null, null, null);
       }
       if (!PatchProxy.applyVoid(null, this, StoryHollowTextView.class, "2")) {
          Paint paint = new Paint();
          this.f = paint;
          paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.f.setAntiAlias(true);
          paint = new Paint();
          this.g = paint;
          paint.setColor(this.m);
          this.g.setAntiAlias(true);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryHollowTextView.class, "4")) {
          return;
       }
       if (this.k != null) {
          StoryHollowTextView tj = this.j;
          if (tj == null || (this.h != null && this.i != null)) {
             tj.drawColor(0, PorterDuff$Mode.CLEAR);
             this.k.drawColor(0, PorterDuff$Mode.CLEAR);
             super.onDraw(this.k);
             this.p(this.j);
             p0.drawBitmap(this.h, 0, 0, null);
             this.q(p0);
             p0.restoreToCount(p0.saveLayer(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), null));
             return;
          }
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(StoryHollowTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, StoryHollowTextView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          this.h = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
          this.j = new Canvas(this.h);
          this.i = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(this.i);
          this.k = uCanvas;
          uCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
          this.l = new RectF(0, 0, (float)this.getWidth(), (float)this.getHeight());
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryHollowTextView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction() || p0.getAction() == 2) {
          this.setAlpha(0x3f000000);
       }else if(p0.getAction() == 1 || p0.getAction() == 3){
          this.setAlpha(0x3f800000);
       }
       return super.onTouchEvent(p0);
    }
    public final void p(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryHollowTextView.class, "7")) {
          return;
       }
       StoryHollowTextView tn = this.n;
       if (tn > null) {
          p0.drawRoundRect(this.l, (float)tn, (float)tn, this.g);
       }else {
          p0.drawColor(this.m);
       }
       return;
    }
    public final void q(Canvas p0){
       StoryHollowTextView tp;
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryHollowTextView.class, "8")) {
          return;
       }
       Paint paint = null;
       if (this.p != null) {
          int compoundDraw = this.getCompoundDrawablePadding();
          int width = this.p.getWidth();
          float f = (this.getPaint().measureText(this.getText().toString()) + (float)width) + (float)compoundDraw;
          float f1 = (float)(width + compoundDraw) / 2.00f;
          p0.translate(f1, 0);
          StoryHollowTextView ti = this.i;
          Paint paint1 = (this.o != null)? paint: this.f;
          p0.drawBitmap(ti, 0, 0, paint1);
          p0.translate(((- f1) + (((float)this.getWidth() - f) / 2.00f)), ((float)(this.getHeight() - this.p.getHeight()) / 2.00f));
          tp = this.p;
          if (this.o == null) {
             paint = this.f;
          }
          p0.drawBitmap(tp, 0, 0, paint);
       }else {
          tp = this.i;
          if (this.o == null) {
             paint = this.f;
          }
          p0.drawBitmap(tp, 0, 0, paint);
       }
       return;
    }
    public void setHollowBackgroundColor(int p0){
       if (PatchProxy.isSupport(StoryHollowTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryHollowTextView.class, "5")) {
          return;
       }
       this.m = p0;
       this.g.setColor(p0);
       this.invalidate();
       return;
    }
    public void setHollowDisabled(boolean p0){
       if (PatchProxy.isSupport(StoryHollowTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StoryHollowTextView.class, "6")) {
          return;
       }
       this.o = p0;
       this.invalidate();
       return;
    }
}
