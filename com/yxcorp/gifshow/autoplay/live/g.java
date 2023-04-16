package com.yxcorp.gifshow.autoplay.live.g;
import w99.b;
import vl8.c;
import com.yxcorp.gifshow.autoplay.live.e;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import com.google.common.collect.o;
import com.kwai.framework.player.core.b;
import w99.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$d;
import java.util.Set;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.autoplay.live.c;
import java.util.HashMap;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Objects;
import java.lang.Boolean;
import tj3.e;
import java.util.Iterator;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import java.lang.Integer;
import java.lang.StringBuilder;
import u99.d;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import rj3.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.UUID;
import t99.a0;
import com.yxcorp.gifshow.autoplay.live.f;
import sj3.b;
import com.yxcorp.gifshow.autoplay.live.LiveStopReason;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Enum;
import xf6.i;
import wkd.b;
import rj3.c;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$c;

public class g extends c implements b	// class@001c1a
{
    public c c;
    public LivePlayTextureView d;
    public final Set e;
    public final List f;
    public final Set g;
    public final List h;
    public final List i;
    public b j;
    public boolean k;
    public String l;
    public boolean m;
    public String n;
    public boolean o;
    public final e p;
    public boolean q;
    public int r;
    public int s;

    public void g(e p0){
       super();
       this.e = new HashSet();
       this.f = new CopyOnWriteArrayList();
       this.g = o.h();
       this.h = new CopyOnWriteArrayList();
       this.i = new CopyOnWriteArrayList();
       this.q = false;
       this.p = p0;
       p0 = p0.r;
       if (p0 != null) {
          this.n = p0;
       }
       return;
    }
    public b F(){
       return a.c(this);
    }
    public void N(LiveAutoPlay$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "36")) {
          return;
       }
       if (!this.h.contains(p0)) {
          this.h.add(p0);
       }
       return;
    }
    public void O(LiveAutoPlay$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "30")) {
          return;
       }
       this.e.add(p0);
       return;
    }
    public void P(LiveAutoPlay$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "34")) {
          return;
       }
       this.g.add(p0);
       return;
    }
    public LivePlayerController Q(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.i;
       }
       return objArray;
    }
    public final HashMap R(){
       boolean b2;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HashMap obj = PatchProxy.apply(null, this, g.class, "45");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       obj.put("playModuleHash", String.valueOf(this.hashCode()));
       obj.put("feedId", r1.t1(this.p.a));
       obj.put("userName", r1.V1(this.p.a));
       g tc = this.c;
       boolean b = true;
       boolean b1 = (tc != null && tc.e())? true: false;
       obj.put("isPlaying", String.valueOf(b1));
       tc = this.c;
       b1 = (tc != null && tc.f())? true: false;
       obj.put("isPreparing", String.valueOf(b1));
       tc = this.c;
       if (tc != null) {
          Objects.requireNonNull(tc);
          Object obj1 = PatchProxy.apply(null, tc, uoc, "24");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             c i = tc.i;
             b1 = (i != null && i.isBuffering())? true: false;
          }
          if (b1) {
             b1 = true;
          label_0094 :
             obj.put("isBuffering", String.valueOf(b1));
             tc = this.c;
             if (tc != null) {
                Objects.requireNonNull(tc);
                Object obj2 = PatchProxy.apply(null, tc, uoc, "37");
                if (obj2 != patchProxyRe) {
                   b2 = obj2.booleanValue();
                }else {
                   uoc = tc.i;
                   b2 = (uoc != null && uoc.isPlayerMute())? true: false;
                }
                if (b2) {
                   b2 = true;
                label_00c5 :
                   obj.put("isMute", String.valueOf(b2));
                   if (this.c == null) {
                      b = false;
                   }
                   obj.put("liveAutoPlayNotNull", String.valueOf(b));
                   obj.put("width", String.valueOf(this.r));
                   obj.put("height", String.valueOf(this.s));
                   return obj;
                }
             }
             b2 = false;
             goto label_00c5 ;
          }
       }
       b1 = false;
       goto label_0094 ;
    }
    public e S(){
       g obj = PatchProxy.apply(null, this, g.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          return null;
       }
       return obj.j;
    }
    public String T(){
       g obj = PatchProxy.apply(null, this, g.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return obj.d();
       }
       return null;
    }
    public boolean U(){
       return this.m;
    }
    public void V(){
       if (PatchProxy.applyVoid(null, this, g.class, "21")) {
          return;
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().onRenderStop();
       }
       return;
    }
    public void W(LiveAutoPlay$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "37")) {
          return;
       }
       if (this.h.contains(p0)) {
          g tc = this.c;
          if (tc != null) {
             tc.h(p0);
          }
          this.h.remove(p0);
       }
       return;
    }
    public void X(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "39")) {
          return;
       }
       if (this.f.contains(p0)) {
          g tc = this.c;
          if (tc != null) {
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoidOneRefs(p0, tc, LiveAutoPlay.class, "6")) {
                tc.c.remove(p0);
             }
          }
          this.f.remove(p0);
       }
       return;
    }
    public void Y(LiveAutoPlay$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "33")) {
          return;
       }
       this.e.remove(p0);
       return;
    }
    public void Z(LiveAutoPlay$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "35")) {
          return;
       }
       if (p0 != null) {
          this.g.remove(p0);
       }
       return;
    }
    public void a(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "40")) {
          return;
       }
       d.h("LivePlayModule", "resume type="+p0, this.R());
       this.startPlay();
       if (this.k != null) {
          this.mute();
       }
       return;
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       LivePlayerController livePlayerCo = this.Q();
       if (livePlayerCo != null) {
          g td = this.d;
          if (td != null) {
             livePlayerCo.setTextureView(td);
          }
       }
       return;
    }
    public void b0(boolean p0){
       this.q = p0;
    }
    public void d0(LivePlayTextureView p0){
       this.d = p0;
    }
    public void e0(int p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og, "7")) {
          return;
       }
       if (p0 > 0 && p1 >= 0) {
          if (this.r == p0 && this.s == p1) {
             return;
          }else {
             this.r = p0;
             this.s = p1;
             d.h("LivePlayModule", "setViewSize", this.R());
             LivePlayerController livePlayerCo = this.Q();
             if (livePlayerCo != null) {
                livePlayerCo.setViewPixelSize(this.r, this.s);
             }
          }
       }
       return;
    }
    public final void f0(boolean p0,a p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, og, "5")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p1, this, og, "20")) {
          Iterator iterator1 = this.g.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a(p1);
          }
       }
       boolean b = false;
       this.o = b;
       int i = (p1 == null)? 0: p1.c();
       String str = "LivePlayModule";
       d.h(str, "startPlay reuseType="+i, this.R());
       if (this.c == null && (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, og, "2"))) {
          d.h(str, "initPlayer", this.R());
          if (TextUtils.x(this.l)) {
             this.l = UUID.randomUUID().toString();
          }
          g tp = this.p;
          g td = this.d;
          g tl = this.l;
          g tq = this.q;
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray = new Object[]{tp,td,Boolean.valueOf(p0),p1,tl,Boolean.valueOf(tq)};
             uoc = PatchProxy.apply(objArray, null, uoc, "12");
             if (uoc != PatchProxyResult.class) {
             }else {
             label_00c8 :
                e a = tp.a;
                if (a != null && r1.t2(a)) {
                   uoc = c.A();
                }else {
                   c uoc1 = new c(tp, td, p0, p1, tl, tq);
                }
             }
          }else {
             goto label_00c8 ;
          }
          this.c = uoc;
          uoc.K(this.p.e);
          Iterator iterator = this.e.iterator();
          while (iterator.hasNext()) {
             this.c.b(iterator.next());
          }
          g tc = this.c;
          tc.F = new a0(this);
          tc.j(this.p.h);
          tc = this.c;
          g tp1 = this.p;
          tc.u = tp1.n;
          tc.k(tp1.g);
          this.c.m(new f(this));
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             IKwaiMediaPlayer$OnLiveSeiInfoListener onLiveSeiInf = iterator.next();
             og = this.c;
             Objects.requireNonNull(og);
             if (PatchProxy.applyVoidOneRefs(onLiveSeiInf, og, LiveAutoPlay.class, "5")) {
                continue ;
             }
             og.c.add(onLiveSeiInf);
          }
          if (!this.h.isEmpty()) {
             iterator = this.h.iterator();
             while (iterator.hasNext()) {
                this.c.a(iterator.next());
             }
          }
          tc = this.j;
          if (tc != null) {
             this.c.z(tc);
          }
       }
    label_0176 :
       if (!this.c.e()) {
          this.c.p(this.k);
       }
       return;
    }
    public void g0(LiveStopReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "10")) {
          return;
       }
       d.h("LivePlayModule", "stopPlay type="+p0, this.R());
       g tc = this.c;
       if (tc == null) {
          return;
       }
       if (tc.F()) {
          this.c.q(p0.ofReason());
       }
       this.c.c();
       this.c = null;
       if (this.o == null) {
          this.V();
       }
       return;
    }
    public long getDuration(){
       return 0;
    }
    public b getPlayer(){
       return a.b(this);
    }
    public boolean isPlaying(){
       g obj = PatchProxy.apply(null, this, g.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null && obj.e())? true: false;
       return b;
    }
    public String k(){
       e obj = PatchProxy.apply(null, this, g.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p.a;
       if (obj == null) {
          return "player is null";
       }
       Object[] objArray = new Object[]{r1.S1(obj).name(),r1.t1(this.p.a),r1.V1(this.p.a)};
       return String.format("feed type : %s\nfeed id : %s\nuser: %s", objArray);
    }
    public long m(){
       return 0;
    }
    public void mute(){
       if (PatchProxy.applyVoid(null, this, g.class, "13")) {
          return;
       }
       d.h("LivePlayModule", "mute", this.R());
       this.k = true;
       if (this.c != null && !i.c("KEY_AUTO_PLAY_UNMUTE")) {
          this.c.g();
       }
       return;
    }
    public void pause(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "41")) {
          return;
       }
       d.h("LivePlayModule", "pause type="+p0, this.R());
       this.g0(LiveStopReason.SLIDE_AWAY);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, g.class, "43")) {
          return;
       }
       d.h("LivePlayModule", "release", this.R());
       this.g0(LiveStopReason.SLIDE_AWAY);
       return;
    }
    public void seekTo(long p0){
    }
    public void startPlay(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "4")) {
          return;
       }
       boolean b = true;
       if (!TextUtils.x(this.n)) {
          c uoc = b.a(0x59ca4ae1);
          a uoa = uoc.e(this.n);
          if (uoa != null && uoa.a() != null) {
             d.d("LivePlayModule", "[LiveReuse]retrieveValidPlayer, reuse key: "+this.n+", reuse type: "+uoa.c()+", timestamp: "+uoa.e());
             uoc.c(this.n);
             LivePlayerController livePlayerCo = uoa.a();
             this.m = b;
             this.f0(b, uoa);
             Iterator iterator = this.e.iterator();
             while (iterator.hasNext()) {
                LiveAutoPlay$d uod = iterator.next();
                uod.onVideoSizeChanged(livePlayerCo.getVideoWidth(), livePlayerCo.getVideoHeight());
                if (uod instanceof LiveAutoPlay$c) {
                   uod.onVideoSizeChangedWithType(livePlayerCo.getVideoWidth(), livePlayerCo.getVideoHeight(), livePlayerCo.getCurrentLiveStreamType());
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, og, "19")) {
                Iterator iterator1 = this.g.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().onPlayerRetrieved();
                }
             }
             return;
          }
       }
       this.m = false;
       this.f0((TextUtils.x(this.n) ^ b), objArray);
       return;
    }
    public boolean t(){
       g obj = PatchProxy.apply(null, this, g.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null && obj.F())? true: false;
       return b;
    }
    public void unMute(){
       if (PatchProxy.applyVoid(null, this, g.class, "14")) {
          return;
       }
       d.h("LivePlayModule", "unMute", this.R());
       this.k = false;
       g tc = this.c;
       if (tc != null) {
          tc.r();
       }
       return;
    }
}
