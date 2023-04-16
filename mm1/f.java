package mm1.f;
import mm1.e;
import mm1.c;
import mm1.b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import mm1.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Objects;
import km1.b;
import java.util.List;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import aq5.d;
import java.lang.Long;
import java.lang.Number;
import java.util.Deque;
import mm1.i;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class f implements e	// class@0031c6
{
    public final c a;
    public String b;
    public String c;
    public String d;
    public int e;
    public long f;
    public final b g;
    public d h;

    public void f(c p0,b p1){
       super();
       this.b = "";
       this.c = "";
       this.a = p0;
       this.g = p1;
    }
    public void a(){
       long l1;
       f uof = f.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "1")) {
          return;
       }
       f ta = this.a;
       ta.action = this.c;
       ta.stage = this.b;
       f td = this.d;
       String str = "";
       if (td == null) {
          td = str;
       }
       ta.message = td;
       ta.code = this.e;
       b.Z(LiveLogTag.LIVE_COMMON_TRACE, "[LiveCommonTraceLoggerImpl][report]traceInfo:"+this.a.toString());
       ta = this.h;
       if (ta != null && ta.a(this.a)) {
          return;
       }else {
          String str1 = this.g.m();
          td = this.a;
          if (str1 != null) {
             str = str1;
          }
          td.pkId = str;
          td.liveStreamPatternType = this.g.c();
          td = this.a;
          td.pageType = this.g.v();
          td.mLiveModel = this.g.d();
          ta = this.a;
          ClientContent$LiveStreamPackage liveStreamPa = this.g.a();
          Objects.requireNonNull(ta);
          f obj = PatchProxy.applyOneRefs(liveStreamPa, ta, c.class, "4");
          if (obj != patchProxyRe) {
             ta = obj;
          }else if(liveStreamPa == null){
             b.P(b.a, "[LiveCommonTraceInfo][fill]liveStreamPackage is null");
          }else {
             ta.liveStreamId = liveStreamPa.liveStreamId;
             ta.showIndexPlusOne = liveStreamPa.showIndexPlusOne;
             ta.authorId = liveStreamPa.anchorUserId;
             ta.myFollow = Boolean.valueOf(liveStreamPa.myFollow);
             ta.friend = Boolean.valueOf(liveStreamPa.friend);
             ta.liveOperationType = liveStreamPa.liveOperationType;
             ta.serverExpTag = liveStreamPa.serverExpTag;
             ta.sourceUrl = liveStreamPa.sourceUrl;
             ta.sourceTypeNew = liveStreamPa.sourceTypeNew;
          }
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.g.y();
          Objects.requireNonNull(ta);
          if (PatchProxy.applyOneRefs(liveVoicePar, ta, c.class, "5") != patchProxyRe) {
          }else if(liveVoicePar == null){
             b.P(b.a, "[LiveCommonTraceInfo][fill]liveVoicePartyPackageV2 is null");
          }else {
             ta.voicePartyId = liveVoicePar.voicePartyId;
             ta.ktvId = liveVoicePar.ktvId;
             ta.theaterId = liveVoicePar.theaterId;
             ta.teamPkRoomId = liveVoicePar.teamPkRoomId;
          }
          d uod = this.g.A0();
          if (uod != null) {
             this.a.liveBizStatus = uod.Ya();
          }
          long l = this.g.b();
          obj = this.a;
          if (PatchProxy.isSupport(uof)) {
             c obj1 = PatchProxy.applyTwoRefs(obj, Long.valueOf(l), this, uof, "2");
             if (obj1 != patchProxyRe) {
                l1 = obj1.longValue();
             }else {
             label_0126 :
                f tf = this.f;
                if (tf) {
                   l1 = tf;
                }else {
                   Objects.requireNonNull(obj);
                   obj1 = PatchProxy.apply(objArray, obj, c.class, "3");
                   if (obj1 == patchProxyRe) {
                      obj1 = obj.g.peekLast();
                   }
                   obj1 = (obj1 != null)? obj1.reportTimestampMs: obj.b();
                   l1 = l - obj1;
                }
             }
          }else {
             goto label_0126 ;
          }
          obj.curActionTimeCostMs = l1;
          uof = this.a;
          uof.reportTimestampMs = l;
          l = l - uof.b();
          try{
             uof.totalTimeCostMs = l;
             uof = this.a;
             c uoc = uof.clone();
             Objects.requireNonNull(uof);
             if (!PatchProxy.applyVoidOneRefs(uoc, uof, c.class, "2")) {
                uof.g.add(uoc);
             }
             u1.R(this.a.d(), a.a.q(this.a), 3);
             return;
          }catch(java.lang.CloneNotSupportedException e0){
             throw new RuntimeException("need implement Cloneable", e0);
          }
       }
    }
    public e b(long p0){
       this.f = p0;
       return this;
    }
    public e c(d p0){
       this.h = p0;
       return this;
    }
    public e d(String p0){
       this.c = p0;
       return this;
    }
    public e e(String p0){
       this.d = p0;
       return this;
    }
    public e f(String p0){
       this.b = p0;
       return this;
    }
    public e g(int p0){
       this.e = p0;
       return this;
    }
}
