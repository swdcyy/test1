package h71.j;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.a0;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lp3.e;
import lp3.c;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import co2.f2;
import com.kuaishou.live.basic.model.StreamType;
import com.yxcorp.utility.TextUtils;
import jp2.a;
import jp2.v;
import so2.d;
import hp2.d;
import hp2.e;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import pp.a;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q87.c;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.bridge.commands.TaskEventParams;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.live.bridge.commands.CommonParams;
import java.util.Map;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Character;
import java.lang.Number;
import com.google.gson.JsonElement;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.bridge.commands.CustomEvent;
import java.lang.CharSequence;
import o63.m$a;

public final class j extends AbstractLiveJsCommand	// class@002638
{
    public f2 e;

    public void j(){
       super();
    }
    public Class a(){
       return a0.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, j.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return this.m(p0);
    }
    public final m m(Object p0){
       String str2;
       a value;
       int i;
       LiveStreamMessages$VoicePartyCommonInfo voicePartyCo;
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, oj, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!p0 instanceof a0) {
          p0 = null;
       }
       if (p0 != null) {
          obj = p0.b();
          if (obj != null) {
             c uoc = this.h().a(oi);
             a.o(uoc, "serviceManager\n      .ge¡­kageProvider::class.java\)");
             obj.liveStreamPackage = uoc.a();
          }
          if (p0.c() == null) {
             p0.i(new ClientContentWrapper$ContentWrapper());
          }
          d uod = this.h().c(d.class);
          if (uod != null && (!uod.r2(AudienceBizRelation.VOICE_PARTY) && (uod.r2(AnchorBizRelation.VOICE_PARTY) && !PatchProxy.applyVoidOneRefs(p0, this, oj, "4")))) {
             j te = this.e;
             if (te != null) {
                if (p0.c() == null) {
                   p0.i(new ClientContentWrapper$ContentWrapper());
                }
                ClientContentWrapper$ContentWrapper uContentWrap = p0.c();
                uContentWrap = (uContentWrap != null)? uContentWrap.liveVoicePartyPackage: null;
                if (uContentWrap == null) {
                   uContentWrap = p0.c();
                   if (uContentWrap != null) {
                      uContentWrap.liveVoicePartyPackage = new ClientContentWrapper$LiveVoicePartyPackage();
                   }
                }
                uContentWrap = p0.c();
                if (uContentWrap != null) {
                   uContentWrap = uContentWrap.liveVoicePartyPackage;
                   if (uContentWrap != null) {
                      uContentWrap.guestNumber = te.f;
                      uContentWrap.voicePartyId = te.y();
                      i = (te.O())? 4: te.c;
                      uContentWrap.role = i;
                      int i1 = 1;
                      uContentWrap.isMicOpen = te.g ^ i1;
                      uContentWrap.enterVoicePartyTimestamp = te.j();
                      uContentWrap.leaveVoicePartyTimestamp = te.p();
                      uContentWrap.videoBeginTimestamp = te.B();
                      uContentWrap.videoEndTimestamp = te.x();
                      if (te.h != StreamType.VOICEPARTY) {
                         i1 = 0;
                      }
                      uContentWrap.entryPage = i1;
                      uContentWrap.ktvId = TextUtils.k(te.o());
                      uContentWrap.ktvIsSingerSinging = te.N();
                      uContentWrap.ktvOrderListAudienceNumber = te.j;
                      uContentWrap.ktvOrderListSongNumber = te.i;
                      value = te.n();
                      if (value != null) {
                         v ov = value.a();
                         if (ov != null) {
                            uContentWrap.enterKtvTimestamp = te.A();
                            uContentWrap.leaveKtvTimestamp = te.w();
                            uContentWrap.ktvTotalSungSingerNumber = ov.d();
                            uContentWrap.ktvTotalSungSongNumber = ov.b();
                            uContentWrap.enterKtvStageTimestamp = ov.c();
                            uContentWrap.leaveKtvStageTimestamp = ov.f();
                            uContentWrap.ktvSelfSungSongNumber = ov.e();
                         }
                      }
                      d uod1 = te.a();
                      if (uod1 != null) {
                         uod1 = uod1.f();
                         if (uod1 != null) {
                            voicePartyCo = uod1.a();
                            if (voicePartyCo != null) {
                               voicePartyCo = voicePartyCo.topic;
                            label_0144 :
                               if (voicePartyCo != null) {
                                  uContentWrap.topicName = voicePartyCo;
                               }
                               LiveStreamMessages$VoicePartyChannelInfo voicePartyCh = te.c();
                               if (voicePartyCh != null) {
                                  uContentWrap.channelId = String.valueOf(voicePartyCh.channelId);
                                  uContentWrap.channelName = voicePartyCh.name;
                               }
                               str2 = PatchProxy.applyOneRefs(te, this, oj, "3");
                               if (str2 != patchProxyRe) {
                               }else {
                                  e uoe = te.e();
                                  str2 = (uoe != null)? uoe.c(): null;
                               }
                               uContentWrap.teamPkRoomId = str2;
                               str2 = PatchProxy.applyOneRefs(te, this, oj, "5");
                               if (str2 != patchProxyRe) {
                               }else {
                                  str2 = te.t();
                               }
                               uContentWrap.theaterId = str2;
                            }
                         }
                      }
                      voicePartyCo = null;
                      goto label_0144 ;
                   }
                }
             }
          }
       label_0184 :
          if (!PatchProxy.applyVoidOneRefs(p0, this, oj, "6")) {
             a uoa = a.C();
             StringBuilder str = "logClickEvent type:"+p0.h()+" action:";
             ClientEvent$ElementPackage uElementPack = p0.e();
             uElementPack = (uElementPack != null)? uElementPack.action2: null;
             Object[] objArray = new Object[false];
             uoa.w("LivejsLogger", str+uElementPack, objArray);
             String str1 = p0.h();
             switch (str1.hashCode()){
                 case 0xaf968b71:
                   if (!str1.equals("custom") || (!PatchProxy.applyVoidOneRefs(p0, this, oj, "10") && (p0.d() != null && (!TextUtils.x(p0.d().getKey()) && !TextUtils.x(p0.d().getValue()))))) {
                      u1.R(p0.d().getKey(), p0.d().getValue(), 3);
                   }
                   break;
                 case 0x35dafd:
                   if (str1.equals("show") && !PatchProxy.applyVoidOneRefs(p0, this, oj, "7")) {
                      str1 = p0.f();
                      str2 = (str1 != null)? str1: "";
                      u1.D0(str2, this.g(oi).getPage(), 9, p0.e(), p0.b(), p0.c());
                   }
                   break;
                 case 0x363585:
                   if (str1.equals("task") && !PatchProxy.applyVoidOneRefs(p0, this, oj, "9")) {
                      TaskEventParams taskEventPar = p0.g();
                      str1 = (taskEventPar != null)? taskEventPar.getAction2(): null;
                      if (str1 != null && p0.g().getStatus() != null) {
                         CommonParams uCommonParam = new CommonParams();
                         CommonParams uCommonParam1 = p0.a();
                         JsonObject mCsLogCorrel = (uCommonParam1 != null)? uCommonParam1.getMCsLogCorrelateInfo(): null;
                         if (mCsLogCorrel instanceof Map) {
                            mCsLogCorrel = new JsonObject();
                            Iterator iterator = p0.a().getMCsLogCorrelateInfo().entrySet().iterator();
                            while (iterator.hasNext()) {
                               Map$Entry uEntry = iterator.next();
                               Object key = uEntry.getKey();
                               value = uEntry.getValue();
                               if (!key instanceof String) {
                                  continue ;
                               }else if(value instanceof String){
                                  mCsLogCorrel.c0(key, value);
                               }else if(value instanceof Boolean){
                                  mCsLogCorrel.H(key, value);
                               }else if(value instanceof Character){
                                  mCsLogCorrel.N(key, value);
                               }else if(value instanceof Number){
                                  mCsLogCorrel.a0(key, value);
                               }
                            }
                            uCommonParam.mCsLogCorrelateInfo = mCsLogCorrel;
                         }else {
                            uCommonParam1 = p0.a();
                            Object mCsLogCorrel1 = (uCommonParam1 != null)? uCommonParam1.getMCsLogCorrelateInfo(): null;
                            if (mCsLogCorrel1 instanceof JsonElement) {
                               uCommonParam.mCsLogCorrelateInfo = p0.a().getMCsLogCorrelateInfo();
                            }
                         }
                         h$b uob = h$b.e(p0.g().getStatus().intValue(), p0.g().getAction2());
                         uob.h(p0.b());
                         uob.k(p0.e());
                         uob.q(p0.resultPackage);
                         uob.g(uCommonParam);
                         uob.l(this.g(oi).c0());
                         u1.p0("", this.g(oi).getPage(), uob);
                      }
                   }
                   break;
                 case 0x5a5c588:
                   if (str1.equals("click") && !PatchProxy.applyVoidOneRefs(p0, this, oj, "8")) {
                      str1 = p0.f();
                      str2 = (str1 != null)? str1: "";
                      u1.M(str2, this.g(oi).getPage(), 1, p0.e(), p0.b(), p0.c());
                   }
                   break;
                 default:
             }
          }
       label_038d :
          return m$a.g(m.g, "success", false, 2, null);
       }else {
          return m.g.c("invalid request params");
       }
    }
    public final void n(f2 p0){
       this.e = p0;
    }
}
