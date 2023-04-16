package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdEncourageTreasureShowResultDialog$showResultDialogFragment$dialogFragment$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import asd.c;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import o63.m;
import k71.f$b;
import o63.m$a;
import kotlin.Result;

public final class LiveJsCmdEncourageTreasureShowResultDialog$showResultDialogFragment$dialogFragment$1 extends Lambda implements l	// class@000e08
{
    public final c $continuation;

    public void LiveJsCmdEncourageTreasureShowResultDialog$showResultDialogFragment$dialogFragment$1(c p0){
       this.$continuation = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(LiveJsCmdEncourageTreasureShowResultDialog$showResultDialogFragment$dialogFragment$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveJsCmdEncourageTreasureShowResultDialog$showResultDialogFragment$dialogFragment$1.class, "1")) {
          return;
       }
       this.$continuation.resumeWith(Result.constructor-impl(m$a.g(m.g, new f$b(p0), false, 2, null)));
       return;
    }
}
