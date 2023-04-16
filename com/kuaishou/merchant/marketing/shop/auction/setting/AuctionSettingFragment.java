package com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment;
import ml8.d;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$b;
import com.kuaishou.merchant.marketing.shop.auction.setting.a;
import java.lang.String;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$a;
import android.view.View$OnClickListener;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import ekd.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d94.l;
import d94.s;
import d94.i;
import d94.o;
import androidx.fragment.app.c;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionOpenKrnFragment;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.krn.event.a;
import oj0.a;
import u84.b;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import android.net.Uri;
import ekd.x0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import ekd.k1;

public class AuctionSettingFragment extends MerchantBaseFragment implements d	// class@001bb5
{
    public String m;
    public String n;
    public PresenterV2 o;
    public TextView p;
    public final AuctionSettingFragment$b q;
    public AuctionOpenKrnFragment r;
    public boolean s;
    public final a t;
    public static final Object u;

    static {
       AuctionSettingFragment.u = new Object();
    }
    public void AuctionSettingFragment(){
       super();
       this.m = "KwaishopCAuctionOpen";
       this.n = "KwaishopCAuctionOpen";
       this.q = new AuctionSettingFragment$b();
       this.s = true;
       this.t = new a(this);
    }
    public String C1(){
       return "MERCHANT_AUCTION_SETTING";
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuctionSettingFragment.class, "9")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f2c);
       m1.f(p0, R.id.back_btn).setOnClickListener(new AuctionSettingFragment$a(this));
       return;
    }
    public void fh(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AuctionSettingFragment.class, "4")) {
          return;
       }
       int[] ointArray = new int[2];
       p0.getLocationOnScreen(ointArray);
       int i = 1;
       if (!ointArray[i] && this.s != null) {
          i.b(this.getActivity(), p0);
       }
       this.doBindView(p0);
       String str = "7";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, AuctionSettingFragment.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new l());
          presenterV2.U7(new s());
          presenterV2.U7(new i());
          presenterV2.U7(new o());
          PatchProxy.onMethodExit(AuctionSettingFragment.class, str);
       }
       this.o = presenterV2;
       presenterV2.f(p0);
       AuctionSettingFragment tq = this.q;
       if (tq.g != null) {
          Object[] objArray = new Object[i];
          objArray[0] = tq;
          this.o.i(objArray);
          this.p.setText(R.string.arg_RES_7f10027e);
       }else {
          this.p.setText(R.string.arg_RES_7f100288);
          if (!this.isAdded() || (this.getActivity() != null && this.getFragmentManager() != null)) {
             tq = this.m;
             AuctionSettingFragment tn = this.n;
             LaunchModel$b obj = PatchProxy.applyTwoRefs(tq, tn, null, AuctionOpenKrnFragment.class, "1");
             if (obj != patchProxyRe) {
             }else {
                obj = new LaunchModel$b();
                obj.i(tq);
                obj.j(tn);
                LaunchModel$b uob = obj.f("enableBackBtnHandler", 0);
                LaunchModel launchModel = uob.e("containerSource", "AuctionOpenRnFragment").h();
                AuctionOpenKrnFragment uAuctionOpen = PatchProxy.applyOneRefs(launchModel, null, AuctionOpenKrnFragment.class, "4");
                if (uAuctionOpen != patchProxyRe) {
                }else {
                   uAuctionOpen = new AuctionOpenKrnFragment();
                   Bundle uBundle = new Bundle();
                   uBundle.putParcelable("rn_launch_model", launchModel);
                   uAuctionOpen.setArguments(uBundle);
                }
                obj = uAuctionOpen;
             }
             this.r = obj;
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.v(R.id.fragment_container, this.r);
             uoe.l();
          }
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuctionSettingFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       a.b().a("MerchantAuctionOpened", this.t);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuctionSettingFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0.d = this;
       p0 = this.getArguments();
       if (p0 != null) {
          this.s = p0.getBoolean("KEY_PROCESS_PADDING", true);
          this.q.e = p0.getString("liveStreamId");
          AuctionSettingFragment tq = this.q;
          b uob = b.k();
          AuctionSettingFragment$b e = this.q.e;
          boolean booleanx = p0.getBoolean("is_mode_on");
          Objects.requireNonNull(uob);
          b uob1 = b.class;
          if (PatchProxy.isSupport(uob1)) {
             Object obj = PatchProxy.applyTwoRefs(e, Boolean.valueOf(booleanx), uob, uob1, "5");
             if (obj != PatchProxyResult.class) {
                booleanx = obj.booleanValue();
             }else if(TextUtils.x(e)){
                Boolean uBoolean = uob.a.get(e);
                booleanx = (uBoolean != null)? uBoolean.booleanValue(): false;
             }
          }else {
             goto label_005b ;
          }
          tq.h = booleanx;
          Uri uri = x0.f(p0.getString("KEY_MERCHANT_ROUTER_URL", ""));
          this.q.g = Boolean.parseBoolean(x0.b(uri, "isOpened", "false"));
          this.m = x0.b(uri, "bundleId", "KwaishopCAuctionOpen");
          this.n = x0.b(uri, "componentName", "KwaishopCAuctionOpen");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AuctionSettingFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.e(p1, 0x7f0d049f);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AuctionSettingFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       a.b().c("MerchantAuctionOpened", this.t);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AuctionSettingFragment.class, "8")) {
          return;
       }
       this.o.destroy();
       k1.n(AuctionSettingFragment.u);
       super.onDestroyView();
       return;
    }
}
