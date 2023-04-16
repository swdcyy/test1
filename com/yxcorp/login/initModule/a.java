package com.yxcorp.login.initModule.a;
import eda.l$b;
import java.lang.Object;
import java.lang.String;
import o1d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kwai.framework.model.user.QCurrentUser;
import o1d.g;

public final class a implements l$b	// class@001add
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void onSendLoginEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "5")) {
       }else {
          HashMap hashMap = new HashMap(2);
          hashMap.put("接收login通知,uid=", QCurrentUser.me().getId());
          hashMap.put("event类型:", p0);
          String[] stringArray = new String[]{"帐号日志"};
          g.b("发送登录事件", hashMap, stringArray);
       }
       return;
    }
}
