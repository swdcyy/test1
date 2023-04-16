package com.hpplay.sdk.source.process.c$1;
import com.hpplay.sdk.source.f$a;
import com.hpplay.sdk.source.process.c;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import com.hpplay.sdk.source.browse.api.IParceResultListener;

public class c$1 extends f$a	// class@000697
{
    public final c b;

    public void c$1(c p0){
       this.b = p0;
       super();
    }
    public void onParceResult(int p0,LelinkServiceInfo p1){
       if (c.a(this.b) != null) {
          c.a(this.b).onParceResult(p0, p1);
       }
       return;
    }
}
