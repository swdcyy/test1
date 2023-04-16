package cr2.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.crossroompk.log.LiveVoicePartyPKLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkStatistic;
import java.lang.Long;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkEnd;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.livestream.message.nano.LiveVoicePartyPkTeamStatistic;
import rr2.k;
import com.google.common.base.Optional;
import com.kuaishou.live.core.voiceparty.crossroompk.log.a;
import ok.h;
import com.kuaishou.live.core.voiceparty.crossroompk.log.b;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class a	// class@0023c8
{

    public void a(){
       super();
    }
    public static void a(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "5")) {
          return;
       }
       LiveVoicePartyPKLogTag tAG = LiveVoicePartyPKLogTag.TAG;
       String str = (p0)? "success": "fail";
       b.c0(tAG, "aryaRollBackRoom", "result", str);
       return;
    }
    public static void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "7")) {
          return;
       }
       int i = -1;
       if (p0 instanceof KwaiException) {
          i = p0.mErrorCode;
       }
       b.d0(LiveVoicePartyPKLogTag.TAG, "pk/ready api retry", "errorCode", Integer.valueOf(i), "throwable", p0.getMessage());
       return;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, a.class, "4")) {
          return;
       }
       b.Z(LiveVoicePartyPKLogTag.TAG, "onPostPunishFinish");
       return;
    }
    public static void d(String p0,SCLiveVoicePartyPkStatistic p1,long p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, a.class, "8")) {
          return;
       }
       b.e0(LiveVoicePartyPKLogTag.TAG, "ReceiveStatisticError", "state", p0, "timeStamp", Long.valueOf(p2), "pkId", p1.pkId);
       return;
    }
    public static void e(SCLiveVoicePartyPkEnd p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       b.d0(LiveVoicePartyPKLogTag.TAG, "onReceivedPKEnd", "pkId", TextUtils.k(p0.pkId), "endType", Integer.valueOf(p0.endType));
       return;
    }
    public static void f(SCLiveVoicePartyPkStatistic p0){
       long l1;
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       SCLiveVoicePartyPkStatistic teamStat = p0.teamStat;
       long l = 0;
       if (teamStat != null) {
          l = Optional.fromNullable(k.m(teamStat, 1)).transform(a.b).or(Long.valueOf(l)).longValue();
          l1 = Optional.fromNullable(k.m(p0.teamStat, 2)).transform(b.b).or(Long.valueOf(l)).longValue();
       }else {
          l1 = l;
       }
       ImmutableMap$b uob = new ImmutableMap$b();
       uob.c("pkId", TextUtils.k(p0.pkId));
       uob.c("voteDeadline", Long.valueOf(p0.voteDeadline));
       uob.c("voteEnd", Boolean.valueOf(p0.voteEnd));
       uob.c("yellowScore", Long.valueOf(l));
       uob.c("blueScore", Long.valueOf(l1));
       uob.c("myTeamType", Integer.valueOf(p0.myTeamType));
       b.h0(LiveVoicePartyPKLogTag.TAG, "onReceivedPKStatistic", uob.a());
       return;
    }
    public static void g(boolean p0,String p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, null, a.class, "3")) {
          return;
       }
       LiveVoicePartyPKLogTag tAG = LiveVoicePartyPKLogTag.TAG;
       String str = (p0)? "success": "fail";
       b.e0(tAG, "requestPKEnd", "result", str, "currentPkId", p1, "voicePartyId", p2);
       return;
    }
    public static void h(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "6")) {
          return;
       }
       LiveVoicePartyPKLogTag tAG = LiveVoicePartyPKLogTag.TAG;
       String str = (p0)? "success": "fail";
       b.c0(tAG, "notifyLiveServerRollBackRoom", "result", str);
       return;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "9")) {
          return;
       }
       b.d0(LiveVoicePartyPKLogTag.STATE_MACHINE, "stateChange", "currentState", p0, "targetStateName", p1);
       return;
    }
}
