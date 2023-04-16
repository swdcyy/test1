package com.yxcorp.gifshow.autoplay.state.NetworkState$NetworkChangedReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.autoplay.state.NetworkState;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z99.c;
import java.util.Objects;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;

public class NetworkState$NetworkChangedReceiver extends BroadcastReceiver	// class@001c35
{
    public int a;
    public final NetworkState b;

    public void NetworkState$NetworkChangedReceiver(NetworkState p0){
       this.b = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkState$NetworkChangedReceiver.class, "1")) {
          return;
       }
       int i = c.f(p0);
       if (i != this.a) {
          this.a = i;
          NetworkState$NetworkChangedReceiver tb = this.b;
          Objects.requireNonNull(tb);
          NetworkState networkState = NetworkState.class;
          if (PatchProxy.isSupport(networkState) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, networkState, "3") && i != tb.a)) {
             tb.a = i;
             Iterator iterator = tb.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().b(i);
             }
          }
       }
       return;
    }
}
