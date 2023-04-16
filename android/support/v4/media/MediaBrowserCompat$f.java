package android.support.v4.media.MediaBrowserCompat$f;
import android.support.v4.media.MediaBrowserCompat$e;
import android.support.v4.media.MediaBrowserCompat$i;
import android.support.v4.media.MediaBrowserCompat$b$b;
import android.content.Context;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat$b;
import android.os.Bundle;
import java.lang.Object;
import android.support.v4.media.MediaBrowserCompat$a;
import androidx.collection.ArrayMap;
import java.lang.String;
import android.os.Process;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser$ConnectionCallback;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.media.session.MediaSession$Token;
import android.support.v4.media.MediaBrowserCompat$m;
import androidx.collection.SimpleArrayMap;
import android.support.v4.media.MediaBrowserCompat$l;
import android.media.browse.MediaBrowser$SubscriptionCallback;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat$k;
import java.util.List;
import android.support.v4.media.MediaBrowserCompat$c;
import android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import android.support.v4.media.MediaBrowserCompat$j;
import android.support.v4.media.MediaBrowserCompat$f$d;
import java.lang.Runnable;
import android.support.v4.media.MediaBrowserCompat$SearchResultReceiver;
import android.support.v4.media.MediaBrowserCompat$f$e;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$d;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.support.v4.media.MediaBrowserCompat$f$a;
import android.support.v4.media.MediaBrowserCompat$f$b;
import android.support.v4.media.MediaBrowserCompat$ItemReceiver;
import android.support.v4.media.MediaBrowserCompat$f$c;
import java.lang.IllegalArgumentException;
import l1.d;
import android.support.v4.media.session.b;
import android.support.v4.media.session.b$a;

public class MediaBrowserCompat$f implements MediaBrowserCompat$e, MediaBrowserCompat$i, MediaBrowserCompat$b$b	// class@0003cb
{
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final MediaBrowserCompat$a d;
    public final ArrayMap e;
    public int f;
    public MediaBrowserCompat$k g;
    public Messenger h;
    public MediaSessionCompat$Token i;
    public Bundle j;

