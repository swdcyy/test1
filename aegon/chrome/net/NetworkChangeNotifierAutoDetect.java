package aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import android.content.BroadcastReceiver;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$h;
import android.os.Looper;
import android.os.Handler;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$c;
import android.content.Context;
import a0.f;
import android.os.Build$VERSION;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$i;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$a;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$b;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$d;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$f;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter;
import android.net.Network;
import android.net.ConnectivityManager;
import java.lang.Object;
import android.net.NetworkCapabilities;
import java.util.Arrays;
import b0.a;
import java.lang.String;
import java.lang.Integer;
import h0.a;
import java.lang.IllegalStateException;
import java.lang.Runnable;
import i0.d;
import android.net.ConnectivityManager$NetworkCallback;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.content.Intent;

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver	// class@000081
{
    public final Looper a;
    public final Handler b;
    public final NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter c;
    public final NetworkChangeNotifierAutoDetect$g d;
    public final NetworkChangeNotifierAutoDetect$h e;
    public ConnectivityManager$NetworkCallback f;
    public NetworkChangeNotifierAutoDetect$c g;
    public NetworkChangeNotifierAutoDetect$i h;
    public NetworkChangeNotifierAutoDetect$e i;
    public NetworkRequest j;
    public boolean k;
    public NetworkChangeNotifierAutoDetect$f l;
    public boolean m;
    public boolean n;
    public boolean o;
    public static final String p;

    static {
       NetworkChangeNotifierAutoDetect.p = "NetworkChangeNotifierAutoDetect";
    }
    public void NetworkChangeNotifierAutoDetect(NetworkChangeNotifierAutoDetect$g p0,NetworkChangeNotifierAutoDetect$h p1){
       super();
       Looper looper = Looper.myLooper();
       this.a = looper;
       this.b = new Handler(looper);
       try{
          this.d = p0;
          this.g = new NetworkChangeNotifierAutoDetect$c(f.a());
       }catch(java.lang.Exception e0){
          try{
             this.g = new NetworkChangeNotifierAutoDetect$c(f.a());
          }catch(java.lang.Exception e0){
             this.g = new NetworkChangeNotifierAutoDetect$c();
          }
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT < 23) {
          this.h = new NetworkChangeNotifierAutoDetect$i(f.a());
       }
       NetworkChangeNotifierAutoDetect$a uoa = null;
       this.i = new NetworkChangeNotifierAutoDetect$e(this, uoa);
       this.j = new NetworkRequest$Builder().addCapability(12).removeCapability(15).build();
       if (sDK_INT >= 30) {
          this.f = new NetworkChangeNotifierAutoDetect$b(this, uoa);
       }else if(sDK_INT >= 28){
          uoa = new NetworkChangeNotifierAutoDetect$d(this, uoa);
       }
       this.f = uoa;
       this.l = this.f();
       this.c = new NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter();
       this.m = false;
       this.n = false;
       this.e = p1;
       p1.c(this);
       this.n = true;
       return;
    }
    public static int d(int p0,int p1){
       if (p0) {
          if (p0 != 1) {
             if (p0 != 4 && p0 != 5) {
                if (p0 != 6) {
                   p1 = 7;
                   if (p0 != p1) {
                      if (p0 != 9) {
                         return 0;
                      }else {
                         return 1;
                      }
                   }else {
                      return p1;
                   }
                }else {
                   return 5;
                }
             }
          }else {
             return 2;
          }
       }
       if (p1 != 20) {
          switch (p1){
              case 1:
              case 4:
              case 7:
              case 11:
              case 2:
                return 3;
              case 3:
              case 6:
              case 8:
              case 9:
              case 10:
              case 12:
              case 14:
              case 15:
              case 5:
                return 4;
              case 13:
                return 5;
              default:
                return 0;
          }
       }else {
          return 8;
       }
    }
    public static Network[] e(NetworkChangeNotifierAutoDetect$c p0,Network p1){
       Network[] networkArray;
       object oobject;
       NetworkChangeNotifierAutoDetect$c a = p0.a;
       if (a == null) {
          networkArray = new Network[0];
       }else {
          networkArray = a.getAllNetworks();
          if (networkArray == null) {
             networkArray = new Network[0];
          }
       }
       int len = networkArray.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i >= len) {
             return Arrays.copyOf(networkArray, i1);
          }
          oobject = networkArray[i];
          if (oobject != null && !oobject.equals(p1)) {
             NetworkCapabilities networkCapab = p0.c(oobject);
             if (networkCapab != null && networkCapab.hasCapability(12)) {
                if (networkCapab.hasTransport(4)) {
                   if (p0.j(oobject)) {
                      break ;
                   }
                }else {
                   int i2 = i1 + 1;
                   networkArray[i1] = oobject;
                   i1 = i2;
                }
             }
          }
          i = i + 1;
       }
       Network[] networkArray1 = new Network[]{oobject};
       return networkArray1;
    }
    public static long g(Network p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return a.b(p0);
       }
       return (long)Integer.parseInt(p0.toString());
    }
    public final void a(){
       if (!a.b || this.h()) {
          return;
       }
       throw new IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
    }
    public void b(){
       this.c(this.f());
    }
    public void c(NetworkChangeNotifierAutoDetect$f p0){
       if (p0.b() == this.l.b() && ((p0.c()).equals(this.l.c()) && (p0.h() != this.l.h() || !(p0.f()).equals(this.l.f())))) {
          this.d.a(p0.b());
       }
       if (p0.b() != this.l.b() || p0.a() != this.l.a()) {
          this.d.c(p0.a());
       }
       this.l = p0;
       return;
    }
    public NetworkChangeNotifierAutoDetect$f f(){
       return this.g.e(this.h);
    }
    public final boolean h(){
       boolean b = (this.a == Looper.myLooper())? true: false;
       return b;
    }
    public void i(Runnable p0){
       if (this.h()) {
          p0.run();
       }else {
          this.b.post(new d(this, p0));
       }
       return;
    }
    public void j(){
       this.a();
       if (this.k == null) {
          return;
       }
       this.k = false;
       NetworkChangeNotifierAutoDetect ti = this.i;
       if (ti != null) {
          this.g.i(ti);
       }
       ti = this.f;
       if (ti != null) {
          this.g.i(ti);
       }else {
          UniversalReceiver.f(f.a(), this);
       }
       return;
    }
    public void onReceive(Context p0,Intent p1){
       this.i(new NetworkChangeNotifierAutoDetect$a(this));
    }
}
