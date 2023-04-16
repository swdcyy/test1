package com.kuaishou.merchant.transaction.purchase.dynamic.MerchantPurchaseV2Fragment;
import com.kuaishou.merchant.transaction.base.dynamic.BaseDynamicFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gd4.d;
import androidx.fragment.app.Fragment;
import gd4.d$a;
import android.net.Uri;
import java.util.HashMap;
import vd4.b;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder;
import vd4.d;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpPageCtxBuildingViewBinder;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.BasePageRenderViewBinder;
import rm4.e;
import vd4.p;
import rm4.i;
import id4.d;
import fm4.a;
import p74.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import lnc.i3;
import ekd.x0;
import java.net.URLDecoder;
import ue4.o;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.framework.model.user.QCurrentUser;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rm4.c;
import rm4.h;
import rm4.g;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MtpGlobalBizDataProcViewBinder;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpGlobalCommonDataProcViewBinder;
import rm4.f;
import gm4.f;
import rm4.b;
import rm4.a;

public final class MerchantPurchaseV2Fragment extends BaseDynamicFragment	// class@0008fb
{
    public HashMap v;

    public void MerchantPurchaseV2Fragment(){
       super();
    }
    public String C1(){
       return "MERCHANT_PURCHASE_PAGE_V2";
    }
    public String D1(){
       return "电商买家侧提单页V2";
    }
    public boolean ch(){
       return true;
    }
    public String dh(){
       String str;
       Uri obj = PatchProxy.apply(null, this, MerchantPurchaseV2Fragment.class, "11");
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
    public int getLayoutResId(){
       return 0x7f0d04f2;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseV2Fragment.class, "13")) {
          return;
       }
       MerchantPurchaseV2Fragment tv = this.v;
       if (tv != null) {
          tv.clear();
       }
       return;
    }
    public b hh(Fragment p0){
       MtpLoadingViewBinder mtpLoadingVi = PatchProxy.applyOneRefs(p0, this, MerchantPurchaseV2Fragment.class, "2");
       if (mtpLoadingVi != PatchProxyResult.class) {
       }else {
          mtpLoadingVi = new MtpLoadingViewBinder(p0);
       }
       return mtpLoadingVi;
    }
    public d ih(Fragment p0){
       MtpPageCtxBuildingViewBinder mtpPageCtxBu = PatchProxy.applyOneRefs(p0, this, MerchantPurchaseV2Fragment.class, "3");
       if (mtpPageCtxBu != PatchProxyResult.class) {
       }else {
          mtpPageCtxBu = new MtpPageCtxBuildingViewBinder(p0);
       }
       return mtpPageCtxBu;
    }
    public BasePageRenderViewBinder jh(Fragment p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, MerchantPurchaseV2Fragment.class, "5");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(p0);
       }
       return uoe;
    }
    public p kh(Fragment p0){
       i oi = PatchProxy.applyOneRefs(p0, this, MerchantPurchaseV2Fragment.class, "4");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i(p0);
       }
       return oi;
    }
    public d lh(){
       a uoa = PatchProxy.apply(null, this, MerchantPurchaseV2Fragment.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public a mh(){
       return MerchantTransactionLogBiz.PURCHASE_V2;
    }
    public String nh(){
       return "MERCHANT_PURCHASE_PAGE";
    }
    public String oh(){
       Map map;
       String key;
       Object[] objArray2;
       Object[] objArray = null;
       i3 obj = PatchProxy.apply(objArray, this, MerchantPurchaseV2Fragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       String str = "";
       if (!PatchProxy.applyVoidOneRefs(obj, this, MerchantPurchaseV2Fragment.class, "9")) {
          Uri uri = d.n.a(this).x0();
          if (uri != null && uri.isHierarchical()) {
             obj.d("url", uri.toString());
             key = x0.a(uri, "itemParam");
             key = (key != null)? URLDecoder.decode(key): objArray;
             obj.d("item_id", o.p("itemId", x0.a(uri, "itemId"), key));
             obj.d("sku_id", o.p("skuId", x0.a(uri, "skuId"), key));
             obj.d("seller_id", o.p("sellerId", x0.a(uri, "sellerId"), key));
             obj.d("item_activity_type", x0.b(uri, "itemActivityType", "0"));
             key = x0.a(uri, "carrierId");
             if (key == null) {
                key = str;
             }
             obj.d("carrier_id", key);
             key = x0.a(uri, "carrierType");
             if (key == null) {
                key = str;
             }
             obj.d("carrier_type", key);
             key = x0.a(uri, "carrierEntry");
             if (key == null) {
                key = str;
             }
             obj.d("carrier_entry", key);
             key = x0.a(uri, "serverExpTag");
             if (key == null) {
                key = str;
             }
             obj.d("server_exp_tag", key);
             key = x0.a(uri, "promoteId");
             if (key == null) {
                key = str;
             }
             obj.d("promote_id", key);
             key = x0.a(uri, "promoteChannel");
             if (key == null) {
                key = str;
             }
             obj.d("promote_channel", key);
             obj.d("batch_type", x0.a(uri, "batchType"));
             String str1 = x0.a(uri, "entranceScene");
             if (str1 == null) {
                str1 = str;
             }
             obj.d("entrance_scene", str1);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, this, MerchantPurchaseV2Fragment.class, "10")) {
          map = d.n.a(this).u0();
          if (!(map.isEmpty() ^ 0x01)) {
             Object[] objArray1 = objArray;
          }
          if (map != null) {
             Iterator iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                String key1 = uEntry1.getKey();
                obj.d(key1, uEntry1.getValue());
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, this, MerchantPurchaseV2Fragment.class, "8")) {
          map = d.n.a(this).q0();
          if (map.isEmpty() ^ 0x01) {
             objArray = map;
          }
          if (objArray != null) {
             Iterator iterator = objArray.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                key = uEntry.getKey();
                obj.d(key, uEntry.getValue());
             }
          }
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       if (qCurrentUser != null) {
          String id = qCurrentUser.getId();
          if (id != null) {
             str = id;
          }
       }
       obj.d("buyer_id", str);
       return obj.e();
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.gh();
    }
    public void sh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MerchantPurchaseV2Fragment.class, "6")) {
          return;
       }
       super.sh(p0);
       p0.U7(new c(this));
       p0.U7(new h(this));
       p0.U7(new g(this));
       p0.U7(new MtpGlobalBizDataProcViewBinder(this));
       p0.U7(new MtpGlobalCommonDataProcViewBinder(this));
       p0.U7(new f(this));
       p0.U7(new f(this));
       p0.U7(new b());
       p0.U7(new a(this));
       PatchProxy.onMethodExit(MerchantPurchaseV2Fragment.class, "6");
       return;
    }
}
