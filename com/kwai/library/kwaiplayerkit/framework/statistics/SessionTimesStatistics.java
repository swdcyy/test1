package com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$a;
import nsd.u;
import java.lang.Object;
import java.util.UUID;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$mExtraDelegate$1;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$mCallbackDelegate$1;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$d;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$g;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$e;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$f;
import xx6.k;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$h;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$mCustomTimeActionDelegate$1;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$SessionTimesStatisticsNonLeakLifecycleObserver;
import android.os.SystemClock;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.library.kwaiplayerkit.framework.statistics.a;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import zx6.b;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$c;
import java.lang.Runnable;
import rc6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IWaynePlayer$DataSourceFrom;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Boolean;
import ay6.k;
import px6.e;
import java.lang.StringBuilder;
import java.lang.Math;
import xx6.e;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import xx6.k$a;
import java.lang.Long;
import android.util.Pair;
import com.kwai.library.kwaiplayerkit.framework.statistics.b;
import java.util.Comparator;
import java.util.Collections;
import java.lang.AssertionError;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import xx6.a;

public final class SessionTimesStatistics	// class@00088d
{
    public IWaynePlayer A;
    public long B;
    public final SessionTimesStatistics$h C;
    public final p D;
    public final p E;
    public final k F;
    public final SessionTimesStatistics$SessionTimesStatisticsNonLeakLifecycleObserver G;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final IMediaPlayer$OnInfoListener j;
    public final IMediaPlayer$OnPreparedListener k;
    public final OnPauseListener l;
    public final OnStartListener m;
    public long n;
    public final k o;
    public a p;
    public final k q;
    public final k r;
    public boolean s;
    public final k t;
    public final k u;
    public boolean v;
    public boolean w;
    public AtomicInteger x;
    public float y;
    public long z;
    public static final SessionTimesStatistics$a H;

