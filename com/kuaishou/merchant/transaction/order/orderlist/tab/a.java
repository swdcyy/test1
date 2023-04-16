package com.kuaishou.merchant.transaction.order.orderlist.tab.a;
import yk4.i;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderCommodityResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import zl4.a;
import vl4.g;
import java.lang.Runnable;
import ekd.k1;
import brd.t;
import qvb.n0;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import androidx.lifecycle.MutableLiveData;
import qvb.a;
import com.kuaishou.ksmvvm.command.KSCommand$Status;
import ll4.b;
import ll4.a;
import java.lang.Number;
import tk4.a;
import java.util.Map;
import cjd.e;
import erd.o;
import qvb.n0$a;
import java.lang.Throwable;
import java.util.List;
import com.yxcorp.gifshow.util.rx.RxBus;
import xk4.k;
import com.kuaishou.ksmvvm.command.KSCommand;

public class a extends i	// class@0008be
{
    public a m;
    public OrderCommodityResponse n;
    public int o;
    public boolean p;
    public boolean q;

    public void a(){
       super();
    }
    public boolean B1(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && p0.hasMore()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean E1(){
       return true;
    }
    public Object F1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(this.p == null){
          obj = this.n;
          if (obj != null && !q.f(obj.mOrderTabInfos)) {
             obj = this.m;
             if (obj != null && obj.L == null) {
                k1.o(new g(this));
                this.p = true;
                this.q = true;
                this.m.L = true;
                objArray = this.n;
             }
          }
       }
       this.q = false;
       return objArray;
    }
    public t I1(){
       int i;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       OrderCommodityResponse obj = PatchProxy.apply(null, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = (!this.K())? this.L0().mCursor: "";
       OrderCommodityResponse orderCommodi = obj;
       a tm = this.m;
       if (tm != null) {
          tm.s.setValue(Boolean.FALSE);
       }
       OrderCommodityResponse orderCommodi1 = null;
       if (this.K() && this.q == null) {
          this.X1();
       }else {
          this.m.F0(this.hasMore(), orderCommodi1);
       }
       if (this.K() && !this.getCount()) {
          this.m.N.setValue(KSCommand$Status.EXECUTING);
       }
       b uob = a.a();
       a to = this.o;
       Object obj1 = PatchProxy.apply(null, this, uoa, "11");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          OrderCommodityResponse orderCommodi2 = this.L0();
          if (orderCommodi2 != null) {
             orderCommodi1 = orderCommodi2.mDisplayType;
          }
          i = orderCommodi1;
       }
       return uob.o(to, orderCommodi, 10, i, a.b.a(), this.m.e).map(new e());
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       if (this.K()) {
          this.m.N.setValue(KSCommand$Status.SUCCESS);
       }
       super.K1(p0);
       return;
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (this.K()) {
          this.m.N.setValue(KSCommand$Status.FAILURE);
          this.m.O.setValue(p0);
       }
       return;
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
       }else {
          a tm = this.m;
          if (tm != null) {
             tm.L0(p0, p1);
          }
          p0 = p0.orderListTransparentParam;
          if (p0 != null) {
             a.b.b(p0);
          }
       }
       return;
    }
    public void O1(boolean p0){
       if (PatchProxy.isSupport(a.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "8");
       }
       return;
    }
    public final void X1(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       a tm = this.m;
       if (tm != null) {
          tm.r.setValue("");
          this.m.F0(true, true);
       }
       RxBus.f.b(new k(this.o, true));
       return;
    }
    public void load(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.load();
       if (!this.K() && !this.hasMore()) {
          a tm = this.m;
          if (tm != null) {
             tm.w.a();
          }
       }
       return;
    }
}
