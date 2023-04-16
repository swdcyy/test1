package com.yxcorp.gifshow.ad.fill.AdNotShownCache$Companion$INSTANCE$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class AdNotShownCache$Companion$INSTANCE$2 extends Lambda implements a	// class@00176f
{
    public static final AdNotShownCache$Companion$INSTANCE$2 INSTANCE;

    static {
       AdNotShownCache$Companion$INSTANCE$2.INSTANCE = new AdNotShownCache$Companion$INSTANCE$2();
    }
    public void AdNotShownCache$Companion$INSTANCE$2(){
       super(0);
    }
    public final AdNotShownCache invoke(){
       Object obj = PatchProxy.apply(null, this, AdNotShownCache$Companion$INSTANCE$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AdNotShownCache(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
