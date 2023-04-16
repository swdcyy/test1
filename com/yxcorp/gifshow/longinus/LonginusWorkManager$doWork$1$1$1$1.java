package com.yxcorp.gifshow.longinus.LonginusWorkManager$doWork$1$1$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.google.gson.JsonObject;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.yxcorp.gifshow.longinus.LonginusLog;
import com.google.gson.JsonElement;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.Processor;
import java.lang.IllegalStateException;

public final class LonginusWorkManager$doWork$1$1$1$1 extends SuspendLambda implements p	// class@001b74
{
    public final JsonObject $it;
    public int label;
    public k0 p$;

    public void LonginusWorkManager$doWork$1$1$1$1(JsonObject p0,c p1){
       this.$it = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       LonginusWorkManager$doWork$1$1$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LonginusWorkManager$doWork$1$1$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LonginusWorkManager$doWork$1$1$1$1(this.$it, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LonginusWorkManager$doWork$1$1$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LonginusWorkManager$doWork$1$1$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       LonginusLog.d("longinus", "show");
       p0 = this.$it.toString();
       a.o(p0, "it.toString\(\)");
       Processor.showNotification(p0, Channel.LONGINUS);
       return l1.a;
    }
}
