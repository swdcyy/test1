package com.kwai.plugin.dva.install.SuspendInstallWork$suspendRun$installDependsTask$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.plugin.dva.install.SuspendInstallWork;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.List;

public final class SuspendInstallWork$suspendRun$installDependsTask$1 extends SuspendLambda implements p	// class@001350
{
    public final PluginConfig $config;
    public int label;
    public final SuspendInstallWork this$0;

    public void SuspendInstallWork$suspendRun$installDependsTask$1(SuspendInstallWork p0,PluginConfig p1,c p2){
       this.this$0 = p0;
       this.$config = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, SuspendInstallWork$suspendRun$installDependsTask$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new SuspendInstallWork$suspendRun$installDependsTask$1(this.this$0, this.$config, p1);
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SuspendInstallWork$suspendRun$installDependsTask$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SuspendInstallWork$suspendRun$installDependsTask$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       SuspendInstallWork$suspendRun$installDependsTask$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.label = 1;
          p0 = this.this$0.c(this.$config.depends, 1, this);
          if (p0 == obj) {
             return obj;
          }
       }
       return p0;
    }
}
