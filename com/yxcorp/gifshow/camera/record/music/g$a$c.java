package com.yxcorp.gifshow.camera.record.music.g$a$c;
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

public final class g$a$c implements o	// class@000e78
{
    public final t b;

    public void g$a$c(t p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       g$a$c uoa$c = PatchProxy.applyOneRefs(p0, this, g$a$c.class, "1");
       if (uoa$c != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa$c = this.b;
       }
       return uoa$c;
    }
}
