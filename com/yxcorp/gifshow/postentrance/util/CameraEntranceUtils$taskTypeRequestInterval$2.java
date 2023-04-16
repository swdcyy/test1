package com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$taskTypeRequestInterval$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class CameraEntranceUtils$taskTypeRequestInterval$2 extends Lambda implements a	// class@00107a
{
    public static final CameraEntranceUtils$taskTypeRequestInterval$2 INSTANCE;

    static {
       CameraEntranceUtils$taskTypeRequestInterval$2.INSTANCE = new CameraEntranceUtils$taskTypeRequestInterval$2();
    }
    public void CameraEntranceUtils$taskTypeRequestInterval$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, CameraEntranceUtils$taskTypeRequestInterval$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("postTaskTypeRequestInterval", 0);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
