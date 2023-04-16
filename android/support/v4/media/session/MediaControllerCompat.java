package android.support.v4.media.session.MediaControllerCompat;
import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Bundle;
import java.lang.StringBuilder;
import android.view.KeyEvent;
import android.support.v4.media.session.MediaControllerCompat$b;

public final class MediaControllerCompat	// class@0003e9
{
    public final MediaControllerCompat$b a;
    public final MediaSessionCompat$Token b;
    public final ConcurrentHashMap c;

    public void MediaControllerCompat(Context p0,MediaSessionCompat$Token p1){
       super();
       this.c = new ConcurrentHashMap();
       if (p1 == null) {
          throw new IllegalArgumentException("sessionToken must not be null");
       }
       this.b = p1;
       this.a = new MediaControllerCompat$MediaControllerImplApi21(p0, p1);
       return;
    }
    public void MediaControllerCompat(Context p0,MediaSessionCompat p1){
       super();
       this.c = new ConcurrentHashMap();
       MediaSessionCompat$Token token = p1.c();
       this.b = token;
       this.a = new MediaControllerCompat$MediaControllerImplApi21(p0, token);
    }
    public static void b(String p0,Bundle p1){
       if (p0 == null) {
          return;
       }
       if (!p0.equals("android.support.v4.media.session.action.FOLLOW") && (!p0.equals("android.support.v4.media.session.action.UNFOLLOW") || (p1 != null && p1.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
          return;
       }
       throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action "+p0+".");
    }
    public boolean a(KeyEvent p0){
       if (p0 != null) {
          return this.a.e(p0);
       }
       throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
