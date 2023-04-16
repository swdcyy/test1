package com.yxcorp.gifshow.camerasdk.YtechBizLogger$Companion$holder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.camerasdk.YtechBizLogger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YtechBizLogger$Companion$holder$2 extends Lambda implements a	// class@001002
{
    public static final YtechBizLogger$Companion$holder$2 INSTANCE;

    static {
       YtechBizLogger$Companion$holder$2.INSTANCE = new YtechBizLogger$Companion$holder$2();
    }
    public void YtechBizLogger$Companion$holder$2(){
       super(0);
    }
    public final YtechBizLogger invoke(){
       Object obj = PatchProxy.apply(null, this, YtechBizLogger$Companion$holder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new YtechBizLogger();
    }
    public Object invoke(){
       return this.invoke();
    }
}
