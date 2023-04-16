package com.kuaishou.live.jsbridge.AbstractLiveJsCommand$execute$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import o63.p;
import o63.l;
import o63.j$a;
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
import o63.e;
import o63.k;
import o63.a;
import qrd.j0;
import java.lang.IllegalStateException;
import lp3.e;
import lp3.c;
import o63.m;
import o63.m$a;

public final class AbstractLiveJsCommand$execute$1 extends SuspendLambda implements p	// class@001d1b
{
    public final j$a $jsPage;
    public final p $params;
    public final l $resolver;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public k0 p$;
    public final AbstractLiveJsCommand this$0;

    public void AbstractLiveJsCommand$execute$1(AbstractLiveJsCommand p0,p p1,l p2,j$a p3,c p4){
       this.this$0 = p0;
       this.$params = p1;
       this.$resolver = p2;
       this.$jsPage = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsCommand$execute$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       AbstractLiveJsCommand$execute$1 uoexecute$1 = new AbstractLiveJsCommand$execute$1(this.this$0, this.$params, this.$resolver, this.$jsPage, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsCommand$execute$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsCommand$execute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       AbstractLiveJsCommand$execute$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          c uoc = this.this$0.h().a(a.class);
          a.o(uoc, "serviceManager.getServic¡­ridgeService::class.java\)");
          k ok = uoc.E9(this.$params.getNameSpace(), this.$params.getCommandName());
          if (ok != null) {
             e uoe = this.$jsPage.c1();
             if (uoe == null) {
                uoe = uoc.Mf();
             }
             if (!uoe.a(ok)) {
                this.$resolver.b(m.g.c("command is not available in current scene"));
                return l1.a;
             }else {
                this.L$0 = p0;
                this.L$1 = uoc;
                this.L$2 = ok;
                this.L$3 = uoe;
                this.label = 1;
                if (this.this$0.e(this.$params, this.$resolver, this.$jsPage, this) == obj) {
                   return obj;
                }
             }
          }else {
             this.$resolver.b(m.g.c("command is not registered"));
             return l1.a;
          }
       }
       return l1.a;
    }
}
