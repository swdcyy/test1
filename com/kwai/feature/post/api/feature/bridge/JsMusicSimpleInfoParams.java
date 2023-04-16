package com.kwai.feature.post.api.feature.bridge.JsMusicSimpleInfoParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class JsMusicSimpleInfoParams implements Serializable	// class@00135b
{
    public String mKswitchKey;
    public static final long serialVersionUID = 0x248b9b3c6a2ee9a8;

    public void JsMusicSimpleInfoParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsMusicSimpleInfoParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsMusicSimpleInfoParams{mKswitchKey=\'"+this.mKswitchKey+'''+'}';
    }
}
