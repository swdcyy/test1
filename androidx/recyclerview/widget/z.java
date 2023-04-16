package androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.z$a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Math;
import android.widget.Scroller;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.z$b;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.IllegalStateException;
import java.lang.String;

public abstract class z extends RecyclerView$p	// class@000941
{
    public RecyclerView a;
    public Scroller b;
    public final RecyclerView$r c;

    public void z(){
       super();
       this.c = new z$a(this);
    }
    public boolean a(int p0,int p1){
       RecyclerView$LayoutManager layoutManage = this.a.getLayoutManager();
       boolean b = false;
       if (layoutManage == null) {
          return b;
       }
       if (this.a.getAdapter() == null) {
          return b;
       }
       int minFlingVelo = this.a.getMinFlingVelocity();
       if (Math.abs(p1) > minFlingVelo || (Math.abs(p0) > minFlingVelo && this.k(layoutManage, p0, p1))) {
          b = true;
       }
       return b;
    }
    public void b(RecyclerView p0){
       z ta = this.a;
       if (ta == p0) {
          return;
       }
       if (ta != null) {
          this.g();
       }
       this.a = p0;
       if (p0 != null) {
          this.j();
          this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
          this.l();
       }
       return;
    }
    public abstract int[] c(RecyclerView$LayoutManager p0,View p1);
    public int[] d(int p0,int p1){
       int[] ointArray = new int[]{this.b.getFinalX(),this.b.getFinalY()};
       this.b.fling(0, 0, p0, p1, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
       return ointArray;
    }
    public RecyclerView$x e(RecyclerView$LayoutManager p0){
       return this.f(p0);
    }
    public o f(RecyclerView$LayoutManager p0){
       if (!p0 instanceof RecyclerView$x$b) {
          return null;
       }
       return new z$b(this, this.a.getContext());
    }
    public final void g(){
       this.a.removeOnScrollListener(this.c);
       this.a.setOnFlingListener(null);
    }
    public abstract View h(RecyclerView$LayoutManager p0);
    public abstract int i(RecyclerView$LayoutManager p0,int p1,int p2);
    public final void j(){
       if (this.a.getOnFlingListener() != null) {
          throw new IllegalStateException("An instance of OnFlingListener already set.");
       }
       this.a.addOnScrollListener(this.c);
       this.a.setOnFlingListener(this);
       return;
    }
    public final boolean k(RecyclerView$LayoutManager p0,int p1,int p2){
       if (!p0 instanceof RecyclerView$x$b) {
          return false;
       }
       RecyclerView$x ox = this.e(p0);
       if (ox == null) {
          return false;
       }
       p1 = this.i(p0, p1, p2);
       if (p1 == -1) {
          return false;
       }
       ox.p(p1);
       p0.startSmoothScroll(ox);
       return true;
    }
    public void l(){
       z ta = this.a;
       if (ta == null) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = ta.getLayoutManager();
       if (layoutManage == null) {
          return;
       }
       View view = this.h(layoutManage);
       if (view == null) {
          return;
       }
       int[] ointArray = this.c(layoutManage, view);
       int i = 0;
       if (ointArray[i] || ointArray[1]) {
          this.a.smoothScrollBy(ointArray[i], ointArray[1]);
       }
       return;
    }
}
