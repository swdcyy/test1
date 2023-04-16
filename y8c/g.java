package y8c.g;
import g9c.a;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import qvb.q;
import java.util.HashMap;
import a9c.e;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import a9c.d;
import a9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.n8;
import a9c.b$b;
import a9c.b;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import a9c.b$a;
import u2.f;
import a9c.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import y8c.g$a;
import java.lang.Boolean;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import qvb.i;
import java.util.Iterator;
import java.util.Set;
import ml8.c;
import y8c.f$b;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.q;
import td7.c;
import td7.b;
import android.view.ViewGroup;
import java.util.Objects;
import sd7.b;
import java.util.Map;
import qvb.j;
import androidx.recyclerview.widget.RecyclerView;

public abstract class g extends a	// class@0049fc
{
    public final Map g;
    public final Set h;
    public final e i;
    public final Runnable j;
    public q k;
    public boolean l;
    public d m;
    public i n;
    public final List o;
    public boolean p;
    public n8 q;
    public ViewGroup r;
    public q s;
    public static final ExecutorService t;
    public static final Object u;
    public static boolean v;

    static {
       g.t = c.f("recyclerAdapter");
       g.u = new Object();
    }
    public void g(){
       super();
       this.h = new LinkedHashSet();
       this.o = new ArrayList();
       this.p = true;
       this.s = this.X0();
       this.g = new HashMap();
       this.i = null;
       this.j = null;
    }
    public void g(e p0){
       super(p0, null);
    }
    public void g(e p0,Runnable p1){
       super(false);
       this.h = new LinkedHashSet();
       this.o = new ArrayList();
       this.p = true;
       this.s = this.X0();
       this.g = new HashMap();
       this.i = p0;
       this.j = p1;
       Object[] objArray = null;
       c uoc = PatchProxy.apply(objArray, this, g.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          a uoa = new a(this, this.q);
          b$b uob = new b$b(p0);
          uob.b = g.t;
          uob.c = p1;
          b uob1 = PatchProxy.apply(objArray, uob, b$b.class, "1");
          if (uob1 != PatchProxyResult.class) {
          }else if(uob.a == null){
             uob.a = b$b.g;
          }
          if (uob.b == null) {
             uob1 = b$b.e;
             _monitor_enter(uob1);
             if (b$b.f == null) {
                b$b.f = Executors.newFixedThreadPool(2);
             }
             _monitor_exit(uob1);
             uob.b = b$b.f;
          }
          b uob2 = new b(uob.a, uob.b, uob.d, uob.c, null);
          d uod = new d(uoa, uob1, this);
          this.m = uod;
          uoc = new c(uod);
       }
       this.e = uoc;
       if (!TextUtils.isEmpty(this.b1())) {
          this.q = new n8("recyclerLog");
       }
       return;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public void E0(RecyclerView$ViewHolder p0){
       this.m1(p0);
    }
    public q X0(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g$a(this);
    }
    public void Y0(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "4")) {
          return;
       }
       if (this.m == null) {
          this.k0();
          return;
       }else {
          og = this.q;
          String str = "pageListCount";
          String str1 = "adapterCount";
          String str2 = "page";
          String str3 = "action";
          if (og != null) {
             i3 oi3 = i3.f();
             oi3.d(str3, "calculateDiffBefore");
             oi3.d(str2, this.b1());
             oi3.a("directNotify", Boolean.TRUE);
             oi3.c(str1, Integer.valueOf(this.getItemCount()));
             oi3.c(str, Integer.valueOf(this.n.getCount()));
             oi3.c("differCount", Integer.valueOf(this.m.a().size()));
             oi3.a("directNotify", Boolean.valueOf(p0));
             og.a(oi3.e());
          }
          if (p0) {
             this.m.b(this.n.getItems());
             g tq = this.q;
             if (tq != null) {
                i3 oi31 = i3.f();
                oi31.d(str3, "calculateDiffAfter");
                oi31.d(str2, this.b1());
                Boolean tRUE = Boolean.TRUE;
                oi31.a("directNotify", tRUE);
                oi31.c(str1, Integer.valueOf(this.getItemCount()));
                oi31.c(str, Integer.valueOf(this.n.getCount()));
                oi31.c("differCount", Integer.valueOf(this.m.a().size()));
                oi31.a("directNotify", tRUE);
                tq.a(oi31.e());
             }
          }else {
             this.m.c(this.n.getItems());
          }
          return;
       }
    }
    public void Z0(){
       if (PatchProxy.applyVoid(null, this, g.class, "13")) {
          return;
       }
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.destroy();
          }
       }
       this.h.clear();
       return;
    }
    public ArrayList a1(int p0,f p1){
       return null;
    }
    public String b1(){
       return null;
    }
    public f$b d1(f$b p0){
       return null;
    }
    public boolean e1(){
       g tm = this.m;
       boolean b = (tm != null && tm.d != null)? true: false;
       return b;
    }
    public final void f1(f p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "6")) {
          return;
       }
       this.g1(p0, p1, this.o);
       return;
    }
    public void g1(f p0,int p1,List p2){
       c f;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, g.class, "7")) {
          return;
       }
       p0.itemView.setTag(R.id.item_view_bind_data, this.N0(p1));
       p0.itemView.setTag(R.id.item_view_position, Integer.valueOf(p1));
       g tk = this.k;
       if (!PatchProxy.applyVoidOneRefs(tk, p0, f.class, "1")) {
          f d1 = p0.d;
          d1.f = tk;
          if (tk instanceof RecyclerFragment) {
             d1.e = tk.q();
          }
       }
       f d = p0.d;
       d.b = p1;
       d.g = this.g;
       p0.d(p2);
       f$b uob = this.d1(p0.d);
       Object obj = this.N0(p1);
       if (p0 instanceof c) {
          c uoc = p0;
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(obj, Integer.valueOf(p1), uob, p2, uoc, c.class, "1")) {
             f = uoc.f;
             f.r = obj;
             f.s = p1;
             f.u = p2;
             f.t = uob;
          }
       }
       if (obj == null) {
          obj = g.u;
       }
       ArrayList uArrayList = this.a1(p1, p0);
       int i = 0;
       if (uArrayList != null && !uArrayList.isEmpty()) {
          uArrayList = uArrayList.clone();
          if (uob == null) {
             uArrayList.add(i, p0.d);
          }else {
             uArrayList.add(i, uob);
          }
          uArrayList.add(i, obj);
          p0.a(uArrayList.toArray());
       }else if(uob == null){
          uob = p0.d;
       }
       Object[] objArray = new Object[]{obj,uob};
       p0.a(objArray);
       return;
    }
    public abstract f h1(ViewGroup p0,int p1);
    public final f i1(ViewGroup p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       f uof = this.h1(p0, p1);
       this.h.add(uof.b);
       return uof;
    }
    public void j1(boolean p0,boolean p1,List p2){
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       Objects.requireNonNull(p0);
       String str = "4";
       if (!PatchProxy.applyVoid(null, p0, f.class, str)) {
          p0 = p0.b;
          if (p0 instanceof b) {
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, b.class, str)) {
                b p = p0.p;
                if (!PatchProxy.applyVoidOneRefs(p, null, b.class, "3")) {
                   Objects.requireNonNull(p);
                }
             }
          }
       }
       return;
    }
    public void l1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "10")) {
          return;
       }
       p0.b();
       return;
    }
    public void m1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "8")) {
          return;
       }
       if (p0 != null) {
          RecyclerView$ViewHolder itemView = p0.itemView;
          if (itemView != null) {
             itemView.setTag(R.id.item_view_bind_data, null);
             p0.itemView.setTag(R.id.item_view_position, null);
          }
       }
       if (g.v && (p0 != null && this.h.contains(p0.b))) {
          p0.b.unbind();
       }
    label_0035 :
       return;
    }
    public void n1(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "15")) {
          return;
       }
       this.g.put(p0, p1);
       return;
    }
    public void o1(q p0){
       this.k = p0;
    }
    public final void p1(boolean p0){
       this.l = p0;
    }
    public void q1(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       g tn = this.n;
       if (tn != null) {
          tn.f(this.s);
       }
       this.n = p0;
       p0.h(this.s);
       return;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       this.r = p0;
       g tn = this.n;
       if (tn != null) {
          tn.h(this.s);
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.f1(p0, p1);
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.i1(p0, p1);
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "12")) {
          return;
       }
       this.r = null;
       this.Z0();
       g tn = this.n;
       if (tn != null) {
          tn.f(this.s);
       }
       return;
    }
}
