package com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import zo2.n;
import qu2.a;
import hf3.a;
import brd.t;
import zo2.p0;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import ip2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.h;
import zo2.m;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import zo2.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyOpened;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import hp2.d;
import hp2.q;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$1;
import hp2.o;
import com.kwai.framework.model.user.QCurrentUser;
import msd.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a;
import hp2.t;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import trd.d1;
import ut7.p;
import com.kwai.statechart.UmlKt$toUmlStateDiagram$1;
import com.kwai.statechart.UmlKt$toUmlStateDiagram$2;
import java.util.ArrayList;
import com.kwai.statechart.PlantUmlStateDiagramVisitor;
import msd.l;
import ut7.j;
import com.kwai.statechart.StateChart;
import com.kwai.statechart.CollapsedSubStateVisitor;
import com.kwai.statechart.a;
import com.kwai.statechart.UmlKt$expandCollapsedStates$1;
import pp.c;
import com.kuaishou.android.live.log.b;
import hp2.c;
import zo2.l0;
import hp2.b;
import crd.a;
import ekd.k1;
import zo2.a;
import crd.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import zo2.l;
import pp2.a;

public final class AudienceVoicePartyManager extends a	// class@00138d
{
    public final h d;
    public final m e;
    public final boolean f;
    public l0 g;
    public a h;
    public final n i;
    public final a j;
    public final a k;
    public final t l;
    public final p0 m;
    public final RtcManager n;
    public final a o;

    public void AudienceVoicePartyManager(n p0,a p1,a p2,t p3,p0 p4,RtcManager p5,a p6){
       a.p(p0, "param");
       a.p(p1, "liveBaseContext");
       a.p(p2, "longConnection");
       a.p(p3, "offlineSignal");
       a.p(p4, "logger");
       a.p(p5, "rtcManager");
       a.p(p6, "crossRoomPkSwitchManager");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       this.o = p6;
       this.d = new h(p2);
       this.e = new m();
       LiveStreamMessages$SCVoicePartyOpened commonInfo = p0.e().commonInfo;
       a.o(commonInfo, "param.proto.commonInfo");
       this.e().l(new b(commonInfo));
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       this.e().n(new q(new AudienceVoicePartyManager$1(this), p0.i(), new o(p1.d()), new o(id)));
    }
    public a$a c(){
       Object obj = PatchProxy.apply(null, this, AudienceVoicePartyManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AudienceVoicePartyManager$a(this);
    }
    public a$d d(){
       Object obj = PatchProxy.apply(null, this, AudienceVoicePartyManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$d(this);
    }
    public t h(){
       return this.n();
    }
    public void j(){
       String str2;
       Object[] objArray2;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, AudienceVoicePartyManager.class, "7")) {
          return;
       }
       LiveLogTag lIVE_VOICE_P = LiveLogTag.LIVE_VOICE_PARTY;
       StringBuilder str = "AryaManager uml:\n";
       AudienceVoicePartyManager n = obj.n;
       Objects.requireNonNull(n);
       Set obj1 = PatchProxy.apply(objArray, n, RtcManager.class, "12");
       if (obj1 != PatchProxyResult.class) {
       }else {
          RtcManager j = n.j;
          obj1 = d1.k();
          Set set = d1.k();
          PlantUmlStateDiagramVisitor obj2 = PatchProxy.applyThreeRefs(j, obj1, set, null, p.class, "1");
          if (obj2 != PatchProxyResult.class) {
          }else {
             String str1 = "<this>";
             a.p(j, str1);
             a.p(obj1, "excludeTransition");
             a.p(set, "collapseSubChart");
             UmlKt$toUmlStateDiagram$1 otoUmlStateD = new UmlKt$toUmlStateDiagram$1(obj1);
             UmlKt$toUmlStateDiagram$2 otoUmlStateD1 = new UmlKt$toUmlStateDiagram$2(set);
             obj2 = PatchProxy.applyThreeRefs(j, otoUmlStateD, otoUmlStateD1, null, p.class, "2");
             if (obj2 != PatchProxyResult.class) {
             }else {
                a.p(j, str1);
                a.p(otoUmlStateD, "transitionFilter");
                a.p(otoUmlStateD1, "collapseSubChartFilter");
                ArrayList uArrayList = new ArrayList();
                obj2 = new PlantUmlStateDiagramVisitor(otoUmlStateD, otoUmlStateD1);
                j.u(obj2);
                uArrayList.add(obj2.j());
                CollapsedSubStateVisitor uCollapsedSu = CollapsedSubStateVisitor.class;
                if (!PatchProxy.applyVoidFourRefs(j, otoUmlStateD1, otoUmlStateD, uArrayList, null, p.class, "3")) {
                   while (true) {
                      CollapsedSubStateVisitor uCollapsedSu1 = new CollapsedSubStateVisitor(otoUmlStateD, otoUmlStateD1);
                      j.u(uCollapsedSu1);
                      Object obj3 = PatchProxy.apply(null, uCollapsedSu1, uCollapsedSu, "1");
                      if (obj3 != PatchProxyResult.class) {
                         str2 = obj3;
                      label_00cd :
                         if (str2 != null) {
                            uArrayList.add(str2);
                            Object[] objArray1 = null;
                            obj3 = PatchProxy.apply(objArray1, uCollapsedSu1, uCollapsedSu, "2");
                            if (obj3 != PatchProxyResult.class) {
                               objArray2 = obj3;
                            }else {
                               uCollapsedSu1 = uCollapsedSu1.c;
                               objArray2 = (uCollapsedSu1 == null)? objArray1: uCollapsedSu1.b();
                            }
                            a.m(objArray2);
                            otoUmlStateD1 = new UmlKt$expandCollapsedStates$1(objArray2, otoUmlStateD1);
                         }
                      }else if(uCollapsedSu1.c != null){
                         str2 = uCollapsedSu1.b.j();
                         goto label_00cd ;
                      }else {
                         str2 = null;
                         goto label_00cd ;
                      }
                   }
                }
                obj1 = uArrayList;
             }
          }
          obj1 = obj2;
       }
       b.Z(lIVE_VOICE_P, str+obj1+10);
       return;
    }
    public void k(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVoicePartyManager.class, "8")) {
          return;
       }
       a.p(p0, "reason");
       AudienceVoicePartyManager tg = this.g;
       if (tg == null) {
          a.S("switchLogic");
       }
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(null, tg, l0.class, "7")) {
          b.Z(b.a(), "Audience ModeSwitchLogic release");
          tg.c.b();
          tg.d.d();
          k1.n(tg);
          tg.b = true;
       }
       tg = this.h;
       if (tg == null) {
          a.S("aryaBusinessSwitchLogic");
       }
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(null, tg, a.class, "1")) {
          tg.a.dispose();
          tg.d.i(tg.c);
       }
       this.d.b();
       super.k(p0);
       this.m.a(p0);
       return;
    }
    public final void m(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVoicePartyManager.class, "4")) {
          return;
       }
       a.p(p0, "observer");
       this.n().j0(p0);
       return;
    }
    public m n(){
       return this.e;
    }
    public final void o(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVoicePartyManager.class, "5")) {
          return;
       }
       a.p(p0, "observer");
       this.n().l0(p0);
       return;
    }
}
