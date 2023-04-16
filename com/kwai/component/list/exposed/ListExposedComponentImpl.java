package com.kwai.component.list.exposed.ListExposedComponentImpl;
import ec5.g;
import ec5.h;
import ec5.q;
import ec5.c;
import java.lang.Object;
import crd.a;
import gc5.d$a;
import ec5.a;
import gc5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.List;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Collection;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import java.lang.Number;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kwai.component.list.exposed.ListExposedComponentImpl$1;
import androidx.lifecycle.LifecycleObserver;
import java.util.Iterator;
import brd.t;
import com.kwai.component.list.exposed.behavior.a;
import erd.r;
import ec5.l;
import ec5.m;
import erd.g;
import crd.b;
import com.kwai.component.list.exposed.behavior.b;
import ec5.i;
import ec5.n;
import com.kwai.component.list.exposed.behavior.c;
import ec5.j;
import ec5.o;
import com.kwai.component.list.exposed.behavior.d;
import ec5.k;
import ec5.p;

public final class ListExposedComponentImpl implements g	// class@0009a5
{
    public final c a;
    public final a b;
    public final RecyclerView c;
    public final BaseFragment d;
    public final q e;
    public final a f;
    public final d$a g;

    public void ListExposedComponentImpl(h p0,q p1,c p2){
       super();
       this.f = new a();
       this.g = new d$a();
       this.b = new a(p0);
       this.c = p0.j;
       this.d = p0.k;
       this.e = p1;
       this.a = p2;
    }
    public g a(d p0){
       String str = "3";
       ListExposedComponentImpl obj = PatchProxy.applyOneRefs(p0, this, ListExposedComponentImpl.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, d$a.class, str)) {
          obj.a.add(p0);
       }
       return this;
    }
    public void b(d p0){
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, ListExposedComponentImpl.class, str)) {
          return;
       }
       ListExposedComponentImpl tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, d$a.class, str)) {
          tg.a.remove(p0);
       }
       return;
    }
    public void c(boolean p0,boolean p1){
       float f;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ListExposedComponentImpl listExposedC = ListExposedComponentImpl.class;
       if (PatchProxy.isSupport(listExposedC) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, listExposedC, "2")) {
          return;
       }
       a i = this.b.i;
       if (i.isEmpty()) {
          return;
       }
       ArrayList uArrayList = new ArrayList(i);
       this.g.b(uArrayList);
       if (p0 || p1) {
          ListExposedComponentImpl tc = this.c;
          RecyclerView$LayoutManager obj = PatchProxy.applyOneRefs(tc, this, listExposedC, "5");
          if (obj != patchProxyRe) {
          }else {
             obj = tc.getLayoutManager();
             int[] ointArray1 = null;
             boolean b = -1;
             if (obj instanceof LinearLayoutManager) {
                i1 = obj.c();
             }else if(obj instanceof StaggeredGridLayoutManager){
                int[] ointArray2 = tc.getLayoutManager().findLastVisibleItemPositions(ointArray1);
                int len = ointArray2.length;
                int i2 = -1;
                for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                   i2 = Math.max(ointArray2[i3], i2);
                }
                i1 = i2;
             }else {
                i1 = -1;
             }
             if (i1 == b) {
                obj = ointArray1;
             }else {
                obj = obj.findViewByPosition(i1);
             }
          }
          RecyclerView$LayoutManager layoutManage = this.c.getLayoutManager();
          if (obj != null && layoutManage != null) {
             ListExposedComponentImpl tg = this.g;
             layoutManage = (!layoutManage.getLayoutDirection())? true: false;
             if (PatchProxy.isSupport(listExposedC)) {
                View obj1 = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(layoutManage), this, listExposedC, "6");
                if (obj1 != patchProxyRe) {
                   f = obj1.floatValue();
                }else {
                label_00aa :
                   int[] ointArray = new int[2];
                   obj.getLocationInWindow(ointArray);
                   if (ointArray[0] == ointArray[1] && !ointArray[0]) {
                      f = 0;
                   }else {
                      obj1 = obj.getRootView();
                      f = (layoutManage)? Math.min(0x3f800000, ((float)(obj1.getWidth() - ointArray[0]) / ((float)obj.getWidth() * 0x3f800000))): Math.min(0x3f800000, ((float)(obj1.getHeight() - ointArray[1]) / ((float)obj.getHeight() * 0x3f800000)));
                   }
                }
             }else {
                goto label_00aa ;
             }
             tg.a(f, uArrayList);
          }
       }
    label_00f0 :
       i.clear();
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, ListExposedComponentImpl.class, "1")) {
          return;
       }
       this.d.getLifecycle().addObserver(new ListExposedComponentImpl$1(this));
       Iterator iterator = this.b.h.iterator();
       while (iterator.hasNext()) {
          ItemExposedBehavior itemExposedB = iterator.next();
          ListExposedComponentImpl tf = this.f;
          Objects.requireNonNull(itemExposedB);
          t ot = PatchProxy.apply(null, itemExposedB, ItemExposedBehavior.class, "1");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = itemExposedB.a.hide().filter(a.b);
          }
          tf.c(ot.subscribe(new l(this), new m(this)));
          tf = this.f;
          ot = PatchProxy.apply(null, itemExposedB, ItemExposedBehavior.class, "2");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = itemExposedB.a.hide().filter(b.b);
          }
          tf.c(ot.subscribe(new i(this), new n(this)));
          tf = this.f;
          ot = PatchProxy.apply(null, itemExposedB, ItemExposedBehavior.class, "3");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = itemExposedB.a.hide().filter(c.b);
          }
          tf.c(ot.subscribe(new j(this), new o(this)));
          tf = this.f;
          ot = PatchProxy.apply(null, itemExposedB, ItemExposedBehavior.class, "4");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = itemExposedB.a.hide().filter(d.b);
          }
          tf.c(ot.subscribe(new k(this), new p(this)));
       }
       return;
    }
}
