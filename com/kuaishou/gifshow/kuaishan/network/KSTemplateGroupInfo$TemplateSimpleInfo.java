package com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupInfo$TemplateSimpleInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KSTemplateGroupInfo$TemplateSimpleInfo implements Serializable	// class@001a9d
{
    public String mCheckSum;
    public String mTemplateId;
    public static final long serialVersionUID = 0x9573632ea23cb129;

    public void KSTemplateGroupInfo$TemplateSimpleInfo(){
       super();
    }
    public String getUniqueIdentifier(){
       Object obj = PatchProxy.apply(null, this, KSTemplateGroupInfo$TemplateSimpleInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTemplateId+"+"+this.mCheckSum;
    }
}
