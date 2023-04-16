package com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$blockBubbleShow$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class CameraEntranceUtils$blockBubbleShow$2 extends Lambda implements a	// class@001074
{
    public static final CameraEntranceUtils$blockBubbleShow$2 INSTANCE;

    static {
       CameraEntranceUtils$blockBubbleShow$2.INSTANCE = new CameraEntranceUtils$blockBubbleShow$2();
    }
    public void CameraEntranceUtils$blockBubbleShow$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, CameraEntranceUtils$blockBubbleShow$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("blockBubbleShow");
    }
}
