package ika.a;
import ika.o;
import ika.a$a;
import nsd.u;
import g9c.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Set;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import usd.k;
import usd.q;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import trd.l0;
import java.lang.Integer;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Number;
import ika.a$b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import java.util.List;
import msd.l;
import java.util.Map$Entry;
import ika.a$c;
import java.util.Comparator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import qrd.l1;

public abstract class a extends o	// class@002eaf
{
    public final Map i;
    public final Map j;
    public final List k;
    public final List l;
    public boolean m;
    public static final a$a n;

    static {
       a.n = new a$a(null);
    }
    public void a(a p0){
       a.p(p0, "contentAdapter");
       super(p0);
       this.i = new LinkedHashMap();
       this.j = new LinkedHashMap();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.R0();
    }
    public Set J0(){
       k obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = q.n1(0, this.M0().getItemCount());
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(Integer.valueOf(this.M0().f0(iterator.b())));
       }
       return CollectionsKt___CollectionsKt.L5(uArrayList);
    }
    public int K0(int p0,int p1){
       return p1;
    }
    public int L0(int p0){
       Iterator obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.k.iterator();
       while (obj.hasNext()) {
          if (p0 >= obj.next().a()) {
             p0++;
          }
       }
       return p0;
    }
    public int N0(int p0){
       return 1000;
    }
    public void O0(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.R0();
       return;
    }
    public int Q0(int p0){
       Iterator obj;
       int i;
       Object obj1;
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.k.iterator();
       while (true) {
          i = 0;
          if (obj.hasNext()) {
             obj1 = obj.next();
             b = (obj1.a() == p0)? true: false;
             if (!b) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 != null) {
             return -1;
          }else {
             uoa = this.k;
             if (!uoa instanceof Collection || !uoa.isEmpty()) {
                obj = uoa.iterator();
                int i1 = 0;
                while (obj.hasNext()) {
                   b = (obj.next().a() < p0)? true: false;
                   if (b) {
                      i1 = i1 + 1;
                      if (i1 < 0) {
                         CollectionsKt__CollectionsKt.V();
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }
                i = i1;
             }
             break ;
          }
       }
       return (p0 - i);
    }
    public final void R0(){
       ArrayList obj;
       Object obj1;
       Integer obj2;
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.i.clear();
       this.k.clear();
       List list = this.M0().Q0();
       a.o(list, "contentAdapter.list");
       a ti = this.i;
       l ol = this.T0();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          obj1 = ol.invoke(obj);
          ArrayList uArrayList = ti.get(obj1);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             ti.put(obj1, uArrayList);
          }
          uArrayList.add(obj);
       }
       this.j.clear();
       iterator = this.i.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          obj = uEntry.getKey();
          this.j.put(obj, Integer.valueOf(uEntry.getValue().size()));
       }
       this.k.addAll(CollectionsKt___CollectionsKt.f5(this.j.keySet(), new a$c()));
       a tk = this.k;
       if (!PatchProxy.applyVoidOneRefs(tk, this, a.class, "3")) {
          Iterator iterator1 = tk.iterator();
          int i = 0;
          while (iterator1.hasNext()) {
             obj1 = iterator1.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             obj = PatchProxy.applyTwoRefs(tk, obj1, this, a.class, "4");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                obj = new ArrayList();
                Iterator iterator2 = tk.iterator();
                int i2 = 1;
                while (iterator2.hasNext()) {
                   obj2 = iterator2.next();
                   if (obj2.b() >= obj1.b()) {
                      i2 = 0;
                   }
                   if (i2) {
                      obj.add(obj2);
                   }
                }
                int i3 = (this.m != null)? 2: 1;
                Iterator iterator3 = obj.iterator();
                while (iterator3.hasNext()) {
                   obj2 = this.j.get(iterator3.next());
                   int i4 = (obj2 != null)? obj2.intValue(): 0;
                   i3 = i3 + i4;
                   i3 = i3 + i2;
                }
                i = i3 - 1;
             }
             obj1.d = i;
             i = i1;
          }
       }
       return;
    }
    public final List S0(){
       return this.l;
    }
    public abstract l T0();
    public abstract RecyclerView$ViewHolder U0(ViewGroup p0,int p1);
    public final void V0(boolean p0){
       this.m = p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.i.size() + this.M0().getItemCount());
    }
    public abstract void t(RecyclerView$ViewHolder p0,int p1);
    public final void v0(RecyclerView$ViewHolder p0,int p1){
       l1 a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "6")) {
          return;
       }
       a.p(p0, "holder");
       Integer integer = Integer.valueOf(this.Q0(p1));
       int i = (integer.intValue() >= 0)? 1: 0;
       if (!i) {
          integer = null;
       }
       if (integer != null) {
          this.M0().v0(p0, integer.intValue());
       }else {
          this.t(p0, p1);
          a = l1.a;
       }
       return;
    }
    public final RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       if (this.e.contains(Integer.valueOf(p1))) {
          RecyclerView$ViewHolder viewHolder = this.M0().y0(p0, p1);
          a.o(viewHolder, "contentAdapter.onCreateV¡­wHolder\(parent, viewType\)");
          return viewHolder;
       }else {
          return this.U0(p0, p1);
       }
    }
}
