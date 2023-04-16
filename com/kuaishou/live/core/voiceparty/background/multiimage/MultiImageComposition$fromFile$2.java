package com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageComposition$fromFile$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ho2.m$b;
import android.content.Context;
import java.io.File;
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
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$a;
import ho2.i$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;

public final class MultiImageComposition$fromFile$2 extends SuspendLambda implements p	// class@00135e
{
    public final Context $context;
    public final m$b $dynamicConfig;
    public final File $file;
    public Object L$0;
    public int label;
    public k0 p$;

    public void MultiImageComposition$fromFile$2(m$b p0,Context p1,File p2,c p3){
       this.$dynamicConfig = p0;
       this.$context = p1;
       this.$file = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       MultiImageComposition$fromFile$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, MultiImageComposition$fromFile$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new MultiImageComposition$fromFile$2(this.$dynamicConfig, this.$context, this.$file, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MultiImageComposition$fromFile$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       MultiImageComposition$fromFile$2 obj = PatchProxy.applyOneRefs(p0, this, MultiImageComposition$fromFile$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       MultiImageComposition$fromFile$2 tlabel = this.label;
       StringBuilder str = 1;
       if (tlabel != null) {
          if (tlabel == str) {
             obj = this.L$0;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          this.L$0 = p0;
          this.label = str;
          Object obj1 = Inflater.g.a(this.$dynamicConfig, this.$context, this.$file).a(this);
          if (obj1 == obj) {
             return obj;
          }else {
             obj = p0;
             p0 = obj1;
          }
       }
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, obj.getClass().getSimpleName()+" DynamicBackground load success");
       return p0;
    }
}
