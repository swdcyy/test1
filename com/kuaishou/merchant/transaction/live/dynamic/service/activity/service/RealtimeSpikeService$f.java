package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$f;
import erd.g;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import vd4.b;
import oj4.d;
import java.lang.Runnable;
import ekd.k1;

public final class RealtimeSpikeService$f implements g	// class@0007cc
{
    public final RealtimeSpikeService b;

    public void RealtimeSpikeService$f(RealtimeSpikeService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeSpikeService$f.class, "1")) {
       }else {
          RealtimeSpikeService$f tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, RealtimeSpikeService.class, "8")) {
             RealtimeSpikeService e = tb.E;
             tb.E = e + 1;
             int i = 2;
             if (e > i) {
                b.j9(tb, "RealtimeSpikeService: 获取新数据失败，重试次数大于2", null, i, null);
             }else {
                k1.r(new d(tb, p0), 0);
             }
          }
       }
       return;
    }
}
