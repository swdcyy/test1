package com.kuaishou.live.jsbridge.AbstractLiveJsChannel$encodeResult$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.lang.Object;
import asd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import zk.d;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.live.jsbridge.LiveMessageNanoJsonSerializer;
import com.google.gson.Gson;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.IllegalStateException;

public final class AbstractLiveJsChannel$encodeResult$2 extends SuspendLambda implements p	// class@001d11
{
    public final Object $data;
    public int label;
    public k0 p$;

    public void AbstractLiveJsChannel$encodeResult$2(Object p0,c p1){
       this.$data = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       AbstractLiveJsChannel$encodeResult$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$encodeResult$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new AbstractLiveJsChannel$encodeResult$2(this.$data, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$encodeResult$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       String obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsChannel$encodeResult$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = new d();
       p0.h(MessageNano.class, new LiveMessageNanoJsonSerializer());
       p0 = p0.b();
       obj = "GsonBuilder\(\)\n        .r¡­izer\(\)\)\n        .create\(\)";
       try{
          a.o(p0, obj);
          p0 = p0.q(this.$data);
       }catch(java.lang.Exception e0){
          b.B(LiveJsBridgeLogTag.COMMON, "invalid MessageNano: "+this.$data);
          p0 = null;
       }
       return p0;
    }
}
