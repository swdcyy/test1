package i61.j;
import com.kuaishou.live.bottombar.component.widget.LiveBottomBarWidgetStyle;
import x61.c;
import w61.c;
import fp3.d;
import androidx.lifecycle.LifecycleOwner;
import j61.a;
import ok.x;
import j61.b;
import java.lang.Object;
import b71.c;
import java.util.HashMap;
import n61.d;
import i61.h;
import java.lang.Runnable;
import i61.b;
import i61.j$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bottombar.component.widget.a;
import i61.j$c;
import java.lang.Enum;
import com.kuaishou.live.bottombar.component.widget.f;
import com.kuaishou.live.bottombar.component.widget.b;
import com.kuaishou.live.bottombar.component.widget.e;
import i61.j$b;
import com.kuaishou.live.bottombar.component.widget.a$a;
import dp3.g;
import x61.a;
import qp.b;
import com.kuaishou.live.basic.dialog.LiveSafeDialogFragment;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.JsonObject;
import androidx.lifecycle.LiveData;
import z61.b;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import androidx.lifecycle.Observer;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelData;
import i61.e;
import ok.o;
import com.google.common.collect.Maps;
import ekd.q;
import java.util.List;
import c71.d;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$a;
import java.util.ArrayList;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildren;
import com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelGroup;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildrenItem;
import com.google.common.collect.Maps$d;
import java.lang.Iterable;
import qk.m;
import c71.c;
import com.google.common.base.Optional;
import android.app.Activity;
import android.view.View;
import com.yxcorp.utility.n;
import k61.f;
import i61.k;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarPanelContainerFragment;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment;
import java.lang.Number;
import lnc.a1;
import k61.d;
import java.lang.StringBuilder;
import androidx.fragment.app.DialogFragment;
import i61.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import b71.b;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarConfig;
import java.util.Set;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import i61.f;
import i61.g;
import b71.a;
import java.util.Objects;
import n61.c;
import android.os.Handler;
import android.os.Message;

public class j	// class@002841
{
    public final x a;
    public LiveDialogContainerFragment b;
    public final c c;
    public final LifecycleOwner d;
    public final c e;
    public final a f;
    public final a g;
    public final d h;
    public final b i;
    public j$d j;
    public Map k;
    public int l;
    public a m;
    public LiveBottomBarConfigResponse n;
    public int o;
    public final Map p;
    public boolean q;
    public final d r;
    public final Observer s;
    public final a t;

