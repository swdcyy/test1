package com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import android.widget.TextView;
import iz5.a;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import android.text.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import tkd.b;
import tkd.d;
import ad5.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.w;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import lz5.a;
import dz5.o;
import brd.t;
import cz5.b;
import cz5.a;
import com.google.gson.Gson;
import com.kwai.framework.logger.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import brd.x;
import nz5.n;
import erd.a;
import nz5.r;
import nz5.q;
import erd.g;
import crd.b;

public class BaseRewardPhotoSelectGiftWithAnimPresenter$a extends m	// class@00125a
{
    public final BaseRewardPhotoSelectGiftWithAnimPresenter c;

    public void BaseRewardPhotoSelectGiftWithAnimPresenter$a(BaseRewardPhotoSelectGiftWithAnimPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       RewardPanelInfoResponse$KsCoinLevel obj2;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, BaseRewardPhotoSelectGiftWithAnimPresenter$a.class, "1")) {
          return;
       }
       BaseRewardPhotoSelectGiftWithAnimPresenter$a c = obj.c;
       Objects.requireNonNull(c);
       BaseRewardPhotoSelectGiftWithAnimPresenter uBaseRewardP = BaseRewardPhotoSelectGiftWithAnimPresenter.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, c, uBaseRewardP, "10")) {
          BaseRewardPhotoSelectGiftWithAnimPresenter g = c.G;
          BaseRewardPhotoSelectGiftWithAnimPresenter e = c.E;
          BaseRewardPhotoSelectGiftWithAnimPresenter n = c.N;
          String str = c.r.getText().toString();
          String str1 = "";
          boolean b = true;
          if (!PatchProxy.applyVoidFourRefs(g, e, n, str, null, a.class, "8")) {
             obj2 = n.mKsCoin;
             String str2 = (TextUtils.isEmpty(n.mOverrideDisplayName))? str1: n.mDisplayName;
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "GO_REWARD";
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("reward_amount", Long.valueOf(obj2));
             jsonObject.c0("before_discount_amount", str2);
             jsonObject.c0("button_text", str);
             jsonObject.a0("gift_type", Integer.valueOf(n.type));
             jsonObject.a0("reward_type", Integer.valueOf(b));
             uElementPack1.params = jsonObject.toString();
             u1.M("2440591", e, 1, uElementPack1, a.a(g), null);
          }
          if (!c.V8()) {
             d.a(0x630bc993).s30(c.getContext(), "reward_photo", objArray, b);
          }else {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoid(objArray, c, uBaseRewardP, "15")) {
                w.E1(c.G.getPhotoMeta(), b);
                c.s.setEnabled(false);
                c.t.setAnimation(R.raw.arg_RES_7f0f0073);
                c.t.s();
                c.t.setVisibility(false);
                c.D.onNext(Boolean.TRUE);
                BaseRewardPhotoSelectGiftWithAnimPresenter g1 = c.G;
                List list = c.K.b();
                o oo = o.class;
                t ot = PatchProxy.applyTwoRefs(g1, list, objArray, oo, "2");
                if (ot != patchProxyRe) {
                }else {
                   long l = o.a(list);
                   b uob = a.e();
                   String photoId = g1.getPhotoId();
                   str = g1.getExpTag();
                   long l1 = Long.parseLong(g1.getUserId());
                   obj2 = PatchProxy.applyOneRefs(list, objArray, oo, "6");
                   if (obj2 != patchProxyRe) {
                      str1 = obj2;
                   }else if(list == null || list.isEmpty()){
                      str1 = new Gson().q(list);
                   }
                   ot = uob.f(photoId, l, str, l1, str1);
                }
                ClientEvent$ElementPackage uElementPack = PatchProxy.apply(objArray, c, uBaseRewardP, "23");
                if (uElementPack != patchProxyRe) {
                }else {
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "PHOTO_REWARD_RESULT";
                }
                Object obj1 = uElementPack;
                ClientContent$ContentPackage uContentPack = PatchProxy.apply(objArray, c, uBaseRewardP, "24");
                if (uContentPack != patchProxyRe) {
                }else {
                   uContentPack = new ClientContent$ContentPackage();
                   ClientContent$PhotoPackage photoPackage = w1.f(c.G.getEntity());
                   uContentPack.photoPackage = photoPackage;
                   photoPackage.landscapeScreenDisplay = false;
                }
                a uoa = new a("PHOTO_REWARD_RESULT", obj1, uContentPack, null, c.G.getFeedLogCtx());
                c.X7(ot.compose(g1).doFinally(new n(c)).subscribe(new r(c), new q(c)));
             }
          }
       }
       return;
    }
}
