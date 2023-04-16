package com.kuaishou.merchant.transaction.purchase.presenter.v;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import um4.g0;
import com.kuaishou.merchant.transaction.purchase.presenter.v$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import vm4.e;
import android.view.View;
import android.view.ViewStub;
import um4.d0;
import android.view.View$OnClickListener;
import ekd.m1;
import android.widget.TextView;
import um4.e0;
import um4.f0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.merchant.transaction.base.model.CrossBorderInfo;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.transaction.base.model.CrossBorderInfo$KeyWordInfo;
import ue4.u$a;
import ot3.q0;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import ue4.u;
import com.kuaishou.krn.event.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import oj0.a;
import vm4.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import com.kuaishou.merchant.router.b;
import java.lang.Integer;
import um4.i0;

public class v extends PresenterV2 implements g	// class@0009b2
{
    public TextView A;
    public boolean B;
    public a C;
    public final a D;
    public v$b E;
    public CrossBorderInfo p;
    public Map q;
    public boolean r;
    public ViewStub s;
    public View t;
    public TextView u;
    public TextView v;
    public View w;
    public View x;
    public View y;
    public TextView z;

    public void v(){
       super();
       this.B = true;
       this.D = new g0(this);
       this.E = new v$a(this);
    }
    public void E8(){
       v tp;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "3")) {
          return;
       }
       int i = 8;
       if (this.r != null && (e.i(this.q, "crossBorderCC") && this.p != null)) {
          if (!PatchProxy.applyVoid(objArray, this, ov, "5") && this.t == null) {
             tp = this.s;
             if (tp != null) {
                View view = tp.inflate();
                this.t = view;
                view.setOnClickListener(new d0(this));
                this.s = objArray;
                this.y = m1.f(this.t, 0x7f0a28ac);
                this.z = m1.f(this.t, 0x7f0a413b);
                this.A = m1.f(this.t, 0x7f0a413a);
                this.u = m1.f(this.t, 0x7f0a42f7);
                this.v = m1.f(this.t, 0x7f0a41a7);
                this.w = m1.f(this.t, 0x7f0a28ab);
                view = m1.f(this.t, R.id.tv_cross_border_cc_go);
                this.x = view;
                view.setOnClickListener(new e0(this));
                this.w.setOnClickListener(new f0(this));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, ov, "8")) {
             ViewGroup$MarginLayoutParams layoutParams = this.t.getLayoutParams();
             layoutParams.height = (this.P8(this.p))? a1.d(0x7f070325): a1.d(0x7f07033b);
             this.t.setLayoutParams(layoutParams);
          }
          tp = this.p;
          if (!PatchProxy.applyVoidOneRefs(tp, this, ov, "10") && tp != null) {
             boolean b = this.P8(tp);
             v tv = this.v;
             int i1 = (b)? 0: 8;
             tv.setVisibility(i1);
             tv = this.u;
             i1 = (b)? 0: 8;
             tv.setVisibility(i1);
             tv = this.y;
             i1 = (b)? 8: 0;
             tv.setVisibility(i1);
             this.v.setText(tp.mIdCardNumber);
             this.u.setText(tp.mRealUserName);
             tv = this.A;
             String str = (TextUtils.x(tp.mSubTip))? a1.p(R.string.arg_RES_7f103278): tp.mSubTip;
             tv.setText(str);
             if (!PatchProxy.applyVoidOneRefs(tp, this, ov, "11")) {
                ArrayList uArrayList = new ArrayList();
                if (!q.f(tp.mKeyWordInfo)) {
                   for (i1 = 0; i1 < tp.mKeyWordInfo.size(); i1 = i1 + 1) {
                      CrossBorderInfo$KeyWordInfo keyWordInfo = tp.mKeyWordInfo.get(i1);
                      uArrayList.add(new u$a(keyWordInfo.mKeyWord, keyWordInfo.mFontSize, q0.b(keyWordInfo.mColor), keyWordInfo.mIsBold));
                   }
                }
                v tz = this.z;
                Activity activity = this.getActivity();
                String str1 = (TextUtils.x(tp.mTip))? a1.p(R.string.arg_RES_7f103279): tp.mTip;
                tz.setText(u.a(activity, str1, uArrayList));
             }
             tp = this.w;
             int i2 = (b)? 0: 8;
             tp.setVisibility(i2);
             tp = this.x;
             if (!b) {
                i = 0;
             }
             tp.setVisibility(i);
          }
          if (!PatchProxy.applyVoid(objArray, this, ov, "12")) {
             a uoa = a.b();
             if (uoa == null) {
                a.g(MerchantTransactionLogBiz.PURCHASE, "CrossBorderCCPanelPresenter", "registerRNEventListener: manager null");
             }else {
                uoa.a("MerchantPurchaseInterceptSubmitOrder", this.D);
             }
          }
          this.V8(0);
       }else {
          this.S8();
          this.V8(i);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       v tC = this.C;
       if (tC != null) {
          tC.a();
       }
       this.S8();
       return;
    }
    public final boolean P8(CrossBorderInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.mUserAuthenticationId > 0 && (!TextUtils.x(p0.mRealUserName) && !TextUtils.x(p0.mIdCardNumber))))? true: false;
       return b;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, v.class, "7")) {
          return;
       }
       if (this.p != null) {
          HashMap hashMap = new HashMap();
          hashMap.put("authenticateReason", String.valueOf(1));
          b.k(this.getActivity(), TextUtils.e(this.p.mClickRedirectLink, hashMap));
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, v.class, "13")) {
          return;
       }
       a uoa = a.b();
       if (uoa != null) {
          uoa.c("MerchantPurchaseInterceptSubmitOrder", this.D);
       }
       return;
    }
    public final void V8(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "6")) {
          return;
       }
       ov = this.t;
       if (ov != null) {
          ov.setVisibility(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a3b89);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, v.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(v.class, new i0());
       }else {
          obj.put(v.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.p = this.t8("cross_border");
       this.q = this.t8("page_module_info");
       this.r = this.v8("can_sale", Boolean.class).booleanValue();
       return;
    }
}
