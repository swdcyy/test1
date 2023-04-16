package com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment;
import hka.a;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import mkc.b;
import android.view.View;
import mkc.c;
import crd.b;
import lnc.b9;
import brd.t;
import v84.b;
import v84.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.marketing.shop.auction.start.c;
import erd.g;
import e94.j;
import com.kuaishou.merchant.marketing.shop.auction.start.b;
import ekd.m1;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.auction.start.AuctionPublish;
import u07.t$a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import e94.i;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import u84.b;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment$a;
import java.lang.reflect.Type;
import el.a;
import ca0.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.auction.start.a;
import com.kuaishou.merchant.marketing.shop.auction.start.a$b;
import com.yxcorp.utility.n;
import f94.g;
import f94.n;
import f94.b;
import f94.t;
import f94.q;
import e94.h;
import androidx.fragment.app.c$c;

public class LiveAnchorStartAuctionFragment extends BaseFragment implements a, d	// class@001bc7
{
    public final LiveAnchorStartAuctionFragment$c j;
    public PresenterV2 k;
    public b l;
    public View m;
    public static final int n;

    public void LiveAnchorStartAuctionFragment(){
       super();
       this.j = new LiveAnchorStartAuctionFragment$c();
    }
    public boolean ch(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorStartAuctionFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isAdded()) {
          return false;
       }
       if (this.getFragmentManager() != null) {
          return this.getFragmentManager().popBackStackImmediate("LiveAnchorStartSandeaBizFragment", 1);
       }
    }
    public final void dh(){
       LiveAnchorStartAuctionFragment$c b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAnchorStartAuctionFragment.class, "6")) {
          return;
       }
       c.h(this.m, b.f);
       b[] uobArray = new b[]{b.g};
       c.d(this.m, uobArray);
       b9.a(this.l);
       t ot = PatchProxy.apply(objArray, this, LiveAnchorStartAuctionFragment.class, "7");
       if (ot != PatchProxyResult.class) {
       }else {
          b uob = a.a();
          String id = QCurrentUser.me().getId();
          b = this.j.b;
          String liveStreamId = (b != null)? b.getLiveStreamId(): "";
          ot = uob.c(id, liveStreamId).map(new e());
       }
       this.l = ot.doOnNext(c.b).subscribe(new j(this), new b(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorStartAuctionFragment.class, "5")) {
          return;
       }
       this.m = m1.f(p0, 0x7f0a3f11);
       m1.b(p0, new LiveAnchorStartAuctionFragment$b(this), R.id.auction_space);
       return;
    }
    public boolean onBackPressed(){
       t$a obj = PatchProxy.apply(null, this, LiveAnchorStartAuctionFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.j.f.isEdited()) {
          return this.ch();
       }
       obj = new t$a(this.getActivity());
       obj.y0(R.string.arg_RES_7f100270);
       obj.S0(R.string.arg_RES_7f103266);
       obj.Q0(R.string.arg_RES_7f103227);
       obj.u0(new i(this));
       obj.p();
       j.d(obj);
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorStartAuctionFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0.b = b.a(this.getArguments().getParcelable("KEY_LIVE_BASE_CONTEXT"));
       p0.e = this;
       b f = b.k().f;
       if (f != null) {
          this.j.f = f;
       }else {
          LiveAnchorStartAuctionFragment$c f1 = this.j.f;
          Type type = new LiveAnchorStartAuctionFragment$a(this).getType();
          String str = a.a.getString(b.d("user")+"merchant_anchor_last_auction_category_list", "null");
          AuctionPublish uAuctionPubl = (str == null || str == "")? null: b.a(str, type);
          f1.mSelectCategoryList = uAuctionPubl;
       }
       b.k().n(null);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAnchorStartAuctionFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d04d9, p1, false);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAnchorStartAuctionFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       this.k.destroy();
       b9.a(this.l);
       LiveAnchorStartAuctionFragment$c h = this.j.h;
       Objects.requireNonNull(h);
       if (!PatchProxy.applyVoid(objArray, h, a.class, "5")) {
          h.a.b();
          h.c.b();
          b9.a(h.b);
          b9.a(h.d);
       }
       n.C(this.getActivity());
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorStartAuctionFragment.class, "4")) {
          return;
       }
       this.doBindView(p0);
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, LiveAnchorStartAuctionFragment.class, "10");
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new g());
          presenterV2.U7(new n());
          presenterV2.U7(new b());
          presenterV2.U7(new t());
          presenterV2.U7(new q());
          PatchProxy.onMethodExit(LiveAnchorStartAuctionFragment.class, "10");
       }
       this.k = presenterV2;
       presenterV2.f(p0);
       this.dh();
       this.getChildFragmentManager().addOnBackStackChangedListener(new h(this));
       return;
    }
}
