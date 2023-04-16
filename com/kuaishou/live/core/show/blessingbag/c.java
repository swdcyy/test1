package com.kuaishou.live.core.show.blessingbag.c;
import java.lang.String;
import p91.m;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.blessingbag.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.core.show.blessingbag.c$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;

public final class c	// class@000a0a
{
    public final e0 a;
    public final ClientEvent$ElementPackage b;
    public final ClientContent$ContentPackage c;

    public void c(String p0,m p1){
       super();
       this.a = p1.b();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       this.b = uElementPack;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       this.c = uContentPack;
       uElementPack.action2 = p0;
       uContentPack.liveStreamPackage = p1.a();
    }
    public final c a(c$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.a(this.b);
       return this;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       u1.L("", this.a, 1, this.b, this.c);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       u1.C0("", this.a, 9, this.b, this.c);
       return;
    }
    public final c d(c$b p0){
       ClientContent$MoreInfoPackageV2 obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$MoreInfoPackageV2();
       p0.a(obj);
       p0.moreInfoPackage = obj;
       return this;
    }
}
