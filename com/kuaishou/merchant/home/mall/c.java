package com.kuaishou.merchant.home.mall.c;
import zr6.e;
import yw3.f;
import com.google.gson.JsonElement;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.home.mall.HomeMallLogBiz;
import p74.a;
import o74.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import android.app.Activity;
import yw3.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import yr3.b;
import yw3.g;
import erd.g;
import crd.b;
import com.kuaishou.merchant.home.mall.HomeMallProxyFragment;
import com.kuaishou.merchant.home.mall.b;
import com.kuaishou.merchant.home.mall.HomeMallBaseProxyFragment;
import brd.t;
import lnc.b9;
import wq6.h;
import wq6.d;
import fr6.a;
import fr6.e;
import java.util.HashMap;
import yr3.e;
import yr3.a;
import yr3.f;
import android.content.SharedPreferences$Editor;
import oe6.g;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.l;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import rn5.a;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import yw3.h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import sn5.g;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import zq6.p;
import as6.a;

public class c extends e	// class@0016dc
{
    public b e;
    public b f;
    public b g;
    public final e h;

    public void c(){
       super();
       this.h = new f(this);
    }
    public static void o(c p0,JsonElement p1){
       String str1;
       Objects.requireNonNull(p0);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p1, p0, uoc, "6")) {
       }else {
          String str = "HomeMallTabLifecycleAwareness";
          if (p1 == null || !p1.E()) {
             a.g(HomeMallLogBiz.Mall, str, "invalid global data");
          }else {
             p1 = p1.r().e0("bottomTabBubbleText");
             Object[] objArray = null;
             if (p1 != null) {
                try{
                   str1 = p1.w();
                label_0035 :
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   Object obj = PatchProxy.applyOneRefs(str1, p0, e0, "7");
                   boolean b = false;
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(!TextUtils.x(str1) && p0.b() instanceof Activity){
                      Object obj1 = PatchProxy.apply(objArray, p0, e0, "8");
                      boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.a.getBoolean(b.d("user")+"merchant_mall_bottom_tab_bubble_has_shown", b);
                      if (!b1) {
                         b = true;
                      }
                   }
                   if (b) {
                      p0.s(str1);
                   }
                }catch(java.lang.Exception e0){
                   a.g(HomeMallLogBiz.Mall, str, "parse global data error");
                }
                str1 = objArray;
                goto label_0035 ;
             }else {
                goto label_0034 ;
             }
          }
       }
       return;
    }
    public void f(Fragment p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "5")) {
          String str = "HomeMallTabLifecycleAwareness";
          if (p0 instanceof b) {
             a.d(HomeMallLogBiz.Mall, str, "observeGlobalData");
             this.f = p0.Lf(new g(this));
          }else if(p0 instanceof HomeMallProxyFragment){
             a.d(HomeMallLogBiz.Mall, str, "observeRealFragmentCreated");
             b uob = new b(this);
             Objects.requireNonNull(p0);
             b uob1 = PatchProxy.applyOneRefs(uob, p0, HomeMallBaseProxyFragment.class, "8");
             if (uob1 != PatchProxyResult.class) {
             }else {
                uob1 = p0.k.subscribe(uob);
             }
             this.g = uob1;
          }
       }
       return;
    }
    public void g(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       b9.a(this.e);
       b9.a(this.f);
       b9.a(this.g);
       return;
    }
    public void h(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.r(true);
          p0.b0().a(this.h);
       }
       return;
    }
    public void i(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          p0.b0().d(this.h);
       }
       return;
    }
    public final void p(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       e uoe = f.r(e.class);
       if (uoe != null) {
          p0.put("payInfo", uoe.dZ());
       }
       return;
    }
    public final SharedPreferences q(){
       Object obj = PatchProxy.apply(null, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b("DefaultPreferenceHelper");
    }
    public final void r(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "15")) {
          return;
       }
       g.b(this.q().edit().putBoolean("key_is_need_pre_request", p0));
       return;
    }
    public final void s(String p0){
       Object[] obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "10")) {
          return;
       }
       d uod = c.a(this.b());
       if (uod != null && uod.d() != null) {
          h oh = uod.d().f(b.l);
          if (oh == null) {
             return;
          }else if(!this.b() instanceof Activity){
             return;
          }else {
             Activity uActivity = this.b();
             if (uActivity.isFinishing()) {
                return;
             }else {
                p k = a.k;
                a$c uoc1 = PatchProxy.applyTwoRefs(uActivity, p0, this, uoc, "12");
                if (uoc1 != patchProxyRe) {
                }else {
                   uoc1 = new a$c(uActivity);
                   uoc1.F0(p0);
                   uoc1.C0(a1.e(9.00f));
                   uoc1.T(3000);
                   uoc1.M(new h(this));
                }
                if (PatchProxy.isSupport(g.class)) {
                   obj = PatchProxy.applyThreeRefs(uoc1, "BottomMe", Integer.valueOf(0x272a), null, g.class, "1");
                   if (obj != patchProxyRe) {
                   }else {
                   label_008f :
                      object oobject = null;
                      if (PatchProxy.isSupport(g.class)) {
                         obj = new Object[]{uoc1,oobject,Boolean.FALSE,"BottomMe",Integer.valueOf(0x272a)};
                         obj = PatchProxy.apply(obj, oobject, g.class, "2");
                         if (obj != patchProxyRe) {
                         }
                      }
                      g og = new g(1, uoc1, ImmutableMap.of("value", TextUtils.I(oobject)), 0);
                      og.f = "BottomMe";
                      og.g = 0x272a;
                      obj = og;
                   }
                }else {
                   goto label_008f ;
                }
                a.b(oh, k, obj);
             }
          }
       }
       return;
    }
}
