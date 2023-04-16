package com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ShareGroupInfo implements Serializable	// class@001160
{
    public String mGroupId;
    public int mGroupMemberCount;
    public String mGroupName;
    public String mGroupNo;
    public int mShareContent;
    public int mShareSource;
    public static final long serialVersionUID = 0x8f04ba78d1eaa226;

    public void ShareGroupInfo(){
       super();
       this.mShareSource = 97;
       this.mShareContent = 96;
    }
    public void ShareGroupInfo(String p0,String p1,String p2,int p3){
       super();
       this.mShareSource = 97;
       this.mShareContent = 96;
       this.mGroupId = p0;
       this.mGroupNo = p1;
       this.mGroupName = p2;
       this.mGroupMemberCount = p3;
    }
    public static ShareGroupInfo buildShareGroupInfo(KwaiGroupInfo p0){
       ShareGroupInfo obj = PatchProxy.applyOneRefs(p0, null, ShareGroupInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ShareGroupInfo();
       if (p0 != null) {
          obj.mGroupId = p0.getGroupId();
          obj.mGroupNo = p0.getGroupNo();
          obj.mGroupName = p0.getGroupName();
          obj.mGroupMemberCount = p0.getMemberCount();
       }
       return obj;
    }
}
