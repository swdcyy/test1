package com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$enablePostTKBubble$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import xf6.d;
import com.kwai.sdk.switchconfig.a;

public final class CameraEntranceUtils$enablePostTKBubble$2 extends Lambda implements a	// class@001079
{
    public static final CameraEntranceUtils$enablePostTKBubble$2 INSTANCE;

    static {
       CameraEntranceUtils$enablePostTKBubble$2.INSTANCE = new CameraEntranceUtils$enablePostTKBubble$2();
    }
    public void CameraEntranceUtils$enablePostTKBubble$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       c obj = PatchProxy.apply(null, this, CameraEntranceUtils$enablePostTKBubble$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       boolean b = true;
       if (obj.c()) {
          int i = d.L();
          if (i != b) {
             b = (i != 2)? a.t().d("postEntranceBubbleCreatorSupportTK", false): false;
          }
       }else {
          b = a.t().d("postEntranceBubbleCreatorSupportTK", false);
       }
       return b;
    }
}
