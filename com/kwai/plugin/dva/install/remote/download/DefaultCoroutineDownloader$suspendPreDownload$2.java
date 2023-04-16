package com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader$suspendPreDownload$2;
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
import java.lang.IllegalStateException;
import kotlinx.coroutines.CoroutineDispatcher;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader$suspendPreDownload$2$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import kotlinx.coroutines.a;

public final class DefaultCoroutineDownloader$suspendPreDownload$2 extends SuspendLambda implements p	// class@00136f
{
    public final c$a $callback;
    public final String $dist;
    public final String $md5;
    public final String $pluginId;
    public final int $pluginVersion;
    public final String $url;
    public Object L$0;
    public int label;
    public final DefaultCoroutineDownloader this$0;

    public void DefaultCoroutineDownloader$suspendPreDownload$2(DefaultCoroutineDownloader p0,String p1,int p2,String p3,String p4,String p5,c$a p6,c p7){
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
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultCoroutineDownloader$suspendPreDownload$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DefaultCoroutineDownloader$suspendPreDownload$2 osuspendPreD = new DefaultCoroutineDownloader$suspendPreDownload$2(this.this$0, this.$pluginId, this.$pluginVersion, this.$url, this.$dist, this.$md5, this.$callback, p1);
       obj.L$0 = p0;
       return obj;
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultCoroutineDownloader$suspendPreDownload$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       int i = this;
       Object obj = PatchProxy.applyOneRefs(p0, i, DefaultCoroutineDownloader$suspendPreDownload$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       DefaultCoroutineDownloader$suspendPreDownload$2 label = i.label;
       if (label != null) {
          if (label == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          i.label = 1;
          if (a.f(i.L$0, WorkExecutors.d(), null, new DefaultCoroutineDownloader$suspendPreDownload$2$1(i.this$0, i.$pluginId, i.$pluginVersion, i.$url, i.$dist, i.$md5, i.$callback, null), 2, null).p(i) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
