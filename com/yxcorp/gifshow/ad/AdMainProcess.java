package com.yxcorp.gifshow.ad.AdMainProcess;
import com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.gifshow.ad.AdMainProcess$a;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.AdMainProcess$mConsumerGenerator$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.AdMainProcess$b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import yx.j0;
import nx8.m;
import nx8.l;
import com.kwai.robust.PatchProxyResult;
import nx8.f;
import java.lang.Number;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nl9.d;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import wkd.b;
import k59.c2;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.AdMainProcess$processDownload$1;
import nx8.e;
import msd.l;
import z1.a;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo;
import tw.j;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import nx8.d;
import com.yxcorp.gifshow.ad.AdProcess$downloadCheckPermission$callback$1;
import com.yxcorp.gifshow.ad.AdProcess$b;
import java.lang.StringBuilder;
import androidx.fragment.app.FragmentActivity;

public final class AdMainProcess extends AdProcess	// class@0014cf
{
    public final p k;
    public final AdMainProcess$b l;
    public static final AdMainProcess$a m;

    static {
       AdMainProcess.m = new AdMainProcess$a(null);
    }
    public void AdMainProcess(Activity p0,AdDataWrapper p1){
       a.p(p0, "activity");
       a.p(p1, "dataWrapper");
       super(p0, p1);
       this.k = s.c(AdMainProcess$mConsumerGenerator$2.INSTANCE);
       AdMainProcess$b uob = new AdMainProcess$b(this);
       this.l = uob;
       this.g().add(uob);
    }
    public final void A(){
       if (PatchProxy.applyVoid(null, this, AdMainProcess.class, "8")) {
          return;
       }
       if (this.d().getPhoto() != null) {
          Object[] objArray = new Object[0];
          j0.f("AdMainProcess", "addSplashPopPlayConsumer", objArray);
          this.x(this.B().c());
       }
       return;
    }
    public final m B(){
       Object obj = PatchProxy.apply(null, this, AdMainProcess.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final int C(){
       boolean b1;
       PhotoAdvertisement$AdData mPendantInfo;
       f uof = f.class;
       AdProcess uAdProcess = AdProcess.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Activity obj = PatchProxy.apply(null, this, AdMainProcess.class, "6");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.c();
       AdDataWrapper uAdDataWrapp = this.d();
       AdDataWrapper obj1 = PatchProxy.applyTwoRefs(obj, uAdDataWrapp, null, uof, "1");
       boolean b = true;
       String str = "adDataWrapper";
       String str1 = "activity";
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          a.p(obj, str1);
          a.p(uAdDataWrapp, str);
          if (uAdDataWrapp.isH5GameAd()) {
             d.a(0x4bd38ddd).TR(new QPhoto(uAdDataWrapp.getPhoto())).subscribe(Functions.d(), Functions.d());
             b.a(0xdb243e0).b(obj, uAdDataWrapp, uAdDataWrapp.getPhoto());
             b1 = true;
          }else {
             b1 = false;
          }
       }
       if (b1) {
          return 4;
       }else if(this.u()){
          return 5;
       }else if(this.t()){
          return 6;
       }else if(this.w()){
          return -2;
       }else if(this.v()){
          return 7;
       }else {
          AdMainProcess$processDownload$1 oprocessDown = new AdMainProcess$processDownload$1(this);
          Object obj2 = PatchProxy.applyOneRefs(oprocessDown, this, uAdProcess, "16");
          b1 = (obj2 != patchProxyRe)? obj2.booleanValue(): d.a(0x4bd38ddd).jZ(this.h, this.i, this.g, new e(oprocessDown));
          if (b1) {
             return -1;
          }else {
             obj = this.c();
             obj1 = this.d();
             BaseFeed obj3 = PatchProxy.applyTwoRefs(obj, obj1, null, uof, "12");
             if (obj3 != patchProxyRe) {
                b = obj3.booleanValue();
             }else {
                a.p(obj, str1);
                a.p(obj1, str);
                obj3 = obj1.getPhoto();
                if (obj1 instanceof PhotoAdDataWrapper && obj3 != null) {
                   str = "AD";
                   if (obj3.get(str) != null) {
                      PhotoAdvertisement photoAdverti = obj3.get(str);
                      if (photoAdverti != null) {
                         PhotoAdvertisement mAdData = photoAdverti.mAdData;
                         if (mAdData != null) {
                            mPendantInfo = mAdData.mPendantInfo;
                         label_0106 :
                            PhotoAdvertisement$TryGameInfo tryGameInfo = j.t(photoAdverti);
                            if (mPendantInfo == null || (mPendantInfo.mIsUsePendantInfoInActionBar == null || (TextUtils.isEmpty(mPendantInfo.mLandingPageUrl) || (tryGameInfo != null && !TextUtils.isEmpty(tryGameInfo.mGameInfo))))) {
                               PhotoAdvertisement$PendantInfo mLandingPage = mPendantInfo.mLandingPageUrl;
                               a.o(mLandingPage, "pendantInfo.mLandingPageUrl");
                               AdProcessUtils.h(obj, mLandingPage, obj1, b);
                            }
                         }
                      }
                      mPendantInfo = null;
                      goto label_0106 ;
                   }
                }
             label_012e :
                b = false;
             }
             if (b) {
                return 9;
             }else {
                obj3 = PatchProxy.apply(null, this, uAdProcess, "17");
                boolean b2 = (obj3 != patchProxyRe)? obj3.booleanValue(): f.b(this.h, this.i);
                if (b2) {
                   return 21;
                }else if(PatchProxy.applyVoid(null, this, uAdProcess, "18")){
                   d.a(0x4bd38ddd).Fg(this.h, this.i, new AdProcess$downloadCheckPermission$callback$1(this, new d(this)));
                }
                return -1;
             }
          }
       }
    }
    public int m(){
       l obj = PatchProxy.apply(null, this, AdMainProcess.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.l();
       if (this.g().isEmpty()) {
          return -3;
       }
       obj = this.g().get(0);
       int i = obj.a();
       Object[] objArray = new Object[0];
       j0.f("AdMainProcess", "processed by : "+obj, objArray);
       this.r(0);
       return i;
    }
    public final void x(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMainProcess.class, "10")) {
          return;
       }
       this.g().add(0, p0);
       p0.b(this);
       return;
    }
    public final void y(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, AdMainProcess.class, "9")) {
          return;
       }
       if (this.d().getPhoto() != null) {
          int i = 0;
          if (!this.c() instanceof FragmentActivity) {
             objArray = new Object[i];
             j0.c("AdMainProcess", "not fragment Activity ", objArray);
             return;
          }else {
             objArray = new Object[i];
             j0.f("AdMainProcess", "addPopArConsumer", objArray);
             this.x(this.B().b());
          }
       }
       return;
    }
    public final void z(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, AdMainProcess.class, "7")) {
          return;
       }
       if (this.d().getPhoto() != null) {
          int i = 0;
          if (!this.c() instanceof FragmentActivity) {
             objArray = new Object[i];
             j0.c("AdMainProcess", "not fragment Activity ", objArray);
             return;
          }else {
             objArray = new Object[i];
             j0.f("AdMainProcess", "addPopPlayConsumer", objArray);
             this.x(this.B().a());
          }
       }
       return;
    }
}
