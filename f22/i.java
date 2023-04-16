package f22.i;
import erd.g;
import f22.m;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import f22.g;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import f22.g$a;

public final class i implements g	// class@00284c
{
    public final m b;

    public void i(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          b.I(LiveLogTag.GUEST_INVITE_FRIENDS, this.b.a+" fetchAutoInvitationSetting", p0);
          p0 = this.b;
          g.a.b(p0.e, p0.f, p0.g, p0.h, false, p0.i, p0.j);
       }
       return;
    }
}
