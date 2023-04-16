package com.kwai.component.stargateegg.stargate.StargatePlayerLogger$onLogVes$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.lang.Boolean;
import mc6.j;
import com.kwai.video.cache.AwesomeCache;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import org.json.JSONObject;
import java.util.Iterator;
import nc6.b;
import com.yxcorp.gifshow.log.model.CommonParams;

public final class StargatePlayerLogger$onLogVes$1 extends Lambda implements a	// class@000b46
{
    public final String $bizType;
    public final long $firstFrameDuration;
    public final int $mediaType;
    public final long $playedDuration;
    public final KwaiPlayerResultQos $qos;
    public final String $uri;
    public final long $videoDuration;
    public final StargatePlayerLogger this$0;

    public void StargatePlayerLogger$onLogVes$1(StargatePlayerLogger p0,KwaiPlayerResultQos p1,long p2,long p3,long p4,String p5,String p6,int p7){
       this.this$0 = p0;
       this.$qos = p1;
       this.$videoDuration = p2;
       this.$playedDuration = p3;
       this.$firstFrameDuration = p4;
       this.$bizType = p5;
       this.$uri = p6;
       this.$mediaType = p7;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ClientStat$VideoStatEvent videoStatEve;
       StargatePlayerLogger stargatePlay;
       KwaiPlayerResultQos videoStatJso;
       KwaiPlayerResultQos kwaiPlayerRe;
       StringBuilder str2;
       StargatePlayerLogger a1;
       String str3;
       JSONObject jSONObject;
       Iterator iterator;
       String str4;
       String str5;
       ClientEvent$UrlPackage params;
       Object[] obj = this;
       if (PatchProxy.applyVoid(null, obj, StargatePlayerLogger$onLogVes$1.class, "1")) {
          return;
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       StargatePlayerLogger$onLogVes$1 this$0 = obj.this$0;
       StargatePlayerLogger$onLogVes$1 $qos = obj.$qos;
       StargatePlayerLogger$onLogVes$1 $videoDurati = obj.$videoDuration;
       StargatePlayerLogger$onLogVes$1 $playedDurat = obj.$playedDuration;
       StargatePlayerLogger$onLogVes$1 $firstFrameD = obj.$firstFrameDuration;
       StargatePlayerLogger$onLogVes$1 $bizType = obj.$bizType;
       StargatePlayerLogger$onLogVes$1 $uri = obj.$uri;
       StargatePlayerLogger$onLogVes$1 $mediaType = obj.$mediaType;
       Objects.requireNonNull(this$0);
       int i = 1;
       boolean i1 = 0;
       if (PatchProxy.isSupport(StargatePlayerLogger.class)) {
          obj = new Object[]{$qos,Long.valueOf($videoDurati),Long.valueOf($playedDurat),Long.valueOf($firstFrameD),$bizType,$uri,Integer.valueOf($mediaType)};
          videoStatEve = PatchProxy.apply(obj, this$0, StargatePlayerLogger.class, "5");
          if (videoStatEve != PatchProxyResult.class) {
          label_0150 :
             statPackage.videoStatEvent = videoStatEve;
             CommonParams uCommonParam = new CommonParams();
             StargatePlayerLogger a = this.this$0.a;
             String str = "cartoon";
             if (a != null) {
                String str1 = a.optString("service_name", str);
                if (str1 != null) {
                   str = str1;
                }
             }
             uCommonParam.mServiceName = str;
             u1.l0(statPackage, false, uCommonParam);
             return;
          }
       }
       videoStatEve = new ClientStat$VideoStatEvent();
       String obj1 = PatchProxy.applyOneRefs($uri, this$0, StargatePlayerLogger.class, "8");
       i1 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): AwesomeCache.isFullyCached(j.d($uri));
    }
}
