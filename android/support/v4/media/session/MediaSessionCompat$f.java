package android.support.v4.media.session.MediaSessionCompat$f;
import android.support.v4.media.session.MediaSessionCompat$e;
import android.media.session.MediaSession;
import g3.c;
import android.os.Bundle;
import java.lang.Object;
import android.media.session.MediaController;
import android.support.v4.media.session.MediaSessionCompat$d;

public class MediaSessionCompat$f extends MediaSessionCompat$e	// class@0003f8
{

    public void MediaSessionCompat$f(MediaSession p0,c p1,Bundle p2){
       super(p0, p1, p2);
    }
    public void MediaSessionCompat$f(Object p0){
       super(p0);
       this.d = p0.getController().getSessionInfo();
    }
}
