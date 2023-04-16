package com.kuaishou.live.external.invoke.gzone.model.JsGameSetRequestedOrientationParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class JsGameSetRequestedOrientationParams implements Serializable	// class@001b93
{
    public String orientation;
    public static final long serialVersionUID = 0xd44f4c222588fa57;

    public void JsGameSetRequestedOrientationParams(){
       super();
    }
    public boolean isVertical(){
       Object obj = PatchProxy.apply(null, this, JsGameSetRequestedOrientationParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("vertical").equalsIgnoreCase(this.orientation);
    }
}
