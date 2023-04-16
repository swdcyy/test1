package com.loc.o$b$2;
import android.net.ConnectivityManager$NetworkCallback;
import com.loc.o$b;
import android.net.Network;
import com.loc.o;

public final class o$b$2 extends ConnectivityManager$NetworkCallback	// class@00145b
{
    public final o$b a;

    public void o$b$2(o$b p0){
       this.a = p0;
       super();
    }
    public final void onAvailable(Network p0){
       super.onAvailable(p0);
       o.h();
    }
    public final void onLost(Network p0){
       super.onLost(p0);
       o.h();
    }
}
