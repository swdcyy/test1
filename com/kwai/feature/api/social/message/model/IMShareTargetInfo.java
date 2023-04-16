package com.kwai.feature.api.social.message.model.IMShareTargetInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public class IMShareTargetInfo implements Serializable	// class@001172
{
    public int mGroupMemberCount;
    public String mHeadUrl;
    public CDNUrl[] mHeadUrls;
    public String mName;
    public int mRelationType;
    public String mSex;
    public String mTargetId;
    public int mTargetType;
    public List mTopMembers;

    public void IMShareTargetInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMShareTargetInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof IMShareTargetInfo) {
          return super.equals(p0);
       }
       boolean b = (this.mTargetType == p0.mTargetType && TextUtils.n(this.mTargetId, p0.mTargetId))? true: false;
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, IMShareTargetInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mTargetId+"_"+this.mTargetType).hashCode();
    }
}
