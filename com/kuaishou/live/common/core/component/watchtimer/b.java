package com.kuaishou.live.common.core.component.watchtimer.b;
import java.lang.Object;
import androidx.collection.ArrayMap;
import java.util.HashSet;
import com.kuaishou.live.common.core.component.watchtimer.b$a;
import com.kuaishou.live.common.core.component.watchtimer.b$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.watchtimer.b$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.common.core.component.watchtimer.a;
import ok.o;
import yy1.a;
import java.lang.Number;
import java.lang.Long;
import com.kuaishou.live.common.core.component.watchtimer.LiveWatchTimerStartConfig;
import com.google.common.collect.ImmutableMap;
import java.util.List;

public class b	// class@0017d2
{
    public int a;
    public final Map b;
    public final Set c;

    public void b(){
       super();
       this.b = new ArrayMap();
       this.c = new HashSet();
    }
    public void b(b$a p0){
       super();
       this.b = new ArrayMap();
       this.c = new HashSet();
    }
    public static b e(){
       return b$b.a;
    }
    public void a(int p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_WATCH_TIMER, "attach", "liveType", Integer.valueOf(p0), "attachKey", p1);
       this.c.add(p1);
       this.a = p0;
       Iterator iterator = this.b.values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          b$c uoc = iterator.next();
          if (uoc.a != null) {
             break ;
          }else {
             String str = null;
             if (!this.g(uoc) && uoc.c - str > 0) {
                uoc.b();
             }
             if (!this.g(uoc)) {
                return;
             }else if(uoc.c - str > 0){
                uoc.b();
             }
             b.c0(LiveLogTag.LIVE_WATCH_TIMER, "attach logStart", "id", uoc.a());
             uoc.c();
          }
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       LiveLogTag lIVE_WATCH_T = LiveLogTag.LIVE_WATCH_TIMER;
       String str = "attachKey";
       b.c0(lIVE_WATCH_T, "detach", str, p0);
       this.c.remove(p0);
       if (!this.c.isEmpty()) {
          return;
       }
       b.c0(lIVE_WATCH_T, "detach start", str, p0);
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          b$c uoc = iterator.next();
          if (uoc.c - null > 0) {
             b.c0(LiveLogTag.LIVE_WATCH_TIMER, "detach logEnd", "id", uoc.a());
             uoc.b();
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_WATCH_TIMER, "enterBackground");
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          b$c uoc = iterator.next();
          if (uoc.b == null && uoc.c - null > 0) {
             b.c0(LiveLogTag.LIVE_WATCH_TIMER, "enterBackground logEnd", "id", uoc.a());
             uoc.b();
          }
       }
       return;
    }
    public void d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "8")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_WATCH_TIMER, "enterForeground", "liveType", Integer.valueOf(p0));
       this.a = p0;
       Iterator iterator = this.b.values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          b$c uoc = iterator.next();
          if (uoc.a != null) {
             break ;
          }else if(!this.g(uoc)){
             return;
          }else if(uoc.c - null > 0){
             uoc.b();
          }
          b.c0(LiveLogTag.LIVE_WATCH_TIMER, "enterForeground logStart", "id", uoc.a());
          uoc.c();
       }
       return;
    }
    public final String f(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"_"+p1;
    }
    public final boolean g(b$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(p0.g)) {
          return true;
       }
       if (m.s(p0.g).d(a.b)) {
          return true;
       }
       if (m.s(p0.g).d(new a(this))) {
          return true;
       }
       return false;
    }
    public boolean h(String p0,String p1,String p2){
       boolean b;
       b$c obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       LiveLogTag lIVE_WATCH_T = LiveLogTag.LIVE_WATCH_TIMER;
       b.e0(lIVE_WATCH_T, "pause", "biz", p0, "token", p1, "source", p2);
       obj = this.b.get(this.f(p0, p1));
       b = false;
       if (obj == null) {
          b.e0(lIVE_WATCH_T, "pause fail, task does not exist", "biz", p0, "token", p1, "source", p2);
          return b;
       }else if(obj.a != null){
          return b;
       }else {
          obj.a = true;
          if (this.g(obj) && obj.c > 0) {
             obj.b();
             b.e0(lIVE_WATCH_T, "pause logEnd", "biz", p0, "token", p1, "source", p2);
          }
          b.e0(lIVE_WATCH_T, "pause success", "biz", p0, "token", p1, "source", p2);
          return true;
       }
    }
    public long i(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       LiveLogTag lIVE_WATCH_T = LiveLogTag.LIVE_WATCH_TIMER;
       b.e0(lIVE_WATCH_T, "query", "biz", p0, "token", p1, "source", p2);
       Object obj1 = this.b.get(this.f(p0, p1));
       if (obj1 == null) {
          b.e0(lIVE_WATCH_T, "query fail, task does not exist", "biz", p0, "token", p1, "source", p2);
          return -1;
       }else if(obj1.a == null && (this.g(obj1) && obj1.c - null > 0)){
          b.e0(lIVE_WATCH_T, "query logEndAndStart", "biz", p0, "token", p1, "source", p2);
          obj1.b();
          obj1.c();
       }
    label_0070 :
       b.f0(lIVE_WATCH_T, "query success", "biz", p0, "token", p1, "duration", Long.valueOf(obj1.d), "source", p2);
       return obj1.d;
    }
    public boolean j(LiveWatchTimerStartConfig p0){
       LiveLogTag obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LiveLogTag.LIVE_WATCH_TIMER;
       LiveWatchTimerStartConfig mBiz = p0.mBiz;
       LiveWatchTimerStartConfig mToken = p0.mToken;
       LiveWatchTimerStartConfig mSource = p0.mSource;
       String str = "null";
       String str1 = (mSource == null)? str: mSource;
       mSource = p0.mLiveTypes;
       String str2 = (mSource == null)? str: mSource;
       b.h0(obj, "start", ImmutableMap.of("biz", mBiz, "token", mToken, "source", str1, "liveTypes", str2, "isSupportBackground", Boolean.valueOf(p0.mIsSupportBackground)));
       b$c uoc = this.b.get(this.f(p0.mBiz, p0.mToken));
       if (uoc == null) {
          uoc = new b$c(p0.mBiz, p0.mToken, p0.mLiveTypes, p0.mIsSupportBackground);
          this.b.put(uoc.a(), uoc);
       }
       if (uoc.a == null && uoc.c - null > 0) {
          b.e0(obj, "start fail, task already start", "biz", p0.mBiz, "token", p0.mToken, "source", p0.mSource);
          return false;
       }else if(!this.g(uoc)){
          b.e0(obj, "start success, task is invalid", "biz", p0.mBiz, "token", p0.mToken, "source", p0.mSource);
          return false;
       }else {
          uoc.a = false;
          uoc.c();
          b.e0(obj, "start success", "biz", p0.mBiz, "token", p0.mToken, "source", p0.mSource);
          return true;
       }
    }
    public boolean k(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       LiveLogTag lIVE_WATCH_T = LiveLogTag.LIVE_WATCH_TIMER;
       b.e0(lIVE_WATCH_T, "stop", "biz", p0, "token", p1, "source", p2);
       if (this.b.remove(this.f(p0, p1)) == null) {
          b.e0(lIVE_WATCH_T, "stop fail, task does not existl", "biz", p0, "token", p1, "source", p2);
          return false;
       }else {
          b.e0(lIVE_WATCH_T, "stop success", "biz", p0, "token", p1, "source", p2);
          return true;
       }
    }
}
