package ep8.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import ep8.d$b;
import java.util.List;
import ep8.c;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.tachikoma.core.yoga.layout.YogaLayout;
import ep8.a;
import jq8.a;
import lg.i;
import ep8.d$a;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Math;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import ep8.f;
import androidx.recyclerview.widget.GridLayoutManager$b;
import java.util.Objects;
import com.facebook.yoga.YogaUnit;
import android.view.ViewGroup;
import android.view.ViewParent;

public class d extends RecyclerView$Adapter	// class@002225
{
    public final d$b e;
    public final d$b f;
    public final RecyclerView$i g;
    public RecyclerView$Adapter h;
    public RecyclerView$i i;
    public RecyclerView$i j;
    public RecyclerView$Adapter k;
    public RecyclerView$Adapter l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public void d(RecyclerView$Adapter p0){
       super();
       this.m = -2048;
       this.n = -1024;
       this.p = -1;
       this.q = false;
       this.r = true;
       this.s = false;
       this.h = p0;
       this.e = new d$b(null);
       this.f = new d$b(null);
       c uoc = new c(this);
       this.g = uoc;
       this.i = uoc;
       this.j = uoc;
       this.h.F0(uoc);
    }
    public void B0(RecyclerView$ViewHolder p0){
       d tk;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "35")) {
          return;
       }
       int itemViewType = p0.getItemViewType();
       if (this.Q0(itemViewType)) {
          tk = this.k;
          if (tk != null) {
             tk.B0(p0);
          }else {
             this.J0(p0, true);
          }
       }else if(this.O0(itemViewType)){
          tk = this.l;
          if (tk != null) {
             tk.B0(p0);
          }else {
             this.J0(p0, true);
          }
       }else {
          this.h.B0(p0);
          this.J0(p0, false);
       }
       return;
    }
    public void D0(RecyclerView$ViewHolder p0){
       d tk;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "38")) {
          return;
       }
       int itemViewType = p0.getItemViewType();
       if (this.Q0(itemViewType)) {
          tk = this.k;
          if (tk != null) {
             tk.D0(p0);
          }
       }else if(this.O0(itemViewType)){
          tk = this.l;
          if (tk != null) {
             tk.D0(p0);
          }
       }else {
          this.h.D0(p0);
       }
       return;
    }
    public void F0(RecyclerView$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "34")) {
          return;
       }
       super.F0(p0);
       return;
    }
    public void I0(RecyclerView$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "39")) {
          return;
       }
       super.I0(p0);
       return;
    }
    public final void J0(RecyclerView$ViewHolder p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "36")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.itemView.getLayoutParams();
       if (layoutParams instanceof StaggeredGridLayoutManager$LayoutParams) {
          layoutParams.c(p1);
       }
       return;
    }
    public final RecyclerView$ViewHolder K0(View p0){
       ViewGroup$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, d.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getLayoutParams();
       int i = (obj == null)? -1: obj.width;
       int i1 = (obj == null)? -2: obj.height;
       if (this.r != null) {
          if (this.o != null) {
             StaggeredGridLayoutManager$LayoutParams layoutParams = new StaggeredGridLayoutManager$LayoutParams(i, i1);
             layoutParams.c(true);
             p0.setLayoutParams(layoutParams);
          }else {
             p0.setLayoutParams(new RecyclerView$LayoutParams(i, i1));
          }
       }
       if (p0 instanceof YogaLayout) {
          YogaLayout yogaLayout = p0;
          return new a(p0, yogaLayout.getYogaNode().l(), yogaLayout.getYogaNode().d());
       }else {
          return new d$a(this, p0);
       }
    }
    public int L0(){
       d obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.l;
       int itemCount = (obj != null)? obj.getItemCount(): this.f.e();
       return itemCount;
    }
    public int M0(){
       d obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       int itemCount = (obj != null)? obj.getItemCount(): this.e.e();
       return itemCount;
    }
    public boolean N0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 >= (this.M0() + this.h.getItemCount()))? true: false;
       return b;
    }
    public boolean O0(int p0){
       boolean b = (p0 >= -2048 && p0 <= this.m)? true: false;
       return b;
    }
    public boolean P0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 < this.M0())? true: false;
       return b;
    }
    public boolean Q0(int p0){
       boolean b = (p0 >= -1024 && p0 <= this.n)? true: false;
       return b;
    }
    public void R0(){
       this.s = true;
    }
    public final void S0(){
       if (PatchProxy.applyVoid(null, this, d.class, "30")) {
          return;
       }
       try{
          this.k0();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public long d0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "9");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (this.P0(p0)) {
          uod = this.k;
          if (uod != null) {
             return uod.d0(p0);
          }else {
             return (long)this.f0(p0);
          }
       }else if(this.N0(p0)){
          if (this.l != null) {
             return this.l.d0(((p0 - this.M0()) - this.h.getItemCount()));
          }else {
             return (long)this.f0(p0);
          }
       }else {
          return this.h.d0((p0 - this.M0()));
       }
    }
    public int f0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.P0(p0)) {
          uod = this.k;
          p0 = (uod != null)? uod.f0(p0): this.e.b(p0);
          p0 = p0 - 1024;
          this.n = Math.max(p0, this.n);
          return p0;
       }else if(this.N0(p0)){
          p0 = (p0 - this.h.getItemCount()) - this.M0();
          uod = this.l;
          p0 = (uod != null)? uod.f0(p0): this.f.b(p0);
          p0 = p0 - 2048;
          this.m = Math.max(p0, this.m);
          return p0;
       }else {
          return this.h.f0((p0 - this.M0()));
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.L0() + this.M0()) + this.h.getItemCount());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecyclerHeaderFooterAdapter{mAdapter="+this.h+", mHeaderAdapter="+this.k+", mFooterAdapter="+this.l+'}';
    }
    public void u0(RecyclerView p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "40")) {
          return;
       }
       if (this.h.i0()) {
          this.h.I0(this.g);
       }
       this.h.F0(this.g);
       this.h.u0(p0);
       d tk = this.k;
       if (tk != null) {
          tk.u0(p0);
          this.k.I0(this.i);
          this.k.F0(this.i);
       }
       tk = this.l;
       if (tk != null) {
          tk.u0(p0);
          this.l.I0(this.j);
          this.l.F0(this.j);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "37")) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          if (layoutManage instanceof GridLayoutManager) {
             layoutManage.m1(new f(this, layoutManage));
          }
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "7")) {
          return;
       }
       if (p1 < this.M0() || p1 >= (this.M0() + this.h.getItemCount())) {
          if (p1 < this.M0()) {
             uod = this.k;
             if (uod != null) {
                uod.v0(p0, p1);
             }else if(p1 >= (this.M0() + this.h.getItemCount())){
                uod = this.l;
                if (uod != null) {
                   uod.v0(p0, ((p1 - this.M0()) - this.h.getItemCount()));
                }
             }
          }else {
             goto label_0042 ;
          }
          if (p0 instanceof a && this.s != null) {
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, a.class, "1")) {
                RecyclerView$ViewHolder itemView = p0.itemView;
                if (itemView instanceof YogaLayout) {
                   YogaUnit aUTO = YogaUnit.AUTO;
                   if (p0.a.b == aUTO) {
                      itemView.getYogaNode().E();
                   }
                   if (p0.b.b == aUTO) {
                      p0.itemView.getYogaNode().t();
                   }
                }
             }
             this.s = false;
          }
          return;
       }else {
          this.h.v0(p0, (p1 - this.M0()));
          return;
       }
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d.class, "8")) {
          return;
       }
       if (p2.isEmpty()) {
          this.v0(p0, p1);
          return;
       }else if(p1 < this.M0() || p1 >= (this.M0() + this.h.getItemCount())){
          if (p1 < this.M0()) {
             d tk = this.k;
             if (tk != null) {
                tk.x0(p0, p1, p2);
             }else if(p1 >= (this.M0() + this.h.getItemCount())){
                tk = this.l;
                if (tk != null) {
                   tk.x0(p0, ((p1 - this.M0()) - this.h.getItemCount()), p2);
                }
             }
          }else {
             goto label_0051 ;
          }
          return;
       }else {
          this.h.x0(p0, (p1 - this.M0()), p2);
          return;
       }
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       View view;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.Q0(p1)) {
          p1 = p1 + 1024;
          uod = this.k;
          if (uod == null) {
             view = this.e.c(p1);
             if (view != null && view.getParent() instanceof ViewGroup) {
                view.getParent().removeView(view);
             }
             return this.K0(view);
          }else {
             return uod.y0(p0, p1);
          }
       }else if(this.O0(p1)){
          p1 = p1 + 2048;
          uod = this.l;
          if (uod == null) {
             view = this.f.c(p1);
             if (view != null && view.getParent() instanceof ViewGroup) {
                view.getParent().removeView(view);
             }
             return this.K0(view);
          }else {
             return uod.y0(p0, p1);
          }
       }else {
          return this.h.y0(p0, p1);
       }
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "41")) {
          return;
       }
       if (this.h.i0()) {
          this.h.I0(this.g);
       }
       this.h.z0(p0);
       d tk = this.k;
       if (tk != null) {
          tk.z0(p0);
          this.k.I0(this.i);
       }
       tk = this.l;
       if (tk != null) {
          tk.z0(p0);
          this.l.I0(this.j);
       }
       return;
    }
}
