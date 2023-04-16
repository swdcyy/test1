package com.kwai.android.register.core.register.ChannelInitInterceptor;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.register.Register;
import com.kwai.android.register.core.register.RegisterChain;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.Channel;
import java.lang.Enum;
import com.kwai.android.common.exceptions.RegisterFailureException;
import java.lang.Throwable;
import nsd.u;
import com.kwai.android.common.intercept.Chain;
import java.lang.Class;
import java.lang.reflect.Constructor;
import android.content.Context;
import java.lang.ClassLoader;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.android.register.Register$Companion;
import com.kwai.android.register.core.register.ChannelInitInterceptor$intercept$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;
import java.lang.NullPointerException;

public final class ChannelInitInterceptor extends BaseChannelInterceptor	// class@0009f9
{
    public final Map registerInstances;

    public void ChannelInitInterceptor(Map p0){
       a.p(p0, "registerInstances");
       super();
       this.registerInstances = p0;
    }
    public final boolean doRegister(Register p0,RegisterChain p1){
       String str = " channel fatal result false!";
       boolean b = p0.register();
       if (b) {
          PushLogcat.INSTANCE.i("KwaiPushSDK", "load "+p1.getChannel().name()+" channel successful!");
       }else {
          p1.setException(new RegisterFailureException("load "+p1.getChannel().name()+str, null, 2, null));
          PushLogcat.INSTANCE.i("KwaiPushSDK", "load "+p1.getChannel().name()+str);
       }
       return b;
    }
    public final Constructor getConstructor(Class p0){
       Constructor uConstructor = null;
       if (p0 == null) {
       }else {
          Class[] uClassArray = new Class[]{Context.class};
          uConstructor = p0.getConstructor(uClassArray);
       }
       return uConstructor;
    }
    public void intercept(Chain p0){
       this.intercept(p0);
    }
    public void intercept(RegisterChain p0){
       Register register;
       a.p(p0, "chain");
       Channel classPath = p0.getChannel().classPath;
       a.o(classPath, "chain.channel.classPath");
       Class uClass = this.loadChannel(classPath, p0.getRegisterClassLoader());
       Constructor constructor = this.getConstructor(uClass);
       Ref$ObjectRef objectRef = null;
       if (uClass != null && constructor != null) {
          Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
          register = this.registerInstances.get(p0.getChannel());
          if (register == null) {
             Object[] objArray = new Object[]{p0.getContext()};
             Object obj = constructor.newInstance(objArray);
             if (obj != null) {
                register = obj;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type com.kwai.android.register.Register");
             }
          }
          objectRef1.element = register;
          Register$Companion companion = Register.Companion;
          companion.getRegisterSuccessChannel().add(p0.getChannel());
          if (p0.getChannel().isSupportWorkThreadInit != null) {
             if (!this.doRegister(objectRef1.element, p0)) {
                companion.getRegisterSuccessChannel().remove(p0.getChannel());
             }else {
                this.registerInstances.put(p0.getChannel(), objectRef1.element);
             }
             p0.proceed();
          }else {
             a.h(objectRef, new ChannelInitInterceptor$intercept$1(this, objectRef1, p0, objectRef), 1, objectRef);
          }
       }else {
          PushLogcat.e$default(PushLogcat.INSTANCE, "KwaiPushSDK", "not load "+p0.getChannel().name()+" channel case register is null! clz: "+uClass, null, 4, null);
          p0.setException(new RegisterFailureException("not load "+p0.getChannel().name()+" channel, case register is null!", objectRef, 2, objectRef));
          p0.proceed();
       }
       return;
    }
    public final Class loadChannel(String p0,ClassLoader p1){
       Class uClass = p1.loadClass(p0);
       return uClass;
    }
}
