package b35.f;
import java.lang.String;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.System;
import jw4.c;

public final class f	// class@00033f
{
    public static long a;

    public static final void a(String p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "desc");
       c.a(p0, p1+" cost time: "+(System.currentTimeMillis() - f.a));
       return;
    }
}
