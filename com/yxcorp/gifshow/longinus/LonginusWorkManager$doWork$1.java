package com.yxcorp.gifshow.longinus.LonginusWorkManager$doWork$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.content.Context;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import com.yxcorp.gifshow.longinus.SpUtil;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.longinus.LonginusLog;
import com.kwai.android.common.bean.Channel;
import java.util.Map;
import com.kwai.android.dispatcher.KwaiPush;
import y35.b;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import zk.d;
import com.yxcorp.gifshow.longinus.LonginusInfo;
import com.yxcorp.gifshow.longinus.LonginusDeserializer;
import java.lang.reflect.Type;
import java.util.Objects;
import java.lang.Long;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Integer;
import usd.q;
import kotlin.Pair;
import java.lang.Boolean;
import gx7.d;
import ftd.j2;
import ftd.z0;
import com.yxcorp.gifshow.longinus.LonginusWorkManager$doWork$1$1$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import kotlinx.coroutines.a;
import java.lang.System;
import com.yxcorp.gifshow.longinus.LonginusWorkManager;

public final class LonginusWorkManager$doWork$1 extends SuspendLambda implements p	// class@001b75
{
    public final Context $applicationContext;
    public Object L$0;
    public int label;
    public k0 p$;

    public void LonginusWorkManager$doWork$1(Context p0,c p1){
       this.$applicationContext = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       LonginusWorkManager$doWork$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LonginusWorkManager$doWork$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LonginusWorkManager$doWork$1(this.$applicationContext, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LonginusWorkManager$doWork$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       JsonObject obj4;
       String str;
       SpUtil b;
       l1 a;
       Object obj = this;
       Object obj1 = p0;
       LonginusWorkManager$doWork$1 obj2 = PatchProxy.applyOneRefs(obj1, obj, LonginusWorkManager$doWork$1.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       Object obj3 = b.h();
       obj2 = obj.label;
       SpUtil spUtil = 1;
       if (obj2 != null) {
          if (obj2 == spUtil) {
             j0.n(p0);
             obj4 = obj1;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          LonginusLog.d("longinus", "request");
          str = obj.$applicationContext.getPackageName();
          a.o(str, "applicationContext.packageName");
          obj.L$0 = obj.p$;
          obj.label = spUtil;
          String str2 = str;
          obj4 = KwaiPush.fetchInitiativePush$default(str2, Channel.LONGINUS, 0, this, 4, null);
          if (obj4 == obj3) {
             return obj3;
          }
       }
       str = "longins_sp";
       String str1 = "context";
       if (obj4 != null) {
          obj4 = obj4.b();
          d uod = new Gson().m();
          uod.f(LonginusInfo.class, new LonginusDeserializer());
          LonginusInfo longinusInfo = uod.b().c(obj4.a(), LonginusInfo.class);
          if (longinusInfo.isValid()) {
             b = SpUtil.b;
             LonginusWorkManager$doWork$1 $application = obj.$applicationContext;
             long requestInter = longinusInfo.getRequestIntervalMs();
             Objects.requireNonNull(b);
             if (!PatchProxy.isSupport(SpUtil.class) || !PatchProxy.applyVoidTwoRefs($application, Long.valueOf(requestInter), b, SpUtil.class, "6")) {
                a.p($application, str1);
                g.a(o.c($application, str, 0).edit().putLong("request_interval_millis", requestInter));
             }
             $application = obj.$applicationContext;
             int silentStart = longinusInfo.getSilentStart();
             int silenceEnd = longinusInfo.getSilenceEnd();
             Objects.requireNonNull(b);
             if (!PatchProxy.isSupport(SpUtil.class) || !PatchProxy.applyVoidThreeRefs($application, Integer.valueOf(silentStart), Integer.valueOf(silenceEnd), b, SpUtil.class, "7")) {
                a.p($application, str1);
                g.a(o.c($application, str, 0).edit().putInt("silence_begin_minutes", q.u((silentStart + spUtil), 1440)).putInt("silence_end_minutes", q.n((silenceEnd - 1), 0)));
             }
          }
          if (!SpUtil.c(SpUtil.b, obj.$applicationContext, 0, 2, null).getFirst().booleanValue() && (obj4 == null || a.f(d.b, z0.g(), null, new LonginusWorkManager$doWork$1$1$1$1(obj4, null), 2, null) == null)) {
             LonginusLog.d("longinus", "push data is null");
             a = l1.a;
          }
       }
    label_0148 :
       SpUtil b1 = SpUtil.b;
       LonginusWorkManager$doWork$1 $application1 = obj.$applicationContext;
       Objects.requireNonNull(b1);
       if (!PatchProxy.applyVoidOneRefs($application1, b1, SpUtil.class, "3")) {
          a.p($application1, str1);
          g.a(o.c($application1, str, 0).edit().putLong("last_request_time", System.currentTimeMillis()));
       }
       LonginusWorkManager.a.c(obj.$applicationContext);
       return l1.a;
    }
}
