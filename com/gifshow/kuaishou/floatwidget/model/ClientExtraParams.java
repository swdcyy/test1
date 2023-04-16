package com.gifshow.kuaishou.floatwidget.model.ClientExtraParams;
import java.io.Serializable;
import com.gifshow.kuaishou.floatwidget.model.ClientExtraParams$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule;
import com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class ClientExtraParams implements Serializable	// class@0015cf
{
    public long lastColdLaunchTime;
    public long lastExitAppTime;
    public long lastOnBackgroundTime;
    public long lastOnForegroundTime;
    public long lastOpenAppTime;
    public static final ClientExtraParams$a Companion;
    public static final long serialVersionUID;

    static {
       ClientExtraParams.Companion = new ClientExtraParams$a(null);
       ClientExtraParams.serialVersionUID = 0xfffff5de1933b286;
    }
    public void ClientExtraParams(){
       super();
       PrtpInitModule$a y = PrtpInitModule.y;
       this.lastColdLaunchTime = y.a();
       this.lastOpenAppTime = y.f();
       this.lastExitAppTime = y.c();
       this.lastOnForegroundTime = y.e();
       this.lastOnBackgroundTime = y.d();
    }
    public static final long getSerialVersionUID(){
       return ClientExtraParams.serialVersionUID;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, ClientExtraParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
          a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       }catch(java.lang.Exception e0){
          obj = super.toString();
       }
       return obj;
    }
}
