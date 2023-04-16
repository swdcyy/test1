package com.kuaishou.merchant.home2.dynamic.container.a;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.x0;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.router.b;
import mx3.a;
import android.os.Bundle;
import ot3.l0;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import mx3.e;
import ik0.a;
import android.app.Activity;
import androidx.fragment.app.KwaiDialogFragment;
import nx3.a;
import java.lang.Integer;
import com.kuaishou.merchant.home2.dynamic.container.model.HalfRnContainerParams;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.home2.dynamic.container.HalfRnContainerFragment;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import au3.e;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public class a implements e	// class@001741
{

    public void a(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       int b1;
       String value;
       String str4;
       String this;
       HalfContainerParams obj4;
       KwaiRnFragment obj = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       String obj1 = PatchProxy.applyOneRefs(obj, this, uoa, str);
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (obj == null) {
          return b;
       }
       String str1 = p0.d().toString();
       if (TextUtils.x(str1)) {
          return b;
       }
       Uri uri = Uri.parse(str1);
       if (uri != null) {
          String obj2 = null;
          RouterConfig obj3 = PatchProxy.applyOneRefs(uri, obj2, uoa, "4");
          String str2 = "componentName";
          String str3 = "bundleId";
          if (obj3 != patchProxyRe) {
             b1 = obj3.booleanValue();
          }else if(!TextUtils.x(x0.a(uri, str3)) && !TextUtils.x(x0.a(uri, str2))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             obj3 = p0.c();
             HashMap hashMap = new HashMap();
             if (obj3 != null) {
                Iterator iterator = obj3.c().entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   value = uEntry.getValue();
                   if (value != null && !TextUtils.n(uEntry.getKey(), "KEY_HALF_CONTAINER_CALLBACK")) {
                      obj1 = uEntry.getKey();
                      str4 = (value instanceof String)? value.toString(): a.a.q(value);
                      hashMap.put(obj1, str4);
                   }
                   obj1 = null;
                }
             }
             obj1 = b.e();
             hashMap.put("pageId", obj1);
             a uoa1 = new a();
             Bundle uBundle = l0.j(hashMap);
             value = "3";
             LaunchModel launchModel = PatchProxy.applyTwoRefs(uri, uBundle, obj2, uoa, value);
             if (launchModel != patchProxyRe) {
             }else {
                LaunchModel$b uob = new LaunchModel$b();
                uob.f("enableBackBtnHandler", false);
                Iterator iterator1 = x0.c(uri).iterator();
                while (iterator1.hasNext()) {
                   str4 = iterator1.next();
                   obj2 = x0.a(uri, str4);
                   if (TextUtils.n(str4, "title")) {
                      uob.m(obj2);
                   }else if(TextUtils.n(str4, str3)){
                      uob.i(obj2);
                   }else if(TextUtils.n(str4, str2)){
                      uob.j(obj2);
                   }else if(TextUtils.n(str4, "autoPageShow")){
                      uob.g(Boolean.parseBoolean(obj2));
                   }else {
                      uob.e(str4, obj2);
                   }
                   obj2 = null;
                }
                launchModel = uob.h();
                launchModel.g().putAll(uBundle);
                launchModel.g().putString("containerSource", "HalfRnHandler");
             }
             obj = KwaiRnFragment.Yg(launchModel);
             obj.setCloseHandler(new e(uoa1));
             Activity uActivity = p0.a();
             this = value;
             if (PatchProxy.applyFourRefs(str1, uActivity, obj, obj1, uoa1, a.class, "1") != patchProxyRe) {
             }else {
                a uoa2 = new a();
                b1 = -1;
                if (PatchProxy.isSupport(a.class)) {
                   Object[] objArray = new Object[]{str1,uActivity,obj,uoa2,Integer.valueOf(b1),obj1};
                   if (PatchProxy.apply(objArray, uoa1, a.class, str) != patchProxyRe) {
                   }
                }
                HalfRnContainerParams halfRnContai = uoa2.b(str1);
                halfRnContai.j = b1;
                if (!PatchProxy.applyVoidTwoRefs(uActivity, halfRnContai, uoa1, a.class, this)) {
                   obj4 = halfRnContai.c;
                   HalfRnContainerParams k = halfRnContai.k;
                   float f = 0;
                   boolean b2 = (k - f > 0 && k - obj4 > 0)? true: false;
                   halfRnContai.h = b2;
                   float f1 = 0x3f800000;
                   if (obj4 - f1 >= 0) {
                      halfRnContai.b = true;
                      halfRnContai.c = f1;
                   }else if(obj4 - f < 0){
                      halfRnContai.c = f;
                   }
                   if (halfRnContai.b != null) {
                      halfRnContai.d = (float)n.j(uActivity);
                   }else {
                      HalfContainerParams c = halfRnContai.c;
                      if (c - f > 0 && c - f1 <= 0) {
                         halfRnContai.d = (float)n.j(uActivity) * obj4;
                      }
                   }
                }
             label_01e6 :
                if (PatchProxy.applyFourRefs(uActivity, obj, halfRnContai, obj1, uoa1, a.class, "4") != patchProxyRe) {
                }else {
                   obj4 = PatchProxy.applyThreeRefs(obj, halfRnContai, obj1, uoa1, a.class, "5");
                   if (obj4 != patchProxyRe) {
                   }else {
                      obj4 = PatchProxy.applyOneRefs(halfRnContai, null, HalfRnContainerFragment.class, "1");
                      if (obj4 != patchProxyRe) {
                      }else {
                         obj4 = new HalfRnContainerFragment();
                         Bundle uBundle1 = new Bundle();
                         uBundle1.putParcelable("containerParams", halfRnContai);
                         obj4.setArguments(uBundle1);
                      }
                      obj4.N = obj1;
                      if (halfRnContai.h == null) {
                         obj4.Kh((int)halfRnContai.d);
                      }
                      Object obj5 = PatchProxy.applyThreeRefs(obj4, obj, halfRnContai, uoa1, a.class, "6");
                      if (obj5 != patchProxyRe) {
                         obj4 = obj5;
                      }else {
                         obj4.Lh(new e(obj));
                         HalfContainerParams j = halfRnContai.j;
                         if (j > null) {
                            obj4.Fh(j);
                         }
                      }
                   }
                   uoa1.a = obj4;
                   obj4.Cb(uActivity.getSupportFragmentManager(), "");
                }
             }
             return true;
          }
       }
       return false;
    }
    public String getName(){
       return d.b(this);
    }
}
