package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$concurrentDownload$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.util.List;
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
import ftd.r0;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import trd.u;
import kotlin.Pair;
import java.io.File;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$concurrentDownload$2$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a;
import java.util.Collection;

public final class Inflater$concurrentDownload$2 extends SuspendLambda implements p	// class@001358
{
    public final List $urls;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public k0 p$;

    public void Inflater$concurrentDownload$2(List p0,c p1){
       this.$urls = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       Inflater$concurrentDownload$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$concurrentDownload$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new Inflater$concurrentDownload$2(this.$urls, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$concurrentDownload$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Inflater$concurrentDownload$2 tL$1;
       Inflater$concurrentDownload$2 tL$0;
       Inflater$concurrentDownload$2$1$1 obj2;
       Object obj = PatchProxy.applyOneRefs(p0, this, Inflater$concurrentDownload$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       Inflater$concurrentDownload$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             tlabel = this.L$2;
             tL$1 = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.$urls;
          ArrayList uArrayList = new ArrayList(u.Y(tlabel, 10));
          Iterator iterator = tlabel.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             String str = pair.component1();
             Inflater$concurrentDownload$2$1$1 uoconcurrent = new Inflater$concurrentDownload$2$1$1(pair.component2(), str, null);
             obj2 = uoconcurrent;
             uArrayList.add(a.b(p0, z0.f(), 0, obj2, 2, 0));
          }
          iterator = uArrayList.iterator();
          tL$0 = p0;
          tL$1 = uArrayList;
       }
       p0 = this;
       while (true) {
          if (!tlabel.hasNext()) {
             return l1.a;
          }
          Object obj1 = tlabel.next();
          obj2 = obj1;
          p0.L$0 = tL$0;
          p0.L$1 = tL$1;
          p0.L$2 = tlabel;
          p0.L$3 = obj1;
          p0.L$4 = obj2;
          p0.label = 1;
          if (obj2.C(p0) == obj) {
             break ;
          }
       }
       return obj;
    }
}
