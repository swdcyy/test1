package android.support.v4.media.session.MediaSessionCompat$c;
import android.support.v4.media.session.MediaSessionCompat$b;
import java.lang.String;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.CharSequence;
import java.util.List;
import r2.c;
import java.lang.Object;
import r2.g;
import android.app.PendingIntent;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;

public interface abstract MediaSessionCompat$c	// class@0003f4
{

    boolean E();
    void F(boolean p0);
    void G(int p0);
    MediaSessionCompat$b H();
    void I(int p0);
    void J(String p0,Bundle p1);
    void K(MediaSessionCompat$b p0,Handler p1);
    void L(int p0);
    void M(PlaybackStateCompat p0);
    void N(int p0);
    void O(CharSequence p0);
    void P(List p0);
    void Q(c p0);
    Object R();
    c S();
    String T();
    void U(g p0);
    void V(PendingIntent p0);
    Object W();
    void X(MediaMetadataCompat p0);
    void Y(PendingIntent p0);
    MediaSessionCompat$Token a();
    PlaybackStateCompat g();
    void n(boolean p0);
    void release();
    void s(int p0);
    void setExtras(Bundle p0);
}
