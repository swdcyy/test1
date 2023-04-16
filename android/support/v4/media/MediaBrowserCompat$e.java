package android.support.v4.media.MediaBrowserCompat$e;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.String;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$m;
import android.support.v4.media.MediaBrowserCompat$c;
import android.support.v4.media.MediaBrowserCompat$j;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat$d;

public interface abstract MediaBrowserCompat$e	// class@0003c5
{

    MediaSessionCompat$Token a();
    void b(String p0,Bundle p1,MediaBrowserCompat$m p2);
    void c(String p0,MediaBrowserCompat$m p1);
    void connect();
    void d(String p0,Bundle p1,MediaBrowserCompat$c p2);
    void disconnect();
    void e(String p0,Bundle p1,MediaBrowserCompat$j p2);
    ComponentName f();
    Bundle getExtras();
    String getRoot();
    boolean isConnected();
    void l(String p0,MediaBrowserCompat$d p1);
    Bundle m();
}
