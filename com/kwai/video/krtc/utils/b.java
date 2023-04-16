package com.kwai.video.krtc.utils.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;

public class b	// class@0008bf
{

    public static boolean a(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(p0);
       if (obj.exists()) {
          return obj.isDirectory();
       }
       return obj.mkdirs();
    }
}
