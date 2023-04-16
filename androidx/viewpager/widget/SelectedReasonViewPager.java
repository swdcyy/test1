package androidx.viewpager.widget.SelectedReasonViewPager;
import androidx.viewpager.widget.OptimizedViewPager;
import androidx.viewpager.widget.SelectedReasonViewPager$b;
import java.lang.String;
import android.content.Context;
import androidx.viewpager.widget.SelectedReasonViewPager$c;
import androidx.viewpager.widget.SelectedReasonViewPager$a;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import android.os.SystemClock;
import java.lang.System;
import h3.a;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager$f;

public class SelectedReasonViewPager extends OptimizedViewPager	// class@000a0d
{
    public final SelectedReasonViewPager$c i;
    public int j;
    public String k;
    public long l;
    public long m;
    public static final SelectedReasonViewPager$b n;
    public static final SelectedReasonViewPager$b o;

    static {
       SelectedReasonViewPager$b uob = new SelectedReasonViewPager$b("NoReason", 0, 0);
       SelectedReasonViewPager.n = v6;
       SelectedReasonViewPager$b uob1 = new SelectedReasonViewPager$b("REASON_EXPIRED", 0, 0);
       SelectedReasonViewPager.o = uob;
    }
    public void SelectedReasonViewPager(Context p0){
       super(p0);
       this.i = new SelectedReasonViewPager$c(null);
       this.j = -1;
    }
    public void SelectedReasonViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = new SelectedReasonViewPager$c(null);
       this.j = -1;
    }
    public void dataSetChanged(){
       this.i.d("dataSetChanged");
       super.dataSetChanged();
       this.i.c();
    }
    public void endFakeDrag(){
       this.i.d("endFakeDrag");
       super.endFakeDrag();
       this.i.c();
    }
    public final SelectedReasonViewPager$b getItemSelectionReasonInternal(){
       if (this.getCurrentItem() < 0) {
          return SelectedReasonViewPager.n;
       }
       if (this.getCurrentItem() != this.j) {
          return SelectedReasonViewPager.o;
       }
       SelectedReasonViewPager$b uob = new SelectedReasonViewPager$b(this.k, this.l, this.m);
       return v0;
    }
    public String getItemSelectionReasonStr(){
       return this.p(true).a;
    }
    public void n(int p0){
       if (this.j != p0) {
          this.q(p0, "unknown1");
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       this.i.d("onRestoreInstanceState");
       super.onRestoreInstanceState(p0);
       this.i.c();
    }
    public boolean onTouchEvent(MotionEvent p0){
       this.i.d("userScroll");
       this.i.c();
       return super.onTouchEvent(p0);
    }
    public final SelectedReasonViewPager$b p(boolean p0){
       SelectedReasonViewPager$b itemSelectio = this.getItemSelectionReasonInternal();
       if (p0) {
          ViewParent parent = this.getParent();
          while (parent instanceof View) {
             if (parent instanceof SelectedReasonViewPager) {
                SelectedReasonViewPager$b itemSelectio1 = parent.getItemSelectionReasonInternal();
                if (itemSelectio.b - itemSelectio1.b < 0) {
                   itemSelectio = itemSelectio1;
                }
             }
             parent = parent.getParent();
          }
       }
       return itemSelectio;
    }
    public boolean pageLeft(){
       this.i.d("pageLeft");
       this.i.c();
       return super.pageLeft();
    }
    public boolean pageRight(){
       this.i.d("pageRight");
       this.i.c();
       return super.pageRight();
    }
    public final void q(int p0,String p1){
       if (this.t(p0, p1)) {
          return;
       }
       this.j = p0;
       this.k = p1;
       this.l = SystemClock.currentThreadTimeMillis();
       this.m = System.currentTimeMillis();
       return;
    }
    public void r(int p0,String p1){
       this.i.d(p1);
       super.setCurrentItem(p0);
       this.i.c();
    }
    public void s(int p0,boolean p1,String p2){
       this.i.d(p2);
       super.setCurrentItem(p0, p1);
       this.i.c();
    }
    public void setAdapter(a p0){
       this.i.d("init-adapter");
       super.setAdapter(p0);
       this.i.c();
    }
    public void setCurrentItem(int p0){
       if (this.i.b()) {
          super.setCurrentItem(p0);
       }else {
          this.r(p0, "unknown");
       }
       return;
    }
    public void setCurrentItem(int p0,boolean p1){
       if (this.i.b()) {
          super.setCurrentItem(p0, p1);
       }else {
          this.s(p0, p1, "unknown");
       }
       return;
    }
    public void setCurrentItemInternal(int p0,boolean p1,boolean p2){
       super.setCurrentItemInternal(p0, p1, p2);
    }
    public void setCurrentItemInternal(int p0,boolean p1,boolean p2,int p3){
       if (this.i.b()) {
          this.q(p0, this.i.a());
       }
       super.setCurrentItemInternal(p0, p1, p2, p3);
       return;
    }
    public final boolean t(int p0,String p1){
       boolean b = true;
       if (("dataSetChanged").equals(p1)) {
          if (this.infoForPosition(p0) == null) {
             b = false;
          }
          return b;
       }else if(this.j == p0){
          b = false;
       }
       return b;
    }
}
