package com.facebook.react.modules.network.NetworkingModule$c;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import okhttp3.OkHttpClient;
import xd.a;

public class NetworkingModule$c extends GuardedAsyncTask	// class@0012c7
{
    public final int a;
    public final NetworkingModule b;

    public void NetworkingModule$c(NetworkingModule p0,ReactContext p1,int p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule$c.class, "1")) {
       }else {
          a.a(this.b.mClient, Integer.valueOf(this.a));
          a.a(this.b.mOriginClient, Integer.valueOf(this.a));
       }
       return;
    }
}
