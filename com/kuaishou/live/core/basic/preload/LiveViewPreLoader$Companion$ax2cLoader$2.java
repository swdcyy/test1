package com.kuaishou.live.core.basic.preload.LiveViewPreLoader$Companion$ax2cLoader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r12.a;
import r12.f;

public final class LiveViewPreLoader$Companion$ax2cLoader$2 extends Lambda implements a	// class@0008c6
{
    public static final LiveViewPreLoader$Companion$ax2cLoader$2 INSTANCE;

    static {
       LiveViewPreLoader$Companion$ax2cLoader$2.INSTANCE = new LiveViewPreLoader$Companion$ax2cLoader$2();
    }
    public void LiveViewPreLoader$Companion$ax2cLoader$2(){
       super(0);
    }
    public final LiveViewPreLoader invoke(){
       Object obj = PatchProxy.apply(null, this, LiveViewPreLoader$Companion$ax2cLoader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveViewPreLoader(new a());
    }
    public Object invoke(){
       return this.invoke();
    }
}
