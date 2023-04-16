package com.kuaishou.live.external.invoke.gzone.model.JsGameEntranceUpdateParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class JsGameEntranceUpdateParams implements Serializable	// class@001b8e
{
    public String action;
    public static final long serialVersionUID = 0x3946c73037f12d34;

    public void JsGameEntranceUpdateParams(){
       super();
    }
    public boolean isShow(){
       Object obj = PatchProxy.apply(null, this, JsGameEntranceUpdateParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("show").equalsIgnoreCase(this.action);
    }
}
