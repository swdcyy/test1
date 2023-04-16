package com.kuaishou.merchant.a;
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
import android.net.Uri;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import android.os.Bundle;
import java.util.Set;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import au3.f;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import ot3.l0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import rr3.h;
import erd.g;
import crd.b;
import rr3.g;
import uxc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import rr3.f;
import uxc.a;
import android.app.Activity;
import androidx.fragment.app.KwaiDialogFragment;
import bu3.a;
import java.lang.Integer;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.container.halfcontainer.BottomSheetDialogContainerFragment;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import au3.e;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public class a implements e	// class@0014c8
{

    public void a(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       HalfContainerParams obj1;
       Bundle obj2;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HalfContainerParams obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (d.a(-1103669376).M3(p0)) {
          return true;
       }
       String str = p0.d().toString();
       Uri uri = Uri.parse(str);
       MerchantYodaWebViewFragment merchantYoda = new MerchantYodaWebViewFragment();
       Bundle uBundle = new Bundle();
       Set queryParamet = uri.getQueryParameterNames();
       if (queryParamet != null) {
          Iterator iterator = queryParamet.iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             String queryParamet1 = uri.getQueryParameter(str1);
             if (queryParamet1 != null) {
                if (TextUtils.equals("false", queryParamet1) || TextUtils.equals("true", queryParamet1)) {
                   uBundle.putBoolean(str1, Boolean.parseBoolean(queryParamet1));
                }
                uBundle.putString(str1, queryParamet1);
             }
          }
       }
       uBundle.putString("KEY_URL", uBundle.getString("url"));
       String str2 = "KEY_THEME";
       if (TextUtils.isEmpty(uri.getQueryParameter(str2))) {
          uBundle.putString(str2, "0");
       }
       merchantYoda.setArguments(uBundle);
       f uof = new f();
       merchantYoda.m().subscribe(new h(l0.e("rootTag", p0.c().c())));
       merchantYoda.kh(new g(uof));
       merchantYoda.gh(new f(uof));
       Activity uActivity = p0.a();
       if (PatchProxy.applyThreeRefs(str, uActivity, merchantYoda, uof, f.class, "1") != patchProxyRe) {
       }else {
          a uoa = new a();
          int i = -1;
          if (PatchProxy.isSupport(f.class)) {
             Object[] objArray = new Object[]{str,uActivity,merchantYoda,uoa,Integer.valueOf(i)};
             if (PatchProxy.apply(objArray, uof, f.class, "3") != patchProxyRe) {
             }
          }
          obj = uoa.a(str);
          obj.j = i;
          if (!PatchProxy.applyVoidTwoRefs(uActivity, obj, uof, f.class, "4")) {
             obj1 = obj.c;
             f = 0;
             float f1 = 0x3f800000;
             if (obj1 - f1 >= 0) {
                obj.b = true;
                obj.c = f1;
             }else if(obj1 - f < 0){
                obj.c = f;
             }
             if (obj.b != null) {
                obj.d = (float)n.j(uActivity);
             }else {
                HalfContainerParams c = obj.c;
                if (c - f > 0 && c - f1 <= 0) {
                   obj.d = (float)n.j(uActivity) * obj1;
                }
             }
          }
       label_0149 :
          if (PatchProxy.applyThreeRefs(uActivity, merchantYoda, obj, uof, f.class, "5") != patchProxyRe) {
          }else {
             obj1 = PatchProxy.applyTwoRefs(merchantYoda, obj, uof, f.class, "6");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = PatchProxy.applyOneRefs(obj, null, BottomSheetDialogContainerFragment.class, "1");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = new BottomSheetDialogContainerFragment();
                   obj2 = new Bundle();
                   obj2.putParcelable("containerParams", obj);
                   obj1.setArguments(obj2);
                }
                if (obj.h == null) {
                   obj1.Kh((int)obj.d);
                }
                obj2 = PatchProxy.applyThreeRefs(obj1, merchantYoda, obj, uof, f.class, "7");
                if (obj2 != patchProxyRe) {
                   obj1 = obj2;
                }else {
                   obj1.Lh(new e(merchantYoda));
                   HalfContainerParams j = obj.j;
                   if (j > null) {
                      obj1.Fh(j);
                   }
                }
             }
             uof.a = obj1;
             obj1.Cb(uActivity.getSupportFragmentManager(), "");
          }
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
