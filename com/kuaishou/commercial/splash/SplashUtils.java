package com.kuaishou.commercial.splash.SplashUtils;
import com.kuaishou.commercial.splash.SplashUtils$mSplashForbiddenByClipboardToken$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.commercial.splash.SplashUtils$mSplashTokenRegexReason$2;
import com.kuaishou.commercial.splash.SplashUtils$mLogSplashShowRemoveFailed$2;
import com.kuaishou.commercial.splash.SplashUtils$mSplashRealtimeRequestAdxParam$2;
import java.lang.Object;
import android.view.Window;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import android.content.Context;
import android.content.ComponentName;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import yx.j0;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.sdk.switchconfig.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.video.cache.AwesomeCache;
import java.lang.Math;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.SplashInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import java.lang.Long;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import com.kuaishou.commercial.splash.SplashModel;
import wkd.b;
import yy.p;
import android.net.Uri;
import tjc.c;
import android.hardware.SensorManager;
import qe6.b;
import java.util.List;
import java.lang.Iterable;
import android.hardware.Sensor;
import java.lang.CharSequence;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import zsd.u;
import im8.f;
import android.app.Application;
import android.os.Vibrator;
import java.lang.Throwable;
import nl9.h0$d;
import mxb.c;
import kp.r1;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.yxcorp.gifshow.commercial.model.RealtimeSplashInfo;
import yy.p2;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import com.yxcorp.gifshow.commercial.model.SensitiveControl;
import com.yxcorp.gifshow.commercial.model.SensitiveControl$Rotate;
import com.kuaishou.android.model.ads.SplashInfo$RotationInfo;
import com.kuaishou.android.model.ads.SplashInfo$AxisDirection;
import com.yxcorp.gifshow.commercial.model.SensitiveControl$Shake;
import com.kuaishou.android.model.ads.SplashInfo$ShakeInfo;
import com.yxcorp.gifshow.commercial.model.SensitiveControl$Slide;
import com.kuaishou.android.model.ads.SplashInfo$SlideInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import nx8.n;
import java.lang.Integer;
import com.kuaishou.commercial.splash.record.SplashSummeryData;
import fg6.a;
import com.google.gson.Gson;
import zw.a;
import android.text.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import tw.l;
import yy.k1;
import java.io.File;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Number;
import com.kwai.video.hodor.Hodor;
import java.lang.Float;
import java.lang.reflect.Type;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kuaishou.commercial.splash.SplashUtils$a;
import ok.h;
import tl8.e;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.mid.manifest.ManifestInterface;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import tjc.b;
import android.os.SystemClock;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo;
import com.yxcorp.gifshow.commercial.model.SplashMaterialInfo;

