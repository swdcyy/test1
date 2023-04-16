package com.yxcorp.gifshow.ad.AdProcessUtils;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.util.Objects;
import com.yxcorp.download.DownloadManager;
import android.content.Context;
import com.yxcorp.download.DownloadTask;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import nl9.d;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import java.lang.Boolean;
import wkd.b;
import k59.c2;
import android.text.TextUtils;
import android.net.Uri;
import ekd.x0;
import zh7.b;
import wh7.b;
import wh7.c;
import xh7.b;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import n49.s;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import xh7.a;
import qh7.b;
import qh7.a;
import java.lang.Throwable;
import yx.j0;
import java.lang.StringBuilder;
import nf6.i;
import android.content.Intent;
import mxb.f0;
import com.kuaishou.android.model.feed.k;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import r59.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import e17.i;
import ekd.k1;
import com.yxcorp.gifshow.ad.AdProcessUtils$a;
import java.lang.Runnable;
import com.kwai.framework.buildconfig.BuildConfig;
import java.util.Set;
import p49.f;
import p49.c;
import p49.f$a;
import com.yxcorp.gifshow.ad.AdProcessUtils$c;
import p49.a;
import com.yxcorp.gifshow.ad.AdProcessUtils$b;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil;
import mxb.j0;
import mxb.i0;
import mxb.j;
import com.yxcorp.gifshow.ad.AdProcessUtils$d;
import erd.g;
import nl9.m;
import tw.j;
import zsd.u;
import nx8.f;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import v19.b;
import androidx.lifecycle.ViewModel;
import io.reactivex.subjects.PublishSubject;
import v19.g;
import v19.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import os5.l;
import lnc.fa;
import com.yxcorp.gifshow.ad.AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1;
import msd.a;
import com.yxcorp.gifshow.ad.AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$2;
import com.yxcorp.gifshow.ad.AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$3;
import lnc.g;
import nx8.h;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import tw.h;

public final class AdProcessUtils	// class@0014f2
{
    public static final AdProcessUtils a;

