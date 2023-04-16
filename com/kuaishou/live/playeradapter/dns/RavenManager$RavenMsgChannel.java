package com.kuaishou.live.playeradapter.dns.RavenManager$RavenMsgChannel;
import es4.b;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.playeradapter.dns.RavenManager$RavenMsgChannel$ClientKswitchConfig;
import java.util.ArrayList;
import com.kuaishou.live.playeradapter.dns.RavenManager$RavenMsgChannel$StunDefaultAddrConfig;
import nj3.d;
import com.kuaishou.live.playeradapter.dns.RavenManager$RavenMsgChannel$a;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import com.kuaishou.live.playeradapter.dns.RavenManager;
import java.util.Objects;
import nj3.c;
import nj3.e;
import com.kuaishou.live.playeradapter.dns.RavenManager$RavenMsgChannel$ClientInfo;
import ua6.b;
import ua6.b$a;
import ia0.c;
import o56.a;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;

public class RavenManager$RavenMsgChannel implements b	// class@000d50
{
    public Gson a;

    public void RavenManager$RavenMsgChannel(){
       super();
       this.a = new Gson();
    }
    public String a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RavenManager$RavenMsgChannel ravenMsgChan = RavenManager$RavenMsgChannel.class;
       RavenManager$RavenMsgChannel$ClientKswitchConfig obj = PatchProxy.apply(null, this, ravenMsgChan, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new RavenManager$RavenMsgChannel$ClientKswitchConfig();
       String str = "livep2p_stunServerDefaultAddr";
       RavenManager$RavenMsgChannel$StunDefaultAddrConfig ravenMsgChan1 = PatchProxy.applyOneRefs(str, this, ravenMsgChan, "5");
       if (ravenMsgChan1 != patchProxyRe) {
       }else {
          String str1 = this.d(str);
          ravenMsgChan1 = (str1 == null || str1.equals(""))? new ArrayList(): this.a.h(str1, RavenManager$RavenMsgChannel$StunDefaultAddrConfig.class).stunDefaultAddr;
       }
       obj.stunServiceList = ravenMsgChan1;
       obj.clientConfig = this.d("liveP2pGetClientKswitchConfig");
       obj.pcdnConfig = this.d("livep2p_pcdnConfig");
       return this.a.q(obj);
    }
    public void b(String p0){
       d b1;
       d uod = d.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, RavenManager$RavenMsgChannel.class, str)) {
          return;
       }
       Map map = this.a.i(p0, new RavenManager$RavenMsgChannel$a(this).getType());
       String str1 = "province";
       if (map.containsKey(str1)) {
          d b = RavenManager.b;
          str1 = map.get(str1);
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(str1, b, uod, str)) {
             b1 = b.b;
             if (b1 != null) {
                b1.b = str1;
             }
             b1 = b.a;
             if (b1 != null) {
                b1.b = str1;
             }
          }
       }
       str1 = "tracker";
       if (map.containsKey(str1)) {
          b1 = RavenManager.b;
          map = map.get(str1);
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoidOneRefs(map, b1, uod, "2")) {
             uod = b1.b;
             if (uod != null) {
                uod.c = map;
             }
             uod = b1.a;
             if (uod != null) {
                uod.c = map;
             }
          }
       }
       return;
    }
    public String c(){
       RavenManager$RavenMsgChannel$ClientInfo obj = PatchProxy.apply(null, this, RavenManager$RavenMsgChannel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RavenManager$RavenMsgChannel$ClientInfo();
       b$a c = b.c;
       obj.userId = c.a().e().getUserId();
       obj.appVersion = c.a().e().getAppVersion();
       obj.kpf = a.A;
       obj.kpn = a.x;
       obj.deviceId = c.a().e().getDeviceId();
       return this.a.q(obj);
    }
    public final String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RavenManager$RavenMsgChannel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = a.t().f(p0);
       if (uof == null || uof.c() == null) {
          return "";
       }
       return String.valueOf(uof.c());
    }
}