public final class SplashUtils	// class@00159b
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final SplashUtils e;

    static {
       SplashUtils.e = new SplashUtils();
       SplashUtils.a = s.c(SplashUtils$mSplashForbiddenByClipboardToken$2.INSTANCE);
       SplashUtils.b = s.c(SplashUtils$mSplashTokenRegexReason$2.INSTANCE);
       SplashUtils.c = s.c(SplashUtils$mLogSplashShowRemoveFailed$2.INSTANCE);
       SplashUtils.d = s.c(SplashUtils$mSplashRealtimeRequestAdxParam$2.INSTANCE);
    }
    public void SplashUtils(){
       super();
    }
    public static final void A(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SplashUtils.class, "64")) {
          return;
       }
       if (p0 != null) {
          View decorView = p0.getDecorView();
          if (decorView != null) {
             decorView.setSystemUiVisibility(5894);
          }
       }
       return;
    }
    public static final boolean B(){
       boolean b1;
       String packageName1;
       String str = "SplashUtils";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashUtils splashUtils = SplashUtils.class;
       Object obj = PatchProxy.apply(null, null, splashUtils, "31");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       ComponentName uComponentNa = SystemUtil.B(a.B);
       Object[] objArray = new Object[0];
       j0.f(str, "topActivity:"+uComponentNa, objArray);
       if (uComponentNa != null) {
          SplashUtils e = SplashUtils.e;
          Application b = a.B;
          String packageName = uComponentNa.getPackageName();
          Objects.requireNonNull(e);
          Object[] obj1 = PatchProxy.applyTwoRefs(b, packageName, e, splashUtils, "32");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(b != null){
             Context applicationC = b.getApplicationContext();
             if (applicationC != null) {
                packageName1 = applicationC.getPackageName();
                if (packageName1 != null) {
                label_0060 :
                   b1 = a.g(packageName1, packageName);
                }
             }
          }
          packageName1 = "";
          goto label_0060 ;
          if (b1) {
             obj1 = new Object[0];
             j0.f(str, "is foreground", obj1);
             return true;
          }
       }
       return 0;
    }
    public static final boolean C(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (SplashUtils.m(p0) - (float)i >= 0) {
          return SplashUtils.E(p0);
       }
       int i1 = a.t().a("splashEyemaxDownloadedDurationOptMs", -1);
       if (i1 > 0 && SplashUtils.i(p0) - (long)i1 > 0) {
          i = true;
       }
       return i;
    }
    public static final boolean E(BaseFeed p0){
       boolean b1;
       SplashBaseInfo mSplashId;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashUtils splashUtils = SplashUtils.class;
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, splashUtils, "12");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       float f = SplashUtils.m(p0);
       int i = 1;
       if (f - (float)0 > 0) {
          ArrayList uArrayList = SplashUtils.l(p0);
          boolean b = (uArrayList == null || uArrayList.isEmpty())? true: false;
          if (b) {
             return 0;
          }else {
             Iterator iterator = uArrayList.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return 0;
                }
                String str = iterator.next();
                long cachedBytesF = AwesomeCache.getCachedBytesForKey(str);
                long totalBytesFo = AwesomeCache.getTotalBytesForKey(str);
                if (!cachedBytesF) {
                   return 0;
                }else if(cachedBytesF - totalBytesFo < 0){
                   float f1 = (float)cachedBytesF;
                   if (f1 - f <= 0) {
                      f1 = f1 - f;
                      if (Math.abs(f1) - (float)i >= 0) {
                         totalBytesFo = totalBytesFo - cachedBytesF;
                         long l = Math.abs(totalBytesFo);
                         if (l - 1 >= 0) {
                         }
                      }
                   }
                }
                break ;
             }
             return i;
          }
       }else if((SplashUtils.i(p0) + (long)500) - SplashUtils.n(p0) < 0){
          obj1 = PatchProxy.applyOneRefs(p0, obj, splashUtils, "13");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(SplashUtils.n(p0) <= 0){
             obj1 = SplashUtils.o(p0);
             if (obj1 != null) {
                b1 = VodAdaptivePreloadPriorityTask.isFullyCached(obj1);
             }
          }
          b1 = false;
          if (!b1) {
             i = false;
          }
       }
       obj1 = "splash ";
       SplashBaseInfo splashBaseIn = PatchProxy.applyOneRefs(p0, obj, splashUtils, "30");
       if (splashBaseIn != patchProxyRe) {
       }else if(p0 != null){
          obj = p0.get("AD");
       }
       if (obj != null) {
          PhotoAdvertisement mAdData = obj.mAdData;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mSplashInfo = mAdData.mSplashInfo;
             if (mSplashInfo != null) {
                SplashInfo mSplashBaseI = mSplashInfo.mSplashBaseInfo;
                if (mSplashBaseI != null) {
                   mSplashId = mSplashBaseI.mSplashId;
                   if (mSplashId != null) {
                   label_00dd :
                      splashBaseIn = mSplashId;
                   }
                }
             }
          }
       }
       mSplashId = "";
       goto label_00dd ;
       Object[] objArray = new Object[0];
       j0.f("SplashUtils", obj1+splashBaseIn+" is enough: "+i, objArray);
       return i;
    }
    public static final boolean F(long p0){
       SplashUtils splashUtils = SplashUtils.class;
       if (PatchProxy.isSupport(splashUtils)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, splashUtils, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = DateUtils.h(p0, ".");
       String str1 = DateUtils.h(System.currentTimeMillis(), ".");
       boolean b = (str != null)? str.equals(str1): false;
       return b;
    }
    public static final boolean G(SplashModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "splashModel");
       boolean b = (b.a(0x946a02c).D(p0) == null)? true: false;
       return b;
    }
    public static final boolean H(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (SplashUtils.n(p0) > 0)? true: false;
       return b;
    }
    public static final boolean I(){
       Object obj = PatchProxy.apply(null, null, SplashUtils.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = -1608526086;
       Object obj1 = b.a(i);
       a.o(obj1, "Singleton.get\(SplashDataManager::class.java\)");
       if (obj1.getState() != 4) {
          obj = b.a(i);
          a.o(obj, "Singleton.get\(SplashDataManager::class.java\)");
          if (obj.getState() != 5) {
             i = false;
          label_003d :
             return i;
          }
       }
       i = true;
       goto label_003d ;
    }
    public static final boolean J(SensorManager p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, SplashUtils.class, "57");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (!b.a()) {
          return b;
       }
       if (p0 != null) {
          List sensorList = p0.getSensorList(-1);
          if (sensorList != null) {
             Iterator iterator = sensorList.iterator();
             while (iterator.hasNext()) {
                Object obj2 = iterator.next();
                Object obj3 = obj2;
                a.o(obj3, "it");
                obj3 = (obj3.getType() == 1)? 1: null;
                if (obj3) {
                   obj = obj2;
                   break ;
                }
             }
          }
          if (obj != null) {
             b = true;
          }
       }
       return b;
    }
    public static final boolean K(SensorManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!b.a()) {
          return false;
       }
       if (p0 != null) {
          List sensorList = p0.getSensorList(-1);
          a.o(sensorList, "sensorManager.getSensorList\(Sensor.TYPE_ALL\)");
          Iterator iterator = sensorList.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().getType() == 4) {
                return true;
             }
          }
       }
       return false;
    }
    public static final void L(String p0,String p1){
       boolean b;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashUtils splashUtils = SplashUtils.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, splashUtils, "48")) {
          return;
       }
       p op = b.a(0x946a02c);
       int i = 1;
       int i1 = (p0 == null || !p0.length())? 1: 0;
       if (!i1) {
          SplashInfo$SplashLocalRecordInfo splashLocalR = (p1 == null || !p1.length())? 1: null;
          if (!splashLocalR) {
             splashLocalR = op.s(p1);
             if (splashLocalR == null) {
                splashLocalR = new SplashInfo$SplashLocalRecordInfo();
             }
             a.o(splashLocalR, "splashAdDiskHelper.getMa¡­o.SplashLocalRecordInfo\(\)");
             SplashUtils e = SplashUtils.e;
             SplashInfo$SplashLocalRecordInfo mSplashIdLis = splashLocalR.mSplashIdList;
             Objects.requireNonNull(e);
             String obj = PatchProxy.applyTwoRefs(mSplashIdLis, p0, e, splashUtils, "50");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(mSplashIdLis == null || !mSplashIdLis.length()){
                i2 = 1;
             }else {
                i2 = 0;
             }
             if (!i2) {
                obj = (p0 == null || !p0.length())? 1: null;
                if (!obj) {
                   List list = e.p(mSplashIdLis);
                   if (list != null) {
                      b = list.contains(p0);
                   }
                }
             }
          label_008a :
             b = false;
             if (!b) {
                mSplashIdLis = splashLocalR.mSplashIdList;
                Objects.requireNonNull(e);
                Object obj1 = PatchProxy.applyTwoRefs(mSplashIdLis, p0, e, splashUtils, "49");
                if (obj1 != patchProxyRe) {
                   p0 = obj1;
                }else if(mSplashIdLis == null || !mSplashIdLis.length()){
                   i = 0;
                }
                if (!i) {
                   p0 = mSplashIdLis+','+p0;
                }
                splashLocalR.mSplashIdList = p0;
                Object[] objArray1 = new Object[0];
                j0.f("SplashMaterialChecker", "recordMaterialSplashId: materialName: "+p1+"materialRecordInfo.mSplashIdList: "+splashLocalR.mSplashIdList+' ', objArray1);
                op.M(p1, splashLocalR);
             }
             return;
          }
       }
       Object[] objArray = new Object[0];
       j0.f("SplashMaterialChecker", "recordMaterialSplashId: splashId: "+p0+" materialName: "+p1+' ', objArray);
       return;
    }
    public static final String M(String p0,String p1,String p2,String p3){
       String str;
       String str1;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, SplashUtils.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       int i = (p0 == null || !p0.length())? 1: 0;
       if (i) {
          return "";
       }else if(p1 == null || !p1.length()){
          i = 1;
       }else {
          i = 0;
       }
       if (!i) {
          boolean b = false;
          int i1 = 4;
          Object obj1 = null;
          str = p1;
          str1 = u.g2(u.g2(p0, "__CALLBACK__", str, b, i1, obj1), "__CALLBACK_PARAM__", str, b, i1, obj1);
       }else {
          str1 = p0;
       }
       i = (p2 == null || !p2.length())? 1: 0;
       if (!i) {
          str1 = u.g2(str1, "__SERVEREXPTAG__", p2, false, 4, null);
       }
       str = str1;
       if (p3 == null || !p3.length()) {
          obj = 1;
       }
       if (obj == null) {
          str = u.g2(str, "__REQUESTID__", p3, false, 4, null);
       }
       return str;
    }
    public static String N(String p0,String p1,String p2,String p3,int p4,Object p5){
       return SplashUtils.M(p0, p1, p2, null);
    }
    public static final void O(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SplashUtils.class, "55")) {
          return;
       }
       if (p0 != null) {
          p0.set(Boolean.TRUE);
       }
       return;
    }
    public static final boolean P(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashUtils splashUtils = SplashUtils.class;
       SplashUtils obj = PatchProxy.apply(null, null, splashUtils, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = SplashUtils.e;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, splashUtils, "3");
       if (uBoolean == patchProxyRe) {
          uBoolean = SplashUtils.c.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean Q(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashUtils splashUtils = SplashUtils.class;
       SplashUtils obj = PatchProxy.apply(null, null, splashUtils, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = SplashUtils.e;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, splashUtils, "1");
       if (uBoolean == patchProxyRe) {
          uBoolean = SplashUtils.a.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean R(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashUtils splashUtils = SplashUtils.class;
       SplashUtils obj = PatchProxy.apply(null, null, splashUtils, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = SplashUtils.e;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, splashUtils, "2");
       if (uBoolean == patchProxyRe) {
          uBoolean = SplashUtils.b.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final void S(long p0){
       SplashUtils splashUtils = SplashUtils.class;
       Object obj = null;
       if (PatchProxy.isSupport(splashUtils) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), obj, splashUtils, "65")) {
          return;
       }
       try{
          Object systemServic = a.b().getSystemService("vibrator");
          if (!systemServic instanceof Vibrator) {
          label_0026 :
             if (obj != null) {
                if (obj.hasVibrator()) {
                   obj.vibrate(p0);
                }
             }else {
                return;
             }
          }else {
             obj = systemServic;
             goto label_0026 ;
          }
       }catch(java.lang.Exception e4){
          j0.b("SplashUtils", "vibrate error", e4);
       }
       return;
    }
    public static final void T(BaseFeed p0,h0$d p1){
       PhotoAdvertisement mAdLiveForFa;
       PhotoAdvertisement photoAdverti1;
       PhotoAdvertisement$AdData mSplashInfo1;
       SplashInfo mSplashClick;
       int i;
       PhotoAdvertisement photoAdverti2;
       boolean b;
       PhotoAdvertisement photoAdverti3;
       PhotoAdvertisement$AdData mSplashInfo2;
       SplashInfo splashInfo2;
       Iterator iterator;
       SplashInfo splashInfo3;
       PhotoAdvertisement$AdData mItemClickUr1;
       PhotoAdvertisement$MerchandiseInfo mDiscountInf;
       Iterator iterator1;
       SplashInfo$RotationInfo mXAxisDirect;
       int b2;
       String str3;
       PhotoAdvertisement obj = p0;
       h0$d obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashUtils splashUtils = SplashUtils.class;
       Object[] obj2 = null;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, obj2, splashUtils, "26")) {
          return;
       }
       PhotoAdvertisement photoAdverti = (obj != null)? obj.get("AD"): obj2;
       if (obj != null && (obj1 != null && photoAdverti != null)) {
          r1.Y4(obj, obj1.f);
          mAdLiveForFa = photoAdverti.mAdLiveForFansTop;
          if (mAdLiveForFa != null) {
             mAdLiveForFa.mLlsid = obj1.f;
          }
       }
       obj1 = (obj1 != null)? obj1.a: obj2;
       String str = 1;
       RealtimeSplashInfo realtimeSpla = null;
       if (photoAdverti != null) {
          PhotoAdvertisement mAdData = photoAdverti.mAdData;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mSplashInfo = mAdData.mSplashInfo;
             if (mSplashInfo != null) {
                SplashUtils e = SplashUtils.e;
                Objects.requireNonNull(e);
                if (!PatchProxy.applyVoidTwoRefs(mSplashInfo, obj1, e, splashUtils, "27")) {
                   String str2 = "";
                   if (obj1 != null) {
                      RealtimeSplashInfo mLiveStreamI1 = obj1.mLiveStreamIds;
                      if (mLiveStreamI1 != null) {
                      label_005e :
                         mSplashInfo.mLiveStreamIds = mLiveStreamI1;
                         if (obj1 != null) {
                            mLiveStreamI1 = obj1.mCoinToken;
                            if (mLiveStreamI1 != null) {
                            label_0068 :
                               mSplashInfo.mCoinToken = mLiveStreamI1;
                               mLiveStreamI1 = (obj1 != null)? obj1.mToLiveType: 0;
                               mSplashInfo.mToLiveType = mLiveStreamI1;
                               mLiveStreamI1 = (obj1 != null)? obj1.mBindAdToLiveStreamIds: obj2;
                               mSplashInfo.mBindAdToLiveStreamIds = mLiveStreamI1;
                               mLiveStreamI1 = (obj1 != null)? obj1.mCallBackStr: obj2;
                               mSplashInfo.mCallBackStr = mLiveStreamI1;
                               mLiveStreamI1 = (obj1 != null)? obj1.mServerExpTag: obj2;
                               mSplashInfo.mServerExpTag = mLiveStreamI1;
                               mLiveStreamI1 = (obj1 != null)? obj1.mShowAvatarIcon: false;
                               mSplashInfo.mShowAvatarIcon = mLiveStreamI1;
                               if (obj1 != null) {
                                  mLiveStreamI1 = obj1.mSharePrefixDesc;
                                  if (mLiveStreamI1 != null) {
                                  label_009a :
                                     mSplashInfo.mSharePrefixDesc = mLiveStreamI1;
                                     if (obj1 != null) {
                                        mLiveStreamI1 = obj1.mShareSuffixDesc;
                                        if (mLiveStreamI1 != null) {
                                        label_00a4 :
                                           mSplashInfo.mShareSuffixDesc = mLiveStreamI1;
                                           if (obj1 != null) {
                                              mLiveStreamI1 = obj1.mSharePrefixDesc;
                                              if (mLiveStreamI1 != null) {
                                                 mLiveStreamI1 = (mLiveStreamI1.length() > 0)? 1: null;
                                                 if (mLiveStreamI1 == str) {
                                                 label_00c8 :
                                                    b2 = true;
                                                 label_00cb :
                                                    mSplashInfo.mShowInformation = b2;
                                                    if (obj1 != null) {
                                                       mLiveStreamI1 = obj1.mPersonalText;
                                                       if (mLiveStreamI1 != null) {
                                                          str2 = mLiveStreamI1;
                                                       }
                                                    }
                                                    mSplashInfo.mPersonalText = str2;
                                                    RealtimeSplashInfo mShowLiveIco = (obj1 != null)? obj1.mShowLiveIcon: false;
                                                    mSplashInfo.mShowLiveIcon = mShowLiveIco;
                                                    mShowLiveIco = (obj1 != null)? obj1.mChargeInfo: obj2;
                                                    mSplashInfo.mChargeInfo = mShowLiveIco;
                                                 }
                                              }
                                           }
                                           if (obj1 != null) {
                                              mLiveStreamI1 = obj1.mShareSuffixDesc;
                                              if (mLiveStreamI1 != null) {
                                                 mLiveStreamI1 = (mLiveStreamI1.length() > 0)? 1: 0;
                                                 if (mLiveStreamI1 == str) {
                                                    goto label_00c8 ;
                                                 }
                                              }
                                           }
                                           b2 = false;
                                           goto label_00cb ;
                                        }
                                     }
                                     str3 = str2;
                                     goto label_00a4 ;
                                  }
                               }
                               str3 = str2;
                               goto label_009a ;
                            }
                         }
                         str3 = str2;
                         goto label_0068 ;
                      }
                   }
                   str3 = str2;
                   goto label_005e ;
                }
                p2 op2 = p2.class;
                if (!PatchProxy.applyVoidTwoRefs(mSplashInfo, obj1, obj2, op2, "3")) {
                   SplashInfo mInteraction = mSplashInfo.mInteractionInfo;
                   if (mInteraction != null && mInteraction.hasInteraction()) {
                      SplashInfo$InteractionInfo mInteractive = mInteraction.mInteractiveStyle;
                      SensitiveControl sensitiveCon = PatchProxy.applyOneRefs(mInteraction, obj2, op2, "4");
                      if (sensitiveCon != patchProxyRe) {
                      }else {
                         sensitiveCon = new SensitiveControl();
                         if (mInteraction.mRotationInfo != null) {
                            SensitiveControl$Rotate rotate = new SensitiveControl$Rotate();
                            SplashInfo$InteractionInfo mRotationInf = mInteraction.mRotationInfo;
                            SplashInfo$RotationInfo mXAxisDirect1 = mRotationInf.mXAxisDirection;
                            if (mXAxisDirect1 != null) {
                               rotate.x = mXAxisDirect1.mRotateDegree;
                            }
                            mXAxisDirect1 = mRotationInf.mYAxisDirection;
                            if (mXAxisDirect1 != null) {
                               rotate.y = mXAxisDirect1.mRotateDegree;
                            }
                            mXAxisDirect1 = mRotationInf.mZAxisDirection;
                            if (mXAxisDirect1 != null) {
                               rotate.z = mXAxisDirect1.mRotateDegree;
                            }
                            sensitiveCon.mRotate = rotate;
                         }
                         if (mInteraction.mShakeInfo != null) {
                            SensitiveControl$Shake shake = new SensitiveControl$Shake();
                            shake.mAcceleration = mInteraction.mShakeInfo.mAccelerationThreshold;
                            sensitiveCon.mShake = shake;
                         }
                         if (mInteraction.mSlideInfo != null) {
                            SensitiveControl$Slide slide = new SensitiveControl$Slide();
                            slide.mDistance = mInteraction.mSlideInfo.mConvertDistance;
                            sensitiveCon.mSlide = slide;
                         }
                      }
                      mInteraction.mPreloadControl = p2.a(sensitiveCon, mInteractive);
                      Object[] objArray = new Object[realtimeSpla];
                      j0.f("SplashUtils", "preloadSensitiveControl:"+mInteraction.mPreloadControl, objArray);
                      if (obj1 != null) {
                         RealtimeSplashInfo mSensitiveCo = obj1.mSensitiveControl;
                         if (mSensitiveCo != null) {
                            mInteraction.mRealtimeControl = p2.a(mSensitiveCo, mInteractive);
                            Object[] objArray1 = new Object[realtimeSpla];
                            j0.f("SplashUtils", "realtimeSensitiveControl:"+mInteraction.mRealtimeControl, objArray1);
                            sensitiveCon = mSensitiveCo.mRotate;
                            if (sensitiveCon != null) {
                               mInteractive = mInteraction.mRotationInfo;
                               if (mInteractive != null) {
                                  mXAxisDirect = mInteractive.mXAxisDirection;
                                  if (mXAxisDirect != null) {
                                     mXAxisDirect.mRotateDegree = sensitiveCon.x;
                                  }
                               }
                               if (mInteractive != null) {
                                  mXAxisDirect = mInteractive.mYAxisDirection;
                                  if (mXAxisDirect != null) {
                                     mXAxisDirect.mRotateDegree = sensitiveCon.y;
                                  }
                               }
                               if (mInteractive != null) {
                                  SplashInfo$RotationInfo mZAxisDirect = mInteractive.mZAxisDirection;
                                  if (mZAxisDirect != null) {
                                     mZAxisDirect.mRotateDegree = sensitiveCon.z;
                                  }
                               }
                            }
                         label_01bf :
                            sensitiveCon = mSensitiveCo.mShake;
                            if (sensitiveCon != null) {
                               mInteractive = mInteraction.mShakeInfo;
                               if (mInteractive != null) {
                                  mInteractive.mAccelerationThreshold = sensitiveCon.mAcceleration;
                               }
                            }
                            SensitiveControl mSlide = mSensitiveCo.mSlide;
                            if (mSlide != null) {
                               SplashInfo$InteractionInfo mSlideInfo = mInteraction.mSlideInfo;
                               if (mSlideInfo != null) {
                                  mSlideInfo.mConvertDistance = mSlide.mDistance;
                               }
                            }
                         }
                      }
                   }
                }
             label_01d7 :
                long l = System.currentTimeMillis();
                if (!PatchProxy.applyVoidOneRefs(obj, obj2, splashUtils, "38") && obj != null) {
                   mAdLiveForFa = obj.get("AD");
                   if (mAdLiveForFa != null) {
                      PhotoAdvertisement mAdData2 = mAdLiveForFa.mAdData;
                      if (mAdData2 != null) {
                         mSplashInfo2 = mAdData2.mSplashInfo;
                      label_01f7 :
                         if (mSplashInfo2 != null) {
                            SplashInfo mCallBackStr = mSplashInfo2.mCallBackStr;
                            SplashInfo mServerExpTa = mSplashInfo2.mServerExpTag;
                            String str1 = r1.h1(p0);
                            int i1 = (mCallBackStr == null || !mCallBackStr.length())? 1: 0;
                            if (i1) {
                               i1 = (mServerExpTa == null || !mServerExpTa.length())? 1: 0;
                               if (i1) {
                                  i1 = (str1 == null || !str1.length())? 1: 0;
                                  if (!i1) {
                                  label_0237 :
                                     SplashInfo splashInfo = mServerExpTa;
                                     SplashInfo splashInfo1 = mCallBackStr;
                                     if (PatchProxy.applyVoidFourRefs(mAdLiveForFa, mCallBackStr, splashInfo, str1, null, p2.class, "1")) {
                                        splashInfo2 = splashInfo;
                                        mCallBackStr = splashInfo1;
                                        photoAdverti1 = photoAdverti;
                                     }else {
                                        a.p(mAdLiveForFa, "$this$replaceAdRealTime");
                                        splashInfo2 = splashInfo;
                                        mCallBackStr = splashInfo1;
                                        mAdLiveForFa.mUrl = SplashUtils.M(mAdLiveForFa.mUrl, mCallBackStr, splashInfo2, str1);
                                        mAdLiveForFa.mScheme = SplashUtils.M(mAdLiveForFa.mScheme, mCallBackStr, splashInfo2, str1);
                                        PhotoAdvertisement mAdData3 = mAdLiveForFa.mAdData;
                                        if (mAdData3 != null) {
                                           PhotoAdvertisement$AdData mItemClickUr = mAdData3.mItemClickUrls;
                                           if (mItemClickUr != null) {
                                              PhotoAdvertisement$ItemClickUrlGroup mActionbarCl = mItemClickUr.mActionbarClickUrl;
                                              if (mActionbarCl != null) {
                                                 photoAdverti1 = photoAdverti;
                                                 mActionbarCl.mAppLink = SplashUtils.M(mActionbarCl.mAppLink, mCallBackStr, splashInfo2, str1);
                                                 mActionbarCl.mUrl = SplashUtils.M(mActionbarCl.mUrl, mCallBackStr, splashInfo2, str1);
                                              label_028e :
                                                 photoAdverti = mAdLiveForFa.mAdData;
                                                 if (photoAdverti != null) {
                                                    mItemClickUr1 = photoAdverti.mItemClickUrls;
                                                    if (mItemClickUr1 != null) {
                                                       PhotoAdvertisement$ItemClickUrlGroup mUserInfoCli = mItemClickUr1.mUserInfoClickUrls;
                                                       if (mUserInfoCli != null) {
                                                          mUserInfoCli.mAppLink = SplashUtils.M(mUserInfoCli.mAppLink, mCallBackStr, splashInfo2, str1);
                                                          mUserInfoCli.mUrl = SplashUtils.M(mUserInfoCli.mUrl, mCallBackStr, splashInfo2, str1);
                                                       }
                                                    }
                                                 }
                                                 photoAdverti = mAdLiveForFa.mAdData;
                                                 if (photoAdverti != null) {
                                                    mItemClickUr1 = photoAdverti.mMerchandiseInfo;
                                                    if (mItemClickUr1 != null) {
                                                       mDiscountInf = mItemClickUr1.mDiscountInfoList;
                                                       if (mDiscountInf != null && (mDiscountInf.isEmpty() ^ 0x01)) {
                                                          iterator1 = mDiscountInf.iterator();
                                                          while (iterator1.hasNext()) {
                                                             PhotoAdvertisement$MerchandiseInfo$DiscountInfo merchandiseI = iterator1.next();
                                                             merchandiseI.mUrl = SplashUtils.M(merchandiseI.mUrl, mCallBackStr, splashInfo2, str1);
                                                             merchandiseI.mScheme = SplashUtils.M(merchandiseI.mScheme, mCallBackStr, splashInfo2, str1);
                                                             iterator1 = iterator1;
                                                          }
                                                       }
                                                    }
                                                 }
                                                 photoAdverti = mAdLiveForFa.mAdData;
                                                 if (photoAdverti != null) {
                                                    mItemClickUr1 = photoAdverti.mMerchandiseInfo;
                                                    if (mItemClickUr1 != null) {
                                                       mDiscountInf = mItemClickUr1.mMerchandiseItemInfoList;
                                                       if (mDiscountInf != null && (mDiscountInf.isEmpty() ^ 0x01)) {
                                                          iterator1 = mDiscountInf.iterator();
                                                          while (iterator1.hasNext()) {
                                                             PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo merchandiseI1 = iterator1.next();
                                                             merchandiseI1.mUrl = SplashUtils.M(merchandiseI1.mUrl, mCallBackStr, splashInfo2, str1);
                                                             merchandiseI1.mScheme = SplashUtils.M(merchandiseI1.mScheme, mCallBackStr, splashInfo2, str1);
                                                             iterator1 = iterator1;
                                                          }
                                                       }
                                                    }
                                                 }
                                                 photoAdverti = mAdLiveForFa.mAdLiveForFansTop;
                                                 if (photoAdverti != null) {
                                                    photoAdverti.mMerchantURLParamsStr = SplashUtils.M(photoAdverti.mMerchantURLParamsStr, mCallBackStr, splashInfo2, str1);
                                                 }
                                              }
                                           }
                                        }
                                        photoAdverti1 = photoAdverti;
                                        goto label_028e ;
                                     }
                                  }else {
                                     photoAdverti1 = photoAdverti;
                                     splashInfo2 = mServerExpTa;
                                  }
                               }else {
                                  goto label_0237 ;
                               }
                            }else {
                               goto label_0237 ;
                            }
                            SplashUtils e1 = SplashUtils.e;
                            Objects.requireNonNull(e1);
                            ArrayList uArrayList = PatchProxy.applyOneRefs(mAdLiveForFa, e1, splashUtils, "39");
                            if (uArrayList != patchProxyRe) {
                            }else {
                               uArrayList = new ArrayList();
                               photoAdverti2 = mAdLiveForFa.mAdLiveForFansTop;
                               if (photoAdverti2 != null) {
                                  PhotoAdvertisement$FanstopLiveInfo mTracks = photoAdverti2.mTracks;
                                  b = (mTracks == null || mTracks.isEmpty())? true: false;
                                  if (!b) {
                                     iterator = photoAdverti2.mTracks.iterator();
                                     while (iterator.hasNext()) {
                                        uArrayList.add(iterator.next());
                                     }
                                  }
                               }
                               photoAdverti2 = mAdLiveForFa.mTracks;
                               photoAdverti2 = (photoAdverti2 == null || photoAdverti2.isEmpty())? 1: null;
                               if (!photoAdverti2) {
                                  iterator = mAdLiveForFa.mTracks.iterator();
                                  while (iterator.hasNext()) {
                                     uArrayList.add(iterator.next());
                                  }
                               }
                            }
                            if (uArrayList.isEmpty() ^ 1) {
                               iterator = uArrayList.iterator();
                               while (iterator.hasNext()) {
                                  PhotoAdvertisement$Track track = iterator.next();
                                  splashInfo3 = (mCallBackStr == null || !mCallBackStr.length())? 1: null;
                                  if (!splashInfo3) {
                                     track.mUrl = SplashUtils.N(track.mUrl, mCallBackStr, splashInfo2, null, 8, null);
                                  }else {
                                     SplashInfo splashInfo4 = mCallBackStr;
                                     if (track.mUrlOperationType != 2) {
                                        track.mUrl = SplashUtils.N(track.mUrl, "", splashInfo2, null, 8, null);
                                     }
                                     mCallBackStr = splashInfo4;
                                  }
                               }
                            }
                            mSplashClick = mSplashInfo2.mChargeInfo;
                            splashInfo3 = (mSplashClick == null || !mSplashClick.length())? 1: 0;
                            if (!splashInfo3) {
                               mAdLiveForFa.mChargeInfo = mSplashInfo2.mChargeInfo;
                            }
                         }else {
                         label_03fe :
                            photoAdverti1 = photoAdverti;
                         }
                      }
                   }
                   mSplashInfo2 = obj2;
                   goto label_01f7 ;
                }else {
                   goto label_03fe ;
                }
                obj2 = new Object[0];
                j0.f("SplashUtils", "replace cost ms:"+(System.currentTimeMillis() - l), obj2);
             label_0420 :
                RealtimeSplashInfo mIpAddress = (obj1 != null)? obj1.mIpAddress: null;
                if (!PatchProxy.applyVoidTwoRefs(obj, mIpAddress, null, c.class, "2") && !TextUtils.x(mIpAddress)) {
                   photoAdverti3 = (obj != null)? obj.get("AD"): null;
                   if (photoAdverti3 != null) {
                      photoAdverti3 = photoAdverti3.mAdData;
                      if (photoAdverti3 != null) {
                         photoAdverti3.mIpAddress = mIpAddress;
                      }
                   }
                }
             label_0448 :
                Boolean uBoolean = (obj1 != null)? Boolean.valueOf(obj1.mEnableHideActionBar): null;
                if (!PatchProxy.applyVoidTwoRefs(obj, uBoolean, null, c.class, "71")) {
                   photoAdverti3 = (obj != null)? obj.get("AD"): null;
                   if (photoAdverti3 != null) {
                      PhotoAdvertisement$AdData adData1 = photoAdverti3.getAdData();
                      if (adData1 != null) {
                         adData1 = adData1.mActionbarInfo;
                         if (adData1 != null) {
                            boolean b1 = (uBoolean != null)? uBoolean.booleanValue(): false;
                            adData1.mEnableHideActionBar = b1;
                         }
                      }
                   }
                }
             label_047c :
                Boolean uBoolean1 = (obj1 != null)? Boolean.valueOf(obj1.mShowLiveIcon): null;
                if (!PatchProxy.applyVoidTwoRefs(obj, uBoolean1, null, c.class, "72")) {
                   photoAdverti2 = (obj != null)? obj.get("AD"): null;
                   if (photoAdverti2 != null) {
                      PhotoAdvertisement$AdData adData = photoAdverti2.getAdData();
                      if (adData != null) {
                         b = (uBoolean1 != null)? uBoolean1.booleanValue(): false;
                         adData.mShowLiveIcon = b;
                      }
                   }
                }
             label_04ad :
                RealtimeSplashInfo mPlayEndSubT = (obj1 != null)? obj1.mPlayEndSubTitle: null;
                RealtimeSplashInfo realtimeSpla1 = null;
                if (!PatchProxy.applyVoidTwoRefs(obj, mPlayEndSubT, realtimeSpla1, c.class, "73")) {
                   obj = (obj != null)? obj.get("AD"): realtimeSpla1;
                   if (obj != null) {
                      mSplashInfo1 = obj.getAdData();
                      if (mSplashInfo1 != null) {
                         mSplashInfo1 = mSplashInfo1.mPlayEndInfo;
                         if (mSplashInfo1 != null) {
                            mSplashInfo1.mPlayEndSubTitle = mPlayEndSubT;
                         }
                      }
                   }
                }
             label_04d5 :
                if (photoAdverti1 != null) {
                   photoAdverti = photoAdverti1;
                   obj = photoAdverti.mAdData;
                   if (obj != null) {
                      mSplashInfo1 = obj.mSplashInfo;
                      if (mSplashInfo1 != null) {
                         SplashInfo mLiveStreamI = mSplashInfo1.mLiveStreamIds;
                         if (mLiveStreamI != null) {
                            PhotoAdvertisement$JumpLiveInfo jumpLiveInfo = (mLiveStreamI.length() > 0)? 1: null;
                            if (jumpLiveInfo == 1) {
                               jumpLiveInfo = new PhotoAdvertisement$JumpLiveInfo();
                               mIpAddress = (obj1 != null)? obj1.mBindAdToLiveStreamIds: realtimeSpla1;
                               jumpLiveInfo.mBindAdToLiveStreamIds = mIpAddress;
                               if (obj1 != null) {
                                  realtimeSpla1 = obj1.mLiveStreamIds;
                               }
                               jumpLiveInfo.mLiveStreamIds = realtimeSpla1;
                               realtimeSpla = (obj1 != null)? obj1.mToLiveType: 0;
                               jumpLiveInfo.mToLiveType = realtimeSpla;
                               PhotoAdvertisement mAdData1 = photoAdverti.mAdData;
                               if (n.a.e(mAdData1.mSplashInfo.mSplashClickUrlInfo)) {
                                  mSplashClick = mAdData1.mSplashInfo.mSplashClickUrlInfo;
                                  if (mSplashClick != null) {
                                     mSplashClick.mJumpLiveInfo = jumpLiveInfo;
                                  }
                               }
                               mAdData1.mJumpLiveInfo = jumpLiveInfo;
                            }
                         }
                      }
                   }
                }
                return;
             }
          }
       }
       photoAdverti1 = photoAdverti;
       PhotoAdvertisement$AdData uAdData = null;
       goto label_0420 ;
    }
    public static final void U(String p0,String p1,int p2){
       if (PatchProxy.isSupport(SplashUtils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, SplashUtils.class, "69")) {
          return;
       }
       int i = 1;
       int i1 = (p0 == null || !p0.length())? 1: 0;
       if (!i1) {
          if (p1 != null && p1.length()) {
             i = 0;
          }
          if (!i) {
             i = 0x946a02c;
             SplashSummeryData splashSummer = b.a(i).t(p0);
             if (splashSummer == null) {
                splashSummer = new SplashSummeryData();
             }
             a.o(splashSummer, "Singleton.get\(SplashAdDi\x20\x02   ?: SplashSummeryData\(\)\x00");
             splashSummer.mMaterialName = p1;
             splashSummer.mSplashAdType = p2;
             p op = b.a(i);
             Objects.requireNonNull(op);
             if (!PatchProxy.applyVoidTwoRefs(p0, splashSummer, op, p.class, "72")) {
                try{
                   op.b.j("splashsummery", p0, a.a.q(splashSummer));
                }catch(java.lang.Exception e7){
                   Object[] objArray = new Object[0];
                   j0.c("SplashAdDiskHelper", "putMaterialLocalInfo error:"+e7, objArray);
                }
             }
          }
       }
    }
    public static final boolean a(SplashInfo$SplashLocalRecordInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p0.mEndTime - (System.currentTimeMillis() / (long)1000) > 0) {
          b = true;
       }
       return b;
    }
    public static final boolean b(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "timeString");
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       String[] stringArray = new String[]{"_"};
       obj = new String[false];
       Object[] objArray = StringsKt__StringsKt.H4(p0, stringArray, false, 0, 6, null).toArray(obj);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       if (objArray.length < 3) {
          return false;
       }
       if (!TextUtils.isDigitsOnly(objArray[1]) || !TextUtils.isDigitsOnly(objArray[2])) {
          return false;
       }
       return 1;
    }
    public static final boolean c(SplashModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          p0 = p0.mBaseFeed;
          if (p0 != null) {
             SplashInfo splashInfo = l.e(p0);
             if (splashInfo != null) {
                if (k1.a(splashInfo)) {
                   SplashInfo mPreviewEndT = splashInfo.mPreviewEndTime;
                   if (mPreviewEndT > 0) {
                      if (mPreviewEndT - (System.currentTimeMillis() / (long)1000) > 0) {
                         b = true;
                      }
                      return b;
                   }
                }
                splashInfo = splashInfo.mSplashBaseInfo;
                if (splashInfo != null && splashInfo.mEndTime - (System.currentTimeMillis() / (long)1000) > 0) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public static final boolean d(File p0){
       File[] obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "dir");
       obj = p0.listFiles();
       if (obj == null) {
          return false;
       }
       int i = (!obj.length)? 1: 0;
       if (i) {
          p0.delete();
          return true;
       }else {
          int len = obj.length;
          i = 0;
          while (true) {
             if (i >= len) {
                return true;
             }
             object oobject = obj[i];
             if (oobject != null && oobject.isDirectory() == true) {
                if (!SplashUtils.d(oobject)) {
                   break ;
                }
             }else if(oobject != null && !oobject.delete()){
                return false;
             }
             i = i + 1;
          }
          return false;
       }
    }
    public static final boolean e(){
       Object obj = PatchProxy.apply(null, null, SplashUtils.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSplashNewProcess", true);
    }
    public static final boolean f(){
       Object obj = PatchProxy.apply(null, null, SplashUtils.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!Edge2EdgeHelper.b() || !a.t().d("enableSplashEdge2Edge", b)) {
          b = false;
       }
       return b;
    }
    public static final SpannableStringBuilder g(String p0,String p1,int p2){
       SpannableStringBuilder obj;
       QCurrentUser qCurrentUser;
       if (PatchProxy.isSupport(SplashUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, SplashUtils.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SpannableStringBuilder();
       int i = 0;
       if (p0 != null) {
          qCurrentUser = (p0.length() > 0)? 1: null;
          if (qCurrentUser == 1) {
             obj.append(p0);
             SpannableStringBuilderUtils.i(obj, p2);
          }
       }
       QCurrentUser mE = QCurrentUser.ME;
       mE = (mE != null)? mE.getName(): null;
       qCurrentUser = QCurrentUser.ME;
       if (qCurrentUser != null && (qCurrentUser.isLogined() == true && mE != null)) {
          int i1 = (mE.length() > 0)? 1: 0;
          if (i1 == 1) {
             int i2 = 5;
             if (mE.length() > i2) {
                mE = mE.substring(i, i2);
                a.o(mE, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                StringBuilder str = mE;
                mE = str+"¡­";
             }
             obj.append(mE);
             SpannableStringBuilderUtils.i(obj, p2);
          }
       }
    label_0080 :
       if (p1 != null) {
          if (p1.length() > 0) {
             i = 1;
          }
          if (i == 1) {
             obj.append(p1);
          }
       }
       return obj;
    }
    public static final long i(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (SplashUtils.n(p0) - l <= 0) {
          return l;
       }
       String str = SplashUtils.o(p0);
       if (str == null) {
          return l;
       }
       long upmostCached = VodAdaptivePreloadPriorityTask.getUpmostCachedDurationMs(str);
       Object[] objArray = new Object[0];
       j0.f("SplashUtils", "getCachedDurationMs : "+upmostCached, objArray);
       return upmostCached;
    }
    public static final String j(BaseFeed p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, SplashUtils.class, "17");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       ArrayList uArrayList = SplashUtils.l(p0);
       if (uArrayList != null) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             Object obj2 = (AwesomeCache.getCachedBytesForKey(obj1) > 0)? 1: null;
             if (obj2) {
                obj = obj1;
                break ;
             }
          }
       }
       return obj;
    }
    public static final List k(){
       Object obj = PatchProxy.apply(null, null, SplashUtils.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Hodor.instance().getMediaCacheKeyListOfCacheGroup("splash_ad_eyemax");
    }
    public static final ArrayList l(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SplashUtils.n(p0) <= 0) {
          return null;
       }
       String str = SplashUtils.o(p0);
       if (str != null) {
          return VodAdaptivePreloadPriorityTask.getCacheKeyListFromManifest(str);
       }
       return null;
    }
    public static final float m(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       if (p0 == null) {
          return f;
       }
       float f1 = (float)1024;
       return ((((a.t().getValue("eyemaxPrefetchBitRate", Float.TYPE, Float.valueOf(f)).floatValue() * (float)SplashUtils.n(p0)) / (float)1000) * f1) * f1);
    }
    public static final long n(BaseFeed p0){
       long l;
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       SplashInfo splashInfo = l.e(p0);
       l = (splashInfo != null)? (long)splashInfo.mPreloadDurMs: 0;
       return l;
    }
    public static final String o(BaseFeed p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, SplashUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       KwaiManifest kwaiManifest = e.h(p0, VideoMeta.class, SplashUtils$a.b);
       if (kwaiManifest != null) {
          str = kwaiManifest.toJsonString();
       }
       return str;
    }
    public static final String q(SplashModel p0){
       String obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = b.a(0x946a02c).D(p0);
       obj = (uri != null)? uri.toString(): null;
       File uFile = (obj == null || !obj.length())? 1: null;
       if (uFile) {
          return null;
       }else {
          return new File(uri.toString()).getName();
       }
    }
    public static final String r(SplashModel p0,int p1){
       SplashUtils splashUtils = SplashUtils.class;
       if (PatchProxy.isSupport(splashUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, splashUtils, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Uri uri = b.a(0x946a02c).x(p0, p1);
       String str = (uri != null)? uri.toString(): null;
       File uFile = (str == null || !str.length())? 1: null;
       if (uFile) {
          return null;
       }else {
          return new File(uri.toString()).getName();
       }
    }
    public static final SplashInfo$PlayablePopupInfo s(BaseFeed p0){
       PhotoAdvertisement$AdData adData;
       SplashInfo$SplashPlayableInfo splashPlayab = null;
       Object obj = PatchProxy.applyOneRefs(p0, splashPlayab, SplashUtils.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement photoAdverti = (p0 != null)? p0.get("AD"): splashPlayab;
       if (photoAdverti != null) {
          adData = photoAdverti.getAdData();
          if (adData != null) {
             adData = adData.mSplashInfo;
          label_0028 :
             if (adData != null) {
                SplashInfo mPlayableInf = adData.mPlayableInfo;
                if (mPlayableInf != null) {
                   splashPlayab = mPlayableInf.mPlayablePopupInfo;
                }
             }
             return splashPlayab;
          }
       }
       adData = splashPlayab;
       goto label_0028 ;
    }
    public static final SplashInfo$PlayablePopupInfo t(b p0){
       b uob = null;
       Object obj = PatchProxy.applyOneRefs(p0, uob, SplashUtils.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          uob = p0.b;
       }
       return SplashUtils.s(uob);
    }
    public static final long u(long p0){
       SplashUtils splashUtils = SplashUtils.class;
       if (PatchProxy.isSupport(splashUtils)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, splashUtils, "44");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = (p0 > 0)? SystemClock.elapsedRealtime() - p0: -1;
       return l;
    }
    public static final long v(BaseFeed p0){
       SplashInfo$SplashLocalRecordInfo obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = null;
       if (p0 != null) {
          SplashInfo splashInfo = l.e(p0);
          if (splashInfo != null) {
             a.o(splashInfo, "SplashInfoUtil.getSplash\x20\x02fo\(baseFeed\) ?: return 0L\x00");
             SplashInfo$SplashLocalRecordInfo splashLocalR = l.g(splashInfo);
             if (splashLocalR != null) {
                obj = splashLocalR.mPreloadTime;
             }
          }
       }
       return obj;
    }
    public static final SplashBaseInfo w(BaseFeed p0){
       SplashInfo splashInfo = null;
       Object obj = PatchProxy.applyOneRefs(p0, splashInfo, SplashUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplashInfo splashInfo1 = l.e(p0);
       if (splashInfo1 != null) {
          splashInfo = splashInfo1.mSplashBaseInfo;
       }
       return splashInfo;
    }
    public static final String x(BaseFeed p0){
       SplashInfo mCoinToken;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, SplashUtils.class, "28");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          obj = p0.get("AD");
       }
       if (obj != null) {
          PhotoAdvertisement mAdData = obj.mAdData;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mSplashInfo = mAdData.mSplashInfo;
             if (mSplashInfo != null) {
                mCoinToken = mSplashInfo.mCoinToken;
                if (mCoinToken != null) {
                label_002c :
                   return mCoinToken;
                }
             }
          }
       }
       mCoinToken = "";
       goto label_002c ;
    }
    public static final int y(SplashModel p0){
       SplashInfo$SplashLocalRecordInfo obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       if (p0 != null) {
          b uob = d.a(-536296199);
          a.o(uob, "PluginManager.get\(SplashPlugin::class.java\)");
          SplashInfo splashInfo = uob.ob();
          if (splashInfo != null) {
             SplashInfo mSplashBaseI = splashInfo.mSplashBaseInfo;
             if (mSplashBaseI != null && TextUtils.equals(p0.mSplashId, mSplashBaseI.mSplashId)) {
                SplashInfo$SplashLocalRecordInfo splashLocalR = l.g(splashInfo);
                if (splashLocalR != null) {
                   return splashLocalR.mImpressionCount;
                }
             }
          }
          SplashInfo$SplashLocalRecordInfo splashLocalR1 = l.h(p0.mBaseFeed);
          if (splashLocalR1 != null) {
             obj = splashLocalR1.mImpressionCount;
          }
       }
       return obj;
    }
    public static final boolean z(f p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, SplashUtils.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          Boolean uBoolean = p0.get();
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_0024 :
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public final boolean D(SplashInfo$FloatingCardInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplashUtils.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          SplashInfo$FloatingCardInfo mCardInfo = p0.mCardInfo;
          if (mCardInfo != null) {
             SplashInfo$CardInfo mAvatarUrl = mCardInfo.mAvatarUrl;
             if (mAvatarUrl != null) {
                mAvatarUrl = (mAvatarUrl.length() > 0)? 1: 0;
                if (mAvatarUrl == 1) {
                   p0 = p0.mCardInfo;
                   if (p0 != null) {
                      SplashInfo$CardInfo mName = p0.mName;
                      if (mName != null) {
                         mName = (mName.length() > 0)? 1: 0;
                         if (mName == 1) {
                            b = true;
                         }
                      }
                   }
                }
             }
          }
       }
    label_003e :
       return b;
    }
    public final String h(SplashModel p0){
       SplashMaterialInfo obj = PatchProxy.applyOneRefs(p0, this, SplashUtils.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       p op = b.a(0x946a02c);
       Objects.requireNonNull(op);
       SplashModel mSplashMater = p0.mSplashMaterialInfo;
       if (mSplashMater != null && 2 != mSplashMater.mSplashAdMaterialType) {
          obj = mSplashMater.mBackupImageUrls;
       }
       p0 = p0.mSplashId;
       if (p0 == null) {
          String str = "";
       }
       return op.m(obj, p0);
    }
    public final List p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplashUtils.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       int i1 = 1;
       int i2 = (p0 == null || !p0.length())? 1: 0;
       if (i2) {
          return null;
       }else {
          char[] uocharArray = new char[i1];
          uocharArray[i] = ',';
          return StringsKt__StringsKt.G4(p0, uocharArray, false, 0, 6, null);
       }
    }
}
