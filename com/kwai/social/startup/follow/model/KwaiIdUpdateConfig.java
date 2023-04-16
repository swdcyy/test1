package com.kwai.social.startup.follow.model.KwaiIdUpdateConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KwaiIdUpdateConfig	// class@0018a1
{
    public boolean mEnableUpdateKwaiId;

    public void KwaiIdUpdateConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KwaiIdUpdateConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KwaiIdUpdateConfig{mEnableUpdateKwaiId="+this.mEnableUpdateKwaiId+'}';
    }
}
