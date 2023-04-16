package com.kuaishou.merchant.transaction.purchase.presenter.y;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.y$a;
import com.kuaishou.merchant.transaction.purchase.presenter.y$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import vm4.e;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.base.model.CrossBorderInfo;
import com.yxcorp.gifshow.util.rx.RxBus;
import wd4.d;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.purchase.presenter.x;
import erd.r;
import um4.j0;
import erd.g;
import crd.b;
import vm4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import lnc.a1;
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
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseAuthData;
import com.kuaishou.merchant.transaction.base.authority.PurchaseAuthDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.robust.PatchProxyResult;
import um4.m0;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;

public class y extends PresenterV2 implements g	// class@0009c0
{
    public View A;
    public TextView B;
    public TextView C;
    public m D;
    public y$c p;
    public Map q;
    public CrossBorderInfo r;
    public boolean s;
    public a t;
    public MerchantPurchaseFragment u;
    public ViewStub v;
    public View w;
    public TextView x;
    public View y;
    public View z;

    public void y(){
       super();
       this.p = new y$a(this);
       this.D = new y$b(this);
    }
    public void E8(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "3")) {
          return;
       }
       if (this.s != null && (e.i(this.q, "crossBorder") && this.r != null)) {
          if (!PatchProxy.applyVoid(objArray, this, oy, "6")) {
             oy = this.v;
             if (oy != null) {
                View view = oy.inflate();
                this.w = view;
                this.x = view.findViewById(0x7f0a413d);
                this.y = this.w.findViewById(0x7f0a28aa);
                this.z = this.w.findViewById(0x7f0a4138);
                this.A = this.w.findViewById(0x7f0a28ad);
                this.B = this.w.findViewById(0x7f0a413f);
                this.C = this.w.findViewById(0x7f0a413e);
                this.v = objArray;
             }
          }
          this.R8();
          this.w.setVisibility(0);
          this.P8(this.r);
          this.X7(RxBus.f.f(d.class).observeOn(d.a).filter(x.b).subscribe(new j0(this)));
       }else {
          oy = this.w;
          if (oy != null && oy.getVisibility() != 8) {
             this.w.setVisibility(8);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "4")) {
          return;
       }
       y tt = this.t;
       if (tt != null) {
          tt.a();
       }
       return;
    }
    public final void P8(CrossBorderInfo p0){
       y oy = y.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oy, "7")) {
          return;
       }
       if (!TextUtils.x(p0.mRealUserName) && !TextUtils.x(p0.mIdCardNumber)) {
          this.x.setText(p0.mRealUserName+"   "+p0.mIdCardNumber);
          this.y.setVisibility(0);
          this.z.setVisibility(8);
          this.x.setVisibility(0);
          this.A.setVisibility(8);
       }else {
          this.y.setVisibility(8);
          this.z.setVisibility(0);
          y tC = this.C;
          String str = (TextUtils.x(p0.mSubTip))? a1.p(R.string.arg_RES_7f103278): p0.mSubTip;
          tC.setText(str);
          if (!PatchProxy.applyVoidOneRefs(p0, this, oy, "8")) {
             ArrayList uArrayList = new ArrayList();
             if (!q.f(p0.mKeyWordInfo)) {
                for (int i = 0; i < p0.mKeyWordInfo.size(); i = i + 1) {
                   CrossBorderInfo$KeyWordInfo keyWordInfo = p0.mKeyWordInfo.get(i);
                   uArrayList.add(new u$a(keyWordInfo.mKeyWord, keyWordInfo.mFontSize, q0.b(keyWordInfo.mColor), keyWordInfo.mIsBold));
                }
             }
             tC = this.B;
             Activity activity = this.getActivity();
             String str1 = (TextUtils.x(p0.mTip))? a1.p(R.string.arg_RES_7f103277): p0.mTip;
             tC.setText(u.a(activity, str1, uArrayList));
          }
          this.x.setVisibility(8);
          this.A.setVisibility(0);
       }
       this.w.setOnClickListener(this.D);
       this.y.setOnClickListener(this.D);
       this.z.setOnClickListener(this.D);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, y.class, "5")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.w.getLayoutParams();
       layoutParams.height = (!TextUtils.x(this.r.mRealUserName) && !TextUtils.x(this.r.mIdCardNumber))? a1.d(0x7f070325): a1.d(0x7f07033b);
       this.w.setLayoutParams(layoutParams);
       return;
    }
    public void S8(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "10")) {
          return;
       }
       PurchaseAuthData purchaseAuth = new PurchaseAuthData();
       y tr = this.r;
       CrossBorderInfo mDialogHint = (tr != null)? tr.mDialogHint: "";
       purchaseAuth.mHint = mDialogHint;
       purchaseAuth.mSubType = p0;
       PurchaseAuthDialogFragment.Ih(3, purchaseAuth).show(this.u.getChildFragmentManager(), "PurchaseVerifyDialogFragment");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       this.v = p0.findViewById(0x7f0a3b8c);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, y.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(y.class, new m0());
       }else {
          obj.put(y.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.q = this.t8("page_module_info");
       this.r = this.t8("cross_border");
       this.u = this.r8("FRAGMENT");
       this.s = this.v8("can_sale", Boolean.class).booleanValue();
       return;
    }
}
