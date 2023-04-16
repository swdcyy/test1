package com.yxcorp.plugin.search.utils.k;
import java.lang.Object;
import java.lang.String;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import wkd.b;
import nf6.i;
import o56.a;
import android.content.Context;
import android.app.Activity;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nfd.l0;
import com.yxcorp.plugin.search.SearchPage;
import w7d.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.StringBuilder;
import ekd.w0;
import tkd.b;
import tkd.d;
import ju5.g;
import com.kwai.sdk.switchconfig.a;
import xh7.b;
import nfd.k0;
import qh7.b;
import qh7.a;
import com.yxcorp.plugin.search.SearchSource;
import java.util.Map;
import java.lang.Number;
import z0.a;
import uy5.b;
import oy5.h;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import androidx.fragment.app.Fragment;
import yr4.a$a;
import nfd.r3;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import ucd.i1;
import w7d.e;
import nfd.t;

public class k	// class@0007aa
{

    public void k(){
       super();
    }
    public static Intent a(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, k.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Uri uri = k.b(p0);
       if (uri == null) {
          return obj;
       }
       Intent intent = b.a(0x66dce92a).a(a.B, uri);
       if (intent != null) {
          intent.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100d4);
       }
       return intent;
    }
    public static Uri b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Uri.parse(p0);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public static boolean c(Activity p0,String p1){
       int i;
       boolean b1;
       Intent intent;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ok, "3");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (p0 != null && !TextUtils.x(p1)) {
          if (l0.c(p1)) {
             SearchPage searchPage = l0.a(p1);
             obj1 = PatchProxy.applyOneRefs(p1, obj, l0.class, "5");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else if(TextUtils.x(p1)){
                p1 = Uri.parse(p1).getQueryParameter("onceExtParams");
                if (!TextUtils.x(p1)) {
                   obj = p1;
                }
             }
             if (!PatchProxy.applyVoidThreeRefs(searchPage, p0, obj, null, i.class, "2") && searchPage != null) {
                i = p0.hashCode();
                if (TextUtils.x(obj)) {
                   RxBus.f.b(new i(searchPage, i));
                }else {
                   RxBus.f.b(new i(searchPage, i, obj));
                }
             }
             return true;
          }else {
             Object obj2 = PatchProxy.applyOneRefs(p1, obj, ok, "7");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else if(!TextUtils.x(p1) && p1.startsWith("tel://")){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                obj1 = PatchProxy.applyOneRefs(p1, obj, ok, "8");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = "";
                   if (!TextUtils.x(p1)) {
                      obj1 = p1.replace("tel://", obj1);
                   }
                }
                if (!PatchProxy.applyVoidTwoRefs(p0, obj1, obj, ok, "11") && !TextUtils.x(obj1)) {
                   intent = new Intent("android.intent.action.DIAL");
                   intent.setData(w0.f("tel:"+obj1));
                   p0.startActivity(intent);
                }
                return true;
             }else {
                Object obj3 = PatchProxy.applyOneRefs(p1, obj, ok, "9");
                if (obj3 != patchProxyRe) {
                   b2 = obj3.booleanValue();
                }else if(!TextUtils.x(p1) && p1.startsWith("ksminiapp://miniapp")){
                   b2 = true;
                }else {
                   b2 = false;
                }
                if (b2) {
                   d.a(0x6ea0c3d0).wO(p0, p1);
                   return true;
                }else if(a.t().d("searchOpenLinkByKRouter", b)){
                   b uob = b.j(p0, p1);
                   uob.m("start_exit_page_animation", R.anim.arg_RES_7f0100d4);
                   a.b(uob, new k0(p1, p0));
                   return true;
                }else {
                   intent = k.a(p1);
                   if (intent != null) {
                      p0.startActivity(intent);
                      return true;
                   }
                }
             }
          }
       }
       return b;
    }
    public static int d(Activity p0,String p1,String p2,SearchSource p3,Map p4){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, ok, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return k.e(p0, p1, p2, p3, p4, null);
    }
    public static int e(Activity p0,String p1,String p2,SearchSource p3,Map p4,a p5){
       Uri obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,p3,oobject2,p5};
          obj = PatchProxy.apply(objArray, null, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       b.c("SearchBaseExitUtil", "tryOpenKwaiLinkByNative, linkUrl:"+p1);
       if (!TextUtils.x(p1)) {
          obj = Uri.parse(p1);
          String str = h.d(obj);
          if (TextUtils.n(obj.getHost(), "search") && (!TextUtils.x(str) && oobject instanceof SingleFragmentActivity)) {
             String str1 = h.e(obj);
             String str2 = (!TextUtils.x(p2))? p2: h.f(obj);
             SearchSource searchSource = (p3 != null)? p3: SearchSource.getSearchSourceByFromPage(h.c(obj));
             Fragment uFragment = oobject.w3();
             a$a uoa = r3.d(searchSource.mSearchFrom, uFragment, oobject2);
             String str3 = h.b(obj);
             SearchKeywordContext searchKeywor = SearchKeywordContext.simpleContext(str);
             if (p5 != null) {
                searchKeywor = p5.apply(searchKeywor);
             }
             t.a(uFragment, r3.y(searchKeywor, searchSource, str2, SearchPage.ofTabType(str1), false, uoa, str3));
             return 2;
          }
       }
       return k.c(p0, p1);
    }
}
