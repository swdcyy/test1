package com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKit;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKit$playerFactory$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import wx6.c;
import px6.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import ay6.k;
import px6.e;
import java.lang.StringBuilder;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession;
import vx6.a;
import com.kwai.library.kwaiplayerkit.framework.session.SessionState;
import java.util.Objects;
import java.util.LinkedList;
import xx6.g;
import yx6.d;
import z1.k;
import java.lang.Boolean;
import yx6.c;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import yx6.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import yx6.e;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import yx6.b;
import java.lang.Integer;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import vx6.c;
import java.lang.Class;
import tx6.a;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$notifySessionReleasedToContext$1;
import msd.l;
import rx6.b;
import java.util.Set;
import vx6.d;
import rx6.e;

public final class KwaiPlayerKit	// class@000866
{
    public static Application a;
    public static final ConcurrentHashMap b;
    public static final p c;
    public static final KwaiPlayerKit d;

    static {
       KwaiPlayerKit.d = new KwaiPlayerKit();
       KwaiPlayerKit.b = new ConcurrentHashMap();
       KwaiPlayerKit.c = s.c(KwaiPlayerKit$playerFactory$2.INSTANCE);
    }
    public void KwaiPlayerKit(){
       super();
    }
    public final void a(c p0,b p1){
       a.p(p0, "sessionKey");
       String str = "context";
       a.p(p1, str);
       e.a().i("KwaiPlayerKit", "¡¾attachSessionTo¡¿  SessionKey="+p0+"  Context="+p1);
       PlaySession playSession = this.c(p0);
       if (playSession != null) {
          a.p(p1, str);
          b uob = playSession.g.b();
          if (!a.g(uob, p1)) {
             e.a().i("PlaySession", "¡¾attachTo¡¿ Session="+playSession+", Context="+p1);
             PlaySession playSession1 = KwaiPlayerKit.d.c(p1.g());
             if (playSession1 != null && (a.g(playSession1, playSession) ^ 0x01)) {
                playSession1.b(p1);
             }
             if (uob != null) {
                playSession.l(uob);
             }
             playSession.d = SessionState.ATTACHED;
             PlaySession g = playSession.g;
             Objects.requireNonNull(g);
             a.p(p1, str);
             g.a.remove(p1);
             g.a.push(p1);
             p1.l(playSession.i);
             playSession.k(p1);
             PlaySession b = playSession.b;
             if (b != null) {
                b.n(null);
             }
             playSession.a();
          }
       }
       return;
    }
    public final void b(c p0){
       d a;
       b d;
       k c;
       a.p(p0, "sessionKey");
       e.a().i("KwaiPlayerKit", "¡¾endSession¡¿  SessionKey="+p0);
       PlaySession playSession = this.c(p0);
       if (playSession != null) {
          e.a().i("PlaySession", "¡¾releaseSession¡¿ Session="+playSession+"  µ±Ç°SessionµÄÕ»¶¥Context="+playSession.g.b()+", context count: "+playSession.g.a());
          b uob = playSession.g.b();
          a = d.a;
          Objects.requireNonNull(a);
          a.p(playSession, "session");
          k ok = null;
          if (playSession.g() == null) {
             a.a(playSession+" dont has reporter. abort");
          }else {
             d = e.d;
             if (d != null) {
                c = e.c;
                boolean b1 = (c != null)? c.get().booleanValue(): false;
                if (b1) {
                   PlaySession i1 = playSession.i;
                   g og = playSession.g();
                   a.m(og);
                   String str1 = og.j();
                   IWaynePlayer iWaynePlayer = playSession.e();
                   String outerLogTag = (iWaynePlayer != null)? iWaynePlayer.getOuterLogTag(): ok;
                   c uoc = new c(i1, str1, outerLogTag, playSession.h());
                   if (uob != null) {
                      a uoa1 = new a(uob.f(), new LinkedHashMap());
                      Iterator iterator = uob.c.iterator();
                      while (iterator.hasNext()) {
                         e uoe = iterator.next().m();
                         if (uoe != null) {
                            e uoe1 = uoa1.a().put(uoe.a(), uoe);
                            if (uoe1 != null) {
                               e.a().e("KwaiPlayerKitContext", uob.f(), new IllegalStateException("Duplicated module info : "+uoe.a()+','+uoe1));
                            }
                         }
                      }
                      uoc.a = uoa1.a;
                      uoc.b = uoa1.a();
                   }
                   a.a(playSession+", ready to report GothamPlayEvent, "+uob);
                   d.onReportGothamPlayEvent(uoc);
                }
             }
          }
          PlaySession b = playSession.b;
          if (b != null) {
             b.c = true;
             Integer integer = (uob != null)? Integer.valueOf(uob.hashCode()): ok;
             b.d = integer;
             b.a.p();
          }
          b = playSession.f;
          if (b != null) {
             b.releaseAsync();
          }else {
             b = playSession.b;
             if (b != null) {
                String str = "EXTRA_REPORT_WITH_NO_PLAYER";
                b.putExtra(str, Boolean.TRUE);
                b.a.p();
                if (uob != null) {
                   ok = Integer.valueOf(uob.hashCode());
                }
                b.m(ok);
                b.removeExtra(str);
             }
          }
          b uob1 = playSession.g.b();
          if (uob1 != null) {
             playSession.l(uob1);
          }
          playSession.d = SessionState.RELEASED;
          for (; uob != null; uob = playSession.g.b()) {
             playSession.c(uob);
             PlaySession i = playSession.i;
             a.m(uob1);
             e.a().i("PlaySession", "¡¾notifySessionReleasedToContext¡¿ Session="+playSession+", Context="+uob);
             a uoa = uob.d(c.class);
             if (uoa != null) {
                uoa.a(new PlaySession$notifySessionReleasedToContext$1(i, uob, uob1));
             }
          }
          KwaiPlayerKit.b.remove(p0, playSession);
       }
       return;
    }
    public final PlaySession c(c p0){
       if (p0 == null) {
          return null;
       }
       PlaySession playSession = KwaiPlayerKit.b.get(p0);
       if (playSession != null && playSession.d() == null) {
          e.a().w("KwaiPlayerKit", "¡¾getSession¡¿SessionKey="+p0+", session="+playSession+", no datasource "+"may be there is a multi thread case?");
       }
       return playSession;
    }
    public final ConcurrentHashMap d(){
       return KwaiPlayerKit.b;
    }
    public final void e(c p0,String p1){
       a.p(p0, "key");
       a.p(p1, "tag");
       PlaySession playSession = this.c(p0);
       if (playSession != null) {
          a.p(p1, "sessionObserverTag");
          e.a().i("PlaySession", "¡¾registerSessionObserverTag¡¿ Session="+playSession+", Tag="+p1);
          playSession.h.add(p1);
       }
       return;
    }
    public final void f(c p0,String p1){
       a.p(p0, "key");
       a.p(p1, "tag");
       PlaySession playSession = this.c(p0);
       if (playSession != null) {
          a.p(p1, "sessionObserverTag");
          e.a().i("PlaySession", "¡¾unregisterSessionObserverTag¡¿ Session="+playSession+", Tag="+p1);
          playSession.h.remove(p1);
          if (playSession.d == SessionState.WILL_ATTACH && playSession.i()) {
             KwaiPlayerKit.d.b(playSession.i);
          }
       }
       return;
    }
    public final void g(c p0,b p1,l p2){
       a.p(p0, "key");
       a.p(p1, "dataSource");
       e.a().i("KwaiPlayerKit", "¡¾updateDataSource¡¿ SessionKey="+p0+"  DataSource="+p1);
       Object obj = KwaiPlayerKit.b.get(p0);
       if (obj == null) {
          e.a().w("KwaiPlayerKit", "¡¾updateDataSource¡¿ failed key ["+p0+"],source ["+p1+"] , no "+"session exist, maybe should start first");
       }
       if (obj != null) {
          obj.m(p1, p2, false, null, null);
       }
       return;
    }
}
