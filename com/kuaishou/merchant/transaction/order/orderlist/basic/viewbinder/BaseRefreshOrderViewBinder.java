package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseRefreshOrderViewBinder;
import rk0.b;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseRefreshOrderViewBinder$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oj0.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.e;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.d;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.krn.event.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import com.kuaishou.ksmvvm.command.KSCommand;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import yk4.s;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import yk4.a;
import yk4.c;
import yk4.b;
import sk0.a;
import pk0.a;
import com.kuaishou.ksmvvm.command.b;
import com.kuaishou.ksmvvm.command.a;

public abstract class BaseRefreshOrderViewBinder extends b	// class@000860
{
    public boolean s;
    public LifecycleObserver t;
    public a u;
    public a v;

    public void BaseRefreshOrderViewBinder(Fragment p0){
       super(p0);
       this.s = true;
       this.t = new BaseRefreshOrderViewBinder$1(this);
       Object[] objArray = null;
       e uoe = PatchProxy.apply(objArray, this, BaseRefreshOrderViewBinder.class, "8");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this);
       }
       this.u = uoe;
       d uod = PatchProxy.apply(objArray, this, BaseRefreshOrderViewBinder.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(this);
       }
       this.v = uod;
       return;
    }
    public void E8(){
       BaseRefreshOrderViewBinder uBaseRefresh = BaseRefreshOrderViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseRefresh, "2")) {
          return;
       }
       this.s = true;
       this.R8().getLifecycle().addObserver(this.t);
       if (!PatchProxy.applyVoid(objArray, this, uBaseRefresh, "4")) {
          a.b().a("MerchantOrderListRefreshOrder", this.u);
       }
       a.b().a("merchantOrderMiniProgramFullRefresh", this.v);
       return;
    }
    public void J8(){
       BaseRefreshOrderViewBinder uBaseRefresh = BaseRefreshOrderViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseRefresh, "3")) {
          return;
       }
       super.J8();
       this.R8().getLifecycle().removeObserver(this.t);
       if (!PatchProxy.applyVoid(objArray, this, uBaseRefresh, "5")) {
          a.b().c("MerchantOrderListRefreshOrder", this.u);
       }
       a.b().c("merchantOrderMiniProgramFullRefresh", this.v);
       return;
    }
    public abstract a S8();
    public final void V8(KSCommand p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseRefreshOrderViewBinder.class, "7")) {
          return;
       }
       a a = this.S8().A;
       if (a - null > 0) {
          this.X7(t.timer(a, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new s(this, p0, p1)));
       }else {
          p0.b(p1);
       }
       return;
    }
    public void W8(int p0){
       BaseRefreshOrderViewBinder uBaseRefresh = BaseRefreshOrderViewBinder.class;
       if (PatchProxy.isSupport(uBaseRefresh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseRefresh, "6")) {
          return;
       }
       a uoa = this.S8();
       Object[] objArray = null;
       if (p0 != 1) {
          if (p0 == 2 && uoa.C > 0) {
             KSCommand kSCommand = PatchProxy.apply(objArray, uoa, a.class, "1");
             if (kSCommand != PatchProxyResult.class) {
             }else {
                kSCommand = new KSCommand(uoa, new a(uoa), new c(uoa), new b(uoa));
             }
             this.V8(kSCommand, String.valueOf(uoa.C));
          }
       }else {
          this.V8(uoa.H, objArray);
       }
       return;
    }
    public abstract String getTag();
}
