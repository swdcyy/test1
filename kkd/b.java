package kkd.b;
import android.graphics.drawable.Drawable$Callback;
import kkd.a;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.lang.Runnable;
import android.graphics.ColorFilter;

public class b extends Drawable implements Drawable$Callback, a	// class@0017d0
{
    public TextPaint b;
    public CharSequence c;
    public Drawable d;
    public float e;

    public void b(Drawable p0,CharSequence p1,float p2,float p3,int p4){
       super(p0, p1, null, p2);
       this.b.setTextSize(p3);
       this.b.setColor(p4);
    }
    public void b(Drawable p0,CharSequence p1,TextPaint p2,float p3){
       super();
       this.d = p0;
       this.c = p1;
       TextPaint textPaint = (p2 == null)? new TextPaint(1): new TextPaint(p2);
       this.b = textPaint;
       textPaint.setTextAlign(Paint$Align.CENTER);
       this.e = p3;
       b td = this.d;
       if (td != null) {
          td.setCallback(this);
          this.setLevel(this.d.getLevel());
          this.setState(this.d.getState());
       }
       return;
    }
    public void draw(Canvas p0){
       Rect bounds = this.getBounds();
       b td = this.d;
       if (td != null) {
          td.setBounds(bounds);
          this.d.draw(p0);
       }
       p0.save();
       td = this.e;
       if (td - 0x38d1b717 > 0 || td - -1194215657 < 0) {
          p0.rotate(td, bounds.exactCenterX(), bounds.exactCenterY());
       }
       b tc = this.c;
       p0.drawText(tc, 0, tc.length(), bounds.exactCenterX(), (bounds.exactCenterY() - ((this.b.descent() + this.b.ascent()) / 2.00f)), this.b);
       p0.restore();
       return;
    }
    public int getIntrinsicHeight(){
       b td = this.d;
       int intrinsicHei = (td == null)? super.getIntrinsicHeight(): td.getIntrinsicHeight();
       return intrinsicHei;
    }
    public int getIntrinsicWidth(){
       b td = this.d;
       int intrinsicWid = (td == null)? super.getIntrinsicWidth(): td.getIntrinsicWidth();
       return intrinsicWid;
    }
    public int getOpacity(){
       return -3;
    }
    public void invalidateDrawable(Drawable p0){
       this.invalidateSelf();
    }
    public boolean isStateful(){
       boolean b;
       if (this.d == null) {
          b = super.isStateful();
       }else if(super.isStateful() || this.d.isStateful()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean onLevelChange(int p0){
       if (this.d == null) {
          return super.onLevelChange(p0);
       }
       super.onLevelChange(p0);
       this.d.setLevel(p0);
       this.invalidateSelf();
       return true;
    }
    public boolean onStateChange(int[] p0){
       if (this.d == null) {
          return super.onStateChange(p0);
       }
       super.onStateChange(p0);
       this.d.setState(p0);
       this.invalidateSelf();
       return true;
    }
    public void recycle(){
       b td = this.d;
       if (td instanceof a) {
          td.recycle();
       }
       return;
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       if (p0 == this.d) {
          this.scheduleSelf(p1, p2);
       }
       return;
    }
    public void setAlpha(int p0){
       this.b.setAlpha(p0);
       b td = this.d;
       if (td != null) {
          td.setAlpha(p0);
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       this.b.setColorFilter(p0);
       b td = this.d;
       if (td != null) {
          td.setColorFilter(p0);
       }
       return;
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       if (p0 == this.d) {
          this.unscheduleSelf(p1);
       }
       return;
    }
}
