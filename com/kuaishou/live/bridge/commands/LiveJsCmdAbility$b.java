package com.kuaishou.live.bridge.commands.LiveJsCmdAbility$b;
import z1.a;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import o63.m;
import o63.m$a;

public final class LiveJsCmdAbility$b implements a	// class@000dec
{
    public final c a;

    public void LiveJsCmdAbility$b(c p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsCmdAbility$b.class, "1")) {
          return;
       }
       this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, p0, false, 2, null)));
       return;
    }
}
