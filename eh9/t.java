package eh9.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.tab.d;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import eh9.n;
import eh9.a;

public final class t implements Runnable	// class@00215b
{
    public final d b;

    public void t(d p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       tb.e();
       tb.c.p(CameraTab.CAMERA_TAB_LIVE.getTextViewId());
    }
}
