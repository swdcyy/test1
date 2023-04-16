package com.kuaishou.live.liteend.baseinfo.b;
import ok.x;
import com.kuaishou.live.liteend.baseinfo.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.liteend.baseinfo.g;
import com.kwai.framework.model.user.User;
import xp5.g;
import ae3.b;
import z1.a;
import java.lang.Runnable;

public final class b implements x	// class@000bbd
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final Object get(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       g og = PatchProxy.apply(null, tb, c.class, "4");
       if (og != PatchProxyResult.class) {
       }else {
          g og1 = new g(tb.k.I(), tb.n, new b(tb), tb.o);
       }
       return og;
    }
}
