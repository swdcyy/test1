package com.yxcorp.gifshow.growth.inject.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$CardData;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.yxcorp.gifshow.growth.inject.UgMerchantCard;
import com.google.gson.Gson;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.growth.inject.MerchantCardData;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.view.ViewTreeObserver;
import xna.d;
import android.view.ViewTreeObserver$OnPreDrawListener;
import xna.b;
import android.view.View$OnClickListener;
import android.view.View;
import xna.c;
import lnc.a1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import java.lang.Boolean;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class a extends PresenterV2	// class@0013b8
{
    public TextView A;
    public TextView B;
    public CommonInsertCardFeedMeta p;
    public View q;
    public TextView r;
    public TextView s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public TextView y;
    public TextView z;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       a tp = this.p;
       if (tp != null) {
          CommonInsertCardFeedMeta mCardData = tp.mCardData;
          if (mCardData != null && !TextUtils.isEmpty(mCardData.mDynamicCardData)) {
             UgMerchantCard ugMerchantCa = a.a.h(this.p.mCardData.mDynamicCardData, UgMerchantCard.class);
             if (a.d() && SystemUtil.K()) {
                CommonInsertCardFeedMeta$CardData mDynamicCard = this.p.mCardData.mDynamicCardData;
             }
          label_0044 :
             if (ugMerchantCa != null) {
                ugMerchantCa = ugMerchantCa.mMerchantCardData;
                if (ugMerchantCa != null) {
                   if (!PatchProxy.applyVoidOneRefs(ugMerchantCa, this, uoa, "4")) {
                      this.r.setText(ugMerchantCa.mTitle);
                      this.s.setText(ugMerchantCa.mSubTitle);
                      if (!TextUtils.isEmpty(ugMerchantCa.mImgUrl)) {
                         this.t.setImageURI(ugMerchantCa.mImgUrl);
                      }
                      int i = 8;
                      if (TextUtils.isEmpty(ugMerchantCa.mExtraInfo)) {
                         this.u.setVisibility(i);
                      }else {
                         this.u.setVisibility(0);
                         this.u.setText(ugMerchantCa.mExtraInfo);
                      }
                      if (!TextUtils.isEmpty(ugMerchantCa.mLabel)) {
                         this.v.setVisibility(0);
                         this.v.setText(ugMerchantCa.mLabel);
                         ViewTreeObserver viewTreeObse = this.w.getViewTreeObserver();
                         viewTreeObse.addOnPreDrawListener(new d(this, ugMerchantCa, viewTreeObse));
                      }else {
                         this.v.setVisibility(i);
                         this.w.setText(ugMerchantCa.mDesc);
                      }
                      this.x.setOnClickListener(new b(this, ugMerchantCa));
                      this.q.setOnClickListener(new c(this, ugMerchantCa));
                      i = 0x7f070f7c;
                      this.y.setTextSize(0, (float)a1.d(i));
                      this.y.setText(ugMerchantCa.mPrice);
                      if (!TextUtils.isEmpty(ugMerchantCa.mLogistics)) {
                         this.z.setText(ugMerchantCa.mLogistics);
                      }
                      this.A.setTextSize(0, (float)a1.d(i));
                      this.A.setText(ugMerchantCa.mBtnText);
                      if (!TextUtils.isEmpty(ugMerchantCa.mSlideInfo)) {
                         this.B.setText(ugMerchantCa.mSlideInfo);
                      }
                   }
                   if (!PatchProxy.applyVoid(null, this, uoa, "6")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "IMMERSE_CARD";
                      i3 oi3 = i3.f();
                      oi3.d("card_type", "goods");
                      uElementPack.params = oi3.e();
                      ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                      urlPackage.page2 = "FEATURED_PAGE";
                      u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setKrnUrlPackage(urlPackage, null, null));
                   }
                }
             }
          }
       }
    label_0157 :
       return;
    }
    public final void P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "IMMERSE_CARD";
       i3 oi3 = i3.f();
       oi3.d("card_type", "goods");
       String str = (p0)? "button": "other";
       oi3.d("click_area", str);
       uElementPack.params = oi3.e();
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setElementPackage(uElementPack);
       u1.B(uClickMetaDa);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2aec);
       this.r = m1.f(p0, 0x7f0a2b3b);
       this.s = m1.f(p0, 0x7f0a2b39);
       this.t = m1.f(p0, 0x7f0a2afb);
       this.u = m1.f(p0, 0x7f0a2af4);
       this.v = m1.f(p0, 0x7f0a2aef);
       this.w = m1.f(p0, 0x7f0a2aee);
       this.x = m1.f(p0, 0x7f0a2aea);
       this.y = m1.f(p0, 0x7f0a2b2c);
       this.z = m1.f(p0, 0x7f0a2aff);
       this.A = m1.f(p0, 0x7f0a2aeb);
       this.B = m1.f(p0, 0x7f0a2af5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(CommonInsertCardFeedMeta.class);
       return;
    }
}
