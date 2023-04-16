package fv2.a;
import p91.m;
import co2.f2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import z12.x;
import yx2.n$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public final class a	// class@0029ec
{

    public static final void a(m p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       a.p(p0, "liveBasicContext");
       a.p(p1, "voicePartyContext");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_VOICE_NINE_BUTTON";
       n$a uoa = new n$a();
       uoa.e(uElementPack);
       uoa.h(n.h(p1));
       uoa.f(p0.a());
       n.t(x.k(p0), uoa);
       return;
    }
    public static final void b(m p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       a.p(p0, "liveBasicContext");
       a.p(p1, "voicePartyContext");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_VOICE_NINE_BUTTON";
       n$a uoa = new n$a();
       uoa.e(uElementPack);
       uoa.h(n.h(p1));
       uoa.f(p0.a());
       n.w(x.k(p0), uoa);
       return;
    }
}
