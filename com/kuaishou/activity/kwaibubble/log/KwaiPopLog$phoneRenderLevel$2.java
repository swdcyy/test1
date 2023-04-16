package com.kuaishou.activity.kwaibubble.log.KwaiPopLog$phoneRenderLevel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.Integer;

public final class KwaiPopLog$phoneRenderLevel$2 extends Lambda implements a	// class@000782
{
    public static final KwaiPopLog$phoneRenderLevel$2 INSTANCE;

    static {
       KwaiPopLog$phoneRenderLevel$2.INSTANCE = new KwaiPopLog$phoneRenderLevel$2();
    }
    public void KwaiPopLog$phoneRenderLevel$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, KwaiPopLog$phoneRenderLevel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = b.a(-404437045);
       a.o(obj, "Singleton.get\(PhoneLevelUtils::class.java\)");
       return obj.d();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
