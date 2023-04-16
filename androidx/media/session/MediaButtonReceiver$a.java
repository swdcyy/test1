package androidx.media.session.MediaButtonReceiver$a;
import android.support.v4.media.MediaBrowserCompat$b;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver$PendingResult;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.MediaBrowserCompat;
import java.lang.String;
import android.os.Parcelable;
import android.view.KeyEvent;

public class MediaButtonReceiver$a extends MediaBrowserCompat$b	// class@00084c
{
    public final Context c;
    public final Intent d;
    public final BroadcastReceiver$PendingResult e;
    public MediaBrowserCompat f;

    public void MediaButtonReceiver$a(Context p0,Intent p1,BroadcastReceiver$PendingResult p2){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public void a(){
       new MediaControllerCompat(this.c, this.f.c()).a(this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
       this.e();
    }
    public void b(){
       this.e();
    }
    public void c(){
       this.e();
    }
    public final void e(){
       this.f.b();
       this.e.finish();
    }
    public void f(MediaBrowserCompat p0){
       this.f = p0;
    }
}
