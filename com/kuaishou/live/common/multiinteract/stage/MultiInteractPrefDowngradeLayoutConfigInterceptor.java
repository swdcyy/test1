package com.kuaishou.live.common.multiinteract.stage.MultiInteractPrefDowngradeLayoutConfigInterceptor;
import ee3.d;
import fe3.d;
import brd.y;
import brd.t;
import d02.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.multiinteract.stage.MultiInteractPrefDowngradeLayoutConfigInterceptor$tag$1;
import mrd.a;
import com.kuaishou.live.common.multiinteract.stage.MultiInteractPrefDowngradeLayoutConfigInterceptor$b;
import com.kuaishou.live.common.multiinteract.stage.MultiInteractPrefDowngradeLayoutConfigInterceptor$a;
import erd.g;
import crd.b;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import d02.e;
import msd.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.e;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.StringBuilder;
import trd.u;
import fe3.f;
import java.lang.Integer;
import fe3.c;
import fe3.g;
import com.kuaishou.live.livestage.VideoScaleMode;
import fe3.b;
import fe3.a;
import d02.f;

public final class MultiInteractPrefDowngradeLayoutConfigInterceptor implements d	// class@001804
{
    public final a c;
    public final a d;
    public final Comparator e;
    public LayoutConfig f;
    public LayoutConfig g;
    public final b h;
    public final d i;
    public final y j;
    public final t k;
    public final g l;

