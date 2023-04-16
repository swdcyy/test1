package com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$mergeToTriple$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import kotlin.Triple;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveDataOperators$mergeToTriple$1 extends Lambda implements l	// class@000d13
{
    public static final LiveDataOperators$mergeToTriple$1 INSTANCE;

    static {
       LiveDataOperators$mergeToTriple$1.INSTANCE = new LiveDataOperators$mergeToTriple$1();
    }
    public void LiveDataOperators$mergeToTriple$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Triple invoke(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDataOperators$mergeToTriple$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new Triple(p0.get(0), p0.get(1), p0.get(2));
    }
}
