package com.kuaishou.merchant.live.basic.container.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.basic.container.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l14.c;
import tq5.a;
import tq5.c;
import com.kuaishou.merchant.live.basic.container.LiveMerchantAnchorContainerFragment;
import com.kwai.robust.PatchProxyResult;
import l14.d;
import com.kwai.feature.api.live.base.service.quitlive.AnchorQuitLiveCheckOrder;
import l14.g;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gq5.e;

public class a extends PresenterV2 implements g	// class@00188a
{
    public LiveMerchantAnchorContainerFragment p;
    public BaseFragment q;
    public c r;
    public e s;
    public e t;

    public void a(){
       super();
       this.t = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.r.Ci(new c(this), this.R8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.p = null;
       return;
    }
    public LiveMerchantAnchorContainerFragment P8(){
       LiveMerchantAnchorContainerFragment obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p == null) {
          obj = new LiveMerchantAnchorContainerFragment();
          this.p = obj;
          obj.k = new d(this);
       }
       return this.p;
    }
    public Object R8(){
       return AnchorQuitLiveCheckOrder.ANCHOR_SHOP;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new g());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_FRAGMENT");
       this.r = this.r8("LIVE_QUIT_LIVE_SERVICE");
       this.s = this.s8(e.class);
       return;
    }
}
