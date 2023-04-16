package com.yxcorp.gifshow.freetraffic.d;
import kka.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import kka.w;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import ka0.a;
import android.content.SharedPreferences;
import ma0.d;
import android.app.Activity;
import u07.t$a;
import kka.v;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Long;
import com.yxcorp.gifshow.entity.QPhoto;
import kka.g;
import brd.t;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse$PromptInfo;
import com.yxcorp.utility.TextUtils;
import xf6.e;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDialogConfig;
import java.lang.reflect.Type;
import snc.d;
import com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam$a;
import java.util.Objects;
import java.util.Map;
import com.yxcorp.gifshow.model.FreeTrafficDialogModel;
import com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam;
import v9a.a;
import java.lang.ref.WeakReference;
import com.kwai.framework.activitycontext.ActivityContext;
import com.facebook.imagepipeline.request.ImageRequest;
import snc.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import lnc.i2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import okc.c;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse$FreeTrafficFlowUsedInfo;
import e17.i;
import android.content.SharedPreferences$Editor;
import oe6.g;
import kka.b;
import e17.i$b;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficVideoToast;
import okc.b;
import e17.i$e;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.StringBuilder;
import com.kuaishou.android.model.mix.CommonMeta;
import ma0.c;
import tl8.d;
import ok.h;
import tl8.e;
import ka0.f;
import kp.r1;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.android.model.feed.PhotoType;
import com.kuaishou.android.model.feed.VideoFeed;
import kp.l;
import wkd.b;
import tb6.b;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.freetraffic.c;
import erd.o;
import java.lang.Number;

public class d implements h	// class@00118b
{

