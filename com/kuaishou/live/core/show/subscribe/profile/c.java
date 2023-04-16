package com.kuaishou.live.core.show.subscribe.profile.c;
import dx5.h;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import d61.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.s;
import android.net.Uri;
import android.net.Uri$Builder;
import zf6.k;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kuaishou.live.webview.LiveWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import al2.a;
import ok.o;
import com.google.common.base.Optional;
import com.kuaishou.live.core.show.subscribe.profile.a;
import ok.h;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fg6.a;
import xk2.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.subscribe.profile.LiveSubscibeDynamicButtonStatus;
import al2.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ps5.b;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import com.kuaishou.live.core.show.subscribe.profile.b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.subscribe.dosubscribe.b;

public class c implements h	// class@001164
{

    public void c(){
       super();
    }
    public final void a(GifshowActivity p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "9")) {
          return;
       }
       if (!g.h(p0) && !TextUtils.x(p2)) {
          RxBus.f.b(s.d(p1, "LIVE_SUBSCRIBE"));
          p0.startActivity(LiveWebViewActivity.G3(p0, Uri.parse(p2).buildUpon().appendQueryParameter("isDarkMode", Boolean.toString(k.d())).build().toString()).a());
       }
       return;
    }
    public final void b(ProfileTemplateCard p0,int p1,h$a p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "7")) {
          return;
       }
       if (p0.mButtonInfo == null || p2 == null) {
          b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "updateCardInfo, error, null");
          return;
       }else {
          b.c0(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "updateCardInfo", "newStatus", Integer.valueOf(p1));
          p0.mButtonInfo.mCurrentStatus = p1;
          p2.a(p0);
          return;
       }
    }
    public void d3(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "1")) {
          return;
       }
       if (TextUtils.x(p2.mLinkUrl)) {
          b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "handleTemplateCard, error, no url");
          return;
       }else {
          this.a(p0, p1, p2.mLinkUrl);
          return;
       }
    }
    public boolean e3(int p0){
       boolean b = (p0 == 7)? true: false;
       return b;
    }
    public void f3(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3){
       ProfileTemplateCard obj;
       CharSequence uCharSequenc = p1;
       ProfileTemplateCard profileTempl = p2;
       h$a uoa = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "2")) {
          return;
       }
       ProfileTemplateCard mButtonInfo = profileTempl.mButtonInfo;
       if (mButtonInfo == null) {
          b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "handleButton, error, carInfo is null");
          return;
       }else {
          ProfileTemplateCard$ButtonInfo mCurrentStat = mButtonInfo.mCurrentStatus;
          CharSequence uCharSequenc1 = null;
          if (TextUtils.n(QCurrentUser.me().getId(), uCharSequenc)) {
             mButtonInfo = profileTempl.mButtonInfo;
             obj = PatchProxy.applyOneRefs(mButtonInfo, this, c.class, "8");
             if (obj != PatchProxyResult.class) {
                uCharSequenc1 = obj;
             }else if(q.f(mButtonInfo.mButtonStatusInfos)){
                uCharSequenc1 = m.s(mButtonInfo.mButtonStatusInfos).r(new a(mButtonInfo)).transform(a.b).orNull();
             }
             if (TextUtils.x(uCharSequenc1)) {
                b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "handleButton, error, no url");
                return;
             }else {
                this.a(p0, uCharSequenc, uCharSequenc1);
                return;
             }
          }else {
             obj = profileTempl.mExtra;
             String str = "extParams";
             String str1 = PatchProxy.applyTwoRefs(obj, str, this, c.class, "3");
             if (str1 != PatchProxyResult.class) {
             }else if(obj != null){
                JsonElement jsonElement = obj.e0(str);
                if (jsonElement != null) {
                   str1 = jsonElement.w();
                }
             }
             str1 = "";
             a uoa1 = (!TextUtils.x(str1))? a.a.h(str1, a.class): uCharSequenc1;
             if (uoa1 == null || TextUtils.x(uoa1.mSubscribeId)) {
                b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "handleButton, error, extParams");
                this.b(profileTempl, LiveSubscibeDynamicButtonStatus.NOT_BOOK.getValue(), uoa);
                return;
             }else if(mCurrentStat == LiveSubscibeDynamicButtonStatus.NOT_BOOK.getValue()){
                b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "not_book -> subscribeLiveAndAddCalenderEvent");
                if (!PatchProxy.applyVoidFourRefs(p0, p2, p3, uoa1, this, c.class, "4")) {
                   j.o(uoa1, p0, new b(this, profileTempl, uoa), true);
                }
             }else if(mCurrentStat == LiveSubscibeDynamicButtonStatus.BOOKED.getValue()){
                b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "booked -> showUnsubscribeDialog");
                if (!PatchProxy.applyVoidFourRefs(p0, p2, p3, uoa1, this, c.class, "5")) {
                   b uob = new b(this, p0, p2, p3, uoa1);
                   b.a(p0, v6);
                }
             }else {
                b.c0(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "handleButton, error, currentStatus", "currentStatus", Integer.valueOf(mCurrentStat));
             }
             return;
          }
       }
    }
}
