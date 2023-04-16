package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel$2;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import da6.a;
import java.lang.System;
import java.util.LinkedList;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.OrderListGuessLikeBackwardCardFrequencyControlModel;
import java.util.Iterator;
import android.util.Pair;
import java.util.Set;
import java.util.List;
import qvb.n0;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.BaseOrderUIModel;
import xk4.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import ed4.a;
import yk4.i;
import com.kuaishou.merchant.transaction.base.detail.newguesslike.model.GuessLikeBackwardCardModel;

public class BaseOrderViewModel$2 implements LifecycleObserver	// class@00085d
{
    public final BaseOrderViewModel b;

    public void BaseOrderViewModel$2(BaseOrderViewModel p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       boolean b1;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseOrderViewModel uBaseOrderVi = BaseOrderViewModel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseOrderViewModel$2.class, "1")) {
          return;
       }
       BaseOrderViewModel$2 tb = this.b;
       boolean b = false;
       if (tb.l != null) {
          tb.l = b;
          return;
       }else if(tb.n == null){
          a.c(-1);
       }
       long l = a.b();
       if (this.b.n != null && (l > 0 && System.currentTimeMillis() - l < 0)) {
          this.b.p.clear();
          return;
       }else {
          tb = this.b;
          if (tb.k != null) {
             Objects.requireNonNull(tb);
             BaseOrderViewModel obj = PatchProxy.apply(objArray, tb, uBaseOrderVi, "31");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(tb.n != null){
                obj = tb.p;
                if (obj != null && obj.size() == tb.m.mMinClickNum) {
                   Iterator iterator = tb.p.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!iterator.next().second.booleanValue()) {
                            continue ;
                         }
                      }else {
                         b1 = true;
                      }
                   }
                }
             }
             b1 = false;
             if (b1) {
                tb = this.b;
                Objects.requireNonNull(tb);
                a.c((System.currentTimeMillis() + (long)(((tb.m.mExpiration * 60.00f) * 60.00f) * 1000.00f)));
                return;
             }else {
                tb = this.b;
                obj = tb.j;
                if (obj != null && !tb.o.contains(obj)) {
                   tb = this.b;
                   obj = tb.k;
                   Objects.requireNonNull(tb);
                   List obj1 = PatchProxy.applyOneRefs(obj, tb, uBaseOrderVi, "22");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else {
                      obj1 = tb.c.d1();
                      BaseOrderViewModel j = tb.j;
                      ArrayList obj2 = PatchProxy.applyOneRefs(j, tb, uBaseOrderVi, "25");
                      if (obj2 != patchProxyRe) {
                         i = obj2.intValue();
                      }else {
                         List list = tb.c.d1();
                         obj2 = new ArrayList();
                         if (!q.f(list) && j != null) {
                            int i2 = 0;
                            while (true) {
                               if (i2 < list.size()) {
                                  BaseOrderUIModel uBaseOrderUI = list.get(i2);
                                  if (uBaseOrderUI.a == 8 && j.equals(uBaseOrderUI.b.c)) {
                                     i = i2;
                                  }else {
                                     i2 = i2 + 1;
                                  }
                               }
                            }
                         }
                         i = -1;
                      }
                      if (i == (obj1.size() - 1)) {
                         obj1.add((i + 1), obj);
                      }else {
                         BaseOrderViewModel i1 = tb.i;
                         if (i1 != -1) {
                            obj1.add(i1, obj);
                         }
                      }
                      tb.c.V1();
                      b = true;
                   }
                   if (b) {
                      BaseOrderViewModel$2 tb1 = this.b;
                      tb1.o.add(tb1.j);
                      tb1 = this.b;
                      if (tb1.n != null) {
                         uBaseOrderVi = tb1.k;
                         if (uBaseOrderVi != null) {
                            BaseOrderUIModel b2 = uBaseOrderVi.b;
                            if (b2 != null) {
                               a c = b2.c;
                               if (c != null) {
                                  tb1.p.add(new Pair(c, Boolean.FALSE));
                               }
                            }
                         }
                      }
                   }
                }
             label_016d :
                this.b.k = objArray;
             }
          }
          return;
       }
    }
}
