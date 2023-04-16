package androidx.media.MediaBrowserServiceCompat;
import android.app.Service;
import java.lang.String;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat$f;
import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat$l;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserServiceCompat$n;
import android.os.IBinder;
import java.lang.Object;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import z1.e;
import r2.a;
import java.util.Collections;
import android.content.pm.PackageManager;
import androidx.media.MediaBrowserServiceCompat$i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import androidx.media.MediaBrowserServiceCompat$e;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat$d;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import androidx.media.MediaBrowserServiceCompat$a;
import androidx.media.MediaBrowserServiceCompat$b;
import androidx.media.MediaBrowserServiceCompat$c;
import android.content.Intent;
import androidx.media.MediaBrowserServiceCompat$g;
import android.os.Build$VERSION;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;

public abstract class MediaBrowserServiceCompat extends Service	// class@00084b
{
    public MediaBrowserServiceCompat$g b;
    public final MediaBrowserServiceCompat$f c;
    public final ArrayList d;
    public final ArrayMap e;
    public MediaBrowserServiceCompat$f f;
    public final MediaBrowserServiceCompat$n g;
    public MediaSessionCompat$Token h;
    public static final boolean i;

    static {
       MediaBrowserServiceCompat.i = Log.isLoggable("MBServiceCompat", 3);
    }
    public void MediaBrowserServiceCompat(){
       super();
       MediaBrowserServiceCompat$f uof = new MediaBrowserServiceCompat$f(this, "android.media.session.MediaController", -1, -1, null, null);
       this.c = v7;
       this.d = new ArrayList();
       this.e = new ArrayMap();
       this.g = new MediaBrowserServiceCompat$n(this);
    }
    public void a(String p0,MediaBrowserServiceCompat$f p1,IBinder p2,Bundle p3){
       List list = p1.g.get(p0);
       if (list == null) {
          list = new ArrayList();
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             e uoe = iterator.next();
             if (p2 == uoe.a && a.a(p3, uoe.b)) {
                break ;
             }
          }else {
             list.add(new e(p2, p3));
             p1.g.put(p0, list);
             this.k(p0, p1, p3, null);
             this.f = p1;
             this.f = null;
             return;
          }
       }
       return;
    }
    public List b(List p0,Bundle p1){
       if (p0 == null) {
          return null;
       }
       int i = -1;
       int intx = p1.getInt("android.media.browse.extra.PAGE", i);
       int intx1 = p1.getInt("android.media.browse.extra.PAGE_SIZE", i);
       if (intx == i && intx1 == i) {
          return p0;
       }
       i = intx1 * intx;
       int i1 = i + intx1;
       if (intx >= 0 && (intx1 < 1 || i >= p0.size())) {
          return Collections.emptyList();
       }
       if (i1 > p0.size()) {
          i1 = p0.size();
       }
       return p0.subList(i, i1);
    }
    public boolean c(String p0,int p1){
       if (p0 == null) {
          return false;
       }
       String[] packagesForU = this.getPackageManager().getPackagesForUid(p1);
       int len = packagesForU.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if ((packagesForU[i]).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void d(String p0,Bundle p1,MediaBrowserServiceCompat$i p2){
       p2.e(null);
    }
    public void dump(FileDescriptor p0,PrintWriter p1,String[] p2){
    }
    public abstract MediaBrowserServiceCompat$e e(String p0,int p1,Bundle p2);
    public abstract void f(String p0,MediaBrowserServiceCompat$i p1);
    public void g(String p0,MediaBrowserServiceCompat$i p1,Bundle p2){
       p1.g(1);
       this.f(p0, p1);
    }
    public void h(String p0,MediaBrowserServiceCompat$i p1){
       p1.g(2);
       p1.f(null);
    }
    public void i(String p0,Bundle p1,MediaBrowserServiceCompat$i p2){
       p2.g(4);
       p2.f(null);
    }
    public void j(String p0,Bundle p1,MediaBrowserServiceCompat$f p2,ResultReceiver p3){
       MediaBrowserServiceCompat$d uod = new MediaBrowserServiceCompat$d(this, p0, p3);
       this.f = p2;
       this.d(p0, p1, uod);
       this.f = null;
       if (uod.b()) {
          return;
       }
       throw new IllegalStateException("onCustomAction must call detach\(\) or sendResult\(\) or sendError\(\) before returning for action="+p0+" extras="+p1);
    }
    public void k(String p0,MediaBrowserServiceCompat$f p1,Bundle p2,Bundle p3){
       MediaBrowserServiceCompat$a uoa = new MediaBrowserServiceCompat$a(this, p0, p1, p0, p2, p3);
       this.f = p1;
       if (p2 == null) {
          this.f(p0, v7);
       }else {
          this.g(p0, v7, p2);
       }
       this.f = null;
       if (v7.b()) {
          return;
       }else {
          throw new IllegalStateException("onLoadChildren must call detach\(\) or sendResult\(\) before returning for package="+p1.a+" id="+p0);
       }
    }
    public void l(String p0,MediaBrowserServiceCompat$f p1,ResultReceiver p2){
       MediaBrowserServiceCompat$b uob = new MediaBrowserServiceCompat$b(this, p0, p2);
       this.f = p1;
       this.h(p0, uob);
       this.f = null;
       if (uob.b()) {
          return;
       }
       throw new IllegalStateException("onLoadItem must call detach\(\) or sendResult\(\) before returning for id="+p0);
    }
    public void m(String p0,Bundle p1,MediaBrowserServiceCompat$f p2,ResultReceiver p3){
       MediaBrowserServiceCompat$c uoc = new MediaBrowserServiceCompat$c(this, p0, p3);
       this.f = p2;
       this.i(p0, p1, uoc);
       this.f = null;
       if (uoc.b()) {
          return;
       }
       throw new IllegalStateException("onSearch must call detach\(\) or sendResult\(\) before returning for query="+p0);
    }
    public boolean n(String p0,MediaBrowserServiceCompat$f p1,IBinder p2){
       boolean b = false;
       if (p2 == null) {
          if (p1.g.remove(p0) != null) {
             b = true;
          }
       }else {
          List list = p1.g.get(p0);
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                if (p2 == iterator.next().a) {
                   iterator.remove();
                   b = true;
                }
             }
             if (!list.size()) {
                p1.g.remove(p0);
             }
          }
       }
       this.f = p1;
       this.f = null;
       return b;
    }
    public IBinder onBind(Intent p0){
       return this.b.onBind(p0);
    }
    public void onCreate(){
       super.onCreate();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 28) {
          this.b = new MediaBrowserServiceCompat$h(this);
       }else if(sDK_INT >= 26){
          this.b = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi26(this);
       }else if(sDK_INT >= 23){
          this.b = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(this);
       }else {
          this.b = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(this);
       }
       this.b.onCreate();
       return;
    }
}
