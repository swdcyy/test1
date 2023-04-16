package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$c;
import erd.g;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService;
import java.lang.Object;
import nj4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import vd4.b;
import nj4.d;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import nj4.a;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$b;
import java.lang.Runnable;
import ekd.k1;
import vd4.n;
import vd4.n$a;

public final class RealtimeWelfareService$c implements g	// class@0007d1
{
    public final RealtimeWelfareService b;

    public void RealtimeWelfareService$c(RealtimeWelfareService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       RealtimeWelfareService a;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeWelfareService$c.class, "1")) {
       }else {
          RealtimeWelfareService$c tb = this.b;
          Objects.requireNonNull(tb);
          RealtimeWelfareService realtimeWelf = RealtimeWelfareService.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, realtimeWelf, "6")) {
             int i = p0.c();
             String str = "null cannot be cast to non-null type com.kuaishou.merchant.transaction.live.dynamic.service.activity.model.WelfareOutput";
             if (i != 1) {
                if (i == 2) {
                   tb.k9("RealtimeWelfareService: onReceiveProgressEnd: "+p0);
                   Object obj = p0.a();
                   Objects.requireNonNull(obj, str);
                   a = tb.A;
                   a.m(a);
                   JsonObject jsonObject = a.a();
                   a.m(jsonObject);
                   obj.a(jsonObject);
                   b.m9(tb, "mt_purchase_panel_activity_end", null, 2, null);
                   b = p0.b();
                   if (!PatchProxy.isSupport(realtimeWelf) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, realtimeWelf, "7")) {
                      tb.k9("RealtimeWelfareService: refreshPage: delay="+b);
                      if (b && tb.A != null) {
                         if (tb.E != null) {
                            tb.k9("RealtimeWelfareService: 接口请求被过滤，有正在排队的任务");
                         }else {
                            tb.E = true;
                            b = new RealtimeWelfareService$b(tb, tb.b9());
                            RealtimeWelfareService a1 = tb.A;
                            a.m(a1);
                            k1.r(b, a1.c());
                         }
                      }else {
                         n.z.b(tb.b9(), 800, null, null);
                      }
                   }
                }
             }else {
                tb.k9("RealtimeWelfareService: onReceiveProgress: "+p0);
                p0 = p0.a();
                Objects.requireNonNull(p0, str);
                realtimeWelf = tb.A;
                a.m(realtimeWelf);
                JsonObject jsonObject1 = realtimeWelf.a();
                a.m(jsonObject1);
                p0.a(jsonObject1);
                b.m9(tb, "mt_purchase_panel_activity_state_changed", null, 2, null);
             }
          }
       }
       return;
    }
}
