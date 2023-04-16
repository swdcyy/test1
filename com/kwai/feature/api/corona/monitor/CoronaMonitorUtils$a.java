package com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.util.Map;
import wl5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils;
import qrd.p;
import java.lang.Throwable;
import java.lang.CharSequence;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.a;
import android.util.Log;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import com.kwai.feature.api.corona.monitor.model.CoronaMonitorModel$a;
import com.kwai.feature.api.corona.monitor.model.CoronaMonitorModel;
import vl5.a$b;
import q87.c;
import java.lang.Iterable;
import wl5.a$a;
import com.yxcorp.utility.TextUtils;
import java.lang.Double;
import ekd.k1;
import java.util.Objects;
import k2b.u1;
import java.lang.Long;
import java.lang.Integer;
import k2b.e0;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$ElementKey;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zb6.a;
import wzc.a;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;

public final class CoronaMonitorUtils$a	// class@000e1a
{

    public void CoronaMonitorUtils$a(){
       super();
    }
    public void CoronaMonitorUtils$a(u p0){
       super();
    }
    public static void d(CoronaMonitorUtils$a p0,String p1,String p2,String p3,String p4,Object p5,Map p6,boolean p7,int p8,Object p9){
       String str = (p8 & 0x04)? "": p3;
       String str1 = (p8 & 0x08)? "": p4;
       boolean b = (p8 & 0x40)? false: p7;
       p0.c(p1, p2, str, str1, p5, p6, b);
       return;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, CoronaMonitorUtils$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoronaMonitorUtils.a.getValue();
    }
    public final void b(String p0,String p1,Throwable p2,Map p3){
       int i = p0;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CoronaMonitorUtils$a.class, "7")) {
          return;
       }
       String str = (!i || !p0.length())? 1: null;
       if (str) {
          return;
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          a.m(p0);
          linkedHashMa.put("className", p0);
          String str1 = (p1 != null)? p1: "";
          linkedHashMa.put("methodName", str1);
          str1 = Log.getStackTraceString(p2);
          a.o(str1, "Log.getStackTraceString\(throwable\)");
          linkedHashMa.put("exceptionStr", str1);
          Set set = (p3 == null || p3.isEmpty())? 1: null;
          if (!set && p3 != null) {
             Iterator iterator = p3.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                CharSequence key = uEntry.getKey();
                key = (key == null || !key.length())? 1: null;
                if (!key) {
                   key = uEntry.getValue();
                   Object obj = (key == null || !key.length())? 1: null;
                   if (!obj) {
                      obj = uEntry.getKey();
                      String uEntry1 = uEntry.getValue();
                      if (uEntry1 == null) {
                         uEntry1 = "";
                      }
                      linkedHashMa.put(obj, uEntry1);
                   }
                }
             }
          }
          CoronaMonitorUtils$a.d(this, "contextException", null, null, null, null, linkedHashMa, false, 64, null);
          return;
       }
    }
    public final void c(String p0,String p1,String p2,String p3,Object p4,Map p5,boolean p6){
       String eventId;
       Object[] objArray2;
       String biz;
       String obj1;
       boolean b;
       Object obj2;
       a$a obj3;
       a$a mEventKey;
       boolean b1;
       Double uDouble;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 1;
       if (PatchProxy.isSupport(CoronaMonitorUtils$a.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, CoronaMonitorUtils$a.class, "9")) {
             return;
          }
       }
       a.p(oobject, "eventId");
       CoronaMonitorModel$a uoa = new CoronaMonitorModel$a();
       uoa.e = oobject;
       uoa.a = oobject1;
       uoa.b = oobject2;
       uoa.f = this.f(oobject4);
       uoa.d = oobject5;
       uoa.c = oobject3;
       Object[] objArray1 = null;
       CoronaMonitorModel uCoronaMonit = PatchProxy.apply(objArray1, uoa, CoronaMonitorModel$a.class, "1");
       if (uCoronaMonit != patchProxyRe) {
       }else {
          uCoronaMonit = new CoronaMonitorModel(uoa, objArray1);
       }
       Object obj = uCoronaMonit;
       Boolean uBoolean = Boolean.valueOf(p6);
       if (!PatchProxy.applyVoidThreeRefs(p4, obj, uBoolean, this, CoronaMonitorUtils$a.class, "13") && obj != null) {
          CoronaMonitorUtils$a c = CoronaMonitorUtils.c;
          obj.setCommon(c.f(oobject4));
          String str = obj.toString();
          eventId = obj.getEventId();
          a uoa1 = (eventId == null || !eventId.length())? 1: null;
          if (!uoa1) {
             objArray2 = new Object[0];
             a$b.a.w(obj.getEventId(), str, objArray2);
          }
          if (c.a().mEnableLogReport != null) {
             if (!a.g(uBoolean, Boolean.TRUE)) {
                eventId = obj.getEventId();
                biz = obj.getBiz();
                obj1 = PatchProxy.applyTwoRefs(eventId, biz, c, CoronaMonitorUtils$a.class, "4");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   a mSubRatioCon1 = c.a().mSubRatioConfig;
                   if (mSubRatioCon1 != null) {
                      Iterator iterator1 = mSubRatioCon1.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            objArray2 = iterator1.next();
                            obj2 = objArray2;
                            if (TextUtils.n(obj2.mEventId, eventId)) {
                               obj3 = obj2.mBiz;
                               obj3 = (obj3 == null || !obj3.length())? 1: null;
                               if (obj3 || (obj2.mBiz).equals(biz)) {
                                  b1 = true;
                               label_010f :
                                  if (!b1) {
                                     continue ;
                                  }
                               }
                            }
                            b1 = false;
                            goto label_010f ;
                         }else {
                            objArray2 = objArray1;
                         }
                         if (objArray2 != null) {
                            uDouble = Double.valueOf(objArray2.mRatio);
                         label_011f :
                            double d = (uDouble != null)? uDouble.doubleValue(): CoronaMonitorUtils.c.a().mDefaultLogRatio;
                            if (d - (double)0 < 0 || d - (double)i > 0) {
                               b = false;
                            }else {
                               b = k1.l((float)d);
                            }
                         }
                      }
                   }
                   uDouble = objArray1;
                   goto label_011f ;
                }
                if (!b) {
                label_01bf :
                   return;
                }
             }
             c = CoronaMonitorUtils.c;
             eventId = obj.getEventId();
             biz = obj.getBiz();
             Objects.requireNonNull(c);
             obj1 = PatchProxy.applyTwoRefs(eventId, biz, c, CoronaMonitorUtils$a.class, "3");
             if (obj1 != patchProxyRe) {
             }else {
                a mSubRatioCon = c.a().mSubRatioConfig;
                if (mSubRatioCon != null) {
                   Iterator iterator = mSubRatioCon.iterator();
                   while (iterator.hasNext()) {
                      obj2 = iterator.next();
                      obj3 = obj2;
                      if (TextUtils.n(obj3.mEventId, eventId)) {
                         a$a mBiz = obj3.mBiz;
                         mBiz = (mBiz == null || !mBiz.length())? 1: null;
                         if (mBiz || (obj3.mBiz).equals(biz)) {
                            obj3 = 1;
                         label_0197 :
                            if (obj3) {
                               objArray1 = obj2;
                            }else {
                               continue ;
                            }
                         }
                      }
                      obj3 = null;
                      goto label_0197 ;
                   }
                   if (objArray1 != null) {
                      mEventKey = objArray1.mEventKey;
                      if (mEventKey != null) {
                      label_01a9 :
                         if (mEventKey != null && mEventKey.length()) {
                            i = 0;
                         }
                         if (i) {
                            obj1 = "CORONA_MONITOR_EVENT_OFFLINE";
                         }else {
                            a$a uoa2 = mEventKey;
                         }
                      }
                   }
                }
             label_01a3 :
                mEventKey = c.a().mDefaultCustomKey;
                goto label_01a9 ;
             }
             u1.R(obj1, str, 28);
             goto label_01bf ;
          }else {
             goto label_01bf ;
          }
       }else {
          goto label_01bf ;
       }
    }
    public final void e(String p0,boolean p1,long p2,long p3,int p4,String p5,int p6,Map p7){
       Iterator iterator;
       CoronaMonitorUtils$a uoa = CoronaMonitorUtils$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, this, uoa, "8")) {
             return;
          }
       }
       a.p(p0, "pluginName");
       a.p(p5, "tag");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       linkedHashMa.put("isPluginInstalled", String.valueOf(p1));
       linkedHashMa.put("totalCost", String.valueOf((p3 - p2)));
       linkedHashMa.put("className", p5);
       linkedHashMa.put("pluginName", p0);
       linkedHashMa.put("pluginInstallType", String.valueOf(p4));
       linkedHashMa.put("pluginDownloadPriority", String.valueOf(p6));
       if (p7 != null) {
          iterator = p7.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             linkedHashMa.put(key, uEntry.getValue());
          }
       }
       if (p4 != -1) {
          if (p4) {
             iterator = (p4 != 1)? "": "success";
          }else {
             iterator = "failure";
          }
       }else {
          iterator = "loading";
       }
       CoronaMonitorUtils$a.d(this, "LOAD_PLUGIN", "CORONA_PAGE", null, iterator, null, linkedHashMa, false, 64, null);
       return;
    }
    public final Map f(Object p0){
       String keyType1;
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaMonitorUtils$a uoa = CoronaMonitorUtils$a.class;
       LinkedHashMap obj = PatchProxy.applyOneRefs(p0, this, uoa, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new LinkedHashMap();
       e0 uoe0 = (!p0 instanceof e0)? null: p0;
       String str = "";
       if (uoe0) {
          String keyType = CoronaMonitorUtils$ElementKey.OWNER_PAGE_TYPE.getKeyType();
          String str1 = uoe0.o();
          if (str1 == null) {
             str1 = str;
          }
          obj.put(keyType, str1);
          keyType = CoronaMonitorUtils$ElementKey.SCENE_TYPE.getKeyType();
          str1 = uoe0.P7();
          if (str1 == null) {
             str1 = str;
          }
          obj.put(keyType, str1);
          keyType = CoronaMonitorUtils$ElementKey.LOG_PAGE_PARAMS.getKeyType();
          str1 = uoe0.getPageParams();
          if (str1 == null) {
             str1 = str;
          }
          obj.put(keyType, str1);
          keyType = CoronaMonitorUtils$ElementKey.LOG_EXTRA_NAME.getKeyType();
          String str2 = uoe0.h5();
          if (str2 == null) {
             str2 = str;
          }
          obj.put(keyType, str2);
       }
       BaseFragment uBaseFragmen = (!p0 instanceof BaseFragment)? null: p0;
       if (uBaseFragmen) {
          obj.put(CoronaMonitorUtils$ElementKey.FRAGMENT_IS_SELECT.getKeyType(), String.valueOf(uBaseFragmen.K0()));
          obj.put(CoronaMonitorUtils$ElementKey.FRAGMENT_IS_REUMED.getKeyType(), String.valueOf(uBaseFragmen.isResumed()));
          keyType1 = CoronaMonitorUtils$ElementKey.KEY_TOP_VISIBLE.getKeyType();
          boolean b = (uBaseFragmen.K0() && uBaseFragmen.isResumed())? true: false;
          obj.put(keyType1, String.valueOf(b));
          FragmentActivity activity = uBaseFragmen.getActivity();
          if (activity != null) {
             iterator = CoronaMonitorUtils.c.f(activity).entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                key = uEntry.getKey();
                keyType1 = uEntry.getValue();
                if (keyType1 == null) {
                   keyType1 = str;
                }
                obj.put(key, keyType1);
             }
          }
       }
       GifshowActivity gifshowActiv = (!p0 instanceof GifshowActivity)? null: p0;
       if (gifshowActiv) {
          keyType1 = CoronaMonitorUtils$ElementKey.ACTIVITY_PAGE_PATH.getKeyType();
          key = gifshowActiv.Q2();
          if (key == null) {
             key = str;
          }
          obj.put(keyType1, key);
          obj.put(CoronaMonitorUtils$ElementKey.ACTIVITY_FINISHING.getKeyType(), String.valueOf(gifshowActiv.isFinishing()));
       }
       PresenterV2 presenterV2 = (!p0 instanceof PresenterV2)? null: p0;
       if (presenterV2) {
          iterator = CoronaMonitorUtils.c.f(presenterV2.getActivity()).entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             Object key1 = uEntry.getKey();
             keyType1 = uEntry.getValue();
             if (keyType1 == null) {
                keyType1 = str;
             }
             obj.put(key1, keyType1);
          }
       }
       if (!p0 instanceof Throwable) {
          p0 = null;
       }
       if (p0 != null) {
          obj.put(CoronaMonitorUtils$ElementKey.KEY_ERROR_CODE.getKeyType(), String.valueOf(a.b(p0)));
          str = a.i(p0);
          a.o(str, "ApiTools.toString\(it\)");
          obj.put(CoronaMonitorUtils$ElementKey.KEY_ERROR_MSG.getKeyType(), str);
          p0 = a.f(p0);
          a.o(p0, "ApiTools.getUrl\(it\)");
          obj.put(CoronaMonitorUtils$ElementKey.KEY_ERROR_URL.getKeyType(), p0);
       }
       obj.put(CoronaMonitorUtils$ElementKey.KEY_LOW_DEVICE.getKeyType(), String.valueOf(a.a()));
       p0 = CoronaMonitorUtils$ElementKey.KEY_LOW_DEVICE_COMMON_LEVEL.getKeyType();
       Number number = PatchProxy.apply(null, this, uoa, "2");
       if (number == patchProxyRe) {
          number = CoronaMonitorUtils.b.getValue();
       }
       obj.put(p0, Integer.valueOf(number.intValue()));
       p0 = new LinkedHashMap();
       Iterator iterator1 = obj.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          CharSequence key2 = uEntry1.getKey();
          int i = (key2 == null || !key2.length())? 1: 0;
          i = i ^ 1;
          if (i) {
             p0.put(uEntry1.getKey(), uEntry1.getValue());
          }
       }
       return p0;
    }
    public final void g(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaMonitorUtils$a.class, "16")) {
          return;
       }
       a.p(p0, "photo");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       linkedHashMa.put("type", "hit");
       String photoId = p0.getPhotoId();
       a.o(photoId, "photo.photoId");
       linkedHashMa.put("photoId", photoId);
       linkedHashMa.put("photoIndex", String.valueOf(p0.getPosition()));
       this.c("RATE", "TV_STATION", "tvTabPlayerPreloadHitRate", null, null, linkedHashMa, true);
       return;
    }
}
