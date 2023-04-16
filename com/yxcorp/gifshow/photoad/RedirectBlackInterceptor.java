package com.yxcorp.gifshow.photoad.RedirectBlackInterceptor;
import okhttp3.Interceptor;
import com.yxcorp.gifshow.photoad.RedirectBlackInterceptor$a;
import nsd.u;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import mxb.j;
import com.yxcorp.gifshow.photoad.AdTrackBlackUtil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.photoad.model.TrackBlackUrlInfo;
import com.yxcorp.gifshow.photoad.model.TrackBlackUrlInfo$BlackUrlItem;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import lnc.y0;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import vp.a;
import java.lang.StringBuilder;
import yx.j0;
import com.google.gson.JsonObject;
import java.lang.Number;
import o49.g;
import com.yxcorp.gifshow.entity.QPhoto;
import p49.f;
import p49.c;
import p49.c$a;
import p49.f$a;
import mxb.a1;
import p49.a;
import tw.j;
import qw.f;
import android.content.SharedPreferences;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Exception;

public final class RedirectBlackInterceptor implements Interceptor	// class@000f71
{
    public static final RedirectBlackInterceptor$a a;

    static {
       RedirectBlackInterceptor.a = new RedirectBlackInterceptor$a(null);
    }
    public void RedirectBlackInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       boolean b1;
       Response response;
       AdTrackBlackUtil uAdTrackBlac1;
       String str4;
       boolean b4;
       SharedPreferences a;
       int i2;
       object oobject;
       Object obj = this;
       Response obj1 = p0;
       j oj = j.class;
       AdTrackBlackUtil uAdTrackBlac = AdTrackBlackUtil.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Request obj2 = PatchProxy.applyOneRefs(obj1, obj, RedirectBlackInterceptor.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj1, "chain");
       obj2 = p0.request();
       obj1 = obj1.proceed(obj2);
       AdTrackBlackUtil b = AdTrackBlackUtil.b;
       if (!b.c()) {
          return obj1;
       }
       int i = obj1.code();
       if (i != 307 && i != 308) {
          switch (i){
              case 300:
              case 302:
              case 303:
              case 301:
                break;
              default:
                response = obj1;
          }
       }
       String str = obj1.header("Location");
       HttpUrl httpUrl = obj1.request().url();
       String str1 = "";
       if (str == null) {
          str = str1;
       }
       HttpUrl httpUrl1 = httpUrl.resolve(str);
       String str2 = (httpUrl1 != null)? httpUrl1.toString(): null;
       Objects.requireNonNull(b);
       String obj3 = PatchProxy.applyOneRefs(str2, b, uAdTrackBlac, "6");
       String str3 = 2;
       boolean i1 = 0;
       if (obj3 != patchProxyRe) {
          b1 = obj3.booleanValue();
       }else {
          TrackBlackUrlInfo trackBlackUr = b.b();
          TrackBlackUrlInfo$BlackUrlItem uBlackUrlIte = (trackBlackUr != null)? trackBlackUr.a(): null;
          TrackBlackUrlInfo$BlackUrlItem obj6 = PatchProxy.applyTwoRefs(uBlackUrlIte, str2, b, uAdTrackBlac, "8");
          if (obj6 != patchProxyRe) {
             b1 = obj6.booleanValue();
          }else if(uBlackUrlIte != null){
             obj6 = uBlackUrlIte.blackList;
             if (obj6 != null) {
                Iterator iterator = obj6.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      String str6 = iterator.next();
                      Boolean uBoolean = (str2 != null)? Boolean.valueOf(StringsKt__StringsKt.O2(str2, str6, i1, str3, null)): null;
                      if (y0.p(uBoolean)) {
                         b1 = true;
                      }
                   }
                }
                return response;
             }
          }
          b1 = false;
       }
       AdTrackBlackUtil b2 = AdTrackBlackUtil.b;
       boolean b3 = b2.a();
       a.o(obj2, "request");
       obj3 = (httpUrl1 != null)? httpUrl1.toString(): null;
       str3 = "3";
       if (PatchProxy.isSupport(RedirectBlackInterceptor.class)) {
          Object[] objArray = new Object[]{obj2,Integer.valueOf(i),obj3,Boolean.valueOf(b1),Boolean.valueOf(b3)};
          if (!PatchProxy.applyVoid(objArray, obj, RedirectBlackInterceptor.class, str3)) {
          label_0100 :
             j oj2 = obj2.tag(oj);
             if (oj2 != null) {
                BaseFeed uBaseFeed1 = oj2.b();
                if (uBaseFeed1 != null) {
                   PhotoAdvertisement photoAdverti1 = k.A(uBaseFeed1);
                   if (photoAdverti1 != null) {
                      String str5 = str1;
                      a.o(photoAdverti1, "CommercialFeedExt.getPhotoAd\(feed\) ?: return");
                      Object obj5 = obj2.tag();
                      response = obj1;
                      if (!obj5 instanceof Integer) {
                         obj5 = null;
                      }
                      a uoa = new a();
                      if (obj5 != null) {
                         uAdTrackBlac1 = uAdTrackBlac;
                         i2 = obj5.intValue();
                      }else {
                         uAdTrackBlac1 = uAdTrackBlac;
                         i2 = 0;
                      }
                      uoa.a(i2);
                      str4 = (obj3 != null)? obj3: str5;
                      uoa.b(str4);
                      photoAdverti1.mTrackRedirectInfo = uoa;
                      str4 = str3;
                      Object[] objArray1 = new Object[0];
                      j0.f("RedirectBlackInterceptor", "intercept redirect url, "+"creative Id is "+photoAdverti1.mCreativeId+", "+"response code is "+i+", "+"redirect url is "+obj3+','+"is black url : "+b1+"enable intercept: "+b3, objArray1);
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("origin_url", obj2.url().toString());
                      jsonObject.a0("response_code", Integer.valueOf(i));
                      jsonObject.c0("redirect_url", obj3);
                      jsonObject.a0("action_type", obj5);
                      jsonObject.H("is_black_url", Boolean.valueOf(b1));
                      jsonObject.H("enable_intercept", Boolean.valueOf(b3));
                      g.a.e(jsonObject, new QPhoto(uBaseFeed1));
                      f.a.a(c.Z.h()).h(new a1(jsonObject));
                   label_01f4 :
                      if (b3 && b1) {
                         TrackBlackUrlInfo obj4 = PatchProxy.applyOneRefs(obj2, obj, RedirectBlackInterceptor.class, "2");
                         if (obj4 != patchProxyRe) {
                            b4 = obj4.booleanValue();
                         }else {
                            j oj1 = obj2.tag(oj);
                            if (oj1 != null) {
                               BaseFeed uBaseFeed = oj1.b();
                               if (uBaseFeed != null) {
                                  PhotoAdvertisement photoAdverti = k.A(uBaseFeed);
                                  if (photoAdverti != null) {
                                     a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(feed\) ?: return false");
                                     b4 = j.e(photoAdverti, 512);
                                  }
                               }
                            }
                            b4 = false;
                         }
                         if (!b4) {
                            Objects.requireNonNull(b2);
                            obj4 = PatchProxy.apply(null, b2, uAdTrackBlac1, str4);
                            if (obj4 != patchProxyRe) {
                               i1 = obj4.booleanValue();
                            }else {
                               obj4 = b2.b();
                               obj4 = (obj4 != null)? obj4.autoJumpIntervalLimitMs: null;
                               if (obj4 <= null) {
                                  i1 = false;
                               }else {
                                  a = f.a;
                                  i1 = ((System.currentTimeMillis() - a.getLong("quick_app_auto_jump_last_time", 0)) - (long)obj4 <= 0)? true: false;
                                  if (!i1) {
                                     SharedPreferences$Editor uEditor = a.edit();
                                     uEditor.putLong("quick_app_auto_jump_last_time", System.currentTimeMillis());
                                     g.a(uEditor);
                                  }
                               }
                            }
                            if (!i1) {
                               goto label_0285 ;
                            }else {
                               throw new Exception("redirect url is in black list, Interval limit intercept");
                            }
                         }else {
                            throw new Exception("redirect url is in black list, Server intercept");
                         }
                      }else {
                         goto label_0285 ;
                      }
                   }
                }
             }
          }
       }else {
          int i3 = 1;
          goto label_0100 ;
       }
       response = obj1;
       uAdTrackBlac1 = uAdTrackBlac;
       str4 = str3;
       goto label_01f4 ;
    }
}
