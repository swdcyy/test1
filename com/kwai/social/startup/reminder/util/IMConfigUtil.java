package com.kwai.social.startup.reminder.util.IMConfigUtil;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import java.util.Set;
import trd.d1;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import com.kwai.social.startup.reminder.util.IMConfigUtil$mSupportCategories$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.social.startup.reminder.util.IMConfigUtil$mPluginEventSampleRate$2;
import com.kwai.social.startup.reminder.util.IMConfigUtil$mCustomEmotionMap$2;
import com.kwai.social.startup.reminder.util.IMConfigUtil$mEnableEmotionMessageOptimize$2;
import com.kwai.social.startup.reminder.util.IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Number;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import lnc.o5;
import com.kwai.social.startup.reminder.model.PageLazyInitConfig;
import com.kwai.social.startup.reminder.model.IMInAppAddedUnreadConfig;
import com.kwai.social.startup.reminder.model.StartupShortLinkPushConfig;
import com.kwai.social.startup.reminder.model.IMPluginLoggerConfig;
import java.lang.Math;
import com.kwai.framework.abtest.f;
import com.kwai.social.startup.reminder.model.CallVideoResolution;
import java.util.Objects;
import com.kwai.social.startup.reminder.model.GroupOnlineFetchConfig;
import java.lang.Long;
import java.util.Collection;
import pt7.a;

public final class IMConfigUtil	// class@0018df
{
    public static final List a;
    public static final Map b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static long h;
    public static final IMConfigUtil i;

