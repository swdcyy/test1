package co2.g0;
import co2.c;
import co2.f2;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kwai.robust.PatchProxyResult;
import yx2.n;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Integer;
import java.lang.Number;
import ty1.a;
import e17.i;
import lp3.e;
import lp3.c;
import lp3.b;
import hp2.e;
import co2.b;
import t02.r1;
import com.kuaishou.live.core.voiceparty.model.VoicePartyOpenInfo;
import com.google.gson.JsonObject;
import co2.g0$a;
import ok.x;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import ms2.a;

public abstract class g0 implements c	// class@000589
{
    public c b;
    public final f2 c;
    public final a d;
    public final a e;

    public void g0(f2 p0,a p1,a p2){
       a.p(p0, "voicePartyContext");
       a.p(p1, "callerContextSupplier");
       a.p(p2, "micSeatsDataManagerSupplier");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public void F8(String p0,g p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g0.class, "6")) {
          return;
       }
       g0 tb = this.b;
       if (tb != null) {
          tb.F8(p0, p1, p2);
       }
       return;
    }
    public ClientContent$LiveVoicePartyPackageV2 F9(){
       Object obj = PatchProxy.apply(null, this, g0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.c(this.c);
    }
    public boolean Fn(){
       Object obj = PatchProxy.apply(null, this, g0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c.h() == 6)? true: false;
       return b;
    }
    public boolean L2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return MicSeatsDataManager.q(this.e.invoke(), p0, false, 2, null);
    }
    public void Lm(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og0, "7")) {
          return;
       }
       og0 = this.b;
       if (og0 != null) {
          og0.Lm(p0);
       }
       return;
    }
    public int S5(){
       g0 obj = PatchProxy.apply(null, this, g0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj != null)? obj.S5(): 0;
       return i;
    }
    public boolean Sa(){
       return this.c.g;
    }
    public boolean U4(String p0){
       return false;
    }
    public String We(){
       String obj = PatchProxy.apply(null, this, g0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.f();
       a.o(obj, "voicePartyContext.crossRoomPkId");
       return obj;
    }
    public void a0(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og0, "5")) {
          return;
       }
       og0 = this.b;
       if (og0 != null) {
          og0.a0(p0);
          return;
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f10254a);
          return;
       }
    }
    public boolean b2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return this.e.invoke().r(p0);
    }
    public ClientContent$LiveVoicePartyPackageV2 b4(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b != null) {
          objArray = n.h(this.c);
       }
       return objArray;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public String g0(){
       String obj = PatchProxy.apply(null, this, g0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.y();
       a.o(obj, "voicePartyContext.voicePartyId");
       return obj;
    }
    public e h3(){
       return b.a(this);
    }
    public String k0(){
       String obj = PatchProxy.apply(null, this, g0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.t();
       a.o(obj, "voicePartyContext.theaterId");
       return obj;
    }
    public boolean la(){
       Object obj = PatchProxy.apply(null, this, g0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c.h() == 2)? true: false;
       return b;
    }
    public String n6(){
       Object[] objArray = null;
       r1 obj = PatchProxy.apply(objArray, this, g0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.invoke().l;
       if (obj != null) {
          objArray = obj.mGroupChatId;
       }
       return objArray;
    }
    public boolean p7(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public JsonObject q1(){
       JsonObject obj = PatchProxy.apply(null, this, g0.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.l(this.c);
       a.o(obj, "VoicePartyLoggers.getCom¡­Params\(voicePartyContext\)");
       return obj;
    }
    public final void r(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       a.p(p0, "delegate");
       this.b = p0;
       this.c.C(new g0$a(p0));
       return;
    }
    public f2 r0(){
       return this.c;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, g0.class, "2")) {
          return;
       }
       this.c.P();
       this.b = null;
       return;
    }
    public boolean w2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return this.e.invoke().p(p0, true);
    }
    public boolean x7(){
       Object[] objArray = null;
       f2 obj = PatchProxy.apply(objArray, this, g0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.u;
       if (obj != null) {
          objArray = obj.c();
       }
       boolean b = (objArray == KtvSingMode.VIDEO)? true: false;
       return b;
    }
}
