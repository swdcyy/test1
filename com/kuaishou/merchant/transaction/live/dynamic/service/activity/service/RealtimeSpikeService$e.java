package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$e;
import erd.g;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService;
import java.lang.Object;
import nj4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import vd4.b;
import nj4.b;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import nj4.a;
import nj4.b$a;
import com.google.gson.JsonElement;

public final class RealtimeSpikeService$e implements g	// class@0007cb
{
    public final RealtimeSpikeService b;

    public void RealtimeSpikeService$e(RealtimeSpikeService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       b$a a;
       RealtimeSpikeService a1;
       JsonObject jsonObject;
       RealtimeSpikeService obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeSpikeService$e.class, "1")) {
       }else {
          RealtimeSpikeService$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, RealtimeSpikeService.class, "6")) {
             int i = p0.c();
             String str = "null cannot be cast to non-null type com.kuaishou.merchant.transaction.live.dynamic.service.activity.model.SpikeOutput";
             if (i != 1) {
                if (i != 2) {
                   tb.k9("RealtimeSpikeService: onReceiveEnd: "+p0);
                   a = b.a;
                   a1 = tb.A;
                   a.m(a1);
                   jsonObject = a1.a();
                   a.m(jsonObject);
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidOneRefs(jsonObject, a, b$a.class, "3")) {
                      jsonObject.G("soldStock", jsonObject.e0("originalStock"));
                   }
                   b.m9(tb, "mt_purchase_panel_activity_end", null, 2, null);
                   tb.y9(p0.b());
                   tb.x9();
                }else {
                   tb.k9("RealtimeSpikeService: onReceiveProgressEnd: "+p0);
                   obj = p0.a();
                   Objects.requireNonNull(obj, str);
                   a1 = tb.A;
                   a.m(a1);
                   jsonObject = a1.a();
                   a.m(jsonObject);
                   obj.b(jsonObject);
                   b.m9(tb, "mt_purchase_panel_activity_end", null, 2, null);
                   tb.y9(p0.b());
                   tb.x9();
                }
             }else {
                tb.k9("RealtimeSpikeService: onReceiveProgress: "+p0);
                p0 = p0.a();
                Objects.requireNonNull(p0, str);
                obj = tb.A;
                a.m(obj);
                JsonObject jsonObject1 = obj.a();
                a.m(jsonObject1);
                p0.b(jsonObject1);
                b.m9(tb, "mt_purchase_panel_activity_state_changed", null, 2, null);
             }
          }
       }
       return;
    }
}
