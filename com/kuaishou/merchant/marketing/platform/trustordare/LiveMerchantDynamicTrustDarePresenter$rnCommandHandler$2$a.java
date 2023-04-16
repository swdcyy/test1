package com.kuaishou.merchant.marketing.platform.trustordare.LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2$a;
import g14.e;
import com.kuaishou.merchant.marketing.platform.trustordare.LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import com.google.gson.JsonObject;
import g14.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.merchant.marketing.platform.trustordare.LiveMerchantDynamicTrustDarePresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.t;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fg6.a;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareOpenRewardInfo;
import com.google.gson.Gson;
import android.app.Dialog;
import s84.d;
import r84.a;
import android.content.DialogInterface$OnDismissListener;
import jz6.a;
import zp5.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import r84.b;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import java.util.Collection;
import tkd.b;
import tkd.d;
import fs5.a;
import oq5.b;
import s84.h;
import r84.c;
import g14.d;

public final class LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2$a implements e	// class@001b66
{
    public final LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2 a;

    public void LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2$a(LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2 p0){
       this.a = p0;
       super();
    }
    public final boolean a(Activity p0,String p1,JsonObject p2,a p3,User p4,BaseFeed p5){
       String liveStreamId;
       String str;
       LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2 this$0;
       Activity activity;
       LiveMerchantDynamicTrustDarePresenter r1;
       JsonElement jsonElement1;
       LiveMerchantTrustDareOpenRewardInfo liveMerchant2;
       Activity activity1;
       List list;
       LiveMerchantDynamicTrustDarePresenter liveMerchant = LiveMerchantDynamicTrustDarePresenter.class;
       LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2$a ornCommandHa = LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2$a.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(ornCommandHa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          p4 = PatchProxy.apply(objArray, this, ornCommandHa, "1");
          if (p4 != PatchProxyResult.class) {
             return p4.booleanValue();
          }
       }
       if (p0 == null || p0.isFinishing()) {
          p3.onFailed("Host is destroyed");
          return i1;
       }else {
          LiveMerchantDynamicTrustDarePresenter r = this.a.this$0.r;
          if (r == null) {
             a.S("mLiveMerchantAudienceCommonService");
          }
          int i2 = 0;
          if (r != null) {
             LiveMerchantBaseContext liveMerchant1 = r.a();
             if (liveMerchant1 != null) {
                liveStreamId = liveMerchant1.getLiveStreamId();
             label_0056 :
                if (p2 != null) {
                   JsonElement jsonElement = p2.e0("liveStreamId");
                   if (jsonElement != null) {
                      str = jsonElement.w();
                   label_0066 :
                      if (!TextUtils.n(liveStreamId, str)) {
                         return i1;
                      }else {
                         int i3 = p1.hashCode();
                         if (i3 != -326765450) {
                            if (i3 == -182401933 && p1.equals("showBoxResultDialog")) {
                               this$0 = this.a.this$0;
                               Objects.requireNonNull(this$0);
                               if (!PatchProxy.applyVoidOneRefs(p2, this$0, liveMerchant, "6") && this$0.getActivity() != null) {
                                  activity = this$0.getActivity();
                                  a.m(activity);
                                  if (!activity.isFinishing()) {
                                     r1 = this$0.r;
                                     if (r1 == null) {
                                        a.S("mLiveMerchantAudienceCommonService");
                                     }
                                     if (r1 != null && p2 != null) {
                                        jsonElement1 = p2.e0("data");
                                        try{
                                           liveMerchant2 = a.a.c(jsonElement1, LiveMerchantTrustDareOpenRewardInfo.class);
                                        }catch(java.lang.Exception e0){
                                        }
                                        if (liveMerchant2 != null) {
                                           r1 = this$0.p;
                                           if (r1 != null) {
                                              r1.dismiss();
                                           }
                                           activity1 = this$0.getActivity();
                                           a.m(activity1);
                                           liveMerchant = this$0.r;
                                           if (liveMerchant == null) {
                                              a.S("mLiveMerchantAudienceCommonService");
                                           }
                                           d uod = new d(activity1, liveMerchant, liveMerchant2);
                                           this$0.p = uod;
                                           uod.setOnDismissListener(new a(this$0));
                                           r = this$0.p;
                                           if (r != null) {
                                              r.show();
                                           }
                                        }
                                     }
                                  }
                               }
                            label_00f7 :
                               p3.onSuccess("");
                            }else {
                            label_01c2 :
                               i = false;
                            }
                         }else if(p1.equals("showBoxDialog")){
                            this$0 = this.a.this$0;
                            Objects.requireNonNull(this$0);
                            if (!PatchProxy.applyVoidOneRefs(p2, this$0, liveMerchant, "7")) {
                               r1 = this$0.s;
                               String str1 = "mFragmentService";
                               if (r1 == null) {
                                  a.S(str1);
                               }
                               if (r1 != null) {
                                  r1 = this$0.s;
                                  if (r1 == null) {
                                     a.S(str1);
                                  }
                                  if (r1.a()) {
                                  label_012f :
                                     if (this$0.getActivity() != null) {
                                        activity = this$0.getActivity();
                                        a.m(activity);
                                        if (activity.isFinishing() || (this$0.getActivity() instanceof GifshowActivity && p2 != null)) {
                                           jsonElement1 = p2.e0("data");
                                           if (jsonElement1 != null) {
                                              try{
                                                 list = a.a.d(jsonElement1, new b().getType());
                                              }catch(java.lang.Exception e0){
                                              }
                                              if (list == null || list.isEmpty()) {
                                                 i1 = 1;
                                              }
                                              if (!i1) {
                                                 r1 = this$0.q;
                                                 if (r1 != null) {
                                                    r1.dismiss();
                                                 }
                                                 if (d.a(-1397441499).E(this$0.getActivity())) {
                                                    r1 = this$0.t;
                                                    if (r1 == null) {
                                                       a.S("mLiveAudienceOrientationService");
                                                    }
                                                    r1.d();
                                                 }
                                                 activity1 = this$0.getActivity();
                                                 a.m(activity1);
                                                 liveMerchant = this$0.r;
                                                 if (liveMerchant == null) {
                                                    a.S("mLiveMerchantAudienceCommonService");
                                                 }
                                                 h oh = new h(activity1, liveMerchant, list);
                                                 this$0.q = oh;
                                                 oh.setOnDismissListener(new c(this$0));
                                                 r = this$0.q;
                                                 if (r != null) {
                                                    r.show();
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }else {
                                  goto label_012f ;
                               }
                            }
                         label_01be :
                            p3.onSuccess("");
                         }else {
                            goto label_01c2 ;
                         }
                         return i;
                      }
                   }
                }
                str = i2;
                goto label_0066 ;
             }
          }
          liveStreamId = i2;
          goto label_0056 ;
       }
    }
    public String getLiveId(){
       return d.a(this);
    }
}
