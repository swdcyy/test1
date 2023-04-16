package com.cmic.sso.sdk.e.s$1;
import android.net.ConnectivityManager$NetworkCallback;
import com.cmic.sso.sdk.e.s;
import com.cmic.sso.sdk.e.s$a;
import android.net.Network;

public class s$1 extends ConnectivityManager$NetworkCallback	// class@000f70
{
    public final s$a a;
    public final s b;

    public void s$1(s p0,s$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAvailable(Network p0){
       s.a(this.b, p0);
       this.a.a(p0);
       s.a(this.b, false);
    }
    public void onLost(Network p0){
       s.a(this.b, true);
    }
}
