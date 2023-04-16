package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q64.i0;
import erd.g;
import crd.b;
import brd.t;
import q64.h0;
import java.lang.Integer;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ag6.a;
import android.widget.EditText;
import java.lang.CharSequence;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$d;
import android.text.TextWatcher;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$e;
import android.view.View$OnClickListener;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$f;
import com.kuaishou.merchant.live.marketing.sandeago.model.MultiSkuModel;
import android.widget.LinearLayout;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.util.List;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.merchant.live.marketing.sandeago.model.StartSandeagoCategoryInfoResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import android.widget.TextView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import r14.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$b;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$c;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;
import io.reactivex.subjects.PublishSubject;

public class u extends PresenterV2	// class@001a97
{
    public View A;
    public View B;
    public StartSandeagoCategoryInfoResponse C;
    public a D;
    public boolean E;
    public boolean F;
    public boolean G;
    public SandeagoPublish p;
    public SandeagoPublish q;
    public LiveAnchorStartSandeagoFragment r;
    public LiveMerchantBaseContext s;
    public PublishSubject t;
    public PublishSubject u;
    public PublishSubject v;
    public View w;
    public TextView x;
    public EditText y;
    public LinearLayout z;

    public void u(){
       super();
       this.E = false;
       this.F = false;
       this.G = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       this.X7(this.t.subscribe(new i0(this)));
       this.X7(this.u.subscribe(new h0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "4")) {
          return;
       }
       this.R8();
       this.E = false;
       this.F = false;
       this.G = false;
       return;
    }
    public final void P8(String p0,String p1,int p2){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, u.class, "7")) {
          return;
       }
       View view = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d06c2, this.m8(), false);
       EditText uEditText = view.findViewById(R.id.tv_start_sandeago_sku_title);
       uEditText.setText(p0);
       uEditText.addTextChangedListener(new u$d(this));
       view.findViewById(R.id.iv_start_sandeago_sku_delete).setOnClickListener(new u$e(this, view));
       EditText uEditText1 = view.findViewById(R.id.et_start_sandeago_sku_stock);
       uEditText1.setId(View.generateViewId());
       if (!TextUtils.x(p1)) {
          uEditText1.setText(p1);
       }
       uEditText1.addTextChangedListener(new u$f(this));
       MultiSkuModel multiSkuMode = new MultiSkuModel(uEditText, uEditText1);
       view.setTag(multiSkuMode);
       this.z.addView(view);
       this.p.mMultiSkuList.add(p2, multiSkuMode);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, u.class, "14")) {
          return;
       }
       u tD = this.D;
       if (tD != null && tD.K()) {
          this.D.o();
          this.D = null;
       }
       return;
    }
    public final boolean S8(){
       u tC = this.C;
       boolean b = (tC != null && tC.mMultiSkuShowStatus == 3)? true: false;
       return b;
    }
    public final void V8(){
       boolean b;
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "6")) {
          return;
       }
       if (!this.S8()) {
          return;
       }
       this.z.removeAllViews();
       this.p.mMultiSkuList.clear();
       Object obj = PatchProxy.apply(objArray, this, ou, "13");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          ou = this.q;
          b = (ou != null && (ou.mIsMultiSku == null || q.f(ou.mMultiSkuList)))? false: this.G ^ true;
       }
       if (b) {
          for (; i < this.q.mMultiSkuList.size(); i = i + 1) {
             this.P8(this.q.mMultiSkuList.get(i).getSkuName(), this.q.mMultiSkuList.get(i).getSkuStockText(), i);
          }
          this.G = true;
       }else if(!q.f(this.C.mSkuList)){
          for (; i < this.C.mSkuList.size(); i = i + 1) {
             this.P8(this.C.mSkuList.get(i), "", i);
          }
       }
       ou = this.p;
       if (ou.mIsMultiSku != null) {
          this.y.setText(String.valueOf(ou.updateTotalStock()));
       }
       this.F = true;
       return;
    }
    public final void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, u.class, "5")) {
          return;
       }
       SandeagoPublish mIsMultiSku = this.p.mIsMultiSku;
       u tA = this.A;
       int i = 0;
       int i1 = (mIsMultiSku != null)? 0: 8;
       tA.setVisibility(i1);
       tA = this.B;
       i1 = (mIsMultiSku != null)? 0: 8;
       tA.setVisibility(i1);
       tA = this.z;
       if (mIsMultiSku == null) {
          i = 8;
       }
       tA.setVisibility(i);
       this.y.setEnabled((mIsMultiSku ^ 0x01));
       if (this.q == null) {
          tA = this.y;
          String str = (mIsMultiSku != null)? String.valueOf(this.p.updateTotalStock()): "";
          tA.setText(str);
       }
       tA = this.x;
       i = (mIsMultiSku != null)? 0x7f10438e: 0x7f10438d;
       tA.setText(i);
       if (mIsMultiSku != null && this.E == null) {
          ClientContent$LiveStreamPackage liveStreamPa = this.s.getLiveStreamPackage();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, k.class, "7")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SPECIFICATION_ADD";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u0(6, uElementPack, uContentPack);
          }
          this.E = true;
       }
       if (mIsMultiSku != null && this.F == null) {
          this.V8();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a429f);
       this.x = m1.f(p0, 0x7f0a429e);
       this.y = m1.f(p0, 0x7f0a0d9a);
       this.z = m1.f(p0, 0x7f0a28df);
       this.A = m1.f(p0, 0x7f0a4287);
       this.B = m1.f(p0, 0x7f0a4288);
       m1.b(p0, new u$a(this), R.id.tv_start_sandeago_add_sku);
       m1.b(p0, new u$b(this), R.id.tv_start_sandeago_all_mould);
       m1.b(p0, new u$c(this), R.id.tv_start_sandeago_switch_sku);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.p = this.r8("SANDEABIZ_PUBLISH");
       this.q = this.t8("SANDEABIZ_STORE_PUBLISH");
       this.r = this.r8("SANDEABIZ_START_FRAGMENT");
       this.s = this.r8("LIVE_BASE_CONTEXT");
       this.t = this.r8("SANDEAGO_CATEGORY_CHANGED_SUBJECT");
       this.v = this.r8("SANDEAGO_SKU_EDIT_TEXT_CHANGED_SUBJECT");
       this.u = this.r8("SANDEAGO_RULE_CONFIG_SUBJECT");
       return;
    }
}
