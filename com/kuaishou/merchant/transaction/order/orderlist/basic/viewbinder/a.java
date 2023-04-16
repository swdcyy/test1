package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yk4.i;
import java.util.HashMap;
import al4.f;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a$a;
import com.kuaishou.ksmvvm.command.KSCommand;
import yk4.d;
import pk0.b;
import wl4.r;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Long;
import android.util.Pair;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.BaseOrderUIModel;
import qvb.n0;
import com.yxcorp.gifshow.util.rx.RxBus;
import xk4.k;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabItemInfo;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabItemInfo$OrderInfo;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderCommodityResponse;
import androidx.lifecycle.MutableLiveData;
import java.lang.Number;
import java.lang.Math;
import java.util.Iterator;

public class a extends BaseOrderViewModel	// class@000862
{
    public long A;
    public int B;
    public long C;
    public int D;
    public int E;
    public boolean F;
    public d G;
    public KSCommand H;
    public f y;
    public r z;

    public void a(BaseFragment p0,i p1,HashMap p2){
       super(p0, p1, p2);
       this.y = new f();
       this.C = -1;
       this.E = -1;
       this.F = false;
       this.G = new a$a(this);
       this.H = new KSCommand(new d(this));
       this.z = new r(p0, this);
       a ty = this.y;
       a tG = this.G;
       Objects.requireNonNull(ty);
       if (PatchProxy.applyVoidOneRefs(tG, ty, f.class, "1")) {
       }else if(tG == null || ty.a.contains(tG)){
          ty.a.add(tG);
       }
       this.B = 0;
       this.D = 0;
       return;
    }
    public void H0(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "4")) {
          return;
       }
       Pair pair = this.I0(p0);
       pair = pair.second;
       if (pair.first.intValue() >= 0 && pair != null) {
          this.c.d1().remove(pair);
          this.q0();
          RxBus.f.b(new k(this.w0(), 2));
          this.c.V1();
       }
       return;
    }
    public final Pair I0(long p0){
       List obj;
       BaseOrderUIModel uBaseOrderUI;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.c.d1();
       if (q.f(obj)) {
          return new Pair(Integer.valueOf(-1), null);
       }else {
          int i = 0;
          while (true) {
             if (i >= obj.size()) {
                return new Pair(Integer.valueOf(-1), null);
             }
             uBaseOrderUI = obj.get(i);
             if (uBaseOrderUI.a == 3) {
                OrderTabItemInfo mOrderInfo = uBaseOrderUI.b.mOrderInfo;
                if (mOrderInfo != null && !mOrderInfo.mOid - p0) {
                   break ;
                }
             }
             i = i + 1;
          }
          return new Pair(Integer.valueOf(i), uBaseOrderUI);
       }
    }
    public void J0(int p0,List p1,BaseOrderUIModel p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "10")) {
          return;
       }
       p1.add(p0, p2);
       this.D = this.D + 1;
       return;
    }
    public boolean K0(){
       BaseOrderViewModel obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null && obj.K())? true: false;
       return b;
    }
    public void L0(OrderCommodityResponse p0,List p1){
       int i1;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "5")) {
          return;
       }
       if (this.K0() && !p0.hasMore()) {
          this.s.setValue(Boolean.TRUE);
       }
       if (this.K0()) {
          int i = 0;
          this.D = i;
          if (p0.hasMore()) {
             p1.clear();
          }else if(PatchProxy.applyVoidOneRefs(p1, this, uoa, "6") || q.f(p1)){
             List obj = PatchProxy.apply(null, this, uoa, "8");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else {
                obj = this.c.d1();
                if (!q.f(obj)) {
                   int i2 = 0;
                   while (true) {
                      if (i2 < obj.size()) {
                         BaseOrderUIModel uBaseOrderUI = obj.get(i2);
                         if (uBaseOrderUI != null && uBaseOrderUI.a()) {
                            i1 = i2;
                            break ;
                         }else {
                            i2 = i2 + 1;
                         }
                      }
                   }
                }
                i1 = -1;
             }
             if (i1 == -1 || i1 > (p1.size() - 1)) {
                p1.clear();
             }else {
                p1.removeAll(p1.subList(i, i1));
             }
          }
       }
       if (q.f(p0.mOrderTabInfos)) {
          this.q0();
          return;
       }else {
          this.G0();
          this.D = Math.min(this.D, p1.size());
          Iterator iterator = p0.mOrderTabInfos.iterator();
          while (iterator.hasNext()) {
             OrderTabItemInfo orderTabItem = iterator.next();
             if (orderTabItem == null) {
                continue ;
             }
             this.J0(this.D, p1, BaseOrderUIModel.f(3, orderTabItem));
          }
          return;
       }
    }
    public void M0(int p0,long p1,long p2){
       this.B = p0;
       this.A = p1;
       this.C = p2;
    }
}
