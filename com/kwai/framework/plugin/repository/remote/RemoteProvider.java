package com.kwai.framework.plugin.repository.remote.RemoteProvider;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.repository.remote.RemoteProvider$mPluginApiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import td6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import td6.b;

public final class RemoteProvider	// class@000cbd
{
    public final p a;
    public final Context b;

    public void RemoteProvider(Context p0){
       a.p(p0, "context");
       super();
       this.b = p0;
       this.a = s.c(RemoteProvider$mPluginApiService$2.INSTANCE);
    }
    public final a a(){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RemoteProvider remoteProvid = RemoteProvider.class;
       Object obj = PatchProxy.apply(null, this, remoteProvid, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (SystemUtil.L(this.b)) {
          obj1 = PatchProxy.apply(null, this, remoteProvid, "1");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = this.a.getValue();
          }
       }else {
          obj1 = PatchProxy.apply(null, this, remoteProvid, "3");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new b();
          }
       }
       return obj1;
    }
}
