package com.kwai.video.krtc.rtcengine.camera.KCameraCapturerConfiguration$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KCameraCapturerConfiguration$a extends Enum	// class@000848
{
    public static final KCameraCapturerConfiguration$a a;
    public static final KCameraCapturerConfiguration$a b;
    public static final KCameraCapturerConfiguration$a[] c;

    static {
       KCameraCapturerConfiguration$a uoa = new KCameraCapturerConfiguration$a("CAMERA_REAR", 0);
       KCameraCapturerConfiguration$a.a = uoa;
       KCameraCapturerConfiguration$a uoa1 = new KCameraCapturerConfiguration$a("CAMERA_FRONT", 1);
       KCameraCapturerConfiguration$a.b = uoa1;
       KCameraCapturerConfiguration$a[] uoaArray = new KCameraCapturerConfiguration$a[]{uoa,uoa1};
       KCameraCapturerConfiguration$a.c = uoaArray;
    }
    public void KCameraCapturerConfiguration$a(String p0,int p1){
       super(p0, p1);
    }
    public static KCameraCapturerConfiguration$a valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KCameraCapturerConfiguration$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KCameraCapturerConfiguration$a.class, p0);
    }
    public static KCameraCapturerConfiguration$a[] values(){
       Object obj = PatchProxy.apply(null, null, KCameraCapturerConfiguration$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KCameraCapturerConfiguration$a.c.clone();
    }
}