    static {
       AdProcessUtils.a = new AdProcessUtils();
    }
    public void AdProcessUtils(){
       super();
    }
    public static final void a(Activity p0,AdDataWrapper p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AdProcessUtils.class, "20")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       BaseFeed photo = p1.getPhoto();
       if (photo != null) {
          String str = "AD";
          if (photo.get(str) instanceof PhotoAdvertisement) {
             photo = photo.get(str);
             Objects.requireNonNull(photo, "null cannot be cast to non-null type com.kuaishou.android.model.ads.PhotoAdvertisement");
             photo.mDownloadOnlySupportWifi = true;
          }
       }
       DownloadManager.n().A(p0);
       return;
    }
    public static final DownloadTask c(AdDataWrapper p0){
       Object obj = null;
       DownloadManager obj1 = PatchProxy.applyOneRefs(p0, obj, AdProcessUtils.class, "18");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(p0, "adDataWrapper");
       String str = d.a(0x4bd38ddd).L9(p0.getUrl());
       obj1 = DownloadManager.n();
       if (obj1.p(str) == null) {
          return obj;
       }
       Integer integer = obj1.p(str);
       a.o(integer, "taskId");
       return DownloadManager.n().l(integer.intValue());
    }
    public static final int d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdProcessUtils.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       int i1 = (p0 == null || !p0.length())? 1: 0;
       if (!i1) {
          i = (SystemUtil.M(a.b(), p0))? 1: 2;
       }
    label_0032 :
       return i;
    }
    public static final int e(AdDataWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdProcessUtils.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!p0 instanceof PhotoAdDataWrapper) {
          p0 = null;
       }
       int itemClickTyp = (p0 != null)? p0.getItemClickType(): 0;
       return itemClickTyp;
    }
    public static final boolean g(AdDataWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdProcessUtils.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!AdProcessUtils.e(p0))? true: false;
       return b;
    }
    public static final void h(Activity p0,String p1,AdDataWrapper p2,boolean p3){
       if (PatchProxy.isSupport(AdProcessUtils.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, AdProcessUtils.class, "17")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "url");
       a.p(p2, "adDataWrapper");
       b.a(0xdb243e0).a(p0, p2, p1, p3);
       return;
    }
    public static final boolean i(Context p0,String p1,AdDataWrapper p2){
       boolean b;
       Uri obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, AdProcessUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "context");
       a.p(p2, "dataWrapper");
       if (TextUtils.isEmpty(p1)) {
          return false;
       }
       obj = x0.f(p1);
       if (obj == null) {
          return false;
       }
       try{
          String str = b.a(obj);
          a.o(str, "RouteUtils.parseHostAndPaths\(uri\)");
          b = (c.a(str) != null)? true: false;
          a.m(p1);
          b uob = b.j(p0, p1);
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          QPhoto qPhoto = new QPhoto(p2.getPhoto());
          linkedHashMa.put("QPhoto", qPhoto);
          if (s.k(p1) == 3) {
             linkedHashMa.put(ProfileExtraKey.REFER_PHOTO.getValue(), qPhoto.getEntity());
          }
          uob.h("EXTRA_CONTEXT_MAP", linkedHashMa);
          a.b(uob, null);
       }catch(java.lang.Exception e7){
          j0.b("AdProcessUtils", "cannot start deepLink processKRouter", e7);
          b = false;
       }
       Object[] objArray = new Object[false];
       j0.f("AdProcessUtils", "processKRouter deeplinkUrl: "+p1+" result: "+b, objArray);
       return b;
    }
    public static final boolean j(Context p0,String p1,AdDataWrapper p2,boolean p3){
       Intent obj;
       QPhoto qPhoto;
       if (PatchProxy.isSupport(AdProcessUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, AdProcessUtils.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "context");
       boolean b = false;
       if (TextUtils.isEmpty(p1)) {
          return b;
       }else {
          obj = b.a(0x66dce92a).c(p0, x0.f(p1), b, true);
          if (obj == null) {
             if (p3) {
                AdProcessUtils.k(p2, p1, "1");
             }
             return b;
          }else {
             PhotoAdvertisement$AppLinkToastInfo uAppLinkToas = null;
             if (p2 != null) {
                BaseFeed photo = p2.getPhoto();
                if (photo != null) {
                   qPhoto = new QPhoto(photo);
                label_005e :
                   b.a(-762347696).t1(p1, k.B(qPhoto));
                   if (s.k(p1) == 3) {
                      String value = ProfileExtraKey.REFER_PHOTO.getValue();
                      BaseFeed photo1 = (p2 != null)? p2.getPhoto(): uAppLinkToas;
                      SerializableHook.putExtra(obj, value, photo1);
                   }
                   int i = 0x10000000;
                   try{
                      obj.addFlags(i);
                      if (!PatchProxy.applyVoidTwoRefs(p1, obj, uAppLinkToas, a.class, "2")) {
                         a.p(obj, "intent");
                         Uri uri = x0.f(p1);
                         if (uri != null) {
                            a.a(uri.getScheme(), obj);
                         }
                      }
                      if (p2 != null) {
                         uAppLinkToas = p2.getAppLinkToastInfo();
                      }
                      if (uAppLinkToas != null && uAppLinkToas.mEnableShowToast == true) {
                         i.e(R.style.arg_RES_7f11066a, uAppLinkToas.mText, uAppLinkToas.mDuration);
                         k1.n("PreventContinuousClicks");
                         k1.s(new AdProcessUtils$a(p0, obj), "PreventContinuousClicks", (long)uAppLinkToas.mDuration);
                      }else {
                         p0.startActivity(obj);
                      }
                      b = true;
                   }catch(java.lang.Exception e9){
                      j0.b("AdProcessUtils", "cannot start deepLink activity in processScheme", e9);
                      if (p3) {
                         AdProcessUtils.k(p2, p1, "1");
                      }
                   }
                   return b;
                }
             }
             qPhoto = uAppLinkToas;
             goto label_005e ;
          }
       }
    }
    public static final void k(AdDataWrapper p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, AdProcessUtils.class, "15")) {
          return;
       }
       if (p0 != null) {
          Uri uri = x0.f(p1);
          if (uri != null) {
             if (!BuildConfig.a.contains(uri.getScheme()) && (a.g(uri.getScheme(), "ks") || a.g(uri.getHost(), "miniapp"))) {
                Objects.requireNonNull(c.Z);
                f.a.a(c.z).g(new AdProcessUtils$b(p0, p1));
             }else {
                Objects.requireNonNull(c.Z);
                f.a.a(c.A).h(new AdProcessUtils$c(uri, p0, p1, p2));
             }
          }
       }
       return;
    }
    public static final void l(String p0,AdDataWrapper p1,boolean p2){
       int i;
       if (PatchProxy.isSupport(AdProcessUtils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, AdProcessUtils.class, "25")) {
          return;
       }
       if (p2) {
          NeoAppAdvanceReportUtil.g(p1);
          i = 320;
       }else {
          i = 321;
       }
       i0.a().p(i, p1.getAdLogWrapper()).q("deeplink", p0).d(new AdProcessUtils$d(p0, p1)).a();
       return;
    }
    public static final void m(Activity p0,QPhoto p1){
       String url;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, AdProcessUtils.class, "2")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       a.p(p1, "qPhoto");
       AdDataWrapper uAdDataWrapp = d.a(-2125799450).Pl(p1.mEntity);
       if (!j.D(p1)) {
          a.o(uAdDataWrapp, "adDataWrapper");
          url = uAdDataWrapp.getUrl();
       }else {
          a.o(uAdDataWrapp, "adDataWrapper");
          url = uAdDataWrapp.getH5Url();
       }
       int i = 0;
       if (TextUtils.isEmpty(url)) {
          Object[] objArray = new Object[i];
          j0.c("AdProcessUtils", "jumpPageUrl is emplty", objArray);
          return;
       }else {
          String str1 = "jumpPageUrl";
          a.o(url, str1);
          String str2 = "";
          if (u.q2(url, "kwai://adtkpage/moli", i, 2, obj)) {
             url = Uri.parse(url).getQueryParameter("backupUrl");
             if (url == null) {
                url = str2;
             }
          }
          a.o(url, str1);
          if (!PatchProxy.applyVoidThreeRefs(p0, uAdDataWrapp, url, null, f.class, "14")) {
             a.p(p0, str);
             a.p(uAdDataWrapp, "adDataWrapper");
             a.p(url, "url");
             if (TextUtils.isEmpty(url)) {
                url = uAdDataWrapp.getH5Url();
                if (url == null) {
                label_0097 :
                   if (str2 != null) {
                      ViewModelProviders.of(p0).get(b.class).o0().onNext(new a(uAdDataWrapp, str2));
                   }
                }
             }
             str2 = url;
             goto label_0097 ;
          }
          return;
       }
    }
    public static final void n(Activity p0,LiveAudienceParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AdProcessUtils.class, "30")) {
          return;
       }
       a.p(p1, "liveAudienceParam");
       if (p0 != null) {
          d.a(-1492894991).m1(p0, p1);
       }
       return;
    }
    public static final boolean o(Activity p0,AdDataWrapper p1,String p2){
       fa a;
       fa obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, AdProcessUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       a.p(p1, "dataWrapper");
       if (TextUtils.isEmpty(p2)) {
          p2 = p1.getScheme();
       }
       if (TextUtils.isEmpty(p2)) {
          return false;
       }else {
          int i = -762347696;
          if (p1.getPhoto() != null) {
             b.a(i).s1(p2, new QPhoto(p1.getPhoto()));
          }
          obj = new fa();
          obj.a(new AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1(p0, p2, p1));
          obj.a(new AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$2(p0, p2, p1));
          obj.a(new AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$3(p0, p2, p1));
          a = obj.a;
          String str = "1";
          if (a != null) {
             g.b(p1.getPhoto(), str, p2);
             if (!PatchProxy.applyVoidTwoRefs(p2, p1, null, AdProcessUtils.class, "26")) {
                k1.r(new h(p1, p2), s.h());
             }
          }else {
             AdProcessUtils.k(p1, p2, str);
             b.a(i).n1();
          }
          AdProcessUtils.l(p2, p1, a);
          return a;
       }
    }
    public static boolean p(Activity p0,AdDataWrapper p1,String p2,int p3,Object p4){
       return AdProcessUtils.o(p0, p1, null);
    }
    public final void b(AdDataWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcessUtils.class, "5")) {
          return;
       }
       int i = 1;
       if (p0.isAd() == i) {
          PhotoAdvertisement$JumpLiveInfo liveStreamIn = p0.getLiveStreamInfo();
          if (liveStreamIn != null) {
             a.o(liveStreamIn, "adDataWrapper?.liveStreamInfo ?: return");
             PhotoAdvertisement$JumpLiveInfo mLiveStreamI = liveStreamIn.mLiveStreamIds;
             int i1 = 0;
             mLiveStreamI = (mLiveStreamI == null || !mLiveStreamI.length())? 1: null;
             if (mLiveStreamI) {
                return;
             }else {
                mLiveStreamI = liveStreamIn.mBindAdToLiveStreamIds;
                String str = (mLiveStreamI == null || !mLiveStreamI.length())? 1: null;
                if (str) {
                   return;
                }else {
                   PhotoAdvertisement$JumpLiveInfo mBindAdToLiv = liveStreamIn.mBindAdToLiveStreamIds;
                   a.o(mBindAdToLiv, "liveInfo.mBindAdToLiveStreamIds");
                   String[] stringArray = new String[]{","};
                   List list = StringsKt__StringsKt.H4(mBindAdToLiv, stringArray, false, 0, 6, null);
                   String str1 = (list == null || list.isEmpty())? 1: null;
                   if (str1) {
                      return;
                   }else {
                      BaseFeed photo = p0.getPhoto();
                      if (photo != null) {
                         if (liveStreamIn.mToLiveType != i) {
                            i = list.size();
                         }
                         while (i1 < i) {
                            Object obj = photo.get("AD");
                            a.o(obj, "it.get\(AccessIds.AD\)");
                            b.a(-762347696).u1(list.get(i1), obj);
                            i1 = i1 + 1;
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public final int f(AdDataWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdProcessUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!h.a(p0.getPhoto())) {
          return 196;
       }
       return 147;
    }
}
