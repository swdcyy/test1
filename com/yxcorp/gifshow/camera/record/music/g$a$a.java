package com.yxcorp.gifshow.camera.record.music.g$a$a;
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

public final class g$a$a implements o	// class@000e76
{
    public final t b;

    public void g$a$a(t p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       g$a$a uoa$a = PatchProxy.applyOneRefs(p0, this, g$a$a.class, "1");
       if (uoa$a != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa$a = this.b;
       }
       return uoa$a;
    }
}
