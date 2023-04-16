package com.yxcorp.gifshow.autoplay.dispatch.a;
import com.yxcorp.gifshow.autoplay.dispatch.b$a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import r99.i;
import java.lang.Object;
import r99.a;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r99.d;
import com.yxcorp.gifshow.autoplay.dispatch.b;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.autoplay.widget.a;
import r99.b;
import com.yxcorp.gifshow.autoplay.widget.a$a;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import java.util.List;
import android.view.ViewGroup;
import u99.d;
import r99.c;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.lang.Iterable;
import s99.b;
import s99.f;
import java.lang.Number;
import java.lang.Boolean;
import java.util.ArrayList;
import android.view.View;
import java.util.Collection;
import java.util.Map;

public class a implements b$a	// class@001be6
{
    public final a a;
    public final a b;
    public final RecyclerView c;
    public i d;
    public final int e;
    public final int f;
    public b g;
    public BaseFragment h;
    public final Map i;
    public static boolean j;

    public void a(RecyclerView p0,BaseFragment p1,i p2,int p3,int p4){
       super();
       this.a = new a();
       this.b = new a();
       this.i = new HashMap();
       this.c = p0;
       this.h = p1;
       this.d = p2;
       this.e = p3;
       Object[] objArray = null;
       if (p2 == null) {
          d uod = PatchProxy.apply(objArray, this, a.class, "7");
          if (uod != PatchProxyResult.class) {
          }else {
             uod = new d(this);
          }
          this.d = uod;
       }
       this.f = p4;
       if (!PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          b uob = new b(p3, this, p4);
          this.g = uob;
          p0.addOnScrollListener(uob);
          if (p0.getLayoutManager() instanceof a) {
             p0.getLayoutManager().C(new b(this));
          }
       }
       return;
    }
    public void a(RecyclerView p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "12")) {
          return;
       }
       this.c("scrollListener", p0, p1);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.c(p0, this.c, 1);
       return;
    }
    public void c(String p0,RecyclerView p1,int p2){
       a uoa = this;
       RecyclerView recyclerView = p1;
       int i = p2;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "6")) {
          return;
       }
       if (uoa.c != null && uoa.h.isResumed()) {
          uoa.a.a(uoa.c);
          boolean b = false;
          boolean b1 = true;
          a uoa1 = (i == 2 || i == -2)? 1: null;
          List list = (uoa1 && uoa.d.e())? uoa.e(recyclerView, recyclerView, i, b): uoa.e(uoa.c, recyclerView, i, b1);
          HashMap hashMap = new HashMap();
          hashMap.put("autoPlayCount", String.valueOf(list.size()));
          hashMap.put("scrollDirection", String.valueOf(p2));
          hashMap.put("dispatchSource", p0);
          hashMap.put("recyclerViewID", String.valueOf(p1.getId()));
          d.h("AutoPlayFocusDispatcher", "dispatchFocus", hashMap);
          List list1 = Ordering.from(new c(uoa)).sortedCopy(list);
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          while (i1 < list1.size()) {
             Object obj = list1.get(i1);
             if (i2 >= uoa.d.d(recyclerView)) {
                break ;
             }else {
                a c = uoa.c;
                int i4 = a.j ^ 0x01;
                Object obj1 = obj;
                if (obj.t(c, i3, c.getChildCount(), p2, i4)) {
                   HashMap hashMap1 = new HashMap();
                   hashMap1.put("focusIndex", String.valueOf(i1));
                   hashMap1.put("itemWeight", String.valueOf(uoa.d(obj1)));
                   d.h("AutoPlayFocusDispatcher", "dispatchFocus", hashMap1);
                   i2 = i2 + 1;
                }
                i3 = i3 + 1;
                i1 = i1 + 1;
                obj1 = 1;
             }
          }
          d.g("AutoPlayFocusDispatcher", "dispatchFocus", "dispatchCount", String.valueOf(i2));
          if (!a.j && list1.size() > 0) {
             a.j = true;
          }
          while (i1 < list1.size()) {
             d.g("AutoPlayFocusDispatcher", "dispatchFocus", "interruptIndex", String.valueOf(i1));
             list1.get(i1).f();
             i1 = i1 + 1;
          }
       }
       return;
    }
    public final float d(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return p0.getItemWeight();
    }
    public final List e(RecyclerView p0,RecyclerView p1,int p2,boolean p3){
       ArrayList obj;
       a this;
       boolean b;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, a.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          int i1 = (p1.equals(p0))? this.d.b(p2, childCount, i): i;
          View childAt = p0.getChildAt(i1);
          this = 1;
          if (p3) {
             a obj1 = PatchProxy.applyOneRefs(childAt, this, a.class, "11");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(childAt != null){
                obj1 = this.f;
                if (obj1 != null && childAt.findViewById(obj1) instanceof RecyclerView) {
                   b = true;
                }
             }
             b = false;
             if (b) {
                obj.addAll(this.e(childAt.findViewById(this.f), p1, p2, false));
                if (!PatchProxy.applyVoidOneRefs(childAt, this, a.class, "13")) {
                   RecyclerView recyclerView = childAt.findViewById(this.f);
                   if (!this.i.containsKey(recyclerView)) {
                      b uob = new b(this.e, this, false);
                      this.i.put(recyclerView, uob);
                      recyclerView.addOnScrollListener(uob);
                   }
                }
             }else {
             label_009e :
                obj1 = PatchProxy.applyOneRefs(childAt, this, a.class, "10");
                if (obj1 != PatchProxyResult.class) {
                   this = obj1.booleanValue();
                }else if(childAt != null){
                   obj1 = this.e;
                   if (obj1 == null || !childAt.findViewById(obj1) instanceof b) {
                   }
                }else {
                }
                if (this) {
                   obj.add(childAt.findViewById(this.e));
                }else if(childAt instanceof b){
                   obj.add(childAt);
                }
             }
          }else {
             goto label_009e ;
          }
       label_00d4 :
          i = i + 1;
       }
       return obj;
    }
}
