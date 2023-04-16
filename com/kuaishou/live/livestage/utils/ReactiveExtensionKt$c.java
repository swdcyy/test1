package com.kuaishou.live.livestage.utils.ReactiveExtensionKt$c;
import erd.r;
import java.lang.Object;
import oe3.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class ReactiveExtensionKt$c implements r	// class@000bfa
{
    public static final ReactiveExtensionKt$c b;

    static {
       ReactiveExtensionKt$c.b = new ReactiveExtensionKt$c();
    }
    public void ReactiveExtensionKt$c(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactiveExtensionKt$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0.a() != null)? true: false;
       }
       return b;
    }
}
