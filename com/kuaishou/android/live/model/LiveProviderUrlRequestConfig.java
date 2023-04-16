package com.kuaishou.android.live.model.LiveProviderUrlRequestConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveProviderUrlRequestConfig implements Serializable	// class@0007f7
{
    public long mDelaySecond;
    public static final long serialVersionUID = 0x58cd0abd6f2412c2;

    public void LiveProviderUrlRequestConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveProviderUrlRequestConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveProviderUrlRequestConfig{mDelaySecond="+this.mDelaySecond+'}';
    }
}
