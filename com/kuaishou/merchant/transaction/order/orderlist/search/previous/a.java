package com.kuaishou.merchant.transaction.order.orderlist.search.previous.a;
import yk4.i;
import java.lang.Object;
import pl4.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ed4.d;
import la6.a;
import brd.t;
import rl4.n;
import com.kwai.sdk.switchconfig.a;
import qvb.n0;
import java.util.Objects;
import rl4.l;
import erd.o;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import rl4.m;
import rl4.f;
import brd.w;
import erd.c;
import rl4.j;
import rl4.k;
import rl4.g;
import rl4.i;
import rl4.c;
import rl4.h;
import rl4.b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.BaseOrderUIModel;
import com.kuaishou.merchant.transaction.order.orderlist.search.previous.model.SearchPreviousHistoryResponse;
import pl4.b;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantGuessLikeResponse;

public class a extends i	// class@0008b1
{
    public n m;

    public void a(){
       super();
    }
    public boolean B1(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          p0 = p0.c;
          if (p0 != null) {
             obj = PatchProxy.apply(null, p0, d.class, "1");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a(p0.cursor);
             if (!b) {
                b = false;
             }
          }
          b = true;
       }
       return b;
    }
    public t I1(){
       t ot;
       n on = n.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       a obj = PatchProxy.apply(objArray, this, a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = a.t().d("useNewGuessLikeStyle", false);
       if (this.K()) {
          if (b) {
             obj = this.m;
             Objects.requireNonNull(obj);
             ot = PatchProxy.apply(objArray, obj, on, "2");
             if (ot != patchProxyRe) {
             }else {
                ot = t.zip(obj.O0().onErrorReturn(l.b), obj.u0().onErrorReturn(m.b), new f(obj));
             }
          }else {
             obj = this.m;
             Objects.requireNonNull(obj);
             ot = PatchProxy.apply(objArray, obj, on, str);
             if (ot != patchProxyRe) {
             }else {
                ot = t.zip(obj.O0().onErrorReturn(j.b), obj.s0().onErrorReturn(k.b), g.a);
             }
          }
          return ot;
       }else if(b){
          obj = this.m;
          Objects.requireNonNull(obj);
          ot = PatchProxy.apply(objArray, obj, on, "4");
          if (ot != patchProxyRe) {
          }else {
             ot = obj.u0().map(new i(obj)).onErrorReturn(c.b);
          }
       }else {
          obj = this.m;
          Objects.requireNonNull(obj);
          ot = PatchProxy.apply(objArray, obj, on, "3");
          if (ot != patchProxyRe) {
          }else {
             ot = obj.s0().map(new h(obj)).onErrorReturn(b.b);
          }
       }
       return ot;
    }
    public void M1(Object p0,List p1){
       a a;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "3")) {
       }else {
          a = p0.a;
          if (!PatchProxy.applyVoidTwoRefs(a, p1, this, uoa, "4") && a != null) {
             BaseOrderUIModel uBaseOrderUI = (q.f(p1))? null: p1.get(false);
             if (q.f(a.mSearchHistoryModels)) {
                if (uBaseOrderUI != null && this.X1(uBaseOrderUI.a)) {
                   p1.remove(uBaseOrderUI);
                }
                uoa = this.m;
                if (uoa != null) {
                   uoa.q0();
                }
             }else {
                a tm = this.m;
                if (tm != null) {
                   tm.G0();
                }
                b uob = new b();
                uob.a = 3;
                uob.b = a.mSearchHistoryModels;
                if (uBaseOrderUI != null && this.X1(uBaseOrderUI.a)) {
                   p1.remove(uBaseOrderUI);
                }
                p1.add(false, uob);
             }
          }
       label_006b :
          if (a.t().d("useNewGuessLikeStyle", false)) {
             this.m.E0(p0.c, p1);
          }else {
             this.m.D0(p0.b, p1);
          }
       }
       return;
    }
    public final boolean X1(int p0){
       boolean b = (p0 == 3)? true: false;
       return b;
    }
}
