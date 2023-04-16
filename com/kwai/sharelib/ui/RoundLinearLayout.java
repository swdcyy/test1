package com.kwai.sharelib.ui.RoundLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import android.os.Build$VERSION;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Path$Direction;
import java.lang.Integer;
import java.lang.Float;

public final class RoundLinearLayout extends LinearLayout	// class@001705
{
    public final Path b;
    public final Paint c;
    public final RectF d;
    public float e;
    public final boolean f;

    public void RoundLinearLayout(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void RoundLinearLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void RoundLinearLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = true;
       this.b = new Path();
       Paint paint = new Paint(true);
       this.c = paint;
       this.d = new RectF();
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
    }
    public final void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundLinearLayout.class, "7")) {
          return;
       }
       p0.saveLayer(this.d, null, 31);
       super.dispatchDraw(p0);
       p0.drawPath(this.e(), this.c);
       p0.restore();
       return;
    }
    public final void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundLinearLayout.class, "8")) {
          return;
       }
       p0.save();
       p0.clipPath(this.e());
       super.dispatchDraw(p0);
       p0.restore();
       return;
    }
    public final void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundLinearLayout.class, "5")) {
          return;
       }
       if (this.f != null) {
          p0.saveLayer(this.d, null, 31);
          super.draw(p0);
          p0.drawPath(this.e(), this.c);
          p0.restore();
       }else {
          super.draw(p0);
       }
       return;
    }
    public final void d(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundLinearLayout.class, "6")) {
          return;
       }
       if (this.f != null) {
          p0.save();
          p0.clipPath(this.e());
          super.draw(p0);
          p0.restore();
       }else {
          super.draw(p0);
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundLinearLayout.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       if (Build$VERSION.SDK_INT >= 28) {
          this.b(p0);
       }else {
          this.a(p0);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundLinearLayout.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       if (Build$VERSION.SDK_INT >= 28) {
          this.d(p0);
       }else {
          this.c(p0);
       }
       return;
    }
    public final Path e(){
       Object obj = PatchProxy.apply(null, this, RoundLinearLayout.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.reset();
       this.b.addRoundRect(this.d, this.e, this.e, Path$Direction.CW);
       return this.b;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundLinearLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundLinearLayout.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.d.set(0, 0, (float)p0, (float)p1);
       return;
    }
    public final void setRadius(float p0){
       if (PatchProxy.isSupport(RoundLinearLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundLinearLayout.class, "1")) {
          return;
       }
       this.e = p0;
       this.postInvalidate();
       return;
    }
}
