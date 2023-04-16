package com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$a;
import nsd.u;
import java.util.BitSet;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeResumeChanged$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeResume$2;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeReallySelectChanged$2;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeReallySelect$2;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeReallyVisibleChanged$2;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeReallyVisible$2;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeActiveChanged$2;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeActive$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import gka.c0;
import java.util.Objects;
import gka.d0;
import brd.t;
import java.util.ArrayList;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$b;
import erd.o;
import java.util.List;
import androidx.fragment.app.FragmentActivity;
import java.lang.IllegalStateException;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$c;
import java.lang.Iterable;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$d;
import erd.r;
import brd.w;

public final class FragmentCompositeLifecycleState	// class@0017a6
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final RxFragment i;
    public static final BitSet j;
    public static final BitSet k;
    public static final BitSet l;
    public static final BitSet m;
    public static final FragmentCompositeLifecycleState$a n;

    static {
       FragmentCompositeLifecycleState.n = new FragmentCompositeLifecycleState$a(null);
       BitSet uBitSet = new BitSet();
       uBitSet.set(1);
       uBitSet.set(3);
       uBitSet.set(5);
       FragmentCompositeLifecycleState.j = uBitSet;
       uBitSet = new BitSet();
       uBitSet.set(3);
       FragmentCompositeLifecycleState.k = uBitSet;
       uBitSet = new BitSet();
       uBitSet.set(5);
       FragmentCompositeLifecycleState.l = uBitSet;
       uBitSet = new BitSet();
       uBitSet.set(1);
       FragmentCompositeLifecycleState.m = uBitSet;
    }
    public void FragmentCompositeLifecycleState(RxFragment p0){
       a.p(p0, "fragment");
       super();
       this.i = p0;
       this.a = s.c(new FragmentCompositeLifecycleState$observeResumeChanged$2(this));
       this.b = s.c(new FragmentCompositeLifecycleState$observeResume$2(this));
       this.c = s.c(new FragmentCompositeLifecycleState$observeReallySelectChanged$2(this));
       this.d = s.c(new FragmentCompositeLifecycleState$observeReallySelect$2(this));
       this.e = s.c(new FragmentCompositeLifecycleState$observeReallyVisibleChanged$2(this));
       this.f = s.c(new FragmentCompositeLifecycleState$observeReallyVisible$2(this));
       this.g = s.c(new FragmentCompositeLifecycleState$observeActiveChanged$2(this));
       this.h = s.c(new FragmentCompositeLifecycleState$observeActive$2(this));
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, FragmentCompositeLifecycleState.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(FragmentCompositeLifecycleState.j);
    }
    public final boolean b(BitSet p0){
       FragmentCompositeLifecycleState ti;
       boolean b;
       boolean b1;
       FragmentCompositeLifecycleState uFragmentCom1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uFragmentCom, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0.get(1) && !this.i.isResumed()) {
          return false;
       }
       if (p0.get(3)) {
          ti = this.i;
          c0 obj1 = PatchProxy.applyOneRefs(ti, this, uFragmentCom, "25");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             while (true) {
                if (ti != null) {
                   obj1 = (!ti instanceof c0)? null: ti;
                   if (obj1 != null && !obj1.K0()) {
                      b = false;
                   }else {
                      ti = ti.getParentFragment();
                   }
                }else {
                   b = true;
                }
             }
          }
          if (!b) {
             return false;
          }
       }else if(p0.get(2)){
          ti = this.i;
          Objects.requireNonNull(ti, "null cannot be cast to non-null type com.yxcorp.gifshow.fragment.SelectablePage");
          if (!ti.K0()) {
             return false;
          }
       }
       if (p0.get(5)) {
          FragmentCompositeLifecycleState ti1 = this.i;
          Object obj2 = PatchProxy.applyOneRefs(ti1, this, uFragmentCom, "26");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             while (true) {
                if (ti1 != null) {
                   d0 uod0 = (!ti1 instanceof d0)? null: ti1;
                   if (uod0 != null && !uod0.Ke()) {
                      b1 = false;
                   }else {
                      ti1 = ti1.getParentFragment();
                   }
                }else {
                   b1 = true;
                }
             }
          }
          if (!b1) {
             return false;
          }
       }else if(p0.get(4) && this.i.isHidden()){
          return false;
       }
       return 1;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, FragmentCompositeLifecycleState.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(FragmentCompositeLifecycleState.k);
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, FragmentCompositeLifecycleState.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(FragmentCompositeLifecycleState.l);
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, FragmentCompositeLifecycleState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(FragmentCompositeLifecycleState.m);
    }
    public final t f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       Object obj = PatchProxy.apply(null, this, uFragmentCom, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFragmentCom, "20");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.h.getValue();
       }
       return obj1;
    }
    public final t g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       Object obj = PatchProxy.apply(null, this, uFragmentCom, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFragmentCom, "19");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.g.getValue();
       }
       return obj1;
    }
    public final t h(BitSet p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, uFragmentCom, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       if (p0.get(1)) {
          obj.add(this.i.m().map(FragmentCompositeLifecycleState$b.b));
       }
       if (p0.get(3)) {
          ArrayList uArrayList = PatchProxy.apply(null, this, uFragmentCom, "23");
          if (uArrayList != patchProxyRe) {
          }else if(this.i.getParentFragment() != null || this.i.getActivity() != null){
             uArrayList = new ArrayList();
             for (FragmentCompositeLifecycleState ti2 = this.i; ti2 != null; ti2 = ti2.getParentFragment()) {
                Object[] objArray1 = (!ti2 instanceof c0)? null: ti2;
                if (objArray1 != null) {
                   uArrayList.add(objArray1.Z0());
                }
             }
          }else {
             throw new IllegalStateException("必须在当前 fragment onCreate 以后调用");
          }
          obj.addAll(uArrayList);
       }else if(p0.get(2)){
          FragmentCompositeLifecycleState ti3 = this.i;
          Objects.requireNonNull(ti3, "null cannot be cast to non-null type com.yxcorp.gifshow.fragment.SelectablePage");
          obj.add(ti3.Z0());
       }
       if (p0.get(5)) {
          ArrayList uArrayList1 = PatchProxy.apply(null, this, uFragmentCom, "24");
          if (uArrayList1 != patchProxyRe) {
          }else {
             uArrayList1 = new ArrayList();
             for (FragmentCompositeLifecycleState ti = this.i; ti != null; ti = ti.getParentFragment()) {
                Object[] objArray = (!ti instanceof d0)? null: ti;
                if (objArray != null) {
                   uArrayList1.add(objArray.m5());
                }
             }
          }
          obj.addAll(uArrayList1);
       }else if(p0.get(4)){
          FragmentCompositeLifecycleState ti1 = this.i;
          Objects.requireNonNull(ti1, "null cannot be cast to non-null type com.yxcorp.gifshow.fragment.VisiblePage");
          obj.add(ti1.m5());
       }
       if (obj.size() <= 0) {
          ot = t.empty();
          a.o(ot, "Observable.empty\(\)");
          return ot;
       }else if(obj.size() <= 1){
          return CollectionsKt___CollectionsKt.m2(obj);
       }else {
          ot = t.combineLatest(obj, FragmentCompositeLifecycleState$c.b).takeUntil(this.i.m().filter(FragmentCompositeLifecycleState$d.b));
          a.o(ot, "Observable\n        .comb… FragmentEvent.DESTROY }\)");
          return ot;
       }
    }
    public final t i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       Object obj = PatchProxy.apply(null, this, uFragmentCom, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFragmentCom, "10");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.d.getValue();
       }
       return obj1;
    }
    public final t j(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       Object obj = PatchProxy.apply(null, this, uFragmentCom, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFragmentCom, "9");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.c.getValue();
       }
       return obj1;
    }
    public final t k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       Object obj = PatchProxy.apply(null, this, uFragmentCom, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFragmentCom, "5");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.b.getValue();
       }
       return obj1;
    }
    public final t l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentCompositeLifecycleState uFragmentCom = FragmentCompositeLifecycleState.class;
       Object obj = PatchProxy.apply(null, this, uFragmentCom, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFragmentCom, "4");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.a.getValue();
       }
       return obj1;
    }
}
