package com.kwai.feature.component.photofeatures.reward.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nz5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import ad5.a;
import bd5.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import android.widget.RelativeLayout;
import java.util.List;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo;
import lnc.a1;
import android.text.TextUtils;
import com.kuaishou.android.model.mix.w;
import iz5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.app.Activity;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.util.Collection;
import ekd.q;
import android.widget.LinearLayout;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Long;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.text.TextPaint;
import com.kwai.feature.component.photofeatures.reward.presenter.a;
import android.view.View$OnClickListener;
import nz5.a;
import nz5.b;
import com.kwai.feature.component.photofeatures.reward.fragment.RewardPhotoPanelDialogFragment;
import io.reactivex.subjects.PublishSubject;

public abstract class c extends PresenterV2	// class@00125f
{
    public PublishSubject A;
    public List B;
    public final a C;
    public KwaiImageView p;
    public EmojiTextView q;
    public TextView r;
    public LinearLayout s;
    public TextView t;
    public RelativeLayout u;
    public TextView v;
    public ViewGroup w;
    public QPhoto x;
    public RewardPanelInfoResponse$PanelInfo y;
    public RewardPhotoPanelDialogFragment z;

    public void c(){
       super();
       this.C = new c(this);
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       b.a(0x4c90014d).B(this.C);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          g.b(this.p, this.x.getUser(), HeadImageSize.MIDDLE);
          this.q.setText(this.x.getUserName());
          this.W8();
          int i = 0;
          int i1 = 8;
          if (this.x.getPhotoMeta() != null && (this.x.getPhotoMeta().mRewardPhotoInfo == null || this.x.getPhotoMeta().mRewardPhotoInfo.mRewardCount <= 1)) {
             this.u.setVisibility(i1);
             this.t.setVisibility(i);
             uoc = this.t;
             String str = (TextUtils.isEmpty(this.y.mRewardText))? a1.p(R.string.arg_RES_7f1042f6): this.y.mRewardText;
             uoc.setText(str);
          }else {
             this.t.setVisibility(i1);
             this.u.setVisibility(i);
             if (this.x.getPhotoMeta() != null && (this.x.getPhotoMeta().mRewardPhotoInfo != null && (this.x.getPhotoMeta().mRewardPhotoInfo.mRewaders != null && !this.x.getPhotoMeta().mRewardPhotoInfo.mRewaders.isEmpty()))) {
                this.V8(this.x.getPhotoMeta().mRewardPhotoInfo.mRewaders);
             }else {
                this.V8(this.y.mRewarders);
             }
             this.r.setText(a1.q(R.string.arg_RES_7f103c4f, this.x.getPhotoMeta().mRewardPhotoInfo.mRewardCount));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       b.a(0x4c90014d).v(this.C);
       return;
    }
    public abstract int P8();
    public abstract int R8();
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "10")) {
          return;
       }
       if (w.w0(this.x.getPhotoMeta())) {
          return;
       }
       c tx = this.x;
       c tz = this.z;
       if (!PatchProxy.applyVoidTwoRefs(tx, tz, objArray, a.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RULE";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("area", "REWARD_DIALOG");
          uElementPack.params = jsonObject.toString();
          u1.M("2306755", tz, 1, uElementPack, a.a(tx), null);
       }
       KwaiYodaWebViewActivity.L3(this.getActivity(), WebEntryUrls.r0);
       return;
    }
    public final void V8(List p0){
       View view;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "7")) {
          return;
       }
       if (q.f(p0)) {
          this.s.setVisibility(8);
          return;
       }else {
          int i = 3;
          if (p0.size() > i) {
             p0 = p0.subList(0, i);
          }
          for (int i1 = p0.size() - 1; i1 >= 0; i1 = i1 - 1) {
             c ts = this.s;
             UserInfo userInfo = p0.get(i1);
             int i2 = p0.size();
             if (PatchProxy.isSupport(uoc)) {
                view = PatchProxy.applyThreeRefs(userInfo, Integer.valueOf(i1), Integer.valueOf(i2), this, c.class, "8");
                if (view != PatchProxyResult.class) {
                }else {
                label_0058 :
                   view = a.l(this.s, R.layout.arg_RES_7f0d06b9, 0, this.P8());
                   g.d(view.findViewById(R.id.iv_item_reward_avatar), userInfo, HeadImageSize.SMALL);
                   i2 = i2 - 1;
                   if (i1 == i2) {
                      view.getLayoutParams().rightMargin = 0;
                   }
                }
             }else {
                goto label_0058 ;
             }
             ts.addView(view);
          }
          return;
       }
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf(this.y.mKsCoinBalance)};
       this.v.setText(String.format(a1.p(R.string.arg_RES_7f101c08), objArray));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a14f6);
       EmojiTextView uEmojiTextVi = m1.f(p0, R.id.tv_name_reward);
       this.q = uEmojiTextVi;
       uEmojiTextVi.getPaint().setFakeBoldText(true);
       this.r = m1.f(p0, 0x7f0a4246);
       this.s = m1.f(p0, 0x7f0a2896);
       this.v = m1.f(p0, 0x7f0a4244);
       this.t = m1.f(p0, 0x7f0a4242);
       this.u = m1.f(p0, 0x7f0a3682);
       this.w = m1.f(p0, 0x7f0a0959);
       m1.a(p0, new a(this), R.id.fl_outside_reward_dialog);
       m1.a(p0, new a(this), R.id.iv_rule_reward);
       m1.a(p0, new b(this), R.id.tv_rule_reward);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.x = this.r8("DETAIL_REWARD_PHOTO");
       this.y = this.r8("DETAIL_REWARD_PANEL_INFO");
       this.z = this.r8("DETAIL_REWARD_PHOTO_FRAGMENT");
       this.A = this.r8("DETAIL_REWARD_COIN_BALANCE_UPDATE_EVENT");
       this.B = this.r8("REWARD_PANEL_CLOSE_LISTENERS");
       return;
    }
}
