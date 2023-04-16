package com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$zipToPair$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class LiveDataOperators$zipToPair$1 extends Lambda implements l	// class@000d15
{
    public static final LiveDataOperators$zipToPair$1 INSTANCE;

    static {
       LiveDataOperators$zipToPair$1.INSTANCE = new LiveDataOperators$zipToPair$1();
    }
    public void LiveDataOperators$zipToPair$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Pair invoke(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDataOperators$zipToPair$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new Pair(CollectionsKt___CollectionsKt.m2(p0), CollectionsKt___CollectionsKt.Y2(p0));
    }
}
