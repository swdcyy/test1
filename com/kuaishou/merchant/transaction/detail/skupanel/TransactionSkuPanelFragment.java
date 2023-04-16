package com.kuaishou.merchant.transaction.detail.skupanel.TransactionSkuPanelFragment;
import com.kuaishou.merchant.basic.fragment.MerchantRecyclerDialogFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ki4.p;
import ki4.y;
import android.view.View;
import ki4.i;
import ki4.g;
import li4.e;
import ekd.m1;
import com.kuaishou.merchant.transaction.detail.skupanel.b;
import android.view.View$OnClickListener;
import qvb.n0;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import q2b.i$a;
import k2b.u1;
import q2b.i;
import java.util.Map;
import ii4.e;
import com.yxcorp.utility.TextUtils;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import c9c.c;
import com.kwai.sdk.switchconfig.a;
import kg4.a;
import ekd.q;
import android.app.Activity;
import java.util.HashMap;
import ii4.h;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.DetailParams;
import di4.q;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kuaishou.merchant.basic.util.h;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge$SkuPanelResult;
import com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge$a;
import ii4.n;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.net.Uri;
import ekd.x0;
import ot3.h0;
import com.kuaishou.merchant.transaction.detail.self.dynamic.model.DetailCommonData;
import ue4.g;
import android.os.Parcelable;
import org.parceler.b;
import ji4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.bottombar.model.BuyButton;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import ii4.c;
import com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse;
import ii4.i;
import k2b.j0;
import r74.d;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import y8c.g;
import ii4.f;
import qvb.i;
import com.kuaishou.merchant.transaction.detail.skupanel.a;

public class TransactionSkuPanelFragment extends MerchantRecyclerDialogFragment	// class@00077e
{
    public a A;
    public PresenterV2 B;
    public e C;
    public DetailParams D;
    public StartSkuPanelBridge$a E;
    public f F;
    public c G;
    public DetailCommonData H;
    public static final int I;

