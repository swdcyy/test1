package com.yxcorp.gifshow.longinus.SpUtil;
import com.yxcorp.gifshow.longinus.SpUtil$ONE_HOUR_INTERVAL_MILLIS$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.Context;
import kotlin.Pair;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Long;
import java.lang.Integer;
import java.util.Calendar;
import java.lang.Boolean;

public final class SpUtil	// class@001b7c
{
    public static final p a;
    public static final SpUtil b;

    static {
       SpUtil.b = new SpUtil();
       SpUtil.a = s.c(SpUtil$ONE_HOUR_INTERVAL_MILLIS$2.INSTANCE);
    }
    public void SpUtil(){
       super();
    }
    public static Pair c(SpUtil p0,Context p1,long p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = System.currentTimeMillis();
       }
       return p0.b(p1, p2);
    }
    public final long a(Context p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SpUtil spUtil = SpUtil.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, spUtil, "5");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       a.p(p0, "context");
       SharedPreferences sharedPrefer = o.c(p0, "longins_sp", 0);
       Number number = PatchProxy.apply(null, this, spUtil, "1");
       if (number == patchProxyRe) {
          number = SpUtil.a.getValue();
       }
       return sharedPrefer.getLong("request_interval_millis", number.longValue());
    }
    public final Pair b(Context p0,long p1){
       String obj;
       int i;
       Pair pair1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SpUtil spUtil = SpUtil.class;
       if (PatchProxy.isSupport(spUtil)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, spUtil, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "context";
       a.p(p0, obj);
       Pair pair = PatchProxy.applyOneRefs(p0, this, spUtil, "8");
       if (pair != patchProxyRe) {
       }else {
          a.p(p0, obj);
          SharedPreferences sharedPrefer = o.c(p0, "longins_sp", 0);
          i = sharedPrefer.getInt("silence_begin_minutes", 1320);
          pair = new Pair(Integer.valueOf(i), Integer.valueOf(sharedPrefer.getInt("silence_end_minutes", 480)));
       }
       i = pair.getSecond().intValue();
       Calendar instance = Calendar.getInstance();
       a.o(instance, "calendar");
       instance.setTimeInMillis(p1);
       int i1 = (instance.get(11) * 60) + instance.get(12);
       Long longx = 1440;
       if (pair.getFirst().intValue() <= i1 && longx >= i1) {
          pair1 = new Pair(Boolean.TRUE, Long.valueOf((((long)i + 1440) - (long)i1)));
       }else if(i1 >= 0 && i >= i1){
          pair1 = new Pair(Boolean.TRUE, Long.valueOf((((long)i + 0) - (long)i1)));
       }else {
          pair1 = new Pair(Boolean.FALSE, Long.valueOf(0));
       }
       return pair1;
    }
}
