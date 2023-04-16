package com.yxcorp.gifshow.push.init.interceptor.register.ChannelReplaceContextInterceptor$condomAppContext$2$a;
import com.oasisfeng.condom.OutboundJudge;
import java.lang.Object;
import com.oasisfeng.condom.OutboundType;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import java.lang.Enum;
import org.json.JSONException;
import k2b.u1;

public final class ChannelReplaceContextInterceptor$condomAppContext$2$a implements OutboundJudge	// class@001665
{
    public static final ChannelReplaceContextInterceptor$condomAppContext$2$a a;

    static {
       ChannelReplaceContextInterceptor$condomAppContext$2$a.a = new ChannelReplaceContextInterceptor$condomAppContext$2$a();
    }
    public void ChannelReplaceContextInterceptor$condomAppContext$2$a(){
       super();
    }
    public final boolean shouldAllow(OutboundType p0,Intent p1,String p2){
       boolean i;
       JSONObject obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChannelReplaceContextInterceptor$condomAppContext$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       obj = new JSONObject();
       try{
          i = 0;
          obj.put("outbound_type", p0.name());
          obj.put("target_package", p2);
          p2 = "intent";
          String str = (p1 == null)? "": p1.toUri(i);
          obj.put(p2, str);
       }catch(org.json.JSONException e8){
          e8.printStackTrace();
       }
       u1.V("ks://condom/judge_outbound", obj.toString(), 9);
       if (p0 != OutboundType.START_SERVICE && (p0 != OutboundType.BIND_SERVICE && p0 != OutboundType.BROADCAST)) {
          i = true;
       }
    label_005b :
       return i;
    }
}
