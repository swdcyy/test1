package com.kuaishou.live.external.invoke.gzone.model.JsShowGzoneEntranceParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class JsShowGzoneEntranceParams implements Serializable	// class@001b95
{
    public String entrance;
    public static final long serialVersionUID = 0xe6ef10d74523e530;

    public void JsShowGzoneEntranceParams(){
       super();
    }
    public boolean isGuess(){
       Object obj = PatchProxy.apply(null, this, JsShowGzoneEntranceParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("guess").equalsIgnoreCase(this.entrance);
    }
    public boolean isShare(){
       Object obj = PatchProxy.apply(null, this, JsShowGzoneEntranceParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("share").equalsIgnoreCase(this.entrance);
    }
}
