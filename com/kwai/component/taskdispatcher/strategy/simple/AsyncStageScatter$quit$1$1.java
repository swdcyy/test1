package com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$quit$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import eh5.q;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AsyncStageScatter$quit$1$1 extends Lambda implements l	// class@000bb8
{
    public static final AsyncStageScatter$quit$1$1 INSTANCE;

    static {
       AsyncStageScatter$quit$1$1.INSTANCE = new AsyncStageScatter$quit$1$1();
    }
    public void AsyncStageScatter$quit$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AsyncStageScatter$quit$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       p0.h();
       return true;
    }
}
