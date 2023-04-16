package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$queryRapResult$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import njd.a;

public final class RapRepo$Task$queryRapResult$1 extends ContinuationImpl	// class@0010b7
{
    public float F$0;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final RapRepo$Task this$0;

    public void RapRepo$Task$queryRapResult$1(RapRepo$Task p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RapRepo$Task$queryRapResult$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.f(null, null, 0, 0, this);
    }
}
