package cxa.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.im_rtc.media.i;
import java.lang.Object;
import android.media.AudioAttributes;
import android.os.Vibrator;

public final class j implements Runnable	// class@0023fc
{
    public final i b;

    public void j(i p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       tb.a.vibrate(400, tb.g());
    }
}
