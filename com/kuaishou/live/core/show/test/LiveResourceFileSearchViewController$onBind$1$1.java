package com.kuaishou.live.core.show.test.LiveResourceFileSearchViewController$onBind$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.core.show.test.LiveResourceFileSearchViewController$onBind$1;
import kotlin.jvm.internal.Ref$ObjectRef;
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
import android.widget.TextView;
import qrd.j0;
import java.lang.IllegalStateException;
import il2.k;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.core.show.test.LiveResourceFileSearchViewController$onBind$1$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;
import java.lang.CharSequence;

public final class LiveResourceFileSearchViewController$onBind$1$1 extends SuspendLambda implements p	// class@001191
{
    public final Ref$ObjectRef $dir;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;
    public final LiveResourceFileSearchViewController$onBind$1 this$0;

    public void LiveResourceFileSearchViewController$onBind$1$1(LiveResourceFileSearchViewController$onBind$1 p0,Ref$ObjectRef p1,c p2){
       this.this$0 = p0;
       this.$dir = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveResourceFileSearchViewController$onBind$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveResourceFileSearchViewController$onBind$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveResourceFileSearchViewController$onBind$1$1(this.this$0, this.$dir, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveResourceFileSearchViewController$onBind$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       LiveResourceFileSearchViewController$onBind$1$1 obj = PatchProxy.applyOneRefs(p0, this, LiveResourceFileSearchViewController$onBind$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveResourceFileSearchViewController$onBind$1$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             obj = this.L$1;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          k d = this.this$0.b.d;
          this.L$0 = this.p$;
          this.L$1 = d;
          this.label = 1;
          p0 = a.i(z0.f(), new LiveResourceFileSearchViewController$onBind$1$1$1(this, null), this);
          if (p0 == obj) {
             return obj;
          }else {
             k ok = d;
          }
       }
       obj.setText(p0);
       return l1.a;
    }
}
