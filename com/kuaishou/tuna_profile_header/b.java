package com.kuaishou.tuna_profile_header.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import xl8.b;
import n15.c;
import erd.g;
import crd.b;
import j5c.c;
import n15.a;
import android.view.View;
import n15.e;
import java.lang.Runnable;
import ekd.k1;
import android.widget.TextView;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import java.lang.CharSequence;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna_logger.KsLogTunaProfileTag;
import java.util.List;
import com.kuaishou.tuna_profile_header.a;
import msd.a;
import c15.b;
import com.kuaishou.tuna_profile_header.b$a;
import android.view.View$OnClickListener;
import com.kwai.framework.model.user.AdBusinessInfo;
import x2c.a;
import com.kwai.framework.model.user.AdBusinessInfo$BusinessFunction;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.tuna_profile_header.b$b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import n15.b;
import android.view.ViewStub;
import k2b.e0;
import java.lang.Integer;

public class b extends PresenterV2	// class@00117b
{
    public ViewStub p;
    public View q;
    public SizeAdjustableTextView r;
    public TextView s;
    public c t;
    public ProfileParam u;
    public int v;
    public e0 w;
    public b x;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.X7(this.x.observable().subscribe(new c(this)));
       this.X7(this.t.e().skip(1).subscribe(new a(this)));
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (!this.q.getMeasuredWidth()) {
          k1.r(new e(this, p0), 0);
          return;
       }else if(this.s == null){
          this.s = new TextView(this.m8().getContext());
          ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
          layoutParams.d = 0x7f0a3269;
          layoutParams.k = 0x7f0a3269;
          layoutParams.bottomMargin = a1.e(33.00f);
          layoutParams.leftMargin = this.q.getMeasuredWidth() - a1.e(15.00f);
          this.s.setLayoutParams(layoutParams);
          this.s.setPadding(a1.e(2.00f), 0, a1.e(2.00f), 0);
          this.s.setTextColor(a1.a(R.color.arg_RES_7f061ff3));
          this.s.setTextSize(1, 7.00f);
          this.s.setBackgroundResource(R.drawable.arg_RES_7f080408);
          m1.f(this.m8(), R.id.header_operation_root_view).addView(this.s);
       }
       this.s.setVisibility(0);
       this.s.setText(p0);
       return;
    }
    public final void R8(UserProfile p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "5")) {
          return;
       }
       if (this.q != null && p0 != null) {
          if (!TextUtils.x(this.u.mBanText)) {
             this.r.setEnabled(false);
             b.g(KsLogTunaProfileTag.PROFILE_HEADER.appendTag("MarketingEntrancePresenterV2"), a.b);
          }else {
             this.r.setEnabled(true);
          }
          this.r.setOnClickListener(new b$a(this, p0));
          AdBusinessInfo uAdBusinessI = a.b(p0);
          if (uAdBusinessI != null) {
             AdBusinessInfo mBusinessFun = uAdBusinessI.mBusinessFunction;
             if (mBusinessFun != null) {
                AdBusinessInfo$BusinessFunction mTitle = mBusinessFun.mTitle;
                if (mTitle != null) {
                   this.r.setText(mTitle);
                }
                if (!TextUtils.x(uAdBusinessI.mBusinessFunction.mBubbleDesc)) {
                   AdBusinessInfo$BusinessFunction mBubbleDesc = uAdBusinessI.mBusinessFunction.mBubbleDesc;
                   if (!PatchProxy.applyVoidOneRefs(mBubbleDesc, this, uob, "6")) {
                      this.P8(mBubbleDesc);
                      this.X7(RxBus.f.g(b$b.class, RxBus$ThreadMode.MAIN).subscribe(new b(this)));
                   }
                }
             }
          }
       }
    label_0083 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3269);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.t = this.r8("PROFILE_LOAD_STATE");
       this.u = this.q8(ProfileParam.class);
       this.w = this.t8("PROFILE_FRAGMENT");
       this.x = this.r8("PROFILE_MY_OPERATION_BUTTONS");
       this.v = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
