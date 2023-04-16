package com.kuaishou.live.core.show.increasefans.j;
import java.lang.Object;
import kq3.a;
import java.lang.String;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import lnc.a1;
import com.kuaishou.live.webview.a;
import ha2.d;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueDeliveryConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import va1.s0;
import lp3.e;
import com.kuaishou.live.core.show.increasefans.i;
import com.kuaishou.live.core.show.increasefans.h;
import com.kuaishou.live.core.show.increasefans.d;
import com.kuaishou.live.core.show.increasefans.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import android.app.Activity;
import androidx.fragment.app.c;
import p91.m;
import androidx.fragment.app.KwaiDialogFragment;
import ha2.e;
import androidx.fragment.app.e;
import java.lang.Number;
import com.yxcorp.utility.n;
import java.lang.Math;

public class j	// class@000c6a
{

    public void j(){
       super();
    }
    public static Fragment a(a p0,String p1,DialogInterface$OnDismissListener p2,boolean p3){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, j.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p1)) {
          return null;
       }else {
          p0.b.setLayoutType("0").setActionBarBgColor(a1.p(R.color.arg_RES_7f06060a)).setTitleColor(a1.p(R.color.arg_RES_7f061d64));
          if (!p3) {
             p0.b.setHideLeftTopBtn(true);
          }
          a uoa = a.c();
          uoa.f(new d(p2));
          return uoa.b(p1, p0);
       }
    }
    public static String b(){
       LiveConfigStartupResponse$LiveRevenueDeliveryConfig obj = PatchProxy.apply(null, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.G(LiveConfigStartupResponse$LiveRevenueDeliveryConfig.class);
       if (obj != null) {
          return obj.mAuthorDeliverySettingUrl;
       }
       return null;
    }
    public static String c(){
       LiveConfigStartupResponse$LiveRevenueDeliveryConfig obj = PatchProxy.apply(null, null, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.G(LiveConfigStartupResponse$LiveRevenueDeliveryConfig.class);
       if (obj != null) {
          return obj.mMerchantDeliveryDetailUrl;
       }
       return null;
    }
    public static String d(String p0,int p1,String p2){
       HashMap obj;
       if (PatchProxy.isSupport(j.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, j.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return null;
       }else {
          obj = new HashMap();
          obj.put("source", String.valueOf(p1));
          obj.put("bizType", String.valueOf(1));
          if (!TextUtils.x(p2)) {
             obj.put("extraInfo", p2);
          }
          return s0.a(p0, obj);
       }
    }
    public static String e(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.d(p0, i.a, h.a, d.a, e.a).orNull();
    }
    public static KwaiDialogFragment f(Activity p0,c p1,m p2,DialogInterface$OnDismissListener p3,int p4,boolean p5,int p6){
       e obj1;
       j oj = j.class;
       Object obj = null;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Boolean.valueOf(p5),Integer.valueOf(p6)};
          obj1 = PatchProxy.apply(objArray, obj, oj, "4");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = (p2 != null)? p2.t5(): obj;
       return j.g(p0, a.d(p0, p1, obj1), j.d(j.b(), p6, obj), p1, p3, p4, p5);
    }
    public static KwaiDialogFragment g(Activity p0,a p1,String p2,c p3,DialogInterface$OnDismissListener p4,int p5,boolean p6){
       if (PatchProxy.isSupport(j.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5),Boolean.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, null, j.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p2)) {
          return null;
       }else {
          p1.b.setLayoutType("0").setActionBarBgColor(a1.p(R.color.arg_RES_7f06060a)).setTitleColor(a1.p(R.color.arg_RES_7f061d64));
          if (!p6) {
             p1.b.setHideLeftTopBtn(1);
          }
          a uoa = a.c();
          uoa.f(new e(p4));
          if (p5 > 0 && p3 != null) {
             e uoe = p3.beginTransaction();
             uoe.v(p5, uoa.b(p2, p1));
             uoe.j("INCREASE_FANS_WEB");
             uoe.m();
             return null;
          }else {
             a b = p1.b;
             p4 = PatchProxy.applyOneRefs(p0, null, j.class, "1");
             int i = (p4 != PatchProxyResult.class)? p4.intValue(): Math.max((int)((float)n.j(p0) * 0x3f19999a), a1.d(R.dimen.arg_RES_7f070797));
             b.setPortraitHeightPixel(i);
             return uoa.h(p2, p1);
          }
       }
    }
}
