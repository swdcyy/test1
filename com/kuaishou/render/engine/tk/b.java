package com.kuaishou.render.engine.tk.b;
import hu4.h;
import androidx.fragment.app.FragmentActivity;
import hu4.n;
import java.util.HashMap;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nv.c;
import com.kuaishou.render.engine.tk.view.TKWrapView;
import android.content.Context;
import yu4.f;
import yu4.g;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import sx4.e$a;
import com.kuaishou.tachikoma.api.container.TKContainer;
import mv.d;
import java.util.Map;
import mv.a;
import mv.f;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import yu4.d;
import yu4.e;
import tx4.o;
import sx4.e;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.yxcorp.utility.SystemUtil;
import android.content.SharedPreferences;
import vid.b;
import java.lang.StringBuilder;
import com.kuaishou.render.engine.tk.MerchantTkContainer$a;
import bx4.h;
import com.kuaishou.render.engine.tk.b$a;
import tx4.s;
import android.app.Activity;
import com.kuaishou.render.engine.tk.MerchantTkContainer;
import iu4.c;
import tx4.l;
import iu4.a;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.render.engine.tk.a;
import pv.b;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.render.engine.tk.TKContainerManager$1;
import bv4.a;
import yu4.b;
import android.view.View;
import tx4.h;
import pv.a;
import java.lang.reflect.Type;
import yz7.e;
import hu4.c;
import com.yxcorp.utility.TextUtils;
import hu4.a;
import hu4.d;
import com.kwaishou.merchant.troubleshooting.core.util.LogParams;
import com.google.gson.Gson;

public class b extends h	// class@000ef6
{
    public long s;
    public MerchantTkContainer t;
    public String u;
    public String v;
    public TKViewContainerWrapView$a w;
    public boolean x;
    public Map y;

