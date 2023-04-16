package com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KSTemplateGroupInfo implements Serializable	// class@001a9e
{
    public String mGroupId;
    public String mGroupName;
    public List mTemplateDetailInfoList;
    public List mTemplateSimpleInfoList;
    public int mVersion;
    public static final long serialVersionUID = 0xe15f097e6b1ae215;

    public void KSTemplateGroupInfo(){
       super();
       this.mTemplateDetailInfoList = Lists.b();
    }
    public void KSTemplateGroupInfo(KSTemplateGroupInfo p0){
       super();
       this.mTemplateDetailInfoList = Lists.b();
       this.mGroupId = p0.mGroupId;
       this.mGroupName = p0.mGroupName;
       this.mTemplateSimpleInfoList = p0.mTemplateSimpleInfoList;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KSTemplateGroupInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KSTemplateGroupInfo mGroupId="+this.mGroupId+" mGroupName="+this.mGroupName;
    }
}
