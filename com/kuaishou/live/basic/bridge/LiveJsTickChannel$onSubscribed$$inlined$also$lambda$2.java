package com.kuaishou.live.basic.bridge.LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import java.lang.IllegalStateException;

public final class LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2 extends SuspendLambda implements p	// class@000cad
{
    public int label;
    public String p$0;
    public final LiveJsTickChannel this$0;

    public void LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2(c p0,LiveJsTickChannel p1){
       this.this$0 = p1;
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2 obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2(p1, this.this$0);
       obj.p$0 = p0;
       PatchProxy.onMethodExit(LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2.class, "2");
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2.class, "3");
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label == null) {
          j0.n(p0);
          this.this$0.a(this.p$0);
          PatchProxy.onMethodExit(LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2.class, "1");
          return l1.a;
       }else {
          PatchProxy.onMethodExit(LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2.class, "1");
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
    }
}
