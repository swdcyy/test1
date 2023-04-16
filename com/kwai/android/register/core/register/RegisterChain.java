package com.kwai.android.register.core.register.RegisterChain;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.common.bean.Channel;
import android.content.Context;
import java.lang.String;
import java.util.LinkedList;
import java.lang.ClassLoader;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import nsd.u;
import java.lang.Thread;
import java.util.Map;

public final class RegisterChain extends Chain	// class@0009fc
{
    public final Channel channel;
    public Context context;
    public final Map internalParam;
    public final String processName;
    public ClassLoader registerClassLoader;

    public void RegisterChain(Channel p0,Context p1,String p2,LinkedList p3,ClassLoader p4){
       a.p(p0, "channel");
       a.p(p1, "context");
       a.p(p2, "processName");
       a.p(p3, "initInterceptors");
       a.p(p4, "registerClassLoader");
       super(p3);
       this.channel = p0;
       this.context = p1;
       this.processName = p2;
       this.registerClassLoader = p4;
       this.internalParam = new LinkedHashMap();
    }
    public void RegisterChain(Channel p0,Context p1,String p2,LinkedList p3,ClassLoader p4,int p5,u p6){
       Thread thread;
       if (p5 & 0x10) {
          thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          thread = thread.getContextClassLoader();
          a.m(thread);
       }
       super(p0, p1, p2, p3, thread);
       return;
    }
    public final Channel getChannel(){
       return this.channel;
    }
    public final Context getContext(){
       return this.context;
    }
    public final Map getInternalParam$lib_register_release(){
       return this.internalParam;
    }
    public final String getProcessName(){
       return this.processName;
    }
    public final ClassLoader getRegisterClassLoader(){
       return this.registerClassLoader;
    }
    public final void setContext(Context p0){
       a.p(p0, "<set-?>");
       this.context = p0;
    }
    public final void setRegisterClassLoader(ClassLoader p0){
       a.p(p0, "<set-?>");
       this.registerClassLoader = p0;
    }
}
