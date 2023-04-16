package com.yxcorp.gifshow.ad.rerank.AdRankManager;
import q49.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import vh5.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import q49.f;
import erd.g;
import crd.b;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.yxcorp.gifshow.ad.rerank.AdRankManager$mKCMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import q35.c$a;
import com.google.gson.JsonObject;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import p49.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;
import java.util.Objects;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo;
import com.yxcorp.gifshow.ad.rerank.AdRankConfig;
import java.lang.Integer;
import java.lang.CharSequence;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;

public final class AdRankManager	// class@0017c5
{
    public static final Map a;
    public static final List b;
    public static final p c;
    public static final AdRankManager d;

    static {
       AdRankManager uAdRankManag = new AdRankManager();
       AdRankManager.d = uAdRankManag;
       if (a.c.a() && !PatchProxy.applyVoid(null, uAdRankManag, AdRankManager.class, "15")) {
          RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(f.b);
       }
       AdRankManager.a = new LinkedHashMap();
       AdRankManager.b = new ArrayList();
       AdRankManager.c = s.c(AdRankManager$mKCMonitor$2.INSTANCE);
    }
    public void AdRankManager(){
       super();
    }
    public final void a(c$a p0,JsonObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdRankManager.class, "3")) {
          return;
       }
       p0.d(BusinessType.OTHER);
       p0.h("ad_rerank");
       p0.f(p1);
       return;
    }
    public final f b(){
       Object obj = PatchProxy.apply(null, this, AdRankManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdRankManager.c.getValue();
    }
    public final boolean c(long p0){
       a obj;
       long l;
       AdRankConfig a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdRankManager uAdRankManag = AdRankManager.class;
       if (PatchProxy.isSupport(uAdRankManag)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAdRankManag, "9");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.a("AdRankManager", "BrowsedTime"+p0, objArray);
       obj = a.c;
       Objects.requireNonNull(obj);
       PhotoAdvertisement$AdRerankInfo obj1 = PatchProxy.apply(null, obj, a.class, "4");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          obj1 = a.b;
          String str = null;
          PhotoAdvertisement$AdRerankInfo mTimeInterva = (obj1 != null)? obj1.mTimeInterval: str;
          if (mTimeInterva - str <= 0) {
             a = a.a;
             Objects.requireNonNull(a);
             Number number = PatchProxy.apply(null, a, AdRankConfig.class, "2");
             if (number == patchProxyRe) {
                number = a.b.getValue();
             }
             mTimeInterva = number.longValue();
          }
          l = 1000 * mTimeInterva;
       }
       if (p0 - l >= 0) {
          i = true;
       }
       return i;
    }
    public final void d(String p0,int p1){
       AdRankManager uAdRankManag = AdRankManager.class;
       if (PatchProxy.isSupport(uAdRankManag) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAdRankManag, "10")) {
          return;
       }
       Map map = (p0 == null || !p0.length())? 1: null;
       if (map) {
          return;
       }else {
          AdRankManager.a.put(p0, Integer.valueOf(p1));
          return;
       }
    }
    public final void e(String p0,QPhoto p1){
       Object[] objArray;
       char c;
       PhotoAdvertisement$AdRerankInfo uAdRerankInf2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdRankManager.class, "13")) {
          return;
       }
       if (p1 == null) {
          objArray = new Object[0];
          j0.a("AdRankManager", p0, objArray);
       }else {
          PhotoAdvertisement$AdRerankInfo uAdRerankInf = c.h(p1);
          c = 0xff0c;
          StringBuilder str = p0+c+p1.getPhotoId()+c+p1.getUserName()+c;
          PhotoAdvertisement photoAdverti = k.B(p1);
          PhotoAdvertisement$AdRerankInfo uAdRerankInf1 = null;
          photoAdverti = (photoAdverti != null)? photoAdverti.mAdGroup: uAdRerankInf1;
          str = str+photoAdverti+c;
          PhotoAdvertisement photoAdverti1 = k.B(p1);
          Long longx = (photoAdverti1 != null)? Long.valueOf(photoAdverti1.mCreativeId): uAdRerankInf1;
          str = str+longx+c;
          PhotoAdvertisement$AdRerankInfo mRankType = (uAdRerankInf != null)? uAdRerankInf.mRankType: uAdRerankInf1;
          str = str+mRankType+c;
          if (uAdRerankInf != null) {
             uAdRerankInf1 = uAdRerankInf.mSourceType;
          }
          objArray = new Object[0];
          j0.f("AdRankManager", str+uAdRerankInf1, objArray);
       }
       return;
    }
}