    public void TransactionSkuPanelFragment(){
       super();
    }
    public static TransactionSkuPanelFragment Ch(String p0){
       TransactionSkuPanelFragment obj = PatchProxy.applyOneRefs(p0, null, TransactionSkuPanelFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TransactionSkuPanelFragment();
       Bundle uBundle = new Bundle();
       uBundle.putString("PAGE_URL", p0);
       obj.setArguments(uBundle);
       return obj;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, TransactionSkuPanelFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new p(this));
       obj.U7(new y(this));
       PatchProxy.onMethodExit(TransactionSkuPanelFragment.class, "10");
       return obj;
    }
    public void Bh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TransactionSkuPanelFragment.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, TransactionSkuPanelFragment.class, "22")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.B = presenterV2;
          presenterV2.U7(new i(this));
          this.B.U7(new g(this));
          TransactionSkuPanelFragment tB = this.B;
          presenterV2.h = tB;
          tB.f(p0);
          m1.f(p0, R.id.close).setOnClickListener(new b(this));
       }
       this.A.a();
       return;
    }
    public String C1(){
       return "MERCHANT_SKU_PANEL_PAGE";
    }
    public String D1(){
       return "电商规格半屏选择页";
    }
    public int M(){
       return 1;
    }
    public void b2(int p0){
       boolean b;
       if (PatchProxy.isSupport(TransactionSkuPanelFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TransactionSkuPanelFragment.class, "17")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, TransactionSkuPanelFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.M() && (this.getPage() || !TextUtils.isEmpty(this.o()))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          if (this.getActivity() instanceof GifshowActivity) {
             this.getActivity().N2().i(false);
          }
          b.a(0x4b316083).Y0(u1.l(this).x(p0).b());
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0512;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TransactionSkuPanelFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(TransactionSkuPanelFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, TransactionSkuPanelFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.C.f.e());
    }
    public int getTheme(){
       return 0x7f11044d;
    }
    public d ia(){
       Object obj = PatchProxy.apply(null, this, TransactionSkuPanelFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.a();
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, TransactionSkuPanelFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.t().d("merchantUseSkuPageNameFromDetailPage", false) && this.C.f instanceof a) {
          return "";
       }
       return TextUtils.k(this.C.f.o());
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransactionSkuPanelFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       int i = (!q.h(this.C.g))? h.a(this.getActivity(), this.C.g): q.a(this.getActivity(), this.D);
       h.c(this, this.getDialog().getWindow(), i);
       return;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransactionSkuPanelFragment.class, "13")) {
          return;
       }
       super.onCancel(p0);
       this.C.f.a(false);
       if (this.C.o != null) {
          this.E.a(StartSkuPanelBridge$SkuPanelResult.cancelResult());
       }
       return;
    }
    public void onCreate(Bundle p0){
       TransactionSkuPanelFragment tC;
       TransactionSkuPanelFragment tC1;
       if (PatchProxy.applyVoidOneRefs(p0, this, TransactionSkuPanelFragment.class, "5")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, TransactionSkuPanelFragment.class, "18")) {
          if (!PatchProxy.applyVoid(objArray, this, TransactionSkuPanelFragment.class, "19")) {
             this.C = ViewModelProviders.of(this, new n(this)).get(e.class);
          }
          String str = "BUY_BUTTON";
          if (!PatchProxy.applyVoid(objArray, this, TransactionSkuPanelFragment.class, "20")) {
             p0 = this.getArguments();
             if (p0 != null) {
                String str1 = p0.getString("PAGE_URL");
                Uri uri = x0.f(str1);
                TransactionSkuPanelFragment tC2 = this.C;
                tC2.i = str1;
                if (uri != null) {
                   tC2.g.putAll(h0.a(uri));
                }
                String str2 = "USE_SCENE";
                if (!PatchProxy.applyVoidOneRefs(p0, this, TransactionSkuPanelFragment.class, "21")) {
                   Object obj = this.C.g.get("commonData");
                   Object obj1 = this.C.g.get("buyButton");
                   Object obj2 = this.C.g.get("identifyKey");
                   Object obj3 = this.C.g.get("useScene");
                   if (obj != null) {
                      this.H = g.b(obj.toString(), DetailCommonData.class);
                   }
                   if (obj1 != null) {
                      p0.putParcelable(str, b.c(obj1));
                   }
                   if (obj2 != null) {
                      this.C.l = obj2.toString();
                   }
                   if (obj3 != null) {
                      p0.putParcelable(str2, b.c(Integer.valueOf(Integer.parseInt(obj3.toString()))));
                   }
                }
                tC = this.C;
                tC.j = b.a(tC.g);
                DetailParams uDetailParam = b.a(this.getArguments().getParcelable("DETAIL_PARAMS"));
                this.D = uDetailParam;
                tC2 = this.C;
                tC2.k = uDetailParam;
                tC2.m = p0.getInt(str2, 0);
             }
          }
          BuyButton uBuyButton = (this.getArguments() != null)? b.a(this.getArguments().getParcelable(str)): objArray;
          TransactionSkuPanelFragment tH = this.H;
          if (tH != null && uBuyButton != null) {
             tC = this.C;
             TransactionSkuPanelFragment tG = this.G;
             if (tG != null) {
                objArray = tG.c();
             }
             tC.d = SkuPanelResponse.create(tH, uBuyButton, objArray);
             tC1 = this.C;
             TransactionSkuPanelFragment tG1 = this.G;
             i oi = (tG1 == null || tG1.b() == null)? new i(this, this, this.C): this.G.b();
             tC1.f = oi;
          }else {
             tC1 = this.C;
             tC1.f = new i(this, this, tC1);
          }
          tC1 = this.C;
          tC1.o = this.E;
          tC1.n = this.G;
       }
       d.a(this).b();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TransactionSkuPanelFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       TransactionSkuPanelFragment tB = this.B;
       if (tB != null) {
          tB.destroy();
          this.B = null;
       }
       return;
    }
    public void wh(){
       if (PatchProxy.applyVoid(null, this, TransactionSkuPanelFragment.class, "12")) {
          return;
       }
       super.wh();
       this.h0().addItemDecoration(new e(a1.d(R.dimen.arg_RES_7f070271), false));
       return;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, TransactionSkuPanelFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public i zh(){
       a obj = PatchProxy.apply(null, this, TransactionSkuPanelFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.A == null) {
          obj = new a(this.C);
          this.A = obj;
          this.C.e = obj;
       }
       return this.A;
    }
}
