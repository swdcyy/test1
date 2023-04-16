package com.kwai.framework.network.monitor.Inet6AddressReporter$addInet6AddressLocked$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.network.monitor.Inet6AddressReporter;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.net.Inet6Address;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class Inet6AddressReporter$addInet6AddressLocked$2 extends Lambda implements l	// class@0017fa
{
    public final Ref$ObjectRef $hardwareAddress;
    public final Inet6AddressReporter this$0;

    public void Inet6AddressReporter$addInet6AddressLocked$2(Inet6AddressReporter p0,Ref$ObjectRef p1){
       this.this$0 = p0;
       this.$hardwareAddress = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Inet6Address p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Inet6AddressReporter$addInet6AddressLocked$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return this.this$0.b(p0, this.$hardwareAddress.element);
    }
}
