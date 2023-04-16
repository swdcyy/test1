package com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$enableLongClickToAlbum$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import com.kwai.framework.abtest.f;

public final class CameraEntranceUtils$enableLongClickToAlbum$2 extends Lambda implements a	// class@001078
{
    public static final CameraEntranceUtils$enableLongClickToAlbum$2 INSTANCE;

    static {
       CameraEntranceUtils$enableLongClickToAlbum$2.INSTANCE = new CameraEntranceUtils$enableLongClickToAlbum$2();
    }
    public void CameraEntranceUtils$enableLongClickToAlbum$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, CameraEntranceUtils$enableLongClickToAlbum$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d.k() || f.a("enablePressEnterAlbum"))? true: false;
       return b;
    }
}
