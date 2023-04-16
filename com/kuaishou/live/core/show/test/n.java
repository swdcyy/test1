package com.kuaishou.live.core.show.test.n;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class n implements a	// class@0011b7
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "104")) {
          l.l("key_enable_replace_camera_source_by_local_video", Boolean.valueOf(b));
       }
       return;
    }
}
