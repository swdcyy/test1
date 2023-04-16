package com.yxcorp.gifshow.camera.record.widget.RoundedImageView;
import android.widget.ImageView;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Xfermode;
import java.lang.Integer;
import android.view.View;
import java.lang.Float;

public final class RoundedImageView extends ImageView	// class@000fd9
{
    public float b;
    public final RectF c;
    public Paint d;
    public final PorterDuffXfermode e;
    public float f;

    public void RoundedImageView(Context p0){
       super(p0);
       this.c = new RectF();
       this.e = new PorterDuffXfermode(PorterDuff$Mode.SRC_IN);
    }
    public void RoundedImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundedImageView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.c = new RectF();
       this.e = new PorterDuffXfermode(PorterDuff$Mode.SRC_IN);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.f4);
       a.o(typedArray, "context.obtainStyledAttr¡­ble.PostRoundedImageView\)");
       this.setRadius(typedArray.getDimension(0, 0));
       typedArray.recycle();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RoundedImageView.class, "5")) {
          return;
       }
       Drawable drawable = this.getDrawable();
       if (!drawable instanceof BitmapDrawable) {
          drawable = null;
       }
       Paint paint = (drawable != null)? drawable.getPaint(): null;
       this.d = paint;
       if (paint != null) {
          paint.setAntiAlias(true);
       }
       RoundedImageView td = this.d;
       if (td != null) {
          td.setDither(true);
       }
       td = this.d;
       if (td != null) {
          td.setFilterBitmap(true);
       }
       this.setLayerType(true, null);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundedImageView.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       if (this.d == null) {
          super.onDraw(p0);
          return;
       }else {
          p0.rotate(this.f, ((float)this.getWidth() / 2.00f), ((float)this.getHeight() / 2.00f));
          RoundedImageView td = this.d;
          a.m(td);
          td.setStyle(Paint$Style.FILL);
          RoundedImageView td1 = this.d;
          a.m(td1);
          p0.drawRoundRect(this.c, this.b, this.b, td1);
          td = this.d;
          a.m(td);
          td.setXfermode(this.e);
          super.onDraw(p0);
          td = this.d;
          a.m(td);
          td.setXfermode(null);
          p0.restoreToCount(p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31));
          return;
       }
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundedImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundedImageView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a();
       this.c.set(0, 0, (float)p0, (float)p1);
       return;
    }
    public final void setContentRotation(float p0){
       if (PatchProxy.isSupport(RoundedImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundedImageView.class, "4")) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
    public void setImageDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundedImageView.class, "1")) {
          return;
       }
       super.setImageDrawable(p0);
       this.a();
       return;
    }
    public final void setRadius(float p0){
       this.b = p0;
    }
}
