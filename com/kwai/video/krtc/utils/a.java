package com.kwai.video.krtc.utils.a;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;

public class a	// class@0008be
{
    public static Context a;

    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
       }
       a.a = p0;
       return;
    }
}
