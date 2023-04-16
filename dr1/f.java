package dr1.f;
import dr1.f$d;
import nsd.u;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import lq1.c;
import nq1.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import hf3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ls1.b;
import dr1.f$a;
import z0.a;
import androidx.lifecycle.Transformations;
import dr1.f$b;
import dr1.f$c;
import dr1.f$e;
import dr1.g;
import dr1.f$h;
import dr1.g$a;
import dr1.f$g;
import dr1.f$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lf3.g;
import crd.b;
import oh3.a;
import com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatStatistic;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatUserInfo;
import dr1.e;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindowFrameColor;
import dr1.b;
import dr1.d;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Message;
import w12.a;
import f02.a;
import com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatOpen;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCLiveArenaLineChatStatistic;
import brd.t;
import erd.g;

public final class f	// class@002005
{
    public final String a;
    public final String b;
    public LiveArenaLineChatStatistic c;
    public b d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final f$e i;
    public final g j;
    public final g k;
    public final f$f l;
    public b m;
    public a n;
    public final c o;
    public final a p;
    public final SCLiveMultiLineChatOpened q;
    public final a r;
    public static final List s;
    public static final f$d t;

    static {
       f.t = new f$d(null);
       f.s = LiveCommonLogTag.MULTI_LINE.appendTag("ArenaModel");
    }
    public void f(c p0,a p1,SCLiveMultiLineChatOpened p2,a p3){
       a.p(p0, "multiLineCoreModel");
       a.p(p1, "multiLineBasicModel");
       a.p(p2, "scLineOpened");
       a.p(p3, "longConnectionService");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       SCLiveMultiLineChatOpened multiLineCha = p2.multiLineChatId;
       a.o(multiLineCha, "scLineOpened.multiLineChatId");
       this.a = multiLineCha;
       multiLineCha = p2.subModeId;
       a.o(multiLineCha, "scLineOpened.subModeId");
       this.b = multiLineCha;
       MutableLiveData mutableLiveD = new MutableLiveData(null);
       b.a(mutableLiveD);
       this.e = mutableLiveD;
       LiveData liveData = Transformations.map(mutableLiveD, new f$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.f = liveData;
       liveData = Transformations.map(mutableLiveD, new f$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.g = liveData;
       LiveData liveData1 = Transformations.map(mutableLiveD, new f$c());
       a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       liveData1 = Transformations.distinctUntilChanged(liveData1);
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       this.h = liveData1;
       this.i = new f$e(this);
       this.j = new g(new f$h(this));
       this.k = new f$g(this);
       this.l = new f$f(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.r.o(1081, this.k);
       b.b(this.e).setValue(null);
       f tm = this.m;
       if (tm == null) {
          a.S("roomInfoUpdateDisposable");
       }
       tm.dispose();
       this.o.R(this.i);
       this.c = null;
       return;
    }
    public final LiveData b(){
       return this.h;
    }
    public final String c(){
       return this.b;
    }
    public final LiveData d(){
       return this.e;
    }
    public final LiveData e(){
       return this.f;
    }
    public final LiveArenaLineChatStatistic f(){
       return this.c;
    }
    public final Map g(Map p0,LiveArenaLineChatStatistic p1){
       LiveArenaLineChatUserInfo displayScore;
       String str3;
       LiveArenaLineChatUserInfo orderLabel;
       UserInfo userInfo1;
       f uof = this;
       Object obj = p0;
       LiveArenaLineChatStatistic obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HashMap obj2 = PatchProxy.applyTwoRefs(obj, obj1, uof, f.class, "11");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = new HashMap();
       obj1 = obj1.orderList;
       a.o(obj1, "arenaStatistic.orderList");
       int len = obj1.length;
       int i = 0;
       while (i < len) {
          object oobject = obj1[i];
          String str = uof.m(oobject.userId);
          e uoe = (obj != null)? obj.get(uof.m(oobject.userId)): null;
          a.o(oobject, "memberInfoPb");
          e uoe1 = e.class;
          PatchProxyResult obj3 = PatchProxy.applyTwoRefs(uoe, oobject, uof, f.class, "12");
          if (obj3 != patchProxyRe) {
             uoe = obj3;
          }else {
             String str1 = "memberInfoNew.orderLabel";
             String str2 = "memberInfoNew.displayScore";
             if (uoe != null) {
                uoe.c = oobject.status;
                uoe.d = oobject.score;
                uoe.e = oobject.rank;
                displayScore = oobject.displayScore;
                a.o(displayScore, str2);
                str3 = "<set-?>";
                if (!PatchProxy.applyVoidOneRefs(displayScore, uoe, uoe1, "1")) {
                   a.p(displayScore, str3);
                   uoe.f = displayScore;
                }
                orderLabel = oobject.orderLabel;
                a.o(orderLabel, str1);
                if (!PatchProxy.applyVoidOneRefs(orderLabel, uoe, uoe1, "2")) {
                   a.p(orderLabel, str3);
                   uoe.g = orderLabel;
                }
                uoe.h = oobject.endTime;
                uoe.i = oobject.frameColor;
             }else {
                str3 = uof.m(oobject.userId);
                LiveArenaLineChatUserInfo userInfo = oobject.userInfo;
                if (userInfo != null) {
                   userInfo1 = UserInfo.convertFromProto(userInfo);
                   if (userInfo1 != null) {
                   label_00ac :
                      displayScore = oobject.displayScore;
                      a.o(displayScore, str2);
                      orderLabel = oobject.orderLabel;
                      a.o(orderLabel, str1);
                      p1 = obj1;
                      obj3 = patchProxyRe;
                      LiveArenaLineChatUserInfo liveArenaLin = displayScore;
                      e uoe2 = new e(str3, userInfo1, oobject.status, oobject.score, oobject.rank, liveArenaLin, orderLabel, oobject.endTime, oobject.frameColor);
                      uoe = v26;
                   label_00dc :
                      obj2.put(str, uoe);
                      i = i + 1;
                      uof = this;
                      obj = p0;
                      obj1 = p1;
                      patchProxyRe = obj3;
                   }
                }
                userInfo1 = new UserInfo();
                goto label_00ac ;
             }
          }
          p1 = obj1;
          obj3 = patchProxyRe;
          goto label_00dc ;
       }
       return obj2;
    }
    public final String h(){
       return this.a;
    }
    public final b i(){
       f obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("staticConfig");
       }
       return obj;
    }
    public final void j(LiveArenaLineChatStatistic p0){
       boolean b;
       LiveArenaLineChatStatistic liveArenaLin = this;
       f obj = p0;
       f uof = f.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(obj, liveArenaLin, uof, "8")) {
          return;
       }
       liveArenaLin.c = obj;
       List s = f.s;
       b.U(s, "responseArenaStatistic, version: "+obj.version, "host", Long.valueOf(obj.hostUserId), "winner", Long.valueOf(obj.winnerUserId), "isEnd", Boolean.valueOf(obj.ended));
       d value = liveArenaLin.e.getValue();
       String str = null;
       if (value != null) {
          value.g(liveArenaLin.j.u());
          String str1 = liveArenaLin.m(obj.hostUserId);
          if (!PatchProxy.applyVoidOneRefs(str1, value, uod, "2")) {
             a.p(str1, "<set-?>");
             value.d = str1;
          }
          str1 = liveArenaLin.m(obj.winnerUserId);
          if (!PatchProxy.applyVoidOneRefs(str1, value, uod, "3")) {
             a.p(str1, "<set-?>");
             value.f = str1;
          }
          Map map = liveArenaLin.g(value.c(), obj);
          if (!PatchProxy.applyVoidOneRefs(map, value, uod, "4")) {
             a.p(map, "<set-?>");
             value.g = map;
          }
          value.h = obj.ended;
          value.i = obj.freeChatEndTime;
       }else {
          d uod1 = new d(liveArenaLin.a, liveArenaLin.b, liveArenaLin.j.u(), liveArenaLin.m(obj.hostUserId), liveArenaLin.n, liveArenaLin.m(obj.winnerUserId), liveArenaLin.g(str, obj), obj.ended, obj.freeChatEndTime);
       }
       a.o(value, "arenaLineInfo.value?.als\x20\x02hatEndTime,\n      \)\n    }\x00");
       b.b(liveArenaLin.e).setValue(value);
       if (liveArenaLin.j.u() != LiveMultiLineArenaLiveState.SHOW_END) {
          Object obj1 = PatchProxy.applyOneRefs(obj, liveArenaLin, uof, "9");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(obj.ended == null){
             LiveArenaLineChatStatistic winnerUserId = obj.winnerUserId;
             if (winnerUserId <= 0) {
                b.P(s, "judgeShowEndInStreamFromStatistic, draw!");
             }else {
                String str2 = String.valueOf(winnerUserId);
                uof = liveArenaLin.n;
                if (uof != null) {
                   str = uof.a();
                }
                if (TextUtils.n(str2, str)) {
                   b.P(s, "judgeShowEndInStreamFromStatistic, winner match!");
                }else {
                   b.P(s, "judgeShowEndInStreamFromStatistic, waiting stream");
                }
             }
             b = true;
          }
          b = false;
          if (b) {
             obj = liveArenaLin.j;
             obj.p(obj.j(2));
          }
       }
       return;
    }
    public final void k(SCLiveMultiLineChatOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       LiveArenaLineChatStatistic obj = null;
       try{
          p0 = p0.chatModeStartExtra;
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "12");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(!TextUtils.isEmpty(p0)){
             obj = LiveArenaLineChatOpen.parseFrom(Base64.decode(p0, 0));
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e6){
          b.y(f.s, "handleMultiLineChatOpen error", e6);
       }
       if (obj != null) {
          LiveArenaLineChatOpen statistic = obj.statistic;
          if (statistic != null) {
             if (this.d == null) {
                this.d = new b(obj.ruleUrl, obj.playType, obj.displayScorePrefix);
             }
             obj = statistic.version;
             f tc = this.c;
             LiveArenaLineChatStatistic version = (tc != null)? tc.version: null;
             if (obj - version < 0) {
                b.P(f.s, "handleMultiLineChatOpen, version not valid: "+statistic.version);
             }else {
                b.P(f.s, "handleMultiLineChatOpen");
                this.j(statistic);
             }
          }
       }
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       b.T(f.s, "core model initialize", "multiLineChatId", this.a, "arenaId", this.b);
       this.k(this.q);
       this.o.O(this.i);
       this.r.u0(1081, SCLiveArenaLineChatStatistic.class, this.k);
       b uob = this.p.c().subscribe(this.l);
       a.o(uob, "multiLineBasicModel.room¡­e\(roomInfoUpdateConsumer\)");
       this.m = uob;
       return;
    }
    public final String m(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uof, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0 > 0)? String.valueOf(p0): "";
       return str;
    }
}