    public void b(FragmentActivity p0,n p1){
       super(p0, p1);
       this.s = 0x3a98;
       this.y = new HashMap();
    }
    public ViewGroup d(){
       boolean b;
       ViewGroup viewGroup = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       String str = "9";
       h obj = PatchProxy.apply(objArray, viewGroup, uob, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (viewGroup.t == null) {
          c.b("tkContainer is null");
          return objArray;
       }else {
          int i = 2;
          int i1 = 1;
          if (viewGroup.w != null) {
             c.f("use async method");
             obj = PatchProxy.apply(objArray, viewGroup, uob, "11");
             if (obj != patchProxyRe) {
             }else {
                TKWrapView tKWrapView = new TKWrapView(viewGroup.a, viewGroup.v, viewGroup.u);
                f uof = new f(viewGroup);
                Object[] objArray1 = new Object[i];
                objArray1[0] = this.c();
                objArray1[i1] = this.f();
                TKWrapView tKWrapView1 = tKWrapView;
                f uof1 = uof;
                f uof2 = uof;
                TKWrapView tKWrapView2 = tKWrapView;
                TKViewContainerWrapView tKViewContai = viewGroup.t.h0(viewGroup.s, tKWrapView1, uof1, new g(viewGroup, viewGroup.w), viewGroup.u, objArray1);
                viewGroup.o = tKViewContai;
                if (tKViewContai.j()) {
                   c.a("sync createView fail,use async");
                   String str1 = "KEY_SPB_TK_USE_ASYNC_CREATE_VIEW";
                   if (!PatchProxy.applyVoidTwoRefs(str1, objArray, objArray, d.class, "23")) {
                      d.b();
                      a.a().g().report(str1, d.c(objArray));
                   }
                   viewGroup.o.setMinimumHeight(i1);
                }else {
                   obj = viewGroup.o;
                   Objects.requireNonNull(obj);
                   Object obj1 = PatchProxy.apply(objArray, obj, TKWrapView.class, str);
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(!obj.c() && obj.a()){
                      i1 = 0;
                   }
                   b = i1;
                   if (b) {
                      c.a("sync createView fail,call fail directly");
                   }
                }
                if (!PatchProxy.applyVoid(objArray, viewGroup, uob, "14")) {
                   viewGroup.o.setClipChildren(0);
                   viewGroup.o.setClipToPadding(0);
                }
                viewGroup.y.put(uof2, Integer.toHexString(tKWrapView2.hashCode()));
                obj = viewGroup.o;
             }
             return obj;
          }else {
             c.f("use sync method");
             h oh = PatchProxy.apply(objArray, viewGroup, uob, "10");
             if (oh != patchProxyRe) {
             }else {
                d uod = new d(viewGroup);
                Object[] objArray2 = new Object[i];
                objArray2[0] = this.c();
                objArray2[i1] = this.f();
                viewGroup.t.f(uod, new e(viewGroup, uod), viewGroup.u, objArray2);
                oh = viewGroup.o;
             }
             return oh;
          }
       }
    }
    public void g(){
       MerchantTkContainer$a uoa1;
       MerchantTkContainer$a uoa2;
       h p;
       Object obj;
       MerchantTkContainer merchantTkCo;
       l ol;
       h i1;
       Iterator iterator;
       a uoa3;
       h a;
       h p1;
       h q;
       b v;
       b x;
       h i2;
       a uoa4;
       Object[] objArray1;
       Object obj1;
       Map map;
       h oh;
       String str = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       String str1 = "1";
       if (PatchProxy.applyVoid(objArray, str, uob, str1)) {
          return;
       }
       Uri uri = Uri.parse(str.c);
       str.v = uri.getQueryParameter("bundleId");
       String queryParamet = uri.getQueryParameter("viewKey");
       str.u = queryParamet;
       if (TextUtils.isEmpty(queryParamet)) {
          str.u = uri.getQueryParameter("componentName");
       }
       queryParamet = uri.getQueryParameter("minVersion");
       if (TextUtils.isEmpty(queryParamet)) {
          queryParamet = uri.getQueryParameter("minBundleVersion");
       }
       int i = -1;
       try{
          if (!TextUtils.isEmpty(queryParamet)) {
             i = Integer.parseInt(queryParamet);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       b$a uoa = null;
       if (!PatchProxy.applyVoid(objArray, str, uob, "15")) {
          if (a.a().g() == null) {
             str.x = uoa;
          }else if(!SystemUtil.I()){
             str.x = true;
          }else {
             try{
                str.x = b.c(str.a, "tk_debug.xml", uoa).getBoolean("tk_debug_env_report_tk_event_key", uoa);
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
    public Object h(View p0,String p1,String p2){
       String[] stringArray;
       String[] stringArray1;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = this.q(p0);
       if (uoe != null) {
          return uoe.b(p1, p2, null);
       }
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       super.i();
       if (this.t != null) {
          c.f("------TKRenderEngine release------");
          if (!this.t.isDestroyed()) {
             this.t.onDestroy();
          }
          this.t = null;
       }
       this.g = null;
       this.h = null;
       this.a = null;
       this.o = null;
       this.f = null;
       return;
    }
    public void n(View p0,Map[] p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "2")) {
          return;
       }
       super.n(p0, p1);
       c.f("component update");
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "7")) {
          String str = this.c();
          String str1 = this.f();
          e uoe = this.q(p0);
          if (uoe != null) {
             int i = 2;
             try{
                Object[] objArray = new Object[i];
                objArray[0] = str;
                objArray[1] = str1;
                uoe.setData(objArray);
             }catch(java.lang.Exception e6){
                String[] stringArray = new String[]{"bundleId","viewKey","msg"};
                String[] stringArray1 = new String[3];
                stringArray1[0] = this.v;
                stringArray1[1] = this.u;
                stringArray1[i] = e6.getMessage();
                c.d("setData error", a.a(stringArray, stringArray1));
                if (this.r != null) {
                   throw e6;
                }
             }
          }
       }
    }
    public void o(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       Map[] mapArray = new Map[]{p0};
       this.n(this.o, mapArray);
       return;
    }
    public void p(View p0,Map p1){
       String str2;
       String str = "msg";
       String str1 = String.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       int i = 2;
       try{
          str2 = e.e(p1, str1, str1);
       }catch(java.lang.Exception e10){
          String[] stringArray = new String[]{"viewKey",str};
          String[] stringArray1 = new String[i];
          stringArray1[0] = this.u;
          stringArray1[1] = e10.getMessage();
          c.d("viewShow json parse error", a.a(stringArray, stringArray1));
          str2 = "";
       }
       e uoe = this.q(p0);
       if (uoe != null) {
          try{
             uoe.b("viewShow", str2, null);
          }catch(java.lang.Exception e9){
             String[] stringArray2 = new String[]{"bundleId","viewKey",str};
             String[] stringArray3 = new String[3];
             stringArray3[0] = this.v;
             stringArray3[1] = this.u;
             stringArray3[i] = e9.getMessage();
             c.d("viewShow invoke error", a.a(stringArray2, stringArray3));
          }
       }
    }
    public final e q(View p0){
       h to;
       if (p0 == null) {
          to = this.o;
          if (to != null && to instanceof e) {
          }else if(p0 != null && p0 instanceof e){
             to = p0;
          }else {
             to = null;
          }
       }else {
          goto label_000d ;
       }
       return to;
    }
    public Object r(String p0,String p1,h p2,String p3){
       LogParams logParams;
       Map map;
       a uoa;
       Map map1;
       d uod;
       a uoa1;
       a uoa2;
       c uoc;
       h obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p3, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
       }else if(TextUtils.x(p3)){
          uoc = null;
       }else {
          uoc = this.k.get(p3);
       }
       if (obj == null) {
          obj = this.l;
       }
       if (obj != null) {
          obj.d("View·½·¨£º"+p0, p1);
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x8c1138eb:
             if (p0.equals("addTroubleShootingLog")) {
                i = 0;
             }
             break;
           case 0xd34062c9:
             if (p0.equals("reportShowEvent")) {
                i = 1;
             }
             break;
           case 0xf050804b:
             if (p0.equals("onDataChanged")) {
                i = 2;
             }
             break;
           case 0x17880990:
             if (p0.equals("isReportClickManual")) {
                i = 3;
             }
             break;
           case 0x1a539741:
             if (p0.equals("getLiveObject")) {
                i = 4;
             }
             break;
           case 0x4b37bac1:
             if (p0.equals("isReportShowManual")) {
                i = 5;
             }
             break;
           case 0x4dc79a08:
             if (p0.equals("putClientElementParams")) {
                i = 6;
             }
             break;
           case 0x4e303246:
             if (p0.equals("reportClickEvent")) {
                i = 7;
             }
             break;
           case 0x628bfffe:
             if (p0.equals("updateComponentData")) {
                i = 8;
             }
             break;
           case 0x71e2ddc5:
             if (p0.equals("putClientContentParams")) {
                i = 9;
             }
             break;
           default:
       }
       try{
       label_00ca :
          p0 = "area";
          switch (i){
              case 0:
                if (obj != null) {
                   p2 = PatchProxy.applyTwoRefs(p1, LogParams.class, this, b.class, "13");
                   if (p2 == PatchProxyResult.class) {
                      p2 = this.b;
                      if (p2 != null) {
                         n k = p2.k;
                         if (k != null) {
                            logParams = k.h(p1, LogParams.class);
                         }
                      }
                      logParams = e.a(p1, LogParams.class);
                   }
                   obj.a(p2);
                }
                break;
              case 1:
                map = e.a(p1, Map.class);
                uoa = this.b(p3);
                if (uoa != null) {
                   p0 = (map == null)? null: map.get(p0);
                   uoa.e(p0);
                }
                break;
              case 2:
                map1 = e.a(p1, Map.class);
                p1 = PatchProxy.applyOneRefs(p3, this, h.class, "4");
                if (p1 != PatchProxyResult.class) {
                }else if(TextUtils.x(p3)){
                   uod = null;
                }else {
                   uod = this.j.get(p3);
                }
                if (p1 != null) {
                   p1.a(map1);
                }
                break;
              case 3:
                uoa1 = this.b(p3);
                if (uoa1 != null) {
                   return Boolean.valueOf(uoa1.c());
                }
                break;
              case 4:
                if (obj != null) {
                   obj.c(p2);
                }
                break;
              case 5:
                uoa1 = this.b(p3);
                if (uoa1 != null) {
                   return Boolean.valueOf(uoa1.d());
                }
                break;
              case 6:
                map1 = e.a(p1, Map.class);
                uoa2 = this.b(p3);
                if (uoa2 != null) {
                   uoa2.f(map1);
                }
                break;
              case 7:
                map = e.a(p1, Map.class);
                uoa = this.b(p3);
                if (uoa != null) {
                   p0 = (map == null)? null: map.get(p0);
                   uoa.b(p0);
                }
                break;
              case 8:
                if (obj != null) {
                   obj.b(p1);
                }
                break;
              case 9:
                map1 = e.a(p1, Map.class);
                uoa2 = this.b(p3);
                if (uoa2 != null) {
                   uoa2.a(map1);
                }
                break;
              default:
          }
       label_01aa :
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public void s(TKViewContainerWrapView$a p0){
       this.w = p0;
    }
}
