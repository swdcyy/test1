package com.kuaishou.live.core.voiceparty.core.shared.a$a$d;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.KtvClose;
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

public final class a$a$d implements o	// class@0013eb
{
    public static final a$a$d a;

    static {
       a$a$d.a = new a$a$d();
    }
    public void a$a$d(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, a$a$d.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, c$d.d);
       }
       return uoa;
    }
}
