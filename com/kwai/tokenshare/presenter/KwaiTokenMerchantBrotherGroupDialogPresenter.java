package com.kwai.tokenshare.presenter.KwaiTokenMerchantBrotherGroupDialogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import fg6.a;
import com.google.gson.JsonElement;
import com.kwai.tokenshare.presenter.KwaiTokenMerchantBrotherGroupDialogPresenter$GrouponExtraModel;
import com.google.gson.Gson;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import lnc.a1;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.Button;
import java.lang.Throwable;
import lc5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.yxcorp.plugin.kwaitoken.model.CustomDialogInfo;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import android.net.Uri;
import ekd.w0;
import wkd.b;
import nf6.i;
import android.content.Intent;
import java.lang.StringBuilder;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.tokenshare.presenter.j;
import android.view.View$OnClickListener;
import fu7.r;

public class KwaiTokenMerchantBrotherGroupDialogPresenter extends PresenterV2	// class@001939
{
    public KwaiImageView p;
    public TextView q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public Button w;
    public CustomDialogInfo x;
    public KwaiTokenCustomPopUpDialog y;

    public void KwaiTokenMerchantBrotherGroupDialogPresenter(){
       super();
    }
    public void E8(){
       KwaiTokenMerchantBrotherGroupDialogPresenter kwaiTokenMer = KwaiTokenMerchantBrotherGroupDialogPresenter.class;
       if (PatchProxy.applyVoid(null, this, kwaiTokenMer, "3")) {
          return;
       }
       BaseDialogInfo mExtParams = this.x.mExtParams;
       if (mExtParams != null) {
          try{
             KwaiTokenMerchantBrotherGroupDialogPresenter$GrouponExtraModel grouponExtra = a.a.h(mExtParams.toString(), KwaiTokenMerchantBrotherGroupDialogPresenter$GrouponExtraModel.class);
             this.p.L(grouponExtra.mAvatar);
             this.q.setText(grouponExtra.mNickName);
             this.s.setText(grouponExtra.mGoodsTitle);
             this.r.L(grouponExtra.mGoodsUrl);
             KwaiTokenMerchantBrotherGroupDialogPresenter$GrouponExtraModel mCurrentPric = grouponExtra.mCurrentPrice;
             if (!PatchProxy.applyVoidOneRefs(mCurrentPric, this, kwaiTokenMer, "4") && !TextUtils.x(mCurrentPric)) {
                this.u.setText(mCurrentPric);
                this.u.setTypeface(d0.a("alte-din.ttf", a1.c()));
             }
             this.R8(grouponExtra.mOriginPrice);
             this.w.setText(grouponExtra.mActionButtonText);
             this.v.setText(grouponExtra.mSubTitle);
          }catch(com.google.gson.JsonSyntaxException e2){
             Object[] objArray = new Object[0];
             String[] stringArray = new String[]{"kwai_token"};
             b.f(b.b(null, "KwaiTokenMerchantBrotherGroupDialogPresenter", e2, objArray), stringArray);
          }
       }
    }
    public final ClientEvent$ElementPackage P8(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, KwaiTokenMerchantBrotherGroupDialogPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("share_id", this.x.mShareId);
       jsonObject.c0("biz_type", this.x.mOriginSubBiz);
       jsonObject.c0("kpn", this.x.mOriginKpn);
       obj.params = jsonObject.toString();
       return obj;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenMerchantBrotherGroupDialogPresenter.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append("гд");
       spannableStr.append(p0);
       int i = spannableStr.length();
       spannableStr.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f070271), false), false, i, 17);
       spannableStr.setSpan(new StrikethroughSpan(), spannableStr.length(), i, 17);
       this.t.setText(spannableStr);
       this.t.setTypeface(d0.a("alte-din.ttf", a1.c()));
       return;
    }
    public final void S8(String p0){
       KwaiTokenMerchantBrotherGroupDialogPresenter kwaiTokenMer = KwaiTokenMerchantBrotherGroupDialogPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kwaiTokenMer, "8")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, kwaiTokenMer, "9")) {
             Intent intent = b.a(0x66dce92a).c(this.getContext(), w0.f(p0), true, false);
             if (intent == null) {
                Object[] objArray = new Object[true];
                objArray[0] = "intent is null";
                String[] stringArray = new String[]{"kwai_token"};
                b.i(b.b("sourceUrl is "+p0, "KwaiTokenMerchantBrotherGroupDialogPresenter", null, objArray), stringArray);
             }else if(this.getContext() != null){
                this.getContext().startActivity(intent);
             }
          }
          this.y.c();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenMerchantBrotherGroupDialogPresenter.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a14f1);
       this.q = m1.f(p0, 0x7f0a42f7);
       this.r = m1.f(p0, 0x7f0a10e2);
       this.s = m1.f(p0, 0x7f0a10e7);
       this.t = m1.f(p0, 0x7f0a2f41);
       this.u = m1.f(p0, 0x7f0a1131);
       this.w = m1.f(p0, 0x7f0a007c);
       this.v = m1.f(p0, 0x7f0a0a92);
       m1.a(p0, new j(this), R.id.action);
       m1.a(p0, new r(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenMerchantBrotherGroupDialogPresenter.class, "1")) {
          return;
       }
       this.x = this.q8(CustomDialogInfo.class);
       this.y = this.q8(KwaiTokenCustomPopUpDialog.class);
       return;
    }
}
