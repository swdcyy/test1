package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import androidx.media.MediaBrowserServiceCompat$g;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.Object;
import java.util.ArrayList;
import r2.c;
import java.lang.String;
import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat$f;
import java.lang.IllegalStateException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$a;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$n;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$c;
import android.os.Handler;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$d;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import z1.e;
import r2.a;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat$e;
import android.os.Messenger;
import android.os.IBinder;
import l1.d;
import android.support.v4.media.session.b;
import android.os.IInterface;
import androidx.media.MediaBrowserServiceCompat$l;
import androidx.media.MediaBrowserServiceCompat$j;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$b;
import androidx.media.MediaBrowserServiceCompat$i;
import android.content.Intent;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21;
import android.content.Context;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 implements MediaBrowserServiceCompat$g	// class@00082c
{
    public final List a;
    public MediaBrowserService b;
    public Messenger c;
    public final MediaBrowserServiceCompat d;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat p0){
       this.d = p0;
       super();
       this.a = new ArrayList();
    }
    public void a(c p0,String p1,Bundle p2){
       this.g(p0, p1, p2);
    }
    public c b(){
       MediaBrowserServiceCompat f = this.d.f;
       if (f != null) {
          return f.d;
       }
       throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
    public Bundle c(){
       Bundle uBundle = null;
       if (this.c == null) {
          return uBundle;
       }
       MediaBrowserServiceCompat f = this.d.f;
       if (f == null) {
          throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
       }
       if (f.e != null) {
          uBundle = new Bundle(this.d.f.e);
       }
       return uBundle;
    }
    public void d(String p0,Bundle p1){
       this.i(p0, p1);
       this.f(p0, p1);
    }
    public void e(MediaSessionCompat$Token p0){
       this.d.g.a(new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$a(this, p0));
    }
    public void f(String p0,Bundle p1){
       this.d.g.post(new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$c(this, p0, p1));
    }
    public void g(c p0,String p1,Bundle p2){
       this.d.g.post(new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$d(this, p0, p1, p2));
    }
    public void h(MediaBrowserServiceCompat$f p0,String p1,Bundle p2){
       List list = p0.g.get(p1);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (a.b(p2, uoe.b)) {
                this.d.k(p1, p0, uoe.b, p2);
             }
          }
       }
       return;
    }
    public void i(String p0,Bundle p1){
       this.b.notifyChildrenChanged(p0);
    }
    public MediaBrowserServiceCompat$e j(String p0,int p1,Bundle p2){
       Bundle uBundle;
       int i1;
       int i = -1;
       if (p2 != null) {
          String str = "extra_client_version";
          if (p2.getInt(str, 0)) {
             p2.remove(str);
             this.c = new Messenger(this.d.g);
             uBundle = new Bundle();
             uBundle.putInt("extra_service_version", 2);
             d.b(uBundle, "extra_messenger", this.c.getBinder());
             MediaBrowserServiceCompat h = this.d.h;
             if (h != null) {
                b uob = h.c();
                IBinder iBinder = (uob == null)? null: uob.asBinder();
                d.b(uBundle, "extra_session_binder", iBinder);
             }else {
                this.a.add(uBundle);
             }
             str = "extra_calling_pid";
             p2.remove(str);
             i1 = p2.getInt(str, i);
          label_005b :
             MediaBrowserServiceCompat$f uof = new MediaBrowserServiceCompat$f(this.d, p0, i1, p1, p2, null);
             MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 td = this.d;
             td.f = i;
             MediaBrowserServiceCompat$e uoe = td.e(p0, p1, p2);
             MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 td1 = this.d;
             td1.f = null;
             if (uoe == null) {
                return null;
             }else if(this.c != null){
                td1.d.add(i);
             }
             if (uBundle == null) {
                uBundle = uoe.a();
             }else if(uoe.a() != null){
                uBundle.putAll(uoe.a());
             }
             return new MediaBrowserServiceCompat$e(uoe.b(), uBundle);
          }
       }
       uBundle = null;
       i1 = -1;
       goto label_005b ;
    }
    public void k(String p0,MediaBrowserServiceCompat$j p1){
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 td = this.d;
       td.f = td.c;
       td.f(p0, new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$b(this, p0, p1));
       p0.f = null;
    }
    public IBinder onBind(Intent p0){
       return this.b.onBind(p0);
    }
    public void onCreate(){
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 mediaBrowser = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21(this, this.d);
       this.b = mediaBrowser;
       mediaBrowser.onCreate();
    }
}
