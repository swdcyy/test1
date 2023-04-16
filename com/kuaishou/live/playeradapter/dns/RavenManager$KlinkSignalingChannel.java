package com.kuaishou.live.playeradapter.dns.RavenManager$KlinkSignalingChannel;
import com.kuaishou.raven.c;
import com.kwai.chat.sdk.signal.f;
import java.lang.Object;
import com.google.gson.Gson;
import com.kuaishou.live.playeradapter.dns.RavenManager$KlinkSignalingChannel$a;
import java.lang.String;
import j85.e;
import com.kuaishou.raven.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.playeradapter.dns.RavenManager$KlinkSignalingChannel$Descriptor;
import com.kwai.chat.sdk.signal.ClientUserInfo;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import java.lang.Long;
import com.kuaishou.live.playeradapter.dns.RavenManager$KlinkSignalingChannel$b;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import java.lang.Integer;
import com.kwai.chat.kwailink.data.PassThroughRequestMsg;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.chat.kwailink.data.PassThroughInstance;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.data.PassThroughRequest;
import com.kwai.chat.kwailink.client.c0;
import java.util.Objects;
import java.lang.Boolean;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.base.b;
import o75.m;
import o75.g0;
import java.lang.Runnable;

public class RavenManager$KlinkSignalingChannel implements c	// class@000d4b
{
    public f a;
    public Gson b;
    public c$a c;

    public void RavenManager$KlinkSignalingChannel(f p0){
       super();
       this.b = new Gson();
       this.c = null;
       this.a = p0;
       String[] stringArray = new String[]{"Push.LiveP2P.Signal"};
       p0.o(new RavenManager$KlinkSignalingChannel$a(this), stringArray);
    }
    public void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RavenManager$KlinkSignalingChannel.class, "3")) {
          return;
       }
       this.c = p0;
       return;
    }
    public String b(){
       RavenManager$KlinkSignalingChannel$Descriptor obj = PatchProxy.apply(null, this, RavenManager$KlinkSignalingChannel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RavenManager$KlinkSignalingChannel$Descriptor();
       obj.userId = this.a.c().e();
       obj.deviceId = this.a.b().g();
       obj.instanceId = Long.valueOf(this.a.f());
       return this.b.q(obj);
    }
    public void c(String p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RavenManager$KlinkSignalingChannel.class, "2")) {
          return;
       }
       Map map = this.b.i(p0, new RavenManager$KlinkSignalingChannel$b(this).getType());
       Object[] objArray = new Object[]{p0,Integer.valueOf(p1.length)};
       String.format("KLink sending to %s, %d", objArray);
       PassThroughRequestMsg[] passThroughR = new PassThroughRequestMsg[map.size()];
       Iterator iterator = map.values().iterator();
       String str = "";
       int i = 0;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          RavenManager$KlinkSignalingChannel$Descriptor klinkSignali = this.b.h(str1, RavenManager$KlinkSignalingChannel$Descriptor.class);
          PassThroughInstance passThroughI = new PassThroughInstance();
          passThroughI.d(Long.parseLong(klinkSignali.userId));
          passThroughI.a(klinkSignali.deviceId);
          passThroughI.c(klinkSignali.instanceId.longValue());
          byte[] uobyteArray = new byte[0];
          passThroughI.b(uobyteArray);
          PassThroughRequestMsg passThroughR1 = new PassThroughRequestMsg();
          passThroughR1.c = "Push.LiveP2P.Signal";
          passThroughR1.b = passThroughI;
          passThroughR1.d = p1;
          int i1 = i + 1;
          passThroughR[i] = passThroughR1;
          str = str+str1+"---";
          i = i1;
       }
       Object[] objArray1 = new Object[]{Integer.valueOf(map.size()),str};
       String.format("KLink size %d, values info %s", objArray1);
       PassThroughRequest passThroughR2 = new PassThroughRequest();
       passThroughR2.b = passThroughR;
       c0 uoc0 = this.a.g();
       int i2 = 0x2710;
       object oobject = null;
       Objects.requireNonNull(uoc0);
       if (PatchProxy.isSupport(c0.class)) {
          objArray = new Object[]{passThroughR2,Integer.valueOf(i2),Integer.valueOf(0),oobject,Boolean.FALSE};
          if (PatchProxy.applyVoid(objArray, uoc0, c0.class, "71")) {
          label_010c :
             return;
          }
       }
       m om = new m(uoc0, passThroughR2, 0x2710, 0, null, false);
       b.c().execute(Boolean.FALSE);
       goto label_010c ;
    }
}
