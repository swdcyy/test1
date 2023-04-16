package com.kuaishou.live.livestage.utils.ReactiveExtensionKt$a;
import erd.c;
import msd.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import oe3.h;
import kotlin.jvm.internal.a;

public final class ReactiveExtensionKt$a implements c	// class@000bf8
{
    public final p a;

    public void ReactiveExtensionKt$a(p p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       h oh = PatchProxy.applyTwoRefs(p0, p1, this, ReactiveExtensionKt$a.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          a.p(p0, "r");
          a.p(p1, "s");
          oh = new h(this.a.invoke(p0, p1));
       }
       return oh;
    }
}
