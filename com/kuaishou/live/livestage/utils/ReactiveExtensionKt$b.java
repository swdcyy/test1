package com.kuaishou.live.livestage.utils.ReactiveExtensionKt$b;
import erd.o;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt$defaultIfTimeout$mapper$1;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ReactiveExtensionKt$b implements o	// class@000bf9
{
    public final ReactiveExtensionKt$defaultIfTimeout$mapper$1 b;

    public void ReactiveExtensionKt$b(ReactiveExtensionKt$defaultIfTimeout$mapper$1 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       ReactiveExtensionKt$b uob = PatchProxy.applyOneRefs(p0, this, ReactiveExtensionKt$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uob = this.b;
       }
       return uob;
    }
}
