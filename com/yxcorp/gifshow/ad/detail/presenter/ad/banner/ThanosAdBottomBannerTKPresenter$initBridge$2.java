package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import o56.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.HashMap;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import yx.j0;
import wkd.b;
import u49.c;
import brd.t;
import qz8.b;
import qz8.c;
import erd.g;
import crd.b;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import qz8.d;

public final class ThanosAdBottomBannerTKPresenter$initBridge$2 extends Lambda implements l	// class@00159c
{
    public final ThanosAdBottomBannerTKPresenter this$0;

    public void ThanosAdBottomBannerTKPresenter$initBridge$2(ThanosAdBottomBannerTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       String a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdBottomBannerTKPresenter$initBridge$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       ThanosAdBottomBannerTKPresenter$initBridge$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, ThanosAdBottomBannerTKPresenter.class, "8")) {
          ThanosAdBottomBannerTKPresenter r = tthis$0.r;
          if (r == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(r);
          boolean b = true;
          if (photoAdverti == null || photoAdverti.mHasSubmitSurvey != b) {
             r = tthis$0.r;
             if (r == null) {
                a.S("mPhoto");
             }
             photoAdverti = k.B(r);
             a.m(photoAdverti);
             photoAdverti.mHasSubmitSurvey = b;
             String str = "surveyId";
             String str1 = p0.optString(str);
             String str2 = "optionId";
             String str3 = p0.optString(str2);
             String str4 = "optionScore";
             String str5 = p0.optString(str4);
             a = a.a;
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             String id = mE.getId();
             ThanosAdBottomBannerTKPresenter r1 = tthis$0.r;
             if (r1 == null) {
                a.S("mPhoto");
             }
             String photoId = r1.getPhotoId();
             HashMap hashMap = new HashMap();
             a.o(id, "userId");
             hashMap.put("userId", id);
             a.o(a, "deviceId");
             hashMap.put("deviceId", a);
             a.o(photoId, "photoId");
             hashMap.put("photoId", photoId);
             a.o(str1, str);
             hashMap.put(str, str1);
             ArrayList uArrayList = new ArrayList();
             HashMap hashMap1 = new HashMap();
             a.o(str3, str2);
             hashMap1.put(str2, str3);
             a.o(str5, str4);
             hashMap1.put(str4, str5);
             uArrayList.add(hashMap1);
             hashMap.put("options", uArrayList);
             str5 = a.a.q(hashMap);
             Object[] objArray = new Object[0];
             j0.f("TachikomaSurvey", "submitSurvey: params string "+str5, objArray);
             b.a(0x3a268c29).g(str5).subscribe(b.b, c.b);
             j0 oj0 = o.z();
             ThanosAdBottomBannerTKPresenter r2 = tthis$0.r;
             if (r2 == null) {
                a.S("mPhoto");
             }
             oj0.e(141, r2.mEntity).d(new d(str1, str3)).a();
          }
       }
       return;
    }
}
