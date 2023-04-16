package dg9.e;
import java.lang.Runnable;
import dg9.f;
import com.yxcorp.gifshow.camerasdk.q;
import java.lang.Object;
import java.util.Objects;
import com.kwai.camerasdk.videoCapture.cameras.FlashController$FlashMode;
import com.kwai.camerasdk.videoCapture.cameras.FlashController;

public final class e implements Runnable	// class@001f31
{
    public final f b;
    public final q c;

    public void e(f p0,q p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (this.c.getFlashMode() == FlashController$FlashMode.FLASH_MODE_TORCH)? true: false;
       tb.g2(b);
       return;
    }
}
