package androidx.work.impl.constraints.trackers.NetworkStateTracker$a;
import android.net.ConnectivityManager$NetworkCallback;
import androidx.work.impl.constraints.trackers.NetworkStateTracker;
import android.net.Network;
import android.net.NetworkCapabilities;
import k3.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import q3.b;
import s3.c;

public class NetworkStateTracker$a extends ConnectivityManager$NetworkCallback	// class@000a87
{
    public final NetworkStateTracker a;

    public void NetworkStateTracker$a(NetworkStateTracker p0){
       this.a = p0;
       super();
    }
    public void onCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       Object[] objArray = new Object[]{p1};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(NetworkStateTracker.j, String.format("Network capabilities changed: %s", objArray), throwableArr);
       NetworkStateTracker$a ta = this.a;
       ta.d(ta.g());
    }
    public void onLost(Network p0){
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(NetworkStateTracker.j, "Network connection lost", throwableArr);
       NetworkStateTracker$a ta = this.a;
       ta.d(ta.g());
    }
}
