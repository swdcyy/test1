package mp2.b;
import mp2.d;
import java.lang.String;
import jp2.w;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Object;
import kotlin.jvm.internal.a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import i91.j;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import kt.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import lt.b;
import mp2.a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import ekd.k1;

public class b implements d	// class@0037f0
{
    public boolean a;
    public l b;
    public l c;
    public j d;
    public final String e;
    public final w f;
    public final Lyrics g;

    public void b(String p0,w p1,Lyrics p2){
       a.p(p0, "aryaSign");
       a.p(p1, "musicInfo");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.b = p0;
       return;
    }
    public void b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       uob = this.d;
       if (uob != null) {
          uob.g(p0, p0);
       }
       return;
    }
    public void c(int p0,l p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       a.p(p1, "onComplete");
       this.c = p1;
       this.d("start play");
       w musicInfo = this.getMusicInfo();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = PatchProxy.applyOneRefs(musicInfo, this, uob, "5");
       if (oj != patchProxyRe) {
       }else {
          c uoc = c.c(TextUtils.k(musicInfo.f()), TextUtils.k(musicInfo.e()), 1, 1, (int)musicInfo.b(), (int)100);
          List list = LiveLogTag.LIVE_VOICE_PARTY.appendTag("BaseWatchLogicWithRtcRoom");
          a.o(list, "LiveLogTag.LIVE_VOICE_PARTY.appendTag\(TAG\)");
          a.o(uoc, "buildKtvBgmParam");
          oj = new j(list, this.e, uoc);
          a uoa = PatchProxy.apply(null, this, uob, "6");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new a(this);
          }
          oj.l(uoa);
       }
       this.d = oj;
       b = (oj != null)? oj.startPlay(): false;
       this.a = b;
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, "Arya: audience ktv start success:"+b);
       if (b) {
          this.b(p0);
       }else {
          p1.invoke(Boolean.FALSE);
       }
       return;
    }
    public final void d(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       b td = this.d;
       this.d = null;
       LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
       kTV.appendTag("BaseWatchLogicWithRtcRoom");
       LiveVoicePartyLogTag liveVoicePar = kTV;
       b = (td == null)? true: false;
       b.T(liveVoicePar, "innerReleasePlayer ", " release reason ", p0, "player engine is null ", Boolean.valueOf(b));
       if (td != null) {
          td.l(null);
          td.release();
       }
       return;
    }
    public void e(int p0){
    }
    public Lyrics getLyrics(){
       return this.g;
    }
    public w getMusicInfo(){
       return this.f;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.a != null) {
          this.d("stop play");
       }
       this.b = null;
       this.c = null;
       k1.n(this);
       this.a = false;
       return;
    }
}
