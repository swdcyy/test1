package j3.b;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.e;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.os.SystemClock;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import java.lang.Math;

public final class b	// class@002222
{
    public final ViewPager2 a;
    public final e b;
    public final RecyclerView c;
    public VelocityTracker d;
    public int e;
    public float f;
    public int g;
    public long h;

    public void b(ViewPager2 p0,e p1,RecyclerView p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(long p0,int p1,float p2,float p3){
       MotionEvent motionEvent = MotionEvent.obtain(this.h, p0, p1, p2, p3, 0);
       this.d.addMovement(motionEvent);
       motionEvent.recycle();
    }
    public boolean b(){
       boolean b = false;
       if (this.b.i()) {
          return b;
       }
       this.g = b;
       this.f = (float)b;
       this.h = SystemClock.uptimeMillis();
       this.c();
       this.b.m();
       if (!this.b.k()) {
          this.c.stopScroll();
       }
       this.a(this.h, 0, 0, 0);
       return true;
    }
    public final void c(){
       b td = this.d;
       if (td == null) {
          this.d = VelocityTracker.obtain();
          this.e = ViewConfiguration.get(this.a.getContext()).getScaledMaximumFlingVelocity();
       }else {
          td.clear();
       }
       return;
    }
    public boolean d(){
       if (!this.b.j()) {
          return false;
       }
       this.b.o();
       b td = this.d;
       td.computeCurrentVelocity(1000, (float)this.e);
       if (!this.c.fling((int)td.getXVelocity(), (int)td.getYVelocity())) {
          this.a.p();
       }
       return true;
    }
    public boolean e(float p0){
       boolean b = false;
       if (!this.b.j()) {
          return b;
       }
       float f = this.f - p0;
       this.f = f;
       int i = Math.round((f - (float)this.g));
       this.g = this.g + i;
       long l = SystemClock.uptimeMillis();
       f = (!this.a.getOrientation())? 1: 0;
       int i1 = (f)? i: 0;
       if (!f) {
          b = i;
       }
       b uob = (f)? this.f: 0;
       float f1 = (f)? 0: this.f;
       this.c.scrollBy(i1, b);
       this.a(l, 2, uob, f1);
       return true;
    }
    public boolean f(){
       return this.b.j();
    }
}
