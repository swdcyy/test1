package com.kuaishou.live.jsbridge.AbstractLiveJsChannel$notifySubscribeEvent$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import java.lang.String;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;

public final class AbstractLiveJsChannel$notifySubscribeEvent$1 extends SuspendLambda implements p	// class@001d13
{
    public final LiveJsSubscribeParams$Params $params;
    public final String $subscribeId;
    public int label;
    public k0 p$;
    public final AbstractLiveJsChannel this$0;

    public void AbstractLiveJsChannel$notifySubscribeEvent$1(AbstractLiveJsChannel p0,String p1,LiveJsSubscribeParams$Params p2,c p3){
       this.this$0 = p0;
       this.$subscribeId = p1;
       this.$params = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       AbstractLiveJsChannel$notifySubscribeEvent$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$notifySubscribeEvent$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new AbstractLiveJsChannel$notifySubscribeEvent$1(this.this$0, this.$subscribeId, this.$params, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$notifySubscribeEvent$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsChannel$notifySubscribeEvent$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       this.this$0.m(this.$subscribeId, this.$params);
       return l1.a;
    }
}
