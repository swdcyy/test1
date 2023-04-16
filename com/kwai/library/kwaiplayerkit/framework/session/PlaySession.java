package com.kwai.library.kwaiplayerkit.framework.session.PlaySession;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$a;
import nsd.u;
import wx6.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$sessionData$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$b;
import com.kwai.library.kwaiplayerkit.framework.session.SessionState;
import vx6.a;
import java.util.LinkedHashSet;
import xx6.g;
import java.util.Iterator;
import java.util.Set;
import xx6.g$b;
import xx6.h;
import xx6.f;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Number;
import java.util.LinkedList;
import px6.b;
import ay6.k;
import px6.e;
import java.lang.StringBuilder;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKit;
import java.lang.IllegalStateException;
import rx6.b;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import qx6.d;
import vx6.c;
import java.lang.Class;
import tx6.a;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$notifySessionAttachedToContext$1;
import msd.l;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$notifySessionWillDetachToContext$1;
import vx6.d;
import rx6.e;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import z1.a;
import sx6.a;
import px6.c;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.util.Map;
import qrd.l1;
import com.kwai.video.wayne.player.logreport.DataReporter;
import java.util.Map$Entry;
import qx6.c;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$setPlayer$$inlined$let$lambda$1;

public final class PlaySession	// class@00087f
{
    public final p a;
    public g b;
    public final PlaySession$b c;
    public SessionState d;
    public b e;
    public IWaynePlayer f;
    public final a g;
    public Set h;
    public final c i;
    public static final PlaySession$a j;

