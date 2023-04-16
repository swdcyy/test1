package com.kwai.live.gzone.turntable.a$a;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import com.kwai.live.gzone.turntable.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y43.a;
import fq5.b;

public class a$a extends LiveGzoneTurntableLogger	// class@000e2a
{
    public final a f;

    public void a$a(a p0){
       this.f = p0;
       super();
    }
    public ClientContent$LiveStreamPackage h(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.w.m.a();
    }
}
