package i61.j$a;
import x61.a;
import i61.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.component.widget.a;
import java.util.Map;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.StringBuilder;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import z61.b;
import ekd.q;
import java.util.List;
import i61.i;
import ok.o;
import com.google.common.collect.Maps;
import c71.d;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$a;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildren;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildrenItem;
import com.google.common.collect.Maps$d;
import java.util.Objects;
import com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelGroup;
import z61.i;
import qp.b;
import java.util.HashMap;
import java.lang.Number;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Iterable;
import qk.m;
import i61.d;
import com.google.common.base.Optional;
import com.google.gson.JsonObject;
import androidx.lifecycle.LifecycleOwner;

public class j$a implements a	// class@00283d
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public boolean E1(int p0){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a.f.E1(p0);
    }
    public void M0(int p0){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.d(p0);
       return;
    }
    public int M2(){
       return this.a.o;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "3")) {
          return;
       }
       this.a.a();
       return;
    }
    public void O0(int p0){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       MutableLiveData mutableLiveD = this.a.p.remove(Integer.valueOf(p0));
       if (mutableLiveD != null) {
          mutableLiveD.removeObserver(this.a.s);
          this.a.f(false, "unregisterBottomBarItem id: "+p0);
       }
       return;
    }
    public boolean R3(){
       j obj = PatchProxy.apply(null, this, j$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.b;
       boolean b = (obj != null && (obj.getDialog() != null && this.a.b.getDialog().isShowing()))? true: false;
       return b;
    }
    public int[] T0(int p0,int p1){
       MutableLiveData obj;
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.p.get(Integer.valueOf(p0));
       if (obj != null && (obj.getValue() == null || !obj.getValue().mIsVisible.booleanValue())) {
          return null;
       }else {
          return this.a.f.I1(obj.getValue().mIsRightAlign, p0, p1);
       }
    }
    public void m4(int p0,boolean p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "9")) {
          return;
       }
       if (!q.h(this.a.p)) {
          MutableLiveData mutableLiveD = this.a.p.get(Integer.valueOf(p0));
          if (mutableLiveD != null && mutableLiveD.getValue() != null) {
             b value = mutableLiveD.getValue();
             value.mEnableBreathAnimator = p1;
             mutableLiveD.setValue(value);
          }
       }
       return;
    }
    public List o5(int p0){
       Map obj;
       Object obj1;
       List list1;
       j$a uoa = j$a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       uoa = this.a;
       if (uoa.n == null || q.h(uoa.p)) {
          return new ArrayList();
       }else {
          obj = Maps.i(this.a.p, new i(this));
          j n = this.a.n;
          List list = null;
          if (PatchProxy.isSupport(d.class)) {
             obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), n, obj, null, d.class, "1");
             if (obj1 != patchProxyRe) {
             }else if(!q.h(n.mButtonLayout)){
                LiveBottomBarConfigResponse$a uoa1 = n.mButtonLayout.get(Integer.valueOf(p0));
                if (uoa1 != null && !q.f(uoa1.mChildren)) {
                   obj1 = PatchProxy.applyTwoRefs(uoa1, obj, list, d.class, "2");
                   if (obj1 != patchProxyRe) {
                   }else {
                      obj1 = new ArrayList();
                      Iterator iterator1 = uoa1.mChildren.iterator();
                      while (iterator1.hasNext()) {
                         Iterator iterator2 = iterator1.next().mButtons.iterator();
                         while (iterator2.hasNext()) {
                            LiveBottomBarConfigResponse$LiveBottomBarLayoutChildrenItem liveBottomBa = iterator2.next();
                            MutableLiveData mutableLiveD1 = obj.get(Integer.valueOf(liveBottomBa.mBottomBarItemId));
                            if (mutableLiveD1 != null && (mutableLiveD1.getValue() != null && mutableLiveD1.getValue().mIsVisible.booleanValue())) {
                               obj1.add(Integer.valueOf(liveBottomBa.mBottomBarItemId));
                            }
                         }
                      }
                   }
                }
             }
             obj1 = new ArrayList();
          }else {
             goto label_0058 ;
          }
          uoa = this.a;
          Objects.requireNonNull(uoa);
          n = j.class;
          if (PatchProxy.isSupport(n)) {
             list1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), uoa, n, "18");
             if (list1 != patchProxyRe) {
             }else {
             label_00fa :
                obj = uoa.f.G1();
                List list2 = (!q.h(obj))? obj.get(Integer.valueOf(p0)): list;
                if (q.f(list2)) {
                   list1 = list;
                }else {
                   list1 = new LiveBottomBarPanelGroup();
                   list1.mItems = new ArrayList(list2);
                }
             }
          }else {
             goto label_00fa ;
          }
          ArrayList uArrayList = new ArrayList();
          if (list1 != null && !q.f(list1.mItems)) {
             Iterator iterator = list1.mItems.iterator();
             while (iterator.hasNext()) {
                MutableLiveData mutableLiveD = iterator.next();
                if (mutableLiveD == null || mutableLiveD.getValue() == null) {
                   continue ;
                }
                uArrayList.add(Integer.valueOf(mutableLiveD.getValue().mFeatureId));
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          if (!q.f(uArrayList)) {
             uArrayList1.addAll(uArrayList);
          }
          if (!q.f(obj1)) {
             uArrayList1.addAll(obj1);
          }
          if (uArrayList1.size() > 0) {
             list = uArrayList1;
          }
          return list;
       }
    }
    public void p5(int p0,i p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "10")) {
          return;
       }
       if (!q.h(this.a.k)) {
          i oi = this.a.k.get(Integer.valueOf(p0));
          if (oi != null && oi.a == p1.a) {
             b.f("LiveBottomBarController", "add replace target is exists", "replaceTargetId: ", Integer.valueOf(p0), "replaceId: ", Integer.valueOf(p1.a));
             return;
          }
       }
       uoa = this.a;
       if (uoa.k == null) {
          uoa.k = new HashMap();
       }
       MutableLiveData mutableLiveD = this.a.p.get(Integer.valueOf(p1.a));
       if (mutableLiveD != null && this.a.p.containsKey(Integer.valueOf(p0))) {
          p1.c = mutableLiveD;
          this.a.k.put(Integer.valueOf(p0), p1);
          this.a.f(true, "add replace item");
       }
       return;
    }
    public void q5(int p0,int p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "11")) {
          return;
       }
       if (q.h(this.a.k)) {
          return;
       }
       i oi = this.a.k.get(Integer.valueOf(p1));
       if (oi != null && oi.a != p0) {
          b.g("LiveBottomBarController", "remove replace failed ", "replaceTargetId: ", Integer.valueOf(p1), "current cached replaceId: ", Integer.valueOf(oi.a), "replaceId: ", Integer.valueOf(p0));
          return;
       }else {
          this.a.k.remove(Integer.valueOf(p1));
          if (q.h(this.a.k)) {
             p0.k = null;
          }
          this.a.f(true, "removeReplacedItem");
          return;
       }
    }
    public int r5(int p0){
       boolean b;
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       if (PatchProxy.isSupport(j.class)) {
          j obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), uoa, j.class, "12");
          if (obj1 != PatchProxyResult.class) {
             p0 = obj1.intValue();
          }else {
          label_003d :
             obj1 = uoa.n;
             if (obj1 != null) {
                LiveBottomBarConfigResponse mButtonLayou = obj1.mButtonLayout;
                if (mButtonLayou != null) {
                   Iterator iterator = mButtonLayou.entrySet().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Map$Entry uEntry = iterator.next();
                         LiveBottomBarConfigResponse$a value = uEntry.getValue();
                         if (PatchProxy.isSupport(j.class)) {
                            Object obj2 = PatchProxy.applyTwoRefs(value, Integer.valueOf(p0), uoa, j.class, "13");
                            if (obj2 != PatchProxyResult.class) {
                               b = obj2.booleanValue();
                            }else if(m.s(value.mChildren).r(new d(p0)).orNull() != null){
                               b = true;
                            }else {
                               b = false;
                            }
                         }else {
                            goto label_007a ;
                         }
                         if (b) {
                            p0 = uEntry.getKey().intValue();
                            break ;
                         }
                      }
                   }
                }
             }
             p0 = -1;
          }
       }else {
          goto label_003d ;
       }
       return p0;
    }
    public void v1(MutableLiveData p0){
       LiveBottomBarConfigResponse obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "5")) {
          return;
       }
       b value = p0.getValue();
       if (value != null && !this.a.p.containsKey(Integer.valueOf(value.mFeatureId))) {
          j$a ta = this.a;
          b mFeatureId = value.mFeatureId;
          Objects.requireNonNull(ta);
          j oj = j.class;
          if (PatchProxy.isSupport(oj)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(mFeatureId), ta, oj, "7");
             if (obj != PatchProxyResult.class) {
             }else {
             label_0044 :
                oj = ta.n;
                if (oj != null) {
                   obj = oj.mButtonData;
                   if (obj != null) {
                      obj = obj.get(Integer.valueOf(mFeatureId));
                   }
                }
                obj = null;
             }
          }else {
             goto label_0044 ;
          }
          ta.b(p0, obj);
          ta = this.a;
          p0.observe(ta.d, ta.s);
          this.a.p.put(Integer.valueOf(value.mFeatureId), p0);
       }
       return;
    }
}
