package com.kuaishou.live.bridge.commands.LiveJsCmdGetInteractMagicFaceInfo$onExecute$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetInteractMagicFaceInfo;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.j$a;

public final class LiveJsCmdGetInteractMagicFaceInfo$onExecute$1 extends ContinuationImpl	// class@000df2
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object result;
    public final LiveJsCmdGetInteractMagicFaceInfo this$0;

    public void LiveJsCmdGetInteractMagicFaceInfo$onExecute$1(LiveJsCmdGetInteractMagicFaceInfo p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdGetInteractMagicFaceInfo$onExecute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.l(null, null, this);
    }
}
