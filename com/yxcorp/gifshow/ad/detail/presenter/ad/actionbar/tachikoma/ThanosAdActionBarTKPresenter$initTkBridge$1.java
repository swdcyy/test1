package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import java.lang.Object;
import org.json.JSONObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fg6.a;
import java.util.Objects;
import com.yxcorp.gifshow.ad.tachikoma.model.AdActionBarTkData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.framework.model.user.User;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Long;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import g59.e;
import com.google.gson.Gson;

public final class ThanosAdActionBarTKPresenter$initTkBridge$1 extends Lambda implements l	// class@001573
{
    public final ThanosAdActionBarTKPresenter this$0;

    public void ThanosAdActionBarTKPresenter$initTkBridge$1(ThanosAdActionBarTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       Gson a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ThanosAdActionBarTKPresenter$initTkBridge$1 obj = PatchProxy.applyOneRefs(p0, this, ThanosAdActionBarTKPresenter$initTkBridge$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       a = a.a;
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       AdActionBarTkData uAdActionBar = PatchProxy.apply(objArray, obj, ThanosAdActionBarTKPresenter.class, "15");
       if (uAdActionBar != patchProxyRe) {
       }else {
          uAdActionBar = new AdActionBarTkData();
          ThanosAdActionBarTKPresenter f = obj.F;
          PhotoAdvertisement$TkTemplateData mData = (f != null)? f.mData: objArray;
          uAdActionBar.setDataString(mData);
          f = obj.q;
          if (f == null) {
             a.S("mPhoto");
          }
          uAdActionBar.setAd(k.B(f));
          f = obj.q;
          if (f == null) {
             a.S("mPhoto");
          }
          User user = f.getUser();
          if (user != null) {
             user = user.mAvatars;
             if (user != null) {
                CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(user);
                if (uCDNUrl != null) {
                   uCDNUrl = uCDNUrl.mUrl;
                   if (uCDNUrl != null) {
                      objArray = uCDNUrl;
                   label_0076 :
                      uAdActionBar.setHeadUrl(objArray);
                      f = obj.q;
                      if (f == null) {
                         a.S("mPhoto");
                      }
                      user = f.getUser();
                      if (user != null) {
                         user = user.mName;
                         if (user != null) {
                         label_008d :
                            uAdActionBar.setUserName(user);
                            uAdActionBar.setRealShowDelayTime(obj.V8());
                            f = obj.D;
                            long l = (f != null)? (long)f.mActionBarLoadTime: 0;
                            uAdActionBar.setActionBarLoadTime(l);
                            f = obj.q;
                            if (f == null) {
                               a.S("mPhoto");
                            }
                            user = f.getUser();
                            int i = 1;
                            if (user == null || user.isFollowingOrFollowRequesting() != i) {
                               i = 0;
                            }
                            uAdActionBar.setFollowing(i);
                            uAdActionBar.setDetailBrowseType(0);
                            f = obj.q;
                            if (f == null) {
                               a.S("mPhoto");
                            }
                            uAdActionBar.setMHasLiveReserved(e.a(f));
                         }
                      }
                      String str1 = "";
                      goto label_008d ;
                   }
                }
             }
          }
          f = obj.q;
          if (f == null) {
             a.S("mPhoto");
          }
          user = f.getUser();
          if (user != null) {
             objArray = user.mAvatar;
             goto label_0076 ;
          }else {
             goto label_0076 ;
          }
       }
       String str = a.q(uAdActionBar);
       a.o(str, "Gsons.KWAI_GSON.toJson\(createActionBarData\(\)\)");
       return str;
    }
}
