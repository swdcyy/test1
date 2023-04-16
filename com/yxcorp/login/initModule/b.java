package com.yxcorp.login.initModule.b;
import eda.n$b;
import java.lang.Object;
import java.lang.String;
import o1d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import o1d.g;

public final class b implements n$b	// class@001ade
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void onSendLogoutEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "6")) {
       }else {
          HashMap hashMap = new HashMap(1);
          hashMap.put("event类型:", p0);
          String[] stringArray = new String[]{"帐号日志"};
          g.b("发送登出事件", hashMap, stringArray);
       }
       return;
    }
}
