package com.kwai.platform.keventbus.KEventBus$c;
import erd.o;
import java.lang.Object;
import com.kwai.platform.keventbus.KEventBus$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KEventBus$c implements o	// class@001286
{
    public static final KEventBus$c b;

    static {
       KEventBus$c.b = new KEventBus$c();
    }
    public void KEventBus$c(){
       super();
    }
    public Object apply(Object p0){
       KEventBus$a uoa = PatchProxy.applyOneRefs(p0, this, KEventBus$c.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa = new KEventBus$a(p0.a(), p0.b());
       }
       return uoa;
    }
}
