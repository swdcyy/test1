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
          hashMap.put("event����:", p0);
          String[] stringArray = new String[]{"�ʺ���־"};
          g.b("���͵ǳ��¼�", hashMap, stringArray);
       }
       return;
    }
}
