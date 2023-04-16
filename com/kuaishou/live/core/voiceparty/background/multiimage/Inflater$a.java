package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$a;
import java.lang.Object;
import nsd.u;
import ho2.m$b;
import android.content.Context;
import java.io.File;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import com.google.gson.Gson;
import ho2.c;
import com.kuaishou.live.core.voiceparty.background.multiimage.Coordinate;
import java.lang.IllegalArgumentException;

public final class Inflater$a	// class@001355
{

    public void Inflater$a(){
       super();
    }
    public void Inflater$a(u p0){
       super();
    }
    public final Inflater a(m$b p0,Context p1,File p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, Inflater$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dynamicConfig");
       a.p(p1, "context");
       a.p(p2, "dir");
       Object obj1 = new Gson().h(FilesKt__FileReadWriteKt.z(new File(p2, "config.json"), null, 1, null), c.class);
       a.o(obj1, "desc");
       if (!PatchProxy.applyVoidOneRefs(obj1, this, Inflater$a.class, "2") && (!obj1.a().b() || !obj1.a().a())) {
          throw new IllegalArgumentException("coordinate.width == 0 or coordinate.height == 0");
       }
       Inflater inflater = new Inflater(p1, p2, obj1, p0, null);
       return obj;
    }
}
