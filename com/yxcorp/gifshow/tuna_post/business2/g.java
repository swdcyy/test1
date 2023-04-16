package com.yxcorp.gifshow.tuna_post.business2.g;
import java.lang.Object;
import android.net.Uri;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.d;
import zx5.e;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import tmc.h;
import msd.a;
import c15.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import lnc.a1;
import e17.i;
import os5.q;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import android.app.Activity;
import brd.a0;
import qs5.b;
import qs5.c;
import erd.g;
import crd.b;
import u06.g;
import tmc.j;
import tmc.g;
import tmc.l;
import ekd.x0;
import com.yxcorp.gifshow.tuna_post.business2.f;
import tmc.k;
import android.content.Context;
import xh7.b;
import com.yxcorp.gifshow.tuna_post.business2.e;
import qh7.b;
import qh7.a;

public class g	// class@001e34
{

    public void g(){
       super();
    }
    public static Uri a(Uri p0,String p1,String p2,String p3,String p4,long p5){
       String obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Long.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, og, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.getQueryParameter("url");
       d uod = d.a(-174493078).PB(d.class);
       if (uod == null) {
          b.d(KsLogTunaPlcTag.PLC_POST.appendTag("ShareBusinessLinkJumpUtil"), new h(p0));
          return p0;
       }else if(!TextUtils.x(obj)){
          ArrayMap uArrayMap = new ArrayMap();
          uArrayMap.put("entryId", TextUtils.I(p1));
          uArrayMap.put("subtype", TextUtils.I(p2));
          uArrayMap.put("serviceId", TextUtils.I(p3));
          uArrayMap.put("taskId", String.valueOf(p5));
          uArrayMap.put("extData", TextUtils.I(p4));
          p0 = uod.h(p0, "url", uod.i(obj, uArrayMap, 1, 1), true, true);
       }
       return p0;
    }
    public static boolean b(int p0){
       g og = g.class;
       String str = "5";
       Object obj = null;
       if (PatchProxy.isSupport(og)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, og, str);
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       boolean b = LivePluginManager.c();
       if (!b) {
          if (p0 == 3) {
             i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101e5e), 0);
          }else if(p0 != 2 || PatchProxy.applyVoidOneRefs(q.class, obj, LivePluginManager.class, str)){
             a.p(q.class, "clazz");
             LivePluginManager.f(q.class, LoadPolicy.SILENT, null, null, 12, null).R(b.b, c.b);
          }
          d.a(0x565dccdc).GY(p0);
       }
       return b;
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          boolean b = false;
          if (!TextUtils.x(p0) && !0x41f00000 - (float)Integer.parseInt(p0)) {
             b = true;
          }
       label_0027 :
          return b;
       }catch(java.lang.Exception e0){
       }
    }
    public static void d(Activity p0,String p1,String p2,String p3,String p4,String p5,long p6,String p7,String p8,String p9,String p10,String p11){
       Object[] objArray;
       String str2;
       Uri uri;
       String str3;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       int i = 7;
       int i1 = 6;
       int i2 = 5;
       int i3 = 4;
       int i4 = 3;
       int i5 = 2;
       int i6 = 1;
       Uri obj = null;
       if (PatchProxy.isSupport(g.class)) {
          objArray = new Object[12];
          objArray[0] = oobject;
          objArray[i6] = oobject1;
          objArray[i5] = oobject2;
          objArray[i4] = oobject3;
          objArray[i3] = p4;
          objArray[i2] = p5;
          objArray[i1] = Long.valueOf(p6);
          objArray[i] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          if (PatchProxy.applyVoid(objArray, obj, g.class, "2")) {
             return;
          }
       }
       if (oobject != null && !TextUtils.x(p1)) {
          KsLogTunaPlcTag pLC_POST = KsLogTunaPlcTag.PLC_POST;
          String str = "ShareBusinessLinkJumpUtil";
          pLC_POST.appendTag(str);
          b.f(pLC_POST, new j(oobject1));
          obj = Uri.parse(p1);
          String str1 = "kwai";
          if (TextUtils.n(obj.getScheme(), str1) && TextUtils.n(obj.getHost(), "servicelinkwebview")) {
             str2 = str;
             uri = g.a(obj, p2, p3, p4, p5, p6);
          }else {
             str2 = str;
             if (TextUtils.n(obj.getScheme(), str1) && TextUtils.n(obj.getHost(), "missionwebview")) {
                uri = g.a(obj, p2, p3, p4, p5, p6);
             }else if(TextUtils.n(obj.getScheme(), str1) && TextUtils.n(obj.getHost(), "merchantwebview")){
                if (PatchProxy.isSupport(g.class)) {
                   Object[] objArray1 = new Object[]{obj,p7,p8,p9,p10,p11};
                   Object obj1 = PatchProxy.apply(objArray1, null, g.class, "6");
                   if (obj1 != patchProxyRe) {
                      obj = obj1;
                   }else {
                   label_0109 :
                      str3 = obj.getQueryParameter("url");
                      d uod1 = d.a(-174493078).PB(uod);
                      if (uod1 == null) {
                         pLC_POST.appendTag(str2);
                         b.d(pLC_POST, new g(obj));
                      }else if(!TextUtils.x(str3)){
                         ArrayMap uArrayMap = new ArrayMap();
                         uArrayMap.put("itemInfo", TextUtils.I(p7));
                         uArrayMap.put("itemName", TextUtils.I(p8));
                         uArrayMap.put("editSessionId", TextUtils.I(p9));
                         uArrayMap.put("editPhotoId", TextUtils.I(p10));
                         uArrayMap.put("editUid", TextUtils.I(p11));
                         str3 = uod1.i(str3, uArrayMap, true, true);
                         obj = uod1.h(obj, "url", str3, 1, 1);
                      }
                   }
                }else {
                   goto label_0109 ;
                }
                uri = obj;
             }else if(PatchProxy.isSupport(g.class)){
                objArray = new Object[]{oobject1,oobject2,oobject3,p4,p5,p9,p10,p11};
                Object obj2 = PatchProxy.apply(objArray, null, g.class, "8");
                if (obj2 != patchProxyRe) {
                   uri = obj2;
                }
             }
             d uod2 = d.a(-174493078).PB(uod);
             if (uod2 == null) {
                pLC_POST.appendTag(str2);
                b.d(pLC_POST, new l(oobject1));
                uri = x0.f(p1);
             }else {
                ArrayMap uArrayMap1 = new ArrayMap();
                uArrayMap1.put("subtype", TextUtils.I(p3));
                uArrayMap1.put("entryId", TextUtils.I(p2));
                uArrayMap1.put("serviceId", TextUtils.I(p4));
                uArrayMap1.put("extData", TextUtils.I(p5));
                if (TextUtils.n(oobject3, "3") || TextUtils.n(oobject2, "3")) {
                   pLC_POST.appendTag(str2);
                   b.f(pLC_POST, f.b);
                   uArrayMap1.put("editSessionId", TextUtils.I(p9));
                   uArrayMap1.put("editPhotoId", TextUtils.I(p10));
                   uArrayMap1.put("editUid", TextUtils.I(p11));
                }
                uri = x0.f(uod2.i(oobject1, uArrayMap1, true, true));
             }
          }
          str3 = uri.toString();
          pLC_POST.appendTag(str2);
          b.f(pLC_POST, new k(str3));
          if (!PatchProxy.applyVoidTwoRefs(oobject, str3, null, g.class, "3")) {
             a.b(b.j(oobject, str3), new e(str3));
          }
       }
    label_0246 :
       return;
    }
}
