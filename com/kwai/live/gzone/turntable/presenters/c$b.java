package com.kwai.live.gzone.turntable.presenters.c$b;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import com.kwai.live.gzone.turntable.presenters.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fq5.b;

public class c$b extends LiveGzoneTurntableLogger	// class@000e5d
{
    public final c f;

    public void c$b(c p0){
       this.f = p0;
       super();
    }
    public ClientContent$LiveStreamPackage h(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.r.a();
    }
}
