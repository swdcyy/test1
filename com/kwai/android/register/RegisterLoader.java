package com.kwai.android.register.RegisterLoader;
import com.kwai.android.register.RegisterLoader$Companion;
import nsd.u;
import android.app.Application;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import com.kwai.android.register.core.register.ChannelInitHeaderLogInterceptor;
import com.kwai.android.register.core.register.ChannelRestrictInterceptor;
import java.util.Iterator;
import com.kwai.android.common.intercept.Interceptor;
import com.kwai.android.register.core.register.ChannelInitInterceptor;
import java.util.Map;
import com.kwai.android.register.core.register.ChannelInitFooterLogInterceptor;
import java.util.ArrayList;
import com.kwai.android.common.bean.Channel;
import java.util.Arrays;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import com.kwai.android.register.core.register.RegisterChain;
import android.content.Context;
import com.kwai.android.common.ext.ContextExtKt;
import java.lang.ClassLoader;
import java.lang.Boolean;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;

public final class RegisterLoader	// class@0009dd
{
    public final LinkedList interceptorLinked;
    public final Map registerInstances;
    public static final RegisterLoader$Companion Companion;

    static {
       RegisterLoader.Companion = new RegisterLoader$Companion(null);
    }
    public void RegisterLoader(Application p0,long p1,List p2){
       a.p(p0, "application");
       a.p(p2, "interceptors");
       super();
       LinkedList linkedList = new LinkedList();
       this.interceptorLinked = linkedList;
       this.registerInstances = new LinkedHashMap();
       linkedList.add(new ChannelInitHeaderLogInterceptor(p1));
       linkedList.add(new ChannelRestrictInterceptor());
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          this.interceptorLinked.add(iterator.next());
       }
       this.interceptorLinked.add(new ChannelInitInterceptor(this.registerInstances));
       this.interceptorLinked.add(new ChannelInitFooterLogInterceptor());
       Channel[] uChannelArra = Channel.values();
       iterator = new ArrayList(CollectionsKt__CollectionsKt.L(Arrays.copyOf(uChannelArra, uChannelArra.length))).iterator();
       while (iterator.hasNext()) {
          Channel uChannel = iterator.next();
          if (uChannel.isLoadable != null) {
             Channel uChannel1 = uChannel;
             while (true) {
                a.m(uChannel1);
                RegisterChain registerChai = new RegisterChain(uChannel1, p0, ContextExtKt.getProcessName(p0), this.interceptorLinked, null, 16, null);
                if (uChannel != uChannel1) {
                   v8.getInternalParam$lib_register_release().put("retry_ignore_restrict", Boolean.TRUE);
                }
                v8.proceed();
                String str = "retry_other_channel";
                Context uContext = null;
                if (v8.getInternalParam$lib_register_release().containsKey(str)) {
                   uChannel1 = v8.getInternalParam$lib_register_release().get(str);
                   PushLogcat.INSTANCE.i("KwaiPushSDK", "received retry request from "+uChannel+" for load other channel, retry to load "+uChannel1+"...");
                   if (uChannel1 != null && uChannel1 != uChannel) {
                      uContext = 1;
                   }
                }
                if (!uContext) {
                   continue ;
                }else {
                   continue ;
                }
             }
             return;
          }
       }
    }
    public final Map getRegisterInstances(){
       return this.registerInstances;
    }
}
