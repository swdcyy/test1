package com.yxcorp.gifshow.detail.common.danmaku.topguide.a$e;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$e implements g	// class@0013fd
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.F = p0.booleanValue();
       }
       return;
    }
}
