package com.yxcorp.gifshow.autoplay.state.NetworkState;
import java.lang.Object;
import android.app.Application;
import o56.a;
import android.content.Context;
import z99.c;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.IntentFilter;
import java.lang.String;
import com.yxcorp.gifshow.autoplay.state.NetworkState$NetworkChangedReceiver;
import android.content.BroadcastReceiver;
import android.content.Intent;
import java.lang.Throwable;
import u99.d;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class NetworkState	// class@001c37
{
    public int a;
    public final List b;

    public void NetworkState(){
       super();
       this.a = c.f(a.b());
       this.b = new CopyOnWriteArrayList();
       String str = "android.net.conn.CONNECTIVITY_CHANGE";
       try{
          IntentFilter intentFilter = new IntentFilter(str);
          a.b().registerReceiver(new NetworkState$NetworkChangedReceiver(this), intentFilter);
       }catch(java.lang.Exception e0){
          d.a("NetworkState", "NetworkState", e0);
       }
       return;
    }
    public void a(NetworkState$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkState.class, "1")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public int b(){
       return this.a;
    }
    public void c(NetworkState$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkState.class, "2")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
}
