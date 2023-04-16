package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m;
import android.database.Observable;
import java.lang.String;
import i82.b;
import i82.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.watchtimer.LiveWatchTimerStartConfig;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;
import java.lang.Boolean;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LivePendantInfo;
import java.util.Iterator;
import java.util.ArrayList;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m$a;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import i82.x;
import erd.o;
import i82.c0;
import erd.g;
import java.lang.Number;
import com.kuaishou.live.common.core.component.watchtimer.b;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.e$b;
import java.lang.Long;
import k82.b;
import k82.a;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.i;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.k;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import i82.w;
import i82.b0;
import com.kwai.framework.model.user.User;
import cjd.e;
import i82.a0;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.l;
import i82.z;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.j;

public class m extends Observable	// class@000b40
{
    public b a;
    public int b;
    public int c;
    public int d;
    public long e;
    public final b f;
    public b g;
    public b h;
    public b i;
    public boolean j;
    public long k;
    public final LiveWatchTimerStartConfig l;
    public final String m;
    public final a n;
    public static final int o;

    public void m(String p0,b p1){
       super();
       this.e = 0;
       this.n = new v(this);
       this.f = p1;
       this.m = p0;
       this.d();
       LiveWatchTimerStartConfig liveWatchTim = PatchProxy.apply(null, this, m.class, "16");
       if (liveWatchTim != PatchProxyResult.class) {
       }else {
          liveWatchTim = new LiveWatchTimerStartConfig();
          liveWatchTim.mBiz = "SuperFansGroup";
          liveWatchTim.mToken = "Pendant";
          Integer[] integerArray = new Integer[]{Integer.valueOf(1)};
          liveWatchTim.mLiveTypes = Arrays.asList(integerArray);
          liveWatchTim.mIsSupportBackground = false;
          liveWatchTim.mSource = "SuperFansGroupPendantSource";
       }
       this.l = liveWatchTim;
       return;
    }
    public final String a(int p0,int p1,boolean p2){
       HashMap obj;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, m.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashMap();
       obj.put("availableDrawCnt", Integer.valueOf(p0));
       obj.put("drawChanceId", Integer.valueOf(p1));
       obj.put("enable", Boolean.valueOf(p2));
       return a.a.q(obj);
    }
    public final void b(LivePendantInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "12")) {
          return;
       }
       this.b = p0.mWatchSecond;
       this.c = p0.mPrivilegeId;
       this.d = p0.mDrawChanceId;
       Iterator iterator = this.mObservers.iterator();
       while (iterator.hasNext()) {
          m$a uoa = iterator.next();
          uoa.a(p0.mAvailableDrawCnt);
          if (p0.mDrawChanceId == -1 || p0.mAvailableDrawCnt > null) {
             uoa.b(p0.mContent);
             b9.a(this.a);
             break ;
          }else {
             int i = p0.mDrawChanceSecond - p0.mWatchSecond;
             long l = (long)i;
             b9.a(this.a);
             if (l - null < 0) {
                return;
             }
             long l1 = 1 + l;
             this.a = t.interval(1, TimeUnit.SECONDS, d.a).take(l1).map(new x(l)).subscribe(new c0(this, uoa));
          }
       }
       return;
    }
    public int c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, m.class, "5");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.b;
       Object obj1 = PatchProxy.apply(objArray, this, m.class, "18");
       long l = (obj1 != patchProxyRe)? obj1.longValue(): b.e().i("SuperFansGroup", "Pendant", "SuperFansGroupPendantSource");
       return (obj + (int)(l / 1000));
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, m.class, "13")) {
          return;
       }
       a.b().a("sync_lucky_bag_pendant_info", this.n);
       return;
    }
    public void e(e$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "4")) {
          return;
       }
       if (this.j != null) {
          return;
       }
       b9.a(this.a);
       b9.a(this.h);
       if (!PatchProxy.applyVoid(null, this, m.class, "17")) {
          b.e().h("SuperFansGroup", "Pendant", "SuperFansGroupPendantSource");
       }
       LivePendantInfo livePendantI = new LivePendantInfo();
       livePendantI.mWatchSecond = this.c();
       livePendantI.mPrivilegeId = this.c;
       livePendantI.mDrawChanceId = this.d;
       HashMap hashMap = new HashMap();
       hashMap.put("luckyBagPendant", livePendantI);
       hashMap.put("reportTimeMs", Long.valueOf(p0.s()));
       b9.a(this.g);
       this.g = a.b().a(this.f.getLiveStreamId(), 5, a.a.q(hashMap)).subscribe(i.b, k.b);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       this.g();
       b.c0(LiveLogTag.LIVE_SUPER_FANS_GROUP_PENDANT, "restartTimer", "leftTimeSec", Long.valueOf(this.k));
       Iterator iterator = this.mObservers.iterator();
       while (true) {
          if (iterator.hasNext()) {
             m$a uoa = iterator.next();
             b9.a(this.a);
             m tk = this.k;
             if (tk - null < 0) {
                break ;
             }else {
                long l = 1 + tk;
                this.a = t.interval(1, TimeUnit.SECONDS, d.a).take(l).map(new w(tk)).subscribe(new b0(this, uoa));
             }
          }else {
             this.d();
             this.i(true);
             return;
          }
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, m.class, "15")) {
          return;
       }
       b.e().j(this.l);
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, m.class, "19")) {
          return;
       }
       b.e().k("SuperFansGroup", "Pendant", "SuperFansGroupPendantSource");
       return;
    }
    public final void i(boolean p0){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, m.class, "7")) {
          return;
       }
       if (this.j != null) {
          return;
       }
       b9.a(this.i);
       int i = (p0)? -1: this.c();
       int i1 = (p0)? -1: this.d;
       this.i = a.b().c(this.f.I().mId, this.c, i1, (long)i, "5").map(new e()).observeOn(d.a).subscribe(new a0(this), l.b);
       return;
    }
    public final void j(int p0,long p1){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, m.class, "10")) {
          return;
       }
       if (p0 != -1 && this.j == null) {
          if (this.e - p1 >= 0) {
             return;
          }else {
             this.e = p1;
             if (!PatchProxy.isSupport(m.class) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(p1), this, m.class, "11") && p1 - this.f.b() > 0)) {
                p1 = (p1 - this.f.b()) / 1000;
                if (p1 > 0) {
                   b9.a(this.h);
                   this.h = t.timer(p1, TimeUnit.SECONDS).subscribe(new z(this), j.b);
                }
             }
          }
       }
       return;
    }
}
