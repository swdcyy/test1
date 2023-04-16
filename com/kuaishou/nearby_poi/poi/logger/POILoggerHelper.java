package com.kuaishou.nearby_poi.poi.logger.POILoggerHelper;
import com.kuaishou.nearby_poi.poi.logger.POILoggerHelper$isLowPerformanceDevice$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.util.HashMap;
import un4.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.u1;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qrd.l1;

public final class POILoggerHelper	// class@000a26
{
    public static a a;
    public static final p b;
    public static final POILoggerHelper c;

    static {
       POILoggerHelper.c = new POILoggerHelper();
       POILoggerHelper.b = s.c(POILoggerHelper$isLowPerformanceDevice$2.INSTANCE);
    }
    public void POILoggerHelper(){
       super();
    }
    public static final void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, POILoggerHelper.class, "3")) {
          return;
       }
       POILoggerHelper.c(p0, p1, null, 4, null);
       return;
    }
    public static final void b(String p0,String p1,String p2){
       a a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, POILoggerHelper.class, "2")) {
          return;
       }
       String str = "stage";
       a.p(p0, str);
       String str1 = "reason";
       a.p(p1, str1);
       i3 oi3 = i3.f();
       oi3.d(str, p0);
       oi3.d(str1, p1);
       if (p2 != null) {
          oi3.d("result", p2);
       }
       oi3.c("isLowPhone", Integer.valueOf(POILoggerHelper.c.e()));
       a = POILoggerHelper.a;
       if (a != null) {
          HashMap hashMap = a.a();
          if (hashMap != null) {
             Iterator iterator = hashMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                str = uEntry.getKey();
                oi3.c(str, uEntry.getValue());
             }
          }
          a b = a.b;
          if (b != null) {
             oi3.c("poiId", Long.valueOf(b.longValue()));
          }
          a = a.b();
          if (a != null) {
             oi3.d("sessionId", a);
          }
       }
       CommonParams uCommonParam = new CommonParams();
       uCommonParam.mSubBiz = "local_life";
       u1.Z("POI_KRN_LAUNCH", oi3.e(), false, uCommonParam, 17);
       return;
    }
    public static void c(String p0,String p1,String p2,int p3,Object p4){
       POILoggerHelper.b(p0, p1, null);
    }
    public static final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, POILoggerHelper.class, "4")) {
          return;
       }
       a.p(p0, "stage");
       POILoggerHelper.c.f();
       Rubas.f(p0, null, null, null, 14, null);
       return;
    }
    public static final void g(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, POILoggerHelper.class, "5")) {
          return;
       }
       a.p(p0, "stage");
       a.p(p1, "value");
       POILoggerHelper.c.f();
       Rubas.g(p0, p1.toString());
       return;
    }
    public static final void h(a p0){
       POILoggerHelper.a = p0;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, POILoggerHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = POILoggerHelper.b.getValue();
       }
       return obj.booleanValue();
    }
    public final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, POILoggerHelper.class, "6")) {
          return;
       }
       Rubas.g("poi_d_is_low_phone", String.valueOf(this.e()));
       Rubas.g("local_life_is_first_enter", "1");
       a a = POILoggerHelper.a;
       if (a != null) {
          HashMap hashMap = a.a();
          if (hashMap != null) {
             Integer integer = hashMap.get("goodsType");
             if (integer != null) {
                int i = (a.t(integer.intValue(), 1) > 0)? 1: 0;
                if (i) {
                   objArray = integer;
                }
                if (objArray == null) {
                   objArray = Integer.valueOf(0);
                }
                a.o(objArray, "type.takeIf { it > 1 } ?: 0");
                Rubas.g("poi_d_goods_type", String.valueOf(objArray.intValue()));
             }
             Integer integer1 = hashMap.get("fromType");
             if (integer1 != null) {
                Rubas.g("poi_d_from_type", String.valueOf(integer1.intValue()));
                String str = "plc";
                String str1 = (integer1.intValue() == 1)? str: "otherPOI";
                Rubas.g("local_life_jump_source", str1);
                if (integer1.intValue() != 1) {
                   str = "otherPOI";
                }
                Rubas.g("local_life_jump_channel", str);
             }else {
                Rubas.g("local_life_jump_source", "otherPOI");
                Rubas.g("local_life_jump_channel", "otherPOI");
             }
             objArray = l1.a;
          }
          if (objArray != null) {
          label_00a9 :
             return;
          }
       }
       Rubas.g("local_life_jump_source", "otherPOI");
       Rubas.g("local_life_jump_channel", "otherPOI");
       l1 a1 = l1.a;
       goto label_00a9 ;
    }
}
