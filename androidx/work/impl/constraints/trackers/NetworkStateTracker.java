package androidx.work.impl.constraints.trackers.NetworkStateTracker;
import s3.c;
import java.lang.String;
import k3.h;
import android.content.Context;
import x3.a;
import java.lang.Object;
import android.net.ConnectivityManager;
import androidx.work.impl.constraints.trackers.NetworkStateTracker$a;
import androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateBroadcastReceiver;
import android.os.Build$VERSION;
import q3.b;
import java.lang.Throwable;
import android.net.ConnectivityManager$NetworkCallback;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.NetworkInfo;
import v1.a;
import android.net.Network;
import android.net.NetworkCapabilities;

public class NetworkStateTracker extends c	// class@000a88
{
    public final ConnectivityManager g;
    public NetworkStateTracker$a h;
    public NetworkStateTracker$NetworkStateBroadcastReceiver i;
    public static final String j;

    static {
       NetworkStateTracker.j = h.f("NetworkStateTracker");
    }
    public void NetworkStateTracker(Context p0,a p1){
       super(p0, p1);
       this.g = this.b.getSystemService("connectivity");
       this.h = (NetworkStateTracker.j())? new NetworkStateTracker$a(this): new NetworkStateTracker$NetworkStateBroadcastReceiver(this);
       return;
    }
    public static boolean j(){
       boolean b = (Build$VERSION.SDK_INT >= 24)? true: false;
       return b;
    }
    public Object b(){
       return this.h();
    }
    public void e(){
       Throwable[] throwableArr;
       int i = 0;
       if (NetworkStateTracker.j()) {
          try{
             throwableArr = new Throwable[i];
             h.c().a(NetworkStateTracker.j, "Registering network callback", throwableArr);
             this.g.registerDefaultNetworkCallback(this.h);
          }catch(java.lang.IllegalArgumentException e0){
          }catch(java.lang.SecurityException e0){
          }
          throwableArr = new Throwable[]{e0};
          h.c().b(NetworkStateTracker.j, "Received exception while registering network callback", throwableArr);
       }else {
          Throwable[] throwableArr1 = new Throwable[i];
          h.c().a(NetworkStateTracker.j, "Registering broadcast receiver", throwableArr1);
          this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       }
       return;
    }
    public void f(){
       Throwable[] throwableArr;
       int i = 0;
       if (NetworkStateTracker.j()) {
          try{
             throwableArr = new Throwable[i];
             h.c().a(NetworkStateTracker.j, "Unregistering network callback", throwableArr);
             this.g.unregisterNetworkCallback(this.h);
          }catch(java.lang.IllegalArgumentException e0){
          }catch(java.lang.SecurityException e0){
          }
          throwableArr = new Throwable[]{e0};
          h.c().b(NetworkStateTracker.j, "Received exception while unregistering network callback", throwableArr);
       }else {
          Throwable[] throwableArr1 = new Throwable[i];
          h.c().a(NetworkStateTracker.j, "Unregistering broadcast receiver", throwableArr1);
          this.b.unregisterReceiver(this.i);
       }
       return;
    }
    public b g(){
       NetworkInfo activeNetwor = this.g.getActiveNetworkInfo();
       boolean b = true;
       boolean b1 = (activeNetwor != null && activeNetwor.isConnected())? true: false;
       boolean b2 = this.i();
       boolean b3 = a.a(this.g);
       if (activeNetwor == null || activeNetwor.isRoaming()) {
          b = false;
       }
       return new b(b1, b2, b3, b);
    }
    public b h(){
       return this.g();
    }
    public final boolean i(){
       boolean b = false;
       if (Build$VERSION.SDK_INT < 23) {
          return b;
       }
       NetworkCapabilities networkCapab = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
       if (networkCapab != null && networkCapab.hasCapability(16)) {
          b = true;
       }
       return b;
    }
}
