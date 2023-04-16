package com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.c;
import zx5.e;
import zx5.c$a;

public final class TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2 extends Lambda implements a	// class@00115c
{
    public static final TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2 INSTANCE;

    static {
       TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2.INSTANCE = new TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2();
    }
    public void TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       g obj = PatchProxy.apply(null, this, TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.a(-174493078);
       c uoc = (obj != null)? obj.PB(c.class): null;
       boolean b = false;
       if (uoc != null) {
          b = c$a.a(uoc, "tunaLivePerfRatio", b, 2, null);
       }
       return b;
    }
}
