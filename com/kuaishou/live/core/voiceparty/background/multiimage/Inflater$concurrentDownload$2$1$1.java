package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$concurrentDownload$2$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.io.File;
import java.lang.String;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageDownloadUtils;
import com.kuaishou.live.common.core.basic.tools.g$d$a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.live.common.core.basic.tools.g$d;

public final class Inflater$concurrentDownload$2$1$1 extends SuspendLambda implements p	// class@001357
{
    public final File $file;
    public final String $url;
    public Object L$0;
    public int label;
    public k0 p$;

    public void Inflater$concurrentDownload$2$1$1(File p0,String p1,c p2){
       this.$file = p0;
       this.$url = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       Inflater$concurrentDownload$2$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$concurrentDownload$2$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new Inflater$concurrentDownload$2$1$1(this.$file, this.$url, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$concurrentDownload$2$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Inflater$concurrentDownload$2$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       Inflater$concurrentDownload$2$1$1 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          if (!this.$file.exists()) {
             Inflater$concurrentDownload$2$1$1 t$file = this.$file;
             this.L$0 = p0;
             this.label = i;
             Objects.requireNonNull(Inflater.g);
             g$d$a uod$a = new g$d$a();
             String[] stringArray = new String[i];
             stringArray[0] = this.$url;
             uod$a.i(stringArray);
             File parentFile = t$file.getParentFile();
             a.m(parentFile);
             uod$a.g(parentFile.getAbsolutePath());
             uod$a.h(t$file.getName());
             uod$a.c(DownloadTask$DownloadTaskType.IMMEDIATE);
             uod$a.a("live_voice_party_background");
             g$d uod = uod$a.b();
             a.o(uod, "LiveDownloadUtils.TaskIn¡­URCES\)\n          .build\(\)");
             p0 = MultiImageDownloadUtils.a.a(uod, this);
             if (p0 != b.h()) {
                p0 = l1.a;
             }
             if (p0 == obj) {
                return obj;
             }
          }
       }
       return l1.a;
    }
}
