package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements$prepareLottieResource$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public final class Inflater$InitElements$prepareLottieResource$1 extends ContinuationImpl	// class@001352
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public Object result;
    public final Inflater$InitElements this$0;

    public void Inflater$InitElements$prepareLottieResource$1(Inflater$InitElements p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Inflater$InitElements$prepareLottieResource$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.e(null, this);
    }
}