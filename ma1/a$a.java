package ma1.a$a;
import java.lang.Object;
import nsd.u;
import ja1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveResourceFilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import java.lang.System;
import q2b.h$b;
import k2b.u1;

public final class a$a	// class@00313a
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final void a(f p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "taskUnit");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.c("file_size", Long.valueOf(p0.q));
       oi3.d("fail_reason", p0.c());
       uElementPack.params = oi3.toString();
       ClientContent$LiveResourceFilePackage liveResource = new ClientContent$LiveResourceFilePackage();
       liveResource.isZipFile = p0.h();
       liveResource.type = p0.a();
       liveResource.version = p0.f();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveResourceFilePackage = liveResource;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.vlaue = String.valueOf((System.currentTimeMillis() - p0.r));
       moreInfoPack.tag = p0.p;
       uContentWrap.moreInfoPackage = moreInfoPack;
       int i = (p1)? 10: 8;
       h$b uob = h$b.e(i, "LIVE_RESOURCE_DOWNLOAD");
       uob.h(uContentPack);
       uob.i(uContentWrap);
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
