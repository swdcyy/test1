package com.kuaishou.live.jsbridge.AbstractLiveJsCommand$encodeResult$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import o63.m;
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
import java.lang.IllegalStateException;

public final class AbstractLiveJsCommand$encodeResult$2 extends SuspendLambda implements p	// class@001d1a
{
    public final boolean $needResultCode;
    public final m $result;
    public int label;
    public k0 p$;
    public final AbstractLiveJsCommand this$0;

    public void AbstractLiveJsCommand$encodeResult$2(AbstractLiveJsCommand p0,m p1,boolean p2,c p3){
       this.this$0 = p0;
       this.$result = p1;
       this.$needResultCode = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       AbstractLiveJsCommand$encodeResult$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsCommand$encodeResult$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new AbstractLiveJsCommand$encodeResult$2(this.this$0, this.$result, this.$needResultCode, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsCommand$encodeResult$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsCommand$encodeResult$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       return this.$result.d(this.this$0.c, this.$needResultCode);
    }
}
