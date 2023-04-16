package com.pagemanager.PageStack$runOnUi$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.a;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;

public final class PageStack$runOnUi$1 extends SuspendLambda implements p	// class@000b47
{
    public final a $block;
    public int label;
    public k0 p$;

    public void PageStack$runOnUi$1(a p0,c p1){
       this.$block = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       PageStack$runOnUi$1 orunOnUi$1 = new PageStack$runOnUi$1(this.$block, p1);
       orunOnUi$1.p$ = p0;
       return orunOnUi$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       this.$block.invoke();
       return l1.a;
    }
}
