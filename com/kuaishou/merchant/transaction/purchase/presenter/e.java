package com.kuaishou.merchant.transaction.purchase.presenter.e;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2$AgreementModule;
import com.kuaishou.merchant.transaction.base.model.PayAgreement;
import java.util.Collection;
import ekd.q;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.purchase.model.Agreement;
import java.lang.Boolean;
import java.util.Map;
import vm4.e;
import com.google.gson.JsonObject;
import android.widget.ImageView;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import android.text.SpannableStringBuilder;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.purchase.presenter.e$b;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import um4.i;
import android.view.View$OnClickListener;
import um4.k;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.purchase.presenter.d0$b;

public class e extends PresenterV2 implements g	// class@000973
{
    public View A;
    public View B;
    public TextView C;
    public TextView D;
    public boolean E;
    public e$c p;
    public d0$b q;
    public PaymentMethodPanelPresenter$d r;
    public Map s;
    public AgreementInfoV2 t;
    public boolean u;
    public long v;
    public long w;
    public JsonObject x;
    public View y;
    public ImageView z;

    public void e(){
       super();
       this.p = new e$a(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       if (this.R8()) {
          this.y.setVisibility(0);
          e tt = this.t;
          AgreementInfoV2 mMandatoryAg = (tt != null)? tt.mMandatoryAgreement: objArray;
          PaymentMethodInfo paymentMetho = this.r.b();
          if (paymentMetho != null) {
             objArray = paymentMetho.mAgreement;
          }
          this.X8(this.P8(mMandatoryAg, objArray), 0);
          mMandatoryAg = this.t.mDefaultAgreement;
          if (!PatchProxy.applyVoidOneRefs(mMandatoryAg, this, uoe, "9")) {
             if (mMandatoryAg == null || q.f(mMandatoryAg.mAgreementList)) {
                this.D.setVisibility(8);
             }else {
                this.D.setVisibility(0);
                this.W8(mMandatoryAg, this.D);
             }
          }
          this.S8(objArray);
       }else {
          this.y.setVisibility(8);
       }
       return;
    }
    public AgreementInfoV2$AgreementModule P8(AgreementInfoV2$AgreementModule p0,PayAgreement p1){
       AgreementInfoV2$AgreementModule obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = p0.mPrefix;
       ArrayList uArrayList = (p0.mAgreementList != null)? new ArrayList(p0.mAgreementList): new ArrayList();
       p0 = AgreementInfoV2$AgreementModule.of(obj, uArrayList);
       if (p1 != null && p1.isValid()) {
          PayAgreement mAgreementUr = p1.mAgreementUrlText;
          if (!q.f(uArrayList)) {
             mAgreementUr = mAgreementUr+"¡¢";
          }
          uArrayList.add(0, Agreement.of(mAgreementUr, p1.mAgreementUrlLink));
          p0.mExtraAgreementDesc = p1.mAgreementUrlAttachedDesc;
       }
       return p0;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.u != null && (e.i(this.s, "agreement") && this.t != null))? true: false;
       return b;
    }
    public void S8(PayAgreement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "12")) {
          return;
       }
       if (p0 != null && p0.isValid()) {
          JsonObject jsonObject = new JsonObject();
          this.x = jsonObject;
          jsonObject.c0("agreementUrlText", p0.mAgreementUrlText);
          this.x.c0("agreementUrlLink", p0.mAgreementUrlLink);
       }else {
          this.x = null;
       }
       return;
    }
    public void V8(boolean p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoe, "11")) {
          return;
       }
       uoe = this.z;
       int i = (p0)? 0x7f082547: 0x7f082546;
       uoe.setImageResource(i);
       this.E = p0;
       if (p1) {
          Long longx = b.a(0x3b1f7b44).a();
          long l = (longx != null)? longx.longValue(): 0;
          this.v = l;
          this.w = System.currentTimeMillis();
       }
       return;
    }
    public final void W8(AgreementInfoV2$AgreementModule p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "10")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(TextUtils.k(p0.mPrefix));
       if (!q.f(p0.mAgreementList)) {
          Iterator iterator = p0.mAgreementList.iterator();
          while (iterator.hasNext()) {
             Agreement uAgreement = iterator.next();
             if (TextUtils.x(uAgreement.mText) || TextUtils.x(uAgreement.mUrl)) {
                continue ;
             }else {
                spannableStr.append(uAgreement.mText);
                spannableStr.setSpan(new e$b(this, uAgreement), spannableStr.length(), spannableStr.length(), 17);
                if (!TextUtils.x(uAgreement.mDesc)) {
                   spannableStr.append(uAgreement.mDesc);
                }
             }
          }
          if (!TextUtils.x(p0.mExtraAgreementDesc)) {
             spannableStr.append("¡£");
             spannableStr.append(p0.mExtraAgreementDesc);
          }
       }
       p1.setText(spannableStr);
       p1.setMovementMethod(LinkMovementMethod.getInstance());
       return;
    }
    public void X8(AgreementInfoV2$AgreementModule p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "8")) {
          return;
       }
       if (p0 == null || q.f(p0.mAgreementList)) {
          this.B.setVisibility(8);
       }else {
          this.B.setVisibility(0);
          this.W8(p0, this.C);
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, uoe, "7")) {
             this.A.setOnClickListener(new i(this));
             if (!p1) {
                int i = (this.w > 0)? 1: 0;
                if (!i) {
                label_0058 :
                   this.V8(0, 0);
                }
             }else {
                goto label_0058 ;
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.y = p0.findViewById(0x7f0a01b4);
       this.A = p0.findViewById(0x7f0a01b3);
       this.z = p0.findViewById(0x7f0a14e7);
       this.C = p0.findViewById(0x7f0a41ce);
       this.B = p0.findViewById(0x7f0a28c4);
       this.D = p0.findViewById(0x7f0a4148);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new k());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.s = this.t8("page_module_info");
       this.t = this.t8("agreementV2");
       this.u = this.v8("can_sale", Boolean.class).booleanValue();
       this.q = this.r8("page_scroll_dispatch_service");
       this.r = this.r8("payment_method_service");
       return;
    }
}