    public void MultiInteractPrefDowngradeLayoutConfigInterceptor(d p0,y p1,t p2,g p3){
       a.p(p0, "selfUser");
       a.p(p1, "layoutConfigChangePublisher");
       a.p(p2, "layoutConfigPrefDowngradeInvoker");
       a.p(p3, "prefDowngradeActionDelegate");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.c = MultiInteractPrefDowngradeLayoutConfigInterceptor$tag$1.INSTANCE;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<LayoutConfig>\(\)");
       this.d = uoa;
       this.e = MultiInteractPrefDowngradeLayoutConfigInterceptor$b.b;
       this.h = p2.subscribe(new MultiInteractPrefDowngradeLayoutConfigInterceptor$a(this));
    }
    public t a(LayoutConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiInteractPrefDowngradeLayoutConfigInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "source");
       this.j.onNext(p0);
       this.b(p0, false);
       return this.d;
    }
    public final void b(LayoutConfig p0,boolean p1){
       MultiInteractPrefDowngradeLayoutConfigInterceptor multiInterac;
       ArrayList uArrayList;
       Iterator iterator;
       d obj2;
       int i1;
       int i2;
       MultiInteractPrefDowngradeLayoutConfigInterceptor obj3;
       int i3;
       e uoe1;
       e a;
       e uoe6;
       LayoutConfig layoutConfig = this;
       Object obj = p0;
       if (PatchProxy.isSupport(MultiInteractPrefDowngradeLayoutConfigInterceptor.class) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), layoutConfig, MultiInteractPrefDowngradeLayoutConfigInterceptor.class, "2")) {
          return;
       }
       int i = 1;
       if (p1 || (a.g(obj, layoutConfig.f) ^ i)) {
          if (layoutConfig.l.b1(obj)) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             List obj1 = PatchProxy.applyOneRefs(obj, layoutConfig, MultiInteractPrefDowngradeLayoutConfigInterceptor.class, "5");
             if (obj1 != patchProxyRe) {
                multiInterac = obj1;
             }else {
                uArrayList = new ArrayList();
                iterator = p0.e().iterator();
                i1 = 0;
                while (iterator.hasNext()) {
                   obj3 = iterator.next();
                   Object obj4 = obj3;
                   if (obj4.c()) {
                      i3 = a.g(obj4.h(), layoutConfig.i) ^ i;
                      if (i3) {
                         i1 = 1;
                      }
                   }
                   if (i1) {
                      uArrayList.add(obj3);
                   }
                }
                obj1 = CollectionsKt___CollectionsKt.f5(uArrayList, layoutConfig.e);
                i2 = layoutConfig.l.a1() - i;
                obj3 = layoutConfig.c;
                if (obj3 != null) {
                   uoe1 = new e(obj3);
                }
                b.Z(uoe1, "maxVideoCount: "+i2);
                if (obj1.size() > i2) {
                   obj1 = obj1.subList(i2, obj1.size());
                   uArrayList = new ArrayList(u.Y(obj1, 10));
                   iterator = obj1.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(Integer.valueOf(iterator.next().d().a()));
                   }
                   MultiInteractPrefDowngradeLayoutConfigInterceptor c1 = layoutConfig.c;
                   if (c1 != null) {
                      c1 = new e(c1);
                   }
                   b.Z(c1, "downgradeWindows: "+uArrayList);
                   int i4 = p0.e().size();
                   ArrayList uArrayList1 = new ArrayList(i4);
                   i3 = 0;
                   while (i3 < i4) {
                      e uoe2 = p0.e().get(i3);
                      e uoe3 = (uArrayList.contains(Integer.valueOf(uoe2.d().a())))? null: uoe2.g();
                      c uoc = uoe3;
                      a = uoe2.a;
                      e c2 = uoe2.c;
                      uoe3 = uoe2.d;
                      e e = uoe2.e;
                      e uoe4 = e.class;
                      int i5 = i4;
                      if (PatchProxy.isSupport(uoe4)) {
                         Object[] objArray = new Object[5];
                         objArray[i1] = a;
                         objArray[1] = uoc;
                         objArray[2] = c2;
                         objArray[3] = uoe3;
                         objArray[4] = e;
                         e uoe5 = PatchProxy.apply(objArray, uoe2, uoe4, "1");
                         if (uoe5 != patchProxyRe) {
                         label_018e :
                            uArrayList1.add(uoe5);
                            i3 = i3 + 1;
                            i4 = i5;
                            i1 = 0;
                            uoe4 = 1;
                         }
                      }
                      a.p(a, "id");
                      a.p(c2, "rect");
                      a.p(e, "scaleMode");
                      e = new e(a, uoc, c2, uoe3, e);
                      goto label_018e ;
                   }
                   multiInterac = LayoutConfig.a(p0, null, null, uArrayList1, 0, 11, null);
                }else {
                   multiInterac = obj;
                }
             }
             obj1 = multiInterac.e();
             if (!PatchProxy.applyVoidOneRefs(obj1, layoutConfig, MultiInteractPrefDowngradeLayoutConfigInterceptor.class, "4")) {
                uArrayList = new ArrayList();
                iterator = obj1.iterator();
                while (iterator.hasNext()) {
                   obj2 = iterator.next();
                   i1 = a.g(obj2.h(), layoutConfig.i) ^ 1;
                   if (i1) {
                      uArrayList.add(obj2);
                   }
                }
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   e uoe = iterator.next();
                   obj2 = uoe.h();
                   if (obj2 != null) {
                      MultiInteractPrefDowngradeLayoutConfigInterceptor c = layoutConfig.c;
                      if (c != null) {
                         c = new f(c);
                      }
                      b.Z(c, "muteVideo: "+obj2+' '+uoe.c());
                      i2 = uoe.c() ^ 1;
                      layoutConfig.l.Z0(obj2.b(), i2);
                   }
                }
             }
          }else {
          label_022e :
             multiInterac = obj;
          }
       }else {
          multiInterac = layoutConfig.c;
          if (multiInterac != null) {
             uoe6 = new e(multiInterac);
          }
          b.Z(uoe6, "no need check");
          multiInterac = layoutConfig.g;
          if (multiInterac == null) {
          }
       }
       layoutConfig.f = obj;
       layoutConfig.g = multiInterac;
       layoutConfig.d.onNext(multiInterac);
       return;
    }
    public void detach(){
       if (PatchProxy.applyVoid(null, this, MultiInteractPrefDowngradeLayoutConfigInterceptor.class, "3")) {
          return;
       }
       this.h.dispose();
       return;
    }
}
