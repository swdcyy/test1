package com.kuaishou.android.model.user.ImGroupInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ok.k;

public class ImGroupInfo implements Serializable	// class@000e99
{
    public CDNUrl[] mGroupHeadUrls;
    public String mGroupId;
    public String mGroupName;
    public String mGroupNumber;
    public String mGroupTag;
    public String mGroupTagText;
    public String mIntroduction;
    public int mMemberCount;
    public boolean mShowInProfile;
    public boolean mShowed;
    public static final long serialVersionUID = 0xa714ae9d73ab91e6;

    public void ImGroupInfo(){
       super();
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ImGroupInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mGroupId};
       return k.b(obj);
    }
}
