package com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2;
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
import com.google.gson.JsonElement;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.processor.manager.CurrentProcessorManager;
import java.lang.IllegalStateException;

public final class ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2 extends SuspendLambda implements p	// class@001d95
{
    public final JsonObject $pushData;
    public int label;
    public k0 p$;

    public void ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2(JsonObject p0,c p1){
       this.$pushData = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2(this.$pushData, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ThirdMatrixInitModuleForSubProcess$dealJPush$1$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.$pushData.toString();
       a.o(p0, "pushData.toString\(\)");
       CurrentProcessorManager.showNotification(p0, Channel.MATRIX_JPUSH);
       return l1.a;
    }
}
