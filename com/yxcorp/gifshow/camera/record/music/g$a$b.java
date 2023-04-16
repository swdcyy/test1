package com.yxcorp.gifshow.camera.record.music.g$a$b;
import erd.o;
import brd.t;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;

public final class g$a$b implements o	// class@000e77
{
    public final t b;

    public void g$a$b(t p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       g$a$b uoa$b = PatchProxy.applyOneRefs(p0, this, g$a$b.class, "1");
       if (uoa$b != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa$b = this.b;
       }
       return uoa$b;
    }
}
