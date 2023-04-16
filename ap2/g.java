package ap2.g;
import hp2.j;
import ee1.a;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xv4.i;
import ap2.a;
import com.kuaishou.live.basic.model.StreamType;
import java.lang.Boolean;
import com.kuaishou.aryainstance.config.SnowConfig;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import ex1.b;
import w51.a;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import i91.m;
import msd.a;
import jw4.a;
import q00.b;
import tr.a;
import tr.d;
import tr.c;
import cw4.b;
import brd.a0;
import va1.q0;
import ap2.e;
import ap2.f;
import erd.g;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class g	// class@0002ab
{
    public b a;
    public b b;
    public b c;
    public String d;
    public final i e;
    public a f;
    public final j g;
    public final a h;
    public final p i;

    public void g(j p0,a p1,p p2){
       a.p(p0, "liveInfo");
       a.p(p1, "rtcManager");
       a.p(p2, "snowFactory");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       a uoa = PatchProxy.apply(null, this, g.class, "10");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       this.e = uoa;
       return;
    }
    public final boolean a(StreamType p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, og, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "livePlayStreamType");
       if (this.c != null) {
          return true;
       }
       obj = null;
       SnowConfig snowConfig = PatchProxy.apply(obj, this, og, "11");
       if (snowConfig != patchProxyRe) {
       }else {
          snowConfig = new SnowConfig();
          snowConfig.appName = "kuaishou_android";
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          snowConfig.appUserId = qCurrentUser.getId();
          snowConfig.deviceId = a.a;
          snowConfig.appVersion = a.m;
          snowConfig.isAnchor = false;
          snowConfig.videoEncConfig = b.d();
          snowConfig.aryaConfig = b.c();
          if (a.o()) {
             snowConfig.dumpEnableFlag = 0xffffffff;
             snowConfig.dumpPath = LiveSnowManager.a;
          }
          snowConfig.enableVideoFrameByteBufferObjectPoolOpt = m.c();
       }
       a uoa = this.i.invoke(this.g.a().invoke(), snowConfig);
       b uob = (uoa != null)? uoa.e(): obj;
       this.c = uob;
       this.h.Zf(c.b(a.e(), snowConfig), obj);
       if (!PatchProxy.applyVoid(obj, this, og, "12")) {
          this.b = q0.a().R(new e(this), f.b);
       }
       this.h.p2(this.e);
       b.a(p0.toInt());
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, "create Arya");
       return true;
    }
}
