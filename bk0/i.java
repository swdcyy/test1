package bk0.i;
import zj0.v;
import bk0.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.text.SimpleDateFormat;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.SystemClock;
import java.util.HashMap;
import bk0.j;
import java.lang.StringBuilder;
import ek0.d;
import java.util.ArrayList;
import java.util.Objects;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import com.google.gson.Gson;
import fi0.a;
import oe6.g;
import java.lang.Throwable;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.c;
import kj0.j;
import ekd.k1;
import java.util.Random;
import com.kuaishou.krn.experiment.ExpConfigKt;
import qrd.p;
import java.lang.Number;

public class i extends v	// class@0003a5
{
    public static boolean c = false;
    public static boolean d = true;
    public static boolean e = false;
    public static float f;
    public static float g;
    public static long h;
    public static String i = "LiveAudienceGiftBoxLoadToAnchorGiftsPresenter";
    public static String j;
    public static long k;
    public static final a l;
    public static final boolean m;

    static {
       i.l = new a();
    }
    public void i(){
       super();
    }
    public static String E(){
       Object obj = PatchProxy.apply(null, null, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SimpleDateFormat("yyyyMMdd").format(Long.valueOf(System.currentTimeMillis()));
    }
    public static LinkedTreeMap F(String p0,String p1,Integer p2,Boolean p3){
       LinkedTreeMap obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0) && (TextUtils.isEmpty(p1) || p2.intValue() <= 0)) {
          return new LinkedTreeMap();
       }
       obj = new LinkedTreeMap();
       obj.put("BundleId", p0);
       obj.put("ComponentName", p1);
       obj.put("BundleVersionCode", p2);
       if (p3.booleanValue()) {
          obj.put("open_in_1s", Integer.valueOf(1));
          obj.put("no_open_in_1s", Integer.valueOf(0));
       }else {
          obj.put("open_in_1s", Integer.valueOf(0));
          obj.put("no_open_in_1s", Integer.valueOf(1));
       }
       return obj;
    }
    public static void G(Long p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "6")) {
          return;
       }
       long l = SystemClock.elapsedRealtime() - p1.longValue();
       if (l - 1000 < 0) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("tag", Long.valueOf(p0.longValue()));
       hashMap.put("interval", Long.valueOf(l));
       j.b.b("krn_delay_preload_interval_event", hashMap);
       return;
    }
    public static void I(LinkedTreeMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       d.e("reportKdsPageAggregation | 7. 上报数据；"+p0);
       j.b.b("KRN_PAGE_LOAD_TIME_AGGREGATION", p0);
       return;
    }
    public static void K(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "10")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !p1.isEmpty()) {
          try{
             LinkedTreeMap linkedTreeMa = new LinkedTreeMap();
             linkedTreeMa.put("p_date", p0);
             linkedTreeMa.put("info", p1);
             a l = i.l;
             String str = "KDS_PAGE_REPORT_AGGREGATION";
             Objects.requireNonNull(l);
             Object obj = PatchProxy.applyThreeRefs(str, "KRN_PAGE_LOAD_TIME_AGGREGATION", linkedTreeMa, l, a.class, "1");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else {
                g.a(l.c(str).edit().putString("KRN_PAGE_LOAD_TIME_AGGREGATION", a.a().q(linkedTreeMa)));
             }
          }catch(java.lang.Exception e8){
             d.k("set aggregation error", e8);
          }
       }
    }
    public void y(LaunchModel p0,long p1,long p2){
       double d;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, i.class, "5")) {
          return;
       }
       if (i.h > 0) {
          i.k = SystemClock.elapsedRealtime() - i.h;
       }
       i.h = SystemClock.elapsedRealtime();
       i.i = p0.a();
       i.j = p0.b();
       if (!i.e) {
          return;
       }else {
          boolean b = false;
          i.e = b;
          HashMap hashMap = new HashMap();
          hashMap.put("preloadJsRuntimeInterval", String.valueOf(i.f));
          hashMap.put("preloadJsRuntimeFinishInterval", String.valueOf(i.g));
          hashMap.put("firstViewLaunchInterval", Long.valueOf((SystemClock.elapsedRealtime() - c.b().c().h())));
          String str = "krn_first_view_launch_interval_event";
          String str1 = hashMap.toString();
          Number obj = null;
          if (!PatchProxy.applyVoidTwoRefs(str, str1, obj, oi, "2")) {
             Object obj1 = PatchProxy.apply(obj, obj, oi, "1");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                d = (double)k1.b.nextFloat();
                obj = PatchProxy.apply(obj, obj, ExpConfigKt.class, "33");
                if (obj == PatchProxyResult.class) {
                   obj = ExpConfigKt.F.getValue();
                }
                if (d - obj.doubleValue() <= 0) {
                   b = true;
                }
             }
             if (b) {
                j.b.b(str, str1);
             }
          }
          d.e("[perfOpt]krn_first_view_launch_interval_event="+hashMap.toString());
          return;
       }
    }
}