    static {
       SessionTimesStatistics.H = new SessionTimesStatistics$a(null);
    }
    public void SessionTimesStatistics(){
       super();
       String str = UUID.randomUUID().toString();
       a.o(str, "EventConnectionSessionProvider.genSession\(\)");
       this.d = str;
       p op = s.c(SessionTimesStatistics$mExtraDelegate$1.INSTANCE);
       this.f = op;
       this.g = op;
       op = s.c(SessionTimesStatistics$mCallbackDelegate$1.INSTANCE);
       this.h = op;
       this.i = op;
       this.j = new SessionTimesStatistics$d(this);
       this.k = new SessionTimesStatistics$g(this);
       this.l = new SessionTimesStatistics$e(this);
       this.m = new SessionTimesStatistics$f(this);
       this.o = new k();
       this.q = new k();
       this.r = new k();
       this.t = new k();
       this.u = new k();
       this.x = new AtomicInteger();
       this.C = new SessionTimesStatistics$h(this);
       op = s.c(SessionTimesStatistics$mCustomTimeActionDelegate$1.INSTANCE);
       this.D = op;
       this.E = op;
       this.F = new k();
       this.G = new SessionTimesStatistics$SessionTimesStatisticsNonLeakLifecycleObserver(this);
    }
    public final void a(){
       long l = SystemClock.elapsedRealtime();
       this.o.d(l);
       this.q.d(l);
       this.t.d(l);
       this.u.d(l);
       this.F.d(l);
       this.l();
       this.n = 0;
       SessionTimesStatistics tA = this.A;
       if (tA != null) {
          tA.removeOnInfoListener(this.j);
       }
       tA = this.A;
       if (tA != null) {
          tA.removeOnPreparedListener(this.k);
       }
       tA = this.A;
       if (tA != null) {
          tA.removeOnStartListener(this.m);
       }
       tA = this.A;
       if (tA != null) {
          tA.removeOnPauseListener(this.l);
       }
       tA = this.p;
       if (tA != null) {
          tA.c("helper release", 0, 0);
          tA.b.unregisterPlayerStateChangedListener(tA.f);
          tA.b.removeOnInfoListener(tA.g);
       }
       this.A = null;
       this.C.d();
       a.a(new SessionTimesStatistics$c(this));
       return;
    }
    public final void b(IWaynePlayer p0){
       IWaynePlayer$DataSourceFrom dataSourceFr = p0.getDataSourceFrom();
       long l = (dataSourceFr == IWaynePlayer$DataSourceFrom.FromCache || dataSourceFr == IWaynePlayer$DataSourceFrom.FromFile)? 1: 0;
       if (this.v == null) {
          this.w = l;
          this.v = true;
       }
       this.z = p0.getDuration();
       return;
    }
    public final CopyOnWriteArraySet c(){
       return this.i.getValue();
    }
    public final ConcurrentHashMap d(){
       return this.E.getValue();
    }
    public final ConcurrentHashMap e(){
       return this.g.getValue();
    }
    public final String f(){
       return this.d;
    }
    public final boolean g(){
       if (this.e == null) {
          return false;
       }
       SessionTimesStatistics te = this.e;
       a.m(te);
       return te.booleanValue();
    }
    public final void h(){
       this.x.getAndIncrement();
       this.u.j();
    }
    public final void i(){
       if (this.s != null) {
          return;
       }
       this.s = true;
       if (!this.r.h()) {
          this.j("using fallback calu ff time");
          this.r.k(this.n);
       }
       this.r.c();
       return;
    }
    public final void j(String p0){
       e.a().i("SessionTimesStatistics", p0+" , player: ["+this.A+"] session: "+this.d);
    }
    public final void k(){
       SessionTimesStatistics tz = this.z;
       StringBuilder str = null;
       if (tz - str > 0) {
       }else {
          tz = this.A;
          tz = (tz != null)? tz.getCurrentPosition(): str;
       }
       this.j("record play end,now: "+this.B+", "+tz);
       this.B = Math.max(this.B, tz);
       return;
    }
    public final void l(){
       SessionTimesStatistics tA = this.A;
       if (tA != null) {
          this.B = Math.max(this.B, tA.getCurrentPosition());
       }
       return;
    }
    public final e m(boolean p0){
       Iterator iterator;
       k b;
       StringBuilder str4;
       SessionTimesStatistics sessionTimes1;
       long l3;
       String str5;
       SessionTimesStatistics a1;
       IKwaiMediaPlayer kernelPlayer1;
       String vodStatJson;
       SessionTimesStatistics c;
       Map$Entry uEntry;
       int i4;
       String str6;
       SessionTimesStatistics sessionTimes = this;
       sessionTimes.j("report");
       SessionTimesStatistics a = sessionTimes.A;
       if (a != null) {
          IKwaiMediaPlayer kernelPlayer = a.getKernelPlayer();
          if (kernelPlayer != null) {
             sessionTimes.y = kernelPlayer.getAverageDisplayFps();
          }
       }
       this.l();
       if (sessionTimes.h.isInitialized()) {
          iterator = this.c().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(sessionTimes);
          }
       }
       String str = "";
       int i = 0;
       boolean i1 = 1;
       if (sessionTimes.a != null) {
          sessionTimes.q.i("userPause");
          sessionTimes.r.i("clickff");
          sessionTimes.o.i("playOrNot");
          sessionTimes.t.i("prepare");
          sessionTimes.u.i("buffering");
          k[] okArray = new k[]{sessionTimes.q,sessionTimes.r,sessionTimes.o,sessionTimes.t,sessionTimes.u};
          ArrayList uArrayList = new ArrayList();
          iterator = CollectionsKt__CollectionsKt.L(okArray).iterator();
          while (iterator.hasNext()) {
             k ok = iterator.next();
             b = ok.b;
             String str1 = (TextUtils.isEmpty(ok.a))? "unknown": ok.a;
             String str2 = "End";
             String str3 = "Start";
             if (!b.isEmpty()) {
                Iterator iterator1 = b.iterator();
                while (iterator1.hasNext()) {
                   k$a uoa = iterator1.next();
                   uArrayList.add(Pair.create(Long.valueOf(uoa.a), str1+str3));
                   uArrayList.add(Pair.create(Long.valueOf(uoa.b), str1+str2));
                }
             }
             b = ok.c;
             if (b != null) {
                uArrayList.add(Pair.create(Long.valueOf(b.a), str1+str3));
                uArrayList.add(Pair.create(Long.valueOf(ok.c.b), str1+str2));
             }
          }
          if (uArrayList.isEmpty()) {
             str4 = str;
          }else {
             Collections.sort(uArrayList, b.b);
             long l4 = uArrayList.get(i).first.longValue();
             str4 = "时间线重现：";
             Iterator iterator3 = uArrayList.iterator();
             sessionTimes1 = -1;
             long l5 = sessionTimes1;
             while (iterator3.hasNext()) {
                Pair pair = iterator3.next();
                long l6 = pair.first.longValue();
                if (l6 - l5) {
                   str4 = str4+"\n【";
                   if (!l6 - Long.MAX_VALUE) {
                      str6 = "INF";
                   }else {
                      long l7 = l6 - l4;
                      str6 = Long.valueOf(l7);
                   }
                   str4 = str4+str6+"】";
                   if (!l5 - sessionTimes1) {
                      vodStatJson = str;
                   }else {
                      l5 = l6 - l5;
                      vodStatJson = "gap="+l5+"ms";
                   }
                   str4 = str4+vodStatJson+" : "+pair.second;
                   l5 = l6;
                }else {
                   str4 = str4+","+pair.second;
                }
                vodStatJson = null;
             }
             str4 = str4;
          }
          a.o(str4, "TimeSliceSet.buildPretty…epareTTS, mBufferingTTS\)\)");
          sessionTimes.j(str4);
       }
       long l = SystemClock.elapsedRealtime();
       e uoe = new e();
       long l1 = sessionTimes.r.e();
       long l2 = 0;
       if (l1 - l2 > 0) {
          k ok1 = new k();
          long[] olongArray = k.b(sessionTimes.r);
          long[] olongArray1 = k.b(sessionTimes.q);
          l1 = 0;
          sessionTimes1 = null;
          int i2 = 0;
          while (true) {
             if (l1 >= olongArray.length) {
                l3 = 1;
             label_0213 :
                int i3 = (sessionTimes1 >= olongArray1.length)? 1: 0;
                if (l3 && i3) {
                   k.g(ok1);
                   a.o(ok1, "TimeSliceSet.calcDiffere…rameTTS, mPlayerPauseTTS\)");
                   l1 = ok1.e();
                }else {
                   uEntry = -1;
                   if (i3 || (!l3 && olongArray[l1] - olongArray1[sessionTimes1] <= 0)) {
                      l3 = olongArray[l1];
                      i4 = l1 % 2;
                      i4 = (!i4)? 1: -1;
                      int i5 = l1 + 1;
                   }else {
                      l3 = olongArray1[sessionTimes1];
                      i4 = sessionTimes1 % 2;
                      i4 = (!i4)? -1: 1;
                      sessionTimes1 = sessionTimes1 + 1;
                   }
                   i2 = i2 + i4;
                   if (i2 != uEntry) {
                      if (i2) {
                         if (i2 == 1) {
                            if (i4 > 0) {
                               l2 = l3;
                            }
                         }else {
                            throw new AssertionError("degree永远不可能超过[-1,1]的范围");
                         }
                      }else if(i4 < 0 && l2 - l3 < 0){
                         str5 = str;
                         ok1.b.add(new k$a(l2, l3));
                      label_027e :
                         str = str5;
                         i1 = true;
                      }
                   }
                   str5 = str;
                   goto label_027e ;
                }
             }else {
                l3 = 0;
                goto label_0213 ;
             }
          }
       }
       str5 = str;
       uoe.e = l1;
       if (sessionTimes.f.isInitialized()) {
          uoe.a = this.e();
       }
       uoe.c = sessionTimes.o.f(l);
       uoe.d = sessionTimes.q.f(l);
       uoe.f = sessionTimes.t.f(l);
       uoe.g = sessionTimes.u.f(l);
       str = "get json direct from player, not from release";
       if (p0) {
          if (sessionTimes.b == null) {
             a1 = sessionTimes.A;
             if (a1 != null) {
                kernelPlayer1 = a1.getKernelPlayer();
                if (kernelPlayer1 != null) {
                   sessionTimes.j(str);
                   vodStatJson = kernelPlayer1.getVodStatJson();
                }
             }
          }
          vodStatJson = sessionTimes.b;
       }else {
          vodStatJson = str5;
       }
       uoe.o = vodStatJson;
       if (p0) {
          if (sessionTimes.c == null) {
             a1 = sessionTimes.A;
             if (a1 != null) {
                kernelPlayer1 = a1.getKernelPlayer();
                if (kernelPlayer1 != null) {
                   sessionTimes.j(str);
                   sessionTimes.c = kernelPlayer1.getBriefVodStatJson();
                }
             }
          }
          c = sessionTimes.c;
       }else {
          c = str5;
       }
       uoe.p = c;
       uoe.h = sessionTimes.d;
       uoe.i = sessionTimes.w;
       uoe.j = sessionTimes.x.get();
       uoe.k = sessionTimes.y;
       uoe.b = sessionTimes.z;
       uoe.l = sessionTimes.B;
       Map map = null;
       if (sessionTimes.D.isInitialized() && !this.d().isEmpty()) {
          map = new LinkedHashMap();
          Iterator iterator2 = this.d().entrySet().iterator();
          while (iterator2.hasNext()) {
             uEntry = iterator2.next();
             String key = uEntry.getKey();
             map.put(key, Long.valueOf(k.a(uEntry.getValue().a(), sessionTimes.o).f(l)));
          }
       }
       uoe.n = map;
       uoe.m = k.a(sessionTimes.o, sessionTimes.F).f(l);
       return uoe;
    }
    public final void n(String p0){
       a.p(p0, "value");
       this.j("set uuid outside: "+p0);
       this.d = p0;
    }
    public final void o(long p0){
       if (this.s != null) {
          this.j("ff is tracked, abort "+p0);
          return;
       }else if(!this.r.h()){
          this.r.k(p0);
       }else {
          this.j("the ff has started ");
       }
       return;
    }
    public final void p(){
       this.j("unbindPlayer");
       this.a();
    }
}
