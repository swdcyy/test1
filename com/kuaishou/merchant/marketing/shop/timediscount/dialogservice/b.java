package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.b;
import ks3.p0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import z74.a;
import brd.t;
import eoc.e;
import brd.z;
import s94.b;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.a;
import erd.g;
import crd.b;
import ks3.t;
import ks3.o0;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import y94.c;
import java.lang.Integer;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import androidx.fragment.app.KwaiDialogFragment;
import tkd.b;
import tkd.d;
import fs5.a;
import oq5.b;
import java.util.Collection;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.LiveMerchantContainerServiceDialog;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.LiveMerchantContainerServiceDialog$a;
import com.kwai.robust.PatchProxyResult;
import s94.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import ca0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kuaishou.merchant.basic.fragment.MerchantBaseControllerDialogFragment;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import s94.f;
import java.util.Map;
import java.util.HashMap;
import z94.a;
import s94.c;
import q94.b;
import fq5.b;

public class b extends PresenterV2 implements p0, g	// class@001c16
{
    public LiveMerchantContainerServiceDialog p;
    public t q;
    public a r;
    public b s;
    public b t;
    public List u;
    public b v;
    public b w;

    public void b(){
       super();
       this.u = null;
       this.w = new b$a(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.X7(RxBus.f.f(a.class).observeOn(e.c).subscribe(new b(this), a.b));
       }
       uob = this.q;
       if (uob != null) {
          uob.c(this);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b tq = this.q;
       if (tq != null) {
          tq.d(this);
       }
       return;
    }
    public void P(){
       o0.b(this);
    }
    public void P8(LiveMerchantContainerDataList p0,c p1,int p2,boolean p3){
       LiveMerchantContainerServiceDialog$a d;
       b this;
       LiveMerchantContainerServiceDialog liveMerchant1;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, b.class, "7")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null && (activity.isFinishing() || !activity instanceof GifshowActivity)) {
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantContainerServicePresenter", "showDialog failed: activity is null");
          return;
       }else if(p0 == null || p0.size() <= 0){
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantContainerServicePresenter", "showDialog failed: dataList is null");
          return;
       }else {
          int i = 0;
          int i1 = (p1 != null)? p0.indexOf(p1): 0;
          if (i1 < 0) {
             i1 = 0;
          }
          b tp = this.p;
          if (tp != null) {
             tp.dismiss();
          }
          if (d.a(-1397441499).E(this.getActivity())) {
             this.t.d();
          }
          LiveMerchantContainerDataList liveMerchant = new LiveMerchantContainerDataList(p0);
          d = LiveMerchantContainerServiceDialog.D;
          b tr = this.r;
          this = this.s;
          Objects.requireNonNull(d);
          if (PatchProxy.isSupport(LiveMerchantContainerServiceDialog$a.class)) {
             Object[] objArray = new Object[]{liveMerchant,tr,this,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(i1)};
             liveMerchant1 = PatchProxy.apply(objArray, d, LiveMerchantContainerServiceDialog$a.class, "1");
             if (liveMerchant1 != PatchProxyResult.class) {
             label_00bb :
                this.p = liveMerchant1;
                liveMerchant1.k0(new a(this));
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putInt(b.d("user")+"merchant_sliding_next_view", (a.b() + 1));
                g.a(uEditor);
                this.p.show(activity.getSupportFragmentManager(), "LiveMerchantContainerServicePresenter");
                return;
             }
          }
          liveMerchant1 = new LiveMerchantContainerServiceDialog();
          liveMerchant1.v = liveMerchant;
          liveMerchant1.x = tr;
          liveMerchant1.y = this;
          liveMerchant1.z = p2;
          liveMerchant1.A = p3;
          liveMerchant1.B = i1;
          goto label_00bb ;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new f());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       this.q = this.r8("LIVE_MERCHANT_AUDIENCE_COMMON_SERVICE");
       Activity obj = PatchProxy.apply(objArray, this, uob, "2");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = this.getActivity();
          if (obj != null) {
             objArray = new c(this, obj);
          }
       }
       this.r = objArray;
       this.s = this.r8("LIVE_MERCHANT_TIME_DISCOUNT_SERVICE");
       this.t = this.q8(b.class);
       this.v = this.t8("LIVE_BASIC_CONTEXT");
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.dismiss();
       }
       this.p = null;
       return;
    }
    public void r(){
       o0.c(this);
    }
}
