package com.yxcorp.widget.selector.view.RoundedRelativeLayout$a;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$d;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout;
import java.lang.Object;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import android.graphics.Canvas;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.widget.RelativeLayout;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$c;

public final class RoundedRelativeLayout$a implements RoundedRelativeLayout$d	// class@0009e6
{
    public final Path a;
    public final Paint b;
    public final RectF c;
    public int d;
    public final RoundedRelativeLayout e;

    public void RoundedRelativeLayout$a(RoundedRelativeLayout p0){
       this.e = p0;
       super();
       this.a = new Path();
       this.b = new Paint(1);
       this.c = new RectF();
    }
    public void a(int p0,int p1){
       this.c.set(0, 0, (float)p0, (float)p1);
       this.f(this.d);
       this.a.reset();
       this.a.addRoundRect(this.c, this.e.d, this.e.d, Path$Direction.CW);
    }
    public void b(Canvas p0,boolean p1){
       if (p1 || this.e.c != null) {
          p0.drawPath(this.a, this.b);
          p0.restore();
       }
       return;
    }
    public void c(Canvas p0,boolean p1){
       if (p1 || this.e.c != null) {
          p0.saveLayer(this.c, null, 31);
       }
       return;
    }
    public void d(float p0){
       this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       this.e.postInvalidate();
    }
    public void e(int p0){
       this.d = p0;
       this.f(p0);
       this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       this.e.postInvalidate();
    }
    public void f(int p0){
       RoundedRelativeLayout$a tc;
       if (p0 == RoundedRelativeLayout$c.c) {
          tc = this.c;
          tc.set(tc.left, tc.top, tc.right, (tc.bottom + this.e.d));
          this.a.reset();
          this.a.addRoundRect(this.c, this.e.d, this.e.d, Path$Direction.CW);
       }else if(p0 == RoundedRelativeLayout$c.d){
          tc = this.c;
          tc.set(tc.left, (tc.top - this.e.d), tc.right, tc.bottom);
          this.a.reset();
          this.a.addRoundRect(this.c, this.e.d, this.e.d, Path$Direction.CW);
       }else if(p0 == RoundedRelativeLayout$c.b){
          tc = this.c;
          tc.set(tc.left, tc.top, (tc.right + this.e.d), tc.bottom);
          this.a.reset();
          this.a.addRoundRect(this.c, this.e.d, this.e.d, Path$Direction.CW);
       }else if(p0 == RoundedRelativeLayout$c.e){
          tc = this.c;
          tc.set((tc.left - this.e.d), tc.top, tc.right, tc.bottom);
          this.a.reset();
          this.a.addRoundRect(this.c, this.e.d, this.e.d, Path$Direction.CW);
       }
       return;
    }
    public void init(){
       this.a.reset();
       this.a.addRoundRect(this.c, this.e.d, this.e.d, Path$Direction.CW);
    }
}
