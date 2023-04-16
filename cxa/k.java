package cxa.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.im_rtc.media.i;
import java.lang.Object;
import android.media.AudioAttributes;
import android.os.Vibrator;

public final class k implements Runnable	// class@0023fd
{
    public final i b;

    public void k(i p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       tb.a.vibrate(400, tb.g());
    }
}
