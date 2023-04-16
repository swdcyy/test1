package com.hpplay.sdk.source.process.b$2;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.process.b;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.StringBuilder;
import java.lang.String;
import com.hpplay.sdk.source.a.a;
import java.util.List;

public class b$2 implements IConnectListener	// class@000691
{
    public final b a;

    public void b$2(b p0){
       this.a = p0;
       super();
    }
    public void onConnect(LelinkServiceInfo p0,int p1){
       StringBuilder str = "onConnect ";
       String name = (p0 != null)? p0.getName(): p1+"";
       a.f("LelinkSdkManager", str+name);
       if (b.c(this.a) != null) {
          b.c(this.a).onConnect(p0, p1);
       }
       this.a.a(p0);
       return;
    }
    public void onDisconnect(LelinkServiceInfo p0,int p1,int p2){
       StringBuilder str = "onDisconnect ";
       String name = (p0 != null)? p0.getName(): p1+"";
       a.f("LelinkSdkManager", str+name);
       if (b.c(this.a) != null) {
          b.c(this.a).onDisconnect(p0, p1, p2);
       }
       if (b.d(this.a) != null) {
          b.d(this.a).clear();
          b.a(this.a, null);
       }
       return;
    }
}
