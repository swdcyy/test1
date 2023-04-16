package com.kuaishou.android.model.ads.NeoParamsVideoInfo$ExitInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class NeoParamsVideoInfo$ExitInfo implements Serializable	// class@00087f
{
    public String mToastDesc;
    public String mToastImgUrl;
    public static final long serialVersionUID = 0xe183c48cba645780;

    public void NeoParamsVideoInfo$ExitInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoParamsVideoInfo$ExitInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExitInfo{mToastDesc=\'"+this.mToastDesc+'''+", mToastImgUrl=\'"+this.mToastImgUrl+'''+'}';
    }
}
