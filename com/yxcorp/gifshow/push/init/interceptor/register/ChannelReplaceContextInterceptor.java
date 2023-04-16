package com.yxcorp.gifshow.push.init.interceptor.register.ChannelReplaceContextInterceptor;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import com.yxcorp.gifshow.push.init.interceptor.register.ChannelReplaceContextInterceptor$condomAppContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.register.RegisterChain;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import t6c.d;
import java.lang.Enum;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.robust.PatchProxyResult;

public final class ChannelReplaceContextInterceptor extends BaseChannelInterceptor	// class@0012f9
{
    public final p a;

    public void ChannelReplaceContextInterceptor(){
       super();
       this.a = s.c(ChannelReplaceContextInterceptor$condomAppContext$2.INSTANCE);
    }
    public void intercept(Chain p0){
       Application uApplication;
       Plugin plugin;
       Context applicationC;
       ChannelReplaceContextInterceptor uChannelRepl = ChannelReplaceContextInterceptor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uChannelRepl, "2")) {
       }else {
          a.p(p0, "chain");
          int i = d.a[p0.getChannel().ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   uApplication = a.b();
                   a.o(uApplication, "AppEnv.getAppContext\(\)");
                   p0.setContext(uApplication);
                }else {
                   plugin = Dva.instance().getPlugin("push_lib_honor_plugin");
                   if (plugin != null) {
                      uApplication = plugin.getApplication();
                      if (uApplication != null) {
                         applicationC = uApplication.getApplicationContext();
                         a.o(applicationC, "it.applicationContext");
                         p0.setContext(applicationC);
                      }
                   }
                }
             }else {
                plugin = Dva.instance().getPlugin("push_lib_plugin");
                if (plugin != null) {
                   uApplication = plugin.getApplication();
                   if (uApplication != null) {
                      applicationC = uApplication.getApplicationContext();
                      a.o(applicationC, "it.applicationContext");
                      p0.setContext(applicationC);
                   }
                }
             }
          }else {
             applicationC = PatchProxy.apply(null, this, uChannelRepl, "1");
             if (applicationC == PatchProxyResult.class) {
                applicationC = this.a.getValue();
             }
             p0.setContext(applicationC);
          }
       label_0088 :
          p0.proceed();
       }
       return;
    }
}
