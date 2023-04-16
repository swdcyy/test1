package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$initTkBridge$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import g09.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.kwai.framework.model.user.User;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import g59.e;
import fg6.a;
import com.google.gson.Gson;

public final class AdPopImageTkPresenter$initTkBridge$2 extends Lambda implements l	// class@001601
{
    public final AdPopImageTkPresenter this$0;

    public void AdPopImageTkPresenter$initTkBridge$2(AdPopImageTkPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       AdPopImageTkPresenter k;
       Gson a;
       AdPopImageTkPresenter$initTkBridge$2 obj = PatchProxy.applyOneRefs(p0, this, AdPopImageTkPresenter$initTkBridge$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       a uoa = new a();
       uoa.ad = k.B(AdPopImageTkPresenter.P8(this.this$0));
       obj = this.this$0;
       k = obj.K;
       User user = null;
       int i = 1;
       if (k == i) {
          k = obj.F;
          PhotoAdvertisement$TkTemplateData mData = (k != null)? k.mData: user;
          uoa.dataString = mData;
          User user1 = AdPopImageTkPresenter.P8(obj).getUser();
          if (user1 != null) {
             user1 = user1.mAvatars;
             if (user1 != null) {
                CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(user1);
                if (uCDNUrl != null) {
                   uCDNUrl = uCDNUrl.mUrl;
                   if (uCDNUrl != null) {
                      user = uCDNUrl;
                   label_005f :
                      uoa.headUrl = user;
                      user1 = AdPopImageTkPresenter.P8(this.this$0).getUser();
                      if (user1 != null) {
                         user1 = user1.mName;
                         if (user1 != null) {
                         label_0074 :
                            uoa.userName = user1;
                            uoa.actionbarColorDelayMs = this.this$0.R8();
                            user1 = AdPopImageTkPresenter.P8(this.this$0).getUser();
                            if (user1 == null || user1.isFollowingOrFollowRequesting() != i) {
                               i = 0;
                            }
                            uoa.isFollowing = i;
                            uoa.detailBrowseType = 0;
                            uoa.mHasLiveReserved = e.a(AdPopImageTkPresenter.P8(this.this$0));
                         }
                      }
                      String str1 = "";
                      goto label_0074 ;
                   }
                }
             }
          }
          user1 = AdPopImageTkPresenter.P8(this.this$0).getUser();
          if (user1 != null) {
             user = user1.mAvatar;
             goto label_005f ;
          }else {
             goto label_005f ;
          }
       }else if(k == 2){
          a = a.a;
          AdPopImageTkPresenter f = obj.F;
          if (f != null) {
             user = f.mData;
          }
          uoa.mTemplateData = a.h(user, Object.class);
       }
       String str = a.a.q(uoa);
       a.o(str, "Gsons.KWAI_GSON.toJson\(popTkData\)");
       return str;
    }
}
