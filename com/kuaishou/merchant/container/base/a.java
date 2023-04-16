package com.kuaishou.merchant.container.base.a;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ma4.e;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.StringBuilder;
import android.net.Uri;
import p74.a;
import o74.a;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.HashMap;
import java.util.Map;
import us3.c;
import nv3.a;
import zt3.k;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.router.b;
import ekd.x0;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import ot3.l0;
import us3.f;
import com.kuaishou.merchant.container.base.MerchantKrnDialogFragment;
import com.kuaishou.merchant.container.base.MerchantKrnDialogFragment$a;
import java.util.UUID;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LaunchModel$b;
import us3.d;
import ym5.a;
import zt3.b;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import zt3.a;
import zt3.c;
import android.content.DialogInterface$OnShowListener;
import lnc.l1;
import com.kwai.sdk.switchconfig.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import zt3.i;
import zt3.f;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import ap3.k;
import java.lang.Runnable;
import erd.a;
import crd.b;

public class a implements e	// class@00162e
{

    public void a(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       String str;
       c uoc;
       a uoa1;
       k ok;
       String value;
       a uoa2;
       PatchProxyResult patchProxyRe1;
       String str3;
       Activity uActivity2;
       String str4;
       MerchantKrnDialogFragment$a c;
       LaunchModel launchModel;
       boolean b4;
       Object[] obj = this;
       f obj1 = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i obj2 = PatchProxy.applyOneRefs(obj1, obj, uoa, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       boolean b = false;
       if (obj1 == null) {
          return b;
       }
       boolean b1 = true;
       if (d.a(-1103669376).M3(obj1)) {
          a.s(MerchantCommonLogBiz.ROUTER, "BaseMerchantKrnDialogHandler", "µØ¥∞π‹øÿ¿πΩÿ¥¶¿Ì:"+p0.d());
          return b1;
       }else {
          RouterConfig routerConfig = p0.c();
          HashMap hashMap = new HashMap();
          Object[] objArray = null;
          if (routerConfig != null) {
             Map map = routerConfig.c();
             str = "KEY_HALF_CONTAINER_CALLBACK";
             uoc = (map.containsKey(str) && map.get(str) instanceof c)? map.get(str): objArray;
             String str1 = "MERCHANT_COVER_CALLBACK";
             uoa1 = (map.containsKey(str1) && map.get(str1) instanceof a)? map.get(str1): objArray;
             String str2 = "resultCallback";
             ok = (map.containsKey(str2) && map.get(str2) instanceof k)? map.get(str2): objArray;
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                value = uEntry.getValue();
                if (value != null && !TextUtils.n(uEntry.getKey(), str)) {
                   String key = uEntry.getKey();
                   value = (value instanceof String)? value.toString(): a.a.q(value);
                   hashMap.put(key, value);
                }
             }
          }else {
             uoc = objArray;
             uoa1 = uoc;
             ok = uoa1;
          }
          hashMap.put("pageId", b.e());
          Uri uri = p0.d();
          if (!TextUtils.n("rndialog", uri.getHost())) {
             str = "dialogStyle";
             if (TextUtils.x(x0.a(uri, str)) && !hashMap.containsKey(str)) {
                hashMap.put(str, String.valueOf(b1));
             }
          }
          obj.d(hashMap, obj1);
          str = p0.d().toString();
          Activity uActivity = p0.a();
          Bundle uBundle = l0.j(hashMap);
          obj1 = p0.b();
          int i = uActivity.getRequestedOrientation();
          Activity uActivity1 = uActivity;
          MerchantKrnDialogFragment merchantKrnD = PatchProxy.applyThreeRefs(str, uBundle, obj1, null, MerchantKrnDialogFragment.class, "1");
          value = "2";
          if (merchantKrnD != patchProxyRe) {
             uoa2 = uoa;
             patchProxyRe1 = patchProxyRe;
             str3 = str;
          }else {
             merchantKrnD = new MerchantKrnDialogFragment();
             MerchantKrnDialogFragment q = merchantKrnD.q;
             q.a = str;
             String str5 = PatchProxy.apply(objArray, objArray, MerchantKrnDialogFragment.class, "23");
             if (str5 != patchProxyRe) {
             }else {
                str5 = "callbackId-"+UUID.randomUUID().toString();
             }
             q.b = str5;
             MerchantKrnDialogFragment q1 = merchantKrnD.q;
             q1.c = obj1;
             Uri uri1 = Uri.parse(str);
             MerchantKrnDialogFragment q2 = merchantKrnD.q;
             c = q2.c;
             MerchantKrnDialogFragment$a b3 = q2.b;
             if (PatchProxy.isSupport(MerchantKrnDialogFragment.class)) {
                objArray = new Object[]{uri1,uBundle,c,b3,merchantKrnD};
                str3 = str;
                obj = null;
                launchModel = PatchProxy.apply(objArray, obj, MerchantKrnDialogFragment.class, value);
                if (launchModel != patchProxyRe) {
                   uoa2 = uoa;
                   patchProxyRe1 = patchProxyRe;
                }else {
                label_01c8 :
                   LaunchModel$b obj4 = PatchProxy.applyOneRefs(uri1, obj, MerchantKrnDialogFragment.class, "3");
                   String str6 = "bundleId";
                   if (obj4 != patchProxyRe) {
                      b4 = obj4.booleanValue();
                   }else if(TextUtils.x(x0.a(uri1, str6)) || TextUtils.x(x0.a(uri1, "componentName"))){
                      b4 = false;
                   }else {
                      b4 = true;
                   }
                   if (!b4) {
                      uoa2 = uoa;
                      patchProxyRe1 = patchProxyRe;
                      launchModel = null;
                   }else {
                      obj4 = new LaunchModel$b();
                      patchProxyRe1 = patchProxyRe;
                      uoa2 = uoa;
                      obj4.f("enableBackBtnHandler", false);
                      Iterator iterator1 = x0.c(uri1).iterator();
                      while (iterator1.hasNext()) {
                         str4 = iterator1.next();
                         Iterator iterator2 = iterator1;
                         String str7 = x0.a(uri1, str4);
                         Uri uri2 = uri1;
                         if (TextUtils.n(str4, "title")) {
                            obj4.m(str7);
                         }else if(TextUtils.n(str4, str6)){
                            obj4.i(str7);
                         }else if(TextUtils.n(str4, "componentName")){
                            obj4.j(str7);
                         }else if(TextUtils.n(str4, "autoPageShow")){
                            obj4.g(Boolean.parseBoolean(str7));
                         }else {
                            obj4.e(str4, str7);
                         }
                         iterator1 = iterator2;
                         uri1 = uri2;
                      }
                      if (c != null) {
                         obj4.e("callbackId", b3);
                         b.a(b3, merchantKrnD);
                      }
                      launchModel = obj4.h();
                      launchModel.g().putAll(uBundle);
                      launchModel.g().putString("containerSource", "MerchantKrnDialogFragment");
                   }
                }
             }else {
                obj = objArray;
                str3 = str;
                goto label_01c8 ;
             }
             q1.d = launchModel;
          }
          obj = merchantKrnD;
          if (uoc != null || uoa1 != null) {
             uActivity2 = uActivity1;
             obj.k0(new a(uoc, uActivity2, i, uoa1));
             obj.ph(new c(uoc, uoa1));
          }else if(d.a(0x4c5dd1b8).f2()){
             uActivity2 = uActivity1;
             obj.k0(new b(uActivity2, i));
          }else {
             uActivity2 = uActivity1;
          }
          if (ok != null) {
             ok.a(obj);
          }
          c obj3 = PatchProxy.applyOneRefs(uri, this, uoa2, value);
          if (obj3 != patchProxyRe1) {
             b = obj3.booleanValue();
          }else if(l1.a()){
             str4 = x0.a(uri, "isForcePortrait");
             boolean b2 = (TextUtils.x(str4))? a.t().d("MERCHANT_HALF_CONTAINER_IS_FORCE_PORTRAIT", false): Boolean.parseBoolean(str4);
             b = b2;
          }else {
             b = false;
          }
          if (b) {
             obj3 = uActivity2.getSupportFragmentManager();
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidThreeRefs(uActivity2, obj3, str3, obj, MerchantKrnDialogFragment.class, "6")) {
                obj2 = new i(obj, obj3, str3);
                if (!PatchProxy.isSupport(f.class) || (PatchProxy.applyVoidThreeRefs(uActivity2, obj2, Long.valueOf(200), null, f.class, "2") || (!uActivity2.isFinishing() && !uActivity2.isDestroyed()))) {
                   if (l1.a()) {
                      uActivity2.setRequestedOrientation(1);
                      t.timer(200, TimeUnit.MILLISECONDS).observeOn(d.a).compose(uActivity2.E2(ActivityEvent.DESTROY)).doOnComplete(new k(obj2)).subscribe();
                   }else {
                      obj2.run();
                   }
                }
             }
          }else {
             obj.Cb(uActivity2.getSupportFragmentManager(), str3);
          }
          return true;
       }
    }
    public void d(Map p0,RouterRequest p1){
    }
    public String getName(){
       return d.b(this);
    }
}
