package com.yxcorp.gifshow.photoad.r;
import okhttp3.OkHttpClient$Builder;
import com.yxcorp.retrofit.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import com.yxcorp.gifshow.photoad.RedirectBlackInterceptor;
import okhttp3.OkHttpClient;
import java.lang.Object;
import okhttp3.Request$Builder;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.PingRecord;
import com.kuaishou.commercial.config.StartUpAdConfig;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.reflect.Type;
import di5.a;
import com.kuaishou.commercial.config.StartUpAdConfig$IdMapping;
import h30.a;
import kp.r1;
import java.lang.Long;
import mxb.c;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import mxb.j;
import java.lang.Boolean;
import java.lang.Integer;
import qe6.b;
import ekd.a0;
import lnc.j;
import android.text.TextUtils;
import com.kuaishou.commercial.loggersdk.a;
import com.yxcorp.gifshow.photoad.IpdxHelper;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$a;
import qrd.p;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import zsd.u;
import java.lang.Iterable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import qw.f;
import tw.g;
import qx.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import java.net.URLEncoder;
import yx.j0;
import lnc.f;
import nx8.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CustomV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BusinessPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import q2b.h$b;
import z1.a;
import brd.t;
import mxb.s0;
import erd.g;
import mxb.t0;
import com.yxcorp.gifshow.photoad.p;
import com.yxcorp.gifshow.photoad.q;
import crd.b;
import ekd.k1;
import mxb.v0;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction;
import com.kuaishou.webkit.URLUtil;
import com.yxcorp.gifshow.commercial.adsdk.model.AdTrackInfo;
import ekd.j;
import com.google.common.collect.ImmutableMap;
import mxb.r0;
import okhttp3.Request;
import okhttp3.Call;
import com.yxcorp.gifshow.photoad.r$a;
import okhttp3.Callback;
import ok.n;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.Gson;
import s26.d;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import io.reactivex.internal.functions.Functions;

public final class r	// class@000fa7
{
    public static final OkHttpClient a;

