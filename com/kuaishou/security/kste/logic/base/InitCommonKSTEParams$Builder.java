package com.kuaishou.security.kste.logic.base.InitCommonKSTEParams$Builder;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.security.kste.logic.base.SecKSTEDidProxy;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import a.a.a.a.b.e.c;

public abstract class InitCommonKSTEParams$Builder	// class@000f11
{

    public void InitCommonKSTEParams$Builder(){
       super();
    }
    public abstract InitCommonKSTEParams$Builder appKPN(String p0);
    public abstract InitCommonKSTEParams$Builder appVer(String p0);
    public abstract InitCommonKSTEParams$Builder appkey(String p0);
    public abstract InitCommonKSTEParams autoBuild();
    public InitCommonKSTEParams build(){
       Object obj = PatchProxy.apply(null, this, InitCommonKSTEParams$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.autoBuild();
    }
    public abstract InitCommonKSTEParams$Builder context(Context p0);
    public abstract InitCommonKSTEParams$Builder did(String p0);
    public abstract InitCommonKSTEParams$Builder didProxy(SecKSTEDidProxy p0);
    public abstract InitCommonKSTEParams$Builder initCallback(IKSTECallback p0);
    public abstract InitCommonKSTEParams$Builder initMode(KSTEContext$Mode p0);
    public abstract InitCommonKSTEParams$Builder recorder(c p0);
    public abstract InitCommonKSTEParams$Builder userId(String p0);
}
