package androidx.core.app.e$c;
import android.os.Handler$Callback;
import android.content.ServiceConnection;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.e$c$a;
import android.content.Intent;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.util.Objects;
import androidx.core.app.e$d;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayDeque;
import android.os.IBinder;
import android.support.v4.app.a;
import android.support.v4.app.a$a;
import android.util.Log;
import android.os.Message;
import androidx.core.app.e$b;
import java.util.Set;
import androidx.core.app.e;
import android.content.pm.PackageManager;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.lang.StringBuilder;
import java.util.Map$Entry;

public class e$c implements Handler$Callback, ServiceConnection	// class@000702
{
    public final Context b;
    public final HandlerThread c;
    public final Handler d;
    public final Map e;
    public Set f;

    public void e$c(Context p0){
       super();
       this.e = new HashMap();
       this.f = new HashSet();
       this.b = p0;
       HandlerThread handlerThrea = new HandlerThread("NotificationManagerCompat");
       this.c = handlerThrea;
       handlerThrea.start();
       this.d = new Handler(handlerThrea.getLooper(), this);
    }
    public final boolean a(e$c$a p0){
       if (p0.b != null) {
          return true;
       }
       boolean b = a.a(this.b, new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(p0.a), this, 33);
       p0.b = b;
       if (b) {
          p0.e = 0;
       }else {
          Objects.toString(p0.a);
          this.b.unbindService(this);
       }
       return p0.b;
    }
    public final void b(e$c$a p0){
       if (p0.b != null) {
          this.b.unbindService(this);
          p0.b = false;
       }
       p0.c = null;
       return;
    }
    public final void c(e$d p0){
       this.j();
       Iterator iterator = this.e.values().iterator();
       while (iterator.hasNext()) {
          e$c$a uoc$a = iterator.next();
          uoc$a.d.add(p0);
          this.g(uoc$a);
       }
       return;
    }
    public final void d(ComponentName p0){
       e$c$a uoc$a = this.e.get(p0);
       if (uoc$a != null) {
          this.g(uoc$a);
       }
       return;
    }
    public final void e(ComponentName p0,IBinder p1){
       e$c$a uoc$a = this.e.get(p0);
       if (uoc$a != null) {
          uoc$a.c = a$a.L1(p1);
          uoc$a.e = 0;
          this.g(uoc$a);
       }
       return;
    }
    public final void f(ComponentName p0){
       e$c$a uoc$a = this.e.get(p0);
       if (uoc$a != null) {
          this.b(uoc$a);
       }
       return;
    }
    public final void g(e$c$a p0){
       String str = "NotifManCompat";
       if (Log.isLoggable(str, 3)) {
          Objects.toString(p0.a);
          p0.d.size();
       }
       if (p0.d.isEmpty()) {
          return;
       }else if(!this.a(p0) || p0.c == null){
          this.i(p0);
          return;
       }else {
          try{
             e$d uod = p0.d.peek();
             while (uod != null) {
                if (Log.isLoggable(str, 3)) {
                   uod.toString();
                }
                uod.a(p0.c);
                p0.d.remove();
             }
          }catch(android.os.DeadObjectException e0){
             if (Log.isLoggable(e0, 3)) {
                Objects.toString(p0.a);
             }
          }catch(android.os.RemoteException e0){
             Objects.toString(p0.a);
          }
          if (!p0.d.isEmpty()) {
             this.i(p0);
          }
          return;
       }
    }
    public void h(e$d p0){
       this.d.obtainMessage(0, p0).sendToTarget();
    }
    public boolean handleMessage(Message p0){
       Message what = p0.what;
       if (what != null) {
          if (what != true) {
             if (what != 2) {
                if (what != 3) {
                   return false;
                }
                this.d(p0.obj);
                return true;
             }else {
                this.f(p0.obj);
                return true;
             }
          }else {
             p0 = p0.obj;
             this.e(p0.a, p0.b);
             return true;
          }
       }else {
          this.c(p0.obj);
          return true;
       }
    }
    public final void i(e$c$a p0){
       int i = 3;
       if (this.d.hasMessages(i, p0.a)) {
          return;
       }
       int i1 = 1;
       int i2 = p0.e + i1;
       p0.e = i2;
       if (i2 > 6) {
          p0.d.size();
          Objects.toString(p0.a);
          p0.d.clear();
          return;
       }else {
          this.d.sendMessageDelayed(this.d.obtainMessage(i, p0.a), (long)((i1 << (i2 - i1)) * 1000));
          return;
       }
    }
    public final void j(){
       StringBuilder str;
       Set set = e.f(this.b);
       if (set.equals(this.f)) {
          return;
       }
       this.f = set;
       HashSet hashSet = new HashSet();
       Iterator iterator = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0).iterator();
       while (iterator.hasNext()) {
          ResolveInfo resolveInfo = iterator.next();
          if (!set.contains(resolveInfo.serviceInfo.packageName)) {
             continue ;
          }else {
             ResolveInfo serviceInfo = resolveInfo.serviceInfo;
             ComponentName uComponentNa = new ComponentName(serviceInfo.packageName, serviceInfo.name);
             if (resolveInfo.serviceInfo.permission != null) {
                str = "Permission present on component "+uComponentNa+", not adding listener record.";
             }else {
                hashSet.add(uComponentNa);
             }
          }
       }
       Iterator iterator1 = hashSet.iterator();
       int i = 3;
       String str1 = "NotifManCompat";
       while (iterator1.hasNext()) {
          ComponentName uComponentNa1 = iterator1.next();
          if (!this.e.containsKey(uComponentNa1)) {
             if (Log.isLoggable(str1, i)) {
                str = "Adding listener record for "+uComponentNa1;
             }
             this.e.put(uComponentNa1, new e$c$a(uComponentNa1));
          }
       }
       iterator1 = this.e.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          if (!hashSet.contains(uEntry.getKey())) {
             if (Log.isLoggable(str1, i)) {
                StringBuilder str2 = "Removing listener record for "+uEntry.getKey();
             }
             this.b(uEntry.getValue());
             iterator1.remove();
          }
       }
       return;
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       if (Log.isLoggable("NotifManCompat", 3)) {
          StringBuilder str = "Connected to service "+p0;
       }
       this.d.obtainMessage(1, new e$b(p0, p1)).sendToTarget();
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       if (Log.isLoggable("NotifManCompat", 3)) {
          StringBuilder str = "Disconnected from service "+p0;
       }
       this.d.obtainMessage(2, p0).sendToTarget();
       return;
    }
}
