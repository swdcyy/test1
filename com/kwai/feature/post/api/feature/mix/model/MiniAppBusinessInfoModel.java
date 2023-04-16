package com.kwai.feature.post.api.feature.mix.model.MiniAppBusinessInfoModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MiniAppBusinessInfoModel implements Serializable	// class@0013b9
{
    public String mAppId;
    public UpdateShareBusinessLinkModel mBusinessLinkModel;
    public static final long serialVersionUID = 0x5adb8f1ea1e98484;

    public void MiniAppBusinessInfoModel(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MiniAppBusinessInfoModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MiniAppBusinessInfoModel{mAppId=\'"+this.mAppId+'''+", mBusinessLinkModel="+this.mBusinessLinkModel+'}';
    }
}
