package androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$i;
import android.database.Observable;
import java.lang.IllegalStateException;
import java.lang.String;
import w1.k;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$g;
import java.lang.Enum;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

public abstract class RecyclerView$Adapter	// class@00087d
{
    public final RecyclerView$h b;
    public boolean c;
    public RecyclerView$Adapter$StateRestorationPolicy d;

    public void RecyclerView$Adapter(){
       super();
       this.b = new RecyclerView$h();
       this.c = false;
       this.d = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;
    }
    public boolean A0(RecyclerView$ViewHolder p0){
       return false;
    }
    public void B0(RecyclerView$ViewHolder p0){
    }
    public void D0(RecyclerView$ViewHolder p0){
    }
    public void E0(RecyclerView$ViewHolder p0){
    }
    public void F0(RecyclerView$i p0){
       this.b.registerObserver(p0);
    }
    public void G0(boolean p0){
       if (this.i0()) {
          throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
       }
       this.c = p0;
       return;
    }
    public void H0(RecyclerView$Adapter$StateRestorationPolicy p0){
       this.d = p0;
       this.b.h();
    }
    public void I0(RecyclerView$i p0){
       this.b.unregisterObserver(p0);
    }
    public final void Z(RecyclerView$ViewHolder p0,int p1){
       int i = (p0.mBindingAdapter == null)? 1: 0;
       if (i) {
          p0.mPosition = p1;
          if (this.j0()) {
             p0.mItemId = this.d0(p1);
          }
          p0.setFlags(1, 519);
          k.a("RV OnBindView");
       }
       p0.mBindingAdapter = this;
       this.x0(p0, p1, p0.getUnmodifiedPayloads());
       if (i) {
          p0.clearPayload();
          ViewGroup$LayoutParams layoutParams = p0.itemView.getLayoutParams();
          if (layoutParams instanceof RecyclerView$LayoutParams) {
             layoutParams.mInsetsDirty = true;
          }
          k.b();
       }
       return;
    }
    public boolean a0(){
       int i = RecyclerView$g.a[this.d.ordinal()];
       boolean b = false;
       if (i != 1) {
          if (i != 2) {
             return true;
          }else if(this.getItemCount() > 0){
             b = true;
          }
       }
       return b;
    }
    public final RecyclerView$ViewHolder b0(ViewGroup p0,int p1){
       k.a("RV CreateView");
       RecyclerView$ViewHolder viewHolder = this.y0(p0, p1);
       if (viewHolder.itemView.getParent() != null) {
          throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate\(..., boolean attachToRoot\)");
       }
       viewHolder.mItemViewType = p1;
       k.b();
       return viewHolder;
    }
    public int c0(RecyclerView$Adapter p0,RecyclerView$ViewHolder p1,int p2){
       if (p0 == this) {
          return p2;
       }
       return -1;
    }
    public long d0(int p0){
       return -1;
    }
    public int f0(int p0){
       return 0;
    }
    public final RecyclerView$Adapter$StateRestorationPolicy g0(){
       return this.d;
    }
    public abstract int getItemCount();
    public final boolean i0(){
       return this.b.a();
    }
    public final boolean j0(){
       return this.c;
    }
    public final void k0(){
       this.b.b();
    }
    public final void l0(int p0){
       this.b.d(p0, 1);
    }
    public final void m0(int p0,Object p1){
       this.b.e(p0, 1, p1);
    }
    public final void n0(int p0){
       this.b.f(p0, 1);
    }
    public final void o0(int p0,int p1){
       this.b.c(p0, p1);
    }
    public final void p0(int p0,int p1){
       this.b.d(p0, p1);
    }
    public final void q0(int p0,int p1,Object p2){
       this.b.e(p0, p1, p2);
    }
    public final void r0(int p0,int p1){
       this.b.f(p0, p1);
    }
    public final void s0(int p0,int p1){
       this.b.g(p0, p1);
    }
    public final void t0(int p0){
       this.b.g(p0, 1);
    }
    public void u0(RecyclerView p0){
    }
    public abstract void v0(RecyclerView$ViewHolder p0,int p1);
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.v0(p0, p1);
    }
    public abstract RecyclerView$ViewHolder y0(ViewGroup p0,int p1);
    public void z0(RecyclerView p0){
    }
}
