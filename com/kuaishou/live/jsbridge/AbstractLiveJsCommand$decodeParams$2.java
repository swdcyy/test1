package com.kuaishou.live.jsbridge.AbstractLiveJsCommand$decodeParams$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.lang.String;
import java.lang.Class;
import asd.c;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.google.gson.Gson;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.IllegalStateException;

public final class AbstractLiveJsCommand$decodeParams$2 extends SuspendLambda implements p	// class@001d18
{
    public final Class $paramType;
    public final String $params;
    public int label;
    public k0 p$;

    public void AbstractLiveJsCommand$decodeParams$2(String p0,Class p1,c p2){
       this.$params = p0;
       this.$paramType = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       AbstractLiveJsCommand$decodeParams$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsCommand$decodeParams$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new AbstractLiveJsCommand$decodeParams$2(this.$params, this.$paramType, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsCommand$decodeParams$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsCommand$decodeParams$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       try{
          j0.n(p0);
          p0 = new Gson().h(this.$params, this.$paramType);
       }catch(java.lang.Exception e0){
          b.B(LiveJsBridgeLogTag.COMMON, "invalid params: "+this.$params);
          p0 = null;
       }
       return p0;
    }
}
