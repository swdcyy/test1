package com.yxcorp.gifshow.ad.webview.half.HalfPageBannerTkPresenter$initBridge$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import n59.u;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import n59.t;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.model.CDNUrl;
import fg6.a;
import com.google.gson.Gson;

public final class HalfPageBannerTkPresenter$initBridge$1 extends Lambda implements l	// class@0018c1
{
    public final u this$0;

    public void HalfPageBannerTkPresenter$initBridge$1(u p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       u obj = PatchProxy.applyOneRefs(p0, this, HalfPageBannerTkPresenter$initBridge$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.this$0.r;
       a.m(obj);
       PhotoAdvertisement$TkTemplateData mData = obj.mData;
       User user = u.P8(this.this$0).getUser();
       if (user != null) {
          user = user.mAvatars;
          if (user != null) {
             CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(user);
             if (uCDNUrl != null) {
                uCDNUrl = uCDNUrl.mUrl;
                if (uCDNUrl != null) {
                label_004a :
                   User user1 = u.P8(this.this$0).getUser();
                   if (user1 != null) {
                      user1 = user1.mName;
                      if (user1 != null) {
                      label_005d :
                         String str = a.a.q(new t(mData, uCDNUrl, user1));
                         a.o(str, "Gsons.KWAI_GSON.toJson\(tkData\)");
                         return str;
                      }
                   }
                   String str1 = "";
                   goto label_005d ;
                }
             }
          }
       }
       user = u.P8(this.this$0).getUser();
       if (user != null) {
          user = user.mAvatar;
          goto label_004a ;
       }else {
          String str2 = null;
          goto label_004a ;
       }
    }
}
