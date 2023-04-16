package com.yxcorp.gifshow.ad.AdMainProcess$b;
import nx8.l;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import tw.j;
import qy8.a;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import android.app.Activity;
import lnc.a1;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import tkd.b;
import tkd.d;
import os5.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import tw.h;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import v19.e;
import androidx.lifecycle.ViewModel;
import io.reactivex.subjects.PublishSubject;
import v19.g;
import v19.d;
import com.yxcorp.gifshow.entity.QPhoto;
import v19.f;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import ekd.x0;
import kotlin.text.Regex;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import vs3.a;
import android.content.Intent;
import mxb.c;
import v19.b;
import v19.a;
import mxb.o;
import brd.y;
import wkd.b;
import nf6.i;
import android.content.Context;

public final class AdMainProcess$b implements l	// class@0014cc
{
    public final AdMainProcess a;

    public void AdMainProcess$b(AdMainProcess p0){
       this.a = p0;
       super();
    }
    public int a(){
       int i;
       boolean b;
       String str5;
       PhotoAdvertisement$JumpLiveInfo obj6;
       Object[] objArray1;
       boolean b1;
       String url;
       c a1;
       PhotoAdvertisement$AdData mWebViewType;
       BaseFeed photo1;
       PhotoAdvertisement$JumpLiveInfo liveStreamIn;
       int i3;
       AdDataWrapper obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       AdMainProcess obj1 = PatchProxy.apply(objArray, obj, AdMainProcess$b.class, str);
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       AdMainProcess$b a = obj.a;
       Objects.requireNonNull(a);
       obj1 = AdMainProcess.class;
       AdProcess uAdProcess = AdProcess.class;
       AdProcessUtils uAdProcessUt = AdProcessUtils.class;
       String str1 = "4";
       AdDataWrapper obj2 = PatchProxy.apply(objArray, a, obj1, str1);
       String str2 = null;
       if (obj2 != patchProxyRe) {
          i = obj2.intValue();
       }else {
          obj2 = a.d();
          if (!PatchProxy.applyVoidOneRefs(obj2, a, obj1, "5") && j.b(obj2.getPhoto())) {
             BaseFeed photo2 = obj2.getPhoto();
             if (photo2 != null) {
                a.o(photo2, "it");
                new a(photo2).a();
             }
          }
          Activity obj3 = PatchProxy.apply(objArray, a, uAdProcess, str1);
          String str3 = "AdProcess";
          if (obj3 != patchProxyRe) {
             b = obj3.booleanValue();
          }else if(!a1.i(a.h)){
             objArray1 = new Object[str2];
             j0.c(str3, "cannot process adData,activity is not available", objArray1);
             b = false;
          }else {
             b = true;
          }
          if (!b) {
             a.n();
          }else {
             obj3 = a.c();
             AdDataWrapper uAdDataWrapp = a.d();
             AdProcess obj4 = PatchProxy.applyTwoRefs(obj3, uAdDataWrapp, objArray, uAdProcessUt, str);
             String str4 = "adDataWrapper";
             if (obj4 != patchProxyRe) {
                b = obj4.booleanValue();
             }else {
                a.p(obj3, "activity");
                a.p(uAdDataWrapp, str4);
                PhotoAdvertisement$JumpLiveInfo liveStreamIn1 = uAdDataWrapp.getLiveStreamInfo();
                if (liveStreamIn1 != null) {
                   a.o(liveStreamIn1, "adDataWrapper.liveStreamInfo ?: return false");
                   liveStreamIn = uAdDataWrapp.getLiveStreamInfo();
                   if (liveStreamIn != null && liveStreamIn.mToLiveType == null) {
                      liveStreamIn = liveStreamIn1.mLiveStreamIds;
                      i = (liveStreamIn == null || !liveStreamIn.length())? 1: 0;
                      try{
                         if (!i) {
                            AdProcessUtils a3 = AdProcessUtils.a;
                            a3.b(uAdDataWrapp);
                            b uob = d.a(-1835681758);
                            LiveSlidePlayEnterParam$b uob1 = new LiveSlidePlayEnterParam$b();
                            Object obj9 = PatchProxy.applyOneRefs(uAdDataWrapp, a3, uAdProcessUt, str1);
                            if (obj9 != patchProxyRe) {
                               i3 = obj9.intValue();
                            }else if(!h.a(uAdDataWrapp.getPhoto())){
                               i3 = 39;
                            }else {
                               i3 = 12;
                            }
                            uob1.n(i3);
                            uob1.q(liveStreamIn1.mLiveStreamIds);
                            uob1.o(a3.f(uAdDataWrapp));
                            uob.b1(obj3, uob1.a());
                            b = true;
                         }
                      }catch(java.lang.Exception e0){
                         Object[] objArray5 = new Object[0];
                         j0.c("AdProcessUtils", "tryOpenLiveSquare:"+e0.getMessage(), objArray5);
                      }
                   }
                }
             }
             if (b) {
                b = AdProcessUtils.g(a.d());
             }else {
                obj3 = a.c();
                obj = a.d();
                str = "6";
                String obj5 = PatchProxy.applyTwoRefs(obj3, obj, null, uAdProcessUt, str);
                if (obj5 != patchProxyRe) {
                   b = obj5.booleanValue();
                   str5 = str3;
                }else {
                   a.p(obj3, "activity");
                   a.p(obj, str4);
                   liveStreamIn = obj.getLiveStreamInfo();
                   if (liveStreamIn != null) {
                      a.o(liveStreamIn, "adDataWrapper.liveStreamInfo ?:return false");
                      obj6 = obj.getLiveStreamInfo();
                      if (obj6 != null && obj6.mToLiveType == 1) {
                         obj6 = liveStreamIn.mLiveStreamIds;
                         str2 = (obj6 == null || !obj6.length())? 1: null;
                         if (!str2) {
                            AdProcessUtils a2 = AdProcessUtils.a;
                            liveStreamIn = liveStreamIn.mLiveStreamIds;
                            a.o(liveStreamIn, "liveInfo.mLiveStreamIds");
                            Objects.requireNonNull(a2);
                            String str7 = PatchProxy.applyOneRefs(liveStreamIn, a2, uAdProcessUt, "7");
                            if (str7 != patchProxyRe) {
                            }else {
                               a.p(liveStreamIn, "liveStreamIds");
                               if (TextUtils.isEmpty(liveStreamIn)) {
                                  str7 = "";
                               }else {
                                  int i2 = StringsKt__StringsKt.i3(liveStreamIn, ",", 0, false, 6, null);
                                  str5 = str3;
                                  if (i2 > 0) {
                                     obj5 = liveStreamIn.substring(0, i2);
                                     a.o(obj5, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                                  }
                                  str7 = obj5;
                               label_01d4 :
                                  LiveAudienceParam$a uoa = (str7 == null || !str7.length())? 1: null;
                                  if (uoa) {
                                  label_0205 :
                                     b = false;
                                  }else {
                                     a2.b(obj);
                                     uoa = new LiveAudienceParam$a();
                                     uoa.i(str7);
                                     uoa.g(a2.f(obj));
                                     LiveAudienceParam liveAudience = uoa.a();
                                     a.o(liveAudience, "liveAudienceParam");
                                     AdProcessUtils.n(obj3, liveAudience);
                                     b = true;
                                  }
                               }
                            }
                            str5 = str3;
                            goto label_01d4 ;
                         }
                      }
                   }
                   str5 = str3;
                   goto label_0205 ;
                }
                if (b) {
                   b = AdProcessUtils.g(a.d());
                }else {
                   obj5 = null;
                   String str6 = 3;
                   if (AdProcessUtils.p(a.c(), a.d(), obj5, 4, obj5)) {
                      i = 3;
                   }else {
                      obj3 = a.c();
                      obj2 = a.d();
                      obj6 = PatchProxy.applyTwoRefs(obj3, obj2, obj5, uAdProcessUt, "8");
                      i = 6;
                      if (obj6 != patchProxyRe) {
                         b = obj6.booleanValue();
                      }else {
                         a.p(obj3, "activity");
                         a.p(obj2, str4);
                         str2 = (obj2.getConversionType() == i)? 1: null;
                         photo1 = obj2.getPhoto();
                         if (str2 && photo1 != null) {
                            if (!obj3 instanceof FragmentActivity) {
                               obj3 = null;
                            }
                            if (obj3 != null) {
                               ViewModelProviders.of(obj3).get(e.class).o0().onNext(new d(new QPhoto(photo1), false, false));
                            }
                            b = true;
                         }else {
                            b = false;
                         }
                      }
                      if (b) {
                         i = 1;
                      }else {
                         obj3 = a.c();
                         obj2 = a.d();
                         obj6 = PatchProxy.applyTwoRefs(obj3, obj2, null, uAdProcessUt, "9");
                         if (obj6 != patchProxyRe) {
                            b = obj6.booleanValue();
                         }else {
                            a.p(obj3, "activity");
                            a.p(obj2, str4);
                            b1 = (obj2.getConversionType() == 7)? 1: 0;
                            photo1 = obj2.getPhoto();
                            if (b1 && photo1 != null) {
                               if (!obj3 instanceof FragmentActivity) {
                                  obj3 = null;
                               }
                               if (obj3 != null) {
                                  ViewModelProviders.of(obj3).get(f.class).o0().onNext(new QPhoto(photo1));
                               }
                            }
                         label_02d5 :
                            b = b1;
                         }
                         if (b) {
                            i = 2;
                         }else if(TextUtils.isEmpty(a.d().getUrl())){
                            objArray1 = new Object[0];
                            j0.c("AdMainProcess", "cannot process adData, deep link fail and has no url", objArray1);
                            a.n();
                         }else {
                            AdDataWrapper uAdDataWrapp1 = a.d();
                            String obj7 = PatchProxy.applyOneRefs(uAdDataWrapp1, null, uAdProcessUt, "16");
                            if (obj7 != patchProxyRe) {
                               b = obj7.booleanValue();
                            }else {
                               a.p(uAdDataWrapp1, str4);
                               obj7 = uAdDataWrapp1.getUrl();
                               boolean b2 = URLUtil.isNetworkUrl(obj7);
                               if (uAdDataWrapp1.getDisplayType() == i) {
                                  if (!b2) {
                                     Object[] objArray3 = new Object[0];
                                     j0.l("AdProcessUtils", "cannot download apk, when url is not NetworkUrl, url:"+obj7, objArray3);
                                  label_0337 :
                                     if (j.B(uAdDataWrapp1.getConversionType())) {
                                        if (!b2) {
                                           Object[] objArray4 = new Object[0];
                                           j0.c("AdProcessUtils", "cannot download apk, when url is not NetworkUrl, url: "+obj7, objArray4);
                                        }
                                     }
                                     Uri uri = x0.f(obj7);
                                     if (uri != null) {
                                        String scheme = uri.getScheme();
                                        if (scheme == null || !new Regex("downloads?").matches(scheme)) {
                                        }
                                     }else {
                                     }
                                  }
                               }else {
                                  goto label_0337 ;
                               }
                               b = true;
                            }
                            if (b) {
                               i = a.C();
                            }else if(URLUtil.isNetworkUrl(a.d().getUrl())){
                               if (!PatchProxy.applyVoid(null, a, uAdProcess, "5")) {
                                  AdProcess i1 = a.i;
                                  obj4 = PatchProxy.applyOneRefs(i1, null, j.class, "13");
                                  if (obj4 != patchProxyRe) {
                                     b1 = obj4.booleanValue();
                                  }else {
                                     a.p(i1, str4);
                                     BaseFeed photo = i1.getPhoto();
                                     if (photo != null) {
                                        a.o(photo, "adDataWrapper.photo ?: return false");
                                        PhotoAdvertisement photoAdverti = photo.get("AD");
                                        if (photoAdverti != null) {
                                           photoAdverti = photoAdverti.mAdData;
                                           if (photoAdverti != null) {
                                              b = (i1 instanceof PhotoAdDataWrapper)? i1.getWebViewType(): photoAdverti.mWebViewType;
                                              if (b == 1) {
                                                 b1 = true;
                                              }
                                           }
                                        }
                                     }
                                     b1 = false;
                                  }
                                  if (b1) {
                                     a.h.startActivity(d.a(0x7074b578).SL(a.h, a.i.getUrl(), null, ""));
                                  }else {
                                     i1 = a.i;
                                     v2 = i1 instanceof PhotoAdDataWrapper;
                                     str4 = "mAdDataWrapper.url";
                                     if (patchProxyRe && c.V(i1.getPhoto())) {
                                        i1 = a.h;
                                        Objects.requireNonNull(i1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                        obj4 = a.i;
                                        url = obj4.getUrl();
                                        a.o(url, str4);
                                        ViewModelProviders.of(i1).get(b.class).o0().onNext(new a(obj4, url));
                                     }else if(patchProxyRe && (j.F(new QPhoto(a.i.getPhoto())) || c.b(a.i.getPhoto()))){
                                        a1 = o.a;
                                        if (a1 != null) {
                                           a1.onNext(a.i);
                                        }
                                     }
                                     String url1 = a.i.getUrl();
                                     a.o(url1, str4);
                                     AdProcessUtils.h(a.h, url1, a.i, true);
                                  }
                               }
                               if (a.d().getConversionType() == str6) {
                                  i = 14;
                               }else {
                                  i = 13;
                               }
                            }else {
                               Intent obj8 = PatchProxy.apply(null, a, uAdProcess, str);
                               if (obj8 != patchProxyRe) {
                                  b = obj8.intValue();
                               }else {
                                  obj8 = b.a(0x66dce92a).c(a.h, x0.f(a.i.getUrl()), true, true);
                                  if (obj8 != null) {
                                     a.h.startActivity(obj8);
                                     b = a.i();
                                  }else if(AdProcessUtils.i(a.h, a.i.getUrl(), a.i)){
                                     b = a.i();
                                  }else {
                                     Object[] objArray2 = new Object[0];
                                     j0.c(str5, "cannot process adData, cannot parse any intent from url. url: "+a.i.getUrl(), objArray2);
                                     a.n();
                                  }
                               }
                               i = b;
                            }
                         }
                      }
                   }
                }
             }
             i = b ^ 0x01;
          }
          i = 0;
       }
       return i;
    }
    public void b(AdMainProcess p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMainProcess$b.class, "2")) {
          return;
       }
       a.p(p0, "process");
       return;
    }
    public void c(){
    }
}
