package com.kuaishou.activity.kwaibubble.log.KwaiPopLog$phoneCommonLevel$2;
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

public final class KwaiPopLog$phoneCommonLevel$2 extends Lambda implements a	// class@000781
{
    public static final KwaiPopLog$phoneCommonLevel$2 INSTANCE;

    static {
       KwaiPopLog$phoneCommonLevel$2.INSTANCE = new KwaiPopLog$phoneCommonLevel$2();
    }
    public void KwaiPopLog$phoneCommonLevel$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, KwaiPopLog$phoneCommonLevel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = b.a(-404437045);
       a.o(obj, "Singleton.get\(PhoneLevelUtils::class.java\)");
       return obj.c();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
