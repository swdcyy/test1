package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import as1.a;
import as1.m;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;
import hf3.a;
import sz1.e;
import nq1.a;
import xr1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import as1.k;
import androidx.lifecycle.MutableLiveData;
import as1.d;
import androidx.collection.ArraySet;
import as1.c;
import java.lang.Long;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$c;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import as1.j;
import as1.n;
import is1.a;
import com.kuaishou.android.live.log.b;
import lh3.b;
import androidx.lifecycle.LiveData;
import nh3.b;
import java.util.ArrayList;
import trd.u;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import crd.b;
import lnc.b9;
import brd.t;
import t45.d;
import brd.z;
import as1.g;
import as1.h;
import erd.g;
import java.util.Objects;
import java.lang.Number;
import as1.f;
import androidx.lifecycle.Observer;
import w12.a;
import com.kuaishou.protobuf.livestream.nano.SCLivePuzzleStatistics;
import lf3.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import zr1.a;
import zr1.a$a;
import cjd.e;
import erd.o;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$a;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$b;
import as1.e;
import java.lang.Enum;
import java.lang.System;

public final class LiveMultiLinePuzzleModel implements a, m	// class@0015af
{
    public final List a;
    public final k b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final d e;
    public final ArraySet f;
    public c g;
    public String h;
    public Long i;
    public b j;
    public b k;
    public boolean l;
    public SCLivePuzzleStatistics m;
    public long n;
    public final p o;
    public final g p;
    public final LivePuzzleLineChatStartInfo q;
    public final a r;
    public final e s;
    public final a t;
    public final boolean u;
    public final e v;

