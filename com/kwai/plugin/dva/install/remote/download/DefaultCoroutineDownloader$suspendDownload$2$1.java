package com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader$suspendDownload$2$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader;
import java.lang.String;
import com.kwai.plugin.dva.install.remote.download.c$a;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.kwai.plugin.dva.install.remote.download.a;
import java.lang.IllegalStateException;

public final class DefaultCoroutineDownloader$suspendDownload$2$1 extends SuspendLambda implements p	// class@00136c
{
    public final c$a $callback;
    public final String $dist;
    public final String $md5;
    public final String $pluginId;
    public final int $pluginVersion;
    public final String $url;
    public int label;
    public final DefaultCoroutineDownloader this$0;

    public void DefaultCoroutineDownloader$suspendDownload$2$1(DefaultCoroutineDownloader p0,String p1,int p2,String p3,String p4,String p5,c$a p6,c p7){
       this.this$0 = p0;
       this.$pluginId = p1;
       this.$pluginVersion = p2;
       this.$url = p3;
       this.$dist = p4;
       this.$md5 = p5;
       this.$callback = p6;
       super(2, p7);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, DefaultCoroutineDownloader$suspendDownload$2$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       DefaultCoroutineDownloader$suspendDownload$2$1 osuspendDown = new DefaultCoroutineDownloader$suspendDownload$2$1(this.this$0, this.$pluginId, this.$pluginVersion, this.$url, this.$dist, this.$md5, this.$callback, p1);
       return p0;
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultCoroutineDownloader$suspendDownload$2$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultCoroutineDownloader$suspendDownload$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       this.this$0.a.c(this.$pluginId, this.$pluginVersion, this.$url, this.$dist, this.$md5, this.$callback);
       return l1.a;
    }
}
