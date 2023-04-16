package com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment;
import bb4.c;
import com.kuaishou.merchant.basic.fragment.MerchantRecyclerDialogFragment;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$b;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$a;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import y8c.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vv3.j;
import vv3.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.Map;
import ks3.k0;
import java.util.List;
import g9c.d;
import c9c.c;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import et3.a;
import android.app.Activity;
import com.kuaishou.merchant.basic.util.h;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.content.res.Configuration;
import androidx.fragment.app.KwaiDialogFragment;
import uv3.e;
import com.kuaishou.merchant.customerservice.CustomerServiceLogBiz;
import p74.a;
import o74.a;
import android.net.Uri;
import ekd.x0;
import y8c.g;
import com.kuaishou.merchant.customerservice.live.size.a;
import qvb.i;
import com.kuaishou.merchant.customerservice.live.size.f;

public class LiveCustomerServiceSizeFragment extends MerchantRecyclerDialogFragment implements c	// class@001673
{
    public LiveCustomerServiceSizeFragment$b A;

    public void LiveCustomerServiceSizeFragment(){
       super();
       this.A = new LiveCustomerServiceSizeFragment$b();
    }
    public t Ah(){
       Object obj = PatchProxy.apply(null, this, LiveCustomerServiceSizeFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveCustomerServiceSizeFragment$a(this, this.Ac(), this, 2);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveCustomerServiceSizeFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new j());
       obj.U7(new a());
       PatchProxy.onMethodExit(LiveCustomerServiceSizeFragment.class, "11");
       return obj;
    }
    public String C1(){
       return "MERCHANT_COMMENT_SIZE_HALF_PAGE";
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, LiveCustomerServiceSizeFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = this.A.b.getLiveStreamPackage();
       return obj;
    }
    public void W3(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCustomerServiceSizeFragment.class, "4")) {
          return;
       }
       this.A.b = p0.get("MERCHANT_BASE_CONTEXT");
       this.A.c = p0.get("LIVE_MERCHANT_SIGNAL_SERVICE");
       return;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveCustomerServiceSizeFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.A);
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d04e5;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCustomerServiceSizeFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveCustomerServiceSizeFragment.class, null);
       return objectsByTag;
    }
    public d ia(){
       Object obj = PatchProxy.apply(null, this, LiveCustomerServiceSizeFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.a();
    }
    public String o(){
       return "LIVE_WATCH";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCustomerServiceSizeFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       h.c(this, this.getDialog().getWindow(), h.h(this.getActivity(), a.b, 0));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCustomerServiceSizeFragment.class, "7")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.dismissAllowingStateLoss();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCustomerServiceSizeFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       LiveCustomerServiceSizeFragment tA = this.A;
       tA.e = this;
       tA.a = this;
       if (!PatchProxy.applyVoid(null, this, LiveCustomerServiceSizeFragment.class, "2")) {
          tA = this.getArguments();
          if (tA == null) {
             a.A(CustomerServiceLogBiz.LIVE_SIZE, "LiveCustomerServiceSizeFragment", "invalid bundle!");
          }else {
             Uri uri = x0.f(tA.getString("KEY_MERCHANT_ROUTER_URL", ""));
             this.A.g = x0.a(uri, "itemId");
             this.A.h = x0.a(uri, "liveStreamId");
             this.A.i = x0.a(uri, "sellerId");
          }
       }
       return;
    }
    public int uh(){
       return 0x7f0a34da;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, LiveCustomerServiceSizeFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.A);
    }
    public i zh(){
       Object obj = PatchProxy.apply(null, this, LiveCustomerServiceSizeFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this.A);
    }
}