    static {
       IMConfigUtil.i = new IMConfigUtil();
       String[] stringArray = new String[]{"adIm","SERNUM","MERCHANT","vcMerchant"};
       IMConfigUtil.a = CollectionsKt__CollectionsKt.L(stringArray);
       Integer[] integerArray = new Integer[]{Integer.valueOf(1),Integer.valueOf(2)};
       IMConfigUtil.b = s0.k(r0.a("0", d1.u(integerArray)));
       IMConfigUtil.c = s.c(IMConfigUtil$mSupportCategories$2.INSTANCE);
       IMConfigUtil.d = s.c(IMConfigUtil$mPluginEventSampleRate$2.INSTANCE);
       IMConfigUtil.e = s.c(IMConfigUtil$mCustomEmotionMap$2.INSTANCE);
       IMConfigUtil.f = s.c(IMConfigUtil$mEnableEmotionMessageOptimize$2.INSTANCE);
       IMConfigUtil.g = s.c(IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2.INSTANCE);
       IMConfigUtil.h = -1;
    }
    public void IMConfigUtil(){
       super();
    }
    public static final long a(boolean p0){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMConfigUtil iMConfigUtil = IMConfigUtil.class;
       Integer integer = null;
       if (PatchProxy.isSupport(iMConfigUtil)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), integer, iMConfigUtil, "26");
          if (obj != patchProxyRe) {
             return obj.longValue();
          }
       }
       if (p0 || !IMConfigUtil.h - -1) {
          IMConfigUtil obj1 = PatchProxy.apply(integer, integer, iMConfigUtil, "27");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else {
             obj1 = IMConfigUtil.i;
             IMConfigInfo iMConfigInfo = obj1.r();
             if (iMConfigInfo != null) {
                Integer integer1 = Integer.valueOf(iMConfigInfo.mSessionUnreadCountKeepTime);
                int i = (integer1.intValue())? 1: 0;
                if (i) {
                   integer = integer1;
                }
                if (integer != null) {
                   int i1 = integer.intValue();
                   IMConfigInfo iMConfigInfo1 = obj1.r();
                   if (iMConfigInfo1 != null) {
                      iMConfigInfo1 = iMConfigInfo1.mRedPointLabConfig;
                      if (iMConfigInfo1 != null) {
                         String str = iMConfigInfo1.get(String.valueOf(i1));
                         if (str != null) {
                            l = o5.c(str) * (long)0xea60;
                         }
                      }
                   }
                }
             }
          label_007a :
             l = 0;
          }
          IMConfigUtil.h = l;
       }
       return IMConfigUtil.h;
    }
    public static long b(boolean p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       return IMConfigUtil.a(p0);
    }
    public static final boolean c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, IMConfigUtil.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (IMConfigUtil.b(b, 1, objArray) > 0) {
          b = true;
       }
       return b;
    }
    public static final boolean d(){
       PageLazyInitConfig enableChatPa;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mPageLazyInitConfig;
          if (obj != null) {
             enableChatPa = obj.enableChatPageLazyInit;
          label_0024 :
             return enableChatPa;
          }
       }
       enableChatPa = false;
       goto label_0024 ;
    }
    public static final boolean e(){
       boolean b;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = IMConfigUtil.i.r();
       obj = (obj != null)? obj.mEnableFloatWindowExtraYOffset: false;
       return obj;
    }
    public static final boolean f(){
       boolean b;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = IMConfigUtil.i.r();
       obj = (obj != null)? obj.mEnableImRtcOutPushRingVibrate: false;
       return obj;
    }
    public static final boolean g(){
       IMInAppAddedUnreadConfig enableCalcul;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mInAppAddedUnreadMessageCountConfig;
          if (obj != null) {
             enableCalcul = obj.enableCalculate;
          label_0024 :
             return enableCalcul;
          }
       }
       enableCalcul = false;
       goto label_0024 ;
    }
    public static final boolean h(){
       StartupShortLinkPushConfig enable;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mStartupShortLinkPushConfig;
          if (obj != null) {
             enable = obj.enable;
          label_0024 :
             return enable;
          }
       }
       enable = false;
       goto label_0024 ;
    }
    public static final boolean i(){
       boolean b;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = IMConfigUtil.i.r();
       obj = (obj != null)? obj.mEnableInitIMFromPushImmediately: true;
       return obj;
    }
    public static final boolean j(int p0){
       IMConfigInfo obj;
       IMConfigUtil iMConfigUtil = IMConfigUtil.class;
       if (PatchProxy.isSupport(iMConfigUtil)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, iMConfigUtil, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == 3) {
          obj = IMConfigUtil.i.r();
          if (obj == null || obj.mEnablePhotoCardPLCShowMerchant != 1) {
             return b;
          }
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mPhotoCardPLCSupportBizTypes;
          if (obj != null && obj.contains(Integer.valueOf(p0)) == true) {
             b = true;
          }
       }
       return b;
    }
    public static final boolean k(boolean p0){
       IMConfigUtil iMConfigUtil = IMConfigUtil.class;
       if (PatchProxy.isSupport(iMConfigUtil)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, iMConfigUtil, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       iMConfigUtil = IMConfigUtil.i;
       boolean b = true;
       if (iMConfigUtil.s().enable != null) {
          if (p0) {
             if (Math.random() - iMConfigUtil.s().successSampleRate < 0) {
             label_004b :
                return b;
             }
          }else if(Math.random() - iMConfigUtil.s().failSampleRate < 0){
             goto label_004b ;
          }
       }
       b = false;
       goto label_004b ;
    }
    public static final boolean l(){
       Object obj = PatchProxy.apply(null, null, IMConfigUtil.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableCurrentRequest");
    }
    public static final CallVideoResolution m(){
       Object[] objArray = null;
       IMConfigInfo obj = PatchProxy.apply(objArray, objArray, IMConfigUtil.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          objArray = obj.mCallVideoResolution;
       }
       return objArray;
    }
    public static final long n(){
       PageLazyInitConfig chatPageLazy;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mPageLazyInitConfig;
          if (obj != null) {
             chatPageLazy = obj.chatPageLazyInitTimeout;
          label_0025 :
             return chatPageLazy;
          }
       }
       chatPageLazy = 3000;
       goto label_0025 ;
    }
    public static final Map o(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMConfigUtil iMConfigUtil = IMConfigUtil.class;
       IMConfigUtil obj = PatchProxy.apply(null, null, iMConfigUtil, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = IMConfigUtil.i;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, iMConfigUtil, "4");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = IMConfigUtil.e.getValue();
       }
       return obj1;
    }
    public static final GroupOnlineFetchConfig p(){
       Object[] objArray = null;
       IMConfigInfo obj = PatchProxy.apply(objArray, objArray, IMConfigUtil.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          objArray = obj.mGroupOnlineFetchConfig;
       }
       return objArray;
    }
    public static final int q(){
       StartupShortLinkPushConfig maxSessionRe;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mStartupShortLinkPushConfig;
          if (obj != null) {
             maxSessionRe = obj.maxSessionReport;
          label_0025 :
             return maxSessionRe;
          }
       }
       maxSessionRe = 200;
       goto label_0025 ;
    }
    public static final double t(){
       double d;
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = IMConfigUtil.i.r();
       obj = (obj != null)? obj.mRTCCallMediaVolumeRatio: 0;
       return obj;
    }
    public static final long u(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMConfigUtil iMConfigUtil = IMConfigUtil.class;
       IMConfigUtil obj = PatchProxy.apply(null, null, iMConfigUtil, "23");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = IMConfigUtil.i;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, iMConfigUtil, "6");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = IMConfigUtil.g.getValue();
       }
       long l = (obj1 != null)? obj1.longValue(): 0;
       return l;
    }
    public static final List v(){
       Object[] objArray = null;
       IMConfigInfo obj = PatchProxy.apply(objArray, objArray, IMConfigUtil.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mSupportSubBizs;
          if (obj != null) {
             if (obj.isEmpty() ^ 0x01) {
                objArray = obj;
             }
             if (objArray != null) {
             label_002a :
                return objArray;
             }
          }
       }
       objArray = IMConfigUtil.a;
       goto label_002a ;
    }
    public final IMConfigInfo r(){
       Object obj = PatchProxy.apply(null, this, IMConfigUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b();
    }
    public final IMPluginLoggerConfig s(){
       Object obj = PatchProxy.apply(null, this, IMConfigUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IMConfigUtil.d.getValue();
    }
}
