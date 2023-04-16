package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$d;
import erd.g;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import vd4.b;
import oj4.e;
import java.lang.Runnable;
import ekd.k1;

public final class RealtimeWelfareService$d implements g	// class@0007d2
{
    public final RealtimeWelfareService b;

    public void RealtimeWelfareService$d(RealtimeWelfareService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeWelfareService$d.class, "1")) {
       }else {
          RealtimeWelfareService$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, RealtimeWelfareService.class, "8")) {
             RealtimeWelfareService d = tb.D;
             tb.D = d + 1;
             int i = 2;
             if (d > i) {
                b.j9(tb, "RealtimeWelfareService: 获取新数据失败，重试次数大于2", null, i, null);
             }else {
                k1.r(new e(tb, p0), 0);
             }
          }
       }
       return;
    }
}
