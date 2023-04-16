package com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$a;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.pagedy.container.adapter.ComponentTypeList;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicLoadMoreListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicOnScrollListener$2;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import go4.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import java.lang.Boolean;
import do4.o;
import java.util.List;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.bowl.core.component.a;
import fo4.b;
import su.g;
import java.util.Map;
import tu.d;
import do4.a;
import java.util.Objects;
import android.view.ViewGroup;
import java.lang.Integer;
import ag6.a;
import do4.k;
import do4.b;
import qrd.l1;
import trd.y;
import ho4.r$c;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import android.os.Handler;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$b;
import java.lang.Runnable;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import do4.e;
import androidx.recyclerview.widget.RecyclerView$r;
import do4.g;
import kotlin.Pair;
import qrd.r0;
import trd.s0;
import java.util.NoSuchElementException;
import do4.j;
import do4.h;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kuaishou.bowl.core.util.ComponentStateMachine$ComponentState;

public final class DynamicComponentAdapter extends RecyclerView$Adapter	// class@000a51
{
    public final ComponentTypeList e;
    public ArrayList f;
    public final ArrayList g;
    public LayoutInflater h;
    public a i;
    public k j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public int r;
    public o s;
    public ViewGroup t;
    public boolean u;
    public final p v;
    public final p w;
    public final FragmentActivity x;
    public final boolean y;
    public static final DynamicComponentAdapter$a z;

