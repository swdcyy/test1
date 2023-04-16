package com.kuaishou.live.core.voiceparty.playway.video.camera.a;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;

public final class a implements o	// class@0018d9
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "e");
          ot = t.error(p0);
       }
       return ot;
    }
}