    public void MediaBrowserCompat$f(Context p0,ComponentName p1,MediaBrowserCompat$b p2,Bundle p3){
       super();
       this.d = new MediaBrowserCompat$a(this);
       this.e = new ArrayMap();
       this.a = p0;
       Bundle uBundle = (p3 != null)? new Bundle(p3): new Bundle();
       this.c = uBundle;
       uBundle.putInt("extra_client_version", 1);
       uBundle.putInt("extra_calling_pid", Process.myPid());
       p2.d(this);
       this.b = new MediaBrowser(p0, p1, p2.a, uBundle);
       return;
    }
    public MediaSessionCompat$Token a(){
       if (this.i == null) {
          this.i = MediaSessionCompat$Token.a(this.b.getSessionToken());
       }
       return this.i;
    }
    public void b(String p0,Bundle p1,MediaBrowserCompat$m p2){
       MediaBrowserCompat$l ol = this.e.get(p0);
       if (ol == null) {
          ol = new MediaBrowserCompat$l();
          this.e.put(p0, ol);
       }
       p2.a(ol);
       p1 = (p1 == null)? null: new Bundle(p1);
       try{
          ol.e(p1, p2);
          MediaBrowserCompat$f tg = this.g;
          if (tg == null) {
             this.b.subscribe(p0, p2.a);
          }else {
             tg.a(p0, p2.b, p1, this.h);
          }
          return;
       }catch(android.os.RemoteException e0){
       }
    }
    public void c(String p0,MediaBrowserCompat$m p1){
       List list;
       List list1;
       int i;
       MediaBrowserCompat$l ol = this.e.get(p0);
       if (ol == null) {
          return;
       }
       MediaBrowserCompat$f tg = this.g;
       if (tg == null) {
          if (p1 == null) {
             this.b.unsubscribe(p0);
          }else {
             list = ol.b();
             list1 = ol.c();
             i = list.size() - 1;
             while (i >= 0) {
                if (list.get(i) == p1) {
                   list.remove(i);
                   list1.remove(i);
                }
                i = i - 1;
             }
             if (!list.size()) {
                this.b.unsubscribe(p0);
             }
          }
       }else if(p1 == null){
          IBinder iBinder = null;
          tg.d(p0, iBinder, this.h);
       }else {
          list = ol.b();
          list1 = ol.c();
          i = list.size() - 1;
          while (i >= 0) {
             if (list.get(i) == p1) {
                this.g.d(p0, p1.b, this.h);
                list.remove(i);
                list1.remove(i);
             }
             i = i - 1;
          }
       }
    }
    public void connect(){
       this.b.connect();
    }
    public void d(String p0,Bundle p1,MediaBrowserCompat$c p2){
       if (!this.isConnected()) {
          throw new IllegalStateException("Cannot send a custom action \("+p0+"\) with extras "+p1+" because the browser is not connected to the service.");
       }
       MediaBrowserCompat$f td = this.d;
       try{
          MediaBrowserCompat$CustomActionResultReceiver uCustomActio = new MediaBrowserCompat$CustomActionResultReceiver(p0, p1, p2, td);
          this.g.f(p0, p1, uCustomActio, this.h);
       }catch(android.os.RemoteException e0){
          "Remote error sending a custom action: action="+p0+", extras="+p1;
       }
       return;
    }
    public void disconnect(){
       try{
          MediaBrowserCompat$f tg = this.g;
          if (tg != null) {
             MediaBrowserCompat$f th = this.h;
             if (th != null) {
                tg.h(th);
             }
          }
          this.b.disconnect();
          return;
       }catch(android.os.RemoteException e0){
       }
    }
    public void e(String p0,Bundle p1,MediaBrowserCompat$j p2){
       if (!this.isConnected()) {
          throw new IllegalStateException("search\(\) called while not connected");
       }
       if (this.g == null) {
          this.d.post(new MediaBrowserCompat$f$d(this, p2, p0, p1));
          return;
       }else {
          MediaBrowserCompat$f td = this.d;
          try{
             MediaBrowserCompat$SearchResultReceiver searchResult = new MediaBrowserCompat$SearchResultReceiver(p0, p1, p2, td);
             this.g.e(p0, p1, searchResult, this.h);
          }catch(android.os.RemoteException e0){
             this.d.post(new MediaBrowserCompat$f$e(this, p2, p0, p1));
          }
          return;
       }
    }
    public ComponentName f(){
       return this.b.getServiceComponent();
    }
    public void g(){
       this.g = null;
       this.h = null;
       this.i = null;
       this.d.a(null);
    }
    public Bundle getExtras(){
       return this.b.getExtras();
    }
    public String getRoot(){
       return this.b.getRoot();
    }
    public void h(Messenger p0){
    }
    public void i(Messenger p0,String p1,List p2,Bundle p3,Bundle p4){
       if (this.h != p0) {
          return;
       }
       MediaBrowserCompat$l ol = this.e.get(p1);
       if (ol == null) {
          return;
       }
       if (ol.a(p3) != null) {
          if (p3 == null) {
             if (p2 != null) {
                this.j = p4;
                this.j = null;
             }
          }else if(p2 == null){
             this.j = p4;
             this.j = null;
          }
       }
       return;
    }
    public boolean isConnected(){
       return this.b.isConnected();
    }
    public void j(){
    }
    public void k(Messenger p0,String p1,MediaSessionCompat$Token p2,Bundle p3){
    }
    public void l(String p0,MediaBrowserCompat$d p1){
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalArgumentException("mediaId is empty");
       }
       if (p1 == null) {
          throw new IllegalArgumentException("cb is null");
       }
       if (!this.b.isConnected()) {
          this.d.post(new MediaBrowserCompat$f$a(this, p1, p0));
          return;
       }else if(this.g == null){
          this.d.post(new MediaBrowserCompat$f$b(this, p1, p0));
          return;
       }else {
          MediaBrowserCompat$f td = this.d;
          try{
             MediaBrowserCompat$ItemReceiver itemReceiver = new MediaBrowserCompat$ItemReceiver(p0, p1, td);
             this.g.b(p0, itemReceiver, this.h);
          }catch(android.os.RemoteException e0){
             this.d.post(new MediaBrowserCompat$f$c(this, p1, p0));
          }
          return;
       }
    }
    public Bundle m(){
       return this.j;
    }
    public void onConnected(){
       b uob;
       try{
          Bundle extras = this.b.getExtras();
          if (extras == null) {
             return;
          }
          this.f = extras.getInt("extra_service_version", 0);
          IBinder iBinder = d.a(extras, "extra_messenger");
          if (iBinder != null) {
             this.g = new MediaBrowserCompat$k(iBinder, this.c);
             Messenger messenger = new Messenger(this.d);
             this.h = messenger;
             MediaBrowserCompat$f td = this.d;
             try{
                td.a(messenger);
                this.g.c(this.a, this.h);
             }catch(android.os.RemoteException e0){
             }
          }
       }catch(java.lang.IllegalStateException e0){
       }
    }
}