    public void LiveMultiLinePuzzleModel(LivePuzzleLineChatStartInfo p0,a p1,e p2,a p3,boolean p4,e p5){
       a.p(p0, "startInfo");
       a.p(p1, "longConnection");
       a.p(p2, "liveMultiInteractManager");
       a.p(p3, "basicModel");
       a.p(p5, "delegate");
       super();
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p3;
       this.u = p4;
       this.v = p5;
       this.a = LiveLogTag.LIVE_LINE_PUZZLE.appendTag("LiveMultiLinePuzzleModel");
       this.b = new k(this);
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
       this.e = new d();
       this.f = new ArraySet();
       this.g = new c(p0);
       this.i = Long.valueOf(0);
       this.o = s.c(new LiveMultiLinePuzzleModel$countDownModel$2(this));
       this.p = new LiveMultiLinePuzzleModel$c(this);
    }
    public void a(LiveMultiLinePuzzleState p0,LiveMultiLinePuzzleState p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiLinePuzzleModel.class, "8")) {
          return;
       }
       a.p(p0, "from");
       a.p(p1, "to");
       return;
    }
    public void b(LiveMultiLinePuzzleState p0,LiveMultiLinePuzzleState p1){
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiLinePuzzleModel.class, "9")) {
          return;
       }
       a.p(p0, "from");
       a.p(p1, "to");
       if (p1 == LiveMultiLinePuzzleState.QUESTION) {
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             iterator.next().G1();
          }
       }
       if (p0 == LiveMultiLinePuzzleState.QUESTION) {
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             iterator.next().Q();
          }
       }
       if (p1 == LiveMultiLinePuzzleState.ANSWER) {
          if (this.u != null) {
             this.e().c();
          }
          Iterator iterator1 = this.f.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().g0();
          }
       }
       if (p0 == LiveMultiLinePuzzleState.ANSWER) {
          Iterator iterator2 = this.f.iterator();
          while (iterator2.hasNext()) {
             iterator2.next().u2();
          }
       }
       return;
    }
    public final void c(){
       LiveMultiLinePuzzleModel liveMultiLin = LiveMultiLinePuzzleModel.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, liveMultiLin, str)) {
          return;
       }
       b.P(this.a, "create");
       if (!PatchProxy.applyVoid(objArray, this, liveMultiLin, "14")) {
          b uob = this.s.gc();
          a.o(uob, "liveMultiInteractManager.liveInteractRtcManager");
          LiveData liveData = uob.c();
          a.o(liveData, "liveMultiInteractManager¡­eInteractRoomInfoLiveData");
          uob = liveData.getValue();
          if (uob != null) {
             List list = uob.f();
             if (list != null) {
                ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   c uoc = iterator.next();
                   a.o(uoc, "it");
                   uArrayList.add(uoc.c());
                }
                b.P(this.a, "init roomInfo user");
                this.e.g(uArrayList);
             }
          }
          b9.a(this.j);
          this.j = this.t.c().observeOn(d.a).subscribe(new g(this), new h(this));
       }
       LiveMultiLinePuzzleModel tq = this.q;
       if (!PatchProxy.applyVoidOneRefs(tq, this, liveMultiLin, "10")) {
          this.h = tq.puzzleLineChatId;
          this.i = Long.valueOf(tq.roomOwnerId);
          LiveMultiLinePuzzleModel te = this.e;
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoidOneRefs(tq, te, d.class, "7")) {
             a.p(tq, "startInfo");
             te.b = tq;
          }
          b.S(this.a, "handleStartInfo", "chatPuzzleId", this.h);
          if (this.u != null) {
             int i = 1;
             if (!PatchProxy.applyVoidOneRefs(tq, this, liveMultiLin, "11")) {
                n on = this.e();
                Long longx = Long.valueOf(tq.autoChooseAnswerDeadline);
                Objects.requireNonNull(on);
                if (!PatchProxy.applyVoidOneRefs(longx, on, n.class, "1")) {
                   on.c();
                   if (longx != null) {
                      long l = longx.longValue();
                      n j = on.j;
                      if (j != null) {
                         long l1 = j.longValue();
                         if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Long.valueOf(l1), on, n.class, str)) {
                            on.d(l, l1);
                         }
                      }
                   }
                }
                on = (this.v.b() - tq.autoChooseAnswerDeadline < 0)? 1: null;
                if (on) {
                   this.e().a().observeForever(new f(this));
                }else {
                   this.d.setValue(Long.valueOf(-1));
                }
             }
             this.b.n(i);
          }
          this.c.setValue(this.e);
       }
       this.r.u0(1084, SCLivePuzzleStatistics.class, this.p);
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLinePuzzleModel.class, "3")) {
          return;
       }
       b.P(this.a, "destroy");
       this.h = objArray;
       this.m = objArray;
       this.l = false;
       this.f.clear();
       b9.a(this.j);
       b9.a(this.k);
       this.e().c();
       this.r.o(1084, this.p);
       return;
    }
    public final n e(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLinePuzzleModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public final void f(SCLivePuzzleStatistics p0){
       int b;
       Iterator iterator;
       LiveMultiLinePuzzleModel liveMultiLin = LiveMultiLinePuzzleModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMultiLin, "15")) {
          return;
       }
       LiveMultiLinePuzzleModel obj = PatchProxy.applyOneRefs(p0, this, liveMultiLin, "16");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.m;
          if (obj != null) {
             a.m(obj);
             if (obj.version - p0.version >= 0) {
                obj = this.m;
                a.m(obj);
                b.T(this.a, "invalid statistics version", "lastVersion", Long.valueOf(obj.version), "newVersion", Long.valueOf(p0.version));
             label_0063 :
                b = false;
             }
          }
          if (!TextUtils.n(this.h, p0.puzzleLineChatId)) {
             b.T(this.a, "invalid statistics puzzleId", "puzzleId", this.h, "newPuzzleId", p0.puzzleLineChatId);
             goto label_0063 ;
          }else {
             b = true;
          }
       }
       if (!b) {
          return;
       }else {
          b.S(this.a, "handleStatistics", "statistics", p0);
          this.m = p0;
          this.i = Long.valueOf(p0.roomOwnerId);
          if (!PatchProxy.applyVoidOneRefs(p0, this, liveMultiLin, "17") && this.l == null) {
             SCLivePuzzleStatistics puzzleUser = p0.puzzleUser;
             a.o(puzzleUser, "statistics.puzzleUser");
             b = puzzleUser.length;
             int i = 0;
             int i1 = 1;
             while (i < b) {
                object oobject = puzzleUser[i];
                if (oobject.roleType == true) {
                   i1 = (oobject.isWin != null || (oobject.isPublish != null && i1))? 1: 0;
                }
             label_00a9 :
                i = i + 1;
             }
             if (i1) {
                this.l = true;
                iterator = this.f.iterator();
                while (iterator.hasNext()) {
                   iterator.next().P1();
                }
             }
          }
          liveMultiLin = this.e;
          Objects.requireNonNull(liveMultiLin);
          if (!PatchProxy.applyVoidOneRefs(p0, liveMultiLin, d.class, "6")) {
             a.p(p0, "statistics");
             liveMultiLin.a = p0;
          }
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             iterator.next().o1();
          }
          p0 = p0.status;
          liveMultiLin = 2;
          if (p0 != true) {
             if (p0 != liveMultiLin) {
                if (p0 == 3) {
                   this.b.n(4);
                }
             }else {
                this.b.n(3);
             }
          }else {
             this.b.n(liveMultiLin);
          }
          this.c.setValue(this.e);
          return;
       }
    }
    public final void g(LivePuzzleLineChatStartInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleModel.class, "13")) {
          return;
       }
       b.P(this.a, "start query statistics");
       b9.a(this.k);
       LivePuzzleLineChatStartInfo puzzleLineCh = p0.puzzleLineChatId;
       a.o(puzzleLineCh, "startInfo.puzzleLineChatId");
       this.k = a.a.a().b(this.v.T2(), this.v.getLiveStreamId(), puzzleLineCh, p0.puzzleType).map(new e()).subscribe(new LiveMultiLinePuzzleModel$a(this), new LiveMultiLinePuzzleModel$b(this));
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLinePuzzleModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = e.a[this.b.u().ordinal()];
       int i1 = 2;
       if (i != 1) {
          if (i != i1) {
             i1 = 0;
          }
       }else {
          i1 = 1;
       }
       return i1;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLinePuzzleModel.class, "7")) {
          return;
       }
       long l = System.currentTimeMillis() - this.n;
       b.T(this.a, "tryUpdateStatistics by user", "isAllQuestionAnswered", Boolean.valueOf(this.l), "interval", Long.valueOf(l));
       if (!this.s() && l - (long)3000 > 0) {
          this.g(this.q);
          this.n = System.currentTimeMillis();
       }
       return;
    }
    public void l(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleModel.class, "4")) {
          return;
       }
       a.p(p0, "observer");
       this.f.add(p0);
       return;
    }
    public c m(){
       return this.g;
    }
    public LiveData n(){
       return this.d;
    }
    public Long o(){
       return this.i;
    }
    public void p(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleModel.class, "5")) {
          return;
       }
       a.p(p0, "observer");
       this.f.remove(p0);
       return;
    }
    public String q(){
       return this.h;
    }
    public d r(){
       return this.e;
    }
    public boolean s(){
       return this.l;
    }
    public LiveData t(){
       return this.c;
    }
}
