package com.kwai.tokenshare.presenter.KwaiTokenMerchantLotteryDialogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import fg6.a;
import com.google.gson.JsonElement;
import com.kwai.tokenshare.presenter.KwaiTokenMerchantLotteryDialogPresenter$LotteryExtraModel;
import com.google.gson.Gson;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Throwable;
import lc5.b;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
import android.widget.Button;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import lnc.a1;
import android.text.style.StrikethroughSpan;
import android.net.Uri;
import ekd.w0;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.content.Intent;
import java.lang.StringBuilder;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.tokenshare.presenter.k;
import android.view.View$OnClickListener;
import fu7.t;

public class KwaiTokenMerchantLotteryDialogPresenter extends PresenterV2	// class@00193b
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public Button w;
    public BigPictureDialogInfo x;
    public KwaiTokenCustomPopUpDialog y;

    public void KwaiTokenMerchantLotteryDialogPresenter(){
       super();
    }
    public void E8(){
       KwaiTokenMerchantLotteryDialogPresenter kwaiTokenMer = KwaiTokenMerchantLotteryDialogPresenter.class;
       if (PatchProxy.applyVoid(null, this, kwaiTokenMer, "3")) {
          return;
       }
       BaseDialogInfo mExtParams = this.x.mExtParams;
       if (mExtParams != null) {
          try{
             KwaiTokenMerchantLotteryDialogPresenter$LotteryExtraModel lotteryExtra = a.a.h(mExtParams.toString(), KwaiTokenMerchantLotteryDialogPresenter$LotteryExtraModel.class);
             this.q.setText(lotteryExtra.mNickName);
             this.t.setText(lotteryExtra.mGoodsTitle);
             this.s.L(lotteryExtra.mGoodsUrl);
             this.S8(lotteryExtra.mCurrentPrice);
             this.R8(lotteryExtra.mOriginPrice);
          }catch(com.google.gson.JsonSyntaxException e2){
             Object[] objArray = new Object[0];
             String[] stringArray = new String[]{"kwai_token"};
             b.f(b.b(null, "KwaiTokenMerchantLotteryDialogPresenter", e2, objArray), stringArray);
          }
       }
    }
    public final ClientEvent$ElementPackage P8(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, KwaiTokenMerchantLotteryDialogPresenter.class, "13");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenMerchantLotteryDialogPresenter.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append("гд");
       int i = spannableStr.length();
       spannableStr.append(p0);
       int i1 = spannableStr.length();
       spannableStr.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f070f6c), false), false, i, 17);
       spannableStr.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f070f6e), false), i, i1, 17);
       spannableStr.setSpan(new StrikethroughSpan(), i, i1, 17);
       this.v.setText(spannableStr);
       return;
    }
    public final void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenMerchantLotteryDialogPresenter.class, "4")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append("гд");
       int i = spannableStr.length();
       spannableStr.append(p0);
       spannableStr.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f070f6e), false), false, i, 18);
       spannableStr.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f070f70), false), i, spannableStr.length(), 18);
       this.u.setText(spannableStr);
       return;
    }
    public final void V8(String p0){
       KwaiTokenMerchantLotteryDialogPresenter kwaiTokenMer = KwaiTokenMerchantLotteryDialogPresenter.class;
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
                b.i(b.b("sourceUrl is "+p0, "KwaiTokenMerchantLotteryDialogPresenter", null, objArray), stringArray);
             }else if(this.getContext() != null){
                this.getContext().startActivity(intent);
             }
          }
          this.y.c();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenMerchantLotteryDialogPresenter.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0333);
       this.q = m1.f(p0, 0x7f0a3f2c);
       this.r = m1.f(p0, 0x7f0a0a92);
       this.s = m1.f(p0, 0x7f0a300b);
       this.t = m1.f(p0, 0x7f0a10f7);
       this.u = m1.f(p0, 0x7f0a3201);
       this.v = m1.f(p0, 0x7f0a2f41);
       this.w = m1.f(p0, 0x7f0a007c);
       m1.a(p0, new k(this), R.id.action);
       m1.a(p0, new t(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenMerchantLotteryDialogPresenter.class, "1")) {
          return;
       }
       this.x = this.q8(BigPictureDialogInfo.class);
       this.y = this.q8(KwaiTokenCustomPopUpDialog.class);
       return;
    }
}
