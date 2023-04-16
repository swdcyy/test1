package com.kuaishou.live.core.voiceparty.core.shared.a$a$f;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.TheaterClose;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import hp2.c$d;
import ut7.h;

public final class a$a$f implements o	// class@0013ed
{
    public static final a$a$f a;

    static {
       a$a$f.a = new a$a$f();
    }
    public void a$a$f(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, a$a$f.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, c$d.d);
       }
       return uoa;
    }
}
