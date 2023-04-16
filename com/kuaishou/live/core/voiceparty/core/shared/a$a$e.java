package com.kuaishou.live.core.voiceparty.core.shared.a$a$e;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.TheaterOpen;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import hp2.c$d;
import ut7.h;

public final class a$a$e implements o	// class@0013ec
{
    public static final a$a$e a;

    static {
       a$a$e.a = new a$a$e();
    }
    public void a$a$e(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, a$a$e.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(p0.a, c$d.d);
       }
       return uoa;
    }
}
