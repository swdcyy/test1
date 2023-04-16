package com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger$onLogVes$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger;
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

public final class DftTKOlympicPlayerLogger$onLogVes$1 extends Lambda implements a	// class@000fb9
{
    public final String $bizType;
    public final int $mediaType;
    public final KwaiPlayerResultQos $qos;
    public final String $uri;
    public final long $videoDuration;
    public final DftTKOlympicPlayerLogger this$0;

    public void DftTKOlympicPlayerLogger$onLogVes$1(DftTKOlympicPlayerLogger p0,KwaiPlayerResultQos p1,long p2,String p3,String p4,int p5){
       this.this$0 = p0;
       this.$qos = p1;
       this.$videoDuration = p2;
       this.$bizType = p3;
       this.$uri = p4;
       this.$mediaType = p5;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ClientStat$VideoStatEvent videoStatEve;
       String str2;
       DftTKOlympicPlayerLogger uDftTKOlympi;
       String str3;
       String str4;
       DftTKOlympicPlayerLogger a1;
       JSONObject jSONObject;
       KwaiPlayerResultQos videoStatJso;
       StringBuilder str5;
       String str6;
       JSONObject jSONObject1;
       Iterator iterator;
       ClientEvent$UrlPackage obj2;
       String str7;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, DftTKOlympicPlayerLogger$onLogVes$1.class, "1")) {
          return;
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       DftTKOlympicPlayerLogger$onLogVes$1 this$0 = obj.this$0;
       DftTKOlympicPlayerLogger$onLogVes$1 $qos = obj.$qos;
       DftTKOlympicPlayerLogger$onLogVes$1 $videoDurati = obj.$videoDuration;
       DftTKOlympicPlayerLogger$onLogVes$1 $bizType = obj.$bizType;
       DftTKOlympicPlayerLogger$onLogVes$1 $uri = obj.$uri;
       DftTKOlympicPlayerLogger$onLogVes$1 $mediaType = obj.$mediaType;
       Objects.requireNonNull(this$0);
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(DftTKOlympicPlayerLogger.class)) {
          Object[] objArray1 = new Object[]{$qos,Long.valueOf($videoDurati),$bizType,$uri,Integer.valueOf($mediaType)};
          videoStatEve = PatchProxy.apply(objArray1, this$0, DftTKOlympicPlayerLogger.class, "5");
          if (videoStatEve != PatchProxyResult.class) {
          label_015d :
             statPackage.videoStatEvent = videoStatEve;
             CommonParams uCommonParam = new CommonParams();
             DftTKOlympicPlayerLogger a = obj.this$0.a;
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
       DftTKOlympicPlayerLogger obj1 = PatchProxy.applyOneRefs($uri, this$0, DftTKOlympicPlayerLogger.class, "9");
       boolean b = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): AwesomeCache.isFullyCached(j.d($uri));
    }
}
