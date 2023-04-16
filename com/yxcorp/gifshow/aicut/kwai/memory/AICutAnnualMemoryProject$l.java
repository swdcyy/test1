package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$l;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i79.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class AICutAnnualMemoryProject$l implements o	// class@00195c
{
    public static final AICutAnnualMemoryProject$l b;

    static {
       AICutAnnualMemoryProject$l.b = new AICutAnnualMemoryProject$l();
    }
    public void AICutAnnualMemoryProject$l(){
       super();
    }
    public Object apply(Object p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$l.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          PostUtils.D("AICutAnnualMemoryProject", "changeStyle getVideoStartEnd", p0);
          uoc = new c();
          uoc.a(100);
       }
       return uoc;
    }
}
