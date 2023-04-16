package com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$merge$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import msd.q;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveDataOperators$merge$2 extends Lambda implements l	// class@000d11
{
    public final q $mapper;

    public void LiveDataOperators$merge$2(q p0){
       this.$mapper = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDataOperators$merge$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.$mapper.invoke(p0.get(0), p0.get(1), p0.get(2));
    }
}
