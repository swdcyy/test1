package com.kwai.feature.api.social.reminder.push.PushConfigConsumer$doAccept$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sx5.h;
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
import hm8.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.IllegalStateException;

public final class PushConfigConsumer$doAccept$1$1 extends SuspendLambda implements p	// class@0011c0
{
    public final h $this_run;
    public int label;
    public k0 p$;

    public void PushConfigConsumer$doAccept$1$1(h p0,c p1){
       this.$this_run = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       PushConfigConsumer$doAccept$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PushConfigConsumer$doAccept$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new PushConfigConsumer$doAccept$1$1(this.$this_run, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PushConfigConsumer$doAccept$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SharedPreferences$Editor uEditor;
       String obj = PatchProxy.applyOneRefs(p0, this, PushConfigConsumer$doAccept$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.$this_run.popConfig;
       obj = "user";
       if (p0 != null) {
          uEditor = b.a.edit();
          uEditor.putString(b.d(obj)+"popConfig", b.e(p0));
          g.a(uEditor);
       }else {
          b.e();
          b.f();
       }
       p0 = this.$this_run.barConfig;
       if (p0 != null) {
          uEditor = b.a.edit();
          uEditor.putString(b.d(obj)+"barConfig", b.e(p0));
          g.a(uEditor);
       }else {
          b.c();
          b.d();
       }
       return l1.a;
    }
}
