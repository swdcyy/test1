package bk2.c;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.exception.ServerException;
import java.lang.StringBuilder;
import android.util.Log;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.yxcorp.utility.TextUtils;
import zb6.a;
import q2b.h$b;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import d61.h0;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFeatureSwitchPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import wx1.c;
import java.util.HashMap;
import tj3.r;
import java.util.Map;
import com.kuaishou.live.common.core.basic.baseinfo.QLivePushConfig;
import ke1.a;
import java.lang.Integer;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveChatStatEvent;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorLiveStreamQoSPackage;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;

public class c	// class@0003fd
{
    public Map a;

    public void c(){
       super();
    }
    public static void b(String p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, c.class, "12")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x76ab;
       u1.u(1, uElementPack, null);
       return;
    }
    public static void d(){
       if (PatchProxy.applyVoid(null, null, c.class, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x76ac;
       u1.u(1, uElementPack, null);
       return;
    }
    public static void e(){
       if (PatchProxy.applyVoid(null, null, c.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x76aa;
       u1.u0(4, uElementPack, null);
       return;
    }
    public static void onGetAudiencesFailEvent(Throwable p0){
       c uoc = c.class;
       ClientEvent$ResultPackage obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoc, "4")) {
          return;
       }
       String str = PatchProxy.applyOneRefs(p0, obj, uoc, "16");
       if (str != PatchProxyResult.class) {
       }else if(p0 instanceof ServerException){
          ServerException serverExcept = p0;
          str = serverExcept.errorCode+serverExcept.errorMessage;
       }else {
          str = Log.getStackTraceString(p0);
       }
       obj = new ClientEvent$ResultPackage();
       obj.message = TextUtils.k(str);
       obj.domain = 3;
       obj.code = a.b(p0);
       h$b uob = h$b.d(2, 24);
       uob.q(obj);
       u1.r0(uob);
       return;
    }
    public static void onTuhaoOfflineEvent(String p0,boolean p1){
       ClientContent$BatchFeatureSwitchPackage uBatchFeatur;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "hand_live_offline";
       uElementPack.type = 1;
       uElementPack.action = 1046;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = PatchProxy.applyOneRefs(p0, null, uoc, "7");
       if (photoPackage != patchProxyRe) {
       }else {
          photoPackage = new ClientContent$PhotoPackage();
          photoPackage.type = 2;
          photoPackage.identity = h0.a(p0);
          photoPackage.authorId = Long.valueOf(QCurrentUser.me().getId()).longValue();
       }
       uContentPack.photoPackage = photoPackage;
       p0 = "hang";
       if (PatchProxy.isSupport(uoc)) {
          uBatchFeatur = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "8");
          if (uBatchFeatur != patchProxyRe) {
          label_0086 :
             uContentPack.batchFeatureSwitchPackage = uBatchFeatur;
             u1.u(1, uElementPack, uContentPack);
             return;
          }
       }
       ClientContent$FeatureSwitchPackage uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = p0;
       uFeatureSwit.on = p1;
       uBatchFeatur = new ClientContent$BatchFeatureSwitchPackage();
       ClientContent$FeatureSwitchPackage[] uFeatureSwit1 = new ClientContent$FeatureSwitchPackage[]{uFeatureSwit};
       uBatchFeatur.featureSwitchPackage = uFeatureSwit1;
       goto label_0086 ;
    }
    public static void onWatchersLoopQuerySuccessEvent(){
       if (PatchProxy.applyVoid(null, null, c.class, "5")) {
          return;
       }
       u1.r0(h$b.d(1, 24));
       return;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       this.a = hashMap;
       hashMap.put("traffic", Long.valueOf(p0.n()));
       this.a.put("block_cnt", Long.valueOf(p0.g()));
       this.a.put("retry_cnt", Long.valueOf((long)p0.l()));
       this.a.put("dropped_frame_cnt", Long.valueOf(p0.Q()));
       this.a.put("encoded_video_frame_cnt", Long.valueOf(p0.S()));
       this.a.put("best_bps_duration", Long.valueOf(p0.M()));
       this.a.put("better_bps_duration", Long.valueOf(p0.O()));
       this.a.put("normal_bps_duration", Long.valueOf(p0.T()));
       this.a.put("bad_bps_duration", Long.valueOf(p0.K()));
       this.a.put("worst_bps_duration", Long.valueOf(p0.X()));
       this.a.put("empty_bps_duration", Long.valueOf(p0.P));
       this.a.put("best_fps_duration", Long.valueOf(p0.N()));
       this.a.put("better_fps_duration", Long.valueOf(p0.P()));
       this.a.put("normal_fps_duration", Long.valueOf(p0.U()));
       this.a.put("bad_fps_duration", Long.valueOf(p0.L()));
       this.a.put("empty_fps_duration", Long.valueOf(p0.R()));
       return;
    }
    public void f(){
       this.a = null;
    }
    public void g(int p0,int p1,int p2,Throwable p3,boolean p4,QLivePushConfig p5,a p6,c p7){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4),p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
             return;
          }
       }
       ClientStat$LiveChatStatEvent liveChatStat = new ClientStat$LiveChatStatEvent();
       liveChatStat.liveStreamId = p5.getLiveStreamId();
       liveChatStat.role = 1;
       liveChatStat.chatMediaType = p0;
       liveChatStat.endReason = p1;
       if (p4 && (p6 != null && !TextUtils.isEmpty(p6.f))) {
          liveChatStat.liveChatRoomId = Long.valueOf(p6.f).longValue();
          liveChatStat.establishConnectionCost = p6.b;
          liveChatStat.chatDuration = p6.a;
          liveChatStat.useArya = p6.g;
          liveChatStat.fromAudienceApply = p6.h;
          a e = p6.e;
          if (e != null) {
             liveChatStat.cpuRate = e.get("cpu_rate");
             liveChatStat.decFps = e.get("dec_fps");
             liveChatStat.encBr = e.get("enc_br");
             liveChatStat.encFps = e.get("enc_fps");
             liveChatStat.kbpsRecv = e.get("kbps_recv");
             liveChatStat.kbpsSend = e.get("kbps_send");
             liveChatStat.lossRateRecv = e.get("loss_rate_recv");
             liveChatStat.lossRateRecvUdt = e.get("loss_rate_recv_udt");
             liveChatStat.lossRateSend = e.get("loss_rate_send");
             liveChatStat.lossRateSendUdt = e.get("loss_rate_send_udt");
             liveChatStat.rtt = e.get("rtt");
             ClientStat$AnchorLiveStreamQoSPackage uAnchorLiveS = PatchProxy.applyOneRefs(p7, this, uoc, "2");
             if (uAnchorLiveS != PatchProxyResult.class) {
             }else {
                c ta = this.a;
                if (ta != null && p7 != null) {
                   if (!ta.isEmpty()) {
                      uAnchorLiveS = new ClientStat$AnchorLiveStreamQoSPackage();
                      uAnchorLiveS.traffic = p7.n() - this.a.get("traffic").longValue();
                      uAnchorLiveS.blockCnt = p7.g() - this.a.get("block_cnt").longValue();
                      uAnchorLiveS.retryCnt = (long)p7.l() - this.a.get("retry_cnt").longValue();
                      uAnchorLiveS.droppedFrameCnt = p7.Q() - this.a.get("dropped_frame_cnt").longValue();
                      uAnchorLiveS.encodedVideoFrameCnt = p7.S() - this.a.get("encoded_video_frame_cnt").longValue();
                      uAnchorLiveS.bpsAbove500Duration = (p7.M() - this.a.get("best_bps_duration").longValue()) / 1000;
                      uAnchorLiveS.bpsBetween400And500Duration = (p7.O() - this.a.get("better_bps_duration").longValue()) / 1000;
                      uAnchorLiveS.bpsBetween300And400Duration = (p7.T() - this.a.get("normal_bps_duration").longValue()) / 1000;
                      uAnchorLiveS.bpsBetween200And300Duration = (p7.K() - this.a.get("bad_bps_duration").longValue()) / 1000;
                      uAnchorLiveS.bpsBetween0And200Duration = (p7.X() - this.a.get("worst_bps_duration").longValue()) / 1000;
                      uAnchorLiveS.fps0Duration = (p7.R() - this.a.get("empty_fps_duration").longValue()) / 1000;
                      uAnchorLiveS.fpsBetween0And5Duration = (p7.L() - this.a.get("bad_fps_duration").longValue()) / 1000;
                      uAnchorLiveS.fpsBetween5And10Duration = (p7.U() - this.a.get("normal_fps_duration").longValue()) / 1000;
                      uAnchorLiveS.fpsBetween10And15Duration = (p7.P() - this.a.get("better_fps_duration").longValue()) / 1000;
                      uAnchorLiveS.fpsAbove15Duration = (p7.N() - this.a.get("best_fps_duration").longValue()) / 1000;
                      this.a.clear();
                   }else {
                      uAnchorLiveS = null;
                   }
                   this.a = null;
                }else {
                   uAnchorLiveS = null;
                }
             }
             liveChatStat.anchorStreamingQos = uAnchorLiveS;
          }
       }
       if (p2) {
          liveChatStat.errorCode = p2;
          String str = "";
          String str1 = (p3 == null)? str: Log.getStackTraceString(p3);
          liveChatStat.errorMessage = str1;
          if (p1 == 1) {
             Host host = d.a().c("api");
             if (host != null) {
                str = host.toString();
             }
             liveChatStat.errorDomain = str;
          }else {
             liveChatStat.errorDomain = "QAVSDKErrorDomain";
          }
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.liveChatStatEvent = liveChatStat;
       u1.j0(statPackage);
       return;
    }
}
