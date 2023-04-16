package com.kwai.feature.api.social.message.imshare.model.GroupInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class GroupInfo implements Serializable	// class@00114e
{
    public String mAliasName;
    public String mAliasPinYinName;
    public String mFirstLetter;
    public String mGroupId;
    public int mGroupMemberCount;
    public String mGroupName;
    public int mGroupType;
    public String mHeadUrl;
    public String mPinYinName;
    public String mSecondLetter;
    public List mTopMembers;
    public static final long serialVersionUID = 0x9ed62df6b137a99f;

    public void GroupInfo(){
       super();
    }
    public boolean equals(Object p0){
       GroupInfo obj = PatchProxy.applyOneRefs(p0, this, GroupInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof GroupInfo) {
          return super.equals(p0);
       }
       obj = this.mGroupId;
       boolean b = (obj != null && obj.equals(p0.mGroupId))? true: false;
       return b;
    }
    public int hashCode(){
       GroupInfo obj = PatchProxy.apply(null, this, GroupInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mGroupId;
       if (obj != null) {
          return obj.hashCode();
       }
       return super.hashCode();
    }
}