    public void d(){
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return FreeTrafficManager.j().n();
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FreeTrafficManager.j().i();
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.F(a.a().a())) {
          return "";
       }
       return this.b();
    }
    public boolean d(GifshowActivity p0,BaseFeed p1,boolean p2,String p3,String p4){
       Object[] objArray;
       w obj;
       object oobject = p0;
       object oobject1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       int i = 4;
       int i1 = 5;
       int i2 = 0;
       if (PatchProxy.isSupport(uod)) {
          objArray = new Object[i1];
          objArray[i2] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = p3;
          objArray[i] = p4;
          obj = PatchProxy.apply(objArray, this, uod, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }else {
          int i3 = this;
       }
       obj = w.class;
       if (PatchProxy.isSupport(obj)) {
          objArray = new Object[i1];
          objArray[i2] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = p3;
          objArray[i] = p4;
          Object obj1 = PatchProxy.apply(objArray, null, obj, "1");
          if (obj1 != patchProxyRe) {
             i2 = obj1.booleanValue();
          }else if(oobject1 != null && !TextUtils.isEmpty(p4)){
             v2 = oobject1 instanceof LiveStreamFeed;
             if (patchProxyRe && (FreeTrafficManager.j().q() && (a.b() && (!a.a.getBoolean("displayed_kcard_warning_dialog", i2) && (!p0.F(p0) && (d.a(p1) && !p2)))))) {
                String str = (patchProxyRe)? p0.getString(R.string.arg_RES_7f100f83): p0.getString(R.string.arg_RES_7f100f86);
                t$a uoa = new t$a(p0);
                uoa.X0(str);
                uoa.S0(R.string.arg_RES_7f100f80);
                uoa.Q0(R.string.cancel);
                uoa.t0(new v(p0));
                uoa.z(i2);
                j.d(uoa);
                a.e(1);
                i2 = true;
             }
          }
       }else {
          goto label_0059 ;
       }
       return i2;
    }
    public void e(long p0,RequestTiming p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uod, "6")) {
          return;
       }
       FreeTrafficManager.j().x(p0, p1);
       return;
    }
    public boolean f(QPhoto p0,Activity p1){
       return g.a(this, p0, p1);
    }
    public t g(RequestTiming p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FreeTrafficManager.j().d(FreeTrafficManager.j().b(), p0);
    }
    public boolean h(boolean p0,Activity p1,BaseFeed p2){
       String obj;
       FreeTrafficDeviceInfoResponse$PromptInfo mLivePlay;
       boolean b;
       int i;
       d uod;
       FreeTrafficDialogParam uFreeTraffic3;
       b uob;
       int i2;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, d.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p1.getString(R.string.arg_RES_7f101072);
       String str = "";
       ActivityContext uActivityCon = null;
       if (d.a(p2)) {
          FreeTrafficManager e = FreeTrafficManager.j().e;
          if (e != null) {
             FreeTrafficDeviceInfoResponse mMessage = e.mMessage;
             if (mMessage != null) {
                mLivePlay = mMessage.mLivePlay;
             label_0048 :
                if (!TextUtils.x(mLivePlay)) {
                   c uoc = null;
                   b = false;
                label_0055 :
                   if (uoc) {
                      FreeTrafficManager uFreeTraffic = (p0.A(a.a().a()) || e.b())? 1: null;
                      if (uFreeTraffic && !FreeTrafficManager.j().n()) {
                         i = DateUtils.r(a.c(), System.currentTimeMillis());
                         FreeTrafficDialogConfig uFreeTraffic1 = a.a(FreeTrafficDialogConfig.class);
                         uFreeTraffic1 = (uFreeTraffic1 != null)? uFreeTraffic1.mPromotionInterval: 1;
                         i = (i >= uFreeTraffic1)? 1: 0;
                         if (i) {
                            uod = 1;
                         label_009d :
                            if (uod) {
                               uod = new d();
                               String str1 = "中国移动";
                               if (e.b()) {
                                  int i1 = e.b();
                                  if (i1 != 1) {
                                     if (i1 != 2) {
                                        if (i1 == 3) {
                                           str = "中国电信";
                                        }
                                     }else {
                                        str = "中国联通";
                                     }
                                  }else {
                                     str = str1;
                                  }
                               }else {
                                  str = p0.p(a.a().a());
                               }
                               FreeTrafficDialogParam$a uoa = new FreeTrafficDialogParam$a();
                               FreeTrafficDialogConfig uFreeTraffic2 = a.a(FreeTrafficDialogConfig.class);
                               if (uFreeTraffic2 == null || (uFreeTraffic2.mFreeTrafficDialogModelMap == null && uFreeTraffic2.mDefaultDialogConfigMap == null)) {
                                  uFreeTraffic3 = uoa.a();
                               }else {
                                  Objects.requireNonNull(str);
                                  i2 = -1;
                                  switch (str.hashCode()){
                                      case 0x24de73bc:
                                        if (str.equals("中国电信")) {
                                           i2 = 0;
                                        }
                                        break;
                                      case 0x24df0a7d:
                                        if (str.equals(str1)) {
                                           i2 = 1;
                                        }
                                        break;
                                      case 0x24e00cb6:
                                        if (str.equals("中国联通")) {
                                           i2 = 2;
                                        }
                                        break;
                                      default:
                                  }
                                  switch (i2){
                                      case 0:
                                        uoa.b(3);
                                        str = "ChinaTelecom";
                                        break;
                                      case 1:
                                        uoa.b(1);
                                        str = "ChinaMobile";
                                        break;
                                      case 2:
                                        uoa.b(2);
                                        str = "ChinaUnicom";
                                        break;
                                      default:
                                        uoa.b(5);
                                        str = "Unknown";
                                  }
                                  FreeTrafficDialogConfig mFreeTraffic1 = uFreeTraffic2.mFreeTrafficDialogModelMap;
                                  FreeTrafficDialogModel uFreeTraffic4 = (mFreeTraffic1 != null)? mFreeTraffic1.get(str): null;
                                  if (uFreeTraffic4 == null) {
                                     uFreeTraffic3 = null;
                                  }else {
                                     uoa.a = uFreeTraffic4;
                                     uoa.b = uFreeTraffic4.mCardName;
                                     uFreeTraffic3 = uoa.a();
                                  }
                               }
                               if (uFreeTraffic3 != null) {
                                  FreeTrafficDialogParam mFreeTraffic = uFreeTraffic3.mFreeTrafficMode;
                                  if (mFreeTraffic != null) {
                                     b uob1 = (mFreeTraffic != 1 && (mFreeTraffic != 2 && (mFreeTraffic != 3 && mFreeTraffic != 5)))? null: new a(uFreeTraffic3, uActivityCon);
                                     if (uob1 != null) {
                                        uod.b = uFreeTraffic3;
                                        uod.c = uob1;
                                     label_0165 :
                                        if (uob != null) {
                                           if (uob.b != null && uob.c != null) {
                                              a.d(ImageRequest.c(uob.b.mFreeTrafficDialogModel.mNewImageUrl), new c(uob, new WeakReference(ActivityContext.g().e())));
                                           }
                                           uActivityCon = 1;
                                        }
                                        if (uActivityCon) {
                                        label_0195 :
                                           uActivityCon = true;
                                        }
                                     }
                                  }
                               }
                               uob = null;
                               goto label_0165 ;
                            }
                            i2.a(mLivePlay, b);
                            goto label_0195 ;
                         }
                      }
                   label_009c :
                      uod = null;
                      goto label_009d ;
                   }else {
                      i2.a(mLivePlay, b);
                   }
                   return uActivityCon;
                }
             }
          }
          mLivePlay = str;
          goto label_0048 ;
       }
       mLivePlay = obj;
       b = true;
       i = p0;
       goto label_0055 ;
    }
    public boolean i(ClientContent$PhotoPackage p0,Activity p1){
       boolean b;
       boolean b1;
       FreeTrafficDeviceInfoResponse$PromptInfo mFreeTraffic;
       SharedPreferences a;
       Object obj = p0;
       FreeTrafficDialogConfig obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       c obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, d.class, str);
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       obj2 = c.class;
       Object obj3 = null;
       FreeTrafficManager obj4 = PatchProxy.applyTwoRefs(obj, obj1, obj3, obj2, "1");
       if (obj4 != patchProxyRe) {
          b = obj4.booleanValue();
       }else {
          obj4 = PatchProxy.apply(obj3, obj3, obj2, "2");
          if (obj4 != patchProxyRe) {
             b1 = obj4.booleanValue();
          }else {
             obj4 = PatchProxy.apply(obj3, obj3, obj2, "4");
             if (obj4 != patchProxyRe) {
                b1 = obj4.booleanValue();
             }else {
                obj4 = FreeTrafficManager.j().e;
                if (obj4 != null) {
                   FreeTrafficDeviceInfoResponse mMessage = obj4.mMessage;
                   if (mMessage != null) {
                      mFreeTraffic = mMessage.mFreeTrafficFlowUsedInfo;
                   label_0060 :
                      if (mFreeTraffic != null) {
                         a = a.a;
                         String str1 = "LastShowFlowAlertTime";
                         if (mFreeTraffic.mUpdateTime - a.getLong(str1, 0) > 0 && FreeTrafficManager.j().o()) {
                            if (!PatchProxy.applyVoidOneRefs(mFreeTraffic, obj3, obj2, str)) {
                               FreeTrafficDeviceInfoResponse$FreeTrafficFlowUsedInfo mType = mFreeTraffic.mType;
                               if (mType != 1) {
                                  if (mType != 2) {
                                     if (mType != 3) {
                                        i.d(R.style.arg_RES_7f11066a, mFreeTraffic.mText);
                                     }else {
                                        i.d(R.style.arg_RES_7f110668, mFreeTraffic.mText);
                                     }
                                  }else {
                                     i.d(R.style.arg_RES_7f110669, mFreeTraffic.mText);
                                  }
                               }else {
                                  i.d(R.style.arg_RES_7f11066a, mFreeTraffic.mText);
                               }
                            }
                            SharedPreferences$Editor uEditor = a.edit();
                            uEditor.putLong(str1, mFreeTraffic.mUpdateTime);
                            g.a(uEditor);
                            b1 = true;
                         }
                      }
                      b1 = false;
                   }
                }
                mFreeTraffic = obj3;
                goto label_0060 ;
             }
             if (!b1) {
                FreeTrafficManager obj5 = PatchProxy.apply(obj3, obj3, obj2, "3");
                if (obj5 != patchProxyRe) {
                   b1 = obj5.booleanValue();
                }else if(c.a){
                   obj5 = FreeTrafficManager.j();
                   Objects.requireNonNull(obj5);
                   obj4 = PatchProxy.apply(obj3, obj5, FreeTrafficManager.class, "15");
                   if (obj4 != patchProxyRe) {
                      b1 = obj4.booleanValue();
                   }else {
                      obj5 = obj5.h;
                      b1 = (obj5 != null && obj5.e())? true: false;
                   }
                   if (b1 && (!TextUtils.isEmpty(FreeTrafficManager.j().l()) && FreeTrafficManager.j().o())) {
                      i.d(R.style.arg_RES_7f11066a, FreeTrafficManager.j().l());
                      c.a = false;
                      b1 = true;
                   }
                }
             label_011d :
                b1 = false;
                if (!b1) {
                   b1 = false;
                }
             }
             b1 = true;
          }
          if (!b1) {
             obj1 = PatchProxy.applyTwoRefs(obj, obj1, obj3, obj2, "6");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
                b1 = 0;
             }else if(FreeTrafficManager.j().n()){
                obj1 = a.a(FreeTrafficDialogConfig.class);
                if (obj1 != null && (obj1.mFreeTrafficVideoToast != null && (DateUtils.r(a.c(), System.currentTimeMillis()) >= obj1.mPromotionInterval && FreeTrafficManager.j().o()))) {
                   obj1 = obj1.mFreeTrafficVideoToast;
                   if (obj1 != null) {
                      i$b uob = i.m();
                      uob.s(R.layout.arg_RES_7f0d029f);
                      uob.y(obj1.mMainText);
                      uob.o(5000);
                      uob.v(false);
                      uob.A(new b(obj1, obj));
                      i.z(uob);
                      a.f(System.currentTimeMillis());
                      b = true;
                   }
                }
             }
             b1 = 0;
             b = false;
             if (!b) {
                b = false;
             }
          }
          b = true;
       }
       return b;
    }
    public void j(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       if (FreeTrafficManager.j().p(FreeTrafficManager.j().h())) {
          this.k(p0);
       }
       return;
    }
    public void k(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       FreeTrafficManager.j().g(p0).observeOn(d.c).subscribe(Functions.d(), Functions.d());
       return;
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return w.c();
    }
    public String m(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FreeTrafficManager obj = PatchProxy.apply(objArray, this, d.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FreeTrafficManager.j();
       Objects.requireNonNull(obj);
       FreeTrafficManager uFreeTraffic = PatchProxy.apply(objArray, obj, FreeTrafficManager.class, "4");
       if (uFreeTraffic != patchProxyRe) {
       }else if(TextUtils.isEmpty(obj.f)){
          obj.f = obj.a.getString("free_traffic_devices_info"+obj.e(), "");
       }
       uFreeTraffic = obj.f;
       return uFreeTraffic;
    }
    public boolean n(BaseFeed p0){
       boolean b1;
       Object[] objArray;
       Object[] objArray1;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       d obj1 = PatchProxy.applyOneRefs(obj, this, d.class, str);
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = d.class;
       Object[] obj2 = null;
       Object obj3 = PatchProxy.applyOneRefs(obj, obj2, w.class, str);
       boolean b = false;
       if (obj3 != patchProxyRe) {
          b = obj3.booleanValue();
       }else if(obj == null){
          Object[] obj4 = PatchProxy.applyOneRefs(obj, obj2, obj1, str);
          if (obj4 != patchProxyRe) {
             b1 = obj4.booleanValue();
          }else if(obj instanceof LiveStreamFeed){
             b1 = false;
          }else {
             b1 = e.a(obj, CommonMeta.class, c.b);
          }
          if (b1) {
             objArray = new Object[b];
             f.C().w("FreeTraffic", "ignoreFreeTraffic, photoId:"+r1.t1(p0), objArray);
          }else if(a.t().d("freeTrafficFeedTypeLimitRollback", b) ^ 1){
             if (!r1.D3(p0) && (!r1.S2(p0) && !r1.D2(p0))) {
                objArray = new Object[b];
                f.C().w("FreeTraffic", "is not video/live/image feed, not support freeTraffic, photoId:"+r1.t1(p0)+", feedType:"+r1.S1(p0), objArray);
             }
          }else if(r1.W2(p0)){
             objArray = new Object[b];
             f.C().w("FreeTraffic", "isLocationPermissionFeed, not support freeTraffic, photoId:"+r1.t1(p0), objArray);
          }
          if (e.a(obj, VideoFeed.class, l.b)) {
             objArray = new Object[b];
             f.C().w("FreeTraffic", "isPayCourse, not support fgreeTraffic, photoId:"+r1.t1(p0), objArray);
          }else {
             String str1 = ", expectFreeTraffic";
             if (obj instanceof LiveStreamFeed) {
                String str2 = FreeTrafficManager.j().i();
                boolean b2 = FreeTrafficManager.j().o();
                if (w.c()) {
                   objArray1 = new Object[b];
                   f.C().w("FreeTraffic", "live retryFreeTraffic isChinaMobileNetwork, photoId:"+r1.t1(p0)+", isMobileNetworkConnected:"+b2+", freeTrafficType:"+str2, objArray1);
                   b = b2;
                }else {
                   b1 = FreeTrafficManager.j().q();
                   boolean b3 = FreeTrafficManager.j().n();
                   boolean b4 = d.a(p0);
                   objArray1 = new Object[b];
                   f.C().w("FreeTraffic", "live retryFreeTraffic notChinaMobileNetwork, photoId:"+r1.t1(p0)+", isMobileNetworkConnected:"+b2+", freeTrafficType:"+str2+", isSupportLive:"+b1+", isFreeTraffic:"+b3+str1+b4, objArray1);
                   if (!b1 || (!b2 || (!b3 || b4))) {
                   label_02d0 :
                      return b;
                   }
                }
             }else {
                String str3 = ", photoId:";
                if (FreeTrafficManager.j().o()) {
                   if (a.t().d("freeTrafficOptEnable", b)) {
                      str = FreeTrafficManager.j().i();
                      CommonMeta uCommonMeta = PatchProxy.applyOneRefs(obj, obj2, obj1, "4");
                      if (uCommonMeta != patchProxyRe) {
                      }else {
                         uCommonMeta = d.b(p0).mCurrentFreeTrafficType;
                      }
                      obj2 = new Object[b];
                      f.C().w("FreeTraffic", "retryOpt, currentFtt="+str+", photoFtt="+uCommonMeta+str3+r1.t1(p0), obj2);
                      b = TextUtils.equals(str, uCommonMeta) ^ 0x01;
                      goto label_02d0 ;
                   }else {
                      b1 = FreeTrafficManager.j().n();
                      boolean b5 = d.a(p0);
                      objArray = new Object[b];
                      f.C().w("FreeTraffic", "video retryNotOpt, photoId:"+r1.t1(p0)+", freeTrafficType:"+FreeTrafficManager.j().i()+", isFreeTraffic:"+b1+str1+b5, objArray);
                      if (!b1 || b5) {
                      }
                   }
                }else if(TextUtils.equals(d.c(p0), b.a(0x13545612).a())){
                   objArray = new Object[b];
                   f.C().w("FreeTraffic", "current networkType equals photo network type, network type:"+d.c(p0)+str3+r1.t1(p0), objArray);
                   goto label_02d0 ;
                }else {
                   boolean b6 = w.c();
                   obj4 = new Object[b];
                   f.C().w("FreeTraffic", "china mobile network always retry, isChinaMobileNetwork:"+b6+str3+r1.t1(p0), obj4);
                   b = b6;
                   goto label_02d0 ;
                }
             }
             b = true;
             goto label_02d0 ;
          }
       }
    }
    public String o(){
       FreeTrafficDeviceInfoResponse$PromptInfo mLivePush;
       FreeTrafficManager obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FreeTrafficManager.j().e;
       if (obj != null) {
          FreeTrafficDeviceInfoResponse mMessage = obj.mMessage;
          if (mMessage != null) {
             mLivePush = mMessage.mLivePush;
          label_0021 :
             return mLivePush;
          }
       }
       mLivePush = "";
       goto label_0021 ;
    }
    public String p(){
       Object obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FreeTrafficManager.j().e();
    }
    public List q(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FreeTrafficManager.j().k(p0);
    }
    public t r(Map p0,RequestTiming p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       FreeTrafficManager obj = PatchProxy.applyTwoRefs(p0, p1, this, uod, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FreeTrafficManager.j();
       String str = PatchProxy.applyOneRefs(p0, this, uod, "19");
       if (str != patchProxyRe) {
       }else {
          p0.put("imsi", FreeTrafficManager.j().e());
          p0.put("simInfo", FreeTrafficManager.j().k(a.a().a()));
          str = a.a.q(p0);
       }
       return obj.d(str, p1).flatMap(c.b);
    }
    public int s(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FreeTrafficManager obj = PatchProxy.apply(objArray, this, d.class, "14");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = FreeTrafficManager.j();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, FreeTrafficManager.class, "21");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          FreeTrafficDeviceInfoResponse uFreeTraffic = obj.h();
          uFreeTraffic = (uFreeTraffic != null)? uFreeTraffic.mKCardProduct: 0;
       }
       return i;
    }
}
