package fy2.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import fy2.c$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import fy2.c$b;
import com.kuaishou.live.deepaec.LiveDeepAecHelper;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rp5.a;
import co2.f2;
import z1.k;
import xp5.i;
import k2b.e0;
import xp5.g;
import java.util.Arrays;
import aq5.a;
import aq5.b;
import m91.b;
import fy2.c$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;
import lp3.e;
import lp3.c;
import com.kuaishou.live.core.voiceparty.a;

public final class c extends PresenterV2	// class@002a12
{
    public e p;
    public b q;
    public i r;
    public g s;
    public f2 t;
    public a u;
    public a v;
    public LiveDeepAecHelper w;
    public final AnchorBizRelation[] x;
    public final AudienceBizRelation[] y;
    public b z;
    public static String sLivePresenterClassName = "LiveDeepAecPresenter";

    public void c(){
       super();
       AnchorBizRelation[] uAnchorBizRe = new AnchorBizRelation[]{AnchorBizRelation.VOICE_PARTY,AnchorBizRelation.VOICE_PARTY_KTV};
       this.x = uAnchorBizRe;
       AudienceBizRelation[] uAudienceBiz = new AudienceBizRelation[]{AudienceBizRelation.VOICE_PARTY_GUEST,AudienceBizRelation.VOICE_PARTY_KTV};
       this.y = uAudienceBiz;
       this.z = new c$c(this);
    }
    public void E8(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       c obj = PatchProxy.apply(objArray, this, uoc, "5");
       String str = "LiveDeepAecHelper";
       String str1 = null;
       String str2 = "SOURCE_LIVE";
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          b = a.t().u(str2).d("Android_LowDdeviceList_DeepAEC", str1);
          b.P(LiveLogTag.LIVE_ARYA.appendTag(str), "low device: "+b);
       }
       if (b) {
          return;
       }else {
          LiveDeepAecHelper obj1 = PatchProxy.apply(objArray, this, uoc, "6");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b1 = a.t().u(str2).d("enableLiveDeepAec", str1);
             b.P(LiveLogTag.LIVE_ARYA.appendTag(str), "live push deep aec: "+b1);
          }
          if (!b1) {
             return;
          }else {
             c$b uob = new c$b(this);
             obj = this.r;
             if (obj == null) {
                a.S("liveLogPackageProvider");
             }
             uoc = this.v;
             if (uoc == null) {
                a.S("currentActivityService");
             }
             BaseFragment uBaseFragmen = uoc.t();
             uoc = this.t;
             str1 = "voicePartyContext";
             if (uoc == null) {
                a.S(str1);
             }
             str2 = uoc.l();
             uoc = this.t;
             if (uoc == null) {
                a.S(str1);
             }
             obj1 = new LiveDeepAecHelper(uob, obj, uBaseFragmen, str2, uoc.f());
             this.w = b1;
             c tq = this.q;
             if (tq == null) {
                a.S("liveBizRelationManager");
             }
             uoc = this.z;
             c ts = this.s;
             if (ts == null) {
                a.S("liveInfoManager");
             }
             ts = (ts.e())? this.x: this.y;
             tq.u5(uoc, Arrays.copyOf(ts, ts.length));
             k1.s(new c$a(this), this, 0);
             return;
          }
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tq = this.q;
       if (tq == null) {
          a.S("liveBizRelationManager");
       }
       c tz = this.z;
       c ts = this.s;
       if (ts == null) {
          a.S("liveInfoManager");
       }
       ts = (ts.e())? this.x: this.y;
       tq.G5(tz, Arrays.copyOf(ts, ts.length));
       tq = this.w;
       if (tq != null) {
          tq.e(false);
       }
       tq = this.w;
       if (tq != null && !PatchProxy.applyVoid(null, tq, LiveDeepAecHelper.class, "9")) {
          LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_DEEP_AEC_MODEL.setLiveResourceDownloadListener(null);
          tq.d();
       }
       this.w = null;
       k1.n(this);
       return;
    }
    public final void P8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       LiveLogTag lIVE_ARYA = LiveLogTag.LIVE_ARYA;
       String str = "LiveDeepAecHelper";
       lIVE_ARYA.appendTag(str);
       b.P(lIVE_ARYA, "updateDeepAecState");
       c ts = this.s;
       if (ts == null) {
          a.S("liveInfoManager");
       }
       b = true;
       String str1 = "liveBizRelationManager";
       if (ts.e()) {
          ts = this.q;
          if (ts == null) {
             a.S(str1);
          }
          if (ts.r2(AnchorBizRelation.VOICE_PARTY)) {
             ts = this.q;
             if (ts == null) {
                a.S(str1);
             }
             if (!ts.r2(AnchorBizRelation.VOICE_PARTY_KTV)) {
                ts = this.w;
                if (ts != null) {
                   ts.e(b);
                }
                b.P(lIVE_ARYA.appendTag(str), "anchor is in video play and not in ktv, can enable deep aec");
                return;
             }
          }
       }else {
          ts = this.q;
          if (ts == null) {
             a.S(str1);
          }
          if (ts.r2(AudienceBizRelation.VOICE_PARTY)) {
             ts = this.q;
             if (ts == null) {
                a.S(str1);
             }
             if (ts.r2(AudienceBizRelation.VOICE_PARTY_GUEST)) {
                ts = this.q;
                if (ts == null) {
                   a.S(str1);
                }
                if (!ts.r2(AudienceBizRelation.VOICE_PARTY_KTV)) {
                   ts = this.w;
                   if (ts != null) {
                      ts.e(b);
                   }
                   b.P(lIVE_ARYA.appendTag(str), "audience is guest not in ktv, can enable deep aec");
                   return;
                }
             }
          }
       }
    label_0098 :
       ts = this.w;
       if (ts != null) {
          ts.e(false);
       }
       b.P(lIVE_ARYA.appendTag(str), "not on the mic, not in video play or in ktv, cannot enable deep aec");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.p = obj;
       obj = this.r8("LIVE_BIZ_RELATION_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BIZ_RELATION_SERVICE\)");
       this.q = obj;
       obj = this.p;
       String str = "serviceManager";
       if (obj == null) {
          a.S(str);
       }
       obj = obj.a(g.class);
       a.o(obj, "serviceManager.getServic¡­eInfoManager::class.java\)");
       this.s = obj;
       obj = this.p;
       if (obj == null) {
          a.S(str);
       }
       obj = obj.a(i.class);
       a.o(obj, "serviceManager.getServic¡­kageProvider::class.java\)");
       this.r = obj;
       Object obj1 = this.q8(f2.class);
       a.o(obj1, "inject\(VoicePartyContext::class.java\)");
       this.t = obj1;
       obj1 = this.q8(a.class);
       a.o(obj1, "inject\(AryaProvider::class.java\)");
       this.u = obj1;
       obj = this.p;
       if (obj == null) {
          a.S(str);
       }
       obj = obj.a(a.class);
       a.o(obj, "serviceManager.getServic¡­ivityService::class.java\)");
       this.v = obj;
       return;
    }
}