    static {
       DynamicComponentAdapter.z = new DynamicComponentAdapter$a(null);
    }
    public void DynamicComponentAdapter(FragmentActivity p0,boolean p1){
       a.p(p0, "activity");
       super();
       this.x = p0;
       this.y = p1;
       this.e = new ComponentTypeList();
       this.f = new ArrayList();
       this.g = new ArrayList();
       LayoutInflater layoutInflat = LayoutInflater.from(p0);
       a.o(layoutInflat, "LayoutInflater.from\(activity\)");
       this.h = layoutInflat;
       this.k = true;
       this.p = "";
       this.q = "";
       this.r = 2;
       this.v = s.c(new DynamicComponentAdapter$dynamicLoadMoreListener$2(this));
       this.w = s.c(new DynamicComponentAdapter$dynamicOnScrollListener$2(this));
       this.G0(true);
    }
    public void B0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "23")) {
          return;
       }
       a.p(p0, "holder");
       int i = 1;
       if (this.i != null && a.o(p0.getItemViewType())) {
          RecyclerView$ViewHolder itemView = p0.itemView;
          a.o(itemView, "holder.itemView");
          ViewGroup$LayoutParams layoutParams = itemView.getLayoutParams();
          if (layoutParams instanceof StaggeredGridLayoutManager$LayoutParams && p0.getLayoutPosition() == (this.getItemCount() - i)) {
             layoutParams.c(i);
          }
       }
       Boolean uBoolean = Boolean.valueOf(a.o(p0.getItemViewType()));
       if (!(i ^ uBoolean.booleanValue())) {
          uBoolean = null;
       }
       if (uBoolean != null) {
          uBoolean.booleanValue();
          this.P0(p0).c(p0);
          DynamicComponentAdapter ts = this.s;
          if (ts != null) {
             ts.c(p0);
          }
       }
       return;
    }
    public void D0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "22")) {
          return;
       }
       a.p(p0, "holder");
       Boolean uBoolean = Boolean.valueOf(a.o(p0.getItemViewType()));
       if (!(uBoolean.booleanValue() ^ 0x01)) {
          uBoolean = null;
       }
       if (uBoolean != null) {
          uBoolean.booleanValue();
          this.P0(p0).d(p0);
          DynamicComponentAdapter ts = this.s;
          if (ts != null) {
             ts.d(p0);
          }
       }
       return;
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "24")) {
          return;
       }
       a.p(p0, "holder");
       Boolean uBoolean = Boolean.valueOf(a.o(p0.getItemViewType()));
       if (!(uBoolean.booleanValue() ^ 0x01)) {
          uBoolean = null;
       }
       if (uBoolean != null) {
          uBoolean.booleanValue();
          this.P0(p0).e(p0);
          DynamicComponentAdapter ts = this.s;
          if (ts != null) {
             ts.e(p0);
          }
       }
       return;
    }
    public final void J0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "10")) {
          return;
       }
       a.p(p0, "data");
       this.f.addAll(p0);
       this.r0(this.f.size(), p0.size());
       return;
    }
    public final void K0(){
       if (PatchProxy.applyVoid(null, this, DynamicComponentAdapter.class, "7")) {
          return;
       }
       if (this.f.isEmpty() ^ 0x01) {
          this.f.clear();
       }
       return;
    }
    public final FragmentActivity L0(){
       return this.x;
    }
    public final List M0(){
       Iterator obj = PatchProxy.apply(null, this, DynamicComponentAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       obj = this.f.iterator();
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          Object obj2 = obj1;
          int i = 1;
          int i1 = a.g(obj2.getComponentName(), "LOAD_COMPLETE") ^ i;
          if (!i1) {
             i1 = a.g(obj2.getComponentName(), "LOAD_MORE") ^ i;
             if (!i1) {
                int i2 = a.g(obj2.getComponentName(), "EMPTY_VIEW") ^ i;
                if (!i2) {
                   i = 0;
                }
             }
          }
          if (i) {
             uArrayList.add(obj1);
          }
       }
       return uArrayList;
    }
    public final b N0(){
       d uod;
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, DynamicComponentAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = g.a(this.q);
       if (obj != null) {
          obj = obj.p;
          if (obj != null) {
             uod = obj.get("KEY_NEST_LIST_CONFIG_CALLBACK");
          label_0026 :
             if (uod instanceof b) {
                objArray = uod;
             }
             return objArray;
          }
       }
       uod = objArray;
       goto label_0026 ;
    }
    public final String O0(){
       return this.q;
    }
    public final o P0(RecyclerView$ViewHolder p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicComponentAdapter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       o oo = this.e.b(p0.getItemViewType()).b();
       Objects.requireNonNull(oo, "null cannot be cast to non-null type com.kuaishou.pagedy.container.adapter.ViewHolderDelegate<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
       return oo;
    }
    public final View Q0(int p0,ViewGroup p1){
       DynamicComponentAdapter uDynamicComp = DynamicComponentAdapter.class;
       if (PatchProxy.isSupport(uDynamicComp)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uDynamicComp, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.c(this.h, p0, p1, false);
       view.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       a.o(view, "layoutInflater.inflate\(l¡­RAP_CONTENT\n      \)\n    }");
       return view;
    }
    public final boolean R0(){
       return this.m;
    }
    public final void S0(int p0){
       DynamicComponentAdapter uDynamicComp = DynamicComponentAdapter.class;
       if (PatchProxy.isSupport(uDynamicComp) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDynamicComp, "32")) {
          return;
       }
       uDynamicComp = this.j;
       if (uDynamicComp != null) {
          uDynamicComp.a(p0);
       }
       return;
    }
    public final void T0(a p0){
       boolean b;
       ComponentTypeList uComponentTy = ComponentTypeList.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "14")) {
          return;
       }
       String str = "component";
       a.p(p0, str);
       DynamicComponentAdapter te = this.e;
       Objects.requireNonNull(te);
       DynamicComponentAdapter obj = PatchProxy.applyOneRefs(p0, te, uComponentTy, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, str);
          obj = null;
          Iterator iterator = te.a.iterator();
          while (iterator.hasNext()) {
             if (a.g(iterator.next().a().getComponentName(), p0.getComponentName())) {
                obj = 1;
             }
          }
          b = obj;
       }
       if (!b) {
          te = this.e;
          obj = this.t;
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoidTwoRefs(obj, p0, te, uComponentTy, "3")) {
             a.p(p0, str);
             str = p0.getComponentName();
             a.o(str, "component.componentName");
             b uob = new b();
             uob.a = obj;
             te.a.add(new a(str, p0, uob));
          }
       }
       return;
    }
    public final void U0(){
       if (PatchProxy.applyVoid(null, this, DynamicComponentAdapter.class, "31")) {
          return;
       }
       this.l = false;
       this.k = true;
       if (true ^ this.f.isEmpty()) {
          y.N0(this.f);
          this.t0(this.f.size());
       }
       return;
    }
    public final void V0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.p = p0;
       return;
    }
    public final void W0(boolean p0){
       this.k = p0;
    }
    public final void X0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "4")) {
          return;
       }
       a.p(p0, "data");
       this.K0();
       this.f.addAll(p0);
       this.k0();
       return;
    }
    public final void Y0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "5")) {
          return;
       }
       a.p(p0, "data");
       this.K0();
       this.f.addAll(p0);
       return;
    }
    public final void Z0(boolean p0){
       this.u = p0;
    }
    public final void a1(k p0){
       this.j = p0;
    }
    public final void b1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.q = p0;
       return;
    }
    public long d0(int p0){
       return ((long)p0 * 1);
    }
    public final void d1(){
       if (PatchProxy.applyVoid(null, this, DynamicComponentAdapter.class, "29")) {
          return;
       }
       this.k = false;
       this.m = true;
       if (this.o != null) {
          return;
       }
       if (this.f.size()) {
          DynamicComponentAdapter tf = this.f;
          if (tf.get((tf.size() - true)) instanceof r$c) {
          label_0051 :
             return;
          }
       }
       r$c uoc = new r$c(this.h);
       PageDyComponentInfo pageDyCompon = new PageDyComponentInfo();
       pageDyCompon.name = "LOAD_COMPLETE";
       uoc.componentData = pageDyCompon;
       this.f.add(uoc);
       this.n0((this.f.size() - true));
       goto label_0051 ;
    }
    public final void e1(){
       if (PatchProxy.applyVoid(null, this, DynamicComponentAdapter.class, "28")) {
          return;
       }
       if (this.k != null && this.m == null) {
          DynamicComponentAdapter ti = this.i;
          if (ti != null) {
             this.k = false;
             this.m = false;
             this.l = true;
             new Handler().post(new DynamicComponentAdapter$b(ti, this));
          }
       }
       return;
    }
    public int f0(int p0){
       String obj;
       PageDyComponentInfo obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicComponentAdapter uDynamicComp = DynamicComponentAdapter.class;
       if (PatchProxy.isSupport(uDynamicComp)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDynamicComp, "21");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.f.get(p0);
       String str = "data[position]";
       a.o(obj, str);
       obj = obj.getComponentName();
       if (obj == null) {
       label_0067 :
          obj1 = this.f.get(p0);
          a.o(obj1, str);
          uDynamicComp = this.e;
          obj1 = obj1.componentData.name;
          a.o(obj1, "data.componentData.name");
          Objects.requireNonNull(uDynamicComp);
          Object obj2 = PatchProxy.applyOneRefs(obj1, uDynamicComp, ComponentTypeList.class, "7");
          if (obj2 != patchProxyRe) {
             obj1 = obj2.intValue();
          }else {
             a.p(obj1, "typeName");
             int i = 0;
             Iterator iterator = uDynamicComp.a.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (a.g(iterator.next().c(), obj1)) {
                   label_00b8 :
                      obj1 = i;
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_00b8 ;
                }
             }
          }
       }else {
          int i1 = obj.hashCode();
          if (i1 != -544435593) {
             if (i1 != -258230158) {
                if (i1 == -89436402 && obj.equals("LOAD_MORE")) {
                   p0 = 0x186a1;
                }else {
                   goto label_0067 ;
                }
             }else if(obj.equals("LOAD_COMPLETE")){
                p0 = 0x2713;
             }else {
                goto label_0067 ;
             }
          }else if(obj.equals("EMPTY_VIEW")){
             p0 = 0x2714;
          }else {
             goto label_0067 ;
          }
       }
       return obj1;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, DynamicComponentAdapter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public void u0(RecyclerView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicComponentAdapter uDynamicComp = DynamicComponentAdapter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDynamicComp, "25")) {
          return;
       }
       a.p(p0, "recyclerView");
       e uoe = PatchProxy.apply(null, this, uDynamicComp, "12");
       if (uoe == patchProxyRe) {
          uoe = this.v.getValue();
       }
       p0.addOnScrollListener(uoe);
       Object obj = PatchProxy.apply(null, this, uDynamicComp, "13");
       if (obj != patchProxyRe) {
       }else {
          obj = this.w.getValue();
       }
       p0.addOnScrollListener(obj);
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       RecyclerView$ViewHolder obj;
       DynamicComponentAdapter ts;
       DynamicComponentAdapter uDynamicComp = DynamicComponentAdapter.class;
       if (PatchProxy.isSupport(uDynamicComp) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uDynamicComp, "18")) {
          return;
       }
       a.p(p0, "viewHolder");
       if (!a.o(p0.getItemViewType())) {
          obj = this.f.get(p1);
          a.o(obj, "data[position]");
          this.P0(p0).a(p0, p1, obj);
          ts = this.s;
          if (ts != null) {
             ts.a(p0, p1, obj);
          }
          if (this.n != null && ((this.getItemCount() - p1) - 1) <= this.r) {
             this.e1();
          }
       }else if(p0.getItemViewType() == 0x2714){
          b uob = this.N0();
          Integer integer = (uob != null)? uob.d(): null;
          if (integer != null && this.t != null) {
             obj = p0.itemView;
             a.o(obj, "viewHolder.itemView");
             ts = this.t;
             a.m(ts);
             obj.setMinimumHeight(ts.getHeight());
             p0.itemView.setBackgroundColor(integer.intValue());
          }
       }
    label_0088 :
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       String obj;
       j oj;
       j oj1;
       Context context;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicComponentAdapter uDynamicComp = DynamicComponentAdapter.class;
       if (PatchProxy.isSupport(uDynamicComp)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDynamicComp, "17");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "parent");
       if (p1 != 0x186a1) {
          switch (p1){
              case 0x2713:
                oj = new j(this.Q0(0x7f0d06a6, p0));
                break;
              case 0x2714:
                View view = this.Q0(R.layout.arg_RES_7f0d0674, p0);
                b uob = this.N0();
                KwaiEmptyStateView$a uoa = (uob != null)? uob.a(): null;
                oj = new h(view, uoa);
                break;
              case 0x2715:
                oj = new j(this.Q0(0x7f0d03fd, p0));
                oj.setIsRecyclable(false);
                break;
              default:
                obj = this.e.b(p1).c();
                DynamicComponentAdapter te = this.e;
                Objects.requireNonNull(te);
                a uoa1 = PatchProxy.applyOneRefs(obj, te, ComponentTypeList.class, "8");
                if (uoa1 != patchProxyRe) {
                }else {
                   a.p(obj, "typeName");
                   Iterator iterator = te.a.iterator();
                   while (true) {
                      if (!iterator.hasNext()) {
                         throw new NoSuchElementException("Collection contains no element matching the predicate.");
                      }
                      a uoa2 = iterator.next();
                      if (a.g(uoa2.c(), obj)) {
                         uoa1 = uoa2.a();
                      }
                   }
                }
                Map map = s0.k(r0.a("EXTRA_KEY_DISABLE_PADDING", Boolean.valueOf(this.u)));
                uDynamicComp = this.s;
                if (uDynamicComp != null) {
                   context = p0.getContext();
                   a.o(context, "parent.context");
                   uDynamicComp.b(context, p0, uoa1, map);
                }
                Context context1 = p0.getContext();
                a.o(context1, "parent.context");
                oj1 = this.e.b(p1).b().b(context1, p0, uoa1, map);
                this.g.add(oj1.itemView);
          }
          return oj1;
       }else {
          oj = new j(this.Q0(0x7f0d0693, p0));
       }
       oj1 = oj;
       goto label_00f1 ;
    }
    public void z0(RecyclerView p0){
       a tag;
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicComponentAdapter.class, "26")) {
          return;
       }
       a.p(p0, "recyclerView");
       Iterator iterator = this.g.iterator();
       a uoa = null;
       while (iterator.hasNext()) {
          tag = iterator.next().getTag(R.id.dynamic_component_tag);
          if (tag instanceof a) {
             uoa = tag;
          }
          if (uoa != null) {
             uoa.moveToState(ComponentStateMachine$ComponentState.DESTROY);
          }
       }
       iterator = this.f.iterator();
       while (iterator.hasNext()) {
          tag = iterator.next();
          if (tag.rootView != null) {
             tag.rootView = uoa;
          }
          tag.onDestroy();
       }
       return;
    }
}
