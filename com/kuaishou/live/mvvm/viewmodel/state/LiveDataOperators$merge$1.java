package com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$merge$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import msd.p;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class LiveDataOperators$merge$1 extends Lambda implements l	// class@000d10
{
    public final p $mapper;

    public void LiveDataOperators$merge$1(p p0){
       this.$mapper = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDataOperators$merge$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.$mapper.invoke(CollectionsKt___CollectionsKt.m2(p0), CollectionsKt___CollectionsKt.Y2(p0));
    }
}
