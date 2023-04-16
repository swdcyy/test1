package eo2.i;
import eo2.h;
import m91.b;
import com.kuaishou.live.core.voiceparty.b;
import co2.f2;
import qs2.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import aw2.c;
import bw2.a;
import vq5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTeamPkPackage;
import k2b.u1;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import qs2.r;

public final class i extends h	// class@0027a6
{
    public final b m;
    public final b n;
    public final f2 o;
    public final a p;
    public final MicSeatsDataManager q;
    public final c r;
    public final a s;
    public final d t;

    public void i(b p0,b p1,f2 p2,a p3,MicSeatsDataManager p4,c p5,a p6,d p7){
       a.p(p0, "bizRelationService");
       a.p(p1, "micSeatDispatcher");
       a.p(p2, "voicePartyContext");
       a.p(p3, "micManageService");
       a.p(p4, "micSeatsDataManager");
       a.p(p5, "battleService");
       a.p(p6, "teamPkLogger");
       a.p(p7, "liveRouterManager");
       super(p0, p1, p2, p3, p4, p7);
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.t = p7;
    }
    public void w0(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "1")) {
          return;
       }
       if (this.A0()) {
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "2")) {
             oi = this.s;
             Objects.requireNonNull(oi);
             if (!PatchProxy.applyVoid(null, oi, a.class, "8")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "VOICE_PARTY_TEAMPK_JOIN_PK_ENTRANCE";
                ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
                uContentWrap.liveVoicePartyPackage = n.g(oi.b);
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = oi.a.a();
                uContentPack.liveVoicePartyTeampkPackage = a.a(oi.b);
                u1.H("", 1, uElementPack, uContentPack, uContentWrap);
             }
             if (this.o.g() == 3) {
                i.a(R.style.arg_RES_7f11066a, 0x7f102dd6);
             }else {
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                String id = qCurrentUser.getId();
                a.o(id, "QCurrentUser.me\(\).id");
                if (!MicSeatsDataManager.q(this.q, id, false, 2, null) && !r.b(this.q.k())) {
                   this.p.J("MIC_FULL", this.u0(p0));
                }else {
                   this.r.b();
                }
             }
          }
       }else {
          super.w0(p0);
       }
       return;
    }
}
