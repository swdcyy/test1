package hg9.y;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.camerasdk.videoCapture.CameraController;

public final class y implements Runnable	// class@002682
{
    public final m b;

    public void y(m p0){
       this.b = p0;
    }
    public final void run(){
       y tb = this.b;
       tb.h.setLowLightStrategyEnabled(tb.e, false);
    }
}
