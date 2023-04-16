package lp2.b;
import lp2.d;
import q00.b;
import java.lang.String;
import jp2.u;
import jp2.c;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import jp2.w;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import i91.j;
import s81.a;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import i91.i;
import k91.e;
import k91.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.d0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import kt.c;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import lp2.a;
import lt.b;
import jp2.z;
import java.lang.Boolean;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import lp2.b$a;
import erd.g;
import crd.b;
import krd.a;
import qrd.l1;

public abstract class b implements d	// class@0036b6
{
    public l a;
    public l b;
    public final a c;
    public j d;
    public final b e;
    public final String f;
    public final u g;
    public final c h;
    public final KtvMusicOrderInfo i;
    public final w j;

    public void b(b p0,String p1,u p2,c p3,KtvMusicOrderInfo p4,w p5){
       a.p(p0, "commonEngine");
       a.p(p1, "aryaSign");
       a.p(p2, "rtcService");
       a.p(p3, "ktvInfo");
       a.p(p4, "music");
       a.p(p5, "musicInfo");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
       this.c = new a();
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.a = p0;
       return;
    }
    public void b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "6")) {
          return;
       }
       uob = this.d;
       if (uob != null) {
          uob.g(p0, p0);
       }
       this.e(p0);
       return;
    }
    public void c(l p0){
       boolean b;
       c a;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       a.p(p0, "onComplete");
       this.b = p0;
       this.h("start bgm");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "11")) {
          this.e.L(a.m());
          this.e.K(a.l());
          this.e.F(i.a().mReverbLevel);
          b te = this.e;
          if (!PatchProxy.applyVoidOneRefs(te, objArray, e.class, "3")) {
             e.b();
             b = false;
             e.a.d(b);
             a = e.a;
             if (e.c == a) {
                a.b(te, b);
                e.c = e.b;
             }
             b.Z(LiveLogTag.LIVE_ARYA, "禁用了AI模式");
          }
          e.d(this.e, a.c());
          if (d0.r() && a.b()) {
             this.e.y();
          }else {
             this.e.P();
          }
       }
       w musicInfo = this.getMusicInfo();
       j oj = PatchProxy.applyOneRefs(musicInfo, this, uob, "2");
       if (oj != PatchProxyResult.class) {
       }else {
          c uoc = c.c(TextUtils.k(musicInfo.f()), TextUtils.k(musicInfo.e()), 0, 1, (int)musicInfo.b(), (int)100);
          List list = LiveVoicePartyLogTag.KTV.appendTag("BaseSingLogic");
          a.o(list, "LiveVoicePartyLogTag.KTV.appendTag\(TAG\)");
          a.o(uoc, "buildKtvBgmParam");
          oj = new j(list, this.f, uoc);
          oj.a(a.k());
          a uoa = PatchProxy.apply(objArray, this, uob, "4");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new a(this);
          }
          oj.l(uoa);
       }
       this.d = oj;
       if (oj != null) {
          oj.startPlay();
       }
       z.a(this.g, this.h, 2);
       z.a(this.g, this.h, 2);
       z.a(this.g, this.h, 8);
       return;
    }
    public void d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "10")) {
          return;
       }
       this.a = null;
       this.b = null;
       this.c.dispose();
       this.h("stop play");
       uob = this.e;
       if (!PatchProxy.applyVoidOneRefs(uob, null, e.class, "4")) {
          e.b();
          e.a.d(true);
          b.Z(LiveLogTag.LIVE_ARYA, "启用了AI模式");
          e.d(uob, e.c());
       }
       z.a(this.g, this.h, 6);
       return;
    }
    public void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "7")) {
          return;
       }
       p0 = (p0 == 1)? 10: 9;
       z.b(this.g, this.h, p0);
       z.b(this.g, this.h, p0);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       if (this.getMusicInfo().a()) {
          b uob = LiveVoicePartyApi.b().s(this.h.b(), this.h.d(), this.h.a(), this.i.musicOrderId).subscribe(new b$a(this));
          a.o(uob, "LiveVoicePartyApi.voiceP…meMs.toInt\(\)\)\n          }");
          a.b(this.c, uob);
       }
       return;
    }
    public final void g(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       uob = this.b;
       if (uob != null) {
          l1 ol1 = uob.invoke(Boolean.valueOf(p0));
       }
       this.b = null;
       return;
    }
    public w getMusicInfo(){
       return this.j;
    }
    public final void h(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       b td = this.d;
       this.d = null;
       LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
       kTV.appendTag("BaseSingLogic");
       LiveVoicePartyLogTag liveVoicePar = kTV;
       b = (td == null)? true: false;
       b.T(liveVoicePar, "innerReleasePlayer ", " release reason ", p0, "player engine is null ", Boolean.valueOf(b));
       if (td != null) {
          td.l(null);
          td.release();
       }
       return;
    }
    public void i(int p0){
    }
}
