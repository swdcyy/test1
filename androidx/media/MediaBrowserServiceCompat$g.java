package androidx.media.MediaBrowserServiceCompat$g;
import r2.c;
import java.lang.String;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.content.Intent;
import android.os.IBinder;

public interface abstract MediaBrowserServiceCompat$g	// class@00083a
{

    void a(c p0,String p1,Bundle p2);
    c b();
    Bundle c();
    void d(String p0,Bundle p1);
    void e(MediaSessionCompat$Token p0);
    IBinder onBind(Intent p0);
    void onCreate();
}
