package com.kuaishou.merchant.c;
import vs3.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Bundle;
import java.util.Map;
import com.kuaishou.merchant.api.router.FragmentConfig;
import us3.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ab4.f;
import rr3.m;
import z1.a;
import com.kuaishou.merchant.router.RouterConfig;
import rr3.q;
import rr3.o;
import rr3.r;
import android.app.Activity;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.basic.util.f;
import ct3.a;
import androidx.fragment.app.c;
import z1.k;
import ot3.c;
import java.lang.Boolean;
import p74.a;
import com.kwai.framework.model.feed.BaseFeed;
import android.net.Uri;
import ekd.x0;
import xkd.b;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import com.kuaishou.webkit.URLUtil;
import com.yxcorp.gifshow.webview.c;
import ekd.w0;
import com.kwai.framework.init.a;
import com.kuaishou.merchant.router.redirect.MerchantRedirectInitModule;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ot3.t;
import com.kuaishou.merchant.router.annotation.RouteType;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import n04.a;
import q87.c;
import java.lang.Throwable;
import rr3.l;
import rr3.p;
import rr3.n;
import com.kuaishou.merchant.basic.MerchantYodaTranslucentWebViewActivity;
import cn4.a;
import com.yxcorp.utility.SystemUtil;
import e17.i;
import wkd.b;
import nf6.i;
import us3.f;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.merchant.container.rnhalf.MerchantHalfRnFragmentWrapper;
import com.kuaishou.merchant.container.rnhalf.MerchantHalfRnFragmentWrapper$b;
import java.lang.StringBuilder;
import java.util.UUID;
import java.util.Objects;
import zt3.e;
import zt3.j;
import androidx.fragment.app.e;
import com.kuaishou.merchant.basic.model.MerchantTrilateralUrlWhiteListModel;
import com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewActivity$a;
import com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewActivity;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import us3.c;
import rr3.j;
import android.content.DialogInterface$OnDismissListener;
import rr3.k;
import android.content.DialogInterface$OnShowListener;

public class c implements a	// class@00162b
{

