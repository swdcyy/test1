package com.kuaishou.live.core.show.fansgroupv2.share.fragment.c;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.c$a;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c	// class@000b5e
{
    public final Map a;

    public void c(){
       super();
       HashMap hashMap = new HashMap();
       this.a = hashMap;
       hashMap.put("WECHAT_CHANNEL", new c$a("wechat"));
       hashMap.put("WECHAT_GROUP_CHANNEL", new c$a("wechat"));
       hashMap.put("WECHAT_MOMENTS_CHANNEL", new c$a("wechatMoments"));
    }
    public c$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get(p0);
    }
}
