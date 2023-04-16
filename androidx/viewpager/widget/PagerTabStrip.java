package androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.PagerTitleStrip;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Rect;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerTabStrip$a;
import android.view.View$OnClickListener;
import androidx.viewpager.widget.PagerTabStrip$b;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import android.graphics.Canvas;
import android.view.View;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import androidx.core.content.ContextCompat;

public class PagerTabStrip extends PagerTitleStrip	// class@000a06
{
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public float E;
    public float F;
    public int G;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public final Paint x;
    public final Rect y;
    public int z;

    public void PagerTabStrip(Context p0){
       super(p0, null);
    }
    public void PagerTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
       Paint paint = new Paint();
       this.x = paint;
       this.y = new Rect();
       this.z = 255;
       this.A = false;
       this.B = false;
       PagerTitleStrip to = this.o;
       this.r = to;
       paint.setColor(to);
       DisplayMetrics density = c.c(p0.getResources()).density;
       this.s = (int)((3.00f * density) + 0x3f000000);
       this.t = (int)((6.00f * density) + 0x3f000000);
       this.u = (int)(64.00f * density);
       this.w = (int)((16.00f * density) + 0x3f000000);
       this.C = (int)((0x3f800000 * density) + 0x3f000000);
       this.v = (int)((density * 32.00f) + 0x3f000000);
       this.G = ViewConfiguration.get(p0).getScaledTouchSlop();
       this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       this.setTextSpacing(this.getTextSpacing());
       this.setWillNotDraw(false);
       this.c.setFocusable(true);
       this.c.setOnClickListener(new PagerTabStrip$a(this));
       this.e.setFocusable(true);
       this.e.setOnClickListener(new PagerTabStrip$b(this));
       if (this.getBackground() == null) {
          this.A = true;
       }
       return;
    }
    public void d(int p0,float p1,boolean p2){
       PagerTabStrip ty = this.y;
       int height = this.getHeight();
       int i = height - this.s;
       ty.set((this.d.getLeft() - this.w), i, (this.d.getRight() + this.w), height);
       super.d(p0, p1, p2);
       this.z = (int)((Math.abs((p1 - 0x3f000000)) * 2.00f) * 0x437f0000);
       ty.union((this.d.getLeft() - this.w), i, (this.d.getRight() + this.w), height);
       this.invalidate(ty);
    }
    public boolean getDrawFullUnderline(){
       return this.A;
    }
    public int getMinHeight(){
       return Math.max(super.getMinHeight(), this.v);
    }
    public int getTabIndicatorColor(){
       return this.r;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       int height = this.getHeight();
       this.x.setColor(((this.z << 24) | (this.r & 0xffffff)));
       float f = (float)height;
       p0.drawRect((float)(this.d.getLeft() - this.w), (float)(height - this.s), (float)(this.d.getRight() + this.w), f, this.x);
       if (this.A != null) {
          this.x.setColor((0xff000000 | (this.r & 0xffffff)));
          p0.drawRect((float)this.getPaddingLeft(), (float)(height - this.C), (float)(this.getWidth() - this.getPaddingRight()), f, this.x);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       PagerTitleStrip tb;
       int action = p0.getAction();
       boolean b = false;
       if (action && this.D != null) {
          return b;
       }
       float x = p0.getX();
       float y = p0.getY();
       if (action) {
          if (action != 1) {
             if (action == 2 && (Math.abs((x - this.E)) - (float)this.G > 0 || Math.abs((y - this.F)) - (float)this.G > 0)) {
                this.D = true;
             }
          }else if(x - (float)(this.d.getLeft() - this.w) < 0){
             tb = this.b;
             tb.setCurrentItem((tb.getCurrentItem() - true));
          }else if(x - (float)(this.d.getRight() + this.w) > 0){
             tb = this.b;
             tb.setCurrentItem((tb.getCurrentItem() + true));
          }
       }else {
          this.E = x;
          this.F = y;
          this.D = b;
       }
       return true;
    }
    public void setBackgroundColor(int p0){
       super.setBackgroundColor(p0);
       if (this.B == null) {
          boolean b = (!(p0 & 0xff000000))? true: false;
          this.A = b;
       }
       return;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       if (this.B == null) {
          boolean b = (p0 == null)? true: false;
          this.A = b;
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       if (this.B == null) {
          boolean b = (!p0)? true: false;
          this.A = b;
       }
       return;
    }
    public void setDrawFullUnderline(boolean p0){
       this.A = p0;
       this.B = true;
       this.invalidate();
    }
    public void setPadding(int p0,int p1,int p2,int p3){
       PagerTabStrip pagerTabStri;
       PagerTabStrip tt = this.t;
       if (p3 < tt) {
          pagerTabStri = tt;
       }
       super.setPadding(p0, p1, p2, pagerTabStri);
       return;
    }
    public void setTabIndicatorColor(int p0){
       this.r = p0;
       this.x.setColor(p0);
       this.invalidate();
    }
    public void setTabIndicatorColorResource(int p0){
       this.setTabIndicatorColor(ContextCompat.getColor(this.getContext(), p0));
    }
    public void setTextSpacing(int p0){
       PagerTabStrip pagerTabStri;
       PagerTabStrip tu = this.u;
       if (p0 < tu) {
          pagerTabStri = tu;
       }
       super.setTextSpacing(pagerTabStri);
       return;
    }
}