    public void j(LiveBottomBarWidgetStyle p0,c p1,c p2,d p3,LifecycleOwner p4,a p5,x p6){
       super(p0, p1, p2, p3, p4, p5, p6, null);
    }
    public void j(LiveBottomBarWidgetStyle p0,c p1,c p2,d p3,LifecycleOwner p4,a p5,x p6,b p7){
       int i = this;
       c uoc = p1;
       c uoc1 = p2;
       d uod = p3;
       LifecycleOwner lifecycleOwn = p4;
       x ox = p6;
       super();
       i.l = -1;
       i.m = new c();
       i.p = new HashMap();
       i.r = new d(new h(this));
       i.s = new b(this);
       j$a uoa = new j$a(this);
       i.t = uoa;
       i.h = uod;
       i.e = uoc;
       i.c = uoc1;
       i.d = lifecycleOwn;
       i.g = p5;
       i.a = ox;
       i.i = p7;
       f uof = PatchProxy.applyFourRefs(p0, p2, p4, p6, this, j.class, "8");
       boolean b = true;
       if (uof != PatchProxyResult.class) {
       }else {
          int i1 = j$c.a[p0.ordinal()];
          if (i1 != b) {
             uof = (i1 != 2)? new f(lifecycleOwn, uoc1, ox): new b(lifecycleOwn, uoc1, ox);
          }else {
             uof = new e(lifecycleOwn, uoc1, ox);
          }
       }
       Object obj = uof;
       i.f = obj;
       obj.H1(new j$b(this));
       uod.P(obj);
       uoc.Hg(uoa);
       this.f(b, "init controller");
       b.g("LiveBottomBarController", "LiveBottomBarController init ", "style ", p0, "mLiveBottomBarWidget £º ", obj, "controller instance ", this);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "17")) {
          return;
       }
       j tb = this.b;
       if (tb != null) {
          tb.dismissAllowingStateLoss();
       }
       return;
    }
    public void b(MutableLiveData p0,JsonObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "6")) {
          return;
       }
       b value = p0.getValue();
       if (value != null && p1 != null) {
          value.update(p1);
          p0.setValue(value);
       }
       return;
    }
    public void c(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       this.k = objArray;
       this.n = objArray;
       if (!PatchProxy.applyVoid(objArray, this, oj, "4")) {
          Iterator iterator = this.p.values().iterator();
          while (iterator.hasNext()) {
             MutableLiveData mutableLiveD = iterator.next();
             if (mutableLiveD != null) {
                mutableLiveD.removeObserver(this.s);
             }
          }
          this.p.clear();
       }
       this.r.a();
       this.e.dh();
       this.f.H1(objArray);
       this.f.release();
       this.h.N(this.f);
       this.a();
       this.q = true;
       b.f("LiveBottomBarController", "LiveBottomBarController destroy ", "controller instance ", this, "mLiveBottomBarWidget : ", this.f);
       return;
    }
    public void d(int p0){
       LiveBottomBarConfigResponse obj;
       String str2;
       boolean b;
       Activity uActivity;
       LiveBottomBarPanelData mFeatureId;
       k ok;
       int i;
       j n;
       Iterator iterator1;
       MutableLiveData obj4;
       LiveDialogContainerFragment liveDialogCo = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), liveDialogCo, oj, "14")) {
          return;
       }
       MutableLiveData mutableLiveD = liveDialogCo.p.get(Integer.valueOf(p0));
       String str = "featureId ";
       String str1 = "LiveBottomBarController";
       if (mutableLiveD != null && (mutableLiveD.getValue() == null || !mutableLiveD.getValue().mIsVisible.booleanValue())) {
          b.e(str1, "open child panel failed because item is null or unVisible", str, Integer.valueOf(p0));
          return;
       }else {
          b value = mutableLiveD.getValue();
          if (PatchProxy.isSupport(oj)) {
             obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), value, liveDialogCo, oj, "15");
             if (obj != patchProxyRe) {
                str2 = str;
             }else {
             label_005f :
                Map map = Maps.i(liveDialogCo.p, new e(liveDialogCo));
                List list = (!q.h(liveDialogCo.f.G1()))? liveDialogCo.f.G1().get(Integer.valueOf(p0)): 0;
                n = liveDialogCo.n;
                j oj1 = n;
                d uod = d.class;
                j oj2 = n;
                str2 = str;
                List list1 = list;
                obj = PatchProxy.applyFourRefs(value, oj1, map, list, 0, d.class, "3");
                if (obj != patchProxyRe) {
                }else if(oj2 != null){
                   obj = oj2.mButtonLayout;
                   if (obj != null) {
                      LiveBottomBarConfigResponse$a uoa = obj.get(Integer.valueOf(value.mFeatureId));
                      if (uoa != null) {
                         ArrayList uArrayList = new ArrayList();
                         LiveBottomBarConfigResponse$a mChildren = uoa.mChildren;
                         if (!q.f(mChildren)) {
                            Iterator iterator = mChildren.iterator();
                            while (iterator.hasNext()) {
                               LiveBottomBarConfigResponse$LiveBottomBarLayoutChildren liveBottomBa1 = iterator.next();
                               ArrayList obj3 = PatchProxy.applyTwoRefs(map, liveBottomBa1, null, uod, "4");
                               if (obj3 != patchProxyRe) {
                                  iterator1 = iterator;
                                  obj4 = obj3;
                               }else if(q.f(liveBottomBa1.mButtons)){
                                  iterator1 = iterator;
                               }else {
                                  obj3 = new ArrayList();
                                  Iterator iterator2 = liveBottomBa1.mButtons.iterator();
                                  while (iterator2.hasNext()) {
                                     iterator1 = iterator;
                                     obj4 = map.get(Integer.valueOf(iterator2.next().mBottomBarItemId));
                                     if (obj4 != null && (obj4.getValue() != null && obj4.getValue().mIsVisible.booleanValue())) {
                                        obj3.add(obj4);
                                     }
                                  label_013d :
                                     iterator = iterator1;
                                  }
                                  iterator1 = iterator;
                                  if (!q.f(obj3)) {
                                     obj4 = new LiveBottomBarPanelGroup();
                                     obj4.mGroupName = liveBottomBa1.mGroupName;
                                     obj4.mItems = obj3;
                                  }
                               }
                               obj4 = null;
                               if (obj4 != null) {
                                  uArrayList.add(obj4);
                               }
                               iterator = iterator1;
                            }
                         }
                         LiveBottomBarPanelGroup obj5 = PatchProxy.applyTwoRefs(uArrayList, list1, null, uod, "5");
                         if (obj5 != patchProxyRe) {
                            uArrayList = obj5;
                         }else if(q.f(list1)){
                            obj5 = (!q.f(uArrayList))? m.s(uArrayList).r(c.b).orNull(): null;
                            if (obj5 == null) {
                               uArrayList = new ArrayList();
                               obj5 = new LiveBottomBarPanelGroup();
                               obj5.mItems = new ArrayList(list1);
                               uArrayList.add(obj5);
                            }else if(q.f(obj5.mItems)){
                               obj5.mItems = new ArrayList(list1);
                            }else {
                               obj5.mItems.addAll(0, list1);
                            }
                         }
                         if (!q.f(uArrayList)) {
                            mFeatureId = new LiveBottomBarPanelData();
                            mFeatureId.mMaxHeightPercent = uoa.mMaxHeightPercent;
                            mFeatureId.mDisableShowSelectedStatus = uoa.mDisableShowSelectedStatus;
                            mFeatureId.mFeatureId = value.mFeatureId;
                            mFeatureId.mTitle = value.mText;
                            mFeatureId.mMaxIconPerRow = oj2.mMaxIconPerRow;
                            mFeatureId.mLayoutType = uoa.mLayoutType;
                            mFeatureId.mGroups = uArrayList;
                            mFeatureId.mLandscapeBackgroundDrawable = uoa.mLandscapeBackgroundDrawable;
                            obj = mFeatureId;
                         }
                      }
                   }
                }
                obj = null;
             }
          }else {
             goto label_005f ;
          }
          if (obj == null || q.f(obj.mGroups)) {
             b.e(str1, "open child panel failed because panelData or children is null", str2, Integer.valueOf(p0));
             return;
          }else {
             this.a();
             j a = liveDialogCo.a;
             b = (a != null && a.get().booleanValue())? true: false;
             String obj1 = PatchProxy.apply(null, liveDialogCo, oj, "16");
             if (obj1 != patchProxyRe) {
                uActivity = obj1;
             }else {
                View view = liveDialogCo.f.getView();
                if (view == null) {
                   obj1 = null;
                label_0224 :
                   mFeatureId = obj.mFeatureId;
                   if (PatchProxy.isSupport(oj)) {
                      ok = PatchProxy.applyTwoRefs(Integer.valueOf(mFeatureId), Boolean.valueOf(b), liveDialogCo, oj, "19");
                      if (ok != patchProxyRe) {
                      label_0244 :
                         LiveBottomBarPanelContainerFragment liveBottomBa = PatchProxy.applyThreeRefs(obj1, obj, ok, null, LiveBottomBarPanelContainerFragment.class, "1");
                         if (liveBottomBa != patchProxyRe) {
                         }else {
                            liveBottomBa = new LiveBottomBarPanelContainerFragment();
                            Object obj2 = PatchProxy.applyOneRefs(obj1, null, LiveBottomBarPanelContainerFragment.class, "2");
                            if (obj2 != patchProxyRe) {
                               i = obj2.intValue();
                            }else if(obj1 == null){
                               i = a1.e(536.00f);
                            }else {
                               i = (int)((float)n.j(obj1) * 0x3fa51eb8);
                            }
                            liveBottomBa.uh(i, -2);
                            liveBottomBa.th(0);
                            liveBottomBa.u = new d(obj, ok, liveBottomBa);
                         }
                         liveDialogCo.b = liveBottomBa;
                         liveDialogCo.g.a(liveBottomBa, "LiveBottomBarPanel_"+obj.mFeatureId);
                         liveDialogCo.b.k0(new a(liveDialogCo));
                         return;
                      }
                   }
                   ok = new k(liveDialogCo, mFeatureId, b);
                   goto label_0244 ;
                }else {
                   uActivity = n.d(view);
                }
             }
             obj1 = uActivity;
             goto label_0224 ;
          }
       }
    }
    public void e(int p0,LiveBottomBarConfigResponse p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "1")) {
          return;
       }
       this.o = p0;
       this.n = p1;
       if (p1 == null || q.h(p1.mOrderedExcludedMap)) {
          this.m = new c();
       }else {
          j tn1 = this.n;
          this.m = new b(tn1.mBottomBarEntry, tn1.mOrderedExcludedMap);
       }
       j tn = this.n;
       boolean b = false;
       if (tn != null && !q.h(tn.mButtonData)) {
          tn = this.n.mButtonData;
          if (!PatchProxy.applyVoidOneRefs(tn, this, oj, "11")) {
             Iterator iterator1 = tn.entrySet().iterator();
             while (iterator1.hasNext()) {
                JsonObject value1 = iterator1.next().getValue();
                String str = "enableInjection";
                MutableLiveData mutableLiveD1 = (value1.e0(str) == null)? null: value1.e0(str).d();
                if (mutableLiveD1) {
                   mutableLiveD1 = new MutableLiveData();
                   LiveNormalBottomBarItem liveNormalBo = new LiveNormalBottomBarItem();
                   liveNormalBo.update(value1);
                   liveNormalBo.mClickCallback = new f(this, liveNormalBo);
                   liveNormalBo.mShowCallback = new g(this, mutableLiveD1);
                   mutableLiveD1.setValue(liveNormalBo);
                   this.e.v1(mutableLiveD1);
                }
             }
          }
          tn = this.n.mButtonData;
          if (!PatchProxy.applyVoidOneRefs(tn, this, oj, "5")) {
             Iterator iterator = this.p.values().iterator();
             while (iterator.hasNext()) {
                MutableLiveData mutableLiveD = iterator.next();
                b value = mutableLiveD.getValue();
                if (value == null) {
                   continue ;
                }
                this.b(mutableLiveD, tn.get(Integer.valueOf(value.mFeatureId)));
             }
          }
       }
       this.f(true, "updateBottomBarConfig");
       Integer integer = Integer.valueOf(p0);
       if (this.n == null) {
          b = true;
       }
       b.g("LiveBottomBarController", "updateBottomBarConfig", " mode ", integer, "config response is null ", Boolean.valueOf(b), " dataProcessor ", this.m.getClass().getName());
       return;
    }
    public void f(boolean p0,String p1){
       j tn1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oj, "9")) {
          return;
       }
       j tn = this.n;
       boolean b = true;
       if (tn == null || this.q != null) {
          if (tn != null) {
             b = false;
          }
          b.h("LiveBottomBarController", "updateBottomBarWidget error", "config is null ", Boolean.valueOf(b), "mIsControllerDestroy ", Boolean.valueOf(this.q), "updateScene ", p1, "controller instance ", this);
          return;
       }else if(p0){
          this.r.a();
          tn = this.f;
          j to = this.o;
          tn1 = this.n;
          ArrayList uArrayList = PatchProxy.applyOneRefs(tn1, this, oj, "10");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             if (tn1.mBottomBarEntry != null) {
                List list = this.m.a(tn1, this.p);
                if (!q.f(list)) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      Integer integer = iterator.next();
                      if (this.p.containsKey(integer)) {
                         uArrayList.add(this.p.get(integer));
                      }
                   }
                }
             }
          }
          Object obj = uArrayList;
          tn.J1(p1, to, obj, this.n.mFunctionFoldPriorityEntry, this.k);
       }else {
          tn1 = this.r;
          Objects.requireNonNull(tn1);
          if (!PatchProxy.applyVoid(null, tn1, d.class, "1")) {
             d c = tn1.c;
             _monitor_enter(c);
             if (tn1.d != null) {
                _monitor_exit(c);
             }else {
                tn1.d = b;
                _monitor_exit(c);
                Message message = Message.obtain(tn1.b, new c(tn1));
                message.obj = tn1;
                tn1.b.sendMessage(message);
             }
          }
       }
       return;
    }
}
