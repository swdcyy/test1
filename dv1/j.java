package dv1.j;
import lnc.a1;
import com.kuaishou.live.common.core.component.newpendant.top.helper.LiveTopPendantLayout;
import lp3.e;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import dv1.h;
import ks5.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import java.util.Map;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopRightPendantFlipperConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.c;
import android.content.Context;
import android.widget.RelativeLayout;
import dv1.c;
import z1.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Runnable;
import dv1.g;
import dv1.f;
import va1.n0;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import bv1.b;
import java.lang.Number;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.q;
import android.widget.LinearLayout;
import java.lang.RuntimeException;
import java.lang.Throwable;
import dv1.j$a;
import dv1.i;
import android.view.View$OnLayoutChangeListener;
import dv1.d;
import android.view.ViewParent;
import ks5.i;
import lp3.c;
import dv1.b;
import dv1.e;

public class j	// class@002036
{
    public c a;
    public final LiveTopPendantLayout b;
    public final e c;
    public final List d;
    public final Map e;
    public final Map f;
    public final Runnable g;
    public final ArrayList h;
    public boolean i;
    public static final int j;
    public static final int k;

    static {
       j.j = a1.e(8.00f);
       j.k = a1.e(10.00f);
    }
    public void j(LiveTopPendantLayout p0,e p1){
       super();
       this.d = new ArrayList();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new h(this);
       this.h = new ArrayList();
       this.i = false;
       this.b = p0;
       this.c = p1;
    }
    public static void a(j p0,m p1){
       p0.h(p1);
    }
    public void b(m p0){
       Iterator iterator;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "12")) {
          return;
       }
       if (p0 != null && p0.b(this.b) != null) {
          if (!this.e.containsKey(p0)) {
             this.e.put(p0, Boolean.FALSE);
          }
          if (!this.d.contains(p0)) {
             this.d.add(p0);
          }
          if (b.a) {
             int i = 2;
             if (p0.m() == i) {
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, this, oj, "13")) {
                   List list = PatchProxy.apply(objArray, this, oj, "14");
                   if (list != PatchProxyResult.class) {
                   }else {
                      list = this.c();
                      iterator = list.iterator();
                      while (iterator.hasNext()) {
                         if (iterator.next().m() == 1) {
                            iterator.remove();
                         }
                      }
                      b.f(list);
                   }
                   int topRightPend = LiveTopRightPendantFlipperConfig.getTopRightPendantMaxCount();
                   if (list.size() > topRightPend) {
                      if (this.a == null) {
                         topRightPend = topRightPend - 1;
                      }
                      list = list.subList(topRightPend, list.size());
                      b.S(LiveLogTag.LIVE_TOP_PENDANT.appendTag("FlipperPendant"), "tryAddPendantToFlipper", "needFlipperItemNum", Integer.valueOf(list.size()));
                      if (this.a == null) {
                         c uoc = new c(this.b.getContext(), this.c, new c(this));
                         this.a = uoc;
                         this.d.add(0, uoc);
                         this.e.put(this.a, Boolean.FALSE);
                         j ta = this.a;
                         Objects.requireNonNull(ta);
                         if (!PatchProxy.applyVoidOneRefs(list, ta, c.class, "6")) {
                            uoc = ta.a;
                            Objects.requireNonNull(uoc);
                            if (!PatchProxy.applyVoidOneRefs(list, uoc, LiveTopPendantViewFlipper.class, "1")) {
                               uoc.g.addAll(list);
                               b.g(uoc.g, i);
                            }
                         }
                      }else {
                         iterator = list.iterator();
                         while (iterator.hasNext()) {
                            this.a.t(iterator.next());
                         }
                      }
                      this.d.removeAll(list);
                   }
                }
             }
          }
          b.Z(LiveLogTag.LIVE_TOP_PENDANT, p0.h()+"addPendant, begin invalidate...");
          this.b.removeCallbacks(this.g);
          this.b.post(this.g);
       }
       return;
    }
    public final List c(){
       boolean b;
       ArrayList obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = this.d.size();
       int i1 = 0;
       while (i1 < i) {
          m om = this.d.get(i1);
          int[] ointArray = om.q();
          Object obj1 = PatchProxy.applyOneRefs(ointArray, this, j.class, "2");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(ointArray == null){
             int len = ointArray.length;
             int i2 = 0;
             while (true) {
                if (i2 < len) {
                   int i3 = ointArray[i2];
                   Iterator iterator = this.d.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (iterator.next().o() == i3) {
                            b = true;
                         }
                      }else {
                         i2 = i2 + 1;
                      }
                   }
                }
             }
          }
          b = false;
          if (!b) {
             obj.add(om);
          }
          i1 = i1 + 1;
       }
       return obj;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "17")) {
          return;
       }
       j ta = this.a;
       if (ta == null) {
          return;
       }
       Objects.requireNonNull(ta);
       m om = PatchProxy.apply(objArray, ta, c.class, "9");
       if (om != PatchProxyResult.class) {
       }else {
          om = ta.a.getHighestPriorityItem();
       }
       if (om != null) {
          this.a.u(om, new g(this, om), new f(this));
       }
       return;
    }
    public void e(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "18")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_TOP_PENDANT, p0.h()+"notifyDetach, innerRemoveTopPendant");
       this.i(p0);
       this.d.remove(p0);
       this.e.remove(p0);
       this.f.remove(p0.b(this.b));
       this.f();
       return;
    }
    public void f(){
       View view;
       j$a obj;
       int i3;
       ArrayList uArrayList3;
       int i4;
       int i5;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "9")) {
          return;
       }
       if (this.b.getVisibility()) {
          b.c0(LiveLogTag.LIVE_TOP_PENDANT, "hide", "reason", "container not visible");
          return;
       }else {
          b.f(this.d);
          int i = 0;
          this.b.setPadding(i, i, i, i);
          int i1 = 2;
          int i2 = n0.f() - (j.k * 2);
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          ArrayList uArrayList2 = new ArrayList();
          Iterator iterator = this.c().iterator();
          j oj1 = 1;
          while (iterator.hasNext()) {
             m om = iterator.next();
             if (!oj1) {
                if (b.a && om.m() == i1) {
                   uArrayList2.add(om);
                }else {
                   b.Z(LiveLogTag.LIVE_TOP_PENDANT, om.h()+"notifyDetach, width not enough 1");
                   this.i(om);
                }
             }else if(om.b(this.b).getLayoutParams() == null){
                om.b(this.b).setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
             }
             view = om.b(this.b);
             obj = PatchProxy.applyOneRefs(view, objArray, b.class, "1");
             if (obj != PatchProxyResult.class) {
                i3 = obj.intValue();
             }else if(view == null || view.getVisibility() == 8){
                i3 = 0;
             }else {
                b.a(view);
                if (!view.getMeasuredWidth()) {
                   view.measure(i, i);
                }
                i3 = view.getMeasuredWidth();
             }
             if (i2 < i3 && (om.l() > 0 && i2 > om.l())) {
                ViewGroup$MarginLayoutParams layoutParams = om.b(this.b).getLayoutParams();
                layoutParams.width = om.l();
                om.b(this.b).setLayoutParams(layoutParams);
                i3 = om.l();
                oj1 = false;
             }else if(i2 < i3){
                if (b.a && om.m() == i1) {
                   uArrayList2.add(om);
                }else {
                   b.Z(LiveLogTag.LIVE_TOP_PENDANT, om.h()+"notifyDetach, width not enough 2");
                   this.i(om);
                }
                oj1 = null;
             }
             if (om.m() == 1) {
                uArrayList.add(om);
             }else {
                uArrayList1.add(om);
             }
             i3 = i3 + j.j;
             i2 = i2 - i3;
             b.c0(LiveLogTag.LIVE_TOP_PENDANT, "invalidate", "show", Integer.valueOf(om.o()));
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList, this, oj, "6")) {
             if (q.f(uArrayList)) {
                this.b.getLeftPendantLayout().removeAllViews();
             }else {
                uArrayList3 = new ArrayList();
                i4 = this.b.getLeftPendantLayout().getChildCount();
                for (i5 = 0; i5 < i4; i5 = i5 + 1) {
                   uArrayList3.add(this.b.getLeftPendantLayout().getChildAt(i5));
                }
                b.g(uArrayList, 1);
                Iterator iterator3 = uArrayList3.iterator();
                while (iterator3.hasNext()) {
                   View view3 = iterator3.next();
                   if (!this.g(uArrayList, view3)) {
                      this.b.getLeftPendantLayout().removeView(view3);
                   }
                }
                i4 = uArrayList.size();
                if (i4 > 0) {
                   i5 = 0;
                   while (i5 < i4) {
                      view = uArrayList.get(i5).b(this.b);
                      if (!uArrayList3.contains(view)) {
                         try{
                            this.b.a(view, i5);
                         }catch(java.lang.Exception e0){
                            throw new RuntimeException("addLeftPendantError:layoutArea="+uArrayList.get(i5).n()+"bizPriority="+uArrayList.get(i5).o(), e0);
                         }
                      }
                      if (this.f.get(view) == null) {
                         obj = new j$a(this, objArray);
                         view.addOnLayoutChangeListener(obj);
                         this.f.put(view, obj);
                      }
                      this.h(uArrayList.get(i5));
                      if (!i5) {
                         if (uArrayList.get(i5).c()) {
                            b.e(view, i, j.j);
                         }else {
                            b.e(view, j.k, j.j);
                         }
                      }else {
                         b.e(view, i, j.j);
                      }
                      i5 = i5 + 1;
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList1, this, oj, "8")) {
             if (q.f(uArrayList1)) {
                this.b.getRightPendantLayout().removeAllViews();
             }else {
                uArrayList3 = new ArrayList();
                int childCount = this.b.getRightPendantLayout().getChildCount();
                for (i4 = 0; i4 < childCount; i4 = i4 + 1) {
                   uArrayList3.add(this.b.getRightPendantLayout().getChildAt(i4));
                }
                b.g(uArrayList1, i1);
                Iterator iterator2 = uArrayList3.iterator();
                while (iterator2.hasNext()) {
                   View view1 = iterator2.next();
                   if (!this.g(uArrayList1, view1)) {
                      this.b.getRightPendantLayout().removeView(view1);
                      iterator2.remove();
                   }
                }
                childCount = uArrayList1.size();
                if (childCount > 0) {
                   i1 = 0;
                   while (i1 < childCount) {
                      View view2 = uArrayList1.get(i1).b(this.b);
                      if (!uArrayList3.contains(view2)) {
                         float f = 0x3f800000;
                         try{
                            view2.setAlpha(f);
                            view2.setScaleX(f);
                            view2.setScaleY(f);
                            view2.setVisibility(i);
                            j ta = this.a;
                            if (ta != null) {
                               ta.u(uArrayList1.get(i1), objArray, new d(this));
                            }
                            if (view2.getParent() == null && i1 <= this.b.getRightPendantLayout().getChildCount()) {
                               this.b.b(view2, i1);
                               uArrayList3.add(view2);
                            }
                         }catch(java.lang.Exception e0){
                            throw new RuntimeException("addRightPendantError:layoutArea="+uArrayList1.get(i1).n()+"bizPriority="+uArrayList1.get(i1).o(), e0);
                         }
                      }
                   label_0341 :
                      if (this.f.get(view2) == null) {
                         j$a uoa = new j$a(this, objArray);
                         view2.addOnLayoutChangeListener(uoa);
                         this.f.put(view2, uoa);
                      }
                      this.h(uArrayList1.get(i1));
                      i5 = childCount - 1;
                      if (i1 == i5) {
                         if (uArrayList1.get(i1).c()) {
                            b.e(view2, j.j, i);
                         }else {
                            b.e(view2, j.j, j.k);
                         }
                      }else {
                         b.e(view2, j.j, i);
                      }
                      i1 = i1 + 1;
                   }
                }
             }
          }
          if (uArrayList1.size() < LiveTopRightPendantFlipperConfig.getTopRightPendantMaxCount()) {
             i = true;
          }
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(uArrayList2, Boolean.valueOf(i), this, oj, "10")) {
             if (!uArrayList2.isEmpty()) {
                if (this.a == null) {
                   this.a = new c(this.b.getContext(), this.c, new c(this));
                   b.S(LiveLogTag.LIVE_TOP_PENDANT.appendTag("FlipperPendant"), "invalid addToFlipperPendant", "needReInvalidate", "TRUE");
                   this.b(this.a);
                }
                Iterator iterator1 = uArrayList2.iterator();
                while (iterator1.hasNext()) {
                   this.a.t(iterator1.next());
                }
                this.d.removeAll(uArrayList2);
             }else if(this.a != null && i){
                this.d();
             }
          }
          return;
       }
    }
    public final boolean g(List p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (p1 == p0.get(i1).b(this.b)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public final void h(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       if (Boolean.FALSE.equals(this.e.get(p0))) {
          p0.d(this.b);
          this.e.put(p0, Boolean.TRUE);
       }
       return;
    }
    public final void i(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
          return;
       }
       if (!this.e.containsKey(p0)) {
          return;
       }
       if (this.e.get(p0).booleanValue()) {
          p0.e(this.b);
          this.e.put(p0, Boolean.FALSE);
       }
       return;
    }
    public void j(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "15")) {
          return;
       }
       j tc = this.c;
       if (tc != null && !tc.b()) {
          this.c.a(i.class).oo(p0);
       }
       if (p0.m() == 1) {
          this.b.getLeftPendantLayout().removeView(p0.b(this.b));
          this.e(p0);
       }else if(p0 == this.a){
          this.b.getRightPendantLayout().removeView(p0.b(this.b));
          this.e(p0);
          this.a = null;
       }else if(this.d.contains(p0)){
          this.b.getRightPendantLayout().removeView(p0.b(this.b));
          this.e(p0);
          if (this.i == null) {
             this.d();
          }
       }else {
          tc = this.a;
          if (tc != null) {
             tc.u(p0, new b(this), new e(this));
          }
       }
       return;
    }
}