    public void c(){
       super();
    }
    public i Ew(Context p0,String p1,Bundle p2,Map p3,FragmentConfig p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       i oi = f.a.e(new m(p2)).i(new q(p3)).h(new o(p4)).e(p0, p1);
       r.a(oi, p1);
       return oi;
    }
    public void Gn(Activity p0,String p1,LiveMerchantBaseContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "16")) {
          return;
       }
       f.l(p0, p1, p2);
       return;
    }
    public boolean I30(Activity p0){
       return p0 instanceof a;
    }
    public c LD(c p0,k p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a(p0, p1);
    }
    public void LK(Activity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "7")) {
          return;
       }
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, f.class, "5")) {
          f.i(p0, null, p1, null, p2);
       }
       return;
    }
    public void RP(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       if (b.f(x0.f(p1))) {
          f.j(p0, p1);
       }
       return;
    }
    public Intent SL(Activity p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantYodaWebViewActivity.G3(p0, p1).k(p2).e("KEY_BIZ_ID", p3).a();
    }
    public boolean TW(Activity p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (URLUtil.isNetworkUrl(p1)) {
          c.i(p0, this.SL(p0, p1, null, ""));
          return true;
       }else {
          obj = f.class;
          Object obj1 = PatchProxy.applyTwoRefs(p0, p1, null, obj, "20");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             Uri uri = w0.f(p1);
             if (uri == null) {
                b = false;
             }else {
                Object obj2 = PatchProxy.applyTwoRefs(p0, uri, null, obj, "21");
                b = (obj2 != patchProxyRe)? obj2.booleanValue(): f.n(p0, uri, false);
             }
          }
          return b;
       }
    }
    public a UI(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantRedirectInitModule();
    }
    public i X00(Fragment p0,int p1,String p2,String p3,boolean p4){
       Object[] objArray;
       f obj;
       Bundle uBundle;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 5;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[i4];
          objArray[0] = p0;
          objArray[i3] = Integer.valueOf(p1);
          objArray[i2] = p2;
          objArray[i1] = p3;
          objArray[i] = Boolean.valueOf(p4);
          obj = PatchProxy.apply(objArray, this, uoc, "13");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = f.class;
       Object obj1 = null;
       if (PatchProxy.isSupport(obj)) {
          objArray = new Object[i4];
          objArray[0] = p0;
          objArray[i3] = Integer.valueOf(p1);
          objArray[i2] = p2;
          objArray[i1] = p3;
          objArray[i] = Boolean.valueOf(p4);
          Object obj2 = PatchProxy.apply(objArray, obj1, obj, "27");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else if(p0 != null && (p0.isAdded() && (p0.getActivity() == null || TextUtils.x(p2)))){
             Object[] objArray1 = new Object[0];
             a.C().A("JumpUriUtils", "jumpToH5InFragment params error", objArray1);
             uBundle = new Bundle();
             uBundle.putString("KEY_URL", p2);
             uBundle.putString("KEY_THEME", "4");
             new MerchantYodaWebViewFragment().setArguments(uBundle);
             RouteType fRAGMENT = RouteType.FRAGMENT;
          }else {
             RouterConfig routerConfig = f.a.f(new t(p1, p0, p3));
             i oi1 = (p4)? routerConfig.f(p0.getActivity(), p2): routerConfig.e(p0.getActivity(), p2);
             if (oi1 != null && (!oi1.c() || oi1.b() != RouteType.FRAGMENT)) {
                MerchantYodaWebViewFragment merchantYoda = new MerchantYodaWebViewFragment();
                uBundle = new Bundle();
                uBundle.putString("KEY_URL", p2);
                uBundle.putString("KEY_THEME", "4");
                merchantYoda.setArguments(uBundle);
                i oi = new i(merchantYoda, RouteType.FRAGMENT, -1);
             }else {
                obj1 = oi1;
             }
          }
       }else {
          goto label_0059 ;
       }
       return obj1;
    }
    public void XZ(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       f.e(p0, p1);
       return;
    }
    public i Yr(Context p0,String p1,Bundle p2,Map p3,FragmentConfig p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uoc, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       i oi = f.a.e(new l(p2)).i(new p(p3)).h(new n(p4)).f(p0, p1);
       r.a(oi, p1);
       return oi;
    }
    public boolean Yv(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a(p0);
    }
    public void ZB(Intent p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "20")) {
          return;
       }
       p0.setClass(p1, MerchantYodaTranslucentWebViewActivity.class);
       p1.startActivity(p0);
       return;
    }
    public void a30(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "8")) {
          return;
       }
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "28") || (p0 != null && !TextUtils.x(p1))) {
          if (p1.startsWith(a.d) && !SystemUtil.M(p0, a.f)) {
             i.a(R.style.arg_RES_7f11066a, 0x7f103cee);
          }else {
             Intent intent = b.a(0x66dce92a).c(p0, w0.f(p1), false, true);
             if (intent != null) {
                p0.startActivity(intent);
                if (!p1.startsWith(a.e) && (!p1.startsWith(a.c) && !p1.startsWith(a.d))) {
                   p0.finish();
                }
             }
          }
       }
       return;
    }
    public KwaiDialogFragment aV(FragmentActivity p0,String p1,Map p2,f p3){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.class;
       if (PatchProxy.isSupport(obj)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,null};
          obj1 = PatchProxy.apply(objArray, this, obj, "19");
          if (obj1 != patchProxyRe) {
          }else {
          label_003a :
             obj1 = PatchProxy.applyThreeRefs(p1, p2, p3, null, MerchantHalfRnFragmentWrapper.class, "2");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = new MerchantHalfRnFragmentWrapper();
                MerchantHalfRnFragmentWrapper e = obj1.E;
                e.a = p1;
                e.b = p2;
                String str = PatchProxy.apply(null, null, MerchantHalfRnFragmentWrapper.class, "20");
                if (str != patchProxyRe) {
                }else {
                   str = "callbackId-"+UUID.randomUUID().toString();
                }
                e.c = str;
                str.d = p3;
             }
             c supportFragm = p0.getSupportFragmentManager();
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoidTwoRefs(supportFragm, p1, obj1, MerchantHalfRnFragmentWrapper.class, "4")) {
                obj1.Cb(supportFragm, p1);
                j.c(supportFragm, obj1);
             }
          }
       }else {
          goto label_003a ;
       }
       return obj1;
    }
    public void eg(c p0,int p1,Fragment p2,String p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, c.class, "14")) {
          return;
       }
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, f.class, "25")) {
          if (p0 == null) {
             Object[] objArray = new Object[0];
             a.C().A("JumpUriUtils", "jumpToNativeInFragment params error", objArray);
          }else {
             e uoe = p0.beginTransaction();
             uoe.z(R.anim.arg_RES_7f010109, 0x7f01004c, R.anim.arg_RES_7f01004a, 0x7f010112);
             uoe.v(p1, p2);
             uoe.j(p3);
             uoe.l();
          }
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public KwaiDialogFragment nl(FragmentActivity p0,String p1,Map p2){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyFourRefs(p0, p1, p2, null, this, c.class, "18");
       if (obj != patchProxyRe) {
       }else {
          obj = c.class;
          if (PatchProxy.isSupport(obj)) {
             Object[] objArray = new Object[]{p0,p1,p2,null,null};
             obj1 = PatchProxy.apply(objArray, this, obj, "19");
             if (obj1 != patchProxyRe) {
             }
          }
          obj1 = PatchProxy.applyThreeRefs(p1, p2, null, null, MerchantHalfRnFragmentWrapper.class, "2");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new MerchantHalfRnFragmentWrapper();
             MerchantHalfRnFragmentWrapper e = obj1.E;
             e.a = p1;
             e.b = p2;
             String str = PatchProxy.apply(null, null, MerchantHalfRnFragmentWrapper.class, "20");
             if (str != patchProxyRe) {
             }else {
                str = "callbackId-"+UUID.randomUUID().toString();
             }
             e.c = str;
             str.d = null;
          }
          c supportFragm = p0.getSupportFragmentManager();
          Objects.requireNonNull(obj1);
          if (!PatchProxy.applyVoidTwoRefs(supportFragm, p1, obj1, MerchantHalfRnFragmentWrapper.class, "4")) {
             obj1.Cb(supportFragm, p1);
             j.c(supportFragm, obj1);
          }
       }
       return obj;
    }
    public void p60(Activity p0,String p1,boolean p2,MerchantTrilateralUrlWhiteListModel p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, c.class, "15")) {
          return;
       }
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, f.class, "3")) {
          if (p0 == null) {
             Object[] objArray = new Object[0];
             a.C().A("JumpUriUtils", "jumpTo3rdWebViewActivity\(\), activity is null", objArray);
          }else {
             MerchantTrilateralYodaWebViewActivity$a uoa = new MerchantTrilateralYodaWebViewActivity$a(p0, MerchantTrilateralYodaWebViewActivity.class, p1);
             uoa.j = p2;
             uoa.k = p3;
             c.i(p0, uoa.a());
          }
       }
       return;
    }
    public void rj(Activity p0,String p1,LiveStreamFeed p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "4")) {
          return;
       }
       f.f(p0, p1, p2);
       return;
    }
    public KwaiDialogFragment xJ(FragmentActivity p0,String p1,Map p2,f p3,c p4){
       MerchantHalfRnFragmentWrapper obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uoc, "19");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = PatchProxy.applyThreeRefs(p1, p2, p3, null, MerchantHalfRnFragmentWrapper.class, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = new MerchantHalfRnFragmentWrapper();
          MerchantHalfRnFragmentWrapper e = obj.E;
          e.a = p1;
          e.b = p2;
          String str = PatchProxy.apply(null, null, MerchantHalfRnFragmentWrapper.class, "20");
          if (str != patchProxyRe) {
          }else {
             str = "callbackId-"+UUID.randomUUID().toString();
          }
          e.c = str;
          str.d = p3;
       }
       if (p4 != null) {
          obj.k0(new j(p4));
          obj.ph(new k(p4));
       }
       c supportFragm = p0.getSupportFragmentManager();
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidTwoRefs(supportFragm, p1, obj, MerchantHalfRnFragmentWrapper.class, "4")) {
          obj.Cb(supportFragm, p1);
          j.c(supportFragm, obj);
       }
       return obj;
    }
}
