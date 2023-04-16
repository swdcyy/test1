package android.support.v4.media.session.MediaControllerCompat$b;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.List;
import android.app.PendingIntent;
import android.support.v4.media.session.MediaControllerCompat$d;
import android.view.KeyEvent;
import android.support.v4.media.session.MediaControllerCompat$a;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.String;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat$c;
import java.lang.CharSequence;
import java.lang.Object;

public interface abstract MediaControllerCompat$b	// class@0003e5
{

    void D(MediaDescriptionCompat p0);
    void E(MediaDescriptionCompat p0);
    List G();
    void a(MediaDescriptionCompat p0,int p1);
    PendingIntent b();
    boolean c();
    MediaControllerCompat$d d();
    boolean e(KeyEvent p0);
    void f(MediaControllerCompat$a p0,Handler p1);
    PlaybackStateCompat g();
    Bundle getExtras();
    long getFlags();
    MediaMetadataCompat getMetadata();
    String getPackageName();
    void h(MediaControllerCompat$a p0);
    void i(String p0,Bundle p1,ResultReceiver p2);
    boolean j();
    void k(int p0,int p1);
    MediaControllerCompat$c l();
    CharSequence m();
    void n(int p0,int p1);
    Object o();
    int p();
    int r();
    int w();
    Bundle z();
}
