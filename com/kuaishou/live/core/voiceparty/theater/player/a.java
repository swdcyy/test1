package com.kuaishou.live.core.voiceparty.theater.player.a;
import com.kuaishou.live.core.voiceparty.theater.player.a$b;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.theater.player.a$a;
import java.util.List;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.theater.player.a$e;
import ok.o;
import com.kuaishou.live.core.voiceparty.theater.player.a$d;

public abstract class a	// class@0019a9
{
    public static final a$b a;

    static {
       a.a = new a$b(null);
    }
    public void a(){
       super();
    }
    public void a(u p0){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this instanceof a$a) {
          return m.s(this.c()).b(a$e.b);
       }
       return false;
    }
    public final boolean b(){
       return this instanceof a$d;
    }
}
