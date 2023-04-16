package com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.a;
import android.widget.FrameLayout;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView$playerKitContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView$moduleHandler$2;
import wx6.a;
import px6.e;
import sx6.c;
import px6.b;
import wx6.c;
import ay6.d;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKit;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession;
import ay6.k;
import java.lang.StringBuilder;
import rx6.b;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.util.Map;
import px6.d;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import java.util.Objects;
import vx6.c;
import java.lang.Class;
import tx6.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ux6.a;
import kotlin.Pair;
import com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule;
import tx6.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.concurrent.ConcurrentHashMap;
import msd.l;
import rx6.e;
import wx6.d;
import nx6.a;
import vx6.d;
import java.util.concurrent.ConcurrentMap;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule;
import trd.t;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import java.lang.Iterable;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import xx6.g;
import vx6.a;
import java.lang.Integer;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession$$special$$inlined$run$lambda$1;
import com.kwai.video.wayne.player.logreport.DataReporter;
import qrd.l1;

public final class KwaiPlayerKitView extends FrameLayout implements a	// class@00086a
{
    public final p b;
    public final p c;
    public d d;
    public String e;
    public d f;
    public static final KwaiPlayerKitView$a g;

    static {
       KwaiPlayerKitView.g = new KwaiPlayerKitView$a(null);
    }
    public void KwaiPlayerKitView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void KwaiPlayerKitView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void KwaiPlayerKitView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = s.c(new KwaiPlayerKitView$playerKitContext$2(this));
       this.c = s.c(new KwaiPlayerKitView$moduleHandler$2(this));
       this.d = new a();
       c uoc = new c(this);
       a.o(uoc, "PlayerKitPlugins.withTrace\(this\)");
       this.f = uoc;
    }
    public static void n(KwaiPlayerKitView p0,boolean p1,a p2,int p3,Object p4){
       c uoc = p0.getPlayerKitContext().g();
       if (uoc != null) {
          p0.f.a("doInternalLeave");
          if (p1) {
             KwaiPlayerKit.d.b(uoc);
          }else {
             KwaiPlayerKit d = KwaiPlayerKit.d;
             if (d.c(uoc) != null) {
                b playerKitCon = p0.getPlayerKitContext();
                a.p(playerKitCon, "context");
                e.a().i("KwaiPlayerKit", "【detachSessionFrom】  Context="+playerKitCon);
                PlaySession playSession = d.c(playerKitCon.g());
                if (playSession != null) {
                   playSession.b(playerKitCon);
                }
             }
          }
          p0.f.b();
       }
       return;
    }
    public static void q(KwaiPlayerKitView p0,b p1,IWaynePlayer p2,String p3,Map p4,boolean p5,int p6,Object p7){
       boolean b = (p6 & 0x10)? false: p5;
       p0.p(p1, p2, p3, null, b);
       return;
    }
    public void a(boolean p0){
       this.f.a("release");
       this.o("release invoke, end session: "+p0);
       KwaiPlayerKitView.n(this, p0, null, 2, null);
       this.getModuleHandler().c();
       this.f.b();
    }
    public void b(UiModule p0){
       a.p(p0, "module");
       this.l();
       d moduleHandle = this.getModuleHandler();
       Objects.requireNonNull(moduleHandle);
       a.p(p0, "module");
       a uoa = moduleHandle.d.d(c.class);
       a.m(uoa);
       moduleHandle.b(p0, uoa);
    }
    public void c(){
       this.h(null, null);
    }
    public void d(UiModule p0){
       a.p(p0, "module");
       this.l();
       d moduleHandle = this.getModuleHandler();
       Objects.requireNonNull(moduleHandle);
       a.p(p0, "module");
       a uoa = moduleHandle.d.d(c.class);
       a.m(uoa);
       moduleHandle.b.remove(p0);
       uoa.c(p0);
       p0.j().b();
       d d = moduleHandle.d;
       Objects.requireNonNull(d);
       a.p(p0, "uiModule");
       d.c.remove(p0);
       Pair pair = p0.o();
       if (pair != null) {
          moduleHandle.d.k(pair.getFirst());
       }
       return;
    }
    public void e(FunctionModule p0){
       a.p(p0, "module");
       this.l();
       d moduleHandle = this.getModuleHandler();
       Objects.requireNonNull(moduleHandle);
       a.p(p0, "module");
       a uoa = moduleHandle.d.d(c.class);
       a.m(uoa);
       moduleHandle.a.remove(p0);
       Objects.requireNonNull(p0);
       uoa.c(p0);
       c uoc = p0.m();
       if (uoc != null) {
          moduleHandle.d.k(uoc.a());
       }
       Iterator iterator = p0.l().entrySet().iterator();
       while (iterator.hasNext()) {
          d d = moduleHandle.d;
          Class key = iterator.next().getKey();
          Objects.requireNonNull(d);
          a.p(key, "type");
          d.b.remove(key);
       }
       return;
    }
    public void f(b p0,l p1,e p2){
       a.p(p0, "source");
       this.f.a("setDataSource");
       this.o("setDataSource invoke");
       c sessionKey = this.d.getSessionKey(p0);
       KwaiPlayerKit d = KwaiPlayerKit.d;
       PlaySession playSession = d.c(sessionKey);
       d uod = null;
       if (playSession != null && playSession.d() == null) {
          e uoe = null;
          if (p2 != null) {
             uoe = p2.a;
          }
          String str = " has no data, some other view is creating ,";
          String str1 = "session：";
          if (uoe != null) {
             this.o(str1+playSession+str+" about precreate work, conflict source:"+p0);
             this.f.b();
             return;
          }else {
             this.o(str1+playSession+str+" force fresh new one.");
             if (d.d().remove(sessionKey, playSession)) {
                playSession = uod;
             }
          }
       }
    label_0079 :
       if (playSession == null) {
          this.o("未找到指定 Session");
          a uoa = this.getPlayerKitContext().e(a.class);
          if (uoa != null) {
             uod = uoa.q();
          }
          d uod1 = uod;
          Objects.requireNonNull(d);
          a.p(sessionKey, "key");
          a.p(p0, "dataSource");
          e.a().i("KwaiPlayerKit", "【startSession】  SessionKey="+sessionKey+"  DataSource="+p0);
          ConcurrentHashMap b = KwaiPlayerKit.b;
          playSession = b.get(sessionKey);
          if (playSession == null) {
             playSession = new PlaySession(sessionKey);
             b = b.putIfAbsent(sessionKey, playSession);
             if (b != null) {
                playSession = b;
             }
          }
          playSession.m(p0, p1, false, uod1, null);
          a.o(playSession, "playSession");
       }else {
          IWaynePlayer iWaynePlayer = playSession.e();
          String str2 = "Session = ";
          if (iWaynePlayer == null) {
             this.o(str2+playSession+" 已创建，播放器为null");
          }else {
             this.o(str2+playSession+" 已创建，当前播放器状态："+iWaynePlayer.getState());
          }
       }
       d.a(sessionKey, this.getPlayerKitContext());
       KwaiPlayerKitView te = this.e;
       if (te != null) {
          d.f(sessionKey, te);
       }
       this.f.b();
       return;
    }
    public void g(b p0,l p1){
       a.p(p0, "source");
       a.p(p0, "source");
       this.f(p0, p1, null);
    }
    public final d getModuleHandler(){
       return this.c.getValue();
    }
    public b getPlayerKitContext(){
       return this.b.getValue();
    }
    public final int getViewId(){
       return this.hashCode();
    }
    public void h(List p0,List p1){
       Iterator iterator;
       Iterator iterator1;
       this.f.a("setupModules");
       this.o("setupModules invoke");
       d moduleHandle = this.getModuleHandler();
       moduleHandle.c();
       moduleHandle.d.a(c.class, new a());
       List list = t.k(new PlayModule());
       List list1 = t.k(new DefaultFrameUiModule());
       a uoa = moduleHandle.d.d(c.class);
       a.m(uoa);
       if (list != null) {
          iterator = list.iterator();
          while (iterator.hasNext()) {
             moduleHandle.a(iterator.next(), uoa);
          }
       }
       if (list1 != null) {
          iterator = list1.iterator();
          while (iterator.hasNext()) {
             moduleHandle.b(iterator.next(), uoa);
          }
       }
       if (p0 != null) {
          iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             moduleHandle.a(iterator1.next(), uoa);
          }
       }
       if (p1 != null) {
          iterator1 = p1.iterator();
          while (iterator1.hasNext()) {
             moduleHandle.b(iterator1.next(), uoa);
          }
       }
       moduleHandle.c = true;
       this.f.b();
       return;
    }
    public void i(boolean p0){
       this.f.a("reset");
       this.o("reset invoke, end session: "+p0);
       KwaiPlayerKitView.n(this, p0, null, 2, null);
       d moduleHandle = this.getModuleHandler();
       Iterator iterator = moduleHandle.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       Iterator iterator1 = moduleHandle.b.iterator();
       while (iterator1.hasNext()) {
          Objects.requireNonNull(iterator1.next());
       }
       this.f.b();
       return;
    }
    public void j(b p0,l p1){
       a.p(p0, "dataSource");
       if (!this.getPlayerKitContext().j()) {
          return;
       }
       c uoc = this.getPlayerKitContext().g();
       if (uoc != null) {
          KwaiPlayerKit.d.g(uoc, p0, p1);
       }
       return;
    }
    public void k(FunctionModule p0){
       a.p(p0, "module");
       this.l();
       d moduleHandle = this.getModuleHandler();
       Objects.requireNonNull(moduleHandle);
       a.p(p0, "module");
       a uoa = moduleHandle.d.d(c.class);
       a.m(uoa);
       moduleHandle.a(p0, uoa);
    }
    public final void l(){
       if (this.getModuleHandler().c != null) {
          return;
       }
       this.o("should call setupModules first.");
       throw new IllegalStateException("call setupModules first, before do this");
    }
    public final IWaynePlayer m(boolean p0){
       PlaySession b1;
       b uob;
       this.o("detachPlayer invoke");
       c uoc = this.getPlayerKitContext().g();
       IWaynePlayer iWaynePlayer = null;
       if (uoc != null) {
          Objects.requireNonNull(KwaiPlayerKit.d);
          a.p(uoc, "key");
          e.a().i("KwaiPlayerKit", "【detachPlayer】 SessionKey="+uoc+"  reportNow="+p0);
          PlaySession playSession = KwaiPlayerKit.b.get(uoc);
          if (playSession == null) {
             e.a().i("KwaiPlayerKit", "no "+uoc+" when call detach");
          }else {
             PlaySession b = playSession.b;
             if (b != null) {
                b.putExtra("EXTRA_DETACH_PLAYER_REPORT", Boolean.TRUE);
             }
             if (p0) {
                b1 = playSession.b;
                if (b1 != null) {
                   uob = playSession.g.b();
                   Integer integer = (uob != null)? Integer.valueOf(uob.hashCode()): iWaynePlayer;
                   b1.m(integer);
                   b1.a.p();
                }
             }else {
                b1 = playSession.b;
                if (b1 != null) {
                   b1.l(iWaynePlayer);
                }
             }
             b1 = playSession.b;
             if (b1 != null) {
                b1.putExtra("EXTRA_DETACH_PLAYER_REPORT", Boolean.FALSE);
             }
             b1 = playSession.f;
             if (b1 != null) {
                uob = playSession.g.b();
                if (uob != null) {
                   a uoa = uob.d(c.class);
                   if (uoa != null) {
                      uoa.a(new PlaySession$$special$$inlined$run$lambda$1(b1));
                   }
                }
             }
             b = playSession.f;
             if (b != null) {
                b.removeDataReporter(playSession.c);
             }
             _monitor_enter(playSession);
             playSession.f = iWaynePlayer;
             _monitor_exit(playSession);
             iWaynePlayer = b1;
          }
       }
       return iWaynePlayer;
    }
    public final void o(String p0){
       e.a().i("KwaiPlayerKitView", this.getPlayerKitContext().f()+" ,View:"+this.hashCode()+" , "+p0);
    }
    public final void p(b p0,IWaynePlayer p1,String p2,Map p3,boolean p4){
       a.p(p0, "source");
       a.p(p1, "midPlayer");
       a.p(p2, "sessionUuid");
       this.f.a("setPlayer");
       this.o("setPlayer invoke");
       c sessionKey = this.d.getSessionKey(p0);
       KwaiPlayerKit d = KwaiPlayerKit.d;
       Objects.requireNonNull(d);
       a.p(sessionKey, "key");
       a.p(p0, "dataSource");
       a.p(p1, "player");
       a.p(p2, "sessionUuid");
       e.a().i("KwaiPlayerKit", "【transferPlayer】  SessionKey="+sessionKey+"  DataSource="+p0+"  "+"Player="+p1+"  SessionUUID="+p2+" ,forceReplace="+p4);
       ConcurrentHashMap b = KwaiPlayerKit.b;
       PlaySession playSession = b.get(sessionKey);
       if (playSession != null) {
       }else {
          playSession = new PlaySession(sessionKey);
          Object obj = b.putIfAbsent(sessionKey, playSession);
          if (obj != null) {
             playSession = obj;
          }
       }
       playSession.n(p1, p0, p2, p3, p4);
       d.a(sessionKey, this.getPlayerKitContext());
       this.f.b();
       return;
    }
    public void release(){
       this.a(false);
    }
    public void reset(){
       this.i(false);
    }
    public void setRegisterTag(String p0){
       this.o("setRegisterTag "+p0);
       this.e = p0;
       if (p0 != null) {
          c uoc = this.getPlayerKitContext().g();
          if (uoc != null) {
             KwaiPlayerKit.d.f(uoc, p0);
          }
       }
       return;
    }
    public void setSessionKeyGenerator(d p0){
       a.p(p0, "generator");
       this.o("setSessionKeyGenerator invoke "+p0);
       this.d = p0;
    }
}
