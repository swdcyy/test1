package com.android.kwai.platform.notification.core.HookNotificationBinderInvocationHandler$invoke$$inlined$runCatching$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.android.kwai.platform.notification.core.HookNotificationBinderInvocationHandler;
import java.lang.reflect.Method;
import java.lang.Object;
import java.util.Arrays;

public final class HookNotificationBinderInvocationHandler$invoke$$inlined$runCatching$lambda$1 extends Lambda implements l	// class@000400
{
    public final Object[] $args$inlined;
    public final Method $method$inlined;
    public final HookNotificationBinderInvocationHandler this$0;

    public void HookNotificationBinderInvocationHandler$invoke$$inlined$runCatching$lambda$1(HookNotificationBinderInvocationHandler p0,Method p1,Object[] p2){
       this.this$0 = p0;
       this.$method$inlined = p1;
       this.$args$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(Object[] p0){
       HookNotificationBinderInvocationHandler$invoke$$inlined$runCatching$lambda$1 t$method$inl = this.$method$inlined;
       Object obj = HookNotificationBinderInvocationHandler.a(this.this$0);
       if (p0 != null) {
       }else {
          p0 = new Object[0];
       }
       return t$method$inl.invoke(obj, Arrays.copyOf(p0, p0.length));
    }
}
