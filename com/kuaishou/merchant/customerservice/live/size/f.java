package com.kuaishou.merchant.customerservice.live.size.f;
import qvb.n0;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.customerservice.model.CustomerServiceSizeResponse;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xv3.c;
import xv3.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import cjd.e;
import erd.o;
import java.util.List;
import com.kuaishou.merchant.customerservice.model.CustomerServiceSize;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import java.util.Objects;
import uv3.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import com.kuaishou.merchant.customerservice.CustomerServiceLogBiz;
import p74.a;
import o74.a;

public class f extends n0	// class@001679
{
    public final String m;
    public LiveCustomerServiceSizeFragment$b n;

    public void f(LiveCustomerServiceSizeFragment$b p0){
       super();
       this.m = "LiveCustomerServiceSizePageList";
       this.n = p0;
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f tn = this.n;
       return b.b().a(tn.i, tn.h, tn.g, tn.b.getServerExpTag()).map(new e());
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
       }else if(p0 != null){
          CustomerServiceSizeResponse mCustomerSer = p0.mCustomerServiceSize;
          if (mCustomerSer != null) {
             this.n.d = mCustomerSer;
             CustomerServiceSize mCommodity = mCustomerSer.mCommodity;
             if (mCommodity != null) {
                p1.add(mCommodity);
             }
             p0 = p0.mCustomerServiceSize.mSizeImage;
             if (p0 != null) {
                p1.add(p0);
             }
             p0 = this.n.e;
             if (p0 != null) {
                p0.a();
             }
             p0 = this.n.f;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, e.class, "1")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MERCHANT_COMMENT_SIZE_HALF";
                u1.B0(new ShowMetaData().setElementPackage(uElementPack).setContentPackage(p0.a.Q3()).setLogPage(p0.a));
             }
          }
       }
       a.g(CustomerServiceLogBiz.LIVE_SIZE, "LiveCustomerServiceSizePageList", "invalid response !");
       return;
    }
}
