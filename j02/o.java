package j02.o;
import yh3.a;
import hf3.a;
import aq5.d;
import xp5.g;
import vq5.d;
import xp5.i;
import jv1.b;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.watchtimer.LiveWatchTimerStartConfig;
import j02.o$d;
import j02.o$e;
import j02.o$b;
import j02.o$c;
import j02.o$a;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import java.lang.Class;
import lf3.g;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxRewardCartoon;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import oq5.c;
import j02.a;
import gg1.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import j02.a$c;
import java.util.Objects;
import j02.u;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import j02.d;
import java.util.HashSet;
import java.util.HashMap;
import java.lang.Integer;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.r0;
import crd.b;
import oh3.j;
import j02.c;
import ok.x;
import brd.t;
import j02.p;
import erd.g;
import j02.q;
import zfc.b;
import j02.r;
import erd.o;
import j02.s;
import erd.a;
import j02.t;
import j02.a$b;
import k02.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri$Builder;
import j02.a$a;
import java.lang.Long;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import androidx.lifecycle.ViewModel;
import java.lang.Runnable;
import e93.f;
import j02.v;
import java.lang.Float;

public final class o extends a	// class@002a2b
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public SCLiveEncourageTreasureBoxWidget f;
    public final LiveWatchTimerStartConfig g;
    public long h;
    public boolean i;
    public b j;
    public final c k;
    public final Runnable l;
    public final g m;
    public final g n;
    public final b o;
    public final a p;
    public final d q;
    public final g r;
    public d s;
    public final i t;
    public final b u;
    public final k v;

    public void o(a p0,d p1,g p2,d p3,i p4,b p5,k p6){
       a.p(p0, "liveLongConnection");
       a.p(p1, "liveBizManager");
       a.p(p2, "liveInfoManager");
       a.p(p3, "liveRouterManager");
       a.p(p4, "liveLogPackageProvider");
       a.p(p6, "pageIdSupplier");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.v = p6;
       int i = 0;
       boolean b = (p5 != null)? p5.H2(): false;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.valueOf(b));
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.e = mutableLiveD;
       this.g = new LiveWatchTimerStartConfig();
       o$d uod = new o$d(this);
       this.k = uod;
       this.l = new o$e(this);
       o$b uob = new o$b(this);
       this.m = uob;
       o$c uoc = new o$c(this);
       this.n = uoc;
       o$a uoa = new o$a(this);
       this.o = uoa;
       p0.u0(1103, SCLiveEncourageTreasureBoxWidget.class, uob);
       p0.u0(1104, SCLiveEncourageTreasureBoxRewardCartoon.class, uoc);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY_VIDEO,AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.VOICE_PARTY_KTV,AudienceBizRelation.VOICE_PARTY_AUDIO,AudienceBizRelation.VOICE_PARTY_GRID_CHAT,AudienceBizRelation.VOICE_PARTY_TEAM_PK,AudienceBizRelation.VOICE_PARTY_THEATER};
       p1.u5(uoa, uoaArray);
       if (p5 != null) {
          p5.W0(uod, 1);
       }
       return;
    }
    public void A0(a p0){
       String str;
       List a;
       String obj1;
       a a1;
       e0 uoe0;
       CharSequence uCharSequenc;
       i3 oi3;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       a$a d;
       a$a uoa1;
       i3 oi31;
       ClientEvent$ElementPackage uElementPack1;
       ClientContent$ContentPackage uContentPack1;
       boolean b = this;
       String obj = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, oo, "6")) {
          return;
       }
       a.p(obj, "intent");
       Object[] objArray = null;
       if (obj instanceof a$c) {
          Objects.requireNonNull(obj);
          str = "1";
          obj = PatchProxy.apply(objArray, obj, a$c.class, str);
          if (obj != patchProxyRe) {
          }else {
             obj = a$c.a;
             if (obj == null) {
                a.S("timerTaskId");
             }
          }
          if (!PatchProxy.applyVoidOneRefs(obj, b, oo, "7")) {
             a = u.a;
             b.P(a, "reportWatchLiveTaskFinish, timerTaskId:"+obj);
             if (b.i == null) {
                d c = d.c;
                Objects.requireNonNull(c);
                obj1 = PatchProxy.applyOneRefs(obj, c, d.class, str);
                boolean b1 = false;
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   a.p(obj, "taskId");
                   if (!d.a.contains(obj)) {
                      Integer integer = d.b.get(obj);
                      if (integer == null) {
                         integer = Integer.valueOf(b1);
                      }
                      if (a.t(integer.intValue(), 3) < 0) {
                         b1 = true;
                      }
                   }
                }
                if (!b1) {
                   b.P(a, "can not report");
                }else if(!r0.d(a.b())){
                   b.P(a, "Network is not Connected!!");
                }else {
                   j.a(b.j);
                   b.i = true;
                   b.j = c.a.get().a(b.r.getLiveStreamId(), obj).doOnNext(p.b).doOnError(new q(obj)).retryWhen(new b(2, r.b)).doFinally(new s(b, obj)).subscribe(new t(obj));
                }
             }
          }
       }else {
          String str1 = "logPage";
          String str2 = "liveStreamPackage";
          if (obj instanceof a$b) {
             if (!PatchProxy.applyVoid(objArray, b, oo, "8")) {
                b value = b.b.getValue();
                if (value != null) {
                   a1 = a.a;
                   ClientContent$LiveStreamPackage liveStreamPa = b.t.a();
                   a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
                   e0 page = b.t.getPage();
                   a.o(page, "liveLogPackageProvider.page");
                   int i = value.b();
                   obj = value.a();
                   Objects.requireNonNull(a1);
                   if (PatchProxy.isSupport(uoa)) {
                      uoe0 = page;
                      if (!PatchProxy.applyVoidFourRefs(liveStreamPa, page, Integer.valueOf(i), obj, a1, a.class, "2")) {
                      }
                   }else {
                      uoe0 = page;
                   }
                }
             label_01a2 :
                List a2 = u.a;
                String str3 = "onClick - webUrl, ";
                b value1 = b.b.getValue();
                str = (value1 != null)? value1.c(): null;
                b.P(a2, str3+str);
                value = b.b.getValue();
                obj = (value != null)? value.c(): null;
                if (!TextUtils.x(obj)) {
                   o s = b.s;
                   b value2 = b.b.getValue();
                   str3 = (value2 != null)? value2.c(): null;
                   a.m(str3);
                   obj1 = PatchProxy.applyOneRefs(str3, b, oo, "9");
                   if (obj1 != patchProxyRe) {
                   }else {
                      Uri$Builder uBuilder = new Uri$Builder().scheme("kwailive").authority("webview");
                      uBuilder.appendQueryParameter("url", str3);
                      obj1 = uBuilder.toString();
                      a.o(obj1, "routerBuilder.toString\(\)");
                   }
                   s.r4(obj1, null);
                }
             }
          }else if(obj instanceof a$a){
             a1 = a.a;
             a$a a3 = obj.a;
             a$a b2 = obj.b;
             a$a c1 = obj.c;
             d = obj.d;
             Objects.requireNonNull(a1);
             if (PatchProxy.isSupport(uoa)) {
                uoa1 = d;
                if (!PatchProxy.applyVoidFourRefs(a3, b2, Long.valueOf(c1), Long.valueOf(d), a1, a.class, "5")) {
                }
             }else {
                uoa1 = d;
             }
          }
       }
    label_02a4 :
       return;
    }
    public final LiveData C0(){
       return this.a;
    }
    public final boolean D0(SCLiveEncourageTreasureBoxWidget p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.isTimerTaskProcessing != null && !TextUtils.x(p0.timerTaskStageId)) {
          b = true;
       }
       return b;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       super.onCleared();
       this.p.o(1103, this.m);
       this.p.o(1104, this.n);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY_VIDEO,AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.VOICE_PARTY_KTV,AudienceBizRelation.VOICE_PARTY_AUDIO,AudienceBizRelation.VOICE_PARTY_GRID_CHAT,AudienceBizRelation.VOICE_PARTY_TEAM_PK,AudienceBizRelation.VOICE_PARTY_THEATER};
       this.q.G5(this.o, uoaArray);
       f.f(this.l);
       o tf = this.f;
       if (tf != null) {
          SCLiveEncourageTreasureBoxWidget timerTaskSta = tf.timerTaskStageId;
          if (timerTaskSta != null) {
             v.a().d("ENCOURAGE_TREASURE_BOX_BIZ", timerTaskSta, "ENCOURAGE_TREASURE_BOX_SOURCE", this.v.get());
             b.S(u.a, "LiveAudienceTreasureBoxViewModel onCleared LiveWatchTimerTaskManager pause", "taskStageId", timerTaskSta);
          }
       }
       tf = this.u;
       if (tf != null) {
          tf.Q0(this.k);
       }
       j.a(this.j);
       return;
    }
    public final LiveData u0(){
       return this.e;
    }
    public final SCLiveEncourageTreasureBoxWidget v0(){
       return this.f;
    }
    public final LiveData w0(){
       return this.c;
    }
    public final LiveData x0(){
       return this.d;
    }
    public final int y0(SCLiveEncourageTreasureBoxWidget p0){
       SCLiveEncourageTreasureBoxWidget obj = PatchProxy.applyOneRefs(p0, this, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (p0 != null)? p0.timerTaskStageId: null;
       int i = 0;
       if (obj == null) {
          return i;
       }else {
          int i1 = 1000;
          if (p0.timerTaskStageStatus == 3) {
             return i1;
          }else if(p0.timerTaskStageSeconds == null){
             return i;
          }else {
             long l = v.a().e("ENCOURAGE_TREASURE_BOX_BIZ", p0.timerTaskStageId, "ENCOURAGE_TREASURE_BOX_SOURCE");
             float f = (l - null < 0)? 0: (float)l / (float)i1;
             b.S(u.a, "getTimerTaskProgress", "watchTimeDurationSecondFloat:", Float.valueOf(f));
             f = f / (float)p0.timerTaskStageSeconds;
             if (f - (float)1 < 0) {
                i1 = (int)(f * (float)i1);
             }
             return i1;
          }
       }
    }
    public final LiveData z0(){
       return this.b;
    }
}
