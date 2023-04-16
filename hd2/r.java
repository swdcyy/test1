package hd2.r;
import hd2.r$a;
import nsd.u;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hd2.r$d;
import hd2.r$c;
import hd2.r$b;
import hd2.r$e;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.waynelive.util.SeiExtraData;
import hd2.l0;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import lnc.b9;

public final class r	// class@002d76
{
    public final c a;
    public final LivePlayerTypeChangeListener b;
    public final Runnable c;
    public final IKwaiMediaPlayer$OnLiveSeiInfoListener d;
    public b e;
    public boolean f;
    public final LivePlayerController g;
    public final LivePlayerTypeChangeListener h;
    public static final r$a i;

    static {
       r.i = new r$a(null);
    }
    public void r(LivePlayerController p0,LivePlayerTypeChangeListener p1){
       a.p(p0, "livePlayerController");
       a.p(p1, "typeChangeListener");
       super();
       this.g = p0;
       this.h = p1;
       r$d uod = new r$d(this);
       this.a = uod;
       r$c uoc = new r$c(this);
       this.b = uoc;
       this.c = new r$b(this);
       r$e uoe = new r$e(this);
       this.d = uoe;
       b.Z(uod, "init");
       this.c(true, p0.getPkLiveStreamType());
       p0.setPkStreamTypeChangeListener(uoc);
       p0.setPkSeiListener(uoe);
    }
    public final boolean a(int p0){
       boolean b;
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, or, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b.c0(this.a, "isSideBySideStream", "type", Integer.valueOf(p0));
       b = (p0 == 2)? true: false;
       return b;
    }
    public final boolean b(SeiExtraData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          b.Z(this.a, "isValidSeiData false, sei is null");
          return b;
       }else {
          p0 = p0.mPayloadType;
          if (p0 != 251) {
             b.c0(this.a, "isValidSeiData false invalid sei payloadType", "type", Integer.valueOf(p0));
             return b;
          }else {
             b.Z(this.a, "isValidSeiData true");
             return true;
          }
       }
    }
    public final void c(boolean p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, or, "2")) {
          return;
       }
       b.d0(this.a, "updateLiveStreamType", "type", Integer.valueOf(p1), "isInitState", Boolean.valueOf(p0));
       if (this.a(p1)) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, or, "3")) {
             b.Z(this.a, "onLiveTypeSideBySideStream");
             this.f = false;
             if (!this.b(this.g.getPkSeiCache())) {
                b.Z(this.a, "onLiveTypeSideBySideStream invalid sei");
                if (!PatchProxy.applyVoid(objArray, this, or, "6")) {
                   Object obj = PatchProxy.apply(objArray, objArray, l0.class, "13");
                   long l = (obj != PatchProxyResult.class)? obj.longValue(): a.t().u("SOURCE_LIVE").b("livePkDelayStreamTypeChangeDurationMs", 500);
                   b.c0(this.a, "startNoticeSideBySideTask", "delayMs", Long.valueOf(l));
                   k1.m(this.c);
                   k1.s(this.c, this, l);
                }
             }
          }
       }else if(PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, or, "4")){
          b.d0(this.a, "oLiveTypeOtherStream", "isInitState", Boolean.valueOf(p0), "isPlayerPlaying", Boolean.valueOf(this.g.isPlaying()));
          this.f = true;
          if (!p0) {
             this.d();
             this.h.onLiveTypeChange(p1);
          }else if(this.g.isPlaying()){
             this.h.onLiveTypeChange(p1);
          }
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, r.class, "7")) {
          return;
       }
       b.Z(this.a, "stopNoticeSideBySideTask");
       b9.a(this.e);
       k1.n(this);
       return;
    }
}
