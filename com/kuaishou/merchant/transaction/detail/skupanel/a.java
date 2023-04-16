package com.kuaishou.merchant.transaction.detail.skupanel.a;
import qvb.n0;
import li4.e;
import com.kuaishou.ksmvvm.command.KSCommand;
import com.kuaishou.ksmvvm.command.KSCommand$Status;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ii4.k;
import java.util.concurrent.Callable;
import java.lang.Throwable;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import ii4.e;
import java.util.List;

public class a extends n0	// class@00077f
{
    public final e m;

    public void a(e p0){
       super();
       this.m = p0;
       if (p0.d == null) {
          p0.v.g.setValue(KSCommand$Status.EXECUTING);
       }
       return;
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj.d == null) {
          return obj.q0();
       }
       return t.fromCallable(new k(this));
    }
    public void J1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.l(MerchantTransactionLogBiz.DETAIL, "DetailSkuPageList", "sku pageList error", p0);
       this.m.v.g.setValue(KSCommand$Status.FAILURE);
       this.m.v.i.setValue(p0);
       this.m.f.d(false);
       return;
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
       }else {
          this.m.v.h.setValue(p0);
          this.m.v.g.setValue(KSCommand$Status.SUCCESS);
          this.m.r0(p0, p1);
       }
       return;
    }
}