    static {
       r.a = new OkHttpClient$Builder().addInterceptor(new ConvertToIOExceptionInterceptor()).addNetworkInterceptor(new RedirectBlackInterceptor()).build();
    }
    public void r(){
       super();
    }
    public static void a(Request$Builder p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "24")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          String value = uEntry.getValue();
          if (!TextUtils.x(key) && !TextUtils.x(value)) {
             p0.addHeader(key, value);
          }
       }
       return;
    }
    public static PingRecord b(BaseFeed p0){
       int i2;
       StartUpAdConfig$IdMapping mImei;
       StartUpAdConfig startUpAdCon = StartUpAdConfig.class;
       StartUpAdConfig$IdMapping idMapping = null;
       PingRecord obj = PatchProxy.applyOneRefs(p0, idMapping, r.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PingRecord();
       if (p0 == null) {
          return obj;
       }
       int i = 2;
       int i1 = 1;
       if (!TextUtils.x(SystemUtil.m(a.B))) {
          i2 = 1;
       }else {
          StartUpAdConfig startUpAdCon1 = a.a(startUpAdCon);
          if (startUpAdCon1 != null) {
             startUpAdCon1 = startUpAdCon1.mIdMapping;
             if (startUpAdCon1 != null) {
                mImei = startUpAdCon1.mImei;
             label_0039 :
                mImei = (mImei == null || !mImei.length())? 1: 0;
                if (!mImei) {
                   i2 = 2;
                }else {
                   i2 = 0;
                }
             }
          }
          mImei = idMapping;
          goto label_0039 ;
       }
       obj.mImeiSource = i2;
       if (TextUtils.x(a.d())) {
          startUpAdCon = a.a(startUpAdCon);
          if (startUpAdCon != null) {
             startUpAdCon = startUpAdCon.mIdMapping;
             if (startUpAdCon != null) {
                idMapping = startUpAdCon.mOaid;
             }
          }
          if (idMapping != null && idMapping.length()) {
             i1 = 0;
          }
          if (i1) {
             i = 0;
          }
          i1 = i;
       }
       obj.mOaidSource = i1;
       obj.mLlsid = Long.valueOf(r1.i1(p0));
       obj.mMediaAppId = "kuaishou";
       obj.mPosId = c.G(p0);
       obj.mPageId = c.x(p0);
       obj.mSubPageId = c.K(p0);
       obj.mFeedId = p0.getId();
       obj.mAuthorId = r1.U1(p0);
       return obj;
    }
    public static String c(BaseFeed p0){
       String obj = PatchProxy.applyOneRefs(p0, null, r.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "kwai-android";
       if (p0 == null) {
          return obj;
       }
       PhotoAdvertisement photoAdverti = p0.get("AD");
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null && photoAdverti.mNewUserAgentStyle == true) {
             try{
                String property = System.getProperty("http.agent");
                if (!TextUtils.x(property)) {
                   obj = property+obj+"/"+a.m;
                }
             }catch(java.lang.Exception e3){
                ExceptionHandler.handleCaughtException(e3);
             }
          }
       }
    }
    public static String d(String p0,boolean p1,int p2,j p3,int p4){
       Object[] objArray;
       String obj1;
       String str1;
       String obj2;
       String str2;
       String obj5;
       String obj6;
       String str3;
       String str4;
       c uoc1;
       BaseFeed obj7;
       String obj8;
       String str5;
       long l;
       String str6;
       Object[] objArray1;
       PhotoAdvertisement$AdData obj10;
       IpdxHelper ipdxHelper;
       String str7;
       String str8;
       String str9;
       boolean b;
       String str10;
       Object[] objArray2;
       IpdxHelper ipdxHelper1;
       String obj12;
       String str11;
       Object obj13;
       PhotoAdvertisement mTracks;
       BaseFeed uBaseFeed2;
       PhotoAdvertisement$a uoa1;
       Object obj14;
       object oobject2;
       object oobject = p0;
       boolean i = p2;
       object oobject1 = p3;
       int i1 = p4;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i2 = 4;
       int i3 = 3;
       boolean i4 = 5;
       boolean i5 = 0;
       boolean i6 = 1;
       BaseFeed obj = null;
       int i7 = 2;
       if (PatchProxy.isSupport(r.class)) {
          objArray = new Object[i4];
          objArray[i5] = oobject;
          objArray[i6] = Boolean.valueOf(p1);
          objArray[i7] = Integer.valueOf(p2);
          objArray[i3] = oobject1;
          objArray[i2] = Integer.valueOf(p4);
          obj1 = PatchProxy.apply(objArray, obj, r.class, "1");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       String str = "";
       if (PatchProxy.isSupport(r.class)) {
          str1 = str;
          i3 = 2;
          obj2 = obj;
          obj1 = PatchProxy.applyThreeRefs(Boolean.valueOf(p1), Integer.valueOf(p2), p0, null, r.class, "2");
          if (obj1 != patchProxyRe) {
          }else {
          label_006d :
             obj1 = TextUtils.k(SystemUtil.o(a.B, b.a()));
             obj12 = a0.c(obj1);
             str6 = "__MAC__";
             obj5 = "__MAC2__";
             if (!TextUtils.x(obj12)) {
                str10 = (p1)? oobject.replace(str6, obj12): oobject;
                obj12 = str10.replace(obj5, obj12);
             }else if(i != i3){
                obj12 = (p1)? oobject.replace(str6, str1): oobject;
                obj12 = obj12.replace(obj5, str1);
             }else {
                object oobject3 = oobject;
             }
             obj1 = a0.c(obj1.replace(":", str1));
             str6 = "__MAC3__";
             if (!TextUtils.x(obj1)) {
                obj1 = obj12.replace(str6, obj1);
             }else if(i != i3){
                obj1 = obj12.replace(str6, str1);
             }else {
                obj1 = obj12;
             }
          }
       }else {
          str1 = str;
          obj2 = obj;
          obj6 = 2;
          goto label_006d ;
       }
       if (PatchProxy.isSupport(r.class)) {
          IpdxHelper obj3 = PatchProxy.applyThreeRefs(Boolean.valueOf(p1), Integer.valueOf(p2), obj1, null, r.class, "3");
          if (obj3 != patchProxyRe) {
          label_0143 :
             if (PatchProxy.isSupport(r.class)) {
                PhotoAdvertisement$AdData obj4 = PatchProxy.applyTwoRefs(Integer.valueOf(p2), obj3, obj2, r.class, "4");
                if (obj4 != patchProxyRe) {
                label_018c :
                   if (PatchProxy.isSupport(r.class)) {
                      obj3 = PatchProxy.applyThreeRefs(Boolean.valueOf(p1), Integer.valueOf(p2), obj4, null, r.class, "5");
                      if (obj3 != patchProxyRe) {
                      label_01e9 :
                         str2 = "6";
                         if (PatchProxy.isSupport(r.class)) {
                            obj4 = PatchProxy.applyTwoRefs(Integer.valueOf(p2), obj3, obj2, r.class, str2);
                            if (obj4 != patchProxyRe) {
                               obj5 = obj4;
                            label_0214 :
                               if (PatchProxy.isSupport(r.class)) {
                                  obj6 = obj5;
                                  str3 = str2;
                                  obj4 = PatchProxy.applyThreeRefs(Integer.valueOf(p2), p3, obj5, null, r.class, "7");
                                  if (obj4 != patchProxyRe) {
                                     obj6 = obj4;
                                  label_0277 :
                                     str2 = "__IP__";
                                     obj5 = "AD";
                                     if (PatchProxy.isSupport(r.class)) {
                                        objArray = new Object[]{oobject,Integer.valueOf(p2),oobject1,obj6,Integer.valueOf(p4)};
                                        obj4 = PatchProxy.apply(objArray, obj2, r.class, "8");
                                        if (obj4 != patchProxyRe) {
                                           obj6 = obj5;
                                           obj2 = str2;
                                           str4 = str1;
                                           uoc1 = uoc;
                                           obj7 = obj4;
                                        label_04c6 :
                                           if (PatchProxy.isSupport(r.class)) {
                                              obj8 = PatchProxy.applyThreeRefs(Integer.valueOf(p2), p3, obj7, null, r.class, "9");
                                              if (obj8 != patchProxyRe) {
                                                 i2 = p2;
                                                 obj7 = obj8;
                                              label_052d :
                                                 str5 = str4;
                                              }else if(oobject1 != null && obj7.contains(obj2)){
                                                 BaseFeed uBaseFeed = p3.b();
                                                 obj4 = PatchProxy.applyOneRefs(uBaseFeed, null, uoc1, "5");
                                                 if (obj4 != patchProxyRe) {
                                                 }else if(uBaseFeed != null){
                                                    obj10 = uBaseFeed.get(obj6);
                                                 }else {
                                                    obj10 = null;
                                                 }
                                                 if (obj10 != null) {
                                                    PhotoAdvertisement mAdData = obj10.mAdData;
                                                    if (mAdData != null) {
                                                       obj10 = mAdData.mIpAddress;
                                                    label_0513 :
                                                       obj4 = obj10;
                                                    }
                                                 }
                                                 r or = null;
                                                 goto label_0513 ;
                                                 if (!TextUtils.x(obj4)) {
                                                    obj7 = obj7.replace(obj2, obj4);
                                                 }else {
                                                    i2 = p2;
                                                    str5 = str4;
                                                    if (i2 != 2) {
                                                       obj7 = obj7.replace(obj2, str5);
                                                    }
                                                 }
                                              }
                                              i2 = p2;
                                              goto label_052d ;
                                           }else {
                                              goto label_04e4 ;
                                           }
                                           if (PatchProxy.isSupport(r.class)) {
                                              obj8 = PatchProxy.applyThreeRefs(Integer.valueOf(p2), p3, obj7, null, r.class, "10");
                                              if (obj8 != patchProxyRe) {
                                                 l = 0;
                                              label_0612 :
                                                 obj = (oobject1 == null)? l: p3.b();
                                                 obj8 = k.a(k.c(k.b((f.a(obj8, obj)).replace("__TS__", String.valueOf(System.currentTimeMillis())))));
                                                 if (i2 != 2) {
                                                    obj8 = obj8.replaceAll("__[\\w]*?__", str5);
                                                 }
                                              }
                                           }
                                           l = 0;
                                           a obj9 = PatchProxy.applyTwoRefs(obj7, oobject1, l, r.class, "25");
                                           str = "__CONTENT__";
                                           if (obj9 != patchProxyRe) {
                                              str6 = obj9;
                                           }else if(!obj7.contains(str)){
                                              StartUpAdConfig startUpAdCon = f.a(StartUpAdConfig.class);
                                              if (startUpAdCon != null && (TextUtils.x(startUpAdCon.mEnvH5Url) || (oobject1 != null && p3.b() != null))) {
                                                 obj9 = g.a.get(p3.b().getId());
                                                 if (obj9 != null) {
                                                    List list = obj9.a(p3.b());
                                                    if (!q.f(list)) {
                                                       str6 = "";
                                                       Iterator iterator = list.iterator();
                                                       while (iterator.hasNext()) {
                                                          QPhoto qPhoto = iterator.next();
                                                          if (TextUtils.x(qPhoto.getPhotoId())) {
                                                             continue ;
                                                          }
                                                          str6 = str6+URLEncoder.encode((startUpAdCon.mEnvH5Url).replace("__PHOTOID__", qPhoto.getPhotoId()), "UTF-8")+",";
                                                       }
                                                       obj8 = str6;
                                                       if (obj8.endsWith(",")) {
                                                          obj8 = obj8.substring(0, (obj8.length() - 1));
                                                       }
                                                       str6 = obj7.replace(str, obj8);
                                                    }
                                                 }
                                              }
                                           }
                                           str6 = l;
                                           if (TextUtils.x(str6)) {
                                              if (i2 != 2) {
                                                 obj7 = obj7.replace(str, str5);
                                              }
                                           }else {
                                              obj7 = str6;
                                           }
                                           obj9 = obj7;
                                           goto label_0612 ;
                                        }
                                     }else {
                                        obj = null;
                                     }
                                     obj3 = IpdxHelper.class;
                                     if (PatchProxy.isSupport(obj3)) {
                                        ipdxHelper = obj3;
                                        str7 = obj5;
                                        str8 = str2;
                                        str4 = str1;
                                        IpdxHelper obj11 = PatchProxy.applyFourRefs(p0, obj6, p3, Integer.valueOf(p4), null, IpdxHelper.class, "9");
                                        if (obj11 != patchProxyRe) {
                                           uoc1 = uoc;
                                           str9 = obj11;
                                           obj6 = str7;
                                           obj2 = str8;
                                        }else {
                                        label_02f5 :
                                           a.p(oobject, "originUrl");
                                           a.p(obj6, "url");
                                           PhotoAdvertisement$a uoa = new PhotoAdvertisement$a();
                                           obj = (oobject1 != null)? p3.b(): obj2;
                                           obj11 = PatchProxy.applyOneRefs(obj, obj2, uoc, "74");
                                           if (obj11 != patchProxyRe) {
                                              b = obj11.booleanValue();
                                              str2 = str7;
                                           }else {
                                              str2 = str7;
                                              obj13 = (obj != null)? obj.get(str2): obj2;
                                              if (obj13 != null) {
                                                 mTracks = obj13.mAdData;
                                                 if (mTracks != null) {
                                                    b = mTracks.mShouldReplaceIpdx;
                                                 }
                                              }
                                              b = null;
                                           }
                                           if (b == null) {
                                              i6 = true;
                                              uoa.b = i6;
                                              obj11 = 1;
                                           }else {
                                              i6 = true;
                                              obj11 = null;
                                           }
                                           obj3 = IpdxHelper.j;
                                           if (!obj3.d()) {
                                              uoa.a = i6;
                                              obj11 = 1;
                                           }
                                           if (TextUtils.x(IpdxHelper.h)) {
                                              obj11 = 1;
                                           }else {
                                              uoa.c = IpdxHelper.h;
                                           }
                                           if (!TextUtils.x(IpdxHelper.h)) {
                                              str7 = str2;
                                              if ((IpdxHelper.i * (long)1000) - System.currentTimeMillis() <= 0) {
                                                 uoa.d = true;
                                                 str10 = str3;
                                                 obj11 = ipdxHelper;
                                                 objArray2 = null;
                                                 obj5 = 1;
                                              label_0382 :
                                                 List list1 = PatchProxy.apply(objArray2, obj3, obj11, str10);
                                                 if (list1 == patchProxyRe) {
                                                    list1 = IpdxHelper.g.getValue();
                                                 }
                                                 if (!list1.contains(String.valueOf(p4))) {
                                                    ipdxHelper1 = 1;
                                                 }
                                                 obj12 = null;
                                                 i7 = 2;
                                                 i4 = false;
                                                 if (!StringsKt__StringsKt.O2(obj6, "__IPDX__", i4, i7, obj12)) {
                                                    str6 = str8;
                                                    ipdxHelper1 = 1;
                                                    i5 = true;
                                                 }else {
                                                    i5 = true;
                                                    uoa.e = i5;
                                                    str6 = str8;
                                                 }
                                                 if (!StringsKt__StringsKt.O2(obj6, str6, i4, i7, obj12)) {
                                                    ipdxHelper1 = 1;
                                                 }else {
                                                    uoa.f = i5;
                                                 }
                                                 if (ipdxHelper1 == null) {
                                                    obj6 = u.g2(u.g2(obj6, "__IPDX__", "1", false, 4, null), "__IP__", IpdxHelper.h, false, 4, null);
                                                    BaseFeed uBaseFeed1 = (oobject1 != null)? p3.b(): null;
                                                    if (PatchProxy.isSupport(uoc)) {
                                                       obj2 = str6;
                                                       str11 = obj6;
                                                       obj6 = str7;
                                                       str5 = 1;
                                                       if (!PatchProxy.applyVoidThreeRefs(uBaseFeed1, Integer.valueOf(p4), p0, 0, c.class, "78")) {
                                                       label_040e :
                                                          obj13 = (uBaseFeed1 != null)? uBaseFeed1.get(obj6): null;
                                                          if (obj13 != null) {
                                                             mTracks = obj13.mTracks;
                                                             if (mTracks != null) {
                                                                Iterator iterator1 = mTracks.iterator();
                                                                while (true) {
                                                                   if (iterator1.hasNext()) {
                                                                      obj13 = iterator1.next();
                                                                      obj12 = obj13;
                                                                      obj7 = (obj12.mType == i1 && (obj12.mUrl).equals(oobject))? 1: null;
                                                                      if (!obj7) {
                                                                         continue ;
                                                                      }
                                                                   }else {
                                                                      obj13 = null;
                                                                   }
                                                                   if (obj13 != null) {
                                                                      obj13.mHasReplacedIpdx = str5;
                                                                   }
                                                                }
                                                                return obj8;
                                                             }
                                                          }
                                                       }
                                                    }else {
                                                       obj2 = str6;
                                                       str11 = obj6;
                                                       obj6 = str7;
                                                       i = true;
                                                       goto label_040e ;
                                                    }
                                                    str9 = str11;
                                                    uoc1 = uoc;
                                                 }else {
                                                    obj2 = str6;
                                                    str9 = obj6;
                                                    obj6 = str7;
                                                    obj7 = (oobject1 != null)? p3.b(): null;
                                                    if (PatchProxy.isSupport(uoc)) {
                                                       uBaseFeed2 = obj7;
                                                       uoc1 = uoc;
                                                       uoa1 = uoa;
                                                       if (!PatchProxy.applyVoidFourRefs(obj7, Integer.valueOf(p4), p0, uoa, null, c.class, "84")) {
                                                       }
                                                    }else {
                                                       uBaseFeed2 = obj7;
                                                       uoc1 = uoc;
                                                       uoa1 = uoa;
                                                    }
                                                 }
                                              }
                                           }else {
                                              str7 = str2;
                                           }
                                           ipdxHelper1 = obj11;
                                           str10 = str3;
                                           obj11 = ipdxHelper;
                                           objArray2 = null;
                                           goto label_0382 ;
                                        }
                                     }else {
                                        ipdxHelper = obj3;
                                        str7 = obj5;
                                        str8 = str2;
                                        str4 = str1;
                                        goto label_02f5 ;
                                     }
                                  label_04c4 :
                                     obj7 = str9;
                                     goto label_04c6 ;
                                  }
                               }else {
                                  obj6 = obj5;
                                  str3 = str2;
                               }
                               obj1 = "__REQUESTID__";
                               if (obj6.contains(obj1)) {
                                  str = PatchProxy.applyOneRefs(oobject1, obj2, a.class, "3");
                                  if (str != patchProxyRe) {
                                  }else if(oobject1 == null || p3.b() == null){
                                     str = str1;
                                  }else {
                                     str = r1.h1(p3.b());
                                  }
                                  if (!TextUtils.x(str)) {
                                     obj5 = obj6.replace(obj1, str);
                                  }else if(i != 2){
                                     obj5 = obj6.replace(obj1, str1);
                                  }else {
                                  label_0275 :
                                     obj5 = obj6;
                                  }
                               }else {
                                  goto label_0275 ;
                               }
                               obj6 = obj5;
                               goto label_0277 ;
                            }
                         }
                         if (i != i3) {
                            str = ((obj3.replace("__ADVERTISIINGID2__", str1)).replace("__ADVERTISIINGID3__", str1)).replace("__ADVERTISIINGID__", str1);
                         }
                         obj5 = str;
                         goto label_0214 ;
                      }
                   }
                   str = SystemUtil.d(a.B, str1);
                   str6 = "__ANDROIDID__";
                   obj5 = "__ANDROIDID3__";
                   str2 = "__ANDROIDID2__";
                   if (!TextUtils.isEmpty(str)) {
                      if (p1) {
                         obj1 = obj4.replace(str6, a0.c(str));
                      }
                      obj1 = (obj1.replace(str2, a0.c(str))).replace(obj5, a0.e(str));
                   }else if(i != i3){
                      if (p1) {
                         obj1 = obj4.replace(str6, str1);
                      }
                      obj1 = (obj1.replace(str2, str1)).replace(obj5, str1);
                   }
                   str = obj1;
                   goto label_01e9 ;
                }
             }
             obj1 = j.b();
             str6 = "__OAID1__";
             obj5 = "__OAID2__";
             str2 = "__OAID__";
             if (!TextUtils.isEmpty(obj1)) {
                obj12 = ((obj3.replace(str2, obj1)).replace(obj5, a0.c(obj1))).replace(str6, a0.c(obj1));
             }else if(i != i3){
                obj12 = ((obj3.replace(str2, str1)).replace(obj5, str1)).replace(str6, str1);
             }
             obj1 = obj12;
             goto label_018c ;
          }
       }
       obj12 = j.a();
       str6 = "__IMEI__";
       obj5 = "__IMEI3__";
       str2 = "__IMEI2__";
       if (!TextUtils.isEmpty(obj12)) {
          if (p1) {
             obj1 = obj1.replace(str6, a0.c(obj12));
          }
          obj1 = (obj1.replace(str2, a0.c(obj12))).replace(obj5, a0.e(obj12));
       }else if(i != i3){
          if (p1) {
             obj1 = obj1.replace(str6, str1);
          }
          obj1 = (obj1.replace(str2, str1)).replace(obj5, str1);
       }
       str10 = j.g();
       if (!TextUtils.x(str10)) {
          obj12 = str10;
       }
       str6 = "__IMEI4__";
       if (!TextUtils.isEmpty(obj12)) {
          obj1 = obj1.replace(str6, a0.c(obj12));
       }else if(i != i3){
          obj1 = obj1.replace(str6, str1);
       }
       obj12 = obj1;
       goto label_0143 ;
    }
    public static boolean e(PhotoAdvertisement$Track p0){
       boolean b = true;
       if (p0.mRequestType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static void f(int p0,j p1,String p2,String p3,long p4,long p5,int p6,String p7,String p8,Boolean p9){
       BaseFeed uBaseFeed1;
       i3 oi31;
       ClientEvent$ElementPackage uElementPack1;
       ClientContent$ContentPackage uContentPack;
       PhotoAdvertisement$Track obj2;
       boolean b;
       BaseFeed uBaseFeed2;
       BaseFeed uBaseFeed3;
       PhotoAdvertisement photoAdverti;
       Iterator iterator;
       Object obj3;
       String obj4;
       PhotoAdvertisement$Track mReplaceIpdx;
       int i = p0;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p7;
       object oobject4 = p8;
       object oobject5 = p9;
       r or = r.class;
       PatchProxyResult obj = null;
       int i1 = 7;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[10];
          objArray[i3] = Integer.valueOf(p0);
          objArray[i2] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = Long.valueOf(p4);
          objArray[5] = Long.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[i1] = oobject3;
          objArray[8] = oobject4;
          objArray[9] = oobject5;
          if (PatchProxy.applyVoid(objArray, obj, or, "26")) {
             return;
          }
       }
       if (oobject == null) {
          return;
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          j a = oobject.a;
          i3 oi3 = i3.f();
          oi3.c("send_timestamp", Long.valueOf(p4));
          oi3.c("result_timestamp", Long.valueOf(p5));
          oi3.d("url", oobject1);
          oi3.d("origin_url", oobject2);
          oi3.a("is_mma_request", oobject5);
          oi3.c("creative_id", Long.valueOf(p1.c()));
          oi3.c("action_type", Integer.valueOf(p0));
          oi3.c("source_type", Integer.valueOf(p1.e()));
          oi3.c("pos_id", c.G(a));
          oi3.c("page_id", c.x(a));
          oi3.c("sub_page_id", c.K(a));
          oi3.d("feed_id", a.getId());
          oi3.d("author_id", r1.U1(a));
          BaseFeed uBaseFeed = p1.b();
          c uoc = c.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.isSupport(IpdxHelper.class)) {
             obj = patchProxyRe;
             uBaseFeed1 = uBaseFeed;
             oi31 = oi3;
             uElementPack1 = uElementPack;
             ClientContent$CustomV2 obj1 = PatchProxy.applyFourRefs(oi3, uBaseFeed, Integer.valueOf(p0), p3, 0, IpdxHelper.class, "10");
             if (obj1 != obj) {
                oi3 = obj1;
             label_0246 :
                if (p6 != -1) {
                   oi3.c("return_code", Integer.valueOf(p6));
                }
                if (oobject3 != null) {
                   oi3.d("return_message", oobject3);
                }
                if (oobject4 != null) {
                   oi3.d("fail_type", oobject4);
                }
                uContentPack = new ClientContent$ContentPackage();
                String str = r1.h1(oobject.a);
                if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                   obj1 = new ClientContent$CustomV2();
                   obj1.llsid = Long.parseLong(str);
                   uElementPack1.params = oi3.e();
                   ClientContent$BusinessPackageV2 uBusinessPac = new ClientContent$BusinessPackageV2();
                   uContentPack.businessPackage = uBusinessPac;
                   uBusinessPac.custom = obj1;
                }
             }
          }else {
             obj = patchProxyRe;
             uBaseFeed1 = uBaseFeed;
             oi31 = oi3;
             uElementPack1 = uElementPack;
          }
          a.p(oi31, "builder");
          if (oobject2 != null) {
             if (PatchProxy.isSupport(uoc)) {
                obj2 = PatchProxy.applyThreeRefs(uBaseFeed1, Integer.valueOf(p0), p3, null, c.class, "79");
                if (obj2 != obj) {
                   b = obj2.booleanValue();
                   uBaseFeed2 = uBaseFeed1;
                }else {
                label_013c :
                   uBaseFeed2 = uBaseFeed1;
                   photoAdverti = (uBaseFeed2 != null)? uBaseFeed2.get("AD"): null;
                   if (photoAdverti != null) {
                      photoAdverti = photoAdverti.mTracks;
                      if (photoAdverti != null) {
                         iterator = photoAdverti.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               obj3 = iterator.next();
                               obj4 = obj3;
                               obj4 = (obj4.mType == i && (obj4.mUrl).equals(oobject2))? 1: null;
                               if (!obj4) {
                                  continue ;
                               }
                            }else {
                               obj3 = null;
                            }
                            if (obj3 != null) {
                               b = obj3.mHasReplacedIpdx;
                            }
                         }
                         ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                         urlPackage.page = 89;
                         h$b uob = h$b.e(7, "RECORD_MONITOR_REQUEST_RESULT");
                         uob.u(urlPackage);
                         uob.h(uContentPack);
                         uob.k(uElementPack1);
                         b.a(0x4b316083).J(uob);
                         return;
                      }
                   }
                   b = false;
                }
             }else {
                goto label_013c ;
             }
             oi31.a("is_ipdx", Boolean.valueOf(b));
             a.o(oi31, "returnBuilder.addPropert¡­\"is_ipdx\", isIpdxTracker\)");
             if (!b) {
                if (PatchProxy.isSupport(uoc)) {
                   uBaseFeed3 = uBaseFeed2;
                   obj2 = PatchProxy.applyThreeRefs(uBaseFeed2, Integer.valueOf(p0), p3, null, c.class, "85");
                   if (obj2 != obj) {
                   label_01e6 :
                      if (obj2 != null) {
                         oi31.a("is_ipdx_service_disabled", Boolean.valueOf(obj2.a));
                         oi31.a("is_ipdx_data_disabled", Boolean.valueOf(obj2.b));
                         oi31.a("contains_key_ipdx", Boolean.valueOf(obj2.e));
                         oi31.a("contains_key_ip", Boolean.valueOf(obj2.f));
                         a.o(oi31, "returnBuilder\n          ¡­_key_ip\", mContainsKeyIp\)");
                         String str1 = "ipdx_ip";
                         if (TextUtils.x(obj2.c)) {
                            oi31.d(str1, "");
                            a.o(oi31, "returnBuilder.addProperty\(\"ipdx_ip\", \"\"\)");
                         }else {
                            oi31.d(str1, obj2.c);
                            oi31.a("is_ipdx_expired", Boolean.valueOf(obj2.d));
                            a.o(oi31, "returnBuilder.addPropert¡­x_expired\", mIpdxExpired\)");
                         }
                      }
                   }
                }else {
                   uBaseFeed3 = uBaseFeed2;
                }
                photoAdverti = (uBaseFeed3 != null)? uBaseFeed3.get("AD"): null;
                if (photoAdverti != null) {
                   photoAdverti = photoAdverti.mTracks;
                   if (photoAdverti != null) {
                      iterator = photoAdverti.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            obj3 = iterator.next();
                            obj4 = obj3;
                            obj4 = (obj4.mType == i && (obj4.mUrl).equals(oobject2))? 1: null;
                            if (!obj4) {
                               continue ;
                            }
                         }else {
                            obj3 = null;
                         }
                         if (obj3 != null) {
                            mReplaceIpdx = obj3.mReplaceIpdxInfo;
                         label_01e5 :
                            obj2 = mReplaceIpdx;
                            goto label_01e6 ;
                         }
                      }
                   }
                }
                mReplaceIpdx = 0;
                goto label_01e5 ;
             }
          }
       label_0115 :
          oi3 = oi31;
          goto label_0246 ;
       }
    }
    public static boolean g(int p0,List p1,Map p2,a p3,j p4){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, or, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (q.f(p1)) {
          return 0;
       }else {
          t.fromIterable(p1).doOnNext(new s0(p0, p2, p3, p4)).doOnNext(new t0(p4, p0)).subscribe(p.b, q.b);
          return 1;
       }
    }
    public static void h(j p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, or, "14")) {
          return;
       }
       if (k1.g()) {
          c.a(new v0(p0, p1));
       }else {
          r.j(p0, p1);
       }
       return;
    }
    public static void i(String p0,List p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "12")) {
          return;
       }
       if (p1 != null && !p1.isEmpty()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             PhotoAdvertisement$TrackStringAction trackStringA = iterator.next();
             if (p0.equals(trackStringA.mType) && !TextUtils.isEmpty(trackStringA.mUrl)) {
                str = r.d(trackStringA.mUrl, false, 2, null, false);
                if (!URLUtil.isNetworkUrl(str) || PatchProxy.applyVoidOneRefs(str, null, r.class, "22")) {
                   continue ;
                }
             }
             r.k(false, null, str, null, null);
          }
       }
       return;
    }
    public static void j(j p0,int p1){
       r or = r.class;
       Object obj = null;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), obj, or, "15")) {
          return;
       }
       String str = "User-Agent";
       if (!q.f(p0.f())) {
          if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), obj, or, "16")) {
             List list = p0.f();
             if (list != null && !list.isEmpty()) {
                PingRecord pingRecord = r.b(p0.b());
                pingRecord.mType = p1;
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      AdTrackInfo uAdTrackInfo = iterator.next();
                      if (uAdTrackInfo.type == p1 && !j.h(uAdTrackInfo.urls)) {
                         AdTrackInfo urls = uAdTrackInfo.urls;
                         int len = urls.length;
                         int i = 0;
                         while (i < len) {
                            object oobject = urls[i];
                            String str1 = f.a(r.d(oobject, false, 2, obj, p1), p0.b());
                            if (URLUtil.isNetworkUrl(str1)) {
                               pingRecord.mUrls.add(str1);
                               r.k(p1, p0, str1, oobject, ImmutableMap.of(str, r.c(p0.b())));
                            }
                            i = i + 1;
                         }
                      }
                   }
                   r.l(p0, pingRecord);
                   break ;
                }
             }
          }
          return;
       }else {
          PingRecord pingRecord1 = r.b(p0.b());
          pingRecord1.mType = p1;
          if (r.g(p1, p0.g(), ImmutableMap.of(str, r.c(p0.b())), new r0(pingRecord1), p0)) {
             r.l(p0, pingRecord1);
          }
          return;
       }
    }
    public static void k(int p0,j p1,String p2,String p3,Map p4){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, or, "23")) {
             return;
          }
       }
       try{
          Request$Builder uBuilder = new Request$Builder().url(p2).tag(Integer.valueOf(p0)).tag(j.class, p1);
          r.a(uBuilder, p4);
          r$a uoa = new r$a(p2, p0, p1, p3, System.currentTimeMillis());
          r.a.newCall(uBuilder.build()).enqueue(uBuilder);
       }catch(java.lang.Exception e8){
          ExceptionHandler.handleCaughtException(e8);
       }
       return;
    }
    public static void l(j p0,PingRecord p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "19")) {
          return;
       }
       try{
          n.j(p0);
          n.j(p1);
          if (q.f(p1.mUrls) || a.t().d("disableAdTrackLogAndroid", false)) {
          }else {
             int i = p0.e();
             b.a(0x330163e).reportAdTrackLog(p0.c(), i, System.currentTimeMillis(), d.a().q(p1), i).subscribe(Functions.d(), Functions.d());
             return;
          }
       }catch(java.lang.Exception e10){
          Object[] objArray = new Object[v1];
          j0.d("PhotoAdTrack", e10, objArray);
       }
       return;
    }
}
