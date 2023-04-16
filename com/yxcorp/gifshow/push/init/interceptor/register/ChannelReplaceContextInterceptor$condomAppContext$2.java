package com.yxcorp.gifshow.push.init.interceptor.register.ChannelReplaceContextInterceptor$condomAppContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.ContextWrapper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.oasisfeng.condom.CondomOptions;
import com.yxcorp.gifshow.push.init.interceptor.register.ChannelReplaceContextInterceptor$condomAppContext$2$a;
import com.oasisfeng.condom.OutboundJudge;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import com.oasisfeng.condom.CondomContext;

public final class ChannelReplaceContextInterceptor$condomAppContext$2 extends Lambda implements a	// class@0012f8
{
    public static final ChannelReplaceContextInterceptor$condomAppContext$2 INSTANCE;

    static {
       ChannelReplaceContextInterceptor$condomAppContext$2.INSTANCE = new ChannelReplaceContextInterceptor$condomAppContext$2();
    }
    public void ChannelReplaceContextInterceptor$condomAppContext$2(){
       super(0);
    }
    public final ContextWrapper invoke(){
       CondomOptions obj = PatchProxy.apply(null, this, ChannelReplaceContextInterceptor$condomAppContext$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CondomOptions();
       obj.setOutboundJudge(ChannelReplaceContextInterceptor$condomAppContext$2$a.a);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       CondomContext uCondomConte = CondomContext.wrap(uoc.a(), null, obj);
       if (uCondomConte == null) {
          c uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          uCondomConte = uoc1.a();
       }
       return uCondomConte;
    }
    public Object invoke(){
       return this.invoke();
    }
}
