package android.support.v4.media.session.MediaControllerCompat$a;
import android.os.IBinder$DeathRecipient;
import java.lang.Object;
import android.support.v4.media.session.MediaControllerCompat$a$a;
import android.os.Bundle;
import android.os.Message;
import android.os.Handler;
import java.lang.String;

public abstract class MediaControllerCompat$a implements IBinder$DeathRecipient	// class@0003e4
{
    public final MediaController$Callback a;
    public MediaControllerCompat$a$b b;
    public a c;

    public void MediaControllerCompat$a(){
       super();
       this.a = new MediaControllerCompat$a$a(this);
    }
    public void a(int p0,Object p1,Bundle p2){
       MediaControllerCompat$a tb = this.b;
       if (tb != null) {
          Message message = tb.obtainMessage(p0, p1);
          message.setData(p2);
          message.sendToTarget();
       }
       return;
    }
    public void binderDied(){
       this.a(8, null, null);
    }
    public void onSessionEvent(String p0,Bundle p1){
    }
}
