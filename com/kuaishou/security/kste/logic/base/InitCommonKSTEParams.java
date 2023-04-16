package com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import java.lang.Object;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams$Builder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d.a$b;
import android.content.Context;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import a.a.a.a.b.e.c;
import com.kuaishou.security.kste.logic.base.SecKSTEDidProxy;

public abstract class InitCommonKSTEParams	// class@000f12
{

    public void InitCommonKSTEParams(){
       super();
    }
    public static InitCommonKSTEParams$Builder builder(){
       Object obj = PatchProxy.apply(null, null, InitCommonKSTEParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$b();
    }
    public static InitCommonKSTEParams create(Context p0,String p1,IKSTECallback p2,String p3,String p4,String p5,String p6,KSTEContext$Mode p7,c p8,SecKSTEDidProxy p9){
       InitCommonKSTEParams initCommonKS = InitCommonKSTEParams.class;
       if (PatchProxy.isSupport(initCommonKS)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          Object obj = PatchProxy.apply(objArray, null, initCommonKS, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return InitCommonKSTEParams.builder().context(p0).appkey(p1).initCallback(p2).did(p3).userId(p4).appVer(p5).appKPN(p6).initMode(p7).recorder(p8).didProxy(p9).build();
    }
    public abstract String appKPN();
    public abstract String appVer();
    public abstract String appkey();
    public abstract Context context();
    public abstract String did();
    public abstract SecKSTEDidProxy didProxy();
    public abstract IKSTECallback initCallback();
    public abstract KSTEContext$Mode initMode();
    public abstract c recorder();
    public abstract InitCommonKSTEParams$Builder toBuilder();
    public abstract String userId();
}
