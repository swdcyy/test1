package com.kuaishou.merchant.PreloadContextImpl$mLogger$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.PreloadContextImpl$mLogger$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PreloadContextImpl$mLogger$2 extends Lambda implements a	// class@0014c6
{
    public static final PreloadContextImpl$mLogger$2 INSTANCE;

    static {
       PreloadContextImpl$mLogger$2.INSTANCE = new PreloadContextImpl$mLogger$2();
    }
    public void PreloadContextImpl$mLogger$2(){
       super(0);
    }
    public final PreloadContextImpl$mLogger$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, PreloadContextImpl$mLogger$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PreloadContextImpl$mLogger$2$a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
