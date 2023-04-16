package com.kuaishou.live.bridge.commands.LiveJsCmdAbility$onExecute$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.live.bridge.commands.LiveJsCmdAbility;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.j$a;

public final class LiveJsCmdAbility$onExecute$1 extends ContinuationImpl	// class@000ded
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public Object result;
    public final LiveJsCmdAbility this$0;

    public void LiveJsCmdAbility$onExecute$1(LiveJsCmdAbility p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdAbility$onExecute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.l(null, null, this);
    }
}
