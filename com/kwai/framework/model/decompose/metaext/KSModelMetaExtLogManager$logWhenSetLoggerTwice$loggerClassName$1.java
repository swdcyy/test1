package com.kwai.framework.model.decompose.metaext.KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.framework.model.decompose.metaext.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1 extends Lambda implements l	// class@0016aa
{
    public static final KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1 INSTANCE;

    static {
       KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1.INSTANCE = new KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1();
    }
    public void KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(a p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          str = "null";
       }else {
          str = p0.getClass().getName();
          a.o(str, "it::class.java.name");
       }
       return str;
    }
}
