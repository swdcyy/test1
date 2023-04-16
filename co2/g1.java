package co2.g1;
import co2.i0;
import co2.f2;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Boolean;
import t02.a0;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Integer;
import lp3.e;
import lp3.c;
import lp3.b;
import hp2.e;
import co2.h0;
import com.google.gson.JsonObject;

public final class g1 implements i0	// class@00058a
{
    public a0 b;
    public i0 c;
    public final f2 d;
    public final a e;

    public void g1(f2 p0,a p1){
       a.p(p0, "voicePartyContext");
       a.p(p1, "micSeatsDataManagerSupplier");
       super();
       this.d = p0;
       this.e = p1;
    }
    public int Ac(){
       g1 obj = PatchProxy.apply(null, this, g1.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int i = (obj != null)? obj.Ac(): 0;
       return i;
    }
    public ClientContentWrapper$LiveVoicePartyPackage B(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g1 og1 = g1.class;
       Object[] objArray = null;
       QCurrentUser obj = PatchProxy.apply(objArray, this, og1, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.c != null) {
          g1 td = this.d;
          obj = QCurrentUser.me();
          a.o(obj, "QCurrentUser.me\(\)");
          String id = obj.getId();
          a.o(id, "QCurrentUser.me\(\).id");
          VoicePartyMicSeatData voicePartyMi = PatchProxy.applyOneRefs(id, this, og1, "9");
          if (voicePartyMi != patchProxyRe) {
          }else {
             a.p(id, "userId");
             voicePartyMi = this.e.invoke().j(id);
          }
          objArray = n.j(td, voicePartyMi);
       }
       return objArray;
    }
    public ClientContent$LiveVoicePartyPackageV2 Dc(){
       Object obj = PatchProxy.apply(null, this, g1.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.c(this.d);
    }
    public boolean L2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return MicSeatsDataManager.q(this.e.invoke(), p0, false, 2, null);
    }
    public int S5(){
       g1 obj = PatchProxy.apply(null, this, g1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int i = (obj != null)? obj.S5(): 0;
       return i;
    }
    public boolean U4(String p0){
       g1 obj = PatchProxy.applyOneRefs(p0, this, g1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       obj = this.b;
       boolean b = false;
       if (obj != null) {
          a0 b2 = obj.b2;
          if (b2 != null) {
             LiveApiParams$AssistantType uAssistantTy = b2.d(p0);
             if (uAssistantTy == LiveApiParams$AssistantType.ADMIN || uAssistantTy == LiveApiParams$AssistantType.SUPER_ADMIN) {
                b = true;
             }
          }
       }
       return b;
    }
    public String We(){
       String obj = PatchProxy.apply(null, this, g1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.f();
       a.o(obj, "voicePartyContext.crossRoomPkId");
       return obj;
    }
    public void a0(int p0){
       g1 og1 = g1.class;
       if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og1, "12")) {
          return;
       }
       og1 = this.c;
       if (og1 != null) {
          og1.a0(p0);
       }
       return;
    }
    public boolean b2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return this.e.invoke().r(p0);
    }
    public boolean cd(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return this.e.invoke().t(p0);
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public String g0(){
       Object obj = PatchProxy.apply(null, this, g1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.y();
    }
    public e h3(){
       return h0.a(this);
    }
    public String k0(){
       String obj = PatchProxy.apply(null, this, g1.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.t();
       a.o(obj, "voicePartyContext.theaterId");
       return obj;
    }
    public VoicePartyMicSeatData na(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       return this.e.invoke().j(p0);
    }
    public boolean p6(){
       Object obj = PatchProxy.apply(null, this, g1.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.h() == 6)? true: false;
       return b;
    }
    public JsonObject q1(){
       JsonObject obj = PatchProxy.apply(null, this, g1.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.l(this.d);
       a.o(obj, "VoicePartyLoggers.getCom¡­Params\(voicePartyContext\)");
       return obj;
    }
    public f2 r0(){
       return this.d;
    }
    public boolean w2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return this.e.invoke().p(p0, true);
    }
    public boolean wd(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public void xf(String p0,int p1){
       g1 og1 = g1.class;
       if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og1, "13")) {
          return;
       }
       a.p(p0, "musicId");
       og1 = this.c;
       if (og1 != null) {
          og1.xf(p0, p1);
       }
       return;
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       Object obj = PatchProxy.apply(null, this, g1.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.h(this.d);
    }
}
