package com.kuaishou.live.jsbridge.AbstractLiveJsCommand$mainScope$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ftd.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.l0;

public final class AbstractLiveJsCommand$mainScope$2 extends Lambda implements a	// class@001d1c
{
    public static final AbstractLiveJsCommand$mainScope$2 INSTANCE;

    static {
       AbstractLiveJsCommand$mainScope$2.INSTANCE = new AbstractLiveJsCommand$mainScope$2();
    }
    public void AbstractLiveJsCommand$mainScope$2(){
       super(0);
    }
    public final k0 invoke(){
       Object obj = PatchProxy.apply(null, this, AbstractLiveJsCommand$mainScope$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l0.b();
    }
    public Object invoke(){
       return this.invoke();
    }
}
