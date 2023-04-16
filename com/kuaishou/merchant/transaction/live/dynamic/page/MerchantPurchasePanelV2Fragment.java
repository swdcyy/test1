package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment;
import com.kuaishou.merchant.transaction.base.dynamic.BaseDynamicFragment;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import k2b.e0;
import java.lang.Number;
import gd4.d;
import androidx.fragment.app.Fragment;
import gd4.d$a;
import android.net.Uri;
import java.lang.Boolean;
import java.util.HashMap;
import ij4.a;
import vd4.b;
import qj4.a;
import vd4.d;
import com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelPageCtxBuildingViewBinder;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.BasePageRenderViewBinder;
import kj4.b;
import vd4.p;
import kj4.g;
import id4.d;
import ri4.b;
import p74.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import android.os.Bundle;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import r74.d;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import k2b.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ij4.c;
import ij4.b;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kj4.a;
import jj4.a;
import androidx.fragment.app.FragmentActivity;
import kj4.i;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MtpGlobalBizDataProcViewBinder;
import kj4.e;
import kj4.c;
import com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelSkuServiceViewBinder;
import si4.g;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.MtppRealtimeActivityServiceManageViewBinder;
import kj4.d;
import kj4.h;
import com.kuaishou.merchant.transaction.live.dynamic.service.input.a;
import com.kuaishou.merchant.transaction.live.dynamic.service.preview.a;
import rj4.a;
import lj4.a;
import java.lang.IllegalStateException;

public final class MerchantPurchasePanelV2Fragment extends BaseDynamicFragment	// class@0007b3
{
    public a v;
    public ClientEvent$ExpTagTrans w;
    public ClientEvent$ExpTagTrans x;
    public HashMap y;
    public static final MerchantPurchasePanelV2Fragment$a z;

    static {
       MerchantPurchasePanelV2Fragment.z = new MerchantPurchasePanelV2Fragment$a(null);
    }
    public void MerchantPurchasePanelV2Fragment(){
       super();
    }
    public String C1(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       Objects.requireNonNull(obj);
       return "MERCHANT_PURCHASE_HALF_PAGE";
    }
    public String D1(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       Objects.requireNonNull(obj);
       return "半屏提单V2";
    }
    public ClientEvent$ExpTagTrans I1(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       return obj.I1();
    }
    public ClientEvent$ExpTagTrans K5(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       return obj.K5();
    }
    public int M(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       Objects.requireNonNull(obj);
       return 1;
    }
    public String dh(){
       String str;
       Uri obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.n.a(this).x0();
       if (obj != null) {
          str = obj.toString();
          if (str != null) {
          label_0025 :
             return str;
          }
       }
       str = "";
       goto label_0025 ;
    }
    public boolean eg(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       Objects.requireNonNull(obj);
       return true;
    }
    public int getLayoutResId(){
       return 0x7f0d04f1;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelV2Fragment.class, "27")) {
          return;
       }
       MerchantPurchasePanelV2Fragment ty = this.y;
       if (ty != null) {
          ty.clear();
       }
       return;
    }
    public String h5(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       return obj.h5();
    }
    public b hh(Fragment p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, MerchantPurchasePanelV2Fragment.class, "6");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(p0);
       }
       return uoa;
    }
    public d ih(Fragment p0){
       MtPurchasePanelPageCtxBuildingViewBinder mtPurchasePa = PatchProxy.applyOneRefs(p0, this, MerchantPurchasePanelV2Fragment.class, "7");
       if (mtPurchasePa != PatchProxyResult.class) {
       }else {
          mtPurchasePa = new MtPurchasePanelPageCtxBuildingViewBinder(p0);
       }
       return mtPurchasePa;
    }
    public BasePageRenderViewBinder jh(Fragment p0){
       b uob = PatchProxy.applyOneRefs(p0, this, MerchantPurchasePanelV2Fragment.class, "9");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(p0);
       }
       return uob;
    }
    public p kh(Fragment p0){
       g og = PatchProxy.applyOneRefs(p0, this, MerchantPurchasePanelV2Fragment.class, "8");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(p0);
       }
       return og;
    }
    public d lh(){
       b uob = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "5");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
       }
       return uob;
    }
    public a mh(){
       return MerchantTransactionLogBiz.PURCHASE_PANEL_V2;
    }
    public String nh(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       Objects.requireNonNull(obj);
       return "MERCHANT_PURCHASE_HALF_PAGE";
    }
    public String oh(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       return obj.getPageParams();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchasePanelV2Fragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       d.a(this).b();
       PageMonitor.registerPageInfo$default(PageMonitor.INSTANCE, this, this.o(), null, null, 12, null);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelV2Fragment.class, "12")) {
          return;
       }
       u1.c(this.o(), this.h5());
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.gh();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelV2Fragment.class, "11")) {
          return;
       }
       super.onResume();
       return;
    }
    public Uri ph(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, MerchantPurchasePanelV2Fragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       if (obj != null) {
          String str = obj.getString("KEY_MERCHANT_ROUTER_URL", "");
          if (str != null) {
             objArray = Uri.parse(str);
          }
       }
       return objArray;
    }
    public boolean qh(){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLogPage");
       }
       return obj.b();
    }
    public void rh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantPurchasePanelV2Fragment.class, "1")) {
          return;
       }
       super.rh();
       if (!PatchProxy.applyVoid(objArray, this, MerchantPurchasePanelV2Fragment.class, "2")) {
          d uod = d.n.a(this);
          c uoc = (a.g(uod.b, "/live/purchasepanelv2"))? new c(this, uod, this.w, this.x): new b(this, uod);
          this.v = uoc;
       }
       if (!PatchProxy.applyVoid(objArray, this, MerchantPurchasePanelV2Fragment.class, "3")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             Parcelable parcelable = arguments.getParcelable("MERCHANT_BASE_CONTEXT");
             if (parcelable != null) {
                d.n.a(this).m = b.a(parcelable);
             }
          }
       }
       return;
    }
    public void sh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MerchantPurchasePanelV2Fragment.class, "10")) {
          return;
       }
       super.sh(p0);
       FragmentActivity uFragmentAct = PatchProxy.apply(null, this, MerchantPurchasePanelV2Fragment.class, "13");
       if (uFragmentAct != PatchProxyResult.class) {
       }else if(this.getActivity() instanceof a){
          uFragmentAct = this.getActivity();
          Objects.requireNonNull(uFragmentAct, "null cannot be cast to non-null type com.kuaishou.merchant.transaction.live.dynamic.page.IContainerCallback");
       }else if(this.getParentFragment() instanceof a){
          uFragmentAct = this.getParentFragment();
          Objects.requireNonNull(uFragmentAct, "null cannot be cast to non-null type com.kuaishou.merchant.transaction.live.dynamic.page.IContainerCallback");
       }else {
          throw new IllegalStateException("没有找到containerCallback");
       }
       p0.U7(new a(uFragmentAct, this));
       p0.U7(new i(this));
       p0.U7(new MtpGlobalBizDataProcViewBinder(this));
       p0.U7(new e(this));
       p0.U7(new c(this));
       p0.U7(new MtPurchasePanelSkuServiceViewBinder(this));
       p0.U7(new g(this));
       p0.U7(new MtppRealtimeActivityServiceManageViewBinder(this));
       p0.U7(new d(this));
       p0.U7(new h(this));
       p0.U7(new a(this));
       p0.U7(new a(this));
       p0.U7(new a(this));
       p0.U7(new a(this));
       PatchProxy.onMethodExit(MerchantPurchasePanelV2Fragment.class, "10");
       return;
    }
}
