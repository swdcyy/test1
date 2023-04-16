package com.kwai.sharelib.model.PosterConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PosterConfig implements Serializable	// class@0016e9
{
    public PosterConfig$PosterLayout mPosterLayout;
    public static final long serialVersionUID = 0xeb0f598219c692d5;

    public void PosterConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PosterConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PosterConfig{mPosterLayout="+this.mPosterLayout+'}';
    }
}
