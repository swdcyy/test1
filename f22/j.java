package f22.j;
import com.kuaishou.live.common.core.basic.widget.SingleSwitchPanel$a;
import f22.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import f22.k;
import f22.l;
import erd.g;
import crd.b;
import crd.a;
import f22.g;
import f22.g$a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;

public final class j implements SingleSwitchPanel$a	// class@00284d
{
    public final m a;

    public void j(m p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       m g;
       m j;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "1")) {
          return;
       }
       LiveLogTag gUEST_INVITE = LiveLogTag.GUEST_INVITE_FRIENDS;
       b.Z(gUEST_INVITE, this.a.a+" onSwitchStateChanged: "+p0);
       j ta = this.a;
       Objects.requireNonNull(ta);
       m om = m.class;
       int i = 2;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ta, om, "5")) {
          b.Z(gUEST_INVITE, ta.a+" setAutoInvitationSetting");
          f uof = e.a();
          int i4 = (p0)? 1: 2;
          ta.b.c(uof.q0(i4).map(new e()).subscribe(new k(ta), new l(ta)));
       }
       g$a a = g.a;
       ta = this.a;
       om = ta.e;
       m f = ta.f;
       g = ta.g;
       m h = ta.h;
       int i1 = p0 ^ 1;
       m i2 = ta.i;
       j = ta.j;
       Objects.requireNonNull(a);
       g$a uoa = g$a.class;
       int i3 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{om,f,g,h,Boolean.valueOf(i1),i2,j};
          if (PatchProxy.applyVoid(objArray, a, uoa, "6")) {
          label_012b :
             return;
          }
       }
       a.p(f, "liveStreamPackage");
       a.p(h, "source");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AOTO_INVITE_SWITCH_PANEL";
       i3 oi3 = i3.f();
       oi3.d("panel_source", h);
       String str = (i1)? "TRUE": "FALSE";
       oi3.d("status", str);
       str = (i2 == null || !i2.length())? 1: null;
       if (!str) {
          oi3.d("voice_nine_room_id", i2);
       }
       if (j == null || !j.length()) {
          i3 = 1;
       }
       if (!i3) {
          oi3.d("voice_party_pk_id", j);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = f;
       uContentPack.liveVoicePartyPackage = g;
       u1.L("", om, 1, uElementPack, uContentPack);
       goto label_012b ;
    }
}
