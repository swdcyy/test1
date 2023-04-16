package com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup$STATE;
import java.lang.Enum;
import tda.n0;
import tda.m0;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.IllegalStateException;
import java.lang.System;
import vl8.b;
import kotlin.jvm.internal.a;
import java.util.Arrays;
import com.smile.gifshow.annotation.provider.v2.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;

public final class MilanoLazyPresenterGroup$b implements Runnable	// class@000f1c
{
    public final MilanoLazyPresenterGroup b;

    public void MilanoLazyPresenterGroup$b(MilanoLazyPresenterGroup p0){
       this.b = p0;
       super();
    }
    public final void run(){
       boolean b;
       MilanoLazyPresenterGroup f;
       Iterator iterator;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, MilanoLazyPresenterGroup$b.class, str)) {
          return;
       }
       this.b.j();
       MilanoLazyPresenterGroup$b tb = this.b;
       Objects.requireNonNull(tb);
       MilanoLazyPresenterGroup milanoLazyPr = MilanoLazyPresenterGroup.class;
       MilanoLazyPresenterGroup obj = PatchProxy.apply(objArray, tb, milanoLazyPr, str);
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          tb.h("doUpdateState: target: "+tb.c+"; current: "+tb.b);
          obj = tb.c;
          MilanoLazyPresenterGroup$STATE nONE = MilanoLazyPresenterGroup$STATE.NONE;
          if (obj != nONE) {
             MilanoLazyPresenterGroup$STATE iNIT = MilanoLazyPresenterGroup$STATE.INIT;
             if (obj.compareTo(iNIT) >= 0 && tb.b == nONE) {
                tb.h("doUpdateState: init");
                tb.b = iNIT;
                tb.f().a(tb);
                if (tb.c != iNIT) {
                label_0072 :
                   b = false;
                }
             }else {
                nONE = MilanoLazyPresenterGroup$STATE.CREATE;
                if (tb.c.compareTo(nONE) >= 0 && tb.b == iNIT) {
                   tb.h("doUpdateState: create");
                   f = tb.f;
                   if (f != null) {
                      tb.b = nONE;
                      iterator = tb.d.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().f(f);
                      }
                      if (tb.c != MilanoLazyPresenterGroup$STATE.CREATE) {
                      }
                   }else {
                      throw new IllegalStateException("mView 不能为空");
                   }
                }else {
                   iNIT = MilanoLazyPresenterGroup$STATE.BIND;
                   if (tb.c.compareTo(iNIT) >= 0) {
                      obj = tb.b;
                      if (obj == nONE || obj == iNIT) {
                         tb.h("doUpdateState: bind");
                         if (tb.b == nONE) {
                            tb.i = 0;
                         }
                         tb.b = iNIT;
                         long l = System.currentTimeMillis();
                         if (!PatchProxy.applyVoid(objArray, tb, milanoLazyPr, "9")) {
                            if (tb.g != null) {
                               if (tb.h == null) {
                                  b uob = new b(tb, PresenterV2.class);
                                  iterator = tb.d.iterator();
                                  while (iterator.hasNext()) {
                                     uob.x(iterator.next());
                                  }
                                  obj = tb.g;
                                  a.m(obj);
                                  tb.h = uob.a(Arrays.copyOf(obj, obj.length));
                               }
                            }else {
                               throw new IllegalStateException("mCallerContext 不能为空");
                            }
                         }
                         f = tb.h;
                         a.m(f);
                         long l1 = System.currentTimeMillis() - l;
                         while (l1 - (long)12 < 0 && tb.i <= CollectionsKt__CollectionsKt.G(tb.d)) {
                            Object obj1 = tb.d.get(tb.i);
                            a.o(obj1, "mPresenterList[mPresenterIndex]");
                            Object[] objArray1 = new Object[]{f};
                            obj1.i(objArray1);
                            int i = tb.i + 1;
                            tb.i = i;
                         }
                         tb.h("doUpdateState: bind at: "+tb.i+", size :"+tb.d.size());
                         if (tb.i > CollectionsKt__CollectionsKt.G(tb.d)) {
                            tb.b = MilanoLazyPresenterGroup$STATE.BOUND;
                         }
                         if (tb.b != MilanoLazyPresenterGroup$STATE.BOUND) {
                         }
                      }
                   }
                   tb.h("doUpdateState: none");
                }
             }
          }
       label_006f :
          b = true;
       }
       if (!b) {
          this.b.i();
       }
       return;
    }
}
