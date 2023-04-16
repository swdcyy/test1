package kz1.a;
import bo1.g;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lp3.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa1.b;
import lp3.c;
import xp5.g;
import sz1.e;
import mz1.b;
import lz1.e;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.interactwatchdog.sei.LiveAudienceSeiChecksumPlugin;
import lz1.d;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.lang.Integer;
import kotlin.collections.CollectionsKt__CollectionsKt;
import lz1.c;
import java.util.Objects;
import lz1.g;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import sa1.b$a;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;

public final class a extends g	// class@002e34
{
    public b c;
    public g d;
    public e e;
    public b f;
    public e g;
    public final LivePlayerController h;

    public void a(LivePlayerController p0){
       a.p(p0, "livePlayerController");
       super();
       this.h = p0;
    }
    public void create(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "serviceManager");
       c uoc = p0.a(b.class);
       a.o(uoc, "serviceManager.getServic¡­foDispatcher::class.java\)");
       this.c = uoc;
       uoc = p0.a(g.class);
       a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
       this.d = uoc;
       uoc = p0.a(e.class);
       a.o(uoc, "serviceManager.getServic¡­eractManager::class.java\)");
       this.e = uoc;
       this.f = p0.c(b.class);
       a th = this.h;
       a tc = this.c;
       if (tc == null) {
          a.S("seiInfoDispatcher");
       }
       this.g = new e(th, tc);
       return;
    }
    public List r(){
       a tg;
       a td;
       d uod;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, uoa, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList obj1 = PatchProxy.apply(objArray, this, uoa, "5");
       String str = "SOURCE_LIVE";
       int i = 0;
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().u(str).d("enableSEISample", i);
       if (b) {
          a th = this.h;
          tg = this.g;
          if (tg == null) {
             a.S("seiQoSDetector");
          }
          td = this.d;
          if (td == null) {
             a.S("liveInfoManager");
          }
          obj.add(new LiveAudienceSeiChecksumPlugin(th, tg, td));
       }
       JsonElement obj2 = PatchProxy.apply(objArray, this, uoa, "6");
       if (obj2 != patchProxyRe) {
          uod = obj2;
       }else {
          JsonObject value = a.t().u(str).getValue("liveInteractWatchdogSeiFallbackConfig", JsonObject.class, new JsonObject());
          obj2 = value.e0("enable");
          boolean b1 = (obj2 != null)? obj2.d(): false;
          JsonArray jsonArray = value.g0("biz");
          if (jsonArray != null) {
             obj1 = new ArrayList();
             int i1 = jsonArray.size();
             for (; i < i1; i = i + 1) {
                JsonElement jsonElement = jsonArray.e0(i);
                a.o(jsonElement, "bizJsonArray.get\(i\)");
                obj1.add(Integer.valueOf(jsonElement.p()));
             }
          }else {
             List list = CollectionsKt__CollectionsKt.E();
          }
          JsonElement jsonElement1 = value.e0("interval");
          int i2 = (jsonElement1 != null)? jsonElement1.p(): 100;
          uod = new d(b1, obj1, i2);
       }
       if (uod.a != null) {
          tg = this.g;
          if (tg == null) {
             a.S("seiQoSDetector");
          }
          td = this.e;
          if (td == null) {
             a.S("multiInteractManager");
          }
          a tf = this.f;
          a td1 = this.d;
          if (td1 == null) {
             a.S("liveInfoManager");
          }
          c uoc = new c(tg, td, tf, td1, uod);
          obj.add(patchProxyRe);
       }
       return obj;
    }
    public void start(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       super.start();
       a tg = this.g;
       if (tg == null) {
          a.S("seiQoSDetector");
       }
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(objArray, tg, e.class, "1")) {
          if (g.a.c()) {
             tg.h.nk(1, LiveStageProto$LayoutConfig.class, tg.b);
          }else {
             tg.g.addLiveSeiListener(tg.a);
          }
          tg.g.addLiveInterActiveTsptListener(tg.c);
       }
       return;
    }
    public void stop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       super.stop();
       a tg = this.g;
       if (tg == null) {
          a.S("seiQoSDetector");
       }
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(objArray, tg, e.class, "2")) {
          tg.e = objArray;
          if (g.a.c()) {
             tg.h.ve(1, tg.b);
          }else {
             tg.g.removeLiveSeiListener(tg.a);
          }
          tg.g.removeLiveInterActiveTsptListener(tg.c);
       }
       return;
    }
}
