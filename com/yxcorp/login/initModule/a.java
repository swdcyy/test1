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
          hashMap.put("����login֪ͨ,uid=", QCurrentUser.me().getId());
          hashMap.put("event����:", p0);
          String[] stringArray = new String[]{"�ʺ���־"};
          g.b("���͵�¼�¼�", hashMap, stringArray);
       }
       return;
    }
}