    static {
       PlaySession.j = new PlaySession$a(null);
    }
    public void PlaySession(c p0){
       a.p(p0, "sessionKey");
       super();
       this.i = p0;
       this.a = s.c(PlaySession$sessionData$2.INSTANCE);
       this.c = new PlaySession$b(this);
       this.d = SessionState.UNKNOWN;
       this.g = new a(this);
       this.h = new LinkedHashSet();
    }
    public final void a(){
       k ok;
       PlaySession tb = this.b;
       if (tb != null) {
          PlaySession tg = this.g;
          a.p(tg, "contextStack");
          Iterator iterator = tb.b.iterator();
          while (iterator.hasNext()) {
             g$b uob = iterator.next();
             if (uob instanceof h) {
                g$b uob1 = uob;
                Integer integer = Integer.valueOf(uob1.b().c);
                Objects.requireNonNull(tg);
                if (integer != null) {
                   int i = integer.intValue();
                   Iterator iterator1 = tg.a.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         if (iterator1.next().hashCode() == i) {
                            ok = 1;
                         label_0052 :
                            if (!ok) {
                               e.a().i("ReportHelperOnSession", "remove no use callback "+uob+", which "+"contextInfoCreated="+uob1.b().d);
                               tb.b.remove(uob);
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
                ok = null;
                goto label_0052 ;
             }
          }
       }
       return;
    }
    public final void b(b p0){
       a.p(p0, "context");
       PlaySession tg = this.g;
       Objects.requireNonNull(tg);
       a.p(p0, "context");
       String str = "PlaySession";
       if (!tg.a.contains(p0)) {
          e.a().e(str, "¡¾detachFrom¡¿ Context="+p0+" is not in stack.");
          return;
       }else {
          e.a().i(str, "¡¾detachFrom¡¿ Session="+this+", Context="+p0);
          boolean b = a.g(p0, this.g.b());
          if (b) {
             if (this.o(p0)) {
                KwaiPlayerKit.d.b(this.i);
                return;
             }else {
                this.l(p0);
             }
          }
          this.c(p0);
          if (b) {
             if (this.g.a.isEmpty()) {
                if (!this.i()) {
                   this.d = SessionState.WILL_ATTACH;
                   PlaySession tb = this.b;
                   if (tb != null) {
                      tb.n(p0);
                   }
                }else {
                   throw new IllegalStateException("should call endSession and return before this.");
                }
             }else {
                this.d = SessionState.ATTACHED;
                p0 = this.g.b();
                a.m(p0);
                this.k(p0);
                this.a();
             }
          }
          return;
       }
    }
    public final void c(b p0){
       PlaySession tg = this.g;
       Objects.requireNonNull(tg);
       a.p(p0, "context");
       tg.a.remove(p0);
       p0.l(null);
    }
    public final b d(){
       return this.e;
    }
    public final IWaynePlayer e(){
       return this.f;
    }
    public final d f(){
       return this.a.getValue();
    }
    public final g g(){
       return this.b;
    }
    public final SessionState h(){
       return this.d;
    }
    public final boolean i(){
       return this.h.isEmpty();
    }
    public final void j(String p0){
       e.a().i("PlaySession", p0+" , session = "+this);
    }
    public final void k(b p0){
       e.a().i("PlaySession", "¡¾notifySessionAttachedToContext¡¿ Session="+this+", Context="+p0);
       a uoa = p0.d(c.class);
       if (uoa != null) {
          uoa.a(PlaySession$notifySessionAttachedToContext$1.INSTANCE);
       }
       return;
    }
    public final void l(b p0){
       e.a().i("PlaySession", "¡¾notifySessionWillDetachToContext¡¿ Session="+this+", Context="+p0);
       a uoa = p0.d(c.class);
       if (uoa != null) {
          uoa.a(PlaySession$notifySessionWillDetachToContext$1.INSTANCE);
       }
       return;
    }
    public final void m(b p0,l p1,boolean p2,d p3,e p4){
       a.p(p0, "dataSource");
       this.j("¡¾setDataSource¡¿");
       WayneBuildData wayneBuildDa = new WayneBuildData("GothamUnknown");
       if (p3 != null) {
          int width = p3.getWidth();
          int height = p3.getHeight();
          this.j("set view size: "+width+", "+height);
          wayneBuildDa.setViewSize(width, height);
       }
       a e = e.e;
       if (e != null) {
          e.accept(wayneBuildDa);
       }
       if (p1 != null) {
          p1.invoke(wayneBuildDa);
       }
       p0.c(wayneBuildDa);
       PlaySession tf = this.f;
       if (tf == null) {
          c b = e.b;
          if (b != null) {
             this.j("use hook factory "+b);
          }else {
             Objects.requireNonNull(KwaiPlayerKit.d);
             b = KwaiPlayerKit.c.getValue();
          }
          IWaynePlayer iWaynePlayer = b.a(wayneBuildDa);
          p0.b(iWaynePlayer);
          if (a.g(KwaiPlayerKit.d.d().get(this.i), this) ^ 0x01) {
             iWaynePlayer.releaseAsync();
             return;
          }else {
             this.n(iWaynePlayer, p0, "", null, false);
          }
       }else {
          tf.setWayneBuildData(wayneBuildDa, "update");
       }
       PlaySession tf1 = this.f;
       if (tf1 != null) {
          tf1.prepareAsync();
       }
       if (p2) {
          this.d = SessionState.PRELOADED;
       }
       return;
    }
    public final void n(IWaynePlayer p0,b p1,String p2,Map p3,boolean p4){
       a.p(p0, "player");
       a.p(p1, "source");
       a.p(p2, "sessionUuid");
       _monitor_enter(this);
       PlaySession tf = this.f;
       if (p4 && tf != null) {
          e.a().i("PlaySession", "has a player force replace: orgin: "+this.f+", replace to: "+p0+",  session="+this);
          this.f = null;
       }
       if (this.f == null) {
          this.f = p0;
          _monitor_exit(this);
          if (p4 && tf != null) {
             tf.releaseAsync();
          }
          p0.addDataReporter(this.c);
          this.e = p1;
          if (p3 != null) {
             Iterator iterator = p3.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                this.f().a(key, uEntry.getValue());
             }
          }
          PlaySession tb = this.b;
          if (tb == null) {
             this.b = new g(p2);
          }else {
             a.m(tb);
             if (a.g(tb.j(), p2) ^ 0x01) {
                PlaySession tb1 = this.b;
                a.m(tb1);
                e.a().e("PlaySession", "sessionuuid, not the same: input: "+p2+", now: "+tb1.j());
             }
          }
          tb = this.b;
          a.m(tb);
          tb.l(p0);
          tb = this.g.b();
          if (tb != null) {
             a uoa = tb.d(c.class);
             if (uoa != null) {
                uoa.a(new PlaySession$setPlayer$$inlined$let$lambda$1(p0));
             }
          }
          return;
       }else {
          throw new IllegalStateException("why setPlayer to session , when session already has"+" one? maybe should call detach before set. session="+this+" , player="+this.f+" , "+"setplayer="+p0);
       }
    }
    public final boolean o(b p0){
       boolean b = true;
       if (!a.g(this.g.b(), p0) || (this.g.a() > b || !this.i())) {
          b = false;
       }
       return b;
    }
    public String toString(){
       StringBuilder str = PlaySession.class.getSimpleName()+"@"+Integer.toHexString(this.hashCode())+"  "+"SessionKey="+this.i+"  Player=["+this.f+"] state="+this.d+" report session id:"+' ';
       PlaySession tb = this.b;
       String str1 = (tb != null)? tb.j(): null;
       return str+str1;
    }
}
