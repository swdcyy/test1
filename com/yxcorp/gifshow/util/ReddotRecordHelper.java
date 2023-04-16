package com.yxcorp.gifshow.util.ReddotRecordHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.util.ReddotRecordHelper$reddotTsLimit$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import f3b.o;
import wq6.f;
import wq6.h;
import zq6.p;
import zq6.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Long;
import java.lang.Number;
import java.lang.System;
import java.util.Map;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import o56.f;
import com.kwai.edge.reco.ctr.CTRPredictor;
import com.yxcorp.gifshow.util.ReddotRecordHelper$a;
import java.lang.Runnable;
import t45.c;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;
import java.util.Date;

public final class ReddotRecordHelper	// class@001f2a
{
    public static List a;
    public static final HashMap b;
    public static final HashMap c;
    public static final p d;
    public static final ReddotRecordHelper e;

    static {
       ReddotRecordHelper.e = new ReddotRecordHelper();
       ReddotRecordHelper.a = Collections.synchronizedList(new ArrayList());
       ReddotRecordHelper.b = new HashMap();
       ReddotRecordHelper.c = new LinkedHashMap();
       ReddotRecordHelper.d = s.c(ReddotRecordHelper$reddotTsLimit$2.INSTANCE);
    }
    public void ReddotRecordHelper(){
       super();
    }
    public final String a(String p0){
       switch (p0.hashCode()){
           case 0x846a2943:
             if (p0.equals("BottomMe")) {
                p0 = o.i(0x7602);
             }else {
             label_00bf :
                p0 = null;
             }
             break;
           case 0x86c078aa:
             if (p0.equals("BottomNearby")) {
             label_00a9 :
                p0 = o.i(15);
             }else {
                goto label_00bf ;
             }
             break;
           case 0x95a74ad8:
             if (p0.equals("TopHot")) {
                p0 = o.i(1);
             }else {
                goto label_00bf ;
             }
             break;
           case 0xaa1df22b:
             if (p0.equals("BottomFeature")) {
             label_008c :
                p0 = o.i(0x7d42);
             }else {
                goto label_00bf ;
             }
             break;
           case 0xd23f401:
             if (p0.equals("TopFeature")) {
                goto label_008c ;
             }else {
                goto label_00bf ;
             }
             break;
           case 0x1282d1ca:
             if (p0.equals("BottomHome")) {
                p0 = "HOME";
             }else {
                goto label_00bf ;
             }
             break;
           case 0x1d66773c:
             if (p0.equals("BottomMessage")) {
                p0 = o.i(28);
             }else {
                goto label_00bf ;
             }
             break;
           case 0x1f443034:
             if (p0.equals("TopMenu")) {
                p0 = o.i(46);
             }else {
                goto label_00bf ;
             }
             break;
           case 0x45f99b64:
             if (p0.equals("TopActivity")) {
                p0 = "OP_ACTIVITY_PAGE";
             }else {
                goto label_00bf ;
             }
             break;
           case 0x4e7730b1:
             if (p0.equals("TopCorona")) {
                p0 = "CORONA_PAGE";
             }else {
                goto label_00bf ;
             }
             break;
           case 0x5392f546:
             if (p0.equals("TopFollow")) {
                p0 = o.i(2);
             }else {
                goto label_00bf ;
             }
             break;
           case 0x60a7e414:
             if (p0.equals("TopNearby")) {
                goto label_00a9 ;
             }else {
                goto label_00bf ;
             }
             break;
           case 0x6fd0188a:
             if (p0.equals("TopXBlock")) {
                p0 = "X_TAB";
             }else {
                goto label_00bf ;
             }
             break;
           case 0x79d458c9:
             if (p0.equals("BottomFriend")) {
                p0 = "FRIENDS";
             }else {
                goto label_00bf ;
             }
             break;
           default:
             goto label_00bf ;
       }
       return p0;
    }
    public final Object b(f p0,h p1,p p2){
       return p0.y().e(p1, p2);
    }
    public final void c(String p0){
       a.p(p0, "regionName");
       p0 = this.a(p0);
       if (p0 != null) {
          ReddotRecordHelper e = ReddotRecordHelper.e;
          Objects.requireNonNull(e);
          HashMap b = ReddotRecordHelper.b;
          Long longx = b.get(p0);
          if (longx != null) {
             b.remove(p0);
             ReddotRecordHelper.c.put(Long.valueOf(longx.longValue()), Long.valueOf(System.currentTimeMillis()));
          }
          e.e(p0, true);
       }
       return;
    }
    public final void d(boolean p0,String p1){
       a.p(p1, "regionName");
       p1 = this.a(p1);
       if (p1 != null) {
          if (p0) {
             if (!ReddotRecordHelper.a.contains(p1)) {
                ReddotRecordHelper.a.add(p1);
                ReddotRecordHelper e = ReddotRecordHelper.e;
                Objects.requireNonNull(e);
                long l = System.currentTimeMillis();
                ReddotRecordHelper.b.put(p1, Long.valueOf(l));
                ReddotRecordHelper.c.put(Long.valueOf(l), Long.valueOf(-1));
                e.e(p1, false);
                CtrPredictionRuntimeConfig$a c = CtrPredictionRuntimeConfig.c;
                Objects.requireNonNull(c);
                Object obj = PatchProxy.applyOneRefs(p1, c, CtrPredictionRuntimeConfig$a.class, "3");
                if (obj != PatchProxyResult.class) {
                   c = obj.booleanValue();
                }else {
                   a.p(p1, "reddot");
                   c = c.a().d().reddotWhiteList.contains(p1);
                }
                if (c) {
                   ActivityContext uActivityCon = ActivityContext.g();
                   a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                   if (f.b(uActivityCon.e())) {
                      CTRPredictor.v.r(3);
                   }
                }
             }
          }else {
             ReddotRecordHelper.a.remove(p1);
          }
       }
       return;
    }
    public final void e(String p0,boolean p1){
       c.a(new ReddotRecordHelper$a(p0, p1));
    }
    public final String f(String p0){
       Date uDate = new SimpleDateFormat("yyyy.MM.dd").parse(p0, new ParsePosition(0));
       if (uDate != null) {
          return String.valueOf(uDate.getTime());
       }
       return null;
    }
}
