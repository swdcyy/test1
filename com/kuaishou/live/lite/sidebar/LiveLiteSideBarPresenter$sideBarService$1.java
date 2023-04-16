package com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$sideBarService$1;
import fd3.n;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter;
import com.kuaishou.live.lite.sidebar.e$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import d61.b;
import java.util.List;
import java.lang.AssertionError;
import java.util.Map;
import java.util.ArrayList;
import fd3.b;
import java.util.Comparator;
import trd.x;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$sideBarService$1$addReplaceItem$1;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import java.util.Iterator;
import java.lang.Iterable;
import msd.a;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import android.view.ViewGroup;
import vd3.c;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$sideBarService$1$removeReplaceItem$1;
import java.util.Collection;

public final class LiveLiteSideBarPresenter$sideBarService$1 extends n	// class@000b3a
{
    public final LiveLiteSideBarPresenter f;

    public void LiveLiteSideBarPresenter$sideBarService$1(LiveLiteSideBarPresenter p0){
       this.f = p0;
       super();
    }
    public void f(int p0,e$a p1,boolean p2){
       LiveLiteSideBarViewController obj1;
       boolean b;
       LiveLiteSideBarPresenter a;
       Object obj2;
       LiveLiteSideBarPresenter$sideBarService$1 osideBarServ = this;
       int i = p0;
       Object obj = p1;
       if (PatchProxy.isSupport(LiveLiteSideBarPresenter$sideBarService$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, LiveLiteSideBarPresenter$sideBarService$1.class, "1")) {
          return;
       }
       a.p(obj, "item");
       LiteSideBarConfigDataSource liteSideBarC = osideBarServ.f.c9();
       int i1 = p1.j();
       Objects.requireNonNull(liteSideBarC);
       LiteSideBarConfigDataSource liteSideBarC1 = LiteSideBarConfigDataSource.class;
       if (PatchProxy.isSupport(liteSideBarC1)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(i1), liteSideBarC, liteSideBarC1, "1");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
          label_0058 :
             b b1 = b.b;
             String str = "precondition check failed";
             if (!b1.a() || liteSideBarC.b.contains(Integer.valueOf(p0))) {
                if (!b1.a() || liteSideBarC.a(p0, i1)) {
                   if (liteSideBarC.b.contains(Integer.valueOf(p0))) {
                      liteSideBarC1 = liteSideBarC.c;
                      Integer integer = Integer.valueOf(p0);
                      ArrayList uArrayList = liteSideBarC1.get(integer);
                      if (uArrayList == null) {
                         uArrayList = new ArrayList();
                         liteSideBarC1.put(integer, uArrayList);
                      }
                      if (!uArrayList.contains(Integer.valueOf(i1))) {
                         uArrayList.add(Integer.valueOf(i1));
                         if (uArrayList.size() > 1) {
                            x.p0(uArrayList, new b(liteSideBarC, p0));
                         }
                         liteSideBarC.b(p0, uArrayList);
                         b = true;
                      }
                   }
                   b = false;
                }else {
                   throw new AssertionError(str);
                }
             }else {
                throw new AssertionError(str);
             }
          }
       }else {
          goto label_0058 ;
       }
       if (b) {
          a = osideBarServ.f.A;
          if (p2 && a != null) {
             LiveLiteSideBarPresenter$sideBarService$1$addReplaceItem$1 osideBarServ1 = new LiveLiteSideBarPresenter$sideBarService$1$addReplaceItem$1(this, obj);
             if (!PatchProxy.isSupport(LiveLiteSideBarViewController.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, osideBarServ1, a, LiveLiteSideBarViewController.class, "8")) {
                a.p(obj, "item");
                a.p(osideBarServ1, "replaceFinishCallback");
                Iterator iterator = a.r.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj2 = iterator.next();
                      int i2 = (obj2.j() == i)? 1: 0;
                      if (!i2) {
                         continue ;
                      }
                   }else {
                      obj2 = null;
                   }
                   if (obj2 == null) {
                      osideBarServ1.invoke();
                      break ;
                   }else if(a.v.f(p0) != p1.j()){
                      osideBarServ1.invoke();
                      break ;
                   }else {
                      LiteSideBarReplaceAnimController liteSideBarR = a.W2();
                      obj1 = a.m;
                      if (obj1 == null) {
                         a.S("sideBarBizContainerView");
                      }
                      liteSideBarR.c(obj1, obj2, obj, osideBarServ1);
                      break ;
                   }
                }
             }
          }else {
             osideBarServ.b.a(obj);
          }
       }
       return;
    }
    public void h(int p0,e$a p1,boolean p2){
       b obj;
       boolean b;
       LiveLiteSideBarPresenter a;
       List obj1;
       boolean b2;
       if (PatchProxy.isSupport(LiveLiteSideBarPresenter$sideBarService$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, LiveLiteSideBarPresenter$sideBarService$1.class, "2")) {
          return;
       }
       a.p(p1, "item");
       LiteSideBarConfigDataSource liteSideBarC = this.f.c9();
       int i = p1.j();
       Objects.requireNonNull(liteSideBarC);
       LiteSideBarConfigDataSource liteSideBarC1 = LiteSideBarConfigDataSource.class;
       if (PatchProxy.isSupport(liteSideBarC1)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(i), liteSideBarC, liteSideBarC1, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_00c6 :
             if (b) {
                a = this.f.A;
                if (p2 && a != null) {
                   LiveLiteSideBarPresenter$sideBarService$1$removeReplaceItem$1 osideBarServ = new LiveLiteSideBarPresenter$sideBarService$1$removeReplaceItem$1(this, p1);
                   if (!PatchProxy.isSupport(LiveLiteSideBarViewController.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, osideBarServ, a, LiveLiteSideBarViewController.class, "9")) {
                      a.p(p1, "disappearItem");
                      a.p(osideBarServ, "replaceFinishCallback");
                      LiveLiteSideBarViewController r = a.r;
                      if (!r instanceof Collection || !r.isEmpty()) {
                         Iterator iterator1 = r.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               boolean b1 = (iterator1.next().j() == p1.j())? true: false;
                               if (b1) {
                                  r = 1;
                                  break ;
                               }
                            }
                         }
                         if (!r) {
                            osideBarServ.invoke();
                         }else {
                            i = a.v.f(p0);
                            if (i != p0) {
                               osideBarServ.invoke();
                            }else {
                               Iterator iterator = a.y.b.c().iterator();
                               while (true) {
                                  if (iterator.hasNext()) {
                                     obj = iterator.next();
                                     obj1 = (obj.j() == i)? 1: null;
                                     if (!obj1) {
                                        continue ;
                                     }
                                  }else {
                                     obj = null;
                                  }
                                  if (obj == null) {
                                     osideBarServ.invoke();
                                     break ;
                                  }else {
                                     LiteSideBarReplaceAnimController liteSideBarR = a.W2();
                                     LiveLiteSideBarViewController m = a.m;
                                     if (m == null) {
                                        a.S("sideBarBizContainerView");
                                     }
                                     liteSideBarR.c(m, p1, obj, osideBarServ);
                                     break ;
                                  }
                               }
                            }
                         }
                      }
                      r = null;
                      goto label_0129 ;
                   }
                }else {
                   this.b.d(p1);
                }
             }
             return;
          }
       }
       obj = b.b;
       String str = "precondition check failed";
       if (!obj.a() || liteSideBarC.b.contains(Integer.valueOf(p0))) {
          if (!obj.a() || liteSideBarC.a(p0, i)) {
             if (liteSideBarC.c.containsKey(Integer.valueOf(p0))) {
                obj1 = liteSideBarC.c.get(Integer.valueOf(p0));
                if (obj1 != null) {
                   b2 = obj1.remove(Integer.valueOf(i));
                label_00a7 :
                   if (!obj.a() || (liteSideBarC.d(p0).contains(Integer.valueOf(i)) ^ 1)) {
                      b = b2;
                      goto label_00c6 ;
                   }else {
                      throw new AssertionError("invariant check failed");
                   }
                }
             }
             b2 = 0;
             goto label_00a7 ;
          }else {
             throw new AssertionError(str);
          }
       }else {
          throw new AssertionError(str);
       }
    }
}
