package com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment$a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.LiveEmptyView;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import y8c.g;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment$c;
import qvb.i;
import qvb.f;
import com.kuaishou.merchant.live.cart.orders.a;

public class LiveShopOrdersFragment extends RecyclerFragment implements d	// class@0019cb
{
    public String F;
    public long G;
    public LiveEmptyView H;
    public static final int I;

    public void LiveShopOrdersFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveShopOrdersFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveShopOrdersFragment$a(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopOrdersFragment.class, "2")) {
          return;
       }
       this.H = m1.f(p0, 0x7f0a2568);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0dc4;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveShopOrdersFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveShopOrdersFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopOrdersFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null && this.getArguments().containsKey("liveStreamID")) {
          this.F = this.getArguments().getString("liveStreamID");
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveShopOrdersFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       return;
    }
    public int qh(){
       return 0x7f0a2569;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveShopOrdersFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveShopOrdersFragment$c(this);
    }
    public i yh(){
       a uoa = PatchProxy.apply(null, this, LiveShopOrdersFragment.class, "6");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this.F);
       }
       return uoa;
    }
}
