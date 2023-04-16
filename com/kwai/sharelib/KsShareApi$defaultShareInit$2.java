package com.kwai.sharelib.KsShareApi$defaultShareInit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsShareApi$defaultShareInit$2 extends Lambda implements a	// class@001693
{
    public static final KsShareApi$defaultShareInit$2 INSTANCE;

    static {
       KsShareApi$defaultShareInit$2.INSTANCE = new KsShareApi$defaultShareInit$2();
    }
    public void KsShareApi$defaultShareInit$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final LinkedHashMap invoke(){
       Object obj = PatchProxy.apply(null, this, KsShareApi$defaultShareInit$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinkedHashMap();
    }
}
