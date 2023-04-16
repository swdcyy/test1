package com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.String;
import ks3.x;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;
import y8c.t;
import com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment$b;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w84.e;
import java.util.Map;
import g9c.d;
import c9c.c;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import lnc.a1;
import com.kuaishou.merchant.basic.util.h;
import android.content.res.Configuration;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import x84.a;
import androidx.lifecycle.ViewModel;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import u84.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import y8c.g;
import com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment$a;
import qvb.i;
import com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment$c;

public class LiveAuctionBidRecordFragment extends RecyclerDialogFragment	// class@001b81
{
    public x A;
    public a z;

    public void LiveAuctionBidRecordFragment(){
       super();
    }
    public static LiveAuctionBidRecordFragment Bh(LiveMerchantBaseContext p0,String p1,x p2){
       LiveAuctionBidRecordFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveAuctionBidRecordFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAuctionBidRecordFragment();
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("LIVE_BASE_CONTEXT", b.c(p0));
       uBundle.putString("ITEM_ID", p1);
       obj.setArguments(uBundle);
       obj.A = p2;
       return obj;
    }
    public t Ah(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionBidRecordFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAuctionBidRecordFragment$b(this, this.Ac(), this, 2);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveAuctionBidRecordFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new e(this));
       PatchProxy.onMethodExit(LiveAuctionBidRecordFragment.class, "8");
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d04de;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAuctionBidRecordFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAuctionBidRecordFragment.class, null);
       return objectsByTag;
    }
    public d ia(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionBidRecordFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.a();
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAuctionBidRecordFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       h.c(this, this.getDialog().getWindow(), a1.d(R.dimen.arg_RES_7f070e26));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAuctionBidRecordFragment.class, "5")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.dismissAllowingStateLoss();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAuctionBidRecordFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       a uoa = ViewModelProviders.of(this).get(a.class);
       this.z = uoa;
       uoa.b = b.a(this.getArguments().getParcelable("LIVE_BASE_CONTEXT"));
       uoa.c = this.getArguments().getString("ITEM_ID");
       uoa.d = this.A;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAuctionBidRecordFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       ClientContent$LiveStreamPackage liveStreamPa = this.z.b.getLiveStreamPackage();
       a c = this.z.c;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, c, null, a.class, "16")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "BID_RECORD_LIST";
          u1.u0(2, uElementPack, a.a(liveStreamPa, c));
       }
       return;
    }
    public boolean th(){
       return true;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionBidRecordFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAuctionBidRecordFragment$a(this);
    }
    public i zh(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionBidRecordFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAuctionBidRecordFragment$c(this);
    }
}
