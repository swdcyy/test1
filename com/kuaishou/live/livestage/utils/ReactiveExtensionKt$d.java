package com.kuaishou.live.livestage.utils.ReactiveExtensionKt$d;
import erd.o;
import java.lang.Object;
import oe3.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ReactiveExtensionKt$d implements o	// class@000bfb
{
    public static final ReactiveExtensionKt$d b;

    static {
       ReactiveExtensionKt$d.b = new ReactiveExtensionKt$d();
    }
    public void ReactiveExtensionKt$d(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactiveExtensionKt$d.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.a();
          a.m(obj);
       }
       return obj;
    }
}
