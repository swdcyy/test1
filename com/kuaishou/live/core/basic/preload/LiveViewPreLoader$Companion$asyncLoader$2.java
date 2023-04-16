package com.kuaishou.live.core.basic.preload.LiveViewPreLoader$Companion$asyncLoader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r12.d;
import r12.f;

public final class LiveViewPreLoader$Companion$asyncLoader$2 extends Lambda implements a	// class@0008c5
{
    public static final LiveViewPreLoader$Companion$asyncLoader$2 INSTANCE;

    static {
       LiveViewPreLoader$Companion$asyncLoader$2.INSTANCE = new LiveViewPreLoader$Companion$asyncLoader$2();
    }
    public void LiveViewPreLoader$Companion$asyncLoader$2(){
       super(0);
    }
    public final LiveViewPreLoader invoke(){
       Object obj = PatchProxy.apply(null, this, LiveViewPreLoader$Companion$asyncLoader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveViewPreLoader(new d());
    }
    public Object invoke(){
       return this.invoke();
    }
}
