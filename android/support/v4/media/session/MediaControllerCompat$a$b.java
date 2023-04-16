package android.support.v4.media.session.MediaControllerCompat$a$b;
import android.os.Handler;
import android.os.Message;
import java.lang.Object;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.CharSequence;
import java.util.List;
import android.support.v4.media.session.MediaControllerCompat$c;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.String;
import android.support.v4.media.session.MediaControllerCompat$a;

public class MediaControllerCompat$a$b extends Handler	// class@0003e2
{
    public boolean a;
    public final MediaControllerCompat$a b;

    public void handleMessage(Message p0){
       if (this.a == null) {
          return;
       }
       switch (p0.what){
           case 1:
             Bundle data = p0.getData();
             MediaSessionCompat.b(data);
             this.b.onSessionEvent(p0.obj, data);
             break;
           case 2:
             Objects.requireNonNull(this.b);
             break;
           case 3:
             Objects.requireNonNull(this.b);
             break;
           case 4:
             Objects.requireNonNull(this.b);
             break;
           case 5:
             Objects.requireNonNull(this.b);
             break;
           case 6:
             Objects.requireNonNull(this.b);
             break;
           case 7:
             MediaSessionCompat.b(p0.obj);
             Objects.requireNonNull(this.b);
             break;
           case 8:
             Objects.requireNonNull(this.b);
             break;
           case 9:
             p0.obj.intValue();
             Objects.requireNonNull(this.b);
             break;
           case 11:
             p0.obj.booleanValue();
             Objects.requireNonNull(this.b);
             break;
           case 12:
             p0.obj.intValue();
             Objects.requireNonNull(this.b);
             break;
           case 13:
             Objects.requireNonNull(this.b);
             break;
           default:
       }
       return;
    }
}
