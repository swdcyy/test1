package com.kuaishou.commercial.tach.component.AdDesignToken;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.a;

public class AdDesignToken extends TKBaseNativeModule	// class@001648
{

    public void AdDesignToken(f p0){
       super(p0);
    }
    public Map getToken(){
       Object obj = PatchProxy.apply(null, this, AdDesignToken.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-2135644857).getToken();
    }
}
