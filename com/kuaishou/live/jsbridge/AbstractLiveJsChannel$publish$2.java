package com.kuaishou.live.jsbridge.AbstractLiveJsChannel$publish$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import java.util.HashSet;
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
import java.util.Map;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import dsd.a;
import java.util.Collection;
import java.lang.Iterable;
import o63.h;

public final class AbstractLiveJsChannel$publish$2 extends SuspendLambda implements p	// class@001d16
{
    public final Object $data;
    public final HashSet $subscribeIds;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public k0 p$;
    public final AbstractLiveJsChannel this$0;

    public void AbstractLiveJsChannel$publish$2(AbstractLiveJsChannel p0,HashSet p1,Object p2,c p3){
       this.this$0 = p0;
       this.$subscribeIds = p1;
       this.$data = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       AbstractLiveJsChannel$publish$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$publish$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new AbstractLiveJsChannel$publish$2(this.this$0, this.$subscribeIds, this.$data, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel$publish$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       AbstractLiveJsChannel$publish$2 opublish$2;
       AbstractLiveJsChannel$publish$2 obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsChannel$publish$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       AbstractLiveJsChannel$publish$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             obj = this.L$1;
             j0.n(p0);
          label_0094 :
             tlabel = p0;
             opublish$2 = obj;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          opublish$2 = new LinkedHashMap();
          Iterator iterator = this.this$0.c.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (a.a(this.$subscribeIds.contains(uEntry.getKey())).booleanValue()) {
                opublish$2.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          if (opublish$2.isEmpty() ^ 1) {
             tlabel = this.$data;
             if (tlabel instanceof String) {
             }else if(tlabel != null){
                this.L$0 = p0;
                this.L$1 = opublish$2;
                this.L$2 = tlabel;
                this.label = 1;
                p0 = this.this$0.g(tlabel, this);
                if (p0 == obj) {
                   return obj;
                }else {
                   LinkedHashMap linkedHashMa = opublish$2;
                   goto label_0094 ;
                }
             }else {
                String str = null;
             }
          }else {
          }
       }
       p0 = new HashSet(opublish$2.values()).iterator();
       while (p0.hasNext()) {
          p0.next().b(tlabel);
       }
       return l1.a;
    }
}
