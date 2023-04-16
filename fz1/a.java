package fz1.a;
import android.graphics.drawable.Drawable$Callback;
import kkd.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Runnable;
import java.lang.Long;
import android.graphics.ColorFilter;

public class a extends Drawable implements Drawable$Callback, a	// class@0023ec
{
    public Paint b;
    public Drawable c;
    public static final int d;

    static {
       a.d = a1.e(0x3f800000);
    }
    public void a(Drawable p0,int p1){
       super();
       this.c = p0;
       Paint paint = new Paint();
       this.b = paint;
       paint.setColor(p1);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setStrokeWidth((float)a.d);
       this.b.setAntiAlias(true);
       this.b.setFlags(true);
       this.b.setStrokeCap(Paint$Cap.ROUND);
       a tc = this.c;
       if (tc != null) {
          tc.setCallback(this);
          this.setLevel(this.c.getLevel());
          this.setState(this.c.getState());
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       Rect bounds = this.getBounds();
       a tc = this.c;
       if (tc != null) {
          tc.setBounds(bounds);
          this.c.draw(p0);
       }
       p0.save();
       float f = (float)(bounds.right - bounds.left) / 2.00f;
       p0.drawCircle((((float)a.d / 2.00f) + f), f, f, this.b);
       p0.restore();
       return;
    }
    public int getIntrinsicHeight(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int intrinsicHei = (obj == null)? super.getIntrinsicHeight(): obj.getIntrinsicHeight();
       return intrinsicHei;
    }
    public int getIntrinsicWidth(){
       a obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int intrinsicWid = (obj == null)? super.getIntrinsicWidth(): obj.getIntrinsicWidth();
       return intrinsicWid;
    }
    public int getOpacity(){
       return -3;
    }
    public void invalidateDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       this.invalidateSelf();
       return;
    }
    public boolean isStateful(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          b = super.isStateful();
       }else if(super.isStateful() || this.c.isStateful()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean onLevelChange(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.c == null) {
          return super.onLevelChange(p0);
       }else {
          super.onLevelChange(p0);
          this.c.setLevel(p0);
          this.invalidateSelf();
          return true;
       }
    }
    public boolean onStateChange(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          return super.onStateChange(p0);
       }
       super.onStateChange(p0);
       this.c.setState(p0);
       this.invalidateSelf();
       return true;
    }
    public void recycle(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       a tc = this.c;
       if (tc instanceof a) {
          tc.recycle();
       }
       return;
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, a.class, "10")) {
          return;
       }
       if (p0 == this.c) {
          this.scheduleSelf(p1, p2);
       }
       return;
    }
    public void setAlpha(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "7")) {
          return;
       }
       this.b.setAlpha(p0);
       a tc = this.c;
       if (tc != null) {
          tc.setAlpha(p0);
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.b.setColorFilter(p0);
       a tc = this.c;
       if (tc != null) {
          tc.setColorFilter(p0);
       }
       return;
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       if (p0 == this.c) {
          this.unscheduleSelf(p1);
       }
       return;
    }
}
