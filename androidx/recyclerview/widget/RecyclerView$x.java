package androidx.recyclerview.widget.RecyclerView$x;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$x$a;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$x$b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$ViewFlinger;
import java.lang.IllegalArgumentException;
import java.lang.String;

public abstract class RecyclerView$x	// class@0008a5
{
    public int a;
    public RecyclerView b;
    public RecyclerView$LayoutManager c;
    public boolean d;
    public boolean e;
    public View f;
    public final RecyclerView$x$a g;
    public boolean h;

    public void RecyclerView$x(){
       super();
       this.a = -1;
       this.g = new RecyclerView$x$a(0, 0);
    }
    public PointF a(int p0){
       RecyclerView$LayoutManager layoutManage = this.e();
       if (layoutManage instanceof RecyclerView$x$b) {
          return layoutManage.computeScrollVectorForPosition(p0);
       }
       return null;
    }
    public View b(int p0){
       return this.b.mLayout.findViewByPosition(p0);
    }
    public int c(){
       return this.b.mLayout.getChildCount();
    }
    public int d(View p0){
       return this.b.getChildLayoutPosition(p0);
    }
    public RecyclerView$LayoutManager e(){
       return this.c;
    }
    public int f(){
       return this.a;
    }
    public boolean g(){
       return this.d;
    }
    public boolean h(){
       return this.e;
    }
    public void i(PointF p0){
       float f = (float)Math.sqrt((double)((p0.x * p0.x) + (p0.y * p0.y)));
       p0.x = p0.x / f;
       p0.y = p0.y / f;
    }
    public void j(int p0,int p1){
       RecyclerView$x tb = this.b;
       if (this.a == -1 || tb == null) {
          this.r();
       }
       int[] ointArray = null;
       if (this.d != null && (this.f == null && this.c != null)) {
          PointF pointF = this.a(this.a);
          if (pointF != null) {
             PointF x = pointF.x;
             int i = 0;
             if (x - i || pointF.y - i) {
                tb.scrollStep((int)Math.signum(x), (int)Math.signum(pointF.y), ointArray);
             }
          }
       }
       this.d = false;
       RecyclerView$x tf = this.f;
       if (tf != null) {
          if (this.d(tf) == this.a) {
             this.o(this.f, tb.mState, this.g);
             this.g.d(tb);
             this.r();
          }else {
             this.f = ointArray;
          }
       }
       if (this.e != null) {
          this.l(p0, p1, tb.mState, this.g);
          this.g.d(tb);
          if (this.g.b() && this.e != null) {
             this.d = true;
             tb.mViewFlinger.postOnAnimation();
          }
       }
       return;
    }
    public void k(View p0){
       if (this.d(p0) == this.f()) {
          this.f = p0;
       }
       return;
    }
    public abstract void l(int p0,int p1,RecyclerView$y p2,RecyclerView$x$a p3);
    public abstract void m();
    public abstract void n();
    public abstract void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2);
    public void p(int p0){
       this.a = p0;
    }
    public void q(RecyclerView p0,RecyclerView$LayoutManager p1){
       p0.mViewFlinger.stop();
       this.b = p0;
       this.c = p1;
       RecyclerView$x ta = this.a;
       if (ta == -1) {
          throw new IllegalArgumentException("Invalid target position");
       }
       p0.a = ta;
       this.e = true;
       this.d = true;
       this.f = this.b(this.f());
       this.m();
       this.b.mViewFlinger.postOnAnimation();
       this.h = true;
       return;
    }
    public final void r(){
       if (this.e == null) {
          return;
       }
       this.e = false;
       this.n();
       this.b.mState.a = -1;
       this.f = null;
       this.a = -1;
       this.d = false;
       this.c.onSmoothScrollerStopped(this);
       this.c = null;
       this.b = null;
       return;
    }
}
