package com.yxcorp.gifshow.camera.record.video.r;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.video.RecordFragment;
import j8c.a;
import java.lang.String;
import w46.b;
import vf9.j0;

public final class r implements Callable	// class@000f91
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final Object call(){
       Object[] objArray = new Object[0];
       a.D().t("CameraBaseFragment", "isNeedDelayCaptureAfterAudioRenderingStart, Ω” ’MusicRenderingStartEvent ≥¨ ±", objArray);
       return new j0(0, true);
    }
}
