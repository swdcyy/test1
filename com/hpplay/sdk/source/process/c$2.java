package com.hpplay.sdk.source.process.c$2;
import com.hpplay.sdk.source.c$a;
import com.hpplay.sdk.source.process.c;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import com.hpplay.sdk.source.api.IConnectListener;

public class c$2 extends c$a	// class@000698
{
    public final c c;

    public void c$2(c p0){
       this.c = p0;
       super();
    }
    public void onConnect(LelinkServiceInfo p0,int p1){
       if (c.b(this.c) != null) {
          c.b(this.c).onConnect(p0, p1);
       }
       return;
    }
    public void onDisconnect(LelinkServiceInfo p0,int p1,int p2){
       if (c.b(this.c) != null) {
          c.b(this.c).onDisconnect(p0, p1, p2);
       }
       return;
    }
}
