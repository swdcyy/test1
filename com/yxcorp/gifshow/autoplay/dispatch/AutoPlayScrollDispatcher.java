package com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher;
import r99.e$a;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher$a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView;
import r99.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher$mLastScrollInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher$mScrollInfo$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r99.f;
import java.util.HashMap;
import java.lang.System;
import r99.e;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.autoplay.widget.a;
import r99.g;
import com.yxcorp.gifshow.autoplay.widget.a$a;
import java.lang.Integer;
import r99.a;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import java.lang.StringBuilder;
import u99.d;
import java.util.Iterator;
import java.lang.Iterable;
import ba9.a;
import s99.i;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher$b;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.lang.Boolean;
import w99.g;
import u99.a;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import java.util.ArrayList;
import z99.c;
import android.view.View;
import java.util.Collection;

public final class AutoPlayScrollDispatcher implements e$a	// class@001be5
{
    public final p a;
    public final p b;
    public i c;
    public final Map d;
    public e e;
    public long f;
    public final RecyclerView g;
    public final int h;
    public final int i;
    public final int j;
    public static final AutoPlayScrollDispatcher$a k;

    static {
       AutoPlayScrollDispatcher.k = new AutoPlayScrollDispatcher$a(null);
    }
    public void AutoPlayScrollDispatcher(RecyclerView p0,i p1,int p2,int p3,int p4){
       a.p(p0, "recyclerView");
       super();
       this.g = p0;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.a = s.c(AutoPlayScrollDispatcher$mLastScrollInfo$2.INSTANCE);
       this.b = s.c(AutoPlayScrollDispatcher$mScrollInfo$2.INSTANCE);
       if (p1 != null) {
       }else {
          f uof = PatchProxy.apply(null, this, AutoPlayScrollDispatcher.class, "11");
          if (uof != PatchProxyResult.class) {
          }else {
             uof = new f();
          }
       }
       this.c = p1;
       this.d = new HashMap();
       this.f = System.currentTimeMillis();
       if (!PatchProxy.applyVoid(null, this, AutoPlayScrollDispatcher.class, "3")) {
          e uoe = new e(p2, this, p3);
          this.e = uoe;
          p0.addOnScrollListener(uoe);
          if (p0.getLayoutManager() instanceof a) {
             a layoutManage = p0.getLayoutManager();
             g og = new g(this);
             if (layoutManage != null) {
                layoutManage.C(og);
             }
          }
       }
       return;
    }
    public void a(RecyclerView p0,int p1){
       AutoPlayScrollDispatcher uAutoPlayScr = AutoPlayScrollDispatcher.class;
       if (PatchProxy.isSupport(uAutoPlayScr) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAutoPlayScr, "16")) {
          return;
       }
       a.p(p0, "scrollView");
       this.c("scrollListener", p0, p1);
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoPlayScrollDispatcher.class, "6")) {
          return;
       }
       this.c(p0, this.g, 1);
       return;
    }
    public final void c(String p0,RecyclerView p1,int p2){
       List this;
       HashMap obj3;
       boolean obj3;
       int i3;
       i oi1;
       AutoPlayScrollDispatcher uAutoPlayScr = this;
       Object obj = p0;
       Object obj1 = p1;
       int i = p2;
       AutoPlayScrollDispatcher uAutoPlayScr1 = AutoPlayScrollDispatcher.class;
       if (PatchProxy.isSupport(uAutoPlayScr1) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AutoPlayScrollDispatcher.class, "7")) {
          return;
       }
       a.p(obj1, "scrollView");
       uAutoPlayScr.f = System.currentTimeMillis();
       this.e().a(uAutoPlayScr.g);
       ViewGroup viewGroup = uAutoPlayScr.c.a(uAutoPlayScr.g, obj1, i);
       a.o(viewGroup, "dispatchView");
       this = this.g(viewGroup, p1, p2, a.g(uAutoPlayScr.g, viewGroup), 0);
       HashMap hashMap = new HashMap();
       hashMap.put("autoPlayCount", String.valueOf(this.size()));
       hashMap.put("scrollDirection", String.valueOf(p2));
       hashMap.put("dispatchSource", obj);
       hashMap.put("recyclerViewID", String.valueOf(p1.getId()));
       d.h("AutoPlayScrollDispatcher", "dispatchFocus step1 dispatchSource: "+obj, hashMap);
       if (!PatchProxy.applyVoidOneRefs(this, uAutoPlayScr, uAutoPlayScr1, "8")) {
          Iterator iterator1 = this.iterator();
          while (iterator1.hasNext()) {
             Iterator iterator2 = iterator1.next().getListeners().iterator();
             while (iterator2.hasNext()) {
                oi1 = iterator2.next();
                if (oi1 != null) {
                   oi1.n();
                }
             }
          }
       }
       List list = Ordering.from(new AutoPlayScrollDispatcher$b(uAutoPlayScr)).sortedCopy(this);
       int i1 = 0;
       int i2 = 0;
       String str = "autoPlayCard";
       while (i1 < list.size()) {
          Object obj2 = list.get(i1);
          if (i2 >= uAutoPlayScr.c.d(uAutoPlayScr.g)) {
             break ;
          }else {
             a.o(obj2, str);
             if (PatchProxy.isSupport(uAutoPlayScr1)) {
                obj3 = PatchProxy.applyThreeRefs(p1, Integer.valueOf(p2), obj2, this, AutoPlayScrollDispatcher.class, "10");
                if (obj3 != PatchProxyResult.class) {
                   obj3 = obj3.booleanValue();
                label_013e :
                   if (obj3) {
                      obj3 = new HashMap();
                      obj3.put("focusIndex", String.valueOf(obj2.getVisibleIndex()));
                      obj3.put("itemWeight", String.valueOf(obj2.getItemWeight()));
                      g autoPlayModu = obj2.getAutoPlayModule();
                      if (autoPlayModu != null) {
                         str = autoPlayModu.k();
                         if (str != null) {
                         label_016e :
                            obj3.put("feedInfo", str);
                            d.h("AutoPlayScrollDispatcher", "dispatchFocus step2", obj3);
                            i2 = i2 + 1;
                         }
                      }
                      str = "";
                      goto label_016e ;
                   }
                   i1 = i1 + 1;
                }
             }
             Iterator obj31 = obj2.getListeners().iterator();
             i3 = 1;
             String str2 = null;
             while (obj31.hasNext()) {
                oi1 = obj31.next();
                if (oi1 != null && oi1.C(obj1, i) == i3) {
                   str2 = 1;
                }
             }
             obj3 = str2;
             goto label_013e ;
          }
       }
       d.g("AutoPlayScrollDispatcher", "dispatchFocus step3", "dispatchCount", String.valueOf(i2));
       StringBuilder str1 = "";
       while (i1 < list.size()) {
          a uoa = list.get(i1);
          a.o(uoa, str);
          if (!PatchProxy.applyVoidOneRefs(uoa, uAutoPlayScr, uAutoPlayScr1, "9")) {
             Iterator iterator = uoa.getListeners().iterator();
             while (iterator.hasNext()) {
                i oi = iterator.next();
                if (oi != null) {
                   oi.f();
                }
             }
          }
          i1 = i1 + 1;
          str1 = str1+String.valueOf(uoa.getVisibleIndex())+",";
       }
       AutoPlayScrollDispatcher j = uAutoPlayScr.j;
       long l = System.currentTimeMillis() - uAutoPlayScr.f;
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(j), Long.valueOf(l), null, uoa1, "3") && a.a.a())) {
          i3 oi3 = i3.f();
          oi3.c("play_biz", Integer.valueOf(j));
          oi3.c("dispatch_time", Long.valueOf(l));
          u1.R("auto_play_dispatch", oi3.e(), 13);
       }
       d.d("AutoPlayScrollDispatcher", "dispatchFocus step4 interruptIndex: "+str1);
       return;
    }
    public final float d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AutoPlayScrollDispatcher.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return p0.getItemWeight();
    }
    public final a e(){
       Object obj = PatchProxy.apply(null, this, AutoPlayScrollDispatcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final a f(){
       Object obj = PatchProxy.apply(null, this, AutoPlayScrollDispatcher.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final List g(ViewGroup p0,RecyclerView p1,int p2,boolean p3,int p4){
       View obj1;
       String str;
       AutoPlayScrollDispatcher obj2;
       Object obj = this;
       object oobject = p0;
       int i = 1;
       if (PatchProxy.isSupport(AutoPlayScrollDispatcher.class)) {
          Object[] objArray = new Object[]{oobject,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, AutoPlayScrollDispatcher.class, "13");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       boolean i1 = (oobject instanceof RecyclerView)? c.d(oobject): p0.getChildCount();
       int i2 = i1;
       int i3 = 0;
       while (i3 < i2) {
          View childAt = oobject.getChildAt(obj.c.c(p0, p1, p2, i2, i3));
          if (p3) {
             obj1 = PatchProxy.applyOneRefs(childAt, obj, AutoPlayScrollDispatcher.class, "15");
             if (obj1 != PatchProxyResult.class) {
                i1 = obj1.booleanValue();
             }else if(childAt != null){
                obj2 = obj.i;
                if (obj2 != null && childAt.findViewById(obj2) instanceof RecyclerView) {
                   i1 = true;
                }
             }
             i1 = false;
             if (i1) {
                obj1 = childAt.findViewById(obj.i);
                a.o(obj1, "child.findViewById\(childRecyclerViewId\)");
                View view = obj1;
                int i4 = p4 + i3;
                str = "child.findViewById\(childRecyclerViewId\)";
                uArrayList.addAll(this.g(view, p1, p2, false, i4));
                a.o(childAt, "child");
                if (!PatchProxy.applyVoidOneRefs(childAt, obj, AutoPlayScrollDispatcher.class, "17")) {
                   obj1 = childAt.findViewById(obj.i);
                   a.o(obj1, str);
                   if (!obj.d.containsKey(obj1)) {
                      e uoe = new e(obj.h, obj, 0);
                      obj.d.put(obj1, uoe);
                      obj1.addOnScrollListener(uoe);
                   }
                }
             }else {
             label_00d8 :
                obj2 = PatchProxy.applyOneRefs(childAt, obj, AutoPlayScrollDispatcher.class, "14");
                if (obj2 != PatchProxyResult.class) {
                   i1 = obj2.booleanValue();
                }else if(childAt != null){
                   obj2 = obj.h;
                   if (obj2 != null && childAt.findViewById(obj2) instanceof a) {
                      i1 = true;
                   }
                }
                i1 = false;
                if (i1) {
                   obj1 = childAt.findViewById(obj.h);
                   a.o(obj1, "child.findViewById\(playerViewId\)");
                   int i5 = p4 + i3;
                   obj1.setVisibleIndex(i5);
                   uArrayList.add(obj1);
                }else if(childAt instanceof a){
                   i1 = p4 + i3;
                   childAt.setVisibleIndex(i1);
                   uArrayList.add(childAt);
                }
             }
          }else {
             goto label_00d8 ;
          }
       label_011e :
          i3 = i3 + 1;
          str = 1;
       }
       return uArrayList;
    }
}
