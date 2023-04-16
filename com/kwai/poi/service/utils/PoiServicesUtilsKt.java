package com.kwai.poi.service.utils.PoiServicesUtilsKt;
import com.kwai.poi.base.model.PoiServiceConfigModel;
import com.kwai.poi.service.model.PoiServiceConfigInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.poi.service.model.KLocation;
import java.util.ArrayList;
import java.lang.Integer;
import com.kwai.poi.service.model.PoiServiceRequestConfig;
import ie6.a$a;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Double;
import le6.g;
import java.lang.CharSequence;
import java.lang.Number;
import msd.l;
import kotlin.jvm.internal.Ref$IntRef;
import com.kwai.poi.service.utils.PoiServicesUtilsKt$processKeyWordLocation$4;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import ok7.b;
import ok7.c;
import erd.g;
import crd.b;
import com.kwai.framework.poi.api.config.PoiSdkInitConfig;
import com.kwai.poi.service.utils.PoiServicesUtilsKt$processKeyWordLocation$5;
import com.kwai.poi.service.utils.PoiServicesUtilsKt$processKeyWordLocation$6;
import msd.q;
import ie6.a;

public final class PoiServicesUtilsKt	// class@0013bb
{

    public static final PoiServiceConfigInfo a(PoiServiceConfigModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PoiServicesUtilsKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$coverToServiceConfig");
       PoiServiceConfigInfo poiServiceCo = new PoiServiceConfigInfo(p0.getSortRule(), p0.getRequestPageNum(), p0.getWhiteCategoryType(), p0.getNearbySearchRadius(), p0.getCityLimit());
       return obj;
    }
    public static final a$a b(String p0,String p1,KLocation p2,ArrayList p3,String p4,boolean p5,String p6,Integer p7,PoiServiceRequestConfig p8){
       a$a obj1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       PoiServicesUtilsKt poiServicesU = PoiServicesUtilsKt.class;
       Object obj = null;
       int i = 0;
       if (PatchProxy.isSupport(poiServicesU)) {
          Object[] objArray = new Object[9];
          objArray[i] = oobject;
          objArray[1] = oobject1;
          objArray[2] = p2;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          obj1 = PatchProxy.apply(objArray, obj, poiServicesU, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.p(p0, "poiBiz");
       a.p(p1, "poiSubBiz");
       obj1 = new a$a(p0, p1);
       if (oobject2 != null && ((p3.isEmpty() ^ 1) == 1 && p3.size() >= 1)) {
          obj1.e(Double.valueOf(p3.get(i).a()));
          obj1.f(Double.valueOf(p3.get(i).b()));
          obj1.n(g.a(oobject3, 2, p5));
       }else if(p2 != null){
          obj1.e(Double.valueOf(p2.a()));
          obj1.f(Double.valueOf(p2.b()));
          obj1.n(oobject3);
       }else {
          obj1.n(oobject3);
       }
       if (p6 != null) {
          String obj2 = (p6.length() > 0)? 1: null;
          obj2 = (obj2)? p6: obj;
          if (obj2 != null) {
             obj1.i(obj2);
          }
       }
       if (p7 != null) {
          if (p7.intValue() >= 1) {
             i = 1;
          }
          if (i) {
             obj = p7;
          }
          if (obj != null) {
             obj1.h(obj.intValue());
          }
       }
       if (p8 != null) {
          PoiServiceConfigInfo nearbyConfig = p8.getNearbyConfig();
          if (nearbyConfig != null) {
             obj1.g(nearbyConfig.getRequestPageNum());
             obj1.k(nearbyConfig.getNearbySearchRadius());
             obj1.o(nearbyConfig.getWhiteCategoryType());
             obj1.m(nearbyConfig.getSortRule());
          }
       }
       return obj1;
    }
    public static a$a c(String p0,String p1,KLocation p2,ArrayList p3,String p4,boolean p5,String p6,Integer p7,PoiServiceRequestConfig p8,int p9,Object p10){
       int i = p9;
       boolean b = (i & 0x20)? false: p5;
       int i1 = 0;
       String str = (i & 0x40)? "": i1;
       Integer integer = (i & 0x0080)? Integer.valueOf(1): i1;
       PoiServiceRequestConfig poiServiceRe = (i & 0x0100)? i1: p8;
       return PoiServicesUtilsKt.b(p0, p1, p2, p3, p4, b, str, integer, poiServiceRe);
    }
    public static final void d(String p0,String p1,String p2,KLocation p3,ArrayList p4,String p5,String p6,String p7,Integer p8,PoiServiceRequestConfig p9,l p10){
       Object[] objArray;
       PoiServiceConfigInfo keyWordConfi;
       double d;
       double d1;
       boolean b;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       object oobject4 = p6;
       object oobject5 = p10;
       PoiServicesUtilsKt poiServicesU = PoiServicesUtilsKt.class;
       int i = 2;
       Boolean uBoolean = null;
       int i1 = 0;
       if (PatchProxy.isSupport(poiServicesU)) {
          objArray = new Object[11];
          objArray[i1] = oobject;
          objArray[1] = oobject1;
          objArray[i] = oobject2;
          objArray[3] = p3;
          objArray[4] = oobject3;
          objArray[5] = p5;
          objArray[6] = oobject4;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = oobject5;
          if (PatchProxy.applyVoid(objArray, uBoolean, poiServicesU, "2")) {
             return;
          }
       }
       a.p(oobject, "poiBiz");
       a.p(oobject1, "poiSubBiz");
       a.p(oobject2, "keyWords");
       a.p(oobject5, "block");
       a$a uoa = new a$a(oobject, oobject1);
       uoa.d(oobject2);
       uoa.m(1);
       if (p7 != null) {
          String obj = (p7.length() > 0)? 1: null;
          obj = (obj)? p7: uBoolean;
          if (obj != null) {
             uoa.i(obj);
          }
       }
       if (p8 != null) {
          Number obj1 = (p8.intValue() >= 1)? 1: null;
          obj1 = (obj1)? p8: uBoolean;
          if (obj1 != null) {
             uoa.h(obj1.intValue());
          }
       }
       if (p9 != null) {
          keyWordConfi = p9.getKeyWordConfigInfo();
          if (keyWordConfi != null) {
             uoa.g(keyWordConfi.getRequestPageNum());
             uoa.o(keyWordConfi.getWhiteCategoryType());
             uoa.m(keyWordConfi.getSortRule());
          }
       }
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = -1;
       PoiServicesUtilsKt$processKeyWordLocation$4 oprocessKeyW = null;
       if (oobject3 != null && ((p4.isEmpty() ^ 1) == 1 && p4.size() >= 1)) {
          d = oobject3.get(i1).a();
          d1 = oobject3.get(i1).b();
          intRef.element = i;
          uoa.e(Double.valueOf(d));
          uoa.f(Double.valueOf(d1));
       }else if(p3 != null){
          d = p3.a();
          d1 = p3.b();
          uoa.e(Double.valueOf(p3.a()));
          uoa.f(Double.valueOf(p3.b()));
       }else {
          d1 = oprocessKeyW;
          d = d1;
       }
       if (p5 != null) {
          objArray = (!p5.length())? 1: 0;
          if (objArray == 1) {
             if (d - oprocessKeyW && d1 - oprocessKeyW) {
                PoiServicesUtilsKt$processKeyWordLocation$4 oprocessKeyW1 = new PoiServicesUtilsKt$processKeyWordLocation$4(p9, uoa, p6, intRef, p10);
                if (!PatchProxy.isSupport(poiServicesU) || !PatchProxy.applyVoidThreeRefs(Double.valueOf(d), Double.valueOf(d1), oprocessKeyW, 0, PoiServicesUtilsKt.class, "4")) {
                   a.p(oprocessKeyW, "onFinal");
                   b.a(0x330163e).getRoamLocationResponse(String.valueOf(d), String.valueOf(d1)).subscribe(new b(oprocessKeyW), new c(oprocessKeyW));
                }
             }else if(!PoiSdkInitConfig.g().length()){
                keyWordConfi = 1;
             }else {
                keyWordConfi = null;
             }
             if (keyWordConfi) {
                PoiServiceRequestConfig poiServiceRe = p9;
                PoiServicesUtilsKt$processKeyWordLocation$5 oprocessKeyW2 = new PoiServicesUtilsKt$processKeyWordLocation$5(poiServiceRe, uoa, p6, intRef, p10);
                PoiServicesUtilsKt$processKeyWordLocation$6 oprocessKeyW3 = new PoiServicesUtilsKt$processKeyWordLocation$6(poiServiceRe, p5, uoa, p6, intRef, p10);
                PoiSdkInitConfig.k(i, uBoolean);
             }else if(p9 != null){
                keyWordConfi = p9.getKeyWordConfigInfo();
                if (keyWordConfi != null) {
                   i1 = keyWordConfi.getCityLimit();
                }else if(PoiSdkInitConfig.g().length() > 0){
                   i1 = true;
                }
             }else {
                goto label_01c6 ;
             }
             uoa.b(PoiSdkInitConfig.g());
             uoa.c(i1);
             uoa.n(g.a(oobject4, intRef.element, i1));
             oobject5.invoke(uoa.a());
          }else if(p9 != null){
             keyWordConfi = p9.getKeyWordConfigInfo();
             if (keyWordConfi != null) {
                uBoolean = Boolean.valueOf(keyWordConfi.getCityLimit());
             }else if(p5 != null){
                if (p5.length() > 0) {
                   i1 = true;
                }
                uBoolean = Boolean.valueOf(i1);
             }
          }else {
             goto label_01fd ;
          }
          b = a.g(uBoolean, Boolean.TRUE);
          String str = (p5 != null)? p5: "";
          uoa.b(str);
          uoa.c(b);
          uoa.n(g.a(oobject4, intRef.element, b));
          oobject5.invoke(uoa.a());
       }else {
          goto label_01ec ;
       }
       return;
    }
}
