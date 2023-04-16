package com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$e;
import erd.o;
import java.lang.Object;
import ht2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import kotlin.jvm.internal.a;

public final class TransformerKt$e implements o	// class@001582
{
    public static final TransformerKt$e b;

    static {
       TransformerKt$e.b = new TransformerKt$e();
    }
    public void TransformerKt$e(){
       super();
    }
    public Object apply(Object p0){
       Optional optional = PatchProxy.applyOneRefs(p0, this, TransformerKt$e.class, "1");
       if (optional != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          optional = Optional.of(p0);
       }
       return optional;
    }
}
