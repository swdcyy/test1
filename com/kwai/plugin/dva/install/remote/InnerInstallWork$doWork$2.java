package com.kwai.plugin.dva.install.remote.InnerInstallWork$doWork$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.plugin.dva.install.remote.InnerInstallWork;
import java.io.File;
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
import com.kwai.plugin.dva.install.remote.download.b;
import kotlin.jvm.internal.a;
import jj7.a;
import com.kwai.plugin.dva.install.remote.download.c$a;
import jj7.b;
import com.kwai.plugin.dva.install.remote.download.c;

public final class InnerInstallWork$doWork$2 extends SuspendLambda implements p	// class@001362
{
    public final File $apkPath;
    public int label;
    public final InnerInstallWork this$0;

    public void InnerInstallWork$doWork$2(InnerInstallWork p0,File p1,c p2){
       this.this$0 = p0;
       this.$apkPath = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, InnerInstallWork$doWork$2.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new InnerInstallWork$doWork$2(this.this$0, this.$apkPath, p1);
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, InnerInstallWork$doWork$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InnerInstallWork$doWork$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       InnerInstallWork$doWork$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.this$0;
          InnerInstallWork n = p0.n;
          if (n instanceof b) {
             String absolutePath = this.$apkPath.getAbsolutePath();
             a.o(absolutePath, "apkPath.absolutePath");
             p0 = this.this$0;
             this.label = 1;
             if (n.b(p0.j, p0.k, p0.l, absolutePath, p0.m, new a(p0), this) == obj) {
                return obj;
             }
          }else {
             p0 = this.this$0;
             n.c(p0.j, p0.k, p0.l, this.$apkPath.getAbsolutePath(), p0.m, new b(p0));
          }
       }
       return l1.a;
    }
}
