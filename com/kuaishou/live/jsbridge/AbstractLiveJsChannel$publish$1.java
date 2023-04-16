package com.kuaishou.live.jsbridge.AbstractLiveJsChannel$publish$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
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
import java.lang.IllegalStateException;
import java.util.HashSet;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import o63.h;

public final class AbstractLiveJsChannel$publish$1 extends SuspendLambda implements p	// class@001d15
{
    public final Object $data;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;
    public final AbstractLiveJsChannel this$0;

    public void AbstractLiveJsChannel$publish$1(AbstractLiveJsChannel p0,Object p1,c p2){
       this.this$0 = p0;
       this.$data = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       AbstractLiveJsChannel$publish$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$publish$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new AbstractLiveJsChannel$publish$1(this.this$0, this.$data, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$publish$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsChannel$publish$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       AbstractLiveJsChannel$publish$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          label_0047 :
             tlabel = p0;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.$data;
          if (tlabel instanceof String) {
          }else if(tlabel != null){
             this.L$0 = p0;
             this.L$1 = tlabel;
             this.label = 1;
             p0 = this.this$0.g(tlabel, this);
             if (p0 == obj) {
                return obj;
             }else {
                goto label_0047 ;
             }
          }else {
             String str = null;
          }
       }
       p0 = new HashSet(this.this$0.c.values()).iterator();
       while (p0.hasNext()) {
          p0.next().b(tlabel);
       }
       return l1.a;
    }
}
